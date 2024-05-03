public class change_this {
  String title;
  String author;

  void show() {
    System.out.println(title + " " + author);
  }
  public change_this() {
    this("", "");
    System.out.println("생성자 호출됨");
  }
  public change_this(String title) {
    this(title, "작자미상");
  }
  public change_this(String title, String author) {
    this.title = title;
    this.author = author;
  }
  public static void main(String[] args) {
    // change_this lp = new change_this("어린왕자", "생텍쥐페리");
    change_this ls = new change_this("춘향전");
    // change_this eb = new change_this();
    ls.show();
  }  
}