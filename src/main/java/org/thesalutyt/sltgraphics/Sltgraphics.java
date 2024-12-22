package org.thesalutyt.sltgraphics;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.thesalutyt.sltgraphics.client.screen.ExampleScreen;

import java.util.stream.Collectors;

@Mod("sltgraphics")
public class Sltgraphics {
    public static final Logger LOGGER = LogManager.getLogger();

    public Sltgraphics() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event){
        if(Minecraft.getInstance().player == null) return;
        if(Minecraft.getInstance().screen != null ) return;
        if(event.getKey() == GLFW.GLFW_KEY_L){
            Minecraft.getInstance().setScreen(new ExampleScreen());
        }
    }
}
