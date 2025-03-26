class oddThread extends Thread{
    int a, b;
    oddThread(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        for(int i = a; i<= b; i++){
            if( i % 2 != 0){
                System.out.println("Odd: " + i);
            }
        }
    }
}

class evenThread extends Thread{
    int a, b;
    evenThread(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        for(int i = a; i<= b; i++){
            if( i % 2 == 0){
                System.out.println("Even: " + i);
            }
        }
    }
}

public class thread{
    public static void main(String[] args) {
        
        int a = 1, b = 100;
        oddThread odd  = new oddThread(a, b);
        evenThread even = new evenThread(a, b);

        odd.start();
        even.start();

    }
}

