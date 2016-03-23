/**
 * Created by Archer on 2016/3/23.
 */
public class StringBufferDemo01 {
    public static void main(String[] args) {
        //必须实例化，本质上是一个容器。
            StringBuffer stringBuffer=new StringBuffer();
//        stringBuffer.append("Archer");
////        System.out.println(stringBuffer);
//
//        System.out.println(stringBuffer.toString());
//        tell(stringBuffer);
//
//        //StringBuffer容器里面的东西被更改了，加入了新的东西
////        如果是string则不会变
//        System.out.println(stringBuffer);

        stringBuffer.append("hello");
        //从下标index为0的位置插入
        stringBuffer.insert(0,"I love");
        System.out.println(stringBuffer.toString());

        //一个空格占两个字符的位置。
        stringBuffer.replace(0,2,"abcd");
        System.out.println(stringBuffer);

    }
//    append 方法
//    private static void tell(StringBuffer s){
//
//        s.append(" I love Archer");
//
//
//    }

}
