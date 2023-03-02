package Feb24;

public class CarsDetails {
	int id;
	String name;
	float price;
	String coloure;

	public static void main(String[] args) {
		
		CarsDetails d=new CarsDetails();
		
		int id=1002;
		String name="Rolls Royel";
		float price =700000;
		String coloure="Gray";
		System.out.println(id+" "+name+" "+price+" "+coloure);
	}

}
