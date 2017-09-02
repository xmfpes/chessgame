package pieces;

import org.junit.Test;

import pieces.Piece.Type;

public class KnightTest extends PieceTest {

    @Test
    public void create() {
        Position position = new Position(1, 1);
        verifyPiece(Knight.createWhite(position), Knight.createBlack(position), Type.KNIGHT);
    }
    
    @Test(expected = InvalidMovePositionException.class)
    public void verifyMovePosition_inValid() throws Exception {
        Knight knight = Knight.createWhite(new Position("c1"));
        knight.verifyMovePosition(Pawn.createWhite(new Position("d4")));
    }
    
    @Test
    public void verifyMovePosition() throws Exception {
        Knight knight = Knight.createWhite(new Position("d4"));
        knight.verifyMovePosition(Blank.create(new Position("b3")));
        knight.verifyMovePosition(Blank.create(new Position("b5")));
        knight.verifyMovePosition(Blank.create(new Position("c2")));
        knight.verifyMovePosition(Blank.create(new Position("c6")));
        knight.verifyMovePosition(Blank.create(new Position("e2")));
        knight.verifyMovePosition(Blank.create(new Position("e6")));
        knight.verifyMovePosition(Blank.create(new Position("f3")));
        knight.verifyMovePosition(Blank.create(new Position("f5")));
    }
}