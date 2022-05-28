package net.cmd.oldroad.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab OLDROAD_TAB = new CreativeModeTab("oldroadtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARTEFACT.get());
        }
    };
}
