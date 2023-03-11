public abstract class GeometricShapes extends Figures implements Perimeter{
    protected double [] sides;

    protected GeometricShapes(double [] sides){
        this.sides = sides;
    }

    public Double getPerimeter(){
        Double result = (double) 0;
        for (double side:this.sides) {
            result += side;
        }
        return result;
    }

    @Override
     abstract Double getArea();

    
}