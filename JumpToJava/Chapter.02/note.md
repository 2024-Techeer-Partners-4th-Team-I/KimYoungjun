## 02장 자바 시작하기

### 02-01 자바 코드 구조 살펴보기

자바는 클래스(class) 기반의 객체지향 프로그래밍 언어이다.  
각 클래스는 중괄호 {} 로 둘러싸인 메서드(method)와 변수(variable)들로 이루어져 있다.  
메서드는 클래스 내에서 특정한 기능을 수행하는 코드 블록을 의미하며, 변수는 값을 저장하기 위한 메모리 공간을 가리킨다. 자바 코드는 보통 main 메서드부터 실행되며, 이는 프로그램의 시작점을 나타낸다.  
![alt text](image.png)

### 02-02 변수와 자료형

- 자바의 키워드  
  abstract continue for new switch
  assert default goto package synchronized
  boolean do if private this
  break double implements protected throw
  byte else import public throws
  case enum instanceof return transient
  catch extends int short try
  char final interface static void
  class finally long strictfp volatile
  const float native super while

### 02-03 이름 짓는 규칙

자바에서는 변수, 메서드, 클래스 등을 정의할 때 일정한 명명 규칙을 따라야 한다.  
변수명은 소문자로 시작하며, 여러 단어로 이루어진 경우에는 각 단어의 첫 글자를 대문자로 표기하는 카멜 표기법(camelCase)을 따른다.  
클래스명은 대문자로 시작하며, 여러 단어로 이루어진 경우에도 카멜 표기법을 사용한다.
