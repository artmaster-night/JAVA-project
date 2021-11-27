package com.artmaster.entity;

public class usbC implements usb{
    @Override
    public void transportUsb() {
        System.out.println("usb: 输出大电流");
    }
}
