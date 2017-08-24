package pieces;

import org.junit.Test;

import pieces.Piece.Type;

public class PawnTest extends PieceTest {

    @Test
    public void create() {
        Position position = new Position(1, 1);
        verifyPiece(Pawn.createWhite(position), Pawn.createBlack(position), Type.PAWN);
    }
}
