public class Triangle extends GeometricShapes {
    private String name;

    public Triangle(String name, double a, double b, double c) {
        // a + b > c && b + c > a && a + c > b
        super(new double[] {a, b, c});
        this.name = name;
    }

    @Override
    Double getArea() {
        double p = super.getPerimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[1]));
    }

    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return String.format("%s имеет площадь => %f; Периметр => %f; стороны => %f %f %f", name, getArea(), getPerimeter(), super.sides[0], super.sides[1], super.sides[2]);
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