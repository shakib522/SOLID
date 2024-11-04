import java.util.List;

public class AreaPrinter {
    // violate dependency inversion principles.
    // Component should depend on abstraction not on concretion
    // private AreaCalculator calculator=new AreaCalculator();
    private IAreaCalculator calculator;
    AreaPrinter(IAreaCalculator areaCalculator){
        calculator=new AreaCalculator();
    }
    public String json(List<Shape>shapes){
        return "{shapeSum: %s}".formatted(calculator.sum(shapes));
    }
    public String csv(List<Shape> shapes){
        return "shapeSum, %s".formatted(calculator.sum(shapes));
    }
}
