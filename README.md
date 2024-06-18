# java2-2
# 안상현202330219

# 6월 14일 강의
# 자바의 입출력 스트림
## 자바의 입출력 스트림
## 입출력 장치와 자바 응용 프로그램 연결
- 입력 스트림 : 입력 장치로부터 자바 프로그램으로 데이터를 전달하는 객체
- 출력 스트림 : 자바 프로그램에서 출력 장치로 데이터를 보내는 객체
## 특징
- 입출력 스트림 기본 단위 : 바이트
- 단방향 스트림, 선입선출 구조

# 자바의 스트림 종류
## 문자 스트림
- 문자만 입출력하는 스트림
- 문자가 아닌 바이너리 데이터는 스트림에서 처리하지 못함
- 문자가 아닌 데이터를 문자 스트림으로 출력하면 깨진 기호가 출력
- 바이너리 파일을 무자 스트림으로 읽으면 읽을 수 없는 바이너리 생김
## 바이트 스트림
    - 입출력 데이터를 단순 바이트의 흐름으로 처리
    - 문자 데이터 든 바이너리 데이터든 상관없이 처리 가능  
    예) 바이너리 파일을 읽는 입력 스트림

## 스트림 연결
- 여러 개의 스트림을 연결하여 사용할 수 있음   
    예) 키보드에서 문자를 입력받기 위해 System.in과  
    InputStreamReader를 연결한 코드

## 문자 스트림으로 텍스트 파일 읽기
- 텍스트 파일을 읽기 위해 문자 스트림 FileReader 클래스 이용
    - 스트림을 생성하고 파일을 열어 스트림과 연결
    ```
    FileReader fin = new FileReader("c:\\test.txt");
    ```
- 파일 읽기
    - Read

## 파일 입출력과 예외 처리
- 파일 입출력 동안 예외 발생 가능
    - 스트림 생성 동안 : FileNotFoundException 발생 가능
    (파일의 경로명이 틀리거나, 디스크의 고장 등으로 파일을 열 수 없음)
    - 파일 읽기, 쓰기, 닫기를 하는 동안 : IOException 발생 가능
- try-catch 블록 반드시 필요
    - 자바 컴파일러의 강제 사항

- FileReadrEx.java 예시 문제
```java
package chapter02;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader in = null;
        try  {
            in = new FileReader("c:\\windows\\system2.ini");
            int c;
            while ((c = in.read()) != -1) { // 한 문자씩 파일 끝까지 읽는다.
                System.out.print((char)c);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}

```

### 문자 스트림으로 텍스트 파일 쓰기
- 텍스트 파일에 쓰기 위해 문자 스트림 FileWriter 클래스 이용
1. 파일 출력 스트림 생성(파일 열기)
    - 스트림을 생성하고 파일을 열어 스트림과 연결
    ```
    FileWriter fout = new FileWriter("c:\\Temp\\test.txt");
    ```
2. 파일쓰기
    - write()로 문자 하나 씩 파일에 기록
    ```java
    fout.write('A'); // 문자 'A'를 파일에 기록
    ```
    
    - 블록 단위로 쓰기 가능

3. 스트림 닫기
    - close()로 스트림 닫기

# 바이너리 값을 파일에 저장하기
- 프로그램 내의 변수, 배열, 배퍼에 든 바이너리 값을 파일에 그대로 기록   
    (FileOutputStream 클래스 이용)  
1. 파일 출력 스트림 생성(파일 열기)  
    (스트림을 생성하고 파일을 열어 스트림과 연결) 

2. 파일 쓰기

3. 스트림 닫기

- FileOutputStreamEx.java 예제
```java
package chapter02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};

        try {
            FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
            for(int i=0; i<b.length; i++)
                fout.write(b[i]);

            fout.close();
        } catch(IOException e) { }
            System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
    }
}
```

# File 클래스
- File 클래스
    - 파일의 경로명 및 속성을 다루는 클래스
    (java.io.File , 파일과 디렉터리 경로명의 추상적 포현)
    - 파일 이름 변경, 삭제 ,디렉터리 생성, 크기 등 파일 관리
- File 객체 생성
    - 생성자에 파일 경로명을 주어 File 객체 생성
    -디렉터리와 파일명을 나누어 생성자 호출

# TCI/IP 소개
- TCP/IP 프로토콜
    - 두 시스템 간에 데이터가 손상없이 안전하게 전송되도록 하는 통신 프로토콜  
    - TCP에서 동작하는 응용프로그램 사례  
    (e-mail, FTP, 웹(HTTP)등)
- TCP/IP 특징
    - 연결형 통신    
    (한 번 연결 후 계속 데이터 전송 가능)
    - 보낸 순서대로 받아 응용프로램에게 전달

# IP 주소
- IP 주소
    - 네트워크 상에서 유일하게 식별될 수 있는 컴퓨터 주소  
        -숫자로 구성된 주소, 4개의 숫자가 ','으로 연결  
    - 숫자로 된 주소는 기억하기 어려우므로 www.naver.com과 같은   
      문자열로 구성된 도메인 이름으로 바꿔 사용
    - 현재는 32비트의 IP 버전 4(IPv4)가 사용되고 있는
    - 자신의 IP 주소를 간다히 localhost라는 이름으로 사용 가능

# 포트 
- 포트
    - 통신하는 프로그램 간에 가상의 연결단 포트 생성  
        - IP 주소는 네트워트 상의 컴퓨터 또는 시스템을 식별하는 주소  
        - 포트 번호를 이용하여 통실할 응용프로그램 식별

    - 모든 응용프로그램은 하나 이상의 포트 생성 가능
        - 포트를 이용하여 상대방 응용프로그램과 데이터 교환
        
    - 잘 알려진 포트(well-konwn ports)
        - 시스템이 사용하는 포트 번호
        - 잘 알려진 응용프로그램에서 사용하는 포트 번호  
            (0부터 1023 사이의 포트 번호)  
            ( ex) SSH 22, HTTP 80, FTP 21 )   
        - 잘 알려진 포트 번호는 개발자가 사용하지 않는 것이좋음
            (충돌 가능성)

# 소켓 프로그래밍
- 소켓 (soket)
    - TCP/IP 네트워크를 이용하여 쉽게 통신 프로그램을 작성하도록 지원하는 기반 기술
    - 소켓
        - 두 응용프로그램 간의 양방향 통신 링크의 한쪽 끝 단
        - 소켓끼리 데이터를 주고받음
        - 소켓은 특정 IP 포트 번호와 결합
    - 자바로 소켓 통신할 수 있는 라이브러리 지원
    - 소켓 종류 : 서버 소켓과 클라이언트 소켓

# Socket 클래스, 클라이언트 소켓
- Socket 클래스
    - 클라이언트 소켓에 사용되는 클래스
    - java.net 패키지에 포함
    - 생성자

# 클라이언트에서 소켓으로 서버에 접속하는 코드
- 클라이언트 소켓 생성 및 서버에 접속
    - Socket의 생성자에서 128.12.1.1의 주소의  9999 포트에 접속
- 소켓으로부터 데이터를 전솔할 입출력 스트림 생성
- 서버로 데이터 전송
- 서버로부터 데이터 수신
```
String line = in.readline();
//서버로부터 한 행의 문자열 수신
```
- 네트워크 접속 종료

# 서버에 클라이언트가 연결되는 과정

1. 서버는 서버 소켓으로 들어오는 연결 요청을 기다림(listen)

2. 클라이언트가 서버에게 연결 요청

3. 서버가 연결 요청 수락(accept)
    - 새로운 클라이언트 소켓을 만들어 클라이언트와 통신하게 함
    - 그리고 다시 다른 클라이언트의 연결을 기다림

# 서버가 클라이언트와 통신하는 과정
- 서버 소켓 생성
```java
ServerSocket serverocket = new ServerSocket
```
- 클라이언트로부터 접속 기다림

# 서버-클라이언트 채팅 프로그램 만들기
- 간단한 채팅 프로그램
    - 서버와 클라이언트가 1:1로 채팅
    - 클라이언트와 서버가 서로 한번씩 번갈아 가면서 문자열 전송
    (문자열 끝에 \n을 붙임) 

# 6월 7일 강의

# 스윙 컴포넌트 그리기
스윙의 페인팅 기본
- 모든 컴포넌트는 자신의 모양을 스스로 그린다.
- 컨테이너는 자신을 그린 후 그 위에 자식 컴포넌트들에게 그리기 지시
- 모든 스윙 컴포넌트는 자신의 모양을 그리는 paintComponent() 메소드 보유

public void paintComponent(Graphics g)
- 스윙 컴포넌트가 자신의 모양을 그리는 메소드

### paintComponent()의 오버라이딩과 JPanel
paintComponent()의 오버라이딩
- 개발자가 JComponent를 상속받아 새로운 컴포넌트 설계
- 기존 컴포넌트의 모양에 변화를 주고자 할 때

JPanel 
- 비어 있는 컨테이너

### 그래픽 기반 GUI 프로그래밍
그래픽 기반 GUI 프로그래밍
- 스윙 컴포넌트에 의존하지 않고 선, 원 이미지 등을 이용하여 직접화면을 구성하는 방법
- 그래픽 기반 GUI 프로그래밍의 학습이 필요한 이유
1. 컴포넌트의 한계를 극복하고 차트, 게임 등 자유로운 콘텐트 표현
2. 그래픽은 컴포넌트에 비해 화면 출력 속도가 빠름
3. 스윙 컴포넌트들로 모두 그래픽으로 작성되어 있어, 그래픽에 대한 학습은 자바 GUI의 바탕 기술을 이해하는데 도움
4. 그래픽을 이용하여 개발자 자신만의 컴포넌트 개발

# Graphics와 문자열 출력
Graphics의 기능
- 색상 선택
- 문자열 그리기
- 도형 그리기
- 도형 칠하기
- 이미지 그리기
- 클리핑

# 그래픽의 색과 폰트
- 색 : color 클래스
- 폰트 : Font 클래스
- Graphics 에 색과 폰트 설정

# 도형 그리기와 칠하기
도형 그리기
- 선, 타원, 사각형, 둥근 모서리 사격형, 원호, 폐 다각형 그리기
- 선의 굵기 조절할 수 없음

도형 칠하기
- 도형을 그리고 내부를 칠하는 기능  
(도형의 외각선과 내부를 따로 칠하는 기능 없음)
- 도형 칠하기를 위한 메소드  
(그리기 메소드 명에서 draw 대신 fill로 이름 대치하면 됨.fillRect(),fillOval()등)

# 스윙에서 이미지를 그리는 2가지 방법
1. JLabel을 이용한 이미지 그리기
장점 : 이미지 그리기 간편 용이
단점 : 이미지의 원본 크기대로 그리므로 이미지 크기 조절 불가

2. Graphics의 drawlmage()로 이미지 출력
장점 : 이미지 일부분 등 이미지의 원본 크기와 다르게 그리기 가능
단점 : 컴포넌트로 관리할 수 없음, 이미지의 위치나 크기 등을 적절히 조정하는 코딩 필요

# repaint()
repaint()
- 모든 컴포넌트가 가지고 있는 메소드
- 자바 플랫폼에게 컴포넌트를 그리기를 강제 지시하는 메소드 
- repaint()를 호출하면, 자바 플랫폼이 컴포넌트의 pintComponent() 호출

repaint()의 호출이 필요한 경우  
개발자가 컴포넌트를 다시 그리고자 하는 경우
- 프로그램에서 컴포넌트의 모양과 위치를 변경하고 바로 화면에 반영시키고자 하는 경우

# 멀티태스킹(multi-tasking)의 개념
멀티태스킹
- 여러 개의 작업(태스크)이 동시에 처리되는 것

# 스레드와 운영체제
스레드(thread)  
- 운영체제에 의해 관리되는 하나의 작업 혹은 태스크  
스레드와 태그크(혹은 작업)은 바꾸어 사용해도 무관

멀티스레딩(multi-threading)
- 여러 스레드를 동시에 실행시키는 응용프로그램을 작성하는 기법

스레드 구성  
- 스레드 코드  
(작업을 실행하기 위해 작성한 프로그램 코드)

# 멀티태스킹과 멀티스레딩
멀티프로세싱
- 하나의 응용프로그램이 여러 개의 프로세스를 생성하고, 각 프로세스가 하나의 작업을
처리하는 기법이다.
- 각 프로세스 독립된 메모리 영역을 보유하고 실행
- 프로세스 사이의 문책 교환에 따른 과도한 오버ㅔ드와 시간 소모의 문제점

멀티스레딩
- 하나의 응용프로그램이 여러 개의 스레드를 생성하고, 각 스레드가 하나의 작업을
처리하는 기법
- 하나의 응용프로그램에 속한 스레드는 변수 메모리, 파일 오픈 테이블 등
자원으로 공유하므로, 문맥 교환에 따른 오버헤드가 매주 작음
- 현재 대부분의 운영체제가 멀티스레딩을 기본으로 하고 있음

# 자바 스레드(Thread)와 JVM
자바 스레드
- 자바 가상 기계(JVM)에 의해 스케쥴되는 실행 단위의 코드 블럭
- 스레드의 샐명 주기는 JVM에 의해 관리됨 : JVM은 스레드 단위로 스케쥴링

JVM과 자바의 멀티스레딩
- 하나의 JVM은 하나의 자바 응용프로그램만 실행  
(자바 응용프로그램이 시작될 때 JVM이 함께 실행됨)  
(자바 응용프로그램이 종료하면 JVM이 함께 종료함)
- 응용프로그램은 하나 이상의 스레드로 구성 가능하다.

# Thread클래스를 상속받아 스레드 만들기
Thread를 상속받아 run() 오버라이딩
- Thread 클래스 상속, 새 클래스 작성
- run() 메소드 작성 (run() 메소드를 스레드 코드라고 부름)

스레드 객체 생성
- 생성된 객체는 필드와 메소드를 가진 객체일 뿐 스레드로 작동하지 않음

스레드 시작
start() 메소드 호출
- 스레드로 작동 시작
- 스레드 객체의 run()이 비로소 실행
- JVM에 의해 스케쥴되기 시작함

# Runnable 인터페이스로 스레드 만들기
Runnable 인터페이스 구현하는 새 클래스 작성
- run() 메소드 구현
    1. run() 메소드를 스레드 코드라고 부름
    2. run() 메소드에서 스레드 실행 시작

- 스레드 객체 생성

# main 스레드
main 스레드
- JVM이 응용프로그램을 실행할 때 디폴트로 생성되는 스레드
- main() 메소드 실행 시작

# 스레드 종료와 타 스레드 강제 종료
- 스스로 종료  
( run()메소드 리턴 )

- 타 스레드에서 강제 종료   
( interrupt() 메소드 사용 )

# 스레드 동기화
- 멀티스레드 프로그램 작성시 주의점  
    다수의 스레드가 공유 데이터에 동시에 접근하는 경우  
    (공유 데이터의 값에 예상치 못한 결과 발생 가능)  
- 스레드 동기화  
동기화란?  
스레드 사이의 실행순서 제어, 공유데이터에 대한 접근을 원활하게 하는 기법

- 멀티스레드의 고융 데이터의 동시 접근 문제 해결  
방법 1) 공유 데이터르 접근하는 모든 스레드의 한 줄 세우기  
방법 2) 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드가 대기 하도록 함

- 자바의 스레드 동기화 방법 2가지
1. synchronized 키워드로 동기화 블록 지정
2. wait()-notify() 메소드로 스레드의 실행 순서 제어

# 동기화의 필요성
- 두 스레드가 프린터에 동시에 충돌하는 경우

# synchronized 불록 지정
synchronized 키워드
- 스레드가 독점적으로 실행해야 하는 부분(동기화 코드)을 표시하는 키워드
(임계 영역 표기 키워드)

synchronized 블록이 실행될 때
- 먼저 실행한 스레드가 모니터 소유
(모니터란 해당 객체를 독점적으로 사용할 수 있는 권한)
- 모니터를 소유한 스레드가 모니터를 내놓을때 까지 다른 스레드 대기

# wait-notify를 이용한 스레드 동기화
## wait-notify()가 필요한 경우  
  공유 데이터로 두 개 이상의 스레드가 데이터를 주고 받을 때  
  (producer-consumer문제)
## 동기화 메소드 
    wait() : 다른 스레드가 notify()를 불러줄 때까지 기다린다.  
    notify() : wait()를 호출하여 대기중인 스레드를 깨운다.  
     ( wait(), notify()는 Object의 메소드 )

# 5월 31일 강의

# 자바의 GUI 프로그래밍 방법
컴포넌트 기반 GUI 프로그래밍  
스윙 컴포넌트를 이용하여 쉽게 GUI를 구축  
자바에서 제공하는 컴포넌트의 한계를 벗어나지 못함

# 스윙 컴포넌트의 공통 메소드, Jcomponent
스윙 컴포넌트는 모두 상속받는 슈퍼 클래스, 추상 클래스  
스윙 컴포넌트들이 상속받는 공통 메소드와 상수 구현  
JComponent의 주요 메소드 사례

# JLabel의 용도
문자열이나 이미지를 화면에 출력하기 위한 목적이다

## 문자열 레이블 생성
```java 
JLabel textLabel = new Label("안녕하세요");
```

## 이미지 레이블 생성  
이미지 파일로부터 이미지를 읽기 위해 imagelcon 클래스 사용  
다룰 수 있는 이미지 : png, gif, jpg

# 이미지 버튼 만들기  
하나의 버튼에 3개의 이미지 등록  
마우스 조작에 따라 3개의 이미지 중 적절한 이미지 자동 출력

# 이미지 버튼에 이미지 설정 
## 이미지 로딩  
필요한 이미지 로딩 : new lmagelcon(이미지 경로명);

## 버튼에 이미지 등록  
JButton의 메소드를 호출하여 이미지 등록

# 체그박스에 Item 이벤트 처리
## Item 이벤트  
이벤트 리스너를 사용하여 버튼 클릭, 마우스 움직임 등 다양한 사용자 인터페이스 이벤트를 처리할 수 있습니다.

# JRadioButton의 용도
버튼 그룹을 형성하고, 그룹에 속한 버튼 중 하나만 선택되는 라디오버튼

# 라디오버튼에 Item 이벤트 처리 : ItemListener 리스너 이용
라디오버튼이 선택/해제되어 상태가 달라지면, Item 이벤트 발생  
사용자가 마우스나 키보드로 선택 상태를 변경할 때

# JTextField로 한 줄 입력 창 만들기
한줄의 문자열을 입력 받는 창(텍스트필드)
텍스트 입력 도중 <Enter>키가 입력되면 Action 이벤트 발생
입력 가능한 문자 개수와 입력 창의 크기는 서로 다름

# JTextArea
여러 줄의 문자열을 입력받을 수 있는 창(텍스트 영역)  
스크롤바를 지원하지 않는다 

# JList
하나 이상의 아이템을 보여주고 아이템을 선택하도록 하는 리스트  
java 7부터 제네릭 리스트로 바뀜  
JScrollPane에 JList를 삽입하여 스크롤 가능

# JComboBox
텍스트 필드와 버튼, 그리고 드롭다운 리스트로 구성되는 콤보박스  
드롭다운 리스트에서 선택한 것이 텍스트 필드에 나타남

# 메뉴 구성
메뉴 만들기에 필요한 스윙 컴포넌트  
메뉴 아이템 - JMenuItem  
메뉴 - JMenu(여러 개의 메뉴 아이템을 가짐)
메뉴바 -JMenuBar  

# 메뉴 아이템에 Action 이벤트 달기
메뉴 아이템을 클릭하면 Action 발생
메뉴 아이템은 사용자로부터 지시나 명령을 받는데 사용

# 팝업 다이얼로그, JOptionPane
사용자에게 메시지를 전달하거나 문자열을 간단히 입력받는 용도

# 확인 다이얼로그
확인 다이얼로그 - JoptionTane.showConfirmDialog

# 5월 24일
# 이벤트 기반 프로그래밍(Event Driven Programming)
## 이벤트(Event)
사용자 입력(예: 버튼 클릭, 키보드 입력 등)에 의해 발생하는 상황이다.
## 이벤트 핸들러(Event Handler)
이벤트가 발생했을 때 실행되는 메서드입니다. Java에서는 이벤트 리스너(Event Listener)라는 인터페이스를 구현하여 핸들러를 정의한다.
## 이벤트 리스너(Event Listener)
특정 이벤트를 처리하기 위해 구현해야 하는 인터페이스이다.
### 리스너 사용이유는 가독성이 좋아지고 리스너 안에 핸들러를 <br>사용하면 여러가지 핸들러를 상황별로 골라쓸수있다
```java
// 리스너 객체 생성
ActionListener buttonClickHandler = new ActionListener() {
    // 핸들러를 만들어 어떤 동작을 할지 정함
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Button was clicked!");
    }
};
```
# 클래스 리스너 종류
# 독립 클래스(Separate Class)
리스너 클래스를 별도로 정의하여 다른 클래스에서도 재사용할 수 있습니다.
```java
class ButtonClickListener implements ActionListener {

}
```
# 내부 클래스(Inner Class)
메인 클래스 내부에 리스너 클래스를 정의하여 메인 클래스와 밀접하게 관련된 이벤트 처리를 구현합니다.
## 여러 클래스에서 작업하기 힘들다
```java
public class InnerClassExample {
  public static void main(String[] args) {
    class ButtonClickListener implements ActionListener {
    
    }
  }
}
```
# 익명 클래스(Anonymous Class)
리스너 클래스를 즉석에서 정의하고 객체를 생성하여 간결하게 코드를 작성합니다.
## 재사용이 힘들다
```java
button.addActionListener(new ActionListener() {

});
```
# 어댑터(Adapter)클래스 
리스너 어댑터는 이벤트 리스너를 구현할 때 모든 메서드를 직접 구현해야 하는 번거로움을 줄여주는 도우미 클래스이다.
## 어댑터를 사용하지않으면 모든 메소드를 직접 구현해야하는데<br>어댑터를 사용하면 아래 예제처럼 사용할 이벤트만 <br>사용하면 된다 그리고 implements 가 아닌 extends를 사용한다
```java
class MyMouseListener extends MouseAdapter {
  public void mouseClicked(MouseEvent e) {
    System.out.println("Mouse Clicked");
  }
}
```
# ketListener
## keyPressed(): 키를 누를 때 호출된다.
## keyReleased(): 키를 뗄 때 호출된다.
## keyTyped(): 키를 타이핑할 때 호출된다.



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

