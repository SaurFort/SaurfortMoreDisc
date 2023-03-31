package fr.saurfort.moredisc.data;

import fr.saurfort.moredisc.Reference;
import fr.saurfort.moredisc.data.recipe.RecipeGenerator;
import net.minecraft.data.DataGenerator;
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
