package homework;

public class PhoneTester {
    public static void main(String[] args) {

        Phone   phone1=new Phone();

        phone1.name=   "iPhone";
        phone1.color=   "black";
        phone1.smartphone=true;

        Phone   phone2=new Phone();

        phone2.name=   "Pixel";
        phone2.color=   "gray";
        phone2.smartphone=true;

        Phone   phone3=new Phone();

        phone3.name=   "Samsung";
        phone3.color=   "White";
        phone3.smartphone=false;

        System.out.println(phone3.name);

        phone3.vibrate();
    }
}
