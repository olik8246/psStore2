import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ps valakas = new Ps("R5 5600X","1Tb","RTX3060 12gb ","500Gb","asus","16GB","600w",36000);//«Створення власних класів. Застосування конструкторів»
        Ps vortex = new Ps("i5-10400F","1Tb","GTX 1050 6Gb ","240Gb","asus","16GB","600w",21000);
        Ps huananzhi = new Ps("Xeon E5 2658","500Gb","RX 480 8Gb ","256Gb","asus","16GB","600w",11000);
        Buyer buyer = new Buyer();
        Delivery delivery = new Delivery();
        ConfirmationOfPurchase confirm = new ConfirmationOfPurchase();

        buyer.register();
        System.out.println("Ви зайшли в магазин в наявності є такі компютери:");
        System.out.println("1)Valakas\n" + "Процессор - " + valakas.processor + " Відеокарта - " + valakas.videoCard + " Oперативна пям'ять - " + valakas.ram +"\n"+ "Ціна - " + valakas.prise);
        System.out.println("2)Vortex\n" + "Процессор - " + vortex.processor + " Відеокарта - " + vortex.videoCard + " Oперативна пям'ять - " + vortex.ram +"\n"+ "Ціна - " + vortex.prise);
        System.out.println("3)Huananzhi\n" + "Процессор - " + huananzhi.processor + " Відеокарта - " + huananzhi.videoCard + " Oперативна пям'ять - " + huananzhi.ram +"\n"+ "Ціна - " + huananzhi.prise);
        System.out.println("Можете вибрати компютер ♥");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Ви вибрали Valakas");
                valakas.discount();
                confirm.setName("Valakas");// перевизначений метод
                break;
            case 2:
                System.out.println("Ви вибрали Vortex");
                vortex.discount();
                confirm.setName("Vortex");// перевизначений метод
                break;
            case 3:
                System.out.println("Ви вибрали Huananzhi");
                huananzhi.discount();;
                confirm.setName("Huananzhi");// перевизначений метод
                break;
            default:
                System.out.println("папа).");
                break;
        }
        System.out.println("Доставка:");
        delivery.delivery();

    }
}
