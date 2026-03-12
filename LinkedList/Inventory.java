package LinkedList;

class Item {

    int id, quantity;
    String name;
    double price;
    Item next;

    Item(int i,String n,int q,double p){
        id=i;
        name=n;
        quantity=q;
        price=p;
    }
}

public class Inventory {

    Item head;

    void addItem(int id,String name,int qty,double price){

        Item i=new Item(id,name,qty,price);

        i.next=head;
        head=i;
    }

    void totalValue(){

        double total=0;

        Item temp=head;

        while(temp!=null){

            total+=temp.price*temp.quantity;

            temp=temp.next;
        }

        System.out.println("Total Inventory Value = "+total);
    }

    public static void main(String[] args){

        Inventory inv=new Inventory();

        inv.addItem(1,"Laptop",5,50000);
        inv.addItem(2,"Mouse",10,500);

        inv.totalValue();
    }
}
