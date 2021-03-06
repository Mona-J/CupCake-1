package FunctionLayer;

import java.util.ArrayList;
import java.util.HashMap;

public class Order {
    private int id;
    private int sum;
    private HashMap<Cupcake, Integer> products;



    public Order() {
        this.id = id;
        this.sum = sum;
        this.products = new HashMap<>();
    }

    public void addCupcake (Cupcake cupcake, int quantity){
               if (products.containsKey(cupcake)){
            products.replace(cupcake, products.get(cupcake)+quantity);
        }else {products.put(cupcake, quantity);}
    }

    @Override
    public String toString() {
String cupcakes="";
        for (Cupcake c: products.keySet()) {
            String tmp = cupcakes;
            cupcakes= tmp + "\n" + c.getBottom() + "-"+c.getTopping()+ "-"+products.get(c);

        }
        return "Order: "  + cupcakes    ;
    }

    public void removeAll(){ //removes all Cupcakes from product
         products.clear();
    }

    public  int sum(){
        int priceSum=0;
        for (Cupcake cupcake : products.keySet()) {
            int tmp=priceSum;
            priceSum=tmp+(cupcake.getPrice()*products.get(cupcake)); //price of one cupcake multiplied by quantity
        }
        return priceSum;

    }

    public HashMap<Cupcake, Integer> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int items() {
        int itemsNumber=0;
        for (Cupcake cupcake: products.keySet()) {
            int tmp = itemsNumber;
            itemsNumber = tmp+products.get(cupcake);
        }
        return itemsNumber;
    }


}
