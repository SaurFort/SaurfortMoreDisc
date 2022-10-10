package fr.saurfort.moredisc.items;

import fr.saurfort.moredisc.objects.items.ItemBaseTab;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItemTabs {
    public static List<Item> ITEMS = new ArrayList<Item>();

    public static final Item NCS = new ItemBaseTab("ncs_logo");
    public static final Item CS = new ItemBaseTab("cs_logo");
}
