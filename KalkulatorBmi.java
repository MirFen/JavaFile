package src;


public class KalkulatorBmi {
    public static void main(String[] args)
     {
        int haeightCm = 180;
        int weightKg = 90 ;
float haeightM = haeightCm * 10E-3f ;

        String wysokosc = "Wysokość ";
        System.out.println(wysokosc+haeightM);
// float up = haeightM*haeightM ;
        System.out.println("BMI = " +weightKg/(haeightM*haeightM));

        float hight=1.8f;
        float weight=90f;
// float dh=hight*hight;
        System.out.println("BMI2 = "+weight/(hight*hight));

    }
}
