package Encapsulation;

public class CarDetails {

	public static void main(String[] args) {
		
		GetterSetter g=new GetterSetter();

		g.setId(1004);
		g.setName("Rolls Royel");
		g.setPrice(700000f);
		g.setColour("Red");
		
		System.out.println(g.setId()+" "+g.setName()+" "+g.setPrice()+" "+g.setColour());
	}

}
