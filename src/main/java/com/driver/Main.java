



public class Main{

  public static void main(String[] args){
    
    B obj  = new B();
    System.out.print(obj.meth());
    
  }
}
  
  

class A {
  public String meth(){
    
    return "Invoking method from class A";
  }
}


class B  extends A{
  
  public String meth(){
    
    return "Method is overridden in Extended class B";
  }
}

