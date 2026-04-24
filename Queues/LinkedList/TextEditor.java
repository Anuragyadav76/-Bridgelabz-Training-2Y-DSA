package LinkedList;
class State {

    String text;
    State prev,next;

    State(String t){
        text=t;
    }
}

public class TextEditor {

    State current;

    void type(String text){

        State s=new State(text);

        if(current!=null){
            current.next=s;
            s.prev=current;
        }

        current=s;
    }

    void undo(){

        if(current.prev!=null)
            current=current.prev;

        System.out.println("Undo: "+current.text);
    }

    void redo(){

        if(current.next!=null)
            current=current.next;

        System.out.println("Redo: "+current.text);
    }

    public static void main(String[] args){

        TextEditor t=new TextEditor();

        t.type("Hello");
        t.type("Hello World");

        t.undo();
        t.redo();
    }
}/*Z]\
'
]\[bdx] */
