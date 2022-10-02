//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper.capabilities.control;

import net.minecraft.nbt.CompoundTag;

public class TimeStateHandler {
    public TimeState timeState;

    public TimeStateHandler() {
        this.timeState = TimeState.NORMAL;
    }

    public void copyFrom(TimeStateHandler source) {
        this.timeState = source.timeState;
    }

    public void save(CompoundTag compoundTag) {
        compoundTag.m_128359_("timeState", this.timeState.name());
    }

    public void load(CompoundTag compoundTag) {
        this.timeState = TimeState.valueOf(compoundTag.m_128461_("timeState"));
    }
}
*/