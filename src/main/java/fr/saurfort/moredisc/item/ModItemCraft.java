package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.MoreDisc;
import fr.saurfort.moredisc.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemCraft {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    // Item for all discs craft
    public static final RegistryObject<Item>VINYL = ITEM.register("vinyl", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(16).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BLANK_DISC = ITEM.register("blank_disc", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1).rarity(Rarity.COMMON)));

    // Gravity Falls book
    public static final RegistryObject<Item> GF_BOOK_1 = ITEM.register("gfbook_1", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_SEARCH).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GF_BOOK_2 = ITEM.register("gfbook_2", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_SEARCH).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GF_BOOK_3 = ITEM.register("gfbook_3", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_SEARCH).stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
