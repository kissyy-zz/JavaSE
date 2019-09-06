package com.wjy.demo01;

import java.util.Scanner;

/**
 * Scanner类的功能 可以实现键盘输入数据，到程序中
 *
 * 引用类型的一般使用步骤
 *
 * 1.导包
 * import 包路径.类名称
 * 如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
 * 只有java.lang包下的内容不需要导包,其它的包都需要import语句
 *
 * 2.创建
 * 类对称 对象名 = new 类名称();
 *
 * 3.使用
 * 对象名.成员方法()
 */
public class Demo01Scanner
{
    public static void main(String[] args) {
        //从键盘输入一个数字
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("这个数字是从键盘输入的:"+num);

        //从键盘输入一个字符串
        String str = sc.next();
        System.out.println("这个字符串是从键盘输入的:"+str);
    }
}
