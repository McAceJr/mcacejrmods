package mcacejr.majmods.util;

import mcacejr.majmods.McAceJrMods;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> DEPTHSTONE_VARIATIONS =
                createTag("depthstone_variations");

        private static TagKey<Block> createTag(String name) {

            return TagKey.of(RegistryKeys.BLOCK, new Identifier(McAceJrMods.MOD_ID, name));

        }

    }

    public static class Items {

        public static final TagKey<Item> LEGENDARY_MATERIALS =
                createTag("legendary_materials");
        public static final TagKey<Item> LEGENDARY_TOOLS =
                createTag("legendary_tools");

        public static final TagKey<Item> STONE_ORES =
                createTag("stone_ores");
        public static final TagKey<Item> DEEPSLATE_ORES =
                createTag("deepslate_ores");

        private static TagKey<Item> createTag(String name) {

            return TagKey.of(RegistryKeys.ITEM, new Identifier(McAceJrMods.MOD_ID, name));

        }

    }

}
