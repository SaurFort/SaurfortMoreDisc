package fr.saurfort.moredisc.data.recipe;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {
    public RecipeGenerator(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        // Crafting table
            // Shapeless
        ShapelessRecipeBuilder.shapeless(ModItemCraft.VINYL.get())
                .requires(Tags.Items.NUGGETS_IRON)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_dyes", has(Tags.Items.DYES))
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.IM_BLUE.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Blocks.BLUE_CONCRETE)
                .requires(Blocks.CYAN_CONCRETE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.SWEET_DREAMS.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Blocks.WHITE_BED)
                .requires(Items.PHANTOM_MEMBRANE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.THE_STORM.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Items.IRON_SWORD)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);


            // Shaped
        ShapedRecipeBuilder.shaped(ModItemCraft.BLANK_DISC.get())
                .pattern(" V ")
                .pattern("VIV")
                .pattern(" V ")
                .define('V', ModItemCraft.VINYL.get())
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .unlockedBy("has_vinyl", has(ModItemCraft.VINYL.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.BOSUN_BILL.get())
                .pattern(" SL")
                .pattern("WDF")
                .pattern(" B ")
                .define('S', Items.SKELETON_SKULL)
                .define('L', Blocks.BLACK_WOOL)
                .define('F', Items.FEATHER)
                .define('W', Items.WATER_BUCKET)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('B', Items.SPRUCE_BOAT)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.BOT_FIGHT.get())
                .pattern(" I ")
                .pattern("SBS")
                .pattern(" I ")
                .define('B', ModItemCraft.BLANK_DISC.get())
                .define('S', Items.IRON_SWORD)
                .define('I', Blocks.IRON_BLOCK)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.GRAVITY_FALLS.get())
                .pattern(" P ")
                .pattern("ADB")
                .pattern(" C ")
                .define('P', Items.PORKCHOP)
                .define('A', ModItemCraft.GF_BOOK_1.get())
                .define('B', ModItemCraft.GF_BOOK_2.get())
                .define('C', ModItemCraft.GF_BOOK_3.get())
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.JINGLE_BELL.get())
                .pattern(" B ")
                .pattern("SDS")
                .pattern(" B ")
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('S', Items.SPRUCE_SAPLING)
                .define('B', Items.SWEET_BERRIES)
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

        ShapedRecipeBuilder.shaped(ModItem.SIMPSON.get())
                .pattern(" S ")
                .pattern("PDC")
                .define('S', Items.CAKE)
                .define('P', Items.PUMPKIN_PIE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('C', Items.COOKIE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.SOMEBODY_LIKE_ME.get())
                .pattern("RHR")
                .pattern("RDR")
                .pattern(" R ")
                .define('R', Blocks.RED_CONCRETE)
                .define('H', Tags.Items.HEADS)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.TETRIS.get())
                .pattern("BOY")
                .pattern("PDM")
                .pattern(" G ")
                .define('B', Blocks.BLUE_CONCRETE)
                .define('O', Blocks.ORANGE_CONCRETE)
                .define('Y', Blocks.YELLOW_CONCRETE)
                .define('P', Blocks.PURPLE_CONCRETE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('M', Blocks.BROWN_CONCRETE)
                .define('G', Blocks.GREEN_CONCRETE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.WE_ARE_THE_NUMBER_ONE.get())
                .pattern("BCB")
                .pattern("CDB")
                .pattern("CCC")
                .define('C', Blocks.WHITE_CONCRETE)
                .define('B', Blocks.BLACK_CONCRETE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.WHAT_LOVE_K.get())
                .pattern("B B")
                .pattern("BS ")
                .pattern("B B")
                .define('B', Blocks.BLACK_CONCRETE)
                .define('S', ModItem.SOMEBODY_LIKE_ME.get())
                .unlockedBy("has_disc", has(ModItem.SOMEBODY_LIKE_ME.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.WHY_DO_I.get())
                .pattern("CCC")
                .pattern("BDB")
                .pattern("CCC")
                .define('C', Blocks.WHITE_CONCRETE)
                .define('B', Blocks.BLACK_CONCRETE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);


        // Smelting
        CookingRecipeBuilder.smelting(Ingredient.of(ModItemCraft.BLANK_DISC.get()), ModItem.DARKNESS.get(), 0.10f, 200).unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get())).save(consumer);
    }
}
