.class public Ej3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 4
ldc 2
imul
   invokevirtual java/io/PrintStream/println(I)V
return

.end method