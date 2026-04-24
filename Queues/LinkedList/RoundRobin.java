package LinkedList;

class Process {

    int id, burst;
    Process next;

    Process(int i,int b){
        id=i;
        burst=b;
    }
}

public class RoundRobin {

    Process head;

    void addProcess(int id,int burst){

        Process p=new Process(id,burst);

        if(head==null){
            head=p;
            p.next=head;
            return;
        }

        Process temp=head;

        while(temp.next!=head)
            temp=temp.next;

        temp.next=p;
        p.next=head;
    }

    void schedule(int quantum){

        Process temp=head;

        do{

            if(temp.burst>quantum){
                temp.burst-=quantum;
                System.out.println("Process "+temp.id+" executing");
            }
            else{
                System.out.println("Process "+temp.id+" finished");
                temp.burst=0;
            }

            temp=temp.next;

        }while(temp!=head);
    }

    public static void main(String[] args){

        RoundRobin rr=new RoundRobin();

        rr.addProcess(1,10);
        rr.addProcess(2,6);

        rr.schedule(3);
    }
}
