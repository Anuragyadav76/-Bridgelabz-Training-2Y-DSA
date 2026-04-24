package LinkedList;

class User {

    int id;
    String name;
    User next;

    User(int i,String n){
        id=i;
        name=n;
    }
}

public class SocialMedia {

    User head;

    void addUser(int id,String name){

        User u=new User(id,name);

        u.next=head;
        head=u;
    }

    void display(){

        User temp=head;

        while(temp!=null){
            System.out.println(temp.id+" "+temp.name);
            temp=temp.next;
        }
    }

    public static void main(String[] args){

        SocialMedia sm=new SocialMedia();

        sm.addUser(1,"Anurag");
        sm.addUser(2,"Rahul");

        sm.display();
    }
}
