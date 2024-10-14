public class sample03_05 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        //new 키워드를 이용하여 바로 객체 생성 가능, StringBuffer 객체는 빈 문자열인 것 같음
        //StringBuffer는 java.lang 패키지에 속한 클래스들이라 별도로 import할 필요 없다고 함
        sb.append("hello");
        //클래스에서 메인함수 없이 바로 이 내용을 적었었는데 오류가 났다 왜지??
        sb.append(" ");
        sb.append("jump to java");

        String result = sb.toString(); //toString() 메서드는 stringbuffer를 string으로 형변환해줌
        System.out.println(result);
    }


}
