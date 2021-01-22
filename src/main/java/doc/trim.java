package doc;

/**
 * String trim()
 * 去除字符串两边的空白字符
 */
public class trim {
    public static void main(String[] args) {
        //           左三个空格，又三个tab
        String str = "   Hello          ";
        System.out.println(str);
        String trim = str.trim();
        System.out.println(trim);
    }
}
