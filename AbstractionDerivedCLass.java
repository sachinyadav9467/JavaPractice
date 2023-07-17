public class AbstractionDerivedCLass extends AbstractionImplementation{
    @Override
    public void eat(int quantity) {
        System.out.printf("i am eating %d roti",quantity);
    }
    @Override
    public void sleep(int hr) {
        System.out.printf("i sleep %d hours",hr);
    }
    AbstractionDerivedCLass()
    {
        System.out.println("i am Derived class");
    }
    public static void main(String[] args)
    {
        AbstractionDerivedCLass obj=new AbstractionDerivedCLass();
        obj.eat(5);
        obj.fly();
        obj.sleep(7);
        //AbstractionImplementation obj1=AbstractionImplementation();//error cannot create object for a abstract class

    }
}