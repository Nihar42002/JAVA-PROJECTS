class Bill{

void generateBill(int itemTotal[]){
    int price = 0;
for(int i=0; i<itemTotal.length; i++){
    price = itemTotal[i]+price;
    System.out.println("Item "+(i+1)+" price: "+itemTotal[i]);
   }
    System.out.println("Total Bill Amount: " + price); 
   }

void generateBill(int itemTotal[], int discount){
    int price = 0;
  for(int i=0; i<itemTotal.length; i++){
    price = itemTotal[i]+price;
    System.out.println("Item "+(i+1)+" price: "+itemTotal[i]);
   }
       price = price - discount;
        System.out.println("Total Bill Amount after "+discount+"  discount: " + price);     
}

void generateBill(int itemTotal[], double discountpercent){
    int price = 0;
  for(int i=0; i<itemTotal.length; i++){
    price = itemTotal[i]+price;
    System.out.println("Item "+(i+1)+" price: "+itemTotal[i]);
   }
   price = price - (int)(price * (discountpercent / 100));
    System.out.println("Total Bill Amount after " + discountpercent + "% discount: " + price);

    }
}

public class BillDiscount {
    public static void main(String[] args){
        Bill bill = new Bill();
        int items1[] = {100, 200, 300};
        int items2[] = {150, 250, 350};
        int items3[] = {120, 220, 320};

        System.out.println("Bill without discount:");
        bill.generateBill(items1);

        System.out.println("\nBill with fixed discount:");
        bill.generateBill(items2, 50);

        System.out.println("\nBill with percentage discount:");
        bill.generateBill(items3, 10.0);
    }
}
