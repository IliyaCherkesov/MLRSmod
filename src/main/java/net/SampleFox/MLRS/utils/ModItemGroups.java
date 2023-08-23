package net.SampleFox.MLRS.utils;

import net.SampleFox.MLRS.Item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModItemGroups {
    public static CreativeModeTab createGroup(String id, RegistryObject<Item> tabIcon)
    {
        return new CreativeModeTab(id) {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(tabIcon.get());
            }
        };
    }

    public static CreativeModeTab MOD_MATERIALS_TAB = createGroup("mod_materials_tab", ModItems.MANDARIN);
}
