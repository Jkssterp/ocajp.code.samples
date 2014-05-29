class Super {
    Super() {  System.out.println("Parent(Super) Constructor is Called ");
     System.out.println("In Parent Class if we Call the Common Method (printThree()), Then it will call the Child ClassMethod (printThree();) not the Parent Class Method ");
        printThree(); 
       
        }
    void printThree() { 
          System.out.println("printThree(); in Parent class");
        //System.out.println(three);
        }
}

public class Test extends Super {
    int three = (int)Math.PI;  // That is, 3
    int i= 0;
    Test(){
          System.out.println("Child Constructor will be called after Creating a Parent Class(Super)");
          System.out.println("Before Calling a Constructor the Variables in the Class Will be Defined : "+(three));
    }
    
    void printThree() { 
          System.out.println("printThree(); in Child class is Called");
          System.out.printf("The Child Class Variables are not yet defined Only for the %d st Time: because the Child Class is not yet Created %n",i+1);
        System.out.println(three); }
    
    public static void main(String[] args) {
        System.out.println("Call to Main Method");
        System.out.println("Before Creating a Child Obj :: Test t = new Test(); ");
        Test t = new Test();
        System.out.println("After Creating a Obj :: t.printThree();");
        t.printThree();
       // Super s = new Super();
        //s.printThree();
    }
}
