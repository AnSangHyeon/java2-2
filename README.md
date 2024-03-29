# java2-2
#안상현202330219

# h1
## h2
안녕나안안앙난안앙난아  
안녕나여낭영녀여

일반 글씨는 그냥 작성
개행(newline)은 스페이스 2개

*이텔릭체*  
**굵게**  
***이텔릭+굵게***

## 리스트(list)
1. 첫 번째  
2. 두 번째  
3. 세 번째  

## 코드블럭
```java
public class main(String[] args) {
  System.out.println("hello world");
}
```

```python
print("하이티비")
```

## 링크
[구글 링크](https://google.com) <!-- [화면에 보이는내용](이동할 url) -->

[리스트](#리스트list) <!-- [보이는 글](#이동할 위치) -->
<!-- html의 id와 동일 누르면 이동 -->

![댕댕이](./img/dog.jfif) <!-- ![html의 alt와 같이 이미지가 안보일때 보이는 글](이미지 경로) -->
<!--이미지 띄우기 html의 <img>태그도 사용 가능 -->

# 정수 리터럴
15 -> 10진수
015 -> 0으로 시작하면 8진수, 10진수로 13
0x15 -> 0x로 시작하면 16진수, 10진수로 21
0b0101 -> 0b로 시작하면 2진수, 10진수로 5

## Long 타입으로 지정할땐 
long i = 24l; 이런식으로 l이나 L을 붙이면 된다

## 실수 리터럴
실수 리터럴은 소수점 형태나 지수형태로 실수를 표현한 값
예: 12. 12.0 .1234 0.1234 1234E-4

## 실수 리터럴은 double타입으로 자동 처리되며 변수와 함꼐 사용하면 된다
double d = 0.1234;
double e = 1234E-4; <- 1234E-4 = 1234x10<sup>-4</sup>이므로 0.1234와 동일

## 숫자 뒤에 f또는 F를 붙이면 float으로 d 또는 D를 붙이면 double타입으로 강제 변환 할수있다
float f = 0.1234f; <- 0.1234는 원래 double타입이므로 
double w = .1234D; <- .1234D와 .1234는 동일

# 문자 리터럴
문자 리터럴은 단일 인용부호('')로 문자를 표현하거나 \u 다음에 문자의 유니코드값을 사용하여 표한한다 
예: 'a', 'W', '가’, '3', '글'

변수와 함께쓰면
char a = 'W';
char b = '글';
char c = \uae00; <- 글의 유니코드 값 ae00을 \u뒤에 사용

# 특수문자 리터럴
백슬래쉬(\) 다음에 특수 기호를 붙여서 표한하는데 이를 이스케이프 시퀸스(escape sequence)라고 한다

종류
'\b' <- 백스페이스
'\t' <- 탭
'\n' <- 라인피드(줄바꿈)
'\f' <- 폼피드(커서를 다음 페이지의 시작부분으로 넘김)
'\r' <- 캐리지 리턴(커서를 다음줄로 넘기지 않고 첫 번째 위치로 넘김)
'\"' <- 큰따옴표
'\'' <- 작은따옴표
'\\' <- 백슬래쉬(역슬래쉬)

# null 리터럴
null은 기본 타입에 사용하지못하고 객체 레퍼런스에 대입된다

## null은 int,double,boolean등과 같은 기본타입에 적용불가

String str = null; <- 이런식으로 사용

# 문자열(String) 리터럴
"hello"와 같이 큰따옴표에 묶어서 표현한다
String str = "hello";

# var 키워드
java10부터 var키로드를 사용하여 타입을 생략하고 간단히 변수선언 가능
var키워드는 자동으로 타입 결정
## 초깃값이 주어지지 않으면 오류 발생
## 지역 변수로만 사용가능

# 상수 
리터럴을 상수로 선언하면 변수처럼 표현 가능
상수는 final키워드를 사용하여 선언

final double PI = 3.141592;
final -> 상수선언
double -> 데이터 타입
PI -> 상수 이름
3.141592 -> 이 값으로 초기화

## final키워드를 사용할땐 앞에 static을 붙여줘야 좋다

# 타입변환

## 자동 타입 변환
다음과 같이 치환문(=)이나 타입이 일치하지 않을 때 컴파일러는 작은 타입을 큰 타입으로 자동변환
long m = 24; <- 25는 int타입으로서 long타입으로 자동변환
double d = 3.14 * 10; <- 실수를 연산하기위해 10.0으로 자동변환

## 강제 타입 변환
int n = 300;
작은 타입에서 큰타입으로 변환 가능
큰 타입에서 작은타입으로 변환하면 컴파일러는 오류를 발생시킨다

손실이 발생한다는걸 알고도 강제 변환하려면 
byte b = (byte)n;
이처럼 괄호안에 타입을 넣어서 강제 변환이 가능하다

## 강제 타입 변환을 캐스팅(casting)이라고도 부른다.

# System.in
System.in은 표준 입력 스트림 객체로 키보드 입력을 받기위해 사용
System.in을 사용하면 읽은 바이터 정보를 문자나 숫자로 변환해야하는 번거로움이 있다
그래서 저수준(low-level)인 System.in보다 고수준(high-level)인 Scanner를 사용하는것이 좋다

# Scanner 객체 생성
Scanner sc = new Scanner(System.in);
이런식으로 sc라는 이름의 객체를 생성할수 있다

## Scanner객체는 System.in으로 하여금 키보드로 
## 입력을 받고 문자,문자열,정수,실수등으로 변환하여 리턴해준다

# Scanner 사용할떄 import
Scanner를 사용하기위해 java.util.Scanner를 import해야한다
예: import java.util.Scanner;

## Scanner 주요 메소드
각 타입별로 사용방법 {
  String next()
  byte nextByte()
  shor nextShort()
  int nextInt()
  long nextLong()
  float nextFloat()
  double nextDouble()
  boolean nextBoolean()
  String nextLine ->두줄 입력하면 첫번째 라인만 scanner객체에 저장
  void close() 
  boolean hasNext() -> 입력할게 있으면 true를 반환하고 아니면 false를 반환
}








