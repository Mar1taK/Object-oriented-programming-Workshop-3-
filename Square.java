public class Square extends GeometricShapes{
    private String name;

    public Square(String name, double a) {
        super(new double [] {a, a, a, a});
        this.name = name;
    }

    @Override
    Double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }
    
    @Override
    public String toString() {
        return String.format("%s имеет площадь => %f; Периметр => %f; равные стороны => %f", name, getArea(), getPerimeter(), sides[0]);
    }

    @Override
    public int compareTo(Figures o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else 
            return 0;
    }

}