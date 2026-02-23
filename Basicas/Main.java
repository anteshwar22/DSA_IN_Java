public class Main {
    static class LL
    {
       Node head;
       Node tail;
       int size;
                  LL()
                  {
                    this.size=0;
                  }

                  public void insertFirst(int val)
                  {
                      Node node = new Node(val);
                      node.next=head;
                      head=node;
                      
                          if(tail==null)
                          {
                              tail=head;
                          }
                          size++;
                  }
                  public int deleteFirst(){   
                        int cval= head.val;
                          head=head.next;
                          size--;
                         return cval;
                  }

                  public void display(){

                    Node temp=head;
                      while(temp!=null)
                      {
                      System.out.print(temp.val+"->");
                        temp=temp.next;
                      }
                      System.out.print("END ");
                      System.out.println();
                  }
                  public int deleteLast(){
                     Node secondLast= getNode(size-2);
                     int cval=tail.val;
                     secondLast.next=null;
                     tail=secondLast;
                     size--;
                     return cval;
                  }
                  public Node getNode(int idx)
                  {  
                     Node temp=head;
                    for(int i=0;i<idx;i++)
                    {
                      temp=temp.next;
                    }
                     return temp;
                  }
                  public int deleteIndex(int idx)
                  {
                    Node prev=getNode(idx-1);
                    int val=prev.next.val;
                    prev.next=prev.next.next;
                    size--;
                    return val;
                  }
    }



                  static class Node {
                      int val ;
                      Node next;
                              Node(int val)
                              {
                                this.val=val;
                              }
                              Node(int val,Node next)
                              {
                                  this.val=val;
                                  this.next=next;

                              }
                  }
    public static void main(String[] args) {
         
            LL list = new LL();
            list.insertFirst(2);
            list.insertFirst(4);
            
            list.insertFirst(6);
            list.insertFirst(8);
            list.insertFirst(10);
            list.display();
            System.out.println(list.deleteFirst());
            list.display();

           System.out.println( list.deleteLast());
           list.display();

           
           System.out.println("index  "+list.deleteIndex(2));
           list.display();


    }
}