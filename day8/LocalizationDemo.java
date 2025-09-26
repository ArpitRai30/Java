package day8;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationDemo {
    private static void showMessages(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);

        System.out.println("Locale: " + locale);
        System.out.println("greeting    : " + bundle.getString("greeting"));
        System.out.println("ask.name    : " + bundle.getString("ask.name"));
        System.out.println("farewell    : " + bundle.getString("farewell"));
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        
        // for single locale
        Locale frenchLocale = new Locale("fr");
        showMessages(frenchLocale);

        // for multiple locale
        Locale hindiLocale = new Locale("hi", "IN");
        showMessages(hindiLocale);

        Locale enLocale = new Locale("");
        showMessages(enLocale);
    }
}
