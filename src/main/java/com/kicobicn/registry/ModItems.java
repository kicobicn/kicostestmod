package com.kicobicn.registry;

import com.kicobicn.KicostestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COIN = registerItem("coin",
        new Item(new FabricItemSettings()),
            ModItemGroup.COIN );

    private static Item registerItem(String coin, Item item, ItemGroup coin1) {
        return item;
    }

    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup> itemGroup, RegistryKey<ItemGroup>... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM,new Identifier(KicostestMod.MOD_ID,name),item);
        for (RegistryKey<ItemGroup> ItemGroup : itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void registerModItems(){
        KicostestMod.LOGGER.debug("Registering mod items for" + KicostestMod.MOD_ID);
    }
}
