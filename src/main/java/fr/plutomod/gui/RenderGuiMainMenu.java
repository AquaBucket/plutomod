package fr.plutomod.gui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RenderGuiMainMenu {

    private static final Logger LOGGER = LogManager.getLogger();
    public RenderGuiMainMenu() {
    	MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {
    	if (event.getGui().getClass() == net.minecraft.client.gui.screen.MainMenuScreen.class) {
    		LOGGER.info("TRUE");
    	}
        LOGGER.info(event.getGui().getClass().getSimpleName());
    }
}
