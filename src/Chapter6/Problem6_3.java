package Chapter6;

/**
 * Created by YangHC on 2018-01-26.
 * <p>
 * [문제 6-3]
 * 도미노 : 8 * 8 크기의 체스판이 있는데, 대각선 반대 방향 끝에 있는 셀(cell) 두 개가
 * 떨어져 나갔다. 하나의 도미노로 정확히 두 개의 정사각형을 덮을 수 있을 때,
 * 31개의 도미노로 보드 전체를 덮을 수 있겠는가? 여러분의 답이 옳다는 것을 증명하라.
 * (예를 들거나, 왜 불가능한지를 보이면 된다)
 *
 * FAIL
 */
public class Problem6_3 {
    public boolean canCoverAllBoard(int[][] board, int dominoSize) {
        int numOfCells = 0;
        for (int[] col : board) {
            numOfCells += col.length;
        }

        if (numOfCells % dominoSize != 0) {
            return false;
        }else if(true){

        }
        return true;
    }
}
