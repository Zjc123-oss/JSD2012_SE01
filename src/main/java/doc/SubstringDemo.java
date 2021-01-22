package doc;

/**
 * String substring(int start,int end)
 * 截取指定范围内的字符串。两个参数分别是范围对应下标
 * 注：在Java 中API通常使用两个数字表示下标表示范围是含头不含尾的
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //             01234567890
        String host = "www.tedu.cn";
        String sub = host.substring(4,8);
        System.out.println(sub);//tedu.cn
        //重载从指定位置向后全截
        sub = host.substring(4);
        System.out.println(sub);//tedu.cn
    }
}
