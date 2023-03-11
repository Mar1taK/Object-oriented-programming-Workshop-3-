public class Rectangle extends GeometricShapes {
    private String name;
    
    public Rectangle(String name, double a, double b) {
        super(new double [] {a, b});
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
        return String.format("%s имеет площадь => %f; периметр => %f; стороны => %f %f", name, getArea(), getPerimeter(), sides[0], sides[1]);
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
