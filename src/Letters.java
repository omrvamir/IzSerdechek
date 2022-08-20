public class Letters {
    public static String r = new String(Character.toChars(0x2764)); // r = red
    public static String y = new String(Character.toChars(0x1F49B)); // y = yellow
    public static String b = new String(Character.toChars(0x1F5A4)); // b = black

    public static void info(String customer, String link, String text) {
        System.out.println();
        System.out.println("Заказал: [" + link + "|" + customer + "]");
        System.out.println("Текст: " + text);
        System.out.println("Рамка: " + b);
        System.out.println("Фон: " + y);
        System.out.println("Символы: " + r);
        System.out.println("Подпишись на наш TikTok: izserdechek");
        System.out.println();
    }

    public static void border() {    // граница
        System.out.println(b + b + b + b + b + b + b + b + b + b + b + b + b);
        System.out.println(b + b + b + b + b + b + b + b + b + b + b + b + b);
    }

    public static void space() {    // пробел
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void a() {    // а
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void b() {    // б
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void v() {    // в
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void g() {    // г
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void d() {    // д
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + r + r + r + r + r + r + r + y + b + b);
        System.out.println(b + b + y + r + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void e() {    // е
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void yo() {    // ё
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + y + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void zh() {    // ж
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + r + y + y + y + r + y + y + y + r + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + y + r + y + r + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + r + y + r + y + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + r + y + y + y + r + y + y + y + r + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void z() {    // з
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void i() {    // и
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + r + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void j() {    // й
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + r + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void k() {    // к
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void l() {    // л
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + r + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void m() {    // м
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + y + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + r + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void n() {    // н
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void o() {    // о
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void p() {    // п
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void r() {    // р
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void s() {    // с
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void t() {    // т
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + r + r + r + r + r + r + r + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void u() {    // у
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void f() {    // ф
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + r + r + r + r + r + r + r + y + b + b);
        System.out.println(b + b + r + y + y + y + r + y + y + y + r + b + b);
        System.out.println(b + b + r + y + y + y + r + y + y + y + r + b + b);
        System.out.println(b + b + r + y + y + y + r + y + y + y + r + b + b);
        System.out.println(b + b + y + r + r + r + r + r + r + r + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void kh() {    // х
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + r + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + y + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + y + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + r + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void ts() {    // ц
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + r + r + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void ch() {    // ч
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void sh() {    // ш
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + r + r + r + r + r + r + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void shc() {    // щ
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + r + r + r + r + r + r + r + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + r + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void hard() {    // ъ
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + r + r + r + y + y + y + y  + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void y() {    // ы
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + r + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + r + r + r + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + y + r + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + y + r + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + y + r + y + r + y + b + b);
        System.out.println(b + b + y + r + r + r + r + y + y + r + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void soft() {    // ь
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void ey() { // э
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + y + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void yu() {    // ю
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + r + y + y + r + r + r + y + y + b + b);
        System.out.println(b + b + y + r + y + r + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + r + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + r + r + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + r + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + r + y + y + y + r + y + b + b);
        System.out.println(b + b + y + r + y + y + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

    public static void ya() {    // я
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + r + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + r + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + r + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + r + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + r + y + y + y + r + y + y + b + b);
        System.out.println(b + b + y + y + y + y + y + y + y + y + y + b + b);
    }

}
