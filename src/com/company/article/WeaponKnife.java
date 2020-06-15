package com.company.article;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:05
 * @version: 1.0
 * @modified By:
 */
import com.company.creature.Creature;

public class WeaponKnife extends ArticleWeapon {
    public WeaponKnife() {
    }

    public WeaponKnife(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHPvalue(enemyCreature.getHPvalue() + this.getDamagePoints());
    }
}
