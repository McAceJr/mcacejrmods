package mcacejr.majmods.datagen;

import mcacejr.majmods.block.ModBlocks;
import mcacejr.majmods.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.DEPTHSTONE_VARIATIONS)
                .add(ModBlocks.DEPTHSTONE)
                .add(ModBlocks.DEPTHSTONE_BRICKS)
                .add(ModBlocks.DEPTHSTONE_BRICK_STAIRS)
                .add(ModBlocks.DEPTHSTONE_BRICK_SLAB)
                .add(ModBlocks.DEPTHSTONE_BRICK_WALL)
                .add(ModBlocks.CHISELED_DEPTHSTONE_BRICKS)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICKS)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_STAIRS)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL)
                .add(ModBlocks.DEPTHSTONE_LICHEN_LANTERN)
                .add(ModBlocks.DEPTHSTONE_LANTERN);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEPTHSTONE)
                .add(ModBlocks.DEPTHSTONE_BRICKS)
                .add(ModBlocks.DEPTHSTONE_BRICK_STAIRS)
                .add(ModBlocks.DEPTHSTONE_BRICK_SLAB)
                .add(ModBlocks.DEPTHSTONE_BRICK_WALL)
                .add(ModBlocks.CHISELED_DEPTHSTONE_BRICKS)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICKS)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_STAIRS)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_SLAB)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL)
                .add(ModBlocks.DEPTHSTONE_LICHEN_LANTERN)
                .add(ModBlocks.DEPTHSTONE_LANTERN)
                .add(ModBlocks.ORE_CLUSTER);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DEPTHSTONE_BRICK_WALL)
                .add(ModBlocks.LICHEN_DEPTHSTONE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ORE_CLUSTER);

    }
}
