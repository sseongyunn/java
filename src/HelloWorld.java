public class HelloWorld {
    // public : 하나의 파일 안에 여러 개의 클래스를 작성할 수 있는데, 만약 파일명과 클래스명이 같으면 public class로 선언해주면 됨
    public static void main(String[] args){
        System.out.println("Hello World");
        // public : 메서드의 접근 제어자로 누구나 이 메서드에 접근할 수 있다는 의미
        // static : 메서드에 static이 지정되어 있으면 이 메서드는 인스턴스를 생성하지 않아도 실행할 수 있음을 의미, 얘는 클래스 메서드라서 객체를 만들지 않아도 '클래스명.메서드명' 형태로 호출 가능
        // void : 메서드의 리턴값이 없음을 의미, String[] : 문자열을 나타내는 자바의 자료형, args가 String[]의 변수명
        // System.out.println : 표준 출력으로 데이터를 보내는 자바의 내장 메서드, 문자열을 화면에 출력, 표준출력이란 프로그램에서 외부환경(os)으로 일반 메세지를 출력하는 것
    }
}

//아까 인텔리제이를 이용하지 않고 vscode로 할 때는 jdk의 javac를 활용해서 직접 컴파일하고 넘겨주고 했는데
//인텔리제이에서는 run 명령을 실행하면 컴파일과정(.java -> .class), 실행과정(java.exe)이 자동으로 진행
