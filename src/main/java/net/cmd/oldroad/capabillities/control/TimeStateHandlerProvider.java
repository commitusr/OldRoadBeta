//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper.capabilities.control;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TimeStateHandlerProvider implements ICapabilitySerializable<CompoundTag> {
    public static final Capability<TimeStateHandler> TIME_STATE_CAP = CapabilityManager.get(new CapabilityToken<TimeStateHandler>() {
    });
    private TimeStateHandler timeStateHandler = null;
    private final LazyOptional<TimeStateHandler> timeStateHandlerLazyOptional = LazyOptional.of(this::createTimeStateHandler);

    public TimeStateHandlerProvider() {
    }

    private TimeStateHandler createTimeStateHandler() {
        if (this.timeStateHandler == null) {
            this.timeStateHandler = new TimeStateHandler();
        }

        return this.timeStateHandler;
    }

    @NotNull
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return cap == TIME_STATE_CAP ? this.timeStateHandlerLazyOptional.cast() : LazyOptional.empty();
    }

    public CompoundTag serializeNBT() {
        CompoundTag compoundTag = new CompoundTag();
        this.createTimeStateHandler().save(compoundTag);
        return compoundTag;
    }

    public void deserializeNBT(CompoundTag compoundTag) {
        this.createTimeStateHandler().load(compoundTag);
    }

    public void invalidate() {
        this.timeStateHandlerLazyOptional.invalidate();
    }
}
*/