.class public ClaseGenerada
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 20
istore 1
ldc 5

ldc 2
ineg
iadd
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 1

invokevirtual java/io/PrintStream/print(I)V
return

.end method