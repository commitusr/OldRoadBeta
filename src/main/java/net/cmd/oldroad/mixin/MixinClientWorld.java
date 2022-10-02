/*
package xyz.przemyk.timestopper.mixin;

import java.util.Iterator;
import java.util.function.Supplier;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.storage.WritableLevelData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import xyz.przemyk.timestopper.TimeStopperMod;

@Mixin({ClientLevel.class})
public abstract class MixinClientWorld extends Level {
    @Shadow
    protected abstract void m_104641_(Entity var1, Entity var2);

    protected MixinClientWorld(WritableLevelData p_220352_, ResourceKey<Level> p_220353_, Holder<DimensionType> p_220354_, Supplier<ProfilerFiller> p_220355_, boolean p_220356_, boolean p_220357_, long p_220358_, int p_220359_) {
        super(p_220352_, p_220353_, p_220354_, p_220355_, p_220356_, p_220357_, p_220358_, p_220359_);
    }

    public void tickNonPassenger(Entity p_104640_) {
        p_104640_.m_146867_();
        ++p_104640_.f_19797_;
        this.m_46473_().m_6521_(() -> {
            return Registry.f_122826_.m_7981_(p_104640_.m_6095_()).toString();
        });
        if (p_104640_.canUpdate()) {
            TimeStopperMod.updateEntity(p_104640_);
        }

        this.m_46473_().m_7238_();
        Iterator var2 = p_104640_.m_20197_().iterator();

        while(var2.hasNext()) {
            Entity entity = (Entity)var2.next();
            this.m_104641_(p_104640_, entity);
        }

    }
}
*/