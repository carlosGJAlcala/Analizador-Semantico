.class public Ej6
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 300
   .limit locals 300

    ldc 7
    ldc 13
    if_icmpgt etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "7 es menor que 13"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ldc 13
    ldc 20
    if_icmpgt etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "13 es menor que 20"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ldc 20
    ldc 30
    if_icmpgt etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "20 es menor que 30"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    goto etiqueta2

    etiqueta1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "No se cumple"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    etiqueta2:
return

.end method