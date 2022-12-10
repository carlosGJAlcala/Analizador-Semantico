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
ldc 0
istore 2
ldc 3
istore 3
iload 2
iload 3
if_icmpge noEntra3
bucleWhile3:
ldc 5

ldc 2
ineg
iadd
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 1

invokevirtual java/io/PrintStream/print(I)V
    iload 2
    ldc 2 
    iadd
    istore 3
    iload 3
    iload 2
if_icmplt bucleWhile3
noEntra3:
return

.end method