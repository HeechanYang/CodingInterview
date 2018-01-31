package Chapter5;

/**
 * Created by YangHC on 2018-01-29.
 * <p>
 * [문제 5-8]
 * 선 그리기 : 흑백 모니터 화면은 하나의 바이트 배열에 저장되는데, 인접한 픽셀 여덟 개를
 * 한 바이트에 묶어서 저장한다. 화면의 폭은 w이며, w는 8로 나누어 떨어진다.
 * 물론, 화면 높이는 배열 길이와 화면 폭을 통해 유도해 낼 수 있다. 이 때 (x1, y)에서
 * (x2,y)까지 수평선을 그려주는 함수를 작성하라. 메서드 용법(method signature)은 다음과 같다.
 * <p>
 * drawLine(byte[] screen, int width, int x1, int x2, int y)
 */
public class Problem5_8 {
    public byte[] drawLine(byte[] screen, int w, int x1, int x2, int y) {
        // ((y*(w/8)) + x1)번 픽셀 ~ ((y*(w/8)) + x2)번 픽셀
        int pixelIdx1 = ((y * w) + x1);
        int pixelIdx2 = ((y * w) + x2);

        for (int i = pixelIdx1 / 8; i <= pixelIdx2 / 8; i++) {
            if (i != (pixelIdx2 / 8)) {             //같은 byte안에 있다면
                screen[i] = fillOneIToJ(screen[i], i * 8, x2);
            } else {                                                //같은 byte안에 있지 않다면
                screen[i] = fillOneIToJ(screen[i], x1, (x2-x1)%8);
            }
            System.out.println(Integer.toBinaryString(screen[i]));
        }
        return screen;
    }

    public byte fillOneIToJ(byte num, int i, int j) {
        int mask = ((-1) << (j + 1)) + ((1 << (i)) - 1);
        return (byte) (num | (~mask));
    }

}