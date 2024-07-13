import java.util.*;
public class Main{
    Node head;

    class Node{
        int data;
        Node next;
        //Node head;

        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Main(){
        head = null;
    }
    public void position(int pos,int k)
    {
        Node newnode = new Node(k);
        Node temp = head;

        for(int i=1;i<pos;i++)
        {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Main list = new Main();

        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        int pos=sc.nextInt();
        int k=sc.nextInt();
        list.position(pos,k);
        list.display();
    }
}
