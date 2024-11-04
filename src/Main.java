import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator=new AreaCalculator();
        IAreaCalculator areaCalculatorV2=new AreaCalculatorV2();
        Circle circle=new Circle(10);
        Square square=new Square(10);
        Cube cube=new Cube();
        NoShape noShape=new NoShape();
        AreaPrinter printer=new AreaPrinter(areaCalculatorV2);
        List<Shape> shapes=List.of(circle,square,cube);
        int sum= areaCalculator.sum(shapes);
        System.out.println("sum: "+sum);
        System.out.println("sum: "+printer.json(shapes));
        System.out.println("sum: "+printer.csv(shapes));

    }
}
