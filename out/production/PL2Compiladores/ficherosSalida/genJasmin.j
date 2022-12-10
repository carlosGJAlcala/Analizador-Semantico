.class public ClaseGenerada
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 20
istore 1
ldc 2
istore 2
ldc 1
iload 2
iload 1
if_icmpne noEntra1
ldc 5

ldc 2
ineg
iadd
istore 1
noEntra1:
ldc 0
istore 3
ldc 10
istore 4
iload 3
iload 4
if_icmpge noEntra4
bucleWhile4:
ldc 7

ldc 2
ineg
iadd
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 1

invokevirtual java/io/PrintStream/print(I)V
    iload 3
    ldc 1
    iadd
    istore 3
    iload 3
    iload 4
if_icmplt bucleWhile4
noEntra4:
ldc 2
istore 5
ldc 1
iload 5
iload 1
if_icmpne noEntra2
noEntra2:
ldc 5

ldc 2
ineg
iadd
istore 1
return

.end method