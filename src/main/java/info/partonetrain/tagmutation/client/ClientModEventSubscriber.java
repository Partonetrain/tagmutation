package info.partonetrain.tagmutation.client;


import info.partonetrain.tagmutation.TagmutationCore;
import info.partonetrain.tagmutation.client.gui.ConverterScreen;
import info.partonetrain.tagmutation.container.ConverterContainer;
import info.partonetrain.tagmutation.init.RegisterContainer;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = TagmutationCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {
    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event){
        //register screens
        ScreenManager.registerFactory(RegisterContainer.CONVERTER_CONTAINER.get(), ConverterScreen::new);
    }
}
