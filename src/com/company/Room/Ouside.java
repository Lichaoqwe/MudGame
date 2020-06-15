package com.company.Room;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 21:14
 * @version: 1.0
 * @modified By:
 */
public class Ouside extends Room {

    public Ouside (String id, String description) {
        this.id=id;
        this.description=description;
    }

    @Override
    public void getAnswer(){
        super.getAnswer();
        System.out.println("在广场打怪兽的不是奥特曼");

    }
}


