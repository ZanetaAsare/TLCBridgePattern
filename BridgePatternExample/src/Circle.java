public class Circle extends Shape{

    // shape color is set in instantiation
    public Circle(Color color) {
        super(color);
        this.shapeColor = "Circle is " + color.paint();
    }

    // prints out shape color
    @Override
    public void whatIsTheColor() {
        System.out.println(this.shapeColor);
    }
}
