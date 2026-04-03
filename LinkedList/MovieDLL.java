package LinkedList;
class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev, next;

    Movie(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

public class MovieDLL {

    Movie head, tail;

    void addMovie(String t, String d, int y, double r) {

        Movie m = new Movie(t,d,y,r);

        if(head==null){
            head=tail=m;
            return;
        }

        tail.next=m;
        m.prev=tail;
        tail=m;
    }

    void displayForward(){

        Movie temp=head;

        while(temp!=null){
            System.out.println(temp.title+" "+temp.rating);
            temp=temp.next;
        }
    }

    void displayReverse(){

        Movie temp=tail;

        while(temp!=null){
            System.out.println(temp.title+" "+temp.rating);
            temp=temp.prev;
        }
    }

    public static void main(String[] args){

        MovieDLL list=new MovieDLL();

        list.addMovie("Inception","Nolan",2010,9);
        list.addMovie("Avatar","Cameron",2009,8.5);

        list.displayForward();

        System.out.println("Reverse");

        list.displayReverse();
    }
}