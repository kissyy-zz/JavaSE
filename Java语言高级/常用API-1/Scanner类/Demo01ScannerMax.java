package com.wjy.demo01;

import java.util.Scanner;

/**
 * 题目：
 *  键盘输入三个int数字,然后求出其中的最大值
 *
 * 思路：
 * 1.既然是键盘输入,肯定需要用到Scanner
 * 2.Scanner三个步骤：导包，创建，使用nextInt方法
 * 3.既然是三个数字,那么调用三次nextInt方法,得到三个int变量
 * 4.无法同是判断三个数字谁最大,应该转换成为两个步骤:
 *   4.1 首先判断前两个当是谁最大，拿到前两个的最大值
 *   4.2 拿着前两个是的最大值，再和第三个数字比较，得到三个数字中的最大值
 */
public class Demo01ScannerMax
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数:");
        int c = scanner.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值为:"+max);
    }
}
