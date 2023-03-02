package Oops;

public class ProductClass {
      String name;
      int quantity;
      float price;
      

	public void acceptdetails(String sname,int squantity,float sprice) {
		name=sname;
		quantity=squantity;
		price=sprice;
	
		
		
	}
	public void display() {
		System.out.println(name+" "+quantity+" "+price);
		
	}
	public static void main(String[] args) {
		
         
		
		ProductClass p = new ProductClass();
		p.acceptdetails("samsung mobile",01, 15500);
		p.display();
		
	}

}
