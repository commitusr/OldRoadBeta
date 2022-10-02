package net.cmd.oldroad.block;

import net.cmd.oldroad.Item.ModCreativeModeTab;
import net.cmd.oldroad.Item.ModItems;
import net.cmd.oldroad.OldRoad;
import net.cmd.oldroad.block.custom.CameraBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OldRoad.MOD_ID);

    public static final RegistryObject<Block> MAGNET = registerBlock("magnet",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLDROAD_TAB);

    public static final RegistryObject<Block> CAMERA = registerBlock("camera",
            () -> new CameraBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()), ModCreativeModeTab.OLDROAD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T>block,
                                                                                 CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
