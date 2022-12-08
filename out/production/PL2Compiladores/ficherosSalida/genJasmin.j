.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 20
istore 0
ldc 5

ldc 2
ineg
iadd
ldc 3
istore 0

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 3
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
return

.end method