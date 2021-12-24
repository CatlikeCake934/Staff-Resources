package me.catlikecake934.staffresources;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class config {
    public static File file;
    public static FileConfiguration configFile;

    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("StaffResources").getDataFolder(), "config.yml");

        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                //nothing
            }
        }
        configFile = YamlConfiguration.loadConfiguration(file);
    }
    public static FileConfiguration get(){
        return configFile;
    }

    public static void save(){
        try{
            configFile.save(file);
        }catch (IOException e){
            System.out.println("Cannot save config");
        }
    }

    public static void reload(){
        configFile = YamlConfiguration.loadConfiguration(file);
    }

}
