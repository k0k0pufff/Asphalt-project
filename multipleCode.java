import org.code.neighborhood.*;

public class multipleCode extends PainterPlus {

  //makes the painter paint a certain amount of spots

     public void paint2(String color) {
      paint(color);
      move();
      paint(color);
    }

    public void paint3(String color) {
      paint2(color);
      move();
      paint(color);
    }

    public void paint4(String color) {
      paint3(color);
      move();
      paint(color);
    }

    public void paint5(String color) {
      paint4(color);
      move();
      paint(color);
    }

    public void paint6(String color) {
      paint5(color);
      move();
      paint(color);
    }
 
    public void paint7(String color) {
      paint6(color);
      move();
      paint(color);
    }

    public void paint8(String color) {
      paint7(color);
      move();
      paint(color);
    }
 
    public void paint9(String color) {
      paint8(color);
      move();
      paint(color);
    }

    public void paint10(String color) {
      paint9(color);
      move();
      paint(color);
    }

  //makes the painter move a certain amount of times

    public void move2() {
    move();
    move();
  }
  public void move3 (){
    move2();
    move();
  }
  public void move4 (){
    move3();
    move();
  }
  public void move5 (){
    move4();
    move();
  }
  public void move6 (){
    move5();
    move();
  }
  public void move7(){
    move6();
    move();
  }
  public void move8(){
    move7();
    move();
  }
  public void move9(){
    move8();
    move();
  }
  public void move10(){
    move9();
    move();
  }

  public void move11(){
    move10();
    move();
  }
  public void move12(){
    move11();
    move();
  }
  public void move13(){
    move12();
    move();
  }
  public void move14(){
    move13();
    move();
  }
  public void move15(){
    move14();
    move();
  }


}
