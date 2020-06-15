package com.company.creature;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:09
 * @version: 1.0
 * @modified By:
 */

import com.company.article.ArticleWeapon;

public class Monster extends Creature {
    public Monster() {
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
}

