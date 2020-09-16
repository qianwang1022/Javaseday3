package com.huaibei.university.qianwang.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        User user1=new User("钱旺","123");
        User user2=new User("汪孔媛","1234");
        User user3=new User("钱超","12345");
        User user4=new User("钱凡","123456");
        User user5=new User("曹红英","1234567");
        ArrayList<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        Scanner input=new Scanner(System.in);
        boolean flag=false;
       A: for (int i = 0; i <3 ; i++) {
           System.out.println("请输入你的姓名：");
            String name=input.next();
           System.out.println("请输入你的密码：");
           String password=input.next();
           B:for (User user:list) {
               if(name.equals(user.getName())&&password.equals(user.getPassword())){
                   System.out.println("登录成功！");
                   flag=true;
                   break A;
               }
           }
           if(!flag){
               System.out.println("不好意思，密码或用户名错误，请重新输入！");
           }
       }


    }

}
