package package_1;

import java.util.Scanner;

public class SampleClassA{
       public class UserDetails{
           public String name;
           long mobileNo;
           long accountNo;
           String address;
           UserDetails()
           {
               Scanner sc=new Scanner(System.in);

               this.accountNo=sc.nextInt();
               this.mobileNo=mobileNo;
               this.name=name;
               this.address=address;
               System.out.println("UserDetails filling .......");
           }
           public void setter(String name,long mobileNo,long accountNo,String address)
           {
               this.accountNo=accountNo;
               this.mobileNo=mobileNo;
               this.name=name;
               this.address=address;
           }


       }
       public class BankInfo{
              String ifsc;
              String branchName;
              BankInfo(String ifsc,String branchName) {
                  this.ifsc = ifsc;
                  this.branchName = branchName;
              }

       }
}