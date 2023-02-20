class Sports{
    String type="Sports" ;
    void subtype()
    {
        System.out.println("Sports");
    }
    
    
}

interface  Score // abstraction
{
     void score();
}

class Cricket extends Sports implements Score  //inheritance 
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
        public void score()
        {
            System.out.println("score");
        }
        
        public void score(int sc) //method Overloading (polymorphism)     
        {
            System.out.println("score = "+sc);
        }
        
}


public class Main extends Sports
{
	public static void main(String[] args) {
	    
	    Cricket c=new Cricket();
	    c.setName("player");  
	    System.out.println(c.getName());
		c.subtype();
	    c.score();
	    c.score(5);
	    
	}
}
