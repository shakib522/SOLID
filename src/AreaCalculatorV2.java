import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator{
    @Override
    public int sum(List<Shape> shapes){
        int sum=0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += (int) shapes.get(i).area();
            //those if block is open for modification.Break solid rules.Should close for modification and open for extension.
//            if (shape instanceof Square){
//                sum+= (int) Math.pow(((Square) shape).getLength(),2);
//            }
//            if (shape instanceof Circle){
//                sum+= (int) (Math.PI * Math.pow(((Circle) shape).getRadius(),2));
//            }

        }
        return sum;
    }
//    public String json(List<Object> shapes){
//        //this method break the rule of single responsibility
//        return "{sum: %s}".formatted(sum(shapes));
//    }
}

