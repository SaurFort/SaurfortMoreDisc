package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.ModTabs;
import fr.saurfort.moredisc.MoreDisc;
import fr.saurfort.moredisc.Reference;
import fr.saurfort.moredisc.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItem {
    public static final DeferredRegister<Item> DISC = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> BOSUN_BILL = DISC.register("bosun_bill", () -> new RecordItem(4, ModSounds.BOSUN_BILL, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2720));
    public static final RegistryObject<Item> BOT_FIGHT = DISC.register("bot_fight", () -> new RecordItem(4, ModSounds.BOT_FIGHT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6200));
    public static final RegistryObject<Item> DARKNESS = DISC.register("darkness", () -> new RecordItem(4, ModSounds.DARKNESS, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 5200));
    public static final RegistryObject<Item> GRAVITY_FALLS = DISC.register("gravity_falls", () -> new RecordItem(4, ModSounds.GRAVITY_FALLS, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 1920));
    public static final RegistryObject<Item> IM_BLUE = DISC.register("im_blue", () -> new RecordItem(4, ModSounds.IM_BLUE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5080));
    public static final RegistryObject<Item> JINGLE_BELL = DISC.register("jingle_bell", () -> new RecordItem(4, ModSounds.JINGLE_BELL, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3040));
    public static final RegistryObject<Item> MARIO_THEME = DISC.register("mario_theme_song", () -> new RecordItem(4, ModSounds.MARIO_THEME, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 2200));
    public static final RegistryObject<Item> MINECON_22 = DISC.register("minecon_22", () -> new RecordItem(4, ModSounds.MINECON_22, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2440));
    public static final RegistryObject<Item> ONE_TRILLION = DISC.register("one_trillion", () -> new RecordItem(4, ModSounds.ONE_TRILLION, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 2480));
    public static final RegistryObject<Item> SIMPSON = DISC.register("simpson", () -> new RecordItem(4, ModSounds.SIMPSON, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1600));
    public static final RegistryObject<Item> SOMEBODY_LIKE_ME = DISC.register("somebody_like_me", () -> new RecordItem(4, ModSounds.SOMEBODY_LIKE_ME, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4400));
    public static final RegistryObject<Item> SWEET_DREAMS = DISC.register("sweet_dreams", () -> new RecordItem(5, ModSounds.SWEET_DREAMS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4660));
    public static final RegistryObject<Item> TETRIS = DISC.register("tetris", () -> new RecordItem(4, ModSounds.TETRIS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4200));
    public static final RegistryObject<Item> THE_STORM = DISC.register("the_storm", () -> new RecordItem(4, ModSounds.THE_STORM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4280));
    public static final RegistryObject<Item> WE_ARE_ONE = DISC.register("we_are_one", () -> new RecordItem(4, ModSounds.WE_ARE_ONE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3000));
    public static final RegistryObject<Item> WHAT_LOVE_K = DISC.register("what_love_k", () -> new RecordItem(4, ModSounds.WHAT_LOVE_K, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5500));
    public static final RegistryObject<Item> WHY_DO_I = DISC.register("why_do_i", () -> new RecordItem(4, ModSounds.WHY_DO_I, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5320));



    public static void register(IEventBus eventBus) {
        DISC.register(eventBus);
    }
}
