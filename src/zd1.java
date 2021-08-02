public class zd1 {
    public static void main(String[] args) {
        int a =234;
        if (a>=1 && a<=9){
            System.out.println("Число положительное однозначное ");
        }
        else if (a>=10 && a<=99){
            System.out.println("Число положительное двухзначное");
        }
        else if (a>=100 && a<=999){
            System.out.println("Число положительное трезначное");
        }
        else if (a>=1000 && a<=9999)
        {
            System.out.println("Число положительное четырехзначное");
        }
        if (a>=-1 && a<=-9){
            System.out.println("Число отрицательное однозначное ");
        }
        else if (a>=-10 && a<=-99){
            System.out.println("Число отрицательное двухзначное");
        }
        else if (a>=-100 && a<=-999){
            System.out.println("Число отрицательное трезначное");
        }
        else if (a>=-1000 && a<=-9999)
        {
            System.out.println("Число отрицательное четырехзначное");
        }
    }
}
