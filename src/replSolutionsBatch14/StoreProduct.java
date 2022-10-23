package repl144;

public class StoreProduct {
    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock){
        this(lable,price);
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String lable, double price, int stock){
        this(lable,price);
        this.stock=stock;
        this.category="misc";
        this.hasExpiration=false;
    }
    StoreProduct(String lable, double price){
        this.lable=lable;
        this.price=price;
        this.stock=0;
    }
    public void display(){
        System.out.print(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock+"\n");
    }
}
