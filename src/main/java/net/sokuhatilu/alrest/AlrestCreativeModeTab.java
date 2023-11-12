package net.sokuhatilu.alrest;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.sokuhatilu.alrest.item.AlrestItems;
import org.jetbrains.annotations.NotNull;

public class AlrestCreativeModeTab {
    public static final CreativeModeTab ALREST_TAB = new CreativeModeTab("alrest_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(AlrestItems.WORLDTREE_SEED.get());
        }
    };
}
