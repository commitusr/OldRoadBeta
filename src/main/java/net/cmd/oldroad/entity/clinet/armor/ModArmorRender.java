package net.cmd.oldroad.entity.clinet.armor;


import net.cmd.oldroad.Item.custom.ModArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ModArmorRender extends GeoArmorRenderer<ModArmorItem> {

    public ModArmorRender() {
        super(new ModArmorModel());
        this.headBone = "headBone";
    }
}

