package com.threemin.java.basics;

public class BasicTypes {

    int i;
    byte b1;
    short s;
    long l;
    float f;
    double d;
    boolean b2;
    char ch;

    public static void main(String[] args) {

        // 定义在方法内的基础类型变量必须要初始化才能使用，否则编译不过。
//        int uninitialized;
//        System.out.println(uninitialized);

        // 定义在方法外的基础类型变量有默认值，允许不初始化。
        BasicTypes basicTypes = new BasicTypes();
        System.out.printf("Default value of int type is %d\n", basicTypes.i);
        System.out.printf("Default value of byte type is %d\n", basicTypes.b1);
        System.out.printf("Default value of short type is %d\n", basicTypes.s);
        System.out.printf("Default value of long type is %d\n", basicTypes.l);
        System.out.printf("Default value of float type is %f\n", basicTypes.f);
        System.out.printf("Default value of double type is %f\n", basicTypes.d);
        System.out.printf("Default value of boolean type is %s\n", basicTypes.b2);
        System.out.printf("Default value of char type is %x\n", (int)basicTypes.ch);


        // float类型变量使用小数初始化时，需要进行转型。
//        float f1 = 3.14;

        float f2 = 3.14f;           // f2值为3.14
        float f3 = (float) 3.14;    // f3值为3.14
        float f4 = 3;               // f3值为3.0

        // 数字类型变量初始化或赋值时，可以在数字之间添加下划线以增强可读性。
        int i = 1_2_3;              // i的值为123
        double d = 3.1_4;           // d的值为3.14
    }
}
