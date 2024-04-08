## [객체 지향 언어]
자바는 고 기능(High Level) 시스템 개발에 최적화 되어있다.  
자바의 실행 과정  
&nbsp;: 작성한 프로그램 ↴&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;↴  
&emsp;&emsp;컴파일러 (javac.exe)&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;(컴파일)  
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;↳ .class 파일&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;↲&emsp;&emsp;&emsp;&emsp;↴  
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;= 이진(binary) 파일 ↴&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;(인터프리트)  
실행결과 ←자바 가상 머신, JVM(java.exe)&emsp;&emsp;&emsp;&emsp;&emsp;↲  
  
☆ 접근 제어자 public  
&ensp;파일명(HelloWrold.java)과 클래스명(HelloWorld)이 같을 때, 클래스 선언 앞에 붚임  

클래스를 만들었으면 (public class HelloWorld)  
&ensp;→ 매서드(=함수)를 만들어야한다.  
&ensp;→ 그 중 main은 항상 있어야한다.  
&ensp;→ public static void main(String[] args)  
public: 누구나 접근 가능  
static: 인스턴트 생성 ❌  
String[] args: 자료형과 변수명  

자바 기본 매서드 : System.out.println("    ")
