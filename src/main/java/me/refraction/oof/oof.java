package me.refraction.oof;

import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.io.*;
import java.util.ArrayList;

@Mod(modid = oof.MODID, version = oof.VERSION, name = oof.NAME)
public class oof
{
    public static final String MODID = "refractionoof";
    public static final String VERSION = "1.2";
    public static final String NAME = "oof";

    private String nickData;
    private String msg;
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        ClientCommandHandler.instance.registerCommand((ICommand)new Commands());
    }

    @SubscribeEvent
    public void onChatReceived(ClientChatReceivedEvent e) {
        msg = e.message.getUnformattedText();
        if(msg.startsWith("+") && msg.contains("Kill") && msg.contains("coins")) {
            Minecraft.getMinecraft().thePlayer.playSound("refractionoof:oof", 5.0f, 1);
        }
        else if(msg.startsWith("You died!")) {
            Minecraft.getMinecraft().thePlayer.playSound("refractionoof:oof", 5.0f, 0.5f);
        }
    }
}
