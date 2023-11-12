package net.sokuhatilu.alrest.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sokuhatilu.alrest.Alrest;
import net.sokuhatilu.alrest.AlrestCreativeModeTab;

public class AlrestItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Alrest.MOD_ID);

    public static final RegistryObject<Item> WORLDTREE_SEED = ITEMS.register("worldtree_seed",
            () -> new Item(new Item.Properties().tab(AlrestCreativeModeTab.ALREST_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
