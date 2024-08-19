package fr.saurfort.moredisc.events;

import fr.saurfort.moredisc.Reference;
import fr.saurfort.moredisc.events.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new GravityFallsBookMansionLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "gfbook_1_spawn_in_manor")),
                new GravityFallsBookPillagerOutpostLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "gfbook_1_spawn_in_pillager_outpost")),
                new GravityFallsBookVillageLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "gfbook_1_spawn_in_village")),
                new GravityFallsBookBastionTreasureLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "gfbook_2_spawn_in_bastion_treasure")),
                new GravityFallsBookNetherBridgeLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "gfbook_2_spawn_in_nether_bridge")),
                new GravityFallsBookEndCityLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "gfbook_3_spawn_in_end_city")),
                new SkeletonLootModifier.Serializer().setRegistryName(new ResourceLocation(Reference.MOD_ID, "skeleton_loot_modifier"))
        );
    }
}
