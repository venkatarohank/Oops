class Sports{
    String type="Sports" ;
    void subtype()
    {
        System.out.println("Sports");
    }
    
    
}

interface  Method // abstraction
{
     void abmethod();
}

class Cricket extends Sports implements Method  //inheritance 
{
      //Encapsulation
        private String name;
        //getter method for name  
        public String getName(){  
        return name;  
        }  
        //setter method for name  
        public void setName(String name){  
        this.name=name; 
        } 
        
         void subtype()
        {
            System.out.println("Cricket"); // method Override (polymorphism)
        }
        void fun()
        {
            System.out.println("111");
        }
        public void abmethod()
        {
            System.out.println("abstract method body");
        }
    
}


public class Main extends Sports
{
	public static void main(String[] args) {
	    
	    Cricket c=new Cricket();
	    c.setName("Crickets");  
	    System.out.println(c.getName());
		c.subtype();
	    c.fun();
	    c.abmethod();
	}
}
