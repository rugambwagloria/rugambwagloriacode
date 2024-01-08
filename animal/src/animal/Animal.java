package animal;

 public class Animal {
	 String name,colour;
	 int number_of_legs;
	 
	 int number_of_ears;
	 

	public static void main(String[] args) {
		Animal d = new Animal ();
				//d is for dog
				d.name ="dog";
				d.colour ="brown";
				d.number_of_legs = 4;
				
				d.number_of_ears=2;
				
	System.out.println("Name:" +d.name);
	System.out.println("Colour:"+d.colour);
	System.out.println("Number_of_legs:" +d.number_of_legs+ "Number_of_ears:" +d.number_of_ears);
				
		  Animal c = new Animal();
		  //c is for cat
		  c.name = "cat";
		  c.colour ="black";
		  c.number_of_legs = 4;
		  c.number_of_ears =2;
		  
   System.out.println("Name:" +c.name);
   System.out.println("Colour:"+c.colour);
   System.out.println("Number_of_legs:" +c.number_of_legs+ "Number_of_ears:" + c.number_of_ears);
   
   
   Animal p =new Animal();
   //p is for person
   p.name = "person";
	  p.colour ="black";
	  p.number_of_legs = 2;
	  p.number_of_ears =2;
	  
	  
	  System.out.println("Name:" +p.name);
	   System.out.println("Colour:"+p.colour);
	   System.out.println("Number_of_legs:" +p.number_of_legs+ "Number_of_ears:" +p.number_of_ears);
	  
	  
	  
   
				


	}

}
