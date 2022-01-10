interface Member{
    public void callBack();
}
class store {
    Member member[]=new Member[10];
    int count=0;
     store(){

    }
    void register(Member m){
         member[count++]=m;
    }
    void inviteSale(){
         for (int i=0;i<count;i++)
             member[i].callBack();
    }
}
 class Customer implements Member{
    String name;
    Customer(String n){
        name=n;
    }
    public void callback(){
        System.out.println("Ok I will visit"+name);
    }

     @Override
     public void callBack() {

     }
 }
class ScInterface1{
    public static void main(String[] args) {
        store s=new store();
        Customer c1= new Customer("john");
        Customer c2=new Customer("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
