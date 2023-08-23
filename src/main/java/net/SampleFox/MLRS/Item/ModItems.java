package net.SampleFox.MLRS.Item;

import net.SampleFox.MLRS.SampleMod;
import net.SampleFox.MLRS.utils.ModItemGroups;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SampleMod.MOD_ID);

    public static void register(IEventBus eventBus){
         ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> MANDARIN = ITEMS.register("mandarin",
            ()-> new Item(new Item.Properties().tab(ModItemGroups.MOD_MATERIALS_TAB)));


}
