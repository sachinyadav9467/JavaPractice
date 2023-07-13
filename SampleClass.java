public class SampleClass{
       int experience;
       String companyName;
       Constructor obj;
       SampleClass(int experience,String companyName,Constructor obj)
       {
           this.companyName=companyName;
           this.experience=experience;
           this.obj=obj;
       }
       SampleClass()
       {
           this.companyName="Hello";
           this.experience=0;
           this.obj=null;
       }
    public String toString(){
        return "experience "+experience+"companyname : "+companyName+obj.toString();
    }
}