package fr.saurfort.moredisc.data;

import fr.saurfort.moredisc.Reference;
import fr.saurfort.moredisc.data.recipe.RecipeGenerator;
import fr.saurfort.moredisc.item.ModItemCraft;
import fr.saurfort.moredisc.loot.StructureLootModifier;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD )
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();

        if(e.includeServer()) {
            generator.addProvider(true ,new RecipeGenerator(generator));
        }
    }
}
