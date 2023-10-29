package fr.saurfort.moredisc.sound;

import fr.saurfort.moredisc.Reference;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<SoundEvent> BOSUN_BILL = SOUNDS.register("disc.bosun_bill", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.bosun_bill")));
    public static final RegistryObject<SoundEvent> BOT_FIGHT = SOUNDS.register("disc.botfight", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.botfight")));
    public static final RegistryObject<SoundEvent> DARKNESS = SOUNDS.register("disc.darkness", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.darkness")));
    public static final RegistryObject<SoundEvent> GRAVITY_FALLS = SOUNDS.register("disc.gravity_falls", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.gravity_falls")));
    public static final RegistryObject<SoundEvent> IM_BLUE = SOUNDS.register("disc.im_blue", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.im_blue")));
    public static final RegistryObject<SoundEvent> JINGLE_BELL = SOUNDS.register("disc.jingle_bell", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.jingle_bell")));
    public static final RegistryObject<SoundEvent> MARIO_THEME = SOUNDS.register("disc.mariotheme", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.mariotheme")));
    public static final RegistryObject<SoundEvent> MINECON_22 = SOUNDS.register("disc.minecon_22", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.minecon_22")));
    public static final RegistryObject<SoundEvent> ONE_TRILLION = SOUNDS.register("disc.one_trillion", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.one_trillion")));
    public static final RegistryObject<SoundEvent> SIMPSON = SOUNDS.register("disc.simpson", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.simpson")));
    public static final RegistryObject<SoundEvent> SOMEBODY_LIKE_ME = SOUNDS.register("disc.somebody_like_me", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.somebody_like_me")));
    public static final RegistryObject<SoundEvent>SWEET_DREAMS = SOUNDS.register("disc.sweet_dreams", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.sweet_dreams")));
    public static final RegistryObject<SoundEvent> TETRIS = SOUNDS.register("disc.tetris", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.tetris")));
    public static final RegistryObject<SoundEvent> THE_STORM = SOUNDS.register("disc.the_storm", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.the_storm")));
    public static final RegistryObject<SoundEvent> WE_ARE_ONE = SOUNDS.register("disc.we_are_one", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.we_are_one")));
    public static final RegistryObject<SoundEvent> WHAT_LOVE_K = SOUNDS.register("disc.what_love_k", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.what_love_k")));
    public static final RegistryObject<SoundEvent> WHY_DO_I = SOUNDS.register("disc.why_do_i", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.why_do_i")));


    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}
