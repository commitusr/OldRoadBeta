package net.cmd.oldroad.event;

import net.cmd.oldroad.Item.custom.ModArmorItem;
import net.cmd.oldroad.entity.clinet.armor.ModArmorRender;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ModArmorItem.class, new ModArmorRender());
    }
}
