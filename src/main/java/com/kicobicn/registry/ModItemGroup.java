package com.kicobicn.registry;

import com.kicobicn.KicostestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class ModItemGroup {
    public static ItemGroup COIN = FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.kicostestmod.coin"))
            .icon(() -> new ItemStack(ModItems.COIN))
            .build();
    public static void registerModItemGroup() {
        KicostestMod.LOGGER.debug("Registering mod item group for" + KicostestMod.MOD_ID);
    }
}
