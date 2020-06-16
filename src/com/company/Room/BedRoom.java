package com.company.Room;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/12 22:23
 * @version: 1.0
 * @modified By:
 */
public class BedRoom extends Room {
    public BedRoom (String id, String description) {
        this.id=id;
        this.description=description;
    }


    @Override
    public void getAnswer(){

        System.out.println("小心周围有怪兽出没");

    }


}
