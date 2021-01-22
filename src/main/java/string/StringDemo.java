package string;

/**
 * 字符串常量池JVM在堆内存中专门为了字符串提供一段空间
 * 用于缓存所有使用字面量形式创建的字符串对象，当再次使用相同字面量
 * 创建字符串时会直接重用常量池中的对象而不会再次创建新对象减少内存开销
 *
 */
public class StringDemo {
    //ctrl + shift +f10运行
    public static void main(String[] args) {
        String s1 = "123abc";
        System.out.println("s1:"+s1);
        //s2字面量与s1相同，因此宠用了上面s1创建的字符串对象
        String s2 = "123abc";
        System.out.println("s2"+s2);
        System.out.println(s1 == s2);//若为true，说明保存的地址一样，使用的同一个对象

        String s3 = new String("123abc");
        System.out.println("s3:"+s3);
        System.out.println(s1 == s3);//false,new很强制一定创建新对象
        System.out.println(s2.equals(s3));//true 比较的是字符串对象中内容是否相同
        s1 = s1+"!";//由于字符串是不改变对象，修改内容就会创建新对象
        System.out.println("s1:"+s1);//s1发生改变
        System.out.println("s2:"+s2);//s2并没有改变
        System.out.println(s1 == s2);//false,比较的是地址
        /*编译器有一个特性：
        当编译器在编译一段代码时发现一个计算器表达式可以在编译期间内确定结果时
        就会进行计算，并将下面的代码改为 String s4 = "123abc";
         */
        String s4 = "123" + "abc";
        System.out.println(s2 == s4);//true

        String s5 = "123",s6 = "abc";
        System.out.println(s1==(s5+s6));//false
    }
}
