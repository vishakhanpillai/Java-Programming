public class strings {
    public static void main(String[] args) {
        
        String str = " This is a string ";


        System.out.println("Length is: " + str.length());
        System.out.println("UPPERCASE: " + str.toUpperCase());
        System.out.println("lowercase: " + str.toLowerCase()) ;
        System.out.println("Equal: " + str.equalsIgnoreCase("this is a string"));
        System.out.println("Equal: " + str.equals("this is a string"));

        
        System.out.println("After replacing: " + str.replace("i", "o"));
        System.out.println("Trim: " + str.trim());
        System.out.println("Index of a: " + str.indexOf("a"));



    }
}
