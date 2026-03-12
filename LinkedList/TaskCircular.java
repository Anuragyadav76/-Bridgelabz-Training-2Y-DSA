package LinkedList;

class Task {

    int id, priority;
    String name;
    Task next;

    Task(int i,String n,int p){
        id=i;
        name=n;
        priority=p;
    }
}

public class TaskCircular {

    Task head;

    void addTask(int id,String name,int priority){

        Task t=new Task(id,name,priority);

        if(head==null){
            head=t;
            t.next=head;
            return;
        }

        Task temp=head;

        while(temp.next!=head)
            temp=temp.next;

        temp.next=t;
        t.next=head;
    }

    void display(){

        Task temp=head;

        do{
            System.out.println(temp.id+" "+temp.name);
            temp=temp.next;
        }while(temp!=head);
    }

    public static void main(String[] args){

        TaskCircular tc=new TaskCircular();

        tc.addTask(1,"Coding",1);
        tc.addTask(2,"Testing",2);

        tc.display();
    }
}