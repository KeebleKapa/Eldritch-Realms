package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class EldritchRealmsRecipeProvider extends FabricRecipeProvider {
    public static final List<ItemConvertible> CRACKED_ABYSSAL_GRANITE_BRICKS_SMELTING = List.of(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
    public static final List<ItemConvertible> VEILSTONE_SMELTING = List.of(EldritchRealmsBlocks.COBBLED_VEILSTONE);
    public static final List<ItemConvertible> SMOOTH_VEILSTONE_SMELTING = List.of(EldritchRealmsBlocks.VEILSTONE);

    public EldritchRealmsRecipeProvider(FabricDataOutput output) {super(output);}

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

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

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB, EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);

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
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_WALL, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL, EldritchRealmsBlocks.COBBLED_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL, EldritchRealmsBlocks.SMOOTH_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_STAIRS, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS, EldritchRealmsBlocks.COBBLED_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS, EldritchRealmsBlocks.SMOOTH_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.VEILSTONE_SLAB, EldritchRealmsBlocks.VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB, EldritchRealmsBlocks.COBBLED_VEILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB, EldritchRealmsBlocks.SMOOTH_VEILSTONE);


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





    }


}
