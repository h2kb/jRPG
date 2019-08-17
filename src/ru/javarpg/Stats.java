package ru.javarpg;

import java.util.HashMap;

public class Stats
{
    private HashMap<String, Integer> stats;

//    private int hp;
//    private int maxHp;
//    private int agility, strehgth, intelligence;
//
//    private int evasionChance, criticalChance;

    public void recountStats()
    {
        // TODO: вывести формулы расчёта параметров из характеристик
    }

    public void add(Stats stats2)
    {
        for (String key : stats.keySet())
        {
            stats.replace(key, stats.get(key) + stats2.stats.get(key));
        }
    }

    public void sub(Stats stats2)
    {
        for (String key : stats.keySet())
        {
            stats.replace(key, stats.get(key) - stats2.stats.get(key));
        }
    }

    public int getHp()
    {
        return stats.get("hp");
    }

    public void setHp(int hp)
    {
        stats.replace("maxHp", hp);
    }

    public int getAgility()
    {
        return stats.get("agility");
    }

    public void setAgility(int agility)
    {
        stats.replace("agility", agility);
    }

    public int getMaxHp()
    {
        return stats.get("maxHp");
    }

    public void setMaxHp(int maxHp)
    {
        stats.replace("maxHp", maxHp);
    }

    public int getStrehgth()
    {
        return stats.get("strength");
    }

    public void setStrehgth(int strehgth)
    {
        stats.replace("strehgth", strehgth);
    }

    public int getIntelligence()
    {
        return stats.get("intelligence");
    }

    public void setIntelligence(int intelligence)
    {
        stats.replace("intelligence", intelligence);
    }

    public int getEvasionChance()
    {
        return stats.get("evasionChance");
    }

    public void setEvasionChance(int evasionChance)
    {
        stats.replace("evasionChance", evasionChance);
    }

    public int getCriticalChance()
    {
        return stats.get("criticalChance");
    }

    public void setCriticalChance(int criticalChance)
    {
        stats.replace("criticalChance", criticalChance);
    }
}
