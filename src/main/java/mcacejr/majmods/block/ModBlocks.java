package mcacejr.majmods.block;

import mcacejr.majmods.McAceJrMods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));

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
