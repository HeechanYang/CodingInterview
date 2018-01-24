package Chapter1;

/**
 * Created by YangHC on 2018-01-24.
 * <p>
 * [문제 1-6]
 * 문자열 압축 : 반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축 메서드를 작성하라.
 * 예를 들어 문자열 aabccccaaa를 압축하면 a2b1c53이 된다. 만약 '압축된' 문자열의 길이가
 * 기존 문자열의 길이보다 길다면 기존 문자열을 반환해야 한다. 문자열은 대소문자 알파벳(a~z)으로만
 * 이루어져 있다.
 */
public class Problem1_6 {
    public static void main(String[] args) {
        Problem1_6 p6 = new Problem1_6();
        System.out.println(p6.getCompressedString("abccc"));
    }

    public String getCompressedString(String str) {
        StringBuilder sb = new StringBuilder(str);
        char temp = sb.charAt(0);
        int tempCnt = 1;
        for (int i = 1; i < sb.length(); i++) {
            char thisChar = sb.charAt(i);
            if (thisChar != temp) {
                sb.insert(i, tempCnt);
                temp = thisChar;
                tempCnt = 1;
                i++;
            } else {
                sb.deleteCharAt(i);
                tempCnt++;
                i--;
            }
        }
        sb.append(tempCnt);

        if(str.length()<sb.length()){
            return str;
        }else {
            return sb.toString();
        }
    }
}
