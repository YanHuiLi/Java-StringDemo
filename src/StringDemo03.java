/**
 * Created by Archer on 2016/3/23.
 */
public class StringDemo03 {
    public static void main(String[] args) {
       //使用string开辟的内存地址内容不可更改
        //二者只是重新组合在了一个新的地址中保存内容
        String str="hello";
        String str1=str+"world";
        System.out.println(str1);

    }
}
