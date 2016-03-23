/**
 * @function 详细讲解String字符串的用法
 * Created by Archer on 2016/3/23.
 */
public class StringDemo01 {

    public static void main(String[] args) {

        //第一种方式直接赋值，节约内存，使用比较多
//   String string="hello";


        //第二种方式，浪费内存，包异常
        String string= new String("hello");

        System.out.println(string);



    }
}
