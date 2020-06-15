package com.company.article;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/6/5 23:55
 * @version: 1.0
 * @modified By:
 */
import com.company.creature.Creature;

public abstract class ArticleWeapon extends Article {
    private String id;
    private String description;
    private int damagePoints;

    public abstract void useArticle(Creature var1);

    public ArticleWeapon() {
    }

    public ArticleWeapon(String id, String description, int damagePoints) {
        this.id = id;
        this.description = description;
        this.damagePoints = damagePoints;
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

    public int getDamagePoints() {
        return this.damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}

