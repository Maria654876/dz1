public class zd5 {
    public static void main(String[] args) {
        int a=-1;
        int b=5;
        int c=-6;
        int pol=0;
        int otr=0;
        if (a>0 )
        {
            pol++;
        }
        else if (a<0 )
        {
            otr++;
        }
        if (b>0 )
        {
            pol++;
        }
        else if (b<0 )
        {
            otr++;
        }
        if (c>0 )
        {
            pol++;
        }
        else if (c<0 )
        {
            otr++;
        }
        System.out.println("Количество положительных элементов "+pol);
        System.out.println("Количество отрицательных элементов "+otr);
    }
}
