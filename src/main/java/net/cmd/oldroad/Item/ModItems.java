package net.cmd.oldroad.Item;

import net.cmd.oldroad.OldRoad;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, OldRoad.MOD_ID);

    public static final RegistryObject<Item> ARTEFACT = ITEMS.register("artifact",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB)));

    public static final RegistryObject<Item> WINE = ITEMS.register("wine",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
