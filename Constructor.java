public class Constructor{
    int age=20;
    String name="Sachin";
    long salary;
    public static void main(String[] args)
    {
        Constructor obj=new Constructor(100);
        SampleClass obj1=new SampleClass(2,"Jivox",obj);
        System.out.println(obj1);
    }
    Constructor(long salary){
        this.salary=salary;
    }
    public String toString(){
        return " age "+age+"name : "+name+"salary"+salary;
    }
}