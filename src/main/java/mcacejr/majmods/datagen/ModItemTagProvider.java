package mcacejr.majmods.datagen;

import mcacejr.majmods.item.ModItems;
import mcacejr.majmods.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.LEGENDARY_MATERIALS)
                .add(ModItems.STONE_CATALYST)
                .add(ModItems.DEEPSLATE_CATALYST)
                .add(ModItems.NETHERRACK_CAYALYST)
                .add(ModItems.WOODEN_TRIMMINGS)
                .add(ModItems.TREE_FEAST)
                .add(ModItems.LEAFY_BUSHEL)
                .add(ModItems.TREE_FORGED_ALLOY)
                .add(ModItems.MOB_EFFIGY)
                .add(ModItems.MONSTER_SOULSTONE)
                .add(ModItems.MONSTROUS_TOTEM)
                .add(ModItems.RESTORED_SHERD_TABLET);

        getOrCreateTagBuilder(ModTags.Items.LEGENDARY_TOOLS)
                .add(ModItems.ORE_CLUSTER_PICKAXE)
                .add(ModItems.TWISTED_ROOT_AXE)
                .add(ModItems.ANCIENT_SHERD_SHOVEL)
                .add(ModItems.EXTRAVAGANT_GILDED_HOE)
                .add(ModItems.LIVING_MOB_SWORD);

    }
}
