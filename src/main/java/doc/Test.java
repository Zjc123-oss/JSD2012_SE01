package doc;

public class Test {
    public static void main(String[] args) {
        String s1 = getHostName("www.tedu.cn");
        String s2 = getHostName("http.teadiii.cn");
        String s3 = getHostName("doc.canglaoshitead.com.cn");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);

    }
    public static String getHostName(String address){

        int start = address.indexOf(".")+1;//查找第一个"."的位置
        int end = address.indexOf(".",start);//查找第二个"."的位置
        return address.substring(start,end);//截取两个点之间的内容
    }
}
