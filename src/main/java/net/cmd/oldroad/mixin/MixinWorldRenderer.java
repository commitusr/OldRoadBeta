//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import xyz.przemyk.timestopper.TimeStopperMod;

@Mixin({LevelRenderer.class})
public abstract class MixinWorldRenderer implements ResourceManagerReloadListener, AutoCloseable {
    @Final
    @Shadow
    private EntityRenderDispatcher f_109463_;

    public MixinWorldRenderer() {
    }

    private void renderEntity(Entity entityIn, double camX, double camY, double camZ, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn) {
        double d0 = Mth.m_14139_((double)partialTicks, entityIn.f_19790_, entityIn.m_20185_());
        double d1 = Mth.m_14139_((double)partialTicks, entityIn.f_19791_, entityIn.m_20186_());
        double d2 = Mth.m_14139_((double)partialTicks, entityIn.f_19792_, entityIn.m_20189_());
        float f = Mth.m_14179_(partialTicks, entityIn.f_19859_, entityIn.m_146908_());
        this.f_109463_.m_114384_(entityIn, d0 - camX, d1 - camY, d2 - camZ, f, TimeStopperMod.canUpdateEntity(entityIn) ? partialTicks : 1.0F, poseStack, bufferIn, this.f_109463_.m_114394_(entityIn, partialTicks));
    }
}
*/