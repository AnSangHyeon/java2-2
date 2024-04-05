public class OverLoding2 {
  String title;
  String author;

  public OverLoding2(String t) {
    title = t;
    author = "작자미상";
  }
  public OverLoding2(String t, String a) {
    title = t;
    author = a;
  }
  public static void main(String[] args) {
    OverLoding2 littlePrince = new OverLoding2("어린왕자", "생텍쥐페리");

    OverLoding2 loveStory = new OverLoding2("춘향전");

    System.out.println(littlePrince.title + " " + littlePrince.author);
    System.out.println(loveStory.title + " " + loveStory.author);
  }
}
