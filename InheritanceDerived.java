public class InheritanceDerived extends InheritanceBase{
        int x;
        String y;
        InheritanceDerived(int x,String y)
        {
                this.x=x;
                this.y=y;
        }
        InheritanceDerived(int x,String y,String name,int legs,boolean canSwim)
        {
                super(name,legs,canSwim);
                this.x=x;
                this.y=y;
        }
        InheritanceDerived(int x,String y,String name,boolean canSwim)
        {
                super(name,canSwim);
                this.x=x;
                this.y=y;
        }
        InheritanceDerived(int x,String y,String name,int legs)
        {
                super(name,legs);
                this.x=x;
                this.y=y;
        }
        public String toString()
        {
                String a=super.toString();
                return "X is "+x+" Y is "+y+"\n"+a;
        }
        public static void main(String[] args)
        {
                InheritanceDerived obj=new InheritanceDerived(2,"hi","human",2,true);
                InheritanceDerived obj1=new InheritanceDerived(2,"hello","fish",0,true);
                InheritanceDerived obj2=new InheritanceDerived(2,"say hi","elephant",4);
                System.out.println(obj.toString());
                System.out.println(obj1.toString());
                System.out.println(obj2.toString());

        }
}