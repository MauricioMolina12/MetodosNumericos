section .data
    format_input db "%lf", 0
    format_output db "La raíz real es: %lf", 10, 0
    format_not_found db "Not found", 10, 0

section .bss
    grado resb 4
    coeficiente resq 1
    xo resq 1
    tol resq 1
    NumMax resb 4
    F resq 10
    D resq 10
    i resb 4
    sw resb 4
    x1 resq 1
    fxo resq 1
    fpxo resq 1
    e resq 1

section .text
    global main
    extern scanf, printf
    main:
        push format_input
        push grado
        call scanf
        add esp, 8


        mov ecx, dword [grado]
        mov edx, 0


    read_coef:
        push ecx ; 
        push edx ; 
        push format_input
        push coeficiente
        call scanf
        add esp, 8
        pop edx  ; 
        pop ecx  ; 

        mov eax, edx
        mov ebx, dword [coeficiente]
        mov qword [F + 8*eax], rbx ; 
        inc edx  ; 
        dec ecx  ; 
        jnz read_coef ; 

        ; Leer xo
        push format_input
        push xo
        call scanf
        add esp, 8

        ;
        push format_input
        push tol
        call scanf
        add esp, 8

        ; 
        mov ecx, dword [grado]
        mov edx, 0

    calculate_D:
        mov eax, edx
        imul qword [F + 8*eax], edx
        mov ebx, eax
        mov qword [D + 8*edx], rbx ;

        inc edx  ; 
        dec ecx  ; 
        jnz calculate_D ; 

        ; 
        mov dword [i], 0
        mov dword [sw], 0

        ; 
        push format_input
        push NumMax
        call scanf
        add esp, 8

    main_loop:
        ; 
        fld qword [xo]
        fld qword [fxo]
        fld1
        fild dword [grado]

        calculate_fxo:
            fild dword [i]
            fild qword [F + 8*eax]
            fmul
            fadd
            dec eax
            jnz calculate_fxo

        fsub
        fstp qword [fxo]

        ; Calcular fpxo
        fld qword [xo]
        fld qword [fpxo]
        fld1
        fild dword [grado - 1]

        calculate_fpxo:
            fild dword [i]
            fild qword [D + 8*eax]
            fmul
            fadd
            dec eax
            jnz calculate_fpxo

        fsub
        fstp qword [fpxo]

        ; 
        fld qword [xo]
        fld qword [fxo]
        fld qword [fpxo]
        fdiv
        fsub
        fstp qword [x1]

        ;
        fld qword [x1]
        fld qword [xo]
        fsub
        fabs
        fstp qword [e]

        ; 
        fld qword [tol]
        fcomip st, st(1)
        fstsw ax
        sahf

        ; 
        jae root_found

        ; 
        cmp dword [i], dword [NumMax]
        jge max_iterations

        ; 
        fld qword [x1]
        fstp qword [xo]
        inc dword [i]
        jmp main_loop

    root_found:
        ; 
        push format_output
        fld qword [x1]
        call printf
        add esp, 12
        jmp exit_program

    max_iterations:
        ; 
        push format_not_found
        call printf
        add esp, 4
        jmp exit_program

    exit_program:
        ;
        ret