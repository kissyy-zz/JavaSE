package com.wjy.demo02;


import java.util.Scanner;

public class Demo02Anonymous
{
    public static void main(String[] args)
    {
        //使用普通方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //使用匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的数字是：" + num);

        //使用一般方法传入参数
//        Scanner scanner = new Scanner(System.in);
//        methodParam(scanner);

        //w使用匿名对象传参
//        methodParam(new Scanner(System.in));

        Scanner scanner = methodReturn();
        int num = scanner.nextInt();
        System.out.println("输入的数字是：" + num);

    }

    public static void methodParam(Scanner scanner)
    {
        int num = scanner.nextInt();
        System.out.println("输入的数字是：" + num);
    }

    public static Scanner methodReturn()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}
