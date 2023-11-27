package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import fr.saurfort.moredisc.sound.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
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
        ModSounds.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onGatherData);
        eventBus.addListener(this::addCreative);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        //LOGGER.info("Thanks for playing with Saurfort's MoreDisc");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItem.BOSUN_BILL);
            event.accept(ModItem.BOT_FIGHT);
            event.accept(ModItem.WHAT_LOVE_K);
            event.accept(ModItem.IM_BLUE);
            event.accept(ModItem.GRAVITY_FALLS);
            event.accept(ModItem.JINGLE_BELL);
            event.accept(ModItem.DARKNESS);
            event.accept(ModItem.MARIO_THEME);
            event.accept(ModItem.MINECON_22);
            event.accept(ModItem.ONE_TRILLION);
            event.accept(ModItem.SIMPSON);
            event.accept(ModItem.SOMEBODY_LIKE_ME);
            event.accept(ModItem.SWEET_DREAMS);
            event.accept(ModItem.TETRIS);
            event.accept(ModItem.THE_STORM);
            event.accept(ModItem.WE_ARE_ONE);
            event.accept(ModItem.WHY_DO_I);
        }

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItemCraft.VINYL);
            event.accept(ModItemCraft.BLANK_DISC);
            event.accept(ModItemCraft.BOOK_1);
            event.accept(ModItemCraft.BOOK_2);
            event.accept(ModItemCraft.BOOK_3);
        }

        /*if (event.getTab() == ModTabs.MOREDISC) {
            event.accept(ModItem.BOSUN_BILL);
            event.accept(ModItem.BOT_FIGHT);
            event.accept(ModItem.WHAT_LOVE_K);
            event.accept(ModItem.IM_BLUE);
            event.accept(ModItem.GRAVITY_FALLS);
            event.accept(ModItem.JINGLE_BELL);
            event.accept(ModItem.DARKNESS);
            event.accept(ModItem.MARIO_THEME);
            event.accept(ModItem.MINECON_22);
            event.accept(ModItem.ONE_TRILLION);
            event.accept(ModItem.SIMPSON);
            event.accept(ModItem.SOMEBODY_LIKE_ME);
            event.accept(ModItem.SWEET_DREAMS);
            event.accept(ModItem.TETRIS);
            event.accept(ModItem.THE_STORM);
            event.accept(ModItem.WE_ARE_ONE);
            event.accept(ModItem.WHY_DO_I);
        }*/
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        //LOGGER.info("Thanks for playing with Saurfort's MoreDisc");
    }

    private void onGatherData(GatherDataEvent dataEvent) {
        DataGenerator generator = dataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = dataEvent.getExistingFileHelper();
    }
}