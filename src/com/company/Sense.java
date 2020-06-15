package com.company;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:14
 * @version: 1.0
 * @modified By:
 */
import com.company.Room.*;
import com.company.article.WeaponKnife;
import com.company.article.WeaponSword;
import com.company.creature.MonsterWolf;
import com.company.creature.MonsterWolfSet;
import com.company.creature.Person;
import java.util.Iterator;
import java.util.Scanner;

public class Sense {

   protected Room room = new Room();
    private Person person = new Person();
    private MonsterWolf wolf1 = new MonsterWolf();
    private MonsterWolf wolf2 = new MonsterWolf();
    private MonsterWolf wolf3 = new MonsterWolf();
    private MonsterWolfSet monsterWolfSet = new MonsterWolfSet();
    Ui ui = new Ui();


    public Sense() {
    }

    public void initSense() {
        this.initMonster();
        initRooms();
        initPerson(roomSet.searchRoomById("1"));
    }


    private void initPerson(Room room) {
        this.person.setId("222222");
        this.person.setDescription("小白");
        this.person.setHPvalue(300);
        this.person.setCurrentWeapon(new WeaponSword("pw1", "倚天剑", -50));
        person.setCurrentRoom(room);
    }

    public void initMonster() {
        this.wolf1.setId("wolf1");
        this.wolf1.setDescription("狼1");
        this.wolf1.setHPvalue(200);
        this.wolf1.setCurrentWeapon(new WeaponKnife("mw1", "屠龙刀1", -50));
        this.wolf2.setId("wolf2");
        this.wolf2.setDescription("狼2");
        this.wolf2.setHPvalue(200);
        this.wolf2.setCurrentWeapon(new WeaponKnife("mw2", "屠龙刀2", -51));
        this.wolf3.setId("wolf3");
        this.wolf3.setDescription("狼3");
        this.wolf3.setHPvalue(200);
        this.wolf3.setCurrentWeapon(new WeaponKnife("mw3", "屠龙刀3", -52));
        this.monsterWolfSet.getMonsterWolves().add(this.wolf1);
        this.monsterWolfSet.getMonsterWolves().add(this.wolf2);
        this.monsterWolfSet.getMonsterWolves().add(this.wolf3);
    }




    public void play() {

        this.ui.displayStaus(this);
        Scanner in = new Scanner(System.in);
        while(true) {
            String command = in.nextLine();
            String[] cmdLineItems = command.split(" ");
            if (cmdLineItems[0].equals("bye")) {
                this.ui.displayBye();
                System.exit(0);
            } else if (cmdLineItems[0].equals("help")) {
                this.ui.displayHelpMsg();
            }
            else if (cmdLineItems[0].equals("go")) {
                    this.getPerson().go(cmdLineItems[1]);

            }
            else if (cmdLineItems[0].equals("chop")) {
                this.getPerson().useArticle(this.getPerson().getCurrentWeapon(), this.getMonsterWolfSet().get(cmdLineItems[1]));
                this.ui.displayDamageMsg(this.getPerson(), this.getMonsterWolfSet().get(cmdLineItems[1]));
                Iterator var4 = this.getMonsterWolfSet().getMonsterWolves().iterator();
                while(var4.hasNext()) {
                    MonsterWolf item = (MonsterWolf)var4.next();
                    if (1 == Utils.randomMonsterChop(0, 2)) {
                        item.useArticle(item.getCurrentWeapon(), this.getPerson());
                        this.ui.displayDamageMsg(item, this.getPerson());
                    }

                }
                this.judgeSuccess();
            } else {
                this.ui.displayErrorCmdMsg();
                this.ui.displayHelpMsg();
            }
            this.ui.displayStaus(this);

        }
    }
    RoomSet roomSet=new RoomSet();//定义存放所有房间的对象

    public boolean judgeSuccess() {
        boolean flagPersonSuccess = true;
        if (this.person.getHPvalue() <= 0) {
            flagPersonSuccess = false;
        }

        return flagPersonSuccess;
    }

    private void initRooms () {
        Room outside=new Ouside("1", "广场");
        Room pub=new Pub("2", "酒馆");
        Room lobby=new Lobby("3", "大堂");
        Room study=new Study("4", "书房");
        Room bedroom=new BedRoom("5", "卧室");


        outside.addReachableRoom("2", pub);
        outside.addReachableRoom("3", lobby);
        outside.addReachableRoom("4", study);

        pub.addReachableRoom("1", outside);

        lobby.addReachableRoom("1", outside);

        study.addReachableRoom("1", outside);
        study.addReachableRoom("5", bedroom);

        bedroom.addReachableRoom("4", study);

        roomSet.addRoom(outside);
        roomSet.addRoom(pub);
        roomSet.addRoom(lobby);
        roomSet.addRoom(study);
        roomSet.addRoom(bedroom);
    }



    public RoomSet getRoomSet () {
        return roomSet;
    }

    public void setRoomSet (RoomSet roomSet) {
        this.roomSet=roomSet;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Ui getUi() {
        return ui;
    }

    public void setUi(Ui ui) {
        this.ui = ui;
    }

    public MonsterWolf getWolf1() {
        return this.wolf1;
    }

    public void setWolf1(MonsterWolf wolf1) {
        this.wolf1 = wolf1;
    }

    public MonsterWolf getWolf2() {
        return this.wolf2;
    }

    public void setWolf2(MonsterWolf wolf2) {
        this.wolf2 = wolf2;
    }

    public MonsterWolf getWolf3() {
        return this.wolf3;
    }

    public void setWolf3(MonsterWolf wolf3) {
        this.wolf3 = wolf3;
    }

    public MonsterWolfSet getMonsterWolfSet() {
        return this.monsterWolfSet;
    }

    public void setMonsterWolfSet(MonsterWolfSet monsterWolfSet) {
        this.monsterWolfSet = monsterWolfSet;
    }
}
