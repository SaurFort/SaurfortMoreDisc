package fr.saurfort.moredisc.data.recipe;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
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

        ShapelessRecipeBuilder.shapeless(Items.PLAYER_HEAD)
                .requires(Items.ZOMBIE_HEAD)
                .requires(Items.CHARCOAL)
                .unlockedBy("has_head", has(Items.ZOMBIE_HEAD))
                .unlockedBy("has_charcoal", has(Items.CHARCOAL))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(Items.ZOMBIE_HEAD)
                .requires(Blocks.COAL_BLOCK)
                .requires(Items.CHARCOAL)
                .requires(ModItemCraft.BOOK_1.get())
                .unlockedBy("has_book1", has(ModItemCraft.BOOK_1.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItemCraft.BOOK_1.get())
                .requires(Items.BOOK)
                .requires(Items.RED_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Blocks.OAK_LOG)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItemCraft.BOOK_2.get())
                .requires(Items.BOOK)
                .requires(Items.RED_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Blocks.NETHER_BRICKS)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItemCraft.BOOK_3.get())
                .requires(Items.BOOK)
                .requires(Items.RED_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Blocks.END_STONE)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.SWEET_DREAMS.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Blocks.WHITE_BED)
                .requires(Items.PHANTOM_MEMBRANE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);



        ShapelessRecipeBuilder.shapeless(ModItem.MINECON_22.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Items.RED_DYE)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItem.IM_BLUE.get())
                .requires(ModItemCraft.BLANK_DISC.get())
                .requires(Blocks.BLUE_CONCRETE)
                .requires(Blocks.CYAN_CONCRETE)
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
                .define('H', Items.PLAYER_HEAD)
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

        ShapedRecipeBuilder.shaped(ModItem.WHY_DO_I.get())
                .pattern("CCC")
                .pattern("BDB")
                .pattern("CCC")
                .define('C', Blocks.WHITE_CONCRETE)
                .define('B', Blocks.BLACK_CONCRETE)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItem.WE_ARE_ONE.get())
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

        ShapedRecipeBuilder.shaped(ModItem.BOSUN_BILL.get())
                .pattern(" S ")
                .pattern("WDP")
                .pattern(" B ")
                .define('S', Blocks.PLAYER_HEAD)
                .define('W', Items.WATER_BUCKET)
                .define('D', ModItemCraft.BLANK_DISC.get())
                .define('P', Items.POTION)
                .define('B', Items.OAK_BOAT)
                .unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get()))
                .save(consumer);


        // Smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItemCraft.BLANK_DISC.get()), ModItem.DARKNESS.get(), 0.10f, 200).unlockedBy("has_disc", has(ModItemCraft.BLANK_DISC.get())).save(consumer);
    }
}
