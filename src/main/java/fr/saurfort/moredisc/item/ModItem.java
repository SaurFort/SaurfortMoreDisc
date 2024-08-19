package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.ModTabs;
import fr.saurfort.moredisc.Reference;
import fr.saurfort.moredisc.sound.ModMusics;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModItem {
    public static final DeferredRegister<Item> DISC = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> BOSUN_BILL = DISC.register("bosun_bill", () -> new MusicDiscItem(4, ModMusics.BOSUN_BILL, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BOT_FIGHT = DISC.register("bot_fight", () -> new MusicDiscItem(4, ModMusics.BOT_FIGHT, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> DARKNESS = DISC.register("darkness", () -> new MusicDiscItem(4, ModMusics.DARKNESS, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GRAVITY_FALLS = DISC.register("gravity_falls", () -> new MusicDiscItem(5, ModMusics.GRAVITY_FALLS, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> IM_BLUE = DISC.register("im_blue", () -> new MusicDiscItem(4, ModMusics.IM_BLUE, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> JINGLE_BELL = DISC.register("jingle_bell", () -> new MusicDiscItem(4, ModMusics.JINGLE_BELL, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> MARIO_THEME = DISC.register("mario_theme_song", () -> new MusicDiscItem(4, ModMusics.MARIO_THEME, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> SIMPSON = DISC.register("simpson", () -> new MusicDiscItem(4, ModMusics.SIMPSON, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SOMEBODY_LIKE_ME = DISC.register("somebody_like_me", () -> new MusicDiscItem(4, ModMusics.SOMEBODY_LIKE_ME, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SWEET_DREAMS = DISC.register("sweet_dreams", () -> new MusicDiscItem(4, ModMusics.SWEET_DREAMS, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> TETRIS = DISC.register("tetris", () -> new MusicDiscItem(4, ModMusics.TETRIS, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> THE_STORM = DISC.register("the_storm", () -> new MusicDiscItem(4, ModMusics.THE_STORM, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> WE_ARE_THE_NUMBER_ONE = DISC.register("we_are_the_number_one", () -> new MusicDiscItem(4, ModMusics.WE_ARE_THE_NUMBER_ONE, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> WHAT_LOVE_K = DISC.register("what_love_k", () -> new MusicDiscItem(4, ModMusics.WHAT_LOVE_K, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> WHY_DO_I = DISC.register("why_do_i", () -> new MusicDiscItem(4, ModMusics.WHY_DO_I, new Item.Properties().tab(ModTabs.MoreDisc).stacksTo(1).rarity(Rarity.RARE)));


    public static void register(IEventBus eventBus) {
        DISC.register(eventBus);
    }
}
