package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.MoreDisc;
import fr.saurfort.moredisc.sound.ModSounds;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItem {
    public static final DeferredRegister<Item> DISC = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDisc.MODID);

    public static final RegistryObject<Item> BOSUN_BILL = registerDisc("bosun_bill", 4, () -> ModSounds.BOSUN_BILL.get(), Rarity.RARE, 2720);
    public static final RegistryObject<Item> BOT_FIGHT = registerDisc("bot_fight", 4, () -> ModSounds.BOT_FIGHT.get(), Rarity.RARE, 6200);
    public static final RegistryObject<Item> DARKNESS = registerDisc("darkness", 4, () -> ModSounds.DARKNESS.get(), Rarity.EPIC, 5200);
    public static final RegistryObject<Item> GRAVITY_FALLS = registerDisc("gravity_falls", 5, () -> ModSounds.GRAVITY_FALLS.get(), Rarity.EPIC, 1920);
    public static final RegistryObject<Item> IM_BLUE = registerDisc("im_blue", 4, () -> ModSounds.IM_BLUE.get(), Rarity.RARE, 5080);
    public static final RegistryObject<Item> JINGLE_BELL = registerDisc("jingle_bell", 4, () -> ModSounds.JINGLE_BELL.get(), Rarity.RARE, 3040);
    public static final RegistryObject<Item> MARIO_THEME = registerDisc("mario_theme", 4, () -> ModSounds.MARIO_THEME.get(), Rarity.EPIC, 2200);
    public static final RegistryObject<Item> SIMPSON = registerDisc("simpson", 4, () -> ModSounds.SIMPSON.get(), Rarity.RARE, 1600);
    public static final RegistryObject<Item> SOMEBODY_LIKE_ME = registerDisc("somebody_like_me", 4, () -> ModSounds.SOMEBODY_LIKE_ME.get(), Rarity.RARE, 4400);
    public static final RegistryObject<Item> SWEET_DREAMS = registerDisc("sweet_dreams", 4, () -> ModSounds.SWEET_DREAMS.get(), Rarity.RARE, 4660);
    public static final RegistryObject<Item> TETRIS = registerDisc("tetris", 4, () -> ModSounds.TETRIS.get(), Rarity.RARE, 4200);
    public static final RegistryObject<Item> THE_STORM = registerDisc("the_storm", 4, () -> ModSounds.THE_STORM.get(), Rarity.RARE, 4280);
    public static final RegistryObject<Item> WE_ARE_THE_NUMBER_ONE = registerDisc("we_are_the_number_one", 4, () -> ModSounds.WE_ARE_THE_NUMBER_ONE.get(), Rarity.RARE, 3000);
    public static final RegistryObject<Item> WHAT_LOVE_K = registerDisc("what_love_k", 4, () -> ModSounds.WHAT_LOVE_K.get(), Rarity.RARE, 5500);
    public static final RegistryObject<Item> WHY_DO_I = registerDisc("why_do_i", 4, () -> ModSounds.WHY_DO_I.get(), Rarity.RARE, 5320);

    private static RegistryObject<Item> registerDisc(String name, int comparatorValue, Supplier<SoundEvent> sound, Rarity rarity, int tickLength) {
        return DISC.register(name, () -> new RecordItem(comparatorValue, sound, new Item.Properties().stacksTo(1).rarity(rarity), tickLength));
    }
}