public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        double area = this.length * this.width;
        return area;
    }
    public double getDiagonal(){
        double PreDiagonal = (this.length * this.length) + (this.width * this.width);
        double diagonal = Math.sqrt(PreDiagonal);
        return diagonal;
    }
    public String isSquare(){
        if(this.length == this.width){
            return "This is a square";
        }
        return "This is not a square";
    }


    public String toString2() {
        return isSquare() + " and has an area of" + getArea() + " a diagonal length of" + getDiagonal();
    }
}

