import java.util.*;
class sample{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int size =obj.nextInt();
        int[] arr =new int[size];
        int key=obj.nextInt();
        int i;
        for(i=0;i<size;i+=1)
            arr[i] = obj.nextInt();
        for(i=0;i<size;i++)
        {
            if(arr[i]==key)
                break;
        }
        if(i<size)
            System.out.print("found");
        else
            System.out.print("Not");
    }
}
