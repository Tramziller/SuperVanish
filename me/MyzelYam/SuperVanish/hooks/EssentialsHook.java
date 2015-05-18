package me.MyzelYam.SuperVanish.hooks;

import me.MyzelYam.SuperVanish.SuperVanish;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.earth2me.essentials.Essentials;
import com.earth2me.essentials.User;

public abstract class EssentialsHook {

	private static SuperVanish plugin = (SuperVanish) Bukkit.getPluginManager()
			.getPlugin("SuperVanish");

	public static void hidePlayer(Player p) {
		try {
			Essentials essentials = (Essentials) Bukkit.getPluginManager()
					.getPlugin("Essentials");
			User u = essentials.getUser(p);
			if (u == null)
				return;
			if (!u.isHidden())
				u.setHidden(true);
		} catch (Exception e) {
			plugin.printException(e);
		}
	}

	public static void showPlayer(Player p) {
		try {
			Essentials essentials = (Essentials) Bukkit.getPluginManager()
					.getPlugin("Essentials");
			User u = essentials.getUser(p);
			if (u == null)
				return;
			if (u.isHidden())
				u.setHidden(false);
		} catch (Exception e) {
			plugin.printException(e);
		}
	}
}