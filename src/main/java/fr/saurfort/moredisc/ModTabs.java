package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItemCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab MoreDisc = new CreativeModeTab("moredisc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemCraft.BLANK_DISC.get());
        }
    };
}
