abstract class shape {
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends shape{
    double length;
    double breadth;
    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}
class ScAbstract1{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        Circle c=new Circle();
        c.radius=3;
        System.out.println(c.perimeter());
        System.out.println(c.area());
        shape s=r;
        System.out.println(s.area());
    }

}
