public class Triangle extends Shape{

    // shape color is set in instantiation
    public Triangle(Color color) {
        super(color);
        this.shapeColor = "Triangle is " + color.paint();
    }

    // prints out shape color
    @Override
    public void whatIsTheColor() {
        System.out.println(this.shapeColor);
    }
}
