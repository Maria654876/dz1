public class zd2 {
    public static void main(String[] args) {
        int a=10;
        int b=9;
        int c=18;
        if ((a+b)>c && (a+c)>b && (b+c)>a)
        {
            System.out.println("Треугольник существует");
        }
        else if ((a+b)<=c && (a+c)<=b && (b+c)<=a){
            System.out.println("Треугольник не существует");
        }
    }
}
