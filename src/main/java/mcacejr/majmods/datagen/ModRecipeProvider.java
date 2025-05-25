package mcacejr.majmods.datagen;

import mcacejr.majmods.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICKS, ModBlocks.DEPTHSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_STAIRS, ModBlocks.DEPTHSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_SLAB, ModBlocks.DEPTHSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_WALL, ModBlocks.DEPTHSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_STAIRS, ModBlocks.DEPTHSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_SLAB, ModBlocks.DEPTHSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_WALL, ModBlocks.DEPTHSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DEPTHSTONE_BRICKS, ModBlocks.DEPTHSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DEPTHSTONE_BRICKS, ModBlocks.DEPTHSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICKS, ModBlocks.CHISELED_DEPTHSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICKS, ModBlocks.LICHEN_DEPTHSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LICHEN_DEPTHSTONE_BRICK_STAIRS, ModBlocks.LICHEN_DEPTHSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB, ModBlocks.LICHEN_DEPTHSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL, ModBlocks.LICHEN_DEPTHSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_LANTERN, ModBlocks.DEPTHSTONE_LICHEN_LANTERN);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_LICHEN_LANTERN, 1)
                .pattern(" D ")
                .pattern("GSG")
                .pattern(" D ")
                .input('G', Items.GLOW_LICHEN)
                .input('D', ModBlocks.DEPTHSTONE_BRICK_SLAB)
                .input('S', Items.SEA_LANTERN)
                .criterion(hasItem(ModBlocks.DEPTHSTONE), conditionsFromItem(ModBlocks.DEPTHSTONE))
                .criterion(hasItem(Items.GLOW_LICHEN), conditionsFromItem(Items.GLOW_LICHEN))
                .criterion(hasItem(Items.SEA_LANTERN), conditionsFromItem(Items.SEA_LANTERN))
                .offerTo(exporter, new Identifier("depthstone_lichen_lantern_from_glow_lichen"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_LICHEN_LANTERN, 1)
                .pattern(" L ")
                .pattern(" S ")
                .pattern(" L ")
                .input('L', ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB)
                .input('S', Items.SEA_LANTERN)
                .criterion(hasItem(ModBlocks.DEPTHSTONE), conditionsFromItem(ModBlocks.DEPTHSTONE))
                .criterion(hasItem(Items.GLOW_LICHEN), conditionsFromItem(Items.GLOW_LICHEN))
                .criterion(hasItem(Items.SEA_LANTERN), conditionsFromItem(Items.SEA_LANTERN))
                .offerTo(exporter, new Identifier("depthstone_lichen_lantern_from_lichen_depthstone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_LANTERN, 1)
                .pattern(" D ")
                .pattern(" S ")
                .pattern(" D ")
                .input('D', ModBlocks.DEPTHSTONE_BRICK_SLAB)
                .input('S', Items.SEA_LANTERN)
                .criterion(hasItem(ModBlocks.DEPTHSTONE), conditionsFromItem(ModBlocks.DEPTHSTONE))
                .criterion(hasItem(Items.SEA_LANTERN), conditionsFromItem(Items.SEA_LANTERN))
                .offerTo(exporter);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.DEPTHSTONE_BRICKS))
                .criterion(hasItem(ModBlocks.DEPTHSTONE), conditionsFromItem(ModBlocks.DEPTHSTONE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.LICHEN_DEPTHSTONE_BRICKS))
                .criterion(hasItem(ModBlocks.DEPTHSTONE), conditionsFromItem(ModBlocks.DEPTHSTONE))
                .criterion(hasItem(Blocks.GLOW_LICHEN), conditionsFromItem(Blocks.GLOW_LICHEN))
                .offerTo(exporter);

        createStairsRecipe(ModBlocks.DEPTHSTONE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DEPTHSTONE_BRICKS))
                .criterion(hasItem(ModBlocks.DEPTHSTONE), conditionsFromItem(ModBlocks.DEPTHSTONE))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.LICHEN_DEPTHSTONE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LICHEN_DEPTHSTONE_BRICKS))
                .criterion(hasItem(ModBlocks.DEPTHSTONE), conditionsFromItem(ModBlocks.DEPTHSTONE))
                .criterion(hasItem(Blocks.GLOW_LICHEN), conditionsFromItem(Blocks.GLOW_LICHEN))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEPTHSTONE_BRICK_WALL, ModBlocks.DEPTHSTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL, ModBlocks.LICHEN_DEPTHSTONE_BRICKS);

    }
}
