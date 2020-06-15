package com.company.creature;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:12
 * @version: 1.0
 * @modified By:
 */

import java.util.ArrayList;
import java.util.Iterator;

public class MonsterWolfSet {
    ArrayList<MonsterWolf> monsterWolves = new ArrayList();

    public MonsterWolf get(String id) {
        MonsterWolf monsterWolf = null;
        Iterator var3 = this.monsterWolves.iterator();

        while(var3.hasNext()) {
            MonsterWolf item = (MonsterWolf)var3.next();
            if (id.equals(item.getId())) {
                monsterWolf = item;
                break;
            }
        }

        return monsterWolf;
    }

    public MonsterWolfSet() {
    }

    public MonsterWolfSet(ArrayList<MonsterWolf> monsters) {
        this.monsterWolves = this.monsterWolves;
    }

    public ArrayList<MonsterWolf> getMonsterWolves() {
        return this.monsterWolves;
    }

    public void setMonsters(ArrayList<MonsterWolf> monsters) {
        this.monsterWolves = this.monsterWolves;
    }
}
