# java2-2
# 안상현202330219

# 5월 17일 

# 배치 관리자 대표 유형 4 가지
## FlowLayout 배치관리자
컴포넌트가 삽입되는 순서대로 왼쪽에서 오른쪽으로 배치
배치할 공간이 없으면 아래로 내려와서 반복한다.
## BorderLayout 배치관리자
북쪽(North), 남쪽(South), 동쪽(East), 서쪽(West), 그리고 중앙(Center)으로 배치한다 
컴포넌트의 크기는 영역의 크기와 동일하게 설정한다.
## GridLayout 배치관리자
컴포넌트를 격자(grid) 형태로 배치한다. <br>
모든 셀은 같은 크기이다. <br>
행과 열의 수를 지정하여 레이아웃을 설정한다.
## CardLayout 배치관리자
여러 컴포넌트를 동일한 공간에 중첩하여 배치한다. <br>
각 컴포넌트는 카드처럼 관리되며, 하나의 컴포넌트만 한 번에 보인다. <br>
카드 간 전환이 가능하다.
# 컨테이너의 디폴트 배치관리자
Window, JWindow -> BorderLayout
Frame, JFrame -> BorderLayout
Dialog, JDialog -> BorderLayout
Panel, JPanel -> FlowLayout
Applet, JApplet -> FlowLayout

# setLayout() 메소드
Container 클래스의 ```setLayout()``` 메소드를 호출하면 
배치관리자를 설정할 수 있다 

예: JPanel에 BorderLayout 배치관리자를 설정
```java
JPanel p = new JPanel();
p.setLayout(new BorderLayout());
``` 


# 이전것들 ↓

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

## Scanner객체는 System.in으로 하여금 키보드로 <br>입력을 받고 문자,문자열,정수,실수등으로 변환하여 리턴해준다

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

# 예외발생 (try-catch-finally문)
```java
try {
  예외가 발생할 가능성이 있는 실행문
} catch(예외타입 선언) {
  예외 처리문
} finally {
  예외상관없이 무조건 실행되는 문장
}
```

# 자바의 객체 지향 특성

## 캡슐화
캡슐화(encapsulation)란 객체를 캡슐로 싸서 그 내부를 보호하고<br> 볼 수 없게하는 것으로 객체의 가장 본질적인 특징

## 클래스란 
객체의 모양을 선언한 틀이다 <br>
필드와 메소드를 클래스 내에 구현하여<br> 외부로부터의 접근을 제한한다
## 필드 메소드 
예: 
```java
//접근권한 클래스선언 클래스이름
public class circle {
  // 필드
  int radius;
  String name;

  // 메소드
  public double getArea() {
    return 3.14*radius*radius;
  }
}
```

# 상속
상속(inheritance)은 상위 개체의 속성이 하위 개체에 물러져서<br>
하위개체가 상위 개체의 속성을 모두 가지는 관계이다

# 다형성
다형성(polymorphism)은 같은 이름의 메소드가 클래스 <br>혹은 객체에 따라 다르게 구현되는것이다.
## 메소드 오버라이딩(overriding)은 자신의 특징에 맞게 동일한 이름으로 다시 구현하는것이다

## 메소드 오버로딩(Overloading)은 한개의 클래스 안에 같은 이름의 메소드를 여러 개 만드는것이다

# this란 
해당 객체에 대한 레퍼런스로 메소드안에서 사용된다
static에서는 사용불가능하다

# 접근 지정자
자바에서 메소드는 반드시 접근 지정자와 함께 선언되어야 하고 <br>
접근지정자 종류는 public,private,proteted<br>
디폴트 접근지정의 경우 패키지 내의 모든 클래스에서 호출이 가능하다  

# 리턴 타입
리턴 타입은 메소드가 호출자에게 리턴할 타입이다 <br>
## 메소드가 리턴값이 없다면 void 타입으로 선언한다

# 가비지란
가리키는 래퍼런스가 없는 객체이다  
예:  
a = new Person("123");  
b = new Person("456");  
b = a;
이렇게 하면 b는 a가 가리키던 객체를 가리키고  
처음 객체는 더 이상 접근할수없다 이게 바로 가비지이다

# static 
static은 간단히 전역이라고 생각하면된다
static변수는 객체를 안만들고 접근이 가능하다
## 클래스이름.변수이름 <-이런식으로 접근  

# non-static
non-static변수는 객체를 생성해야한다
예: Example obj = new Example();
## 객체이름.변수이름 <-이런식으로 접근  
### static변수는 객체로도 접근이 가능하지만<br> 클래스로 접근하는게 가독성을 좋게하는 습관이다

# 상속
class colorPoint extends Point이런식으로 
슈퍼클래스 Point를 colorPint클래스에 상속받을수있다

## final키워드
클래스 선언할떄 final키워드를 사용하면 상속받지못한다

## getter, setter
getter, setter를 사용하면 서브클래스에서 슈퍼클래스에있는  
private변수에 접근이 가능하다  
getter는 가져오는것이고  
setter는 값을 설정할수있다  

# 접근지정자  
public은 제일 보수적이지 않은 지정자이고  
다른클래스 다른패키지 어디든 접근이 가능하다  

private은 제발 보수적인 지정자이고  
다른클래스에서 접근이 불가능하지만 getter, setter를  
사용하여 접근이 가능하다
하지만 클래스내부에선 접근이 가능하다    

protected는 같은 패키지내에선 모두 접근이 가능하다  

defalt는 같은 패키지내에선 모두 접근이 가능하지만  
다른패키지에선 접근이 불가능하다

# 업캐스팅
업캐스팅은 하위 클래스 객체를 수퍼클래스 객체로 변환한다
예: Animal <- 수퍼클레스 | Dog <- 서브클래스 
```java
Animal animal = new Dog();
```

# 다운캐스팅
다운캐스팅은 업캐스팅된 객체를 다시 하위 클래스로 변환한다
예: Animal <- 수퍼클레스 | Dog <- 서브클래스 
```java
Animal animal = new Dog(); //업캐스팅된 Dog객체
Dog dog = (Dog) animal; //다운캐스팅
```

# instanceof 
확인하려는 객체가 어떤클래스의 객체인지 확인하는것이다
반환값: True, False
사용법: if(object instanceof className)

# 컬렉션(Collection)이란
컬렉션(Collection)이란 자바 프로그래밍 언어에서 데이터를 효율적으로 저장하고 관리하기 위한 구조와 그 관련 기능을 통칭하는 용어이다

# Vector&lt;E&gt;
요소의 개수가 넘치면 자동으로 길이조절
삽입, 삭제에 따라 자동으로 요소의 위치조정
## 삽입가능한 것
객체, null
기본 타입의 값은 Wrapper객체로 만들어 저장
## 객체 삽입
앞,뒤,중간 가능

# 값 추가 add
add로 추가했을때 그 자리에 값이 있으면 한칸씩 밀려나고 값이 없다면 그냥 들어감

# ArrayList
ArrayList는 Vector와 거의 도일하지만 동기화를 하지않음 
요소를 삭제하거나 삽입할때 충돌이 발생할수도 있다

# Iterator
Vector, ArrayList, LinkedList, Set 컬렉션의 요소를 순차적으로 검색할때 편리하게 사용할수있다

# Hash Map
데이터를 키(key)와 값(value)으로 저장한다
get("keyName") <- 데이터의 값을 가져온다
keySet() <- 데이터의 키값을 가져온다
put("keyName", "value") <- 데이터를 삽입할때 사용한다

# 제네릭(Generics)
객체를 생성할때 
Vector<타입> <-이런식으로 타입을 지정하는방식이 제네릭이다

# AWT
자바가 처음나왔을때 함께 배포된 GUI패키지이다
운영체제의 도움을받아 GUI를 그리기때문에 속도는 빠르나 
운영체제에 부담을 주므로 
중량 컴퓨넌트(heavy weight component)라고 불린다

# 스윙(Swing)
AWT와 달리 자바언어로 작성되어있고 
운영체제의 도움을 받지않으므로 경량 
컴퓨넌트(light weight component)라고 불린다
컴포넌트 이름이 J로 시작한다
스윙을 사용하기 위해 AWT 패키지가 필요하다

