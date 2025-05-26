package mcacejr.majmods.datagen;

import mcacejr.majmods.block.ModBlocks;
import mcacejr.majmods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

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

        blockStateModelGenerator.registerSingleton(ModBlocks.ORE_CLUSTER, TexturedModel.CUBE_COLUMN);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.FLINT_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOLLY_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_CATALYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_CATALYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERRACK_CAYALYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOODEN_TRIMMINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TREE_FEAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAFY_BUSHEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TREE_FORGED_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOB_EFFIGY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONSTER_SOULSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONSTROUS_TOTEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RESTORED_SHERD_TABLET, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEGENDARY_REPAIR_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEGENDARY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ORE_CLUSTER_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TWISTED_ROOT_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_SHERD_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXTRAVAGANT_GILDED_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVING_MOB_SWORD, Models.GENERATED);
    }
}
