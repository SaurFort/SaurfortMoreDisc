package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import fr.saurfort.moredisc.sound.ModMusics;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class MoreDisc {
    public static final Logger LOGGER = LogManager.getLogger("MoreDisc");

    public MoreDisc() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItemCraft.register(eventBus);
        ModItem.register(eventBus);
        ModMusics.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onGatherData);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Thanks for playing with SaurFort's MoreDiscs on server!");
    }

    private void onClientSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Thanks for playing with SaurFort's MoreDiscs!");
    }

    private void onGatherData(GatherDataEvent event) {

    }
}
