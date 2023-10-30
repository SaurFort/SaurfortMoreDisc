package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModTabs {
    public static CreativeModeTab MOREDISC;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MOREDISC = event.registerCreativeModeTab(new ResourceLocation(Reference.MOD_ID, "moredisc"), builder -> builder.icon(() -> new ItemStack(ModItemCraft.BLANK_DISC.get())).title(Component.translatable("creativemodetab.moredisc")));
    }
}
