package chapterSevenExercise;
public class Position {
private int rowPosition;
private int columnPosition;

public Position(int rowPosition,int columnPosition){
    this.rowPosition=rowPosition;
    this.columnPosition=columnPosition;
}

    @Override
    public String toString() {
        return "Position{" +
                "rowPosition=" + rowPosition +
                ", columnPosition=" + columnPosition +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (!(o instanceof Position comparedPosition)) return false;
        boolean rowsAreEqual=Integer.compare(this.rowPosition,comparedPosition.rowPosition)==0;
        boolean columnsAreEqual=Integer.compare(this.columnPosition,comparedPosition.columnPosition)==0;
        return  rowsAreEqual & columnsAreEqual;
    }
    //@Override
    //public int hashcode(){
    //  return Objects.hash(rowPosition, columnPosition);
    // }
    public void increaseColumnPositionBy(int numberOfSteps){
        columnPosition += numberOfSteps;
    }
    public int getColumnPosition(){
        return columnPosition;
    }
    public void setColumnPosition(int columnPosition){
        this.columnPosition = columnPosition;
    }
    public int getRowPosition(){
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
}



