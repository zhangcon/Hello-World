package com.ssm.chapter9.main;/*
 *@author 张聪
 *@date 2020/1/2 - 21:59
 */

import java.io.*;
import java.util.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream(new File("E:"+File.separator+"area.properties")));
        System.out.println(pro.getProperty("BJ"));
    }
}
