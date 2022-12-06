.class public Sumar
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
ldc 0
istore 2
ldc 5

ldc 2
ineg
iadd

ldc i

ldc 5

ldc 2
ineg
iadd
return

.end method