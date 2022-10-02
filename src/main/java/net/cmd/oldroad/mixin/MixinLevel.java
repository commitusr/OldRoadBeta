//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper.mixin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.TickingBlockEntity;
import net.minecraftforge.common.capabilities.CapabilityProvider;
import net.minecraftforge.common.extensions.IForgeBlockEntity;
import net.minecraftforge.common.extensions.IForgeLevel;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import xyz.przemyk.timestopper.TimeStopperMod;

@Mixin({Level.class})
public abstract class MixinLevel extends CapabilityProvider<Level> implements LevelAccessor, AutoCloseable, IForgeLevel {
    @Shadow
    @Final
    private ArrayList<BlockEntity> pendingFreshBlockEntities;
    @Shadow
    @Final
    private ArrayList<BlockEntity> freshBlockEntities;
    @Shadow
    private boolean f_151504_;
    @Shadow
    @Final
    private List<TickingBlockEntity> f_151503_;
    @Shadow
    @Final
    protected List<TickingBlockEntity> f_151512_;

    @Shadow
    public abstract ProfilerFiller m_46473_();

    @Shadow
    public abstract boolean m_220393_(BlockPos var1);

    protected MixinLevel(Class<Level> baseClass) {
        super(baseClass);
    }

    protected void tickBlockEntities() {
        ProfilerFiller profilerfiller = this.m_46473_();
        profilerfiller.m_6180_("blockEntities");
        if (!this.pendingFreshBlockEntities.isEmpty()) {
            this.freshBlockEntities.addAll(this.pendingFreshBlockEntities);
            this.pendingFreshBlockEntities.clear();
        }

        this.f_151504_ = true;
        if (!this.freshBlockEntities.isEmpty()) {
            this.freshBlockEntities.forEach(IForgeBlockEntity::onLoad);
            this.freshBlockEntities.clear();
        }

        if (!this.f_151503_.isEmpty()) {
            this.f_151512_.addAll(this.f_151503_);
            this.f_151503_.clear();
        }

        Iterator iterator = this.f_151512_.iterator();

        while(iterator.hasNext()) {
            TickingBlockEntity tickingblockentity = (TickingBlockEntity)iterator.next();
            if (tickingblockentity.m_142220_()) {
                iterator.remove();
            } else if (this.m_220393_(tickingblockentity.m_142689_())) {
                TimeStopperMod.updateBlockEntity(tickingblockentity, (Level)this);
            }
        }

        this.f_151504_ = false;
        profilerfiller.m_7238_();
    }
}
*/