.class public Ej4
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 3
    ldc 5
    if_icmpgt etiqueta1
    ldc "false"
    goto etiqueta2

    etiqueta1:
    ldc "true"
    etiqueta2:

invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return

.end method