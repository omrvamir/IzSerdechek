import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text;
        System.out.print("По заказу (да / нет)? ");
        while (true) {
            String answer = input.nextLine();
            if (answer.equals("Да") || answer.equals("да")) {
                System.out.print("Заказал: ");    // запрос имя заказчика
                String customer = input.nextLine();    // ввод имени заказчика
                System.out.print("Ссылка: ");    // запрос ссылка заказчика
                String link = input.nextLine();    // ввод ссылки заказчика
                System.out.print("Текст: ");    // запрос заказанный текст
                text = input.nextLine();    // ввод заказанного текста
                Letters.info(customer, link, text);
                break;
            } else if (answer.equals("Нет") || answer.equals("нет")) {
                System.out.print("Текст: ");    // запрос заказанный текст
                text = input.nextLine();    // ввод заказанного текста
                System.out.println();
                break;
            } else {
                System.out.print("Не понял ответа, введи заново (да / нет): ");
            }
        }
        text = text.toLowerCase();

        input.close(); // закрытие сканнера

        Letters.border();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case ' ':
                    Letters.space();
                    break;
                case 'а':
                    Letters.a();
                    break;
                case 'б':
                    Letters.b();
                    break;
                case 'в':
                    Letters.v();
                    break;
                case 'г':
                    Letters.g();
                    break;
                case 'д':
                    Letters.d();
                    break;
                case 'е':
                    Letters.e();
                    break;
                case 'ё':
                    Letters.yo();
                    break;
                case 'ж':
                    Letters.zh();
                    break;
                case 'з':
                    Letters.z();
                    break;
                case 'и':
                    Letters.i();
                    break;
                case 'й':
                    Letters.j();
                    break;
                case 'к':
                    Letters.k();
                    break;
                case 'л':
                    Letters.l();
                    break;
                case 'м':
                    Letters.m();
                    break;
                case 'н':
                    Letters.n();
                    break;
                case 'о':
                    Letters.o();
                    break;
                case 'п':
                    Letters.p();
                    break;
                case 'р':
                    Letters.r();
                    break;
                case 'с':
                    Letters.s();
                    break;
                case 'т':
                    Letters.t();
                    break;
                case 'у':
                    Letters.u();
                    break;
                case 'ф':
                    Letters.f();
                    break;
                case 'х':
                    Letters.kh();
                    break;
                case 'ц':
                    Letters.ts();
                    break;
                case 'ч':
                    Letters.ch();
                    break;
                case 'ш':
                    Letters.sh();
                    break;
                case 'щ':
                    Letters.shc();
                    break;
                case 'ъ':
                    Letters.hard();
                    break;
                case 'ы':
                    Letters.y();
                    break;
                case 'ь':
                    Letters.soft();
                    break;
                case 'э':
                    Letters.ey();
                    break;
                case 'ю':
                    Letters.yu();
                    break;
                case 'я':
                    Letters.ya();
                    break;
            }
        }
        Letters.border();
    }
}