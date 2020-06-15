package com.company.Room;

import com.company.Sense;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/12 22:22
 * @version: 1.0
 * @modified By:
 */
public class Lobby extends Room {
    protected Sense sense;
    public Lobby (String id, String description) {
        this.id=id;
        this.description=description;
    }


    @Override
    public void getAnswer(){

        System.out.println("在Loobby打怪兽的不是奥特曼");


    }
}
