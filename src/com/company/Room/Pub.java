package com.company.Room;

import com.company.Sense;
import com.company.creature.MonsterWolf;

import java.io.PrintStream;
import java.util.Iterator;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/12 22:22
 * @version: 1.0
 * @modified By:
 */
public class Pub extends Room {

    public Pub (String id, String description) {
        this.id=id;
        this.description=description;
    }


    @Override
    public void getAnswer(){


        System.out.println("小心周围有怪兽出没");
    }




}
