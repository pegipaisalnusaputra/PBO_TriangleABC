public class Shape {
    protected Double area = 0.0;
    protected Double primeter;
    protected String name;

    static final void hitungLuas () {
        System.out.println("Hitung Luas");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Primeter: " + primeter);
    }
}
