package com.xsych.dacraft.registry;

import com.xsych.dacraft.DaCraft;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Blocks
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0f, 30.0f).sounds(BlockSoundGroup.METAL));

    // Register Blocks To Game
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(DaCraft.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }

}
