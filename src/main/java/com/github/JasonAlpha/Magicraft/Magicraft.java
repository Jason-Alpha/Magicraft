/*
 * Alpha Code制作
 *
 * 魔法禁书目录 Magicraft 0.0.1 Pre-alpha gametest
 *
 *
 */





package com.github.JasonAlpha.Magicraft;

import com.github.JasonAlpha.Magicraft.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author JasonAlpha
 */
@Mod(modid = Magicraft.MODID, name = Magicraft.NAME, version = Magicraft.VERSION, acceptedMinecraftVersions = "1.12.2")
public class Magicraft {
    public static final String MODID = "magicraft";
    public static final String NAME = "Magicraft";
    public static final String VERSION = "0.0.1";

    private static Object magicraft;



    public static final ThreadLocal<Magicraft> instance = new ThreadLocal<Magicraft>();


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SidedProxy(clientSide = "com.github.JasonAlpha.Magicraft.client.ClientProxy",
            serverSide = "com.github.JasonAlpha.Magicraft.common.CommonProxy")
    public static CommonProxy proxy;}
