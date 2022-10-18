public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        // Shape shape = new Shape();

        Rectangle regtangle = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + regtangle.getWidth());
        System.out.println("Height = " + regtangle.getHeight());
        System.out.println("Area = " + regtangle.getArea());

        Square square = new Square(height);
        // reg2.setWidth(width);
        // reg2.setHeight(height);
        System.out.println("==== Square ====");
        System.out.println("Width = " + square.getSide());
        System.out.println("Height = " + square.getSide());
        System.out.println("Area = " + square.getArea());
    }
}
