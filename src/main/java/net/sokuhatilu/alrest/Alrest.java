package net.sokuhatilu.alrest;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sokuhatilu.alrest.item.AlrestItems;
import org.slf4j.Logger;

@Mod(Alrest.MOD_ID)
public class Alrest {
    public static final String MOD_ID = "alrest";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Alrest(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AlrestItems.register(eventBus);

        eventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
