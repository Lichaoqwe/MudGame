package com.company.Room;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/12 22:23
 * @version: 1.0
 * @modified By:
 */
public class Study extends Room {

    public Study (String id, String description) {
        this.id=id;
        this.description=description;
    }

    public Study() {
    }

    @Override
    public void getAnswer(){
        super.getAnswer();
        System.out.println("在书房打怪兽的不是奥特曼");

    }

}




