package fr.saurfort.moredisc.data;

import fr.saurfort.moredisc.MoreDisc;
import fr.saurfort.moredisc.item.ModItemCraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreDisc.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VanillaTabs {
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItemCraft.VINYL);
            event.accept(ModItemCraft.BLANK_DISC);
        } else if (event.getTabKey() == CreativeModeTabs.SEARCH){
            event.accept(ModItemCraft.BOOK_1);
            event.accept(ModItemCraft.BOOK_2);
            event.accept(ModItemCraft.BOOK_3);
        }
    }
}
