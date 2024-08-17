package fr.saurfort.moredisc.sound;

import fr.saurfort.moredisc.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModMusics {
    public static final DeferredRegister<SoundEvent> MUSICS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<SoundEvent> BOSUN_BILL = registerMusic("disc.bosun_bill");
    public static final RegistryObject<SoundEvent> BOT_FIGHT = registerMusic("disc.bot_fight");
    public static final RegistryObject<SoundEvent> DARKNESS = registerMusic("disc.darkness");
    public static final RegistryObject<SoundEvent> GRAVITY_FALLS = registerMusic("disc.gravity_falls");
    public static final RegistryObject<SoundEvent> IM_BLUE = registerMusic("disc.im_blue");
    public static final RegistryObject<SoundEvent> JINGLE_BELL = registerMusic("disc.jingle_bell");
    public static final RegistryObject<SoundEvent> MARIO_THEME = registerMusic("disc.mario_theme");
    public static final RegistryObject<SoundEvent> SIMPSON = registerMusic("disc.simpson");
    public static final RegistryObject<SoundEvent> SOMEBODY_LIKE_ME = registerMusic("disc.somebody_like_me");
    public static final RegistryObject<SoundEvent> SWEET_DREAMS = registerMusic("disc.sweet_dreams");
    public static final RegistryObject<SoundEvent> TETRIS = registerMusic("disc.tetris");
    public static final RegistryObject<SoundEvent> THE_STORM = registerMusic("disc.the_storm");
    public static final RegistryObject<SoundEvent> WE_ARE_THE_NUMBER_ONE = registerMusic("disc.we_are_the_number_one");
    public static final RegistryObject<SoundEvent> WHAT_LOVE_K = registerMusic("disc.what_love_k");
    public static final RegistryObject<SoundEvent> WHY_DO_I = registerMusic("disc.why_do_i");

    public static void register(IEventBus eventBus) {
        MUSICS.register(eventBus);
    }

    private static RegistryObject<SoundEvent> registerMusic(String name) {
        return MUSICS.register(name, () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, name)));
    }
}
