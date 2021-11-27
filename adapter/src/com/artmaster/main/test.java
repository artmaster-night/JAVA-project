package com.artmaster.main;

import com.artmaster.entity.*;

public class test {
    public static void main(String[] args) {
        typeCC typeC=new typeCC();
        usbC usbC=new usbC();
        typeCAdapterClass typeCAdapterClass=new typeCAdapterClass();
        typeCAdapterObject typeCAdapterObject=new typeCAdapterObject(typeC);
        System.out.println("类适配器测试...");
        typeC.transportTypec();
        usbC.transportUsb();
        typeCAdapterClass.transportUsb();
        System.out.println("-----------------------------------------");
        System.out.println("对象适配器测试...");
        typeC.transportTypec();
        usbC.transportUsb();
        typeCAdapterObject.transportUsb();
    }
}
