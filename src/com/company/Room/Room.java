package com.company.Room;

import com.company.Sense;
import com.company.Ui;
import com.company.article.WeaponKnife;
import com.company.creature.MonsterWolf;
import com.company.creature.MonsterWolfSet;
import com.company.creature.Person;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @description:
 * @author:
 * @date:Created in 2020-04-17 19:02
 * @version:0.0.1
 * @modified By:
 */
public class Room {
    protected String id;
    protected String description;
    protected Sense sense;
    protected Ui ui = new Ui();
    Person person = new Person();



    public Sense getSense() {
        return sense;
    }

    public void setSense(Sense sense) {
        this.sense = sense;
    }

    public Ui getUi() {
        return ui;
    }

    public void setUi(Ui ui) {
        this.ui = ui;
    }

    //reachableRooms是一个集合，存放该房间能够到达的所有房间。结构为<房间id，房间>
    private HashMap<String, Room> reachableRooms=new HashMap<>();

    /**
     * @descript : 将房间添加到房间集合
     * @author :wangManTao
     * @date :2020-04-17 21:56
     * @Param: roomId   房间id
     * @Param: room  房间对象
     */
    public void addReachableRoom(String roomId,Room room){
        reachableRooms.put(roomId,room);
    }


    /**
     * @descript :查询targetRoomId可以到达的房间，即查询targetRoomId的房间是否在reachableRooms中
     * @author :wangManTao
     * @date :2020-04-18 17:39
     * @Param: roomId  查询的房间号
     * @Param: reachableRooms  房间集合
     * @return :com.wmt.model.Room
     */



    public Room searchReachableRoomById (String targetRoomId, HashMap<String,Room> reachableRooms) {
        Room nextroom=null;
        if(true == reachableRooms.containsKey(targetRoomId))
        {
           nextroom=reachableRooms.get(targetRoomId);
        }
        return nextroom;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString()
    {
        return this.description;
    }

    public Room () {
    }

    public Room (String id, String description) {
        this.id=id;
        this.description=description;
    }

       public void getAnswer() {

    }



    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id=id;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description=description;
    }

    public HashMap<String, Room> getReachableRooms () {
        return reachableRooms;
    }

    public void setReachableRooms (HashMap<String, Room> reachableRooms) {
        this.reachableRooms=reachableRooms;
    }



}
