 import java.util.Scanner;
public class Buyer {
    private String fname;// інкапсуляція
    private String lname;
    private long number;
    private String email;

    private String adres;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void register(){
        System.out.println("Зареєструйте себе в нашому магазині і отримайте знижку 10%.");
        System.out.print("Ім'я: ");
        Scanner scanner = new Scanner(System.in);
        this.setFname(scanner.nextLine());
        System.out.print("Прізвище: ");
        this.setLname(scanner.nextLine());
        System.out.print("Номер телефону: ");
        this.setLname(scanner.nextLine());

    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

}

class Delivery extends Buyer {//«Застосування наслідування. Робота з вкладеними та внутрішніми класами»

    public String delivery;

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void delivery() {                 //«Створення власних методів з довільною логікою»
        System.out.println("______Введіть ваші особисті дані_____");
        System.out.print("Електронна пошта: ");
        Scanner scanner = new Scanner(System.in);
        this.setEmail(scanner.nextLine());

        System.out.print("Номер телефону: ");
        this.setNumber(scanner.nextLong());

        System.out.print("Адрес: ");
        this.setNumber(scanner.nextLong());

        System.out.print("Виберіть доставку:\n" + "1) Укр пошта\n" + "2) Нова пошта\n" + "3)Самовивіз");
        this.setNumber(scanner.nextLong());
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Ви обралт: Укр пошта");
                delivery = "Укр пошта";
                break;
            case 2:
                System.out.println("Ви обралт: Нова пошта");
                delivery = "Нова пошта";
                break;
            case 3:
                System.out.println("Ви обралт: Самовивіз");
                delivery = "Самовивіз";
                break;
            default:
                delivery = "????";
                break;
        }


    }
}
class ConfirmationOfPurchase extends Delivery {//«Застосування наслідування. Робота з вкладеними та внутрішніми класами»
     public String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     void confirmation(){    //«Створення власних методів з довільною логікою»
         System.out.println("--------------Підтвердіть покупку-------------");
         System.out.println("Компютер: " + name);
         System.out.println("підтвердження: 1)Так 2)Ні");
         Scanner scanner = new Scanner(System.in);
         switch (scanner.nextInt()) {
             case 1:
                 System.out.println("Ви успішно підтвердили покупку");
                 break;
             case 2:
                 System.out.println("Допобачення!!!");
                 break;
             default:
                 System.out.println("папа).");
                 break;
         }

     }

 }


