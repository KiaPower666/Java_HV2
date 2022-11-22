import java.util.Scanner;

public class Progress {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Набираем предложение.");

        String title = scanner.nextLine();

        String mes = title;

        System.out.println("Набираем слово которое надо вырезать.");

        String sec = scanner.nextLine();

        String newStr = mes.replaceAll(sec, "");

        System.out.println(mes + "   ---> Предложение которое мы набирали."); // Предложение которое мы набираем.

        System.out.println(sec + "   ---> Слово которое мы вырезали."); // Слово которое надо вырезать.

        System.out.println(newStr + "   ---> Предложение без этого слова."); // Предложение без этого слова.

        System.out.println("============================");

        //------------------------------------------------

        System.out.println("Набираем 6 цифр в двоичной системе счесления.");

        String org = scanner.nextLine();

        System.out.println(Integer.parseInt(org, 2) + " число в десятичное системе");


    }
}