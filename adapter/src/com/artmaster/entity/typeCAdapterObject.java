package com.artmaster.entity;

public class typeCAdapterObject implements usb{
    private typeC typec;

    public typeCAdapterObject(typecelse typec) {
        this.typec = typec;
    }

    @Override
    public void transportUsb() {
        typec.transportTypec();
    }
}
