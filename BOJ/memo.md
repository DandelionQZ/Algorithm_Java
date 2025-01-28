# 입출력

- Scanner에서는 더 이상 읽을 값이 없을 때 `NoSuchElementException`을 던진다.
그러므로 입력이 없는데 Scanner 객체가 읽힐 경우도 생각해야한단 거다. 
이럴때는 객체.hasNext()로 입력이 있을 경우 처리하도록 하면 된다.


- InputStream, BufferedReader, StringTokenizer로 입력 받기.  
    - `BufferedReader br = new BufferedReader(new InputStreamReader(System.in));`로 받아오기.
      - br.read() 또는 br.readLine()으로 받기.  
        둘 다 메서드에 IOException이 선언되어 있었기에 호출하는 곳에서 같은 예외를 던질 수 있도록 선언해줘야함. 
        - read() : 한 문자를 읽고 유니코드 값(정수)를 반환함. 읽을 문자가 없으면 -1을 반환함. 
        - readLine() : 개행 문자 전까지 읽고 문자열로 반환함. 읽을 문자가 없으면 null을 반환함. 
    - 문자열 토큰화 시키기
      - StringTokenizer st = new StringTokenizer(문자열, ( )[구분자], (false)[true]);
      - 구분자 default는 공백이고, true는 구분자도 문자열에 포함시킨다는 의미다. 
      - st에 들어있는 토큰은 nextToken()으로 읽는다.
      - 반환 값의 자료형은 String 이다.
      

- Scanner 클래스의 메서드
  - next: 단어(공백 전까지)
  - hasNext: 읽을 수 있는 단어가 있는지 확인 (boolean)
  - nextLine: 개행 문자 전까지 읽음
  - hasNextLine: 줄 읽기가 가능한지 확인 (boolean)


- StringBuilder 사용법  
`StringBuilder st = new StringBuilder();`로 객체를 생성하고,
st.append(String객체 또는 문자열)로 값을 붙인다. 프린트는 바로 st 찍으면 된다. 


- BufferedWriter, OutputStreamWriter
  - 사용 이유 : 데이터 출력 스트림에서 속도를 높이기 위해 사용되며 많은 데이터를 출력할 때 유용하다.
  - 사용 방법
    ```java
    // 출력 버퍼 통을 만든다
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    // 데이터를 추가한다
    bw.write("data\n");
    
    // 버퍼를 비운다 (강제로 출력)
    bw.flush();
    
    // 스트림 닫기
    bw.close();
    ```
    

---


# String 관련 메서드

- String의 repeat() 메서드
  - 파라미터의 주어진 횟수만큼 반복한다.
  - 0이면 빈 문자열, 1이면 문자열 그대로, 음수면 `IllegalArgumentExceptionthrow` 에러를 반환한다. 

    
---


# ArrayList 사용법

- ArrayList<Integer> arrList = new ArrayList<>(10); // 초기용량 설정
- ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1,2,3)); // 배열 넣어서 생성
- ArrayList<Integer> arrList = new ArrayList<>(list2); // List 객체 넣어서 생성
- 메서드
  - add("값");
  - addAll(list3); // List 객체 넣어서 추가 가능
  - remove(2); // 2번 인덱스 요소 삭제
  - clear(); // 요소를 모두 삭제
  - get(0); 0번 인덱스 요소값 얻기 
  - subList(0, 4); // 0~3번 인텍스 값 얻기
  - set(0, "test"); // 0번 인덱스 값 변경
  - ensureCapacity(10); // 용량 재지정 
  - 배열로 변환 -> String[] arr = ArrayList객체.toArray();
  - 기타 : sort정렬, clone복제, iterator순회


