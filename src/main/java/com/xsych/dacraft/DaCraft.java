package com.xsych.dacraft;

import com.xsych.dacraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class DaCraft implements ModInitializer {

    public static final String MOD_ID = "dacraft";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
