/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.entity;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luhtalam
 */
public class BlockTest {

    Block block;
    int x, y;
    Color color;

    @Before
    public void setUp() {
        this.x = 3;
        this.y = 4;
        color = Color.BLACK;
        block = new IBlock(x, y, color);
    }

    @Test
    public void testConstructorSetsCoordinatesRight() {
        assertEquals(this.x, block.getX());
        assertEquals(this.y, block.getY());
    }

    @Test
    public void testMoveDownSetsCoordinatesRight() {
        block.moveDown();
        assertEquals(x, block.getX());
        assertEquals(y + 1, block.getY());
    }

    @Test
    public void testMoveSetsXRight() {
        int dx = 5;
        int dy = 5;
        block.move(dx, dy);
        assertEquals(x + dx, block.getX());
    }

    @Test
    public void testMoveSetsYRight() {
        int dx = 5;
        int dy = 5;
        block.move(dx, dy);
        assertEquals(y + dy, block.getY());
    }

    @Test
    public void testMoveMovesEveryPart() {
        int dx = 5;
        int dy = 5;
        block.move(dx, dy);
        for (int i = 0; i < 4; i++) {
            assertEquals(y + dy, block.getParts()[i].getYCoordinate());
            assertEquals(x - 1 + i + dx, block.getParts()[i].getXCoordinate());
        }
    }

    @Test
    public void testMoveDownMovesEveryPartRight() {
        block.moveDown();
        for (int i = 0; i < 4; i++) {
            assertEquals(x - 1 + i, block.getParts()[i].getXCoordinate());
            assertEquals(y + 1, block.getParts()[i].getYCoordinate());
        }
    }

    @Test
    public void testMoveRightSetsCoordinatesRight() {
        block.moveRight();
        assertEquals(x + 1, block.getX());
        assertEquals(y, block.getY());
    }

    @Test
    public void testMoveRightMovesEveryPartRight() {
        block.moveRight();
        for (int i = 0; i < 4; i++) {
            assertEquals(x + i, block.getParts()[i].getXCoordinate());
            assertEquals(y, block.getParts()[i].getYCoordinate());
        }
    }

    @Test
    public void testMoveLeftSetsCoordinatesRight() {
        block.moveLeft();
        assertEquals(x - 1, block.getX());
        assertEquals(y, block.getY());
    }

    @Test
    public void testMoveLeftMovesEveryPartRight() {
        block.moveLeft();
        for (int i = 0; i < 4; i++) {
            assertEquals(x - 2 + i, block.getParts()[i].getXCoordinate());
            assertEquals(y, block.getParts()[i].getYCoordinate());
        }
    }

    @Test
    public void testRotateRightOneTime() {
        block.rotateRight();
        for (int i = 0; i < 4; i++) {
            assertEquals(y - 1 + i, block.getParts()[i].getYCoordinate());
            assertEquals(x, block.getParts()[i].getXCoordinate());
        }
    }

    @Test
    public void testRotateRightTwoTimes() {
        block.rotateRight();
        block.rotateRight();
        for (int i = 0; i < 4; i++) {
            assertEquals(y, block.getParts()[i].getYCoordinate());
            assertEquals(x + 1 - i, block.getParts()[i].getXCoordinate());
        }
    }

    @Test
    public void testRotateRightThreeTimes() {
        block.rotateRight();
        block.rotateRight();
        block.rotateRight();
        for (int i = 0; i < 4; i++) {
            assertEquals(y + 1 - i, block.getParts()[i].getYCoordinate());
            assertEquals(x, block.getParts()[i].getXCoordinate());
        }
    }

    @Test
    public void testRotateRightFourTimes() {
        block.rotateRight();
        block.rotateRight();
        block.rotateRight();
        block.rotateRight();
        for (int i = 0; i < 4; i++) {
            assertEquals(x - 1 + i, block.getParts()[i].getXCoordinate());
            assertEquals(y, block.getParts()[i].getYCoordinate());
        }
    }

    @Test
    public void testRotateLeftOneTime() {
        block.rotateLeft();
        for (int i = 0; i < 4; i++) {
            assertEquals(y + 1 - i, block.getParts()[i].getYCoordinate());
            assertEquals(x, block.getParts()[i].getXCoordinate());
        }
    }

    @Test
    public void testRotateLeftTwoTimes() {
        block.rotateLeft();
        block.rotateLeft();
        for (int i = 0; i < 4; i++) {
            assertEquals(y, block.getParts()[i].getYCoordinate());
            assertEquals(x + 1 - i, block.getParts()[i].getXCoordinate());
        }
    }

    @Test
    public void testRotateLeftThreeTimes() {
        block.rotateLeft();
        block.rotateLeft();
        block.rotateLeft();
        for (int i = 0; i < 4; i++) {
            assertEquals(y - 1 + i, block.getParts()[i].getYCoordinate());
            assertEquals(x, block.getParts()[i].getXCoordinate());
        }
    }

    @Test
    public void testRotateLeftFourTimes() {
        block.rotateLeft();
        block.rotateLeft();
        block.rotateLeft();
        block.rotateLeft();
        for (int i = 0; i < 4; i++) {
            assertEquals(x - 1 + i, block.getParts()[i].getXCoordinate());
            assertEquals(y, block.getParts()[i].getYCoordinate());
        }
    }

}
