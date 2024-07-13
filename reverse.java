public class Linkedlist{
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
    Linkedlist(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);
         
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
        }
    }
     public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        //Node next = current.next;
        while (current != null){
            Node next = current.next ;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist list = new Linkedlist();
        
        int m = sc.nextInt();
        for(int i =0 ; i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        list.reverse();
        list.display();
    }
}
