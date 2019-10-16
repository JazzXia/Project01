package com.qtatelier.java;

import com.qtatelier.bean.Customer;

import java.util.ArrayList;

/**
 * @author JazzXia
 * @create 2019-10-9:03
 * <p>
 * 1.IDEA中代码模板所处的位置:seetings - Editor - Live Templates / Postfix Completion
 * 2.常用的模板
 */
public class TemplatesTest {
    //模板六：prsf:可生产private static final
    private static final Customer cust = new Customer();

    //变形:psv
    public static final int NUM = 1;

    //变形:psfi
    public static final int NUM2 = 2;

    //变形:psfs
    public static final String NATION = "CHINA";

    //模板一:IDEA:psvm eclipse:main
    public static void main(String[] args) {

        //模板二:IDEA:sout  eclipse:sysout
        System.out.println("hello");
        //支持编写soutp[parameter参数]/soutv[variable变量]/soutm[method方法]/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num = 10;
        int num1 = 20;
        System.out.println("num1 = " + num1);//soutm是就近去选择变量
        System.out.println(num);//num.sout


        //模板三:fori
        String[] arr = new String[]{"Tom","Jerry","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(755);

        for (Object o : list) {

        }

        //变形:list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        
        
        //变形list.forr:逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(755);

        //模板五:ifn
        if (list == null) {

        }

        //变形：inn
        if (list != null) {
            
        }

        //变形:xxx.nn/xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

    }

}
