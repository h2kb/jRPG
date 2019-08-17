package ru.javarpg;

abstract public class Effect
{
    Stats effect;
    Creature target;

    private int duration;

    int getDuration()
    {
        return duration;
    }

    abstract void apply();
}
