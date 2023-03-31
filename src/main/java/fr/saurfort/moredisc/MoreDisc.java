package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import fr.saurfort.moredisc.item.ModItemTabs;
import fr.saurfort.moredisc.sound.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(Reference.MOD_ID)
public class MoreDisc {
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(Reference.MOD_ID);

    public MoreDisc() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItem.register(eventBus);
        ModItemCraft.register(eventBus);
        ModItemTabs.register(eventBus);
        ModSounds.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onGatherData);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        //event.enqueueWork(CommonHandler::new);
        //LOGGER.info("Thanks for playing with Saurfort's MoreDisc");
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        //event.enqueueWork(ClientHandler::new);
        //LOGGER.info("Thanks for playing with Saurfort's MoreDisc");
    }

    private void onGatherData(GatherDataEvent dataEvent) {
        DataGenerator generator = dataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = dataEvent.getExistingFileHelper();
    }
}