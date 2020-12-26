//WAP to implement queues and double ended queue through single level inheritance.

class queue5{
    int rear,front;
    int queue[];
    int size = 5;
    queue5(){
      rear = -1;
      front = -1;
      queue = new int[size]; }
    void insert_rear(int x){
      if(rear == size-1){
        System.out.println("Queue is full");
        return;}
      if(front==-1) front = 0;
      else{
        queue[++rear] = x;
        System.out.println(x+" is successfully added into queue at rear");
         }}
     void delete_front(){
      if(front == rear+1){
        System.out.println("Queue is empty");
        return;}
      else{
       System.out.println(queue[front]+" is deleted from queue");
       front++;
      } }
     void showq(){
       System.out.println("Queue is :");
     for(int i=front;i<=rear;i++)
        System.out.println(" "+queue[i]); 
    }}
  class Dequeue5 extends queue5{
   void insert_front(int x){
    if(rear==-1) rear=0;
   if(front == size-1){
    System.out.println("Queue is full");
    return;
    }
    else{
    queue[++front]=x;
   System.out.println(x+" is added into dequeue at front");
     }
  } 
    void delete_rear(){
    if(rear == front+1){
    System.out.println("Queue empty");
   }
   else{
     System.out.println(queue[rear]+" is deleted from dequeue at rear");
     rear++;
  }}
  void show(){ 
    super.showq();} 
  public static void main(String[] args){
    queue5 q = new queue5();
    q.insert_rear(1);
    q.insert_rear(2);
    q.insert_rear(3);
    q.showq();
    q.delete_front();
    q.showq();
   Dequeue5 q1 = new Dequeue5();
    q1.insert_front(5);
    q1.insert_front(8);
    q1.delete_rear();
    q1.show();
    }
  }