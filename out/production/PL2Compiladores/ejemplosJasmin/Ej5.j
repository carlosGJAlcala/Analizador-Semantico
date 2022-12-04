.class public Ej5
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100
   

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Hola Mundo "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 123
invokevirtual java/io/PrintStream/println(I)V


return

.end method