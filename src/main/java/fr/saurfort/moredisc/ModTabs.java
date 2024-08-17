package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItemCraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTabs {
    public static final ItemGroup MoreDisc = new ItemGroup(Reference.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemCraft.BLANK_DISC.get());
        }
    };
}
