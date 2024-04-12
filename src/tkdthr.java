class Point {
  private int x,y;
  public void set(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public void showPoint() {
    System.out.println("(" + x + "," + y + ")");
  }
}

class colorPoint extends Point {
  private String color;
  public void setColor(String color) {
    this.color = color;
  }
  public void showColorPoint() {
    System.out.print(color);
    showPoint();
  }
}
public class tkdthr {
  public static void main(String[] args) {
    Point p = new Point(); // p라는 이름의 객체(인스턴스)생성
    p.set(1, 2);
    p.showPoint();

    colorPoint cp = new colorPoint();
    cp.set(3, 4);
    cp.setColor("red");
    cp.showColorPoint();
  }
}