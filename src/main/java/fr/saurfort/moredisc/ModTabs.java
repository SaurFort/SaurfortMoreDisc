package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItemTabs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTabs {
    public static final ItemGroup CopyrightSound = new ItemGroup("copyright_sound") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemTabs.CS.get());
        }
    };

    public static final ItemGroup NoCopyrightSound = new ItemGroup("no_copyright_sound") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemTabs.NCS.get());
        }
    };
}
