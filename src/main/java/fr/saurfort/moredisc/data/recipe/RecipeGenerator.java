package fr.saurfort.moredisc.data.recipe;

import fr.saurfort.moredisc.item.ModItem;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        //Crafting table
            // shapeless
        ShapelessRecipeBuilder.shapeless(ModItem.ANTI_FUZE.get())
                .requires(ModItem.ON_APPEL_FUZE.get())
                .requires(Items.IRON_SWORD)
                .unlockedBy("has_disc", has(ModItem.ON_APPEL_FUZE.get()))
                .unlockedBy("has_iron_sword", has(Items.IRON_SWORD))
                .save(consumer);


            // shaped
        ShapedRecipeBuilder.shaped(ModItem.BOT_FIGHT.get())
                .pattern(" I ")
                .pattern("IBI")
                .pattern(" I ")
                .define('B', Blocks.IRON_BLOCK)
                .define('I', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_iron_block", has(Blocks.IRON_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.CHAUSSURES_ROUGES.get())
                .pattern(" I ")
                .pattern("IBI")
                .pattern(" I ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('B', Items.LEATHER_BOOTS)
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_boots", has(Items.LEATHER_BOOTS))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.KUMIZ.get())
                .pattern("NIG")
                .pattern("IHI")
                .pattern("GIN")
                .define('N', Tags.Items.NUGGETS_GOLD)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('G', Items.GHAST_TEAR)
                .define('H', Items.PLAYER_HEAD)
                .unlockedBy("has_gold", has(Tags.Items.NUGGETS_GOLD))
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_tear", has(Items.GHAST_TEAR))
                .unlockedBy("has_head", has(Items.PLAYER_HEAD))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.JINGLE_BELL.get())
                .pattern(" I ")
                .pattern("ISI")
                .pattern(" I ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Items.SPRUCE_SAPLING)
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_sapling", has(Items.SPRUCE_SAPLING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.MARIO_THEME.get())
                .pattern("RIR")
                .pattern("ISI")
                .pattern("RIR")
                .define('R', Items.RABBIT_FOOT)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Items.SUGAR)
                .unlockedBy("has_rabbit_foot", has(Items.RABBIT_FOOT))
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.MII_CHALLENGE.get())
                .pattern("BIL")
                .pattern("IWI")
                .pattern("LIB")
                .define('B', Items.BLUE_DYE)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('W', Items.WHITE_DYE)
                .define('L', Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_blue", has(Items.BLUE_DYE))
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_white", has(Items.WHITE_DYE))
                .unlockedBy("has_light_blue", has(Items.LIGHT_BLUE_DYE))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.ON_APPEL_FUZE.get())
                .pattern(" I ")
                .pattern("IHI")
                .pattern(" I ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('H', Items.PLAYER_HEAD)
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_head", has(Items.PLAYER_HEAD))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.ROULETTE_PALADIENNES.get())
                .pattern("MLP")
                .pattern("ODC")
                .pattern("YRB")
                .define('M', Blocks.MAGENTA_CONCRETE)
                .define('L', Blocks.LIME_CONCRETE)
                .define('P', Blocks.PINK_CONCRETE)
                .define('O', Blocks.ORANGE_CONCRETE)
                .define('D', Items.MUSIC_DISC_STRAD)
                .define('C', Blocks.CYAN_CONCRETE)
                .define('Y', Blocks.YELLOW_CONCRETE)
                .define('R', Blocks.RED_CONCRETE)
                .define('B', Blocks.BLUE_CONCRETE)
                .unlockedBy("has_disc_strad", has(Items.MUSIC_DISC_STRAD))
                .unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE))
                .unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE))
                .unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE))
                .unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE))
                .unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE))
                .unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE))
                .unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE))
                .unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.RUSH_E.get())
                .pattern("CCC")
                .pattern("CCD")
                .pattern("CCC")
                .define('C', Blocks.BLACK_CONCRETE)
                .define('D', Items.MUSIC_DISC_13)
                .unlockedBy("has_concrete", has(Blocks.BLACK_CONCRETE))
                .unlockedBy("has_disc13", has(Items.MUSIC_DISC_13))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.SOMEBODY_LIKE_ME.get())
                .pattern("RIR")
                .pattern("RHR")
                .pattern("IRI")
                .define('R', Blocks.RED_CONCRETE)
                .define('H', Items.PLAYER_HEAD)
                .define('I', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_concrete", has(Blocks.RED_CONCRETE))
                .unlockedBy("has_head", has(Items.PLAYER_HEAD))
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.UNIVERS_SORA.get())
                .pattern(" I ")
                .pattern("ISI")
                .pattern(" I ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Tags.Items.NETHER_STARS)
                .unlockedBy("has_nether_stars", has(Tags.Items.NETHER_STARS))
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.WHY_DO_I.get())
                .pattern("III")
                .pattern("BIB")
                .pattern("III")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('B', Blocks.BLACK_CONCRETE)
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_concrete", has(Blocks.BLACK_CONCRETE))
                .save(consumer);


            // Other craft (no disc craft)
        ShapelessRecipeBuilder.shapeless(Items.PLAYER_HEAD)
                .requires(Items.ZOMBIE_HEAD)
                .requires(Items.CHARCOAL)
                .unlockedBy("has_head", has(Items.ZOMBIE_HEAD))
                .unlockedBy("has_charcoal", has(Items.CHARCOAL))
                .save(consumer);


        // Smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.MUSIC_DISC_11), ModItem.DARKNESS.get(), 0.10f, 200).unlockedBy("has_disc11", has(Items.MUSIC_DISC_11)).save(consumer);
    }
}
