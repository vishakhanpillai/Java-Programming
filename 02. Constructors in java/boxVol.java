import java.util.Scanner;

class box{
    int l, b, h;
    public box(){
        l = 10;
        b = 20;
        h = 30;
    }
    public void volume(){
        int vol = l * b * h;
        System.out.println("Volumr = " + vol);
    }
}

public class boxVol {
    public static void main(String[] args){
        box b1 = new box();
        b1.volume();
    }
}
