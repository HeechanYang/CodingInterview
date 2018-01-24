package Chapter1;

/**
 * Created by YangHC on 2018-01-24.
 * <p>
 * [문제 1-7]
 * 행렬 회전 : 이미지를 표현하는 N * N 행렬이 있다. 이미지의 각 픽셀은 4바이트로 표현된다.
 * 이때, 이미지를 90도 회전시킨는 메서드를 작성하라. 행렬을 추가로 사용하지 않고서도 할 수 있겠는가?
 */
public class Problem1_7 {

    public int[][] getRotatedImageReverseClockWise(int[][] image) {
//      i,j -> m-j,i -> m-i,m-j -> j,m-i
        int M = image.length - 1;

        printImage(image);
        System.out.println("==========ROTATE===========");

        int temp;
        for (int layer = 0; layer < (M + 2) / 2; layer++) {
            for (int i = layer; i < M - layer; i++) {
                temp = image[layer][i];
                image[layer][i] = image[i][M - layer];
                image[i][M - layer] = image[M - layer][M - i];
                image[M - layer][M - i] = image[M - i][layer];
                image[M - i][layer] = temp;
            }
        }

        printImage(image);
        System.out.println("************END************\n");

        return image;
    }

    public int[][] getRotatedImageClockWise(int[][] image) {
//      i,j <- m-j,i <- m-i,m-j <- j,m-i
        int M = image.length - 1;

        printImage(image);
        System.out.println("==========ROTATE===========");

        int temp;
        for (int layer = 0; layer < (M + 2) / 2; layer++) {
            for (int i = layer; i < M - layer; i++) {
                temp = image[layer][i];
                image[layer][i] = image[M - i][layer];
                image[M - i][layer] = image[M - layer][M - i];
                image[M - layer][M - i] = image[i][M - layer];
                image[i][M - layer] = temp;
            }
        }

        printImage(image);
        System.out.println("************END************\n");

        return image;
    }

    public void printImage(int[][] image) {
        for (int[] col : image) {
            for (int row : col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
