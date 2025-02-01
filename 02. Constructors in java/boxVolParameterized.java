class box{
    int l, b, h;

    box(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    int volume(){
        int vol = l * b * h;
        return vol;
    }
}
public class boxVolParameterized {
    public static void main(String[] args) {
        
        box b1 = new box(10, 20, 30);
        box b2 = new box(5, 15, 25);

        System.out.println("Volume 1 is: " + b1.volume());
        System.out.println("Volume 2 is: " + b2.volume());
    }
}
