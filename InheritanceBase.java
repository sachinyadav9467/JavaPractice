public class InheritanceBase{
    static int count=0;
    String name;
    int legs=0;
    boolean canSwim=false;
    InheritanceBase(String name,int leg,boolean canSwim)
    {
        this.name=name;
        this.legs=leg;
        this.canSwim=canSwim;
        count++;
    }
    InheritanceBase(String name,int leg)
    {
        this.name=name;
        this.legs=leg;
        count++;
    }
    InheritanceBase(String name,boolean canSwim)
    {
        this.name=name;
        this.canSwim=canSwim;
        count++;
    }
    InheritanceBase()
    {

    }
    public String toString()
    {
        return " Name :"+name+"\nLegs :"+legs+"\ncanSwim "+(canSwim?"Yes\n":"NO\n");
    }
}