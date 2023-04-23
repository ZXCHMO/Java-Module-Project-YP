import java.util.Scanner;
public class Calculator {
    double sum = 0;
    String list = "";
    int i = 0;

    void sum(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название товара или напишите слово \"Завершить\" чтобы закончить работу программы.");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("завершить")) {
                scanner.close();
                break;
            }
            while(true){
                System.out.println("Введите стоимость " + name + ".");
                if (scanner.hasNextDouble()){
                    double price = scanner.nextDouble();
                    if(price>0){
                        Formatter formatter = new Formatter(price);
                        formatter.ruble(price);
                        i += 1;
                        sum = sum + price;
                        String price2 = String.format("%.2f", price);
                        list = list + i + ". "+ name + " - " +  price2 +" "+ formatter.rub +".\n";
                        break;
                    }
                    System.out.println("Введена неправльная цена товара!");

                }
                else {
                    System.out.println("Введена неправльная цена товара!");
                    scanner.next();
                }
            }

        }


    }
}