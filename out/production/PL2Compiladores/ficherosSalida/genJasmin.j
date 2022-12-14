.class public ClaseGenerada
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 10
istore 0
ldc "hola Mundo"
astore 1
ldc 10
istore 2
ldc 10
istore 0
iload 2
iload 0
if_icmpne noEntraIf1
iload 0

ldc 2
iadd
istore 0
noEntraIf1:
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 0

invokevirtual java/io/PrintStream/println(I)V
ldc 0
istore 3
ldc 3
istore 4
iload 3
iload 4
if_icmpge noEntraFor2
bucleFor2:
iload 0

ldc 1
ineg
iadd
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 0

invokevirtual java/io/PrintStream/println(I)V
    iload 3
    ldc 1
    iadd
    istore 3
    iload 3
    iload 4
if_icmplt bucleFor2
noEntraFor2:
getstatic java/lang/System/out Ljava/io/PrintStream;

ldc "adios mundo"

invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 0
istore 0
ldc 5
istore 5
iload 0
iload 5
if_icmplt noEntraWhile1
bucleWhile1:
ldc 6

ldc 2
ineg
iadd
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 0

invokevirtual java/io/PrintStream/println(I)V
iload 0
istore 0
ldc 5
istore 6
iload 0
iload 6
if_icmpge bucleWhile1
noEntraWhile1:
return

.end method