package fr.saurfort.moredisc.sounds;

import fr.saurfort.moredisc.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<SoundEvent> ANTI_FUZE = SOUNDS.register("disc.anti-fuze", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.anti-fuze")));
    public static final RegistryObject<SoundEvent> CHAUSSURES_ROUGES = SOUNDS.register("disc.chaussures_rouges", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.chaussures_rouges")));
    public static final RegistryObject<SoundEvent> BOT_FIGHT = SOUNDS.register("disc.botfight", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.botfight")));
    public static final RegistryObject<SoundEvent> KUMIZ = SOUNDS.register("disc.clash_kumiz", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.clash_kumiz")));
    public static final RegistryObject<SoundEvent> DARKNESS = SOUNDS.register("disc.darkness", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.darkness")));
    public static final RegistryObject<SoundEvent> GRAVITY_FALLS = SOUNDS.register("disc.gravity_falls", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.gravity_falls")));
    public static final RegistryObject<SoundEvent> JINGLE_BELL = SOUNDS.register("disc.jingle_bell", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.jingle_bell")));
    public static final RegistryObject<SoundEvent> MARIO_THEME = SOUNDS.register("disc.mariotheme", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.mariotheme")));
    public static final RegistryObject<SoundEvent> MII_CHALLENGE = SOUNDS.register("disc.mii_challenge", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.mii_challenge")));
    public static final RegistryObject<SoundEvent> MINECON_22 = SOUNDS.register("disc.minecon_22", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.minecon_22")));
    public static final RegistryObject<SoundEvent> MORT_AVEC_TOI = SOUNDS.register("disc.mort_avec_toi", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.mort_avec_toi")));
    public static final RegistryObject<SoundEvent> ON_APPEL_FUZE = SOUNDS.register("disc.on_mappel_fuze", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.on_mappel_fuze")));
    public static final RegistryObject<SoundEvent> ONE_TRILLION = SOUNDS.register("disc.one_trillion", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.one_trillion")));
    public static final RegistryObject<SoundEvent> ROULETTE_PALADIENNES = SOUNDS.register("moredisc.roulette_paladiennes", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.roulette_paladiennes")));
    public static final RegistryObject<SoundEvent> RUSH_E = SOUNDS.register("disc.rush_e", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.rush_e")));
    public static final RegistryObject<SoundEvent> SOMEBODY_LIKE_ME = SOUNDS.register("disc.somebody_like_me", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.somebody_like_me")));
    public static final RegistryObject<SoundEvent> THE_STORM = SOUNDS.register("disc.the_storm", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.the_storm")));
    public static final RegistryObject<SoundEvent> UNIVERS_SORA = SOUNDS.register("disc.univers_sora", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.univers_sora")));
    public static final RegistryObject<SoundEvent> WHY_DO_I = SOUNDS.register("disc.why_do_i", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.why_do_i")));

}
