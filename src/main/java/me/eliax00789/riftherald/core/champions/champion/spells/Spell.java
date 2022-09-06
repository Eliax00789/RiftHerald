package me.eliax00789.riftherald.core.champions.champion.spells;

import me.eliax00789.riftherald.core.champions.champion.spells.spell.Effect;
import me.eliax00789.riftherald.core.champions.champion.spells.spell.EffectBurn;
import me.eliax00789.riftherald.core.champions.champion.spells.spell.Image;
import me.eliax00789.riftherald.core.champions.champion.spells.spell.Leveltip;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Spell {
    private final JSONObject data;

    public Spell(JSONObject data) {
        this.data = data;
    }

    public String id() {
        try {
            return data.getString("id");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String name() {
        try {
            return data.getString("name");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String description() {
        try {
            return data.getString("description");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String tooltip() {
        try {
            return data.getString("tooltip");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Leveltip leveltip() {
        try {
            return new Leveltip(data.getJSONObject("leveltip"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int maxRank() {
        try {
            return data.getInt("maxRank");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int cooldown(int spelllevel) {
        try {
            return data.getJSONObject("cooldown").getInt(String.valueOf(spelllevel - 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String cooldownBurn() {
        try {
            return data.getString("cooldownBurn");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int cost(int spelllevel) {
        try {
            return data.getJSONObject("cost").getInt(String.valueOf(spelllevel - 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String costBurn() {
        try {
            return data.getString("costBurn");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public JSONArray dataValues() {
        try {
            return data.getJSONArray("datavalues");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Effect effect() {
        try {
            return new Effect(data.getJSONObject("effect"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public EffectBurn effectBurn() {
        try {
            return new EffectBurn(data.getJSONObject("effectBurn"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public JSONArray vars() {
        try {
            return data.getJSONArray("vars");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String costType() {
        try {
            return data.getString("costType");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int maxAmmo() {
        try {
            return data.getInt("maxammo");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int range(int spelllevel) {
        try {
            return data.getJSONObject("range").getInt(String.valueOf(spelllevel - 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String rangeBurn() {
        try {
            return data.getString("rangeBurn");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Image image() {
        try {
            return new Image(data.getJSONObject("image"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String resource() {
        try {
            return data.getString("resource");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
