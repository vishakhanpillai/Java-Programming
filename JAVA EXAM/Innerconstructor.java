class outerClass{
    outerClass(){
        System.out.println("Outerclass");
    }

    class innerClass{

        innerClass(){
            System.out.println("Innerclass");
        }
    }
}



public class Innerconstructor {

    public static void main(String[] args) {
        
        outerClass out = new outerClass();

        outerClass.innerClass in = out.new innerClass();
    }
}