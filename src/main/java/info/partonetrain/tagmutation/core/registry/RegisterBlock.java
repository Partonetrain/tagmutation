package info.partonetrain.tagmutation.core.registry;

import info.partonetrain.tagmutation.common.block.ConverterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "tagmutation", bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterBlock {

    public static Block.Properties CONVERTER_PROPERTIES = Block.Properties.create(Material.GLASS).doesNotBlockMovement().hardnessAndResistance(1.5F, 6.0F).lightValue(0).sound(SoundType.STONE);
    public static Block CONVERTER_BLOCK = new ConverterBlock(CONVERTER_PROPERTIES).setRegistryName("converter");

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(CONVERTER_BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new BlockItem(CONVERTER_BLOCK, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(CONVERTER_BLOCK.getRegistryName())
        );
    }
}
