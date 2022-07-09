package net.cmd.oldroad.entity.clinet.armor;

import net.cmd.oldroad.Item.custom.ModArmorItem;
import net.cmd.oldroad.OldRoad;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModArmorModel extends AnimatedGeoModel<ModArmorItem> {
    @Override
    public ResourceLocation getModelLocation(ModArmorItem object) {
        return new ResourceLocation(OldRoad.MOD_ID, "geo/dzushanka.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ModArmorItem object) {
        return new ResourceLocation(OldRoad.MOD_ID, "textures/item/dzushanka.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ModArmorItem animatable) {
        return new ResourceLocation(OldRoad.MOD_ID, "animations/armor_animation.json");
    }
}
