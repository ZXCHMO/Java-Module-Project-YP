import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator sum = new Calculator();
        int people;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("На сколько людей разделить счет?");
            if(scanner.hasNextInt()){
                people = scanner.nextInt();
                if(people > 1){
                    break;
                }
                System.out.println("Введено некоректное количество людей!\nПопробуйте ещё раз!");
            }
            else{
                System.out.println("Введено некоректное количество людей!\nПопробуйте ещё раз!");
                scanner.next();
            }
        }
        sum.sum();
        if(sum.i != 0){
            Formatter formatter = new Formatter(0);
            formatter.ruble(sum.sum/people);
            String zxc = String.format("%.2f", (sum.sum/ people));
            System.out.println("Добавленные товары:\n"+sum.list);
            System.out.println("Сумма которую должен заплатить каждый - "+zxc+" "+ formatter.rub+".");
        }
        else {
            System.out.println("Вы не добавили ни одного товара.");


        }
        }
    }