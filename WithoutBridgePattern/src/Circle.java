public class Circle extends Shape{

    // compulsory implementation of color methods
    @Override
    public void paintRed() {
        this.shapeColor = "Circle is painted red";
    }

    @Override
    public void paintGreen() {
        this.shapeColor = "Circle is painted green";
    }

    // prints out shape color
    @Override
    public void whatIsTheColor() {
        System.out.println(this.shapeColor);
    }
}
