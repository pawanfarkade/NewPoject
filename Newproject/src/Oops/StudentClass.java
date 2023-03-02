package Oops;

public class StudentClass {
int id;
String name;
float marks;

public void acceptdetails(int sid,String sname) 
   { id=sid;
     name=sname;
    } 
	
  public void percentage(float a,float b,float c) 
{     marks=((a+b+c)/300*100);
	}
  public void display() 
  {
	  System.out.println(id+" "+name+" "+marks);
  }

	public static void main(String[] args) {
		
		StudentClass s= new StudentClass();
		s.acceptdetails(41,"Rahul");
		s.percentage(81, 79, 69);
		s.display();
		

	}

}
