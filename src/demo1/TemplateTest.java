package demo1;

import java.util.ArrayList;

/**
 * @author zhanghaoran
 * @date 2020-12-30 17:10
 *
 * 1.IDEA中代码模块所处的位置
 * setting - Editor - Live Templates / Postfix Completion
 *
 * 2.常用的模板
 *
 */
public class TemplateTest {
//    private static final Customer cust = new Customer();

    //变形psf
//    public static final
    //变形 psgi  private static final int
//    public static final int
    //变形 psfs  private static String
    //公共的静态的全局常量
    public static final String string = "CHINA";
    
    //修改的生成int的Module  psfi
    public static final int num = 1;
    
    //使用自定义的生成带注释的String prsc
    /**
     * 自定义1
    */
    private String name = "hello";

    //自定义int
    /**
     * 自定义int
    */
    private int change = 1 ;




    




    public static void main(String[] args) {
        //string.sout
        System.out.println(string);//可打印上述定义的string

//        模板2：sout
        //soutp:输出带形参
        System.out.println("hello world");
        //变行
        System.out.println("args = [" + args + "]");
        //soutm  输出main
        System.out.println("TemplateTest.main");
        //soutv  输出变量  就近的选择变量  == xxx.sout
        int i = 10;
        System.out.println("i = " + i);
        System.out.println(i);

        //模板3 fori
        String[] arr = new String[]{"tom","jerry","hanmeimei","lilei"};
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        //变行:iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形 itar 普通for循环
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println(s);

        }

        //模板4：list
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);

        //list.for
        for (Object o : list) {


        }

        //变行 list.fori
        //正序遍历
        for (int i1 = 0; i1 < list.size(); i1++) {

        }

        //变形 list.forr
        //逆序遍历
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {

        }

        //模板5：ifn  可生成if(xxx==null)
        if (list == null) {

        }
        //变形 inn 可生成 if(xxx != null)
        if (list != null) {

        }

        //变形 xxx.nn  / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

        //模板6 prsf  生成private statci final
        //在上面



    }
//    模板1:psvm
}
