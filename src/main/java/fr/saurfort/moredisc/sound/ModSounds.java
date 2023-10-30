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

    public static final RegistryObject<SoundEvent> BOSUN_BILL = registerSoundEvent("disc.bosun_bill");
    public static final RegistryObject<SoundEvent> BOT_FIGHT = registerSoundEvent("disc.bot_fight");
    public static final RegistryObject<SoundEvent> DARKNESS = registerSoundEvent("disc.darkness");
    public static final RegistryObject<SoundEvent> GRAVITY_FALLS = registerSoundEvent("disc.gravity_falls");
    public static final RegistryObject<SoundEvent> IM_BLUE = registerSoundEvent("disc.im_blue");
    public static final RegistryObject<SoundEvent> JINGLE_BELL = registerSoundEvent("disc.jingle_bell");
    public static final RegistryObject<SoundEvent> MARIO_THEME = registerSoundEvent("disc.mario_theme");
    public static final RegistryObject<SoundEvent> MINECON_22 = registerSoundEvent("disc.minecon_22");
    public static final RegistryObject<SoundEvent> ONE_TRILLION = registerSoundEvent("disc.one_trillion");
    public static final RegistryObject<SoundEvent> SIMPSON = registerSoundEvent("disc.simpson");
    public static final RegistryObject<SoundEvent> SOMEBODY_LIKE_ME = registerSoundEvent("disc.somebody_like_me");
    public static final RegistryObject<SoundEvent>SWEET_DREAMS = registerSoundEvent("disc.sweet_dreams");
    public static final RegistryObject<SoundEvent> TETRIS = registerSoundEvent("disc.tetris");
    public static final RegistryObject<SoundEvent> THE_STORM = registerSoundEvent("disc.the_storm");
    public static final RegistryObject<SoundEvent> WE_ARE_ONE = registerSoundEvent("disc.we_are_one");
    public static final RegistryObject<SoundEvent> WHAT_LOVE_K = registerSoundEvent("disc.what_love_k");
    public static final RegistryObject<SoundEvent> WHY_DO_I = registerSoundEvent("disc.why_do_i");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(Reference.MOD_ID, name);
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}
