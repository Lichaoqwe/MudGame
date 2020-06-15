package com.company.creature;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:13
 * @version: 1.0
 * @modified By:
 */

import com.company.Room.Room;
import com.company.Ui;
import com.company.article.ArticleWeapon;

public class Person extends Creature {
    public Room currentRoom;
    private String name; //属性
    private String id;  //属性
    private Room nextroom;


    public Person() {
    }


    public int lifechange() {
        return 0;
    }

    public int lifechange(int damagePoints) {
        this.setHPvalue(this.getHPvalue() + damagePoints);
        return this.getHPvalue();
    }
    public void useArticle(ArticleWeapon weapon, Creature targetCreature) {
        weapon.useArticle(targetCreature);
    }

    public void attack() {
    }

    /**
     * @descript :从当前房间currentRoom走到targetRoom
     * @Param: targetRoomId  目标房间Id
     */
    public void go(String targetRoomId) {
        //临时变量
       // Room nextroom;
        //1.根据targetRoomId找相应的目标房间
        nextroom = currentRoom.searchReachableRoomById(targetRoomId, currentRoom.getReachableRooms());
        if (nextroom != null) {
            //2.如果找到房间，将该Room赋给Person.currentRoom
            this.currentRoom = nextroom;
            //显示人所在的当前房间可到达的房间


            Ui.displayReachableRooms(this);


        } else {
            //如果没有找到房间，显示没有目标房间
            Ui.printNoRoom();
        }

    }
    public Person (String id, String name, Room currentRoom) {
        this.id=id;
        this.name=name;
        this.currentRoom=currentRoom;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id=id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name=name;
    }

    public Room getCurrentRoom () {
        return currentRoom;
    }

    public void setCurrentRoom (Room currentRoom) {
        this.currentRoom=currentRoom;
    }
}






