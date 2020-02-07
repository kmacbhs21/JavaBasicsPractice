public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car( 2001, "toyota", 10000, "Camry" );
        System.out.println(myCar.toString());
        myCar.drive( 1100);
        System.out.println(myCar.toString());
        Rectangle myRectangle = new Rectangle( 3, 2);
        System.out.println(myRectangle.toString2());
    }
}


