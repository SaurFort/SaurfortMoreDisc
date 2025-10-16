package fr.saurfort.moredisc;

import com.mojang.logging.LogUtils;
import fr.saurfort.moredisc.data.VanillaTabs;
import fr.saurfort.moredisc.loot.ModLootModifiers;
import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import fr.saurfort.moredisc.sound.ModSounds;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreDisc.MODID)
public class MoreDisc
{
    public static final String MODID = "moredisc";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreDisc(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(VanillaTabs::addCreative);

        ModSounds.SOUNDS.register(modEventBus);
        ModItem.DISC.register(modEventBus);
        ModItemCraft.ITEM.register(modEventBus);
        ModTabs.TABS.register(modEventBus);

        ModLootModifiers.LOOT_MODIFIERS_SERIALIZERS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Thanks for playing with Saurfort's MoreDisc mod on your server!");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("Thanks for playing with Saurfort's MoreDisc mod!");
        }
    }
}
