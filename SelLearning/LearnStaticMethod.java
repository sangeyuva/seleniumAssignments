package SelLearning;

 class LearnStaticMethod { 
    int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
    }  
    //constructor to initialize the variable  
    LearnStaticMethod(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college);
    }  
    

//Test class to create and display the values of object  
  
   public static void main(String args[]){  
	   //calling change method  
   //creating objects  
	   LearnStaticMethod s1 = new LearnStaticMethod(111,"Karan");  
	   
	   LearnStaticMethod s2 = new LearnStaticMethod(222,"Aryan");  
	   
	   LearnStaticMethod s3 = new LearnStaticMethod(333,"Sonoo");  
   //calling display method  
   s1.display();  
   change();
   s2.display();  
   s3.display();  
   }  

}
 
 
