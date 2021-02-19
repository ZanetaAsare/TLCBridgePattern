public class Triangle extends Shape{

    // compulsory implementation of color methods
    @Override
    public void paintRed() {
        this.shapeColor = "Triangle is painted red";
    }

    @Override
    public void paintGreen() {
        this.shapeColor = "Triangle is painted green";
    }

    // prints out shape color
    @Override
    public void whatIsTheColor() {
        System.out.println(this.shapeColor);
    }
}
