package com.company;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:15
 * @version: 1.0
 * @modified By:
 */

import com.company.Room.Lobby;
import com.company.Room.Ouside;
import com.company.Room.Room;
import com.company.creature.Creature;
import com.company.creature.MonsterWolf;
import com.company.creature.Person;

import java.io.PrintStream;
import java.util.Iterator;

public class Ui {
    private  Room room;
    private Person person;


    public Ui() {
    }

//复制到了

//    public void displayStaus(Sense sense) {
//        System.out.println("-----------------------------");
//        PrintStream var10000 = System.out;
//        String var10001 = sense.getPerson().getDescription();
//        var10000.println(var10001 + " 生命值：" + sense.getPerson().getHPvalue()+" 武器："+sense.getPerson().getCurrentWeapon().getDescription());
//        Iterator var2 = sense.getMonsterWolfSet().getMonsterWolves().iterator();
//        while(var2.hasNext()) {
//            MonsterWolf item = (MonsterWolf)var2.next();
//            var10000 = System.out;
//            var10001 = item.getId();
//            var10000.println(var10001 + "(" + item.getDescription() + "):" + item.getHPvalue());
//        }
//        System.out.println("-----------------------------");
//    }



public void displayStaus( Sense sense) {
    System.out.println("-----------------------------");
    PrintStream var10000 = System.out;
    String var10001 = sense.getPerson().getDescription();
    var10000.println(var10001 + " 生命值：" + sense.getPerson().getHPvalue()+" 武器："+sense.getPerson().getCurrentWeapon().getDescription());
    Iterator var2 = sense.getMonsterWolfSet().getMonsterWolves().iterator();
    while(var2.hasNext()) {
        MonsterWolf item = (MonsterWolf)var2.next();
        var10000 = System.out;
        var10001 = item.getId();
        var10000.println(var10001 + "(" + item.getDescription() + "):" + item.getHPvalue());
    }
    System.out.println("-----------------------------");
}



    public void displayHelpMsg() {
        System.out.println("---三个命令:chop(chop wolf1)---bye---help---go(go 1)");
    }

    public void displayBye() {
        System.out.println("再见");
    }

    public void displayErrorCmdMsg() {
        System.out.println("你输入的是非法命令");
    }


    public static void printWelcome (Person person) {
        System.out.println();
        System.out.println("---------------------");
        System.out.println("河流值浅岸。\n" +
                "敛辔暂经过。\n" +
                "弓衣湿溅水。\n" +
                "马足乱横波。\n" +
                "半城斜出树。\n" +
                "长林直枕河。\n" +
                "今朝游侠客。\n" +
                "不畏风尘多。");
        System.out.println("-----------------------");

        System.out.println("无忧无虑的游侠儿，也害怕没酒喝，" +
                          "现在只能去打怪赚钱了");
        System.out.println("记住：打不过可以跑！！！");
        System.out.println("不知所措时，请输入 'help' 。");
        System.out.println();
        displayReachableRooms(person);

    }

    //显示当前房间出口所有方向

    public static void displayReachableRooms (com.company.creature.Person person) {

        System.out.println("现在你在" + person.getCurrentRoom().getId() +"("+ person.getCurrentRoom().toString()+")");

        person.currentRoom.getAnswer();

        System.out.print("出口有：");
        for (String key : person.getCurrentRoom().getReachableRooms().keySet()
        ) {
            System.out.print(key + "(" + person.getCurrentRoom().getReachableRooms().get(key).getDescription() + ")" + " ");
        }
        System.out.println();

    }

    public static void printHelp () {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    public static void printNoRoom () {
        System.out.println("那里没有房间！");
    }

    public static void printErrorCommand () {
        System.out.println("输入错误命令，重新输入。");
    }


    public void displayDamageMsg(Creature attackCreature, Creature targetCreature) {
        PrintStream var10000 = System.out;
        String var10001 = attackCreature.getDescription();
        var10000.println(var10001 + "对" + targetCreature.getDescription() + "造成了" + attackCreature.getCurrentWeapon().getDamagePoints() + "伤害");
    }
}

