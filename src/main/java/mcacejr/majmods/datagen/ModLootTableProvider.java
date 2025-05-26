package mcacejr.majmods.datagen;


import mcacejr.majmods.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.client.gui.navigation.GuiNavigationPath;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

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

        addDrop(ModBlocks.ORE_CLUSTER, clusterOreDrops(ModBlocks.ORE_CLUSTER));

    }

    public LootTable.Builder clusterOreDrops(Block drop){

        return BlockLootTableGenerator.dropsWithSilkTouch(
                drop, this.applyExplosionDecay(
                        drop, ((LeafEntry.Builder<?>)
                        ItemEntry.builder(Items.COBBLESTONE).apply(SetCountLootFunction
                                .builder(UniformLootNumberProvider.create(1.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));

    }

}

