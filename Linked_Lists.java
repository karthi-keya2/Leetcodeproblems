class Linked_Lists{
    Node head;
    Node tail;

    int size;
    public Linked_Lists(){
        this.size=0;
    }

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }


    public static void main(String[] args){
        Linked_Lists list=new Linked_Lists();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
    }

    
}
