package LinkedList;

class Book {

    int id;
    String title, author;
    boolean available;

    Book prev,next;

    Book(int i,String t,String a){
        id=i;
        title=t;
        author=a;
        available=true;
    }
}

public class Library {

    Book head;

    void addBook(int id,String title,String author){

        Book b=new Book(id,title,author);

        b.next=head;

        if(head!=null)
            head.prev=b;

        head=b;
    }

    void display(){

        Book temp=head;

        while(temp!=null){

            System.out.println(temp.title+" "+temp.author+" "+temp.available);

            temp=temp.next;
        }
    }

    public static void main(String[] args){

        Library l=new Library();

        l.addBook(1,"Java","James Gosling");
        l.addBook(2,"DSA","Mark Allen");

        l.display();
    }
}