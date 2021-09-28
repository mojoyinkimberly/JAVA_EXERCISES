package TurtleGraphics;

import chapterSevenExercise.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {
//    Pen pen;
//    Turtle ijapa;
//    @BeforeEach
//    public void startEachTestWithThis(){
//        ijapa=new Turtle();
//        pen= ijapa.getPen();

    @Test
    public void testThatTurtleHasAPen(){
        //given
        Turtle ijapa = new Turtle();
        //when
        Pen pen =ijapa.getPen();
        //assert
        assertNotNull(pen);
    }
    @Test
    public void testThatPenIsUpByDefault(){
        //given
        Turtle ijapa = new Turtle();
        //when
        Pen pen = ijapa.getPen();
        //assert
        assertSame(PenPosition.UP,pen.getPosition());
    }
    @Test
    public void testThatTurtleCanMovePenDown(){
        //given
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP,pen.getPosition());
        //when
        ijapa.penDown();
        //assert
        assertSame(PenPosition.DOWN,ijapa.getPen().getPosition());
    }
    @Test
    public void testThatTurtleCanMovePenUp(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertSame(PenPosition.DOWN,ijapa.getPen().getPosition());
//        Pen pen =ijapa.getPen();
//        assertSame(PenPosition.UP,pen.getPosition());
//        ijapa.getPen().setPosition(PenPosition.DOWN);
        //when
        ijapa.penUp();
        //assert
        assertSame(PenPosition.UP,ijapa.getPen().getPosition());
    }
    @Test
    public void testThat_TurtleCanTurnRight_WhileFacingEast(){
        //given
        Turtle ijapa = new Turtle();
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());

    }
    @Test
    public void testThat_TurtleCanTurnRight_WhileFacingSouth(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
    }
    @Test
    public void testThat_TurtleCanTurnRight_WhileFacingWest(){
        //given
        Turtle ijapa =new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(Direction.NORTH,ijapa.getCurrentDirection());

    }
    @Test
    public void testThat_TurtleCanTurnRight_WhileFacingNorth(){
        //given
        Turtle ijapa =new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
    }
    @Test
    public void testThat_TurtleCanTurnLeft_WhileFacingEast(){
        //given
        Turtle ijapa = new Turtle();
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
    }
    @Test
    public void testThat_TurtleCanTurnLeft_WhileFacingSouth(){
        //given
        Turtle ijapa=new Turtle();
        ijapa.turnLeft();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
    }
    @Test
    public void testThat_TurtleCanTurnLeft_WhileFacingWest(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(Direction.NORTH,ijapa.getCurrentDirection());
    }
    @Test
    public void testThat_TurtleCanTurnLeft_WhileFacingNorth(){
        //given
        Turtle ijapa =new Turtle();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.NORTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(Direction.EAST,ijapa.getCurrentDirection());
    }
    @Test
    public void testThat_TurtleCanMoveForward_WhileFacingEast(){
        //given
        Turtle ijapa =new Turtle();
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new Position(0,4),ijapa.getCurrentPosition());
    }

    @Test
    public void testThat_TurtleCanMoveForward_WhileFacingSouth(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        assertSame(Direction.SOUTH,ijapa.getCurrentDirection());
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new Position(5,0),ijapa.getCurrentPosition());
    }
    @Test
    public void testThat_TurtleCanMoveForward_WhileFacingWest(){
            //given
            Turtle ijapa = new Turtle();
            //when
            ijapa.turnRight();
            ijapa.turnRight();
//        assertSame(WEST, ijapa.getCurrentDirection());
            ijapa.moveForward(5);
            //assert
            assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
        }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingNorth(){
        //given
        Turtle ijapa = new Turtle();
        //when
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.moveForward(5);
        //assert
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
    }
//    @Test
//    public void turtleCanWriteOnSketchPadWhileFAcingEastTest(){
//        //given
//        Turtle ijapa = new Turtle();
//        ijapa.penDown();
//        assertSame(Direction.EAST, ijapa.getCurrentDirection());
//        SketchPad sketchPad = new SketchPad(5,5);
//
//        //when
//        ijapa.writeOn(sketchPad, 3);
//        //assert
//        int[][] floor = sketchPad.getFloor();
//        assertEquals(1, floor[0][0]);
//        assertEquals(1, floor[0][1]);
//        assertEquals(1, floor[0][2]);
//        assertEquals(0, sketchPad.getFloor()[0][3]);
//        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
//        sketchPad.displayFloor();
//    }




}

