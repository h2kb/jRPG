package ru.javarpg;

public abstract class WorldObject
{
    private static int maxId = 0;
    private int id;
    private String name;
    private char icon;

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public char getIcon()
    {
        return icon;
    }

    private WorldObject(String name, char icon)
    {
        this.name = name;
        this.icon = icon;

        this.id = maxId++;
    }
}
