public class Circle extends Figures implements GetCircle{
    private String name;
    private double radius;


    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
    
    @Override
    public Double getRadius(){
        return radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public Double getCircleofCircle() {
        return Math.PI * (2 * radius);
    }

    @Override
    public String toString() {
        return String.format("%s имеет площадь - %f; радиус %f; окружность %f", name, getArea(), radius, getCircleofCircle());
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