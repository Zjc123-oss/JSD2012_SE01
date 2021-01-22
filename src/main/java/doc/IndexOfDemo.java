package doc;
/**
 *
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";
        int index = str.indexOf("in");//检测str中第一次出现in的位置,如果没有字符串显示-1
        System.out.println(index);

        //重载的indexOf方法可以从指定位置开始检测第一次出现指定字符串的位置
        index = str.indexOf("in",2);//从下标2开始找
        System.out.println(index);//2
        index = str.indexOf("in",3);//从3开始...
        System.out.println(index);//5

        //检索最后一次出现给定字符串的位置
        index = str.lastIndexOf("in");
        System.out.println(index);//9
    }
}
