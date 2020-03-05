import java.awt.*;
import java.awt.geom.*;
/**
 * Write a description of class Semaforo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Semaforo
{
   private Circle luzRoja;
   private Circle luzAmarilla;
   private Circle luzVerde;
   private Square cuadro1;
   private Square cuadro2;
   private Square cuadro3;
   private int xPosition;
   private int yPosition;
   private boolean isVisible;
   
   public Semaforo(){
       luzRoja = new Circle();
       luzAmarilla = new Circle();
       luzVerde = new Circle();
       cuadro1 = new Square();
       cuadro2 = new Square();
       cuadro3 = new Square();
    }
   
   public void crearSemaforo(){
       cuadro1.changeSize(60);
       cuadro1.changeColor("black");
       cuadro1.changePosition(50, 50);
       cuadro1.makeVisible();
       cuadro2.changeSize(60);
       cuadro2.changeColor("black");
       cuadro2.changePosition(50, 115);
       cuadro2.makeVisible();
       cuadro3.changeSize(60);
       cuadro3.changeColor("black");
       cuadro3.changePosition(50, -15);
       cuadro3.makeVisible();
       luzRoja.changeSize(40);
       luzRoja.changeColor("red");
       luzRoja.changePosition(140, 25);
       luzRoja.makeVisible();
       luzAmarilla.changeSize(40);
       luzAmarilla.changeColor("yellow");
       luzAmarilla.changePosition(140,90);
       luzAmarilla.makeVisible();
       luzVerde.changeSize(40);
       luzVerde.changeColor("green");
       luzVerde.changePosition(140, 155);
       luzVerde.makeVisible();
    } 
    
   public void delay(int milisegundos){
       Canvas canvas = Canvas.getCanvas();
       canvas.wait(milisegundos);
    }
    
   public void moverxy(int x, int y){
      cuadro1.changePosition(x, y);
      cuadro2.changePosition(x, y);
      cuadro3.changePosition(x, y);
      luzRoja.changePosition(x, y);
      luzAmarilla.changePosition(x, y);
      luzVerde.changePosition(x, y);
    }
    
    public void desplazamientoxy(int x, int y){
      cuadro1.desplazamientoxy(x, y);
      cuadro2.desplazamientoxy(x, y+65);
      cuadro3.desplazamientoxy(x, y+130);
      luzRoja.desplazamientoxy(x+10, y+10);
      luzAmarilla.desplazamientoxy(x+10, y+75);
      luzVerde.desplazamientoxy(x+10, y+140);
    }
    
   public void parpadearLuzRoja(int veces){
      luzRoja.parpadearLuzRoja(veces);
      luzRoja.makeVisible();
    }
    
   public void parpadearLuzAmarilla(int veces){
      luzAmarilla.parpadearLuzAmarilla(veces);
      luzAmarilla.makeVisible();
    }
    
   public void parpadearLuzVerde(int veces){
      luzVerde.parpadearLuzVerde(veces);
      luzVerde.makeVisible();
    }
    
   public void metodo(int x, int y, int veces){
      cuadro1.desplazamientoxy(x, y);
      cuadro2.desplazamientoxy(x, y+65);
      cuadro3.desplazamientoxy(x, y+130);
      luzRoja.desplazamientoxy(x+10, y+10);
      luzAmarilla.desplazamientoxy(x+10, y+75);
      luzVerde.desplazamientoxy(x+10, y+140);
      
       for(int i=0; i<veces; i++){
           luzRoja.parpadearLuzRoja(1);
           luzRoja.makeVisible();
        }
        
       for(int i=0; i<veces; i++){
           luzAmarilla.parpadearLuzAmarilla(1);
           luzAmarilla.makeVisible();
        }
        
       for(int i=0; i<veces; i++){
           luzVerde.parpadearLuzVerde(1);
           luzVerde.makeVisible();
        }
    }
}
