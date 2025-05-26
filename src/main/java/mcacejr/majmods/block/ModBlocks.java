package mcacejr.majmods.block;

import mcacejr.majmods.McAceJrMods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DEPTHSTONE = registerBlock("depthstone",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block DEPTHSTONE_BRICKS = registerBlock("depthstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block CHISELED_DEPTHSTONE_BRICKS = registerBlock("chiseled_depthstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE)));
    public static final Block LICHEN_DEPTHSTONE_BRICKS = registerBlock("lichen_depthstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).luminance(6)));
    public static final Block DEPTHSTONE_BRICK_STAIRS = registerBlock("depthstone_brick_stairs",
            new StairsBlock(ModBlocks.DEPTHSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block DEPTHSTONE_BRICK_SLAB = registerBlock("depthstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block DEPTHSTONE_BRICK_WALL = registerBlock("depthstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_WALL)));
    public static final Block LICHEN_DEPTHSTONE_BRICK_STAIRS = registerBlock("lichen_depthstone_brick_stairs",
            new StairsBlock(ModBlocks.DEPTHSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS).luminance(6)));
    public static final Block LICHEN_DEPTHSTONE_BRICK_SLAB = registerBlock("lichen_depthstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB).luminance(6)));
    public static final Block LICHEN_DEPTHSTONE_BRICK_WALL = registerBlock("lichen_depthstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_WALL).luminance(6)));
    public static final Block DEPTHSTONE_LICHEN_LANTERN = registerBlock("depthstone_lichen_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).luminance(13)));
    public static final Block DEPTHSTONE_LANTERN = registerBlock("depthstone_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).luminance(12)));

    public static final Block ORE_CLUSTER = registerBlock("ore_cluster",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(McAceJrMods.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(McAceJrMods.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {

        McAceJrMods.LOGGER.info("Registering ModBlocks for " + McAceJrMods.MOD_ID);

    }

}
