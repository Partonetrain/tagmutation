package info.partonetrain.tagmutation.core;

import info.partonetrain.tagmutation.core.proxy.ClientProxy;
import info.partonetrain.tagmutation.core.proxy.ServerProxy;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tagmutation")
public class TagmutationCore {
    public static ServerProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public void Tagmutation() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
        System.out.println("Tagmutation FML Loaded");
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
        proxy.init();
    }

}
