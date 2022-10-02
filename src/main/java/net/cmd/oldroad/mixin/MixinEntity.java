//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper.mixin;

import javax.annotation.Nullable;
import net.minecraft.commands.CommandSource;
import net.minecraft.util.Mth;
import net.minecraft.world.Nameable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.entity.EntityAccess;
import net.minecraftforge.common.capabilities.CapabilityProvider;
import net.minecraftforge.common.extensions.IForgeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import xyz.przemyk.timestopper.TimeStopperMod;

@Mixin({Entity.class})
public abstract class MixinEntity extends CapabilityProvider<Entity> implements Nameable, EntityAccess, CommandSource, IForgeEntity {
    @Shadow
    private float f_19857_;
    @Shadow
    private float f_19858_;
    @Shadow
    public float f_19859_;
    @Shadow
    public float f_19860_;
    @Shadow
    @Nullable
    private Entity f_19824_;

    protected MixinEntity(Class<Entity> baseClass) {
        super(baseClass);
    }

    public void turn(double yaw, double pitch) {
        if (TimeStopperMod.canUpdateEntity((Entity)this)) {
            double d0 = pitch * 0.15D;
            double d1 = yaw * 0.15D;
            this.f_19858_ = (float)((double)this.f_19858_ + d0);
            this.f_19857_ = (float)((double)this.f_19857_ + d1);
            this.f_19858_ = Mth.m_14036_(this.f_19858_, -90.0F, 90.0F);
            this.f_19860_ = (float)((double)this.f_19860_ + d0);
            this.f_19859_ = (float)((double)this.f_19859_ + d1);
            this.f_19860_ = Mth.m_14036_(this.f_19860_, -90.0F, 90.0F);
            if (this.f_19824_ != null) {
                this.f_19824_.m_7340_((Entity)this);
            }
        }

    }
}
*/