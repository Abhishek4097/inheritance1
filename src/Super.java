public class Super {
    public void display(){
        System.out.println("Super class display");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub class display");
    }
}
class Overriding{
    public static void main(String[] args) {
        Super sup=new Super();
        sup.display();
        Sub s=new Sub();
        s.display();

    }
}
