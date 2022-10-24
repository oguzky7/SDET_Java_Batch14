package Group_Project_2;
      /*  Create an Interface 'Shape' with undefined methods as calculateArea
        and calculatePerimeter. Create 2 classes Circle & Square that
        implements functionality defined in the Shape Interface. Test your code.
*/
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
       double radius;
   Circle(double radius){
       this.radius=radius;
   }
    @Override
    public void calculateArea() {
        double area = Math.PI*radius*radius;
        System.out.println("The Area of Circle: "+area);
    }

    @Override
    public void calculatePerimeter() {
        double peri = 2*Math.PI*radius;
        System.out.println("The Perimeter of Circle: "+peri);
    }
}
class Square implements Shape{
    double length;
    Square(double length){
        this.length=length;
    }
    @Override
    public void calculateArea(){
        System.out.println("The Area of Square: "+(length*length));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The Perimeter of Square: "+(4*length));
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape[] obj = {new Circle(5), new Square(6)};
        for(Shape shape:obj){
            System.out.println();

            shape.calculateArea();
            shape.calculatePerimeter();
        }
    }
}

