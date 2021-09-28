package chapterSevenExercise;

import chapterSevenExercise.Pen;

public class Turtle {
    private Pen pen=new Pen();
    private Direction currentDirection= Direction.EAST;
    private Position currentPosition = new Position(0,0);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        PenPosition position = pen.getPosition();
         pen.setPosition(PenPosition.DOWN);
    }

    public void penUp() {
        pen.setPosition(PenPosition.UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection==Direction.NORTH){
            currentDirection=Direction.EAST;
        }else
        if  (currentDirection==Direction.WEST){
            currentDirection=Direction.NORTH;
        }else

        if (currentDirection==Direction.SOUTH){
            currentDirection=Direction.WEST;
        }else
        if(currentDirection==Direction.EAST) {
            currentDirection=Direction.SOUTH;
        }

        }

    public void turnLeft() {
        if (currentDirection==Direction.NORTH){
            currentDirection=Direction.EAST;
        }else
        if (currentDirection==Direction.WEST){
            currentDirection=Direction.NORTH;
        }else
        if (currentDirection==Direction.SOUTH){
            currentDirection=Direction.WEST;
        }else
        if(currentDirection==Direction.EAST){
            currentDirection=Direction.SOUTH;
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int numberOfSteps) {
        if(currentDirection == Direction.EAST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps-1);
        }
        if(currentDirection == Direction.SOUTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps);
        }
        if(currentDirection == Direction.WEST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps);
        }
        if(currentDirection == Direction.NORTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps);
        }
        }
        //public void writeOn(Sketchpad sketchpad, int numberOfSteps ){

}

