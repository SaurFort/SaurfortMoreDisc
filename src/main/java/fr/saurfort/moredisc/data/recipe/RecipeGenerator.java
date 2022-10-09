package fr.saurfort.moredisc.data.recipe;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
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
        ShapelessRecipeBuilder.shapeless(ModItemCraft.VINYL.get())
                .requires(Tags.Items.NUGGETS_IRON)
                .requires(Items.COAL)
                .unlockedBy("has_iron", has(Tags.Items.NUGGETS_IRON))
                .save(consumer);


        ShapelessRecipeBuilder.shapeless(ModItem.ANTI_FUZE.get())
                .requires(ModItem.ON_APPEL_FUZE.get())
                .requires(Items.IRON_SWORD)
                .unlockedBy("has_disc", has(ModItem.ON_APPEL_FUZE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.MINECON_22.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Items.RED_DYE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.CHAUSSURES_ROUGES.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Items.RED_DYE)
                .requires(Items.LEATHER_BOOTS)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.MORT_AVEC_TOI.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Items.SKELETON_SKULL)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.ON_APPEL_FUZE.get())
                .requires(Items.PLAYER_HEAD)
                .requires(ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.ONE_TRILLION.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Blocks.GRASS_BLOCK)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.THE_STORM.get())
                .requires(Blocks.LIGHTNING_ROD)
                .requires(ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.UNIVERS_SORA.get())
                .requires(Tags.Items.NETHER_STARS)
                .requires(ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);


            // shaped
        ShapedRecipeBuilder.shaped(ModItemCraft.BLANK_DISC.get())
                .pattern(" V ")
                .pattern("VIV")
                .pattern(" V ")
                .define('V', ModItemCraft.VINYL.get())
                .define('I', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_vinyl", has(ModItemCraft.VINYL.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.BOT_FIGHT.get())
                .pattern(" I ")
                .pattern("IBI")
                .pattern(" I ")
                .define('B', ModItemCraft.BLANK_DISC.get())
                .define('I', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.KUMIZ.get())
                .pattern("NIG")
                .pattern("IBI")
                .pattern("GIN")
                .define('N', Tags.Items.NUGGETS_GOLD)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('G', Items.GHAST_TEAR)
                .define('B', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.GRAVITY_FALLS.get())
                .pattern(" P ")
                .pattern(" D ")
                .pattern("ABC")
                .define('P', Items.PORKCHOP)
                .define('A', ModItemCraft.BOOK_1.get())
                .define('B', ModItemCraft.BOOK_2.get())
                .define('C', ModItemCraft.BOOK_3.get())
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.JINGLE_BELL.get())
                .pattern(" L ")
                .pattern("SBS")
                .pattern(" L ")
                .define('B', ModItemCraft.BLANK_DISC.get())
                .define('S', Items.SPRUCE_SAPLING)
                .define('L', Blocks.SPRUCE_LOG)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.MARIO_THEME.get())
                .pattern("RBR")
                .pattern("BDB")
                .pattern("RBR")
                .define('R', Items.RABBIT_FOOT)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('B', Items.BRICK)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.MII_CHALLENGE.get())
                .pattern("WBL")
                .pattern("BDB")
                .pattern("LBW")
                .define('B', Items.BLUE_DYE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('W', Items.WHITE_DYE)
                .define('L', Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.ROULETTE_PALADIENNES.get())
                .pattern("MLP")
                .pattern("ODC")
                .pattern("YRB")
                .define('M', Blocks.MAGENTA_CONCRETE)
                .define('L', Blocks.LIME_CONCRETE)
                .define('P', Blocks.PINK_CONCRETE)
                .define('O', Blocks.ORANGE_CONCRETE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('C', Blocks.CYAN_CONCRETE)
                .define('Y', Blocks.YELLOW_CONCRETE)
                .define('R', Blocks.RED_CONCRETE)
                .define('B', Blocks.BLUE_CONCRETE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.RUSH_E.get())
                .pattern("CCC")
                .pattern("DC ")
                .pattern("CCC")
                .define('C', Blocks.BLACK_CONCRETE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.SOMEBODY_LIKE_ME.get())
                .pattern("RHR")
                .pattern("RDR")
                .pattern(" R ")
                .define('R', Blocks.RED_CONCRETE)
                .define('H', Items.PLAYER_HEAD)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.WHY_DO_I.get())
                .pattern("CCC")
                .pattern("BDB")
                .pattern("CCC")
                .define('C', Blocks.WHITE_CONCRETE)
                .define('B', Blocks.BLACK_CONCRETE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_concrete_white", has(Blocks.WHITE_CONCRETE))
                .unlockedBy("has_concrete_black", has(Blocks.BLACK_CONCRETE))
                .unlockedBy("has_blank_disc", has(ModItemCraft.BLANK_DISC.get()))
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
