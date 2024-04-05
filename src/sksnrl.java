import java.util.Scanner;

public class sksnrl {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int dividend; //나뉨수
    int divisor; //나눗수

    System.out.println("나뉨수를 입력하세요");
    dividend = sc.nextInt();
    System.out.println("나눗수를 입력하세요");
    divisor = sc.nextInt();

    try {
      System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다");
    } catch(ArithmeticException e) {
      System.out.println("0으로 나눌수없어요");
    } finally {
      sc.close();
    }
  }
}
