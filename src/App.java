import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월(1~12)을 입력하시오.");

    int month = sc.nextInt();
    if(month == 3 || month == 4 || month == 5) {
      System.out.println("봄입니다.");
    } else if(month == 6 || month == 7 || month == 8) {
      System.out.println("여름입니다.");
    } else if(month == 9 || month == 10 || month == 11) {
      System.out.println("가을입니다.");
    } else if(month == 12 || month == 1 || month == 2) {
      System.out.println("겨울입니다.");
    } else {
      System.out.println("잘못입력했습니다.");
    }
    sc.close(); //Scanner사용하고 close안하면 오류는 안나지만 가비지컬렉션(메모리 낭비) 발생
  }
}