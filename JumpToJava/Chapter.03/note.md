# [변수 자료형]

## 숫자

정수형 int, long
실수형 float, double
8진수 octal = 023 -> 0으로 시작
16진수 hex = 0xc -> 0x로 시작

## 불 대수

ture와 false를 값으로 갖는다.

## 문자

- char

변수에 실제 문자('a'), 아스키코드(97), 유니코드('\u0061')을 대입할 수 있다.

## 문자열

- string
- 문자열(String)은 문자로 구성된 문장
- 문자열은 쌍따옴표(`" "`)로 둘러싸여 표현
- 문자열은 리터럴(literal) 표기 방식과 `new` 키워드를 통해 객체를 생성할 수 있다.
- `String`은 객체
- 문자열의 비교는 `equals()` 메서드를 사용해야 하며, `==` 연산자는 참조 주소를 비교한다.

### 문자열 내장 메서드

- `equals()`: 문자열을 비교하여 동일한지 확인
- `indexOf()`: 문자열에서 특정 문자열의 시작 위치를 반환
- `contains()`: 문자열에 특정 문자열이 포함되어 있는지 확인
- `charAt()`: 문자열에서 특정 위치의 문자를 반환
- `replaceAll()`: 문자열에서 특정 문자열을 다른 문자열로 대체
- `substring()`: 문자열에서 일부를 잘라내어 반환
- `toUpperCase()`, `toLowerCase()`: 문자열의 대소문자를 변경
- `split()`: 문자열을 특정 구분자로 나누어 문자열 배열로 반환

### 문자열 포매팅

- 문자열 포매팅은 문자열 안에 값을 삽입하는 방법이다.
- %s(문자열), %c(문자), %d(정수), %f(부동소수), %o(8진수), %x(16진수), %%(% 자체)
- %10s와 같이 포맷 코드에 옵션을 추가하여 문자열을 정렬하거나 길이를 조절할 수 있다.
- System.out.printf() 메서드를 사용하여 포매팅된 문자열을 바로 출력할 수 있습니다.

## StringBuffer

스트링버퍼로 선언된 변수는 자동적으로 append 메서드를 사용하여 문자열을 추가할 수 있다.
이후에 toString메서드를 사용하여 문자열로 바꿀 수 있다.

## 배열

(자료형) [] (변수명) = {e1, e2, e3, ...}
배열에 접근할 때는 변수명 뒤에 대괄호와 인덱스 번호를 사용
length 메서드를 사용할 수 있다.

## 리스트

'''
ArrayList (변수명) = new ArrayList();
'''를 사용하여 생성할 수 있다.
add 메서드로 원소를 추가한다.
그 외에도 배열레는 없는 기능이 많다.

- get
- size
- contains
- remove

## 맵

파이썬의 딕셔너리와 비슷한 구조
맵 자료형에는 HashMap, LinkedHashMap, TreeMap 등이 있다.

메서드 정리 :

- put
- get
- containsKey
- remove
- size
- keySet

## enum

상수집합을 나타낸다

## 형변환

String -> int

- Integer.parseInt()
  String -> double
- Double.parseDouble()
  int -> String
- String A = "" + int
- String.valueOf()
- Integer.toString()

### 키워드 final

변수를 선언할 때 final을 선언하면 값을 바꿀 수 없다.
