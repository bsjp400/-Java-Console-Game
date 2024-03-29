package com.baeseokjae;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		 try {
			 this.isLoop = isLoop;
			 file = new File(MapleStory.class.getResource(name).toURI());
			 fis = new FileInputStream(file);
			 bis = new BufferedInputStream(fis);
			 player = new Player(bis);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				 bis = new BufferedInputStream(fis);
				 player = new Player(bis);
			} while (isLoop);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}