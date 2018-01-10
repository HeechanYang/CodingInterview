package Chapter8;

import java.util.Arrays;

/**
 * Created by YangHC on 2018-01-10.
 * <p>
 * [문제 8-2]
 * 격자판(grid)상의 로봇 : 행의 개수는 r, 열의 개수는 c인 격자판의 왼쪽 상단
 * 꼭짓점에 로봇이 놓여있다고 상상해 보자. 이 로봇은 오른쪽 아니면 아래쪽으로만
 * 이동할 수 있다. 하지만 어떤 셀(cell)은 '금지 구역'으로 지정되어 있어서
 * 로봇이 접근ㄴ할 수 없다. 왼쪽 상단 꼭짓점에서 오른쪽 하단 꼭짓점으로의
 * 경로를 찾는 알고리즘을 설계하라.
 * <p>
 * --> 경로의 개수!
 * <p>
 * <p>
 * [Recursive], [Dynamic Programming]
 */

public class Problem8_2 {
    private int board[][];
    private int r, c;

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    private void setBoard(int board[][]) {
        this.board = board;

        r = board.length;
        c = board[0].length;
    }

    public static void main(String[] args) {
        Problem8_2 p2 = new Problem8_2();

        int board[][] = {
                {0, 0, 0, 0, 0}
                , {0, 1, 0, 0, 1}
                , {0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0}};
        p2.setBoard(board);

        System.out.println(p2.getCountWays(p2.getR()-1,p2.getC()-1));
    }

    public int getCountWays(int x, int y) {
        //금지 구역 처리
        if(board[x][y]==1){
            return 0;
        }

        if (x == 0 && y == 0) {
            return 1;
        } else if (x == 0) {
            return getCountWays(x, y - 1);
        } else if (y == 0) {
            return getCountWays(x - 1, y);
        } else {
            return getCountWays(x, y - 1) + getCountWays(x - 1, y);
        }
    }
}
