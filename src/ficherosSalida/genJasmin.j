.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 5

ldc 2
ineg
iadd
istore 1
ldc 3

ldc 2
ineg
iadd
ldc 1
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;

ldc 1

invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
return

.end method