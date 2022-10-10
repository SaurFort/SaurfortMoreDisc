package fr.saurfort.moredisc.objects.items;

import fr.saurfort.moredisc.MoreDisc;
import fr.saurfort.moredisc.items.ModItemTabs;
import fr.saurfort.moredisc.utils.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBaseTab extends Item implements IHasModel {
    public ItemBaseTab(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        ModItemTabs.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        MoreDisc.proxy.registerItemRenderer(this, 0);
    }
}
