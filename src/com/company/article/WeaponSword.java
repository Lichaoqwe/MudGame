package com.company.article;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/6 0:06
 * @version: 1.0
 * @modified By:
 */
import com.company.creature.Creature;

public class WeaponSword extends ArticleWeapon {
    public WeaponSword() {
    }

    public WeaponSword(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHPvalue(enemyCreature.getHPvalue() + this.getDamagePoints());
    }
}
