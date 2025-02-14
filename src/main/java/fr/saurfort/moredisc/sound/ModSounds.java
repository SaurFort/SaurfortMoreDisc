package fr.saurfort.moredisc.sound;

import fr.saurfort.moredisc.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<SoundEvent> BOSUN_BILL = registerSound("disc.bosun_bill");
    public static final RegistryObject<SoundEvent> BOT_FIGHT = registerSound("disc.bot_fight");
    public static final RegistryObject<SoundEvent> DARKNESS = registerSound("disc.darkness");
    public static final RegistryObject<SoundEvent> GRAVITY_FALLS = registerSound("disc.gravity_falls");
    public static final RegistryObject<SoundEvent> IM_BLUE = registerSound("disc.im_blue");
    public static final RegistryObject<SoundEvent> JINGLE_BELL = registerSound("disc.jingle_bell");
    public static final RegistryObject<SoundEvent> MARIO_THEME = registerSound("disc.mario_theme");
    public static final RegistryObject<SoundEvent> SIMPSON = registerSound("disc.simpson");
    public static final RegistryObject<SoundEvent> SOMEBODY_LIKE_ME = registerSound("disc.somebody_like_me");
    public static final RegistryObject<SoundEvent> SWEET_DREAMS = registerSound("disc.sweet_dreams");
    public static final RegistryObject<SoundEvent> TETRIS = registerSound("disc.tetris");
    public static final RegistryObject<SoundEvent> THE_STORM = registerSound("disc.the_storm");
    public static final RegistryObject<SoundEvent> WE_ARE_THE_NUMBER_ONE = registerSound("disc.we_are_the_number_one");
    public static final RegistryObject<SoundEvent> WHAT_LOVE_K = registerSound("disc.what_love_k");
    public static final RegistryObject<SoundEvent> WHY_DO_I = registerSound("disc.why_do_i");

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }

    private static RegistryObject<SoundEvent> registerSound(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, name)));
    }
}
