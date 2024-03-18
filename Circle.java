public class Circle extends Shape {
    protected Double radius;

    public Circle (Double radius, String name){
        super.setName(name);
        this.calculateArea (radius);
        this.calculatePrimeter(radius);
    }

    public void calculateArea (Double radius) {
        super.area = Math.PI * Math.pow (radius, 2);
    }

    public void calculatePrimeter (Double radius) {
        super.primeter = 2 * Math.PI * radius;
    }
}
