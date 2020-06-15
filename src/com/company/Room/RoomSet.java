package com.company.Room;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 21:07
 * @version: 1.0
 * @modified By:
 */
import java.util.ArrayList;
public class RoomSet {


    //定义ArrsyList集合对象(集合元素类型为Room类)rooms，存放所有的房间数据
    ArrayList<Room> rooms=new ArrayList<>();
    //该方法将一个Room对象room加到rooms
    public void addRoom (Room room) {
        rooms.add(room);
    }

    /**
     * @descript : 在房间集合中搜索房间id为roomId的房间。在本项目中，用在为Person设置初始房间
     * @author :wangManTao
     * @date :2020-04-17 22:40
     * @Param: roomId   房间id
     * @return :com.wmt.Room ， 返回null表示m
     */
    public Room searchRoomById (String roomId) {
        Room room=null;
        for (Room item : rooms
        ) {
            if (item.getId().equals(roomId)) {  //注意，这里不要用 item.getId()==roomId
                room=item;
                break;//如果发现有该房间号就break
            }
        }
        return room;
    }

}