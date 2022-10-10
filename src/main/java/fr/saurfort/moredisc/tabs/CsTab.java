package fr.saurfort.moredisc.tabs;

import fr.saurfort.moredisc.items.ModItemTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CsTab extends CreativeTabs {
    public CsTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItemTabs.CS);
    }
}
