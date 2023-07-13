import java.util.*;
public class ImpleArrayList {
    public static void main(String[] args)
    {
        System.out.println("hi");
        ArrayList<Integer> arr= new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        for(int i=0;i<len;i++)
            arr.add(scanner.nextInt());
//        for(int i:arr)
//            System.out.print(i+" ");
        System.out.println();
        System.out.print("hello");
    }
}