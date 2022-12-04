package formitas.modelo;

public class GeneradorPython {
    String comandos,cabecera,funciones;


    public GeneradorPython() {
        this.comandos = "\n";
        this.cabecera="from tkinter import *\n" +
                "class Figuras (Tk):\n" +
                "    def __init__(self,*args,**kwargs):\n" +
                "        super().__init__(*args, **kwargs)\n" +
                "        self.posYcanvas=0\n" +
                "        self.posXcanvas=0\n" ;
        this.funciones="    def create_canvas(self,x,y):\n" +
                "        w=self.tamCanvas\n" +
                "        h=self.tamCanvas\n" +
                "        self.canvas=Canvas(self,width=w,height=h,bg=\"orange\")\n" +
                "        self.canvas.place(x=x,y=y)\n" +
                "    def circulo(self,x,y,color=\"cyan\",s=0):\n" +
                "        self.create_canvas(x,y)\n" +
                "        radio=self.tamCanvas*0.95\n" +
                "        if(s!=0):\n" +
                "           radio=s\n" +
                "        self.canvas.create_oval(self.tamCanvas*0.05,self.tamCanvas*0.05,radio,radio,width=4,fill=color)\n" +
                "    def cuadrado(self,x,y,color=\"cyan\",s=0):\n" +
                "        self.create_canvas(x,y)\n" +
                "        esquina=self.tamCanvas*0.05\n" +
                "        lado=self.tamCanvas*0.95\n" +
                "        if(s!=0):\n" +
                "            lado=s\n" +
                "        self.canvas.create_rectangle(esquina,esquina,lado,lado,width=4,fill=color)\n" +
                "    def triangulo(self,x,y,color=\"cyan\",s=0):\n" +
                "        m=self.tamCanvas\n" +
                "        if (s != 0):\n" +
                "            m=s\n" +
                "        x1=m*0.5\n" +
                "        y1=m*0.05\n" +
                "\n" +
                "        x2=m*0.05\n" +
                "        y2=m*0.95\n" +
                "\n" +
                "        x3=m*0.95\n" +
                "        y3=m*0.95\n" +
                "\n" +
                "        self.create_canvas(x,y)\n" +
                "        self.canvas.create_polygon(x1,y1,x2,y2,x3,y3,width=4,fill=color,outline=\"black\")\n" +
                "    def dibujar(self,figura,tamanio=0,color=\"cyan\"):\n" +
                "        x=self.posXcanvas\n" +
                "        y=self.posYcanvas\n" +
                "        if('cuadrado'==figura):\n" +
                "            self.cuadrado(x,y,s=tamanio,color=color)\n" +
                "        elif(figura=='triangulo'):\n" +
                "            self.triangulo(x,y,s=tamanio,color=color)\n" +
                "        else:\n" +
                "            self.circulo(x,y,s=tamanio,color=color)\n" +
                "        self.posXcanvas=self.posXcanvas+self.tamCanvas\n" +
                "\n" +
                "    def saltoLinea(self):\n" +
                "        self.posYcanvas=self.posYcanvas+self.tamCanvas\n" +
                "        self.posXcanvas = 0\n" +
                "\n" +
                "if __name__==\"__main__\":\n" +
                "    app=Figuras()\n" +
                "    app.mainloop()";
    }

    public void setComandos(String comandos) {
        this.comandos += "        "+comandos+"\n";
    }

    @Override
    public String toString() {
        String resultado=cabecera+comandos+funciones;
        return resultado;
    }

}
