package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import fr.saurfort.moredisc.item.ModItemTabs;
import fr.saurfort.moredisc.sounds.ModSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class MoreDisc {
    public MoreDisc() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItem.DISC.register(eventBus);
        ModItemTabs.ITEMS.register(eventBus);
        ModSounds.SOUNDS.register(eventBus);
        ModItemCraft.ITEM.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void setup(FMLCommonSetupEvent e) {

    }

    private void clientSetup(FMLClientSetupEvent e) {

    }
}
