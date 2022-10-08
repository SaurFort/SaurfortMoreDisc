package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import fr.saurfort.moredisc.item.ModItemTabs;
import fr.saurfort.moredisc.sound.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

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
        System.out.println("Thanks for play with Saurfort's MoreDisc");
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        //event.enqueueWork(ClientHandler::new);
    }

    private void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
    }
}