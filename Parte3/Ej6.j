.class public Ej6
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 300
   .limit locals 300

    ldc 6
    ldc 9
    if_icmpgt etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "6 es menor que 9"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ldc 9
    ldc 13
    if_icmpgt etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "9 es menor que 13"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ldc 13
    ldc 16
    if_icmpgt etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "13 es menor que 16"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    goto etiqueta2

    etiqueta1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "No se cumple"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    etiqueta2:
return

.end method