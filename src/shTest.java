class Point1 {
  private int x, y;
  public Point1(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public void showPoint() {
    System.out.println("(" + x + "," + y + ")");
  }
}

class ColorPoint extends Point1 {
  private String color;
  public ColorPoint(int x, int y, String color) {
    super(x, y);
    this.color = color;
  }
  public void showColorPoint() {
    System.out.print(color);
    showPoint();
  }
}
public class shTest {
  public static void main(String[] args) {
    ColorPoint cp = new ColorPoint(5, 6, "blue");
    cp.showColorPoint();
  } 
}
