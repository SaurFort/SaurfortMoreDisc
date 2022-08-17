package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItemTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab CopyrightSound = new CreativeModeTab("copyright_sound") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemTabs.CS.get());
        }
    };

    public static final CreativeModeTab NoCopyrightSound = new CreativeModeTab("no_copyright_sound") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemTabs.NCS.get());
        }
    };
}
