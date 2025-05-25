package mcacejr.majmods.datagen;

import mcacejr.majmods.block.ModBlocks;
import mcacejr.majmods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEPTHSTONE);
        BlockStateModelGenerator.BlockTexturePool depthstonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEPTHSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DEPTHSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lichendepthstonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LICHEN_DEPTHSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEPTHSTONE_LICHEN_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEPTHSTONE_LANTERN);

        depthstonebrickPool.stairs(ModBlocks.DEPTHSTONE_BRICK_STAIRS);
        depthstonebrickPool.slab(ModBlocks.DEPTHSTONE_BRICK_SLAB);
        depthstonebrickPool.wall(ModBlocks.DEPTHSTONE_BRICK_WALL);

        lichendepthstonebrickPool.stairs(ModBlocks.LICHEN_DEPTHSTONE_BRICK_STAIRS);
        lichendepthstonebrickPool.slab(ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB);
        lichendepthstonebrickPool.wall(ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FLINT_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOLLY_BERRY, Models.GENERATED);
    }
}
