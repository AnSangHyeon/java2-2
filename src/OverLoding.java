public class OverLoding {
  int radius;
  String name;

  public OverLoding() {
    radius = 1;
    name = "";
  }
  public OverLoding(int r, String n) {
    radius = r;
    name = n;
  }
  public double getArea() {
    return 3.14*radius*radius;
  }

  public static void main(String[] args) {
    OverLoding pizza = new OverLoding(10, "자바피자");
    double ar = pizza.getArea();
    System.out.println(pizza.name + "의 면적은 " + ar);

    OverLoding donut = new OverLoding();
    donut.name = "도넛피자";
    ar = donut.getArea();
    System.out.println(donut.name + "의 면적은 " + ar); 
  }
}