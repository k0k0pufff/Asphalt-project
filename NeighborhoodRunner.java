import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    MuralPainter background = new MuralPainter();
    background.paintBackground("lightblue",16);

    mushroomPainter mario = new mushroomPainter();
    mario.setPaint(1000);
      mario.paintMushroom();
  }
}