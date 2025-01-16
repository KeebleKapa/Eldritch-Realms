package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.SmithingTransformRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class EldritchRealmsRecipeProvider extends FabricRecipeProvider {
    public static final List<ItemConvertible> CRACKED_ABYSSAL_GRANITE_BRICKS_SMELTING = List.of(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
    public static final List<ItemConvertible> VEILSTONE_SMELTING = List.of(EldritchRealmsBlocks.COBBLED_VEILSTONE);
    public static final List<ItemConvertible> SMOOTH_VEILSTONE_SMELTING = List.of(EldritchRealmsBlocks.VEILSTONE);
    public static final List<ItemConvertible> CRACKED_SHADOWSLATE_BRICKS_SMELTING = List.of(EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
    public static final List<ItemConvertible> CRACKED_SHADOWSLATE_TILES_SMELTING = List.of(EldritchRealmsBlocks.SHADOWSLATE_TILES);
    public static final List<ItemConvertible> SMOOTH_ASTRAL_SANDSTONE_SMELTING = List.of(EldritchRealmsBlocks.ASTRAL_SANDSTONE);
    public static final List<ItemConvertible> SMOOTH_DREADQUARTZ_SMELTING = List.of(EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
    public static final List<ItemConvertible> DREADQUARTZ_SMELTING = List.of(EldritchRealmsBlocks.VEILSTONE_DREADQUARTZ_ORE, EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE);
    public static final List<ItemConvertible> ASTRAL_SAND_GLASS_SMELTING = List.of(EldritchRealmsBlocks.ASTRAL_SAND);
    public static final List<ItemConvertible> ALK_WHEAT_SMELTING = List.of(EldritchRealmsItems.ALK_WHEAT);

    public EldritchRealmsRecipeProvider(FabricDataOutput output) {super(output);}

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        // Abyssal Granite
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.ABYSSAL_GRANITE)
                .criterion(hasItem(EldritchRealmsBlocks.ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE)
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE, 1)
                .input(EldritchRealmsBlocks.ABYSSAL_GRANITE)
                .input(Blocks.VINE)
                .criterion(hasItem(EldritchRealmsBlocks.ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.ABYSSAL_GRANITE))
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE, 1)
                .input(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE)
                .input(Blocks.VINE)
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE))
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS, 1)
                .input(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS, 1)
                .input(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS)));

        offerSmelting(exporter, CRACKED_ABYSSAL_GRANITE_BRICKS_SMELTING, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS,
                0.1f, 200, "cracked_abyssal_granite_bricks_smelting");

        // Abyssal Granite Stairs
        createStairsRecipe(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);

        // Abyssal Granite Slabs
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE))
                .criterion(hasItem(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE), conditionsFromItem(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE, 2);

        // Abyssal Granite Walls
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Veilstone
        offerSmelting(exporter, SMOOTH_VEILSTONE_SMELTING, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE,
                0.1f, 200, "smooth_veilstone_smelting");

        offerSmelting(exporter, VEILSTONE_SMELTING, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE,
                0.1f, 200, "veilstone_smelting");


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICKS, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.VEILSTONE)
                .criterion(hasItem(EldritchRealmsBlocks.VEILSTONE), conditionsFromItem(EldritchRealmsBlocks.VEILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.VEILSTONE_BRICKS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICKS, EldritchRealmsBlocks.VEILSTONE);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_WALL, EldritchRealmsBlocks.VEILSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL, EldritchRealmsBlocks.SMOOTH_VEILSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_WALL, EldritchRealmsBlocks.VEILSTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL, EldritchRealmsBlocks.COBBLED_VEILSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_WALL, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_WALL, EldritchRealmsBlocks.VEILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_WALL, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL, EldritchRealmsBlocks.COBBLED_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL, EldritchRealmsBlocks.SMOOTH_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS, EldritchRealmsBlocks.VEILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_STAIRS, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS, EldritchRealmsBlocks.COBBLED_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS, EldritchRealmsBlocks.SMOOTH_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB, EldritchRealmsBlocks.VEILSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB, EldritchRealmsBlocks.VEILSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_SLAB, EldritchRealmsBlocks.VEILSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB, EldritchRealmsBlocks.COBBLED_VEILSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB, EldritchRealmsBlocks.SMOOTH_VEILSTONE, 2);


        createStairsRecipe(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.COBBLED_VEILSTONE))
                .criterion(hasItem(EldritchRealmsBlocks.COBBLED_VEILSTONE), conditionsFromItem(EldritchRealmsBlocks.COBBLED_VEILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.VEILSTONE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.VEILSTONE))
                .criterion(hasItem(EldritchRealmsBlocks.VEILSTONE), conditionsFromItem(EldritchRealmsBlocks.VEILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.VEILSTONE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.SMOOTH_VEILSTONE))
                .criterion(hasItem(EldritchRealmsBlocks.SMOOTH_VEILSTONE), conditionsFromItem(EldritchRealmsBlocks.SMOOTH_VEILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.VEILSTONE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.VEILSTONE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.VEILSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS)));


        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.COBBLED_VEILSTONE))
                .criterion(hasItem(EldritchRealmsBlocks.COBBLED_VEILSTONE), conditionsFromItem(EldritchRealmsBlocks.COBBLED_VEILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.VEILSTONE))
                .criterion(hasItem(EldritchRealmsBlocks.VEILSTONE), conditionsFromItem(EldritchRealmsBlocks.VEILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.VEILSTONE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.SMOOTH_VEILSTONE))
                .criterion(hasItem(EldritchRealmsBlocks.SMOOTH_VEILSTONE), conditionsFromItem(EldritchRealmsBlocks.SMOOTH_VEILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.VEILSTONE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.VEILSTONE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.VEILSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB)));

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Gloomarble
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.GLOOMARBLE)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', EldritchRealmsItems.GLOOMARBLE_DUST)
                .criterion(hasItem(EldritchRealmsItems.GLOOMARBLE_DUST), conditionsFromItem(EldritchRealmsItems.GLOOMARBLE_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsItems.GLOOMARBLE_DUST)));


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        // Shadowslate
        offerSmelting(exporter, CRACKED_SHADOWSLATE_BRICKS_SMELTING, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS,
                0.1f, 200, "cracked_shadowslate_bricks_smelting");

        offerSmelting(exporter, CRACKED_SHADOWSLATE_TILES_SMELTING, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES,
                0.1f, 200, "cracked_shadowslate_tiles_smelting");


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.SHADOWSLATE)
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_SHADOWSLATE)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE, EldritchRealmsBlocks.SHADOWSLATE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICKS, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.POLISHED_SHADOWSLATE)
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_SHADOWSLATE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_SHADOWSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_BRICKS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICKS, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILES, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.SHADOWSLATE_BRICKS)
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_TILES)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILES, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILES, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILES, EldritchRealmsBlocks.SHADOWSLATE_BRICKS);


        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_WALL, EldritchRealmsBlocks.SHADOWSLATE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL, EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL, EldritchRealmsBlocks.SHADOWSLATE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES);


        createStairsRecipe(EldritchRealmsBlocks.SHADOWSLATE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.SHADOWSLATE))
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.POLISHED_SHADOWSLATE))
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_SHADOWSLATE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_SHADOWSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.SHADOWSLATE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.SHADOWSLATE_TILES))
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE_TILES), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS)));

        createStairsRecipe(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES), conditionsFromItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS)));


        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.SHADOWSLATE))
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.POLISHED_SHADOWSLATE))
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_SHADOWSLATE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_SHADOWSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.SHADOWSLATE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.SHADOWSLATE_TILES))
                .criterion(hasItem(EldritchRealmsBlocks.SHADOWSLATE_TILES), conditionsFromItem(EldritchRealmsBlocks.SHADOWSLATE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES))
                .criterion(hasItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES), conditionsFromItem(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB)));


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_STAIRS, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS, EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS, EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS, EldritchRealmsBlocks.SHADOWSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_SLAB, EldritchRealmsBlocks.SHADOWSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB, EldritchRealmsBlocks.SHADOWSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB, EldritchRealmsBlocks.SHADOWSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB, EldritchRealmsBlocks.SHADOWSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB, EldritchRealmsBlocks.POLISHED_SHADOWSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB, EldritchRealmsBlocks.POLISHED_SHADOWSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB, EldritchRealmsBlocks.POLISHED_SHADOWSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB, EldritchRealmsBlocks.SHADOWSLATE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB, EldritchRealmsBlocks.SHADOWSLATE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB, EldritchRealmsBlocks.SHADOWSLATE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_WALL, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL, EldritchRealmsBlocks.SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL, EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL, EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL, EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL, EldritchRealmsBlocks.SHADOWSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL, EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS);

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Crimson Cobble
        createStairsRecipe(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .criterion(hasItem(EldritchRealmsBlocks.CRIMSON_COBBLE), conditionsFromItem(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .criterion(hasItem(EldritchRealmsBlocks.CRIMSON_COBBLE), conditionsFromItem(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB)));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRIMSON_COBBLE_WALL, EldritchRealmsBlocks.CRIMSON_COBBLE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS, EldritchRealmsBlocks.CRIMSON_COBBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB, EldritchRealmsBlocks.CRIMSON_COBBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRIMSON_COBBLE_WALL, EldritchRealmsBlocks.CRIMSON_COBBLE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_AXE)
                .pattern(" SS")
                .pattern(" WS")
                .pattern(" W ")
                .input('S', EldritchRealmsBlocks.CRIMSON_COBBLE)
                .input('W', Items.STICK)
                .criterion(hasItem(EldritchRealmsBlocks.CRIMSON_COBBLE), conditionsFromItem(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.STONE_AXE) + "_from_crimson"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_HOE)
                .pattern(" SS")
                .pattern(" W ")
                .pattern(" W ")
                .input('S', EldritchRealmsBlocks.CRIMSON_COBBLE)
                .input('W', Items.STICK)
                .criterion(hasItem(EldritchRealmsBlocks.CRIMSON_COBBLE), conditionsFromItem(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.STONE_HOE) + "_from_crimson"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_PICKAXE)
                .pattern("SSS")
                .pattern(" W ")
                .pattern(" W ")
                .input('S', EldritchRealmsBlocks.CRIMSON_COBBLE)
                .input('W', Items.STICK)
                .criterion(hasItem(EldritchRealmsBlocks.CRIMSON_COBBLE), conditionsFromItem(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.STONE_PICKAXE) + "_from_crimson"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_SHOVEL)
                .pattern(" S ")
                .pattern(" W ")
                .pattern(" W ")
                .input('S', EldritchRealmsBlocks.CRIMSON_COBBLE)
                .input('W', Items.STICK)
                .criterion(hasItem(EldritchRealmsBlocks.CRIMSON_COBBLE), conditionsFromItem(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.STONE_SHOVEL) + "_from_crimson"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_SWORD)
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" W ")
                .input('S', EldritchRealmsBlocks.CRIMSON_COBBLE)
                .input('W', Items.STICK)
                .criterion(hasItem(EldritchRealmsBlocks.CRIMSON_COBBLE), conditionsFromItem(EldritchRealmsBlocks.CRIMSON_COBBLE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.STONE_SWORD) + "_from_crimson"));


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Eldritch Limestone
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR, 2)
                .pattern("X")
                .pattern("X")
                .input('X', EldritchRealmsBlocks.ELDRITCH_LIMESTONE)
                .criterion(hasItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE), conditionsFromItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.ELDRITCH_LIMESTONE)
                .criterion(hasItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE), conditionsFromItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE)
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS)
                .criterion(hasItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR) + "_from_bricks"));

        createStairsRecipe(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.ELDRITCH_LIMESTONE))
                .criterion(hasItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE), conditionsFromItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS)));
        createStairsRecipe(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE))
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS)));
        createStairsRecipe(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS, Ingredient.ofItems(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.ELDRITCH_LIMESTONE))
                .criterion(hasItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE), conditionsFromItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB)));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE))
                .criterion(hasItem(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE), conditionsFromItem(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB)));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB, Ingredient.ofItems(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS))
                .criterion(hasItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS), conditionsFromItem(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB)));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_WALL, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB, EldritchRealmsBlocks.ELDRITCH_LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_WALL, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB, EldritchRealmsBlocks.ELDRITCH_LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB, EldritchRealmsBlocks.ELDRITCH_LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL, EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL, EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL, EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS);

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BLOCK, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsItems.DREADQUARTZ)
                .criterion(hasItem(EldritchRealmsItems.DREADQUARTZ), conditionsFromItem(EldritchRealmsItems.DREADQUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICKS, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.DREADQUARTZ_BLOCK)
                .criterion(hasItem(EldritchRealmsBlocks.DREADQUARTZ_BLOCK), conditionsFromItem(EldritchRealmsBlocks.DREADQUARTZ_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.DREADQUARTZ_BRICKS)));

        offerSmelting(exporter, SMOOTH_DREADQUARTZ_SMELTING, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ,
                0.2f, 200, "smooth_dreadquartz_smelting");

        offerSmelting(exporter, DREADQUARTZ_SMELTING, RecipeCategory.MISC, EldritchRealmsItems.DREADQUARTZ,
                2f, 200, "dreadquartz_ore_smelting");

        offerBlasting(exporter, DREADQUARTZ_SMELTING, RecipeCategory.MISC, EldritchRealmsItems.DREADQUARTZ,
                2f, 100, "dreadquartz_ore_blasting");

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_WALL, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_WALL, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICK_WALL, EldritchRealmsBlocks.DREADQUARTZ_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_PILLAR, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_PILLAR, EldritchRealmsBlocks.DREADQUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CHISELED_DREADQUARTZ, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CHISELED_DREADQUARTZ, EldritchRealmsBlocks.DREADQUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_STAIRS, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_SLAB, EldritchRealmsBlocks.DREADQUARTZ_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_WALL, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICKS, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICK_STAIRS, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICK_SLAB, EldritchRealmsBlocks.DREADQUARTZ_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICK_WALL, EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_STAIRS, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_SLAB, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_WALL, EldritchRealmsBlocks.SMOOTH_DREADQUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICK_STAIRS, EldritchRealmsBlocks.DREADQUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICK_SLAB, EldritchRealmsBlocks.DREADQUARTZ_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.DREADQUARTZ_BRICK_WALL, EldritchRealmsBlocks.DREADQUARTZ_BRICKS);


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.ASTRAL_SAND)
                .criterion(hasItem(EldritchRealmsBlocks.ASTRAL_SAND), conditionsFromItem(EldritchRealmsBlocks.ASTRAL_SAND))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ASTRAL_SANDSTONE)));


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_STAIRS, EldritchRealmsBlocks.ASTRAL_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_SLAB, EldritchRealmsBlocks.ASTRAL_SANDSTONE, 2);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_WALL, EldritchRealmsBlocks.ASTRAL_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_WALL, EldritchRealmsBlocks.ASTRAL_SANDSTONE);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.ASTRAL_SANDSTONE)
                .criterion(hasItem(EldritchRealmsBlocks.ASTRAL_SANDSTONE), conditionsFromItem(EldritchRealmsBlocks.ASTRAL_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS)));


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_STAIRS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_STAIRS, EldritchRealmsBlocks.ASTRAL_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_SLAB, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_SLAB, EldritchRealmsBlocks.ASTRAL_SANDSTONE, 2);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_WALL, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_WALL, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_WALL, EldritchRealmsBlocks.ASTRAL_SANDSTONE);


        offerSmelting(exporter, SMOOTH_ASTRAL_SANDSTONE_SMELTING, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE,
                0.2f, 200, "smooth_astral_sandstone_smelting");


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_STAIRS, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_SLAB, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE, 2);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_WALL, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_WALL, EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE);

        offerSmelting(exporter, ASTRAL_SAND_GLASS_SMELTING, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_STAINED_GLASS,
                0.2f, 200, "astral_sand_glass_smelting");

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.UMBRAM_OAK_PLANKS, 4)
                        .input(EldritchRealmsBlocks.UMBRAM_OAK_LOG)
                        .criterion(hasItem(EldritchRealmsBlocks.UMBRAM_OAK_LOG), conditionsFromItem(EldritchRealmsBlocks.UMBRAM_OAK_LOG))
                        .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS) + "_from_log"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.UMBRAM_OAK_PLANKS, 4)
                        .input(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG)
                        .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG))
                        .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS) + "_from_stripped_log"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.UMBRAM_OAK_PLANKS, 4)
                        .input(EldritchRealmsBlocks.UMBRAM_OAK_WOOD)
                        .criterion(hasItem(EldritchRealmsBlocks.UMBRAM_OAK_WOOD), conditionsFromItem(EldritchRealmsBlocks.UMBRAM_OAK_WOOD))
                        .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS) + "_from_wood"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.UMBRAM_OAK_PLANKS, 4)
                        .input(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD)
                        .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD))
                        .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS) + "_from_stripped_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.UMBRAM_OAK_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.UMBRAM_OAK_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.UMBRAM_OAK_LOG), conditionsFromItem(EldritchRealmsBlocks.UMBRAM_OAK_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.UMBRAM_OAK_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EldritchRealmsBlocks.UMBRAM_OAK_BUTTON, 1)
                .input(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS)
                .criterion(hasItem(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS), conditionsFromItem(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON)));


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.PHONTUM_PLANKS, 4)
                .input(EldritchRealmsBlocks.PHONTUM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.PHONTUM_LOG), conditionsFromItem(EldritchRealmsBlocks.PHONTUM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.PHONTUM_PLANKS) + "_from_log"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.PHONTUM_PLANKS, 4)
                .input(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.PHONTUM_PLANKS) + "_from_stripped_log"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.PHONTUM_PLANKS, 4)
                .input(EldritchRealmsBlocks.PHONTUM_WOOD)
                .criterion(hasItem(EldritchRealmsBlocks.PHONTUM_WOOD), conditionsFromItem(EldritchRealmsBlocks.PHONTUM_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.PHONTUM_PLANKS) + "_from_wood"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.PHONTUM_PLANKS, 4)
                .input(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD)
                .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.PHONTUM_PLANKS) + "_from_stripped_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.PHONTUM_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.PHONTUM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.PHONTUM_LOG), conditionsFromItem(EldritchRealmsBlocks.PHONTUM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.PHONTUM_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EldritchRealmsBlocks.PHONTUM_BUTTON, 1)
                .input(EldritchRealmsBlocks.PHONTUM_PLANKS)
                .criterion(hasItem(EldritchRealmsBlocks.PHONTUM_PLANKS), conditionsFromItem(EldritchRealmsBlocks.PHONTUM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.PHONTUM_BUTTON)));

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDEM_PLANKS, 4)
                .input(EldritchRealmsBlocks.ELDEM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.ELDEM_LOG), conditionsFromItem(EldritchRealmsBlocks.ELDEM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDEM_PLANKS) + "_from_log"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDEM_PLANKS, 4)
                .input(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDEM_PLANKS) + "_from_stripped_log"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDEM_PLANKS, 4)
                .input(EldritchRealmsBlocks.ELDEM_WOOD)
                .criterion(hasItem(EldritchRealmsBlocks.ELDEM_WOOD), conditionsFromItem(EldritchRealmsBlocks.ELDEM_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDEM_PLANKS) + "_from_wood"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDEM_PLANKS, 4)
                .input(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD)
                .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDEM_PLANKS) + "_from_stripped_wood"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ELDEM_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.ELDEM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.ELDEM_LOG), conditionsFromItem(EldritchRealmsBlocks.ELDEM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDEM_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD, 3)
                .pattern("XX")
                .pattern("XX")
                .input('X', EldritchRealmsBlocks.STRIPPED_ELDEM_LOG)
                .criterion(hasItem(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG), conditionsFromItem(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EldritchRealmsBlocks.ELDEM_BUTTON, 1)
                .input(EldritchRealmsBlocks.ELDEM_PLANKS)
                .criterion(hasItem(EldritchRealmsBlocks.ELDEM_PLANKS), conditionsFromItem(EldritchRealmsBlocks.ELDEM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.ELDEM_BUTTON)));

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE, 1)
                .input(EldritchRealmsBlocks.SABLEBELL)
                .criterion(hasItem(EldritchRealmsBlocks.SABLEBELL), conditionsFromItem(EldritchRealmsBlocks.SABLEBELL))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsBlocks.SABLEBELL)));

        offerSmelting(exporter, ALK_WHEAT_SMELTING, RecipeCategory.FOOD, Items.WHEAT, 1f, 200, "alk_wheat_smelting");




        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        offerSmelting(exporter, List.of(EldritchRealmsItems.SHADOWSTEEL_DUST), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_NUGGET, 3f, 300, "shadowsteel_nugget_smelting");
        offerBlasting(exporter, List.of(EldritchRealmsItems.SHADOWSTEEL_DUST), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_NUGGET, 3f, 150, "shadowsteel_nugget_blasting");
        offerSmelting(exporter, List.of(EldritchRealmsBlocks.VEILSTONE_SHADOWSTEEL_ORE), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_NUGGET, 3f, 300, "shadowsteel_nugget_from_veilstone_ore_smelting");
        offerBlasting(exporter, List.of(EldritchRealmsBlocks.VEILSTONE_SHADOWSTEEL_ORE), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_NUGGET, 3f, 150, "shadowsteel_nugget_from_veilstone_ore_blasting");
        offerSmelting(exporter, List.of(EldritchRealmsBlocks.SHADOWSLATE_SHADOWSTEEL_ORE), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_NUGGET, 3f, 300, "shadowsteel_nugget_from_shadowslate_ore_smelting");
        offerBlasting(exporter, List.of(EldritchRealmsBlocks.SHADOWSLATE_SHADOWSTEEL_ORE), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_NUGGET, 3f, 150, "shadowsteel_nugget_from_shadowslate_ore_blasting");

        offerSmelting(exporter, List.of(EldritchRealmsItems.SHADOWSTEEL_CLUMP), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_INGOT, 3f, 300, "shadowsteel_ingot_smelting");
        offerBlasting(exporter, List.of(EldritchRealmsItems.SHADOWSTEEL_CLUMP), RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_INGOT, 3f, 150, "shadowsteel_ingot_blasting");

        offerCompactingRecipe(exporter, RecipeCategory.MISC, EldritchRealmsItems.SHADOWSTEEL_CLUMP, EldritchRealmsItems.SHADOWSTEEL_NUGGET);

        createSwordWithIronRodRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_SWORD, EldritchRealmsItems.SHADOWSTEEL_INGOT);
        createPickaxeWithIronRodRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_PICKAXE, EldritchRealmsItems.SHADOWSTEEL_INGOT);
        createAxeWithIronRodRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_AXE, EldritchRealmsItems.SHADOWSTEEL_INGOT);
        createShovelWithIronRodRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_SHOVEL, EldritchRealmsItems.SHADOWSTEEL_INGOT);
        createHoeWithIronRodRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_HOE, EldritchRealmsItems.SHADOWSTEEL_INGOT);

        createHelmetRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_HELMET, EldritchRealmsItems.SHADOWSTEEL_INGOT);
        createChestplateRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_CHESTPLATE, EldritchRealmsItems.SHADOWSTEEL_INGOT);
        createLeggingsRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_LEGGINGS, EldritchRealmsItems.SHADOWSTEEL_INGOT);
        createBootsRecipe(exporter, EldritchRealmsItems.SHADOWSTEEL_BOOTS, EldritchRealmsItems.SHADOWSTEEL_INGOT);


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Blocks.IRON_BARS, 4)
                .pattern("###")
                .pattern("###")
                .input('#', EldritchRealmsItems.REINFORCED_IRON_ROD)
                .criterion(hasItem(EldritchRealmsItems.REINFORCED_IRON_ROD), conditionsFromItem(EldritchRealmsItems.REINFORCED_IRON_ROD))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.IRON_BARS) + "_from_iron_rod"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EldritchRealmsItems.REINFORCED_IRON_ROD, 2)
                .pattern("#")
                .pattern("%")
                .pattern("%")
                .input('#', Items.NETHERITE_INGOT)
                .input('%', Items.IRON_INGOT)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EldritchRealmsItems.REINFORCED_IRON_ROD)));


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, EldritchRealmsItems.NEBULATIC_LAPIS, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.NEBULATIC_LAPIS_BLOCK);



    }

    public static void createSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .input('#', input)
                .input('$', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("$")
                .group("sword")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', Items.STICK)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .group("pickaxe")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', Items.STICK)
                .pattern("##")
                .pattern("#$")
                .pattern(" $")
                .group("axe")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', Items.STICK)
                .pattern("#")
                .pattern("$")
                .pattern("$")
                .group("shovel")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', Items.STICK)
                .pattern("##")
                .pattern("$ ")
                .pattern("$ ")
                .group("hoe")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createSwordWithIronRodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .input('#', input)
                .input('$', EldritchRealmsItems.REINFORCED_IRON_ROD)
                .pattern("#")
                .pattern("#")
                .pattern("$")
                .group("sword")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(EldritchRealmsItems.REINFORCED_IRON_ROD), conditionsFromItem(EldritchRealmsItems.REINFORCED_IRON_ROD))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createPickaxeWithIronRodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', EldritchRealmsItems.REINFORCED_IRON_ROD)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .group("pickaxe")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(EldritchRealmsItems.REINFORCED_IRON_ROD), conditionsFromItem(EldritchRealmsItems.REINFORCED_IRON_ROD))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createAxeWithIronRodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', EldritchRealmsItems.REINFORCED_IRON_ROD)
                .pattern("##")
                .pattern("#$")
                .pattern(" $")
                .group("axe")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(EldritchRealmsItems.REINFORCED_IRON_ROD), conditionsFromItem(EldritchRealmsItems.REINFORCED_IRON_ROD))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createShovelWithIronRodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', EldritchRealmsItems.REINFORCED_IRON_ROD)
                .pattern("#")
                .pattern("$")
                .pattern("$")
                .group("shovel")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(EldritchRealmsItems.REINFORCED_IRON_ROD), conditionsFromItem(EldritchRealmsItems.REINFORCED_IRON_ROD))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createHoeWithIronRodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .input('#', input)
                .input('$', EldritchRealmsItems.REINFORCED_IRON_ROD)
                .pattern("##")
                .pattern("$ ")
                .pattern("$ ")
                .group("hoe")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(EldritchRealmsItems.REINFORCED_IRON_ROD), conditionsFromItem(EldritchRealmsItems.REINFORCED_IRON_ROD))
                .offerTo(exporter, convertBetween(output, input));
    }


    public static void createHelmetRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .group("helmet")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createChestplateRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .group("chestplate")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createLeggingsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .group("leggings")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    public static void createBootsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("# #")
                .group("boots")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }


}
