/**
 * @使用stringbuffer不用开辟那么多的内存空间，运行效率高，速度快。
 *
 * Created by Archer on 2016/3/23.
 */
public class StringDemo05 {
    public static void main(String[] args) {
        String string="Archer";
        for (int i=0;i<100;i++){
            string=string+i;
        }
        System.out.println(string);

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Archer");
        for (int i=0;i<100;i++){
           stringBuffer.append(i);
        }
        System.out.print(stringBuffer);

    }
}
