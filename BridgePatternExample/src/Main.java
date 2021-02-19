public class Main {
    public static void main(String[] args) {

        // applies paint method with instantiation
        Circle myCircle = new Circle(new GreenColor());
        Triangle myTriangle = new Triangle(new RedColor());

        // show color
        myCircle.whatIsTheColor();
        myTriangle.whatIsTheColor();
    }
}
