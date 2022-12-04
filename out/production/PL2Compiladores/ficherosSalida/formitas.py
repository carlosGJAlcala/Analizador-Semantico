from tkinter import *
class Figuras (Tk):
    def __init__(self,*args,**kwargs):
        super().__init__(*args, **kwargs)
        self.posYcanvas=0
        self.posXcanvas=0

        ancho=180
        altura=180
        self.tamCanvas=32
        self.geometry(str(ancho) + "x" + str(altura))
        self.dibujar("cuadrado",color="red",tamanio=40)
        self.dibujar("cuadrado")
        self.dibujar("cuadrado")
        self.saltoLinea()
        self.dibujar("triangulo")
        self.dibujar("cuadrado")
        self.dibujar("cuadrado")
        self.saltoLinea()
        self.dibujar("triangulo")
        self.dibujar("cuadrado")
        self.dibujar("cuadrado")
        self.saltoLinea()
        self.dibujar("triangulo")
    def create_canvas(self,x,y):
        w=self.tamCanvas
        h=self.tamCanvas
        self.canvas=Canvas(self,width=w,height=h,bg="orange")
        self.canvas.place(x=x,y=y)
    def circulo(self,x,y,color="cyan",s=0):
        self.create_canvas(x,y)
        radio=self.tamCanvas*0.95
        if(s!=0):
           radio=s
        self.canvas.create_oval(self.tamCanvas*0.05,self.tamCanvas*0.05,radio,radio,width=4,fill=color)
    def cuadrado(self,x,y,color="cyan",s=0):
        self.create_canvas(x,y)
        esquina=self.tamCanvas*0.05
        lado=self.tamCanvas*0.95
        if(s!=0):
            lado=s
        self.canvas.create_rectangle(esquina,esquina,lado,lado,width=4,fill=color)
    def triangulo(self,x,y,color="cyan",s=0):
        m=self.tamCanvas
        if (s != 0):
            m=s
        x1=m*0.5
        y1=m*0.05

        x2=m*0.05
        y2=m*0.95

        x3=m*0.95
        y3=m*0.95

        self.create_canvas(x,y)
        self.canvas.create_polygon(x1,y1,x2,y2,x3,y3,width=4,fill=color,outline="black")
    def dibujar(self,figura,tamanio=0,color="cyan"):
        x=self.posXcanvas
        y=self.posYcanvas
        if('cuadrado'==figura):
            self.cuadrado(x,y,s=tamanio,color=color)
        elif(figura=='triangulo'):
            self.triangulo(x,y,s=tamanio,color=color)
        else:
            self.circulo(x,y,s=tamanio,color=color)
        self.posXcanvas=self.posXcanvas+self.tamCanvas

    def saltoLinea(self):
        self.posYcanvas=self.posYcanvas+self.tamCanvas
        self.posXcanvas = 0

if __name__=="__main__":
    app=Figuras()
    app.mainloop()