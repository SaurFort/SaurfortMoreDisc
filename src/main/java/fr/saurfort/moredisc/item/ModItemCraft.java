package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemCraft {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    // Items for Craft all disc
    public static final RegistryObject<Item> VINYL = ITEM.register("vinyl", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(16).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BLANK_DISC = ITEM.register("blank_disc", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1).rarity(Rarity.UNCOMMON)));

    // Gravity Falls book
    public static final RegistryObject<Item> BOOK_1 = ITEM.register("book_1", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_SEARCH).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BOOK_2 = ITEM.register("book_2", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_SEARCH).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BOOK_3 = ITEM.register("book_3", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_SEARCH).stacksTo(1).rarity(Rarity.RARE)));

}
