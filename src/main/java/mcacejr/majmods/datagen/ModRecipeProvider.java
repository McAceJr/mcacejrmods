package mcacejr.majmods.datagen;

import mcacejr.majmods.block.ModBlocks;
import mcacejr.majmods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_CATALYST, 1)
                .pattern("ICG")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.IRON_ORE)
                .input('C', Items.COPPER_ORE)
                .input('G', Items.GOLD_ORE)
                .input('D', Items.DIAMOND_ORE)
                .input('S', Items.STONE)
                .input('E', Items.EMERALD_ORE)
                .input('K', Items.COAL_ORE)
                .input('R', Items.REDSTONE_ORE)
                .input('L', Items.LAPIS_ORE)
                .criterion(hasItem(Items.IRON_ORE), conditionsFromItem(Items.IRON_ORE))
                .criterion(hasItem(Items.COPPER_ORE), conditionsFromItem(Items.COPPER_ORE))
                .criterion(hasItem(Items.GOLD_ORE), conditionsFromItem(Items.GOLD_ORE))
                .criterion(hasItem(Items.DIAMOND_ORE), conditionsFromItem(Items.DIAMOND_ORE))
                .criterion(hasItem(Items.EMERALD_ORE), conditionsFromItem(Items.EMERALD_ORE))
                .criterion(hasItem(Items.COAL_ORE), conditionsFromItem(Items.COAL_ORE))
                .criterion(hasItem(Items.REDSTONE_ORE), conditionsFromItem(Items.REDSTONE_ORE))
                .criterion(hasItem(Items.LAPIS_ORE), conditionsFromItem(Items.LAPIS_ORE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_CATALYST, 1)
                .pattern("ICG")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.DEEPSLATE_IRON_ORE)
                .input('C', Items.DEEPSLATE_COPPER_ORE)
                .input('G', Items.DEEPSLATE_GOLD_ORE)
                .input('D', Items.DEEPSLATE_DIAMOND_ORE)
                .input('S', Items.DEEPSLATE)
                .input('E', Items.DEEPSLATE_EMERALD_ORE)
                .input('K', Items.DEEPSLATE_COAL_ORE)
                .input('R', Items.DEEPSLATE_REDSTONE_ORE)
                .input('L', Items.DEEPSLATE_LAPIS_ORE)
                .criterion(hasItem(Items.DEEPSLATE_IRON_ORE), conditionsFromItem(Items.DEEPSLATE_IRON_ORE))
                .criterion(hasItem(Items.DEEPSLATE_COPPER_ORE), conditionsFromItem(Items.DEEPSLATE_COPPER_ORE))
                .criterion(hasItem(Items.DEEPSLATE_GOLD_ORE), conditionsFromItem(Items.DEEPSLATE_GOLD_ORE))
                .criterion(hasItem(Items.DEEPSLATE_DIAMOND_ORE), conditionsFromItem(Items.DEEPSLATE_DIAMOND_ORE))
                .criterion(hasItem(Items.DEEPSLATE_EMERALD_ORE), conditionsFromItem(Items.DEEPSLATE_EMERALD_ORE))
                .criterion(hasItem(Items.DEEPSLATE_COAL_ORE), conditionsFromItem(Items.DEEPSLATE_COAL_ORE))
                .criterion(hasItem(Items.DEEPSLATE_REDSTONE_ORE), conditionsFromItem(Items.DEEPSLATE_REDSTONE_ORE))
                .criterion(hasItem(Items.DEEPSLATE_LAPIS_ORE), conditionsFromItem(Items.DEEPSLATE_LAPIS_ORE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERRACK_CAYALYST, 1)
                .pattern("NSN")
                .pattern("GRB")
                .pattern("NQN")
                .input('N', Items.NETHERITE_INGOT)
                .input('S', Items.NETHERITE_SCRAP)
                .input('G', Items.NETHER_GOLD_ORE)
                .input('R', Items.NETHERRACK)
                .input('B', Items.GILDED_BLACKSTONE)
                .input('Q', Items.NETHER_QUARTZ_ORE)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.NETHER_GOLD_ORE), conditionsFromItem(Items.NETHER_GOLD_ORE))
                .criterion(hasItem(Items.GILDED_BLACKSTONE), conditionsFromItem(Items.GILDED_BLACKSTONE))
                .criterion(hasItem(Items.NETHER_QUARTZ_ORE), conditionsFromItem(Items.NETHER_QUARTZ_ORE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_TRIMMINGS, 1)
                .pattern("ICG")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.CHERRY_LOG)
                .input('C', Items.BIRCH_LOG)
                .input('G', Items.MANGROVE_LOG)
                .input('D', Items.DARK_OAK_LOG)
                .input('S', Items.CHEST)
                .input('E', Items.OAK_LOG)
                .input('K', Items.SPRUCE_LOG)
                .input('R', Items.JUNGLE_LOG)
                .input('L', Items.ACACIA_LOG)
                .criterion(hasItem(Items.CHERRY_LOG), conditionsFromItem(Items.CHERRY_LOG))
                .criterion(hasItem(Items.BIRCH_LOG), conditionsFromItem(Items.BIRCH_LOG))
                .criterion(hasItem(Items.MANGROVE_LOG), conditionsFromItem(Items.MANGROVE_LOG))
                .criterion(hasItem(Items.DARK_OAK_LOG), conditionsFromItem(Items.DARK_OAK_LOG))
                .criterion(hasItem(Items.OAK_LOG), conditionsFromItem(Items.OAK_LOG))
                .criterion(hasItem(Items.SPRUCE_LOG), conditionsFromItem(Items.SPRUCE_LOG))
                .criterion(hasItem(Items.JUNGLE_LOG), conditionsFromItem(Items.JUNGLE_LOG))
                .criterion(hasItem(Items.ACACIA_LOG), conditionsFromItem(Items.ACACIA_LOG))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TREE_FEAST, 1)
                .pattern("ICG")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.CHERRY_SAPLING)
                .input('C', Items.BIRCH_SAPLING)
                .input('G', Items.MANGROVE_PROPAGULE)
                .input('D', Items.DARK_OAK_SAPLING)
                .input('S', Items.BONE_MEAL)
                .input('E', Items.OAK_SAPLING)
                .input('K', Items.SPRUCE_SAPLING)
                .input('R', Items.JUNGLE_SAPLING)
                .input('L', Items.ACACIA_SAPLING)
                .criterion(hasItem(Items.CHERRY_SAPLING), conditionsFromItem(Items.CHERRY_SAPLING))
                .criterion(hasItem(Items.BIRCH_SAPLING), conditionsFromItem(Items.BIRCH_SAPLING))
                .criterion(hasItem(Items.MANGROVE_PROPAGULE), conditionsFromItem(Items.MANGROVE_PROPAGULE))
                .criterion(hasItem(Items.DARK_OAK_SAPLING), conditionsFromItem(Items.DARK_OAK_SAPLING))
                .criterion(hasItem(Items.OAK_SAPLING), conditionsFromItem(Items.OAK_SAPLING))
                .criterion(hasItem(Items.SPRUCE_SAPLING), conditionsFromItem(Items.SPRUCE_SAPLING))
                .criterion(hasItem(Items.JUNGLE_SAPLING), conditionsFromItem(Items.JUNGLE_SAPLING))
                .criterion(hasItem(Items.ACACIA_SAPLING), conditionsFromItem(Items.ACACIA_SAPLING))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEAFY_BUSHEL, 1)
                .pattern("ICG")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.CHERRY_LEAVES)
                .input('C', Items.BIRCH_LEAVES)
                .input('G', Items.MANGROVE_LEAVES)
                .input('D', Items.DARK_OAK_LEAVES)
                .input('S', Items.FLOWERING_AZALEA)
                .input('E', Items.OAK_LEAVES)
                .input('K', Items.SPRUCE_LEAVES)
                .input('R', Items.JUNGLE_LEAVES)
                .input('L', Items.ACACIA_LEAVES)
                .criterion(hasItem(Items.CHERRY_LEAVES), conditionsFromItem(Items.CHERRY_LEAVES))
                .criterion(hasItem(Items.BIRCH_LEAVES), conditionsFromItem(Items.BIRCH_LEAVES))
                .criterion(hasItem(Items.MANGROVE_LEAVES), conditionsFromItem(Items.MANGROVE_LEAVES))
                .criterion(hasItem(Items.DARK_OAK_LEAVES), conditionsFromItem(Items.DARK_OAK_LEAVES))
                .criterion(hasItem(Items.OAK_LEAVES), conditionsFromItem(Items.OAK_LEAVES))
                .criterion(hasItem(Items.SPRUCE_LEAVES), conditionsFromItem(Items.SPRUCE_LEAVES))
                .criterion(hasItem(Items.JUNGLE_LEAVES), conditionsFromItem(Items.JUNGLE_LEAVES))
                .criterion(hasItem(Items.ACACIA_LEAVES), conditionsFromItem(Items.ACACIA_LEAVES))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TREE_FORGED_ALLOY, 1)
                .pattern("AAA")
                .pattern("BBB")
                .pattern("CCC")
                .input('A', ModItems.WOODEN_TRIMMINGS)
                .input('B', ModItems.TREE_FEAST)
                .input('C', ModItems.LEAFY_BUSHEL)
                .criterion(hasItem(ModItems.WOODEN_TRIMMINGS), conditionsFromItem(ModItems.WOODEN_TRIMMINGS))
                .criterion(hasItem(ModItems.TREE_FEAST), conditionsFromItem(ModItems.TREE_FEAST))
                .criterion(hasItem(ModItems.LEAFY_BUSHEL), conditionsFromItem(ModItems.LEAFY_BUSHEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MOB_EFFIGY, 1)
                .pattern("ICG")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.BONE)
                .input('C', Items.SHULKER_SHELL)
                .input('G', Items.PHANTOM_MEMBRANE)
                .input('D', Items.ENDER_PEARL)
                .input('S', Items.TOTEM_OF_UNDYING)
                .input('E', Items.SPIDER_EYE)
                .input('K', Items.PRISMARINE)
                .input('R', Items.BLAZE_ROD)
                .input('L', Items.ROTTEN_FLESH)
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .criterion(hasItem(Items.SHULKER_SHELL), conditionsFromItem(Items.SHULKER_SHELL))
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                .criterion(hasItem(Items.PRISMARINE), conditionsFromItem(Items.PRISMARINE))
                .criterion(hasItem(Items.BLAZE_ROD), conditionsFromItem(Items.BLAZE_ROD))
                .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MONSTER_SOULSTONE, 1)
                .pattern("III")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.WITHER_SKELETON_SKULL)
                .input('D', Items.SKELETON_SKULL)
                .input('S', Items.NETHER_STAR)
                .input('E', Items.PIGLIN_HEAD)
                .input('K', Items.ZOMBIE_HEAD)
                .input('R', Items.DRAGON_HEAD)
                .input('L', Items.CREEPER_HEAD)
                .criterion(hasItem(Items.WITHER_SKELETON_SKULL), conditionsFromItem(Items.WITHER_SKELETON_SKULL))
                .criterion(hasItem(Items.SKELETON_SKULL), conditionsFromItem(Items.SKELETON_SKULL))
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .criterion(hasItem(Items.PIGLIN_HEAD), conditionsFromItem(Items.PIGLIN_HEAD))
                .criterion(hasItem(Items.ZOMBIE_HEAD), conditionsFromItem(Items.ZOMBIE_HEAD))
                .criterion(hasItem(Items.DRAGON_HEAD), conditionsFromItem(Items.DRAGON_HEAD))
                .criterion(hasItem(Items.CREEPER_HEAD), conditionsFromItem(Items.CREEPER_HEAD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MONSTROUS_TOTEM, 1)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ModItems.MOB_EFFIGY)
                .input('B', ModItems.MONSTER_SOULSTONE)
                .criterion(hasItem(ModItems.MOB_EFFIGY), conditionsFromItem(ModItems.MOB_EFFIGY))
                .criterion(hasItem(ModItems.MONSTER_SOULSTONE), conditionsFromItem(ModItems.MONSTER_SOULSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RESTORED_SHERD_TABLET, 1)
                .pattern("ICG")
                .pattern("DSE")
                .pattern("KRL")
                .input('I', Items.ANGLER_POTTERY_SHERD)
                .input('C', Items.EXPLORER_POTTERY_SHERD)
                .input('G', Items.MINER_POTTERY_SHERD)
                .input('D', Items.DANGER_POTTERY_SHERD)
                .input('S', Items.BLADE_POTTERY_SHERD)
                .input('E', Items.PRIZE_POTTERY_SHERD)
                .input('K', Items.MOURNER_POTTERY_SHERD)
                .input('R', Items.ARMS_UP_POTTERY_SHERD)
                .input('L', Items.SKULL_POTTERY_SHERD)
                .criterion(hasItem(Items.ANGLER_POTTERY_SHERD), conditionsFromItem(Items.ANGLER_POTTERY_SHERD))
                .criterion(hasItem(Items.EXPLORER_POTTERY_SHERD), conditionsFromItem(Items.EXPLORER_POTTERY_SHERD))
                .criterion(hasItem(Items.MINER_POTTERY_SHERD), conditionsFromItem(Items.MINER_POTTERY_SHERD))
                .criterion(hasItem(Items.DANGER_POTTERY_SHERD), conditionsFromItem(Items.DANGER_POTTERY_SHERD))
                .criterion(hasItem(Items.BLADE_POTTERY_SHERD), conditionsFromItem(Items.BLADE_POTTERY_SHERD))
                .criterion(hasItem(Items.PRIZE_POTTERY_SHERD), conditionsFromItem(Items.PRIZE_POTTERY_SHERD))
                .criterion(hasItem(Items.MOURNER_POTTERY_SHERD), conditionsFromItem(Items.MOURNER_POTTERY_SHERD))
                .criterion(hasItem(Items.ARMS_UP_POTTERY_SHERD), conditionsFromItem(Items.ARMS_UP_POTTERY_SHERD))
                .criterion(hasItem(Items.SKULL_POTTERY_SHERD), conditionsFromItem(Items.SKULL_POTTERY_SHERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.ORE_CLUSTER, 1)
                .pattern("   ")
                .pattern("ABC")
                .pattern("   ")
                .input('A', ModItems.STONE_CATALYST)
                .input('B', ModItems.NETHERRACK_CAYALYST)
                .input('C', ModItems.DEEPSLATE_CATALYST)
                .criterion(hasItem(ModItems.STONE_CATALYST), conditionsFromItem(ModItems.STONE_CATALYST))
                .criterion(hasItem(ModItems.NETHERRACK_CAYALYST), conditionsFromItem(ModItems.NETHERRACK_CAYALYST))
                .criterion(hasItem(ModItems.DEEPSLATE_CATALYST), conditionsFromItem(ModItems.DEEPSLATE_CATALYST))
                .offerTo(exporter);

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.STONE_PICKAXE), Ingredient.ofItems(ModBlocks.ORE_CLUSTER),
                RecipeCategory.TOOLS, ModItems.ORE_CLUSTER_PICKAXE)
                .criterion(hasItem(ModBlocks.ORE_CLUSTER), conditionsFromItem(ModBlocks.ORE_CLUSTER))
                .offerTo(exporter, getItemPath(ModItems.ORE_CLUSTER_PICKAXE) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.WOODEN_AXE), Ingredient.ofItems(ModItems.TREE_FORGED_ALLOY),
                        RecipeCategory.TOOLS, ModItems.TWISTED_ROOT_AXE)
                .criterion(hasItem(ModItems.TREE_FORGED_ALLOY), conditionsFromItem(ModItems.TREE_FORGED_ALLOY))
                .offerTo(exporter, getItemPath(ModItems.TWISTED_ROOT_AXE) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.BRUSH), Ingredient.ofItems(ModItems.RESTORED_SHERD_TABLET),
                        RecipeCategory.TOOLS, ModItems.ANCIENT_SHERD_SHOVEL)
                .criterion(hasItem(ModItems.RESTORED_SHERD_TABLET), conditionsFromItem(ModItems.RESTORED_SHERD_TABLET))
                .offerTo(exporter, getItemPath(ModItems.ANCIENT_SHERD_SHOVEL) + "_smithing");

//        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE),
//                        Ingredient.ofItems(Items.BRUSH), Ingredient.ofItems(ModItems.RESTORED_SHERD_TABLET),
//                        RecipeCategory.TOOLS, ModItems.ANCIENT_SHERD_SHOVEL)
//                .criterion(hasItem(ModItems.RESTORED_SHERD_TABLET), conditionsFromItem(ModItems.RESTORED_SHERD_TABLET))
//                .offerTo(exporter, getItemPath(ModItems.ANCIENT_SHERD_SHOVEL) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.GOLDEN_SWORD), Ingredient.ofItems(ModItems.MONSTROUS_TOTEM),
                        RecipeCategory.TOOLS, ModItems.LIVING_MOB_SWORD)
                .criterion(hasItem(ModItems.MONSTROUS_TOTEM), conditionsFromItem(ModItems.MONSTROUS_TOTEM))
                .offerTo(exporter, getItemPath(ModItems.LIVING_MOB_SWORD) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEGENDARY_REPAIR_SMITHING_TEMPLATE, 2)
                .pattern("DSD")
                .pattern("DOD")
                .pattern("DDD")
                .input('S', ModItems.LEGENDARY_REPAIR_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND)
                .input('O', Items.OAK_LOG)
                .criterion(hasItem(ModItems.LEGENDARY_REPAIR_SMITHING_TEMPLATE),
                        conditionsFromItem(ModItems.LEGENDARY_REPAIR_SMITHING_TEMPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE, 2)
                .pattern("DSD")
                .pattern("DOD")
                .pattern("DDD")
                .input('S', ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND)
                .input('O', Items.CHORUS_FLOWER)
                .criterion(hasItem(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE),
                        conditionsFromItem(ModItems.LEGENDARY_REPAIR_SMITHING_TEMPLATE))
                .offerTo(exporter);

    }
}
