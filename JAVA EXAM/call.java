public class call {

    static void addTen(int[] num){
        
        for(int i = 0; i <10; i++){
            num[i] = i + 1;
        }
        
    }
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        addTen(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        
    }
}