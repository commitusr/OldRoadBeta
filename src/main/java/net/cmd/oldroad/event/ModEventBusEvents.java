package net.cmd.oldroad.event;

import net.cmd.oldroad.Item.custom.GasmaskArmorItem;
import net.cmd.oldroad.Item.custom.ushankaArmorItem;
import net.cmd.oldroad.OldRoad;
import net.cmd.oldroad.entity.clinet.armor.GasmaskArmorRender;
import net.cmd.oldroad.entity.clinet.armor.UshankaArmorRender;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
@Mod.EventBusSubscriber(modid = OldRoad.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ushankaArmorItem.class, new UshankaArmorRender());
        GeoArmorRenderer.registerArmorRenderer(GasmaskArmorItem.class, new GasmaskArmorRender());
    }
}
