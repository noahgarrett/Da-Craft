package com.xsych.dacraft.registry;

import com.xsych.dacraft.DaCraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    // Items
    public static final Item RUBY = new Item(new Item.Settings().group(DaCraft.ITEM_GROUP));

    // Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(DaCraft.ITEM_GROUP));

    // Register Items To Game
    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(DaCraft.MOD_ID, "ruby"), RUBY);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier(DaCraft.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }

}
