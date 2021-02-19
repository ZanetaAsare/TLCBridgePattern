public abstract class Shape {
    String shapeColor;
    Color color;

    // receive Color object in constructor
    public Shape(Color color) {
        this.color = color;
    }

    public abstract void whatIsTheColor();
}
