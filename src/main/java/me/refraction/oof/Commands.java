package me.refraction.oof;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

/**
 * Created by Refraction on 18/11/2017.
 */
public class Commands extends CommandBase {

    @Override
    public String getCommandName() {
        return "oof";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/oof";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(args.length != 0) {
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Usage: /oof"));
        }
        else {
            oof oof = new oof();
            // do gui shit
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender sender) {
        return true;
    }
}
