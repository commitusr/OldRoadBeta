package net.cmd.oldroad.Item;

/*import net.cmd.oldroad.Item.custom.ModArmorItem;*/
import net.cmd.oldroad.Item.custom.ModArmorItem;
import net.cmd.oldroad.OldRoad;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, OldRoad.MOD_ID);

    public static final RegistryObject<Item> ARTEFACT = ITEMS.register("artefact",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB)));

    public static final RegistryObject<Item> WINE = ITEMS.register("wine",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB)));

    public static final RegistryObject<Item> PISTOLE = ITEMS.register("pistole",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GUN76 = ITEMS.register("76gunn",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> AK47 = ITEMS.register("ak",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> AK74 = ITEMS.register("ak74",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> AWP = ITEMS.register("awped",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> BEGBAZOOKA = ITEMS.register("beggars_bazooka",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DB = ITEMS.register("db",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> EXP618 = ITEMS.register("exp",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GRANADELAUNCHER = ITEMS.register("granade_l",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GRAYMOUSER = ITEMS.register("gray_mouser",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> LUGER = ITEMS.register("luger",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> M16 = ITEMS.register("m16",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MAGNUM = ITEMS.register("magnum",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MAUSER = ITEMS.register("mauser",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MAUSER98 = ITEMS.register("mauser98",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MOSIN = ITEMS.register("mosin",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MP18 = ITEMS.register("mp18",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MP40 = ITEMS.register("mp40",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NAGAN = ITEMS.register("nagan",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> PPS = ITEMS.register("pps",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SASHA = ITEMS.register("sasha",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SCOUTSCAT = ITEMS.register("scout_scat",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SPAS = ITEMS.register("spas",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SVK = ITEMS.register("svk",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TRENCHGUN = ITEMS.register("trench_gun",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> UZI = ITEMS.register("uzi",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> WINCHESTER = ITEMS.register("winchester",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> WX18N = ITEMS.register("wx18n",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> VSS = ITEMS.register("vss",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DZUSHANKA = ITEMS.register("dzushanka",
            () -> new ModArmorItem(ModArmorMaterials.ARTEFACT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.OLDROAD_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
