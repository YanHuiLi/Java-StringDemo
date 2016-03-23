import java.util.Objects;

/**
 * Created by Archer on 2016/3/23.
 */
public class StringDemo02 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println(a==b);


        String string="hello";
        String  string1=new String("hello");

         //双（==）等号比较的是地址，equals比较的是内容。
        System.out.println(string == string1);
        //使用equals方法进行比较
        System.out.println(Objects.equals(string, string1));
    }
}
