public class Main {
    public static void main(String[] args) {

        // instantiate
        Circle myCircle = new Circle();
        Triangle myTriangle = new Triangle();

        // apply paint methods
        myCircle.paintGreen();
        myTriangle.paintRed();

        // show color
        myCircle.whatIsTheColor();
        myTriangle.whatIsTheColor();
    }
}
