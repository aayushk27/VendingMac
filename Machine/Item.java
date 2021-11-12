package Machine;

public enum Item{
    COKE("Coke", 70, 0), PEPSI("Pepsi", 35, 7), SODA("Soda", 45, 4), LAYS("Lays", 20, 9);
   
    private String name;
    private int price;
    int ItemCount;
   
    private Item(String name, int price, int ItemCount){
        this.name = name;
        this.price = price;
        this.ItemCount = ItemCount;
    }
   
    public String getName(){
        return name;
    }
   
    public int getPrice(){
        return price;
    }

    public int getItemCount(){
        return ItemCount;
    }
}
