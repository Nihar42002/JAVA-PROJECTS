package E_commerce_raw_code.model1;
public class Electronics extends product {
public int warranty;
public Electronics(int id, String name, double price, int stock, int warranty)
{
super(id, name, price, stock);
this.warranty = warranty;
}
}
