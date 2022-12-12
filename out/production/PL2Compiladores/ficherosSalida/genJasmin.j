.class public ClaseGenerada
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 2
istore 1
ldc 2
istore 2
ldc 2
istore 1
iload 2
iload 1
if_icmpne noEntraIf1
ldc 5

ldc 2
ineg
iadd
istore 1
noEntraIf1:
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 1

invokevirtual java/io/PrintStream/print(I)V
ldc 0
istore 3
ldc 10
istore 4
iload 3
iload 4
if_icmpge noEntraFor2
bucleFor2:
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
if_icmplt bucleFor2
noEntraFor2:
iload 1
istore 1
ldc 5
istore 5
iload 1
iload 5
if_icmplt noEntraWhile1
bucleWhile1:
ldc 5

ldc 2
ineg
iadd
istore 1
iload 1
istore 1
ldc 5
istore 6
iload 1
iload 6
noEntraWhile1:
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 1

invokevirtual java/io/PrintStream/print(I)V
return

.end method