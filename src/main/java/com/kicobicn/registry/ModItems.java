package com.kicobicn.registry;

import com.kicobicn.Kicostestmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM,new Identifier(Kicostestmod.MOD_ID,name),item);
        for (net.minecraft.item.ItemGroup ItemGroup : itemGroups){
            RegistryKey<net.minecraft.item.ItemGroup> itemGroup = null;
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
}
