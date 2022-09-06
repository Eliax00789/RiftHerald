package me.eliax00789.riftherald.core.champions.champion;

import org.json.JSONException;
import org.json.JSONObject;

public class Stats {
    private final JSONObject data;

    public Stats(JSONObject data) {
        this.data = data;
    }

    public Double hp() {
        try {
            return  data.getDouble("hp");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double hpPerLevel() {
        try {
            return  data.getDouble("hpperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double mp() {
        try {
            return  data.getDouble("mp");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double mpPerLevel() {
        try {
            return  data.getDouble("mpperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double moveSpeed() {
        try {
            return  data.getDouble("movespeed");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double armor() {
        try {
            return  data.getDouble("armor");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double armorPerLevel() {
        try {
            return  data.getDouble("armorperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double spellBlock() {
        try {
            return  data.getDouble("spellblock");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double spellBlockPerLevel() {
        try {
            return  data.getDouble("spellblockperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double attackRange() {
        try {
            return  data.getDouble("attackrange");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double hpRegen() {
        try {
            return  data.getDouble("hpregen");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double hpRegenPerLevel() {
        try {
            return  data.getDouble("hpregenperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double mpRegen() {
        try {
            return  data.getDouble("mpregen");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double mpRegenPerLevel() {
        try {
            return  data.getDouble("mpregenperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double crit() {
        try {
            return  data.getDouble("crit");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double critPerLevel() {
        try {
            return  data.getDouble("critperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double attackDamage() {
        try {
            return  data.getDouble("attackdamage");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double attackDamagePerLevel() {
        try {
            return  data.getDouble("attackdamageperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double attackSpeedPerLevel() {
        try {
            return  data.getDouble("attackspeedperlevel");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Double attackSpeed() {
        try {
            return  data.getDouble("attackspeed");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
