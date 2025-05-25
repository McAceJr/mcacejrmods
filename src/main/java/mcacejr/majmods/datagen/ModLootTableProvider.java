package mcacejr.majmods.datagen;


import mcacejr.majmods.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {


    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DEPTHSTONE);
        addDrop(ModBlocks.DEPTHSTONE_BRICKS);
        addDrop(ModBlocks.DEPTHSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.DEPTHSTONE_BRICK_SLAB);
        addDrop(ModBlocks.DEPTHSTONE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_DEPTHSTONE_BRICKS);
        addDrop(ModBlocks.LICHEN_DEPTHSTONE_BRICKS);
        addDrop(ModBlocks.LICHEN_DEPTHSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB);
        addDrop(ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL);
        addDrop(ModBlocks.DEPTHSTONE_LICHEN_LANTERN);
        addDrop(ModBlocks.DEPTHSTONE_LANTERN);
    }
}

