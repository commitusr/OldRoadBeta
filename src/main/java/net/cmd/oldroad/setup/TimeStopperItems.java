/*//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package xyz.przemyk.timestopper.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.przemyk.timestopper.capabilities.control.TimeState;
import xyz.przemyk.timestopper.items.TimeStateSwitcherItem;

public class TimeStopperItems {
    private static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<TimeStateSwitcherItem> STOPPER;
    public static final RegistryObject<TimeStateSwitcherItem> ACCELERATOR;
    public static final RegistryObject<TimeStateSwitcherItem> DECELERATOR;

    public TimeStopperItems() {
    }

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "timestopper");
        STOPPER = ITEMS.register("timestopper", () -> {
            return new TimeStateSwitcherItem(TimeState.STOPPED);
        });
        ACCELERATOR = ITEMS.register("timeaccelerator", () -> {
            return new TimeStateSwitcherItem(TimeState.FAST);
        });
        DECELERATOR = ITEMS.register("timedecelerator", () -> {
            return new TimeStateSwitcherItem(TimeState.SLOW);
        });
    }
}
*/