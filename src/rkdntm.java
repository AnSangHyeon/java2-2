import java.util.Scanner;
// 가우스 덧셈 알고리즘
// 교수님이랑 다른방식으로 한번 만들어봤어요
public class rkdntm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("숫자를 입력하세요");
    int num = sc.nextInt();
    int answer = 0;

    for(int i=1, j=num;i<=num;i++,j--) {
      answer += i + j;
    }

    System.out.println(answer/2);

    sc.close();
  }
}
