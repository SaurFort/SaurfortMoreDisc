package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.MoreDisc;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemCraft {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDisc.MODID);

    public static final RegistryObject<Item> VINYL = ITEM.register("vinyl", () -> new Item(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BLANK_DISC = ITEM.register("blank_disc", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

   public static final RegistryObject<Item> BOOK_1 = ITEM.register("book_1", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
   public static final RegistryObject<Item> BOOK_2 = ITEM.register("book_2", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
   public static final RegistryObject<Item> BOOK_3 = ITEM.register("book_3", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
}
