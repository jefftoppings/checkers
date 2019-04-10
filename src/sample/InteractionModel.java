package sample;

import java.util.ArrayList;

public class InteractionModel {

    Checker selectedChecker;
    ArrayList<Square> validMoves;

    public InteractionModel() {
        selectedChecker = null;
        validMoves = new ArrayList<>();
    }

    public void populateValidMoves() {
        assert selectedChecker!= null;

        // squares to check for 2,2
        // (1,1) (3,1) (1,3) (3,3)
        int row = selectedChecker.square.row;
        int col = selectedChecker.square.col;

        Square upLeft = null;
        Square downLeft = null;
        Square upRight = null;
        Square downRight = null;

        // up left
        int upLeftRow = row - 1;
        int upLeftCol = col - 1;

        // down left
        int downLeftRow = row + 1;
        int downLeftCol = col - 1;

        // up right
        int upRightRow = row - 1;
        int upRightCol = col + 1;

        // down right
        int downRightRow = row + 1;
        int downRightCol = col + 1;

        for (Square s : GameManager.lightSquares) {

            if (upLeftRow >= 0 && upLeftCol >= 0) {
                if (s.row == upLeftRow && s.col == upLeftCol) {
                    if (s.isEmpty()) {
                        upLeft = s;
                    }
                }
            }

            if (downLeftRow  <= 7 && downLeftCol >= 0 ) {
                if (s.row == downLeftRow && s.col == downLeftCol) {
                    if (s.isEmpty()) {
                        downLeft = s;
                    }
                }
            }

            if (upRightRow >= 0 && upRightCol <= 7) {
                if (s.row == upRightRow && s.col == upRightCol) {
                    if (s.isEmpty()) {
                        upRight = s;
                    }
                }
            }

            if (downRightRow <= 7 && downRightCol <= 7) {
                if (s.row == downRightRow && s.col == downRightCol) {
                    if (s.isEmpty()) {
                        downRight = s;
                    }
                }
            }
        }

        // add to valid moves
        if (upLeft != null) {
            validMoves.add(upLeft);
        }
        if (downLeft != null) {
            validMoves.add(downLeft);
        }
        if (upRight != null) {
            validMoves.add(upRight);
        }
        if (downRight != null) {
            validMoves.add(downRight);
        }

    }

}
