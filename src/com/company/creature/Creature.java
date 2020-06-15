package com.company.creature;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:09
 * @version: 1.0
 * @modified By:
 */

import com.company.Room.Room;
import com.company.article.ArticleWeapon;
import java.util.ArrayList;

public abstract class Creature {
    private String id;
    private String description;
    public Room currentRoom;
    private int HPvalue;
    private int damage;
    private ArticleWeapon currentWeapon;
    private ArticleWeapon weapon;
    private ArrayList<ArticleWeapon> weapons = new ArrayList();

    public abstract void useArticle(ArticleWeapon var1, Creature var2);

    public abstract void attack();

    public Creature() {
    }

    public Creature(String id, String description, Room currentroom) {
        this.id = id;
        this.description = description;
        this.currentRoom = currentRoom;
    }

    public Creature(String id, String description, int lifevalue, int damage) {
        this.id = id;
        this.description = description;
        this.HPvalue = lifevalue;
        this.damage = damage;
    }

    public Creature(ArticleWeapon currentWeapon, ArticleWeapon weapon) {
        this.currentWeapon = currentWeapon;
        this.weapon = weapon;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getCurrentroom() {
        return this.currentRoom;
    }

    public void setCurrentroom(Room currentroom) {
        this.currentRoom = currentRoom;
    }

    public int getHPvalue() {
        return this.HPvalue;
    }

    public void setHPvalue(int lifevalue) {
        this.HPvalue = lifevalue;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public ArticleWeapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(ArticleWeapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<ArticleWeapon> getWeapons() {
        return this.weapons;
    }

    public void setWeapons(ArrayList<ArticleWeapon> weapons) {
        this.weapons = weapons;
    }

    public ArticleWeapon getCurrentWeapon() {
        return this.currentWeapon;
    }

    public void setCurrentWeapon(ArticleWeapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }


    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}

