package Model;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net modified by Peter Bachman to work with the Mancla project
 */

public class Music implements LineListener {


	/**
	 * this flag indicates whether the playback completes or not.
	 */
	boolean playCompleted;

	/**
	 * Play a given audio file in the background. Export this from the music class to the center panel
	 */
	/*
		public static void play() {
		play("Audio/Majestic-Middle-Eastern-Desert-splash16.wav");
		}
		*/

	/**
	 * Play a given audio file.
	 *
	 * @param audioFilePath Path of the audio file.
	 */
	public static void play(String audioFilePath) {
		File audioFile = new File("Audio/Majestic-Middle-Eastern-Desert-splash16.wav");

		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

			AudioFormat format = audioStream.getFormat();

			DataLine.Info info = new DataLine.Info(Clip.class, format);

			Clip audioClip = (Clip) AudioSystem.getLine(info);

			//audioClip.addLineListener(this);
			audioClip.

			audioClip.open(audioStream);
			//System.out.println("Mancala123");
			audioClip.start();

			while (!playCompleted) {
				// wait for the playback completes
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}

			audioClip.close();

		} catch (UnsupportedAudioFileException ex) {
			System.out.println("The specified audio file is not supported.");
			ex.printStackTrace();
		} catch (LineUnavailableException ex) {
			System.out.println("Audio line for playing back is unavailable.");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("Error playing the audio file.");
			ex.printStackTrace();
		}

	}

	public static void play() {
	}

	public boolean isPlayCompleted() {
		return playCompleted;
	}

	public void setPlayCompleted(boolean playCompleted) {
		this.playCompleted = playCompleted;
	}

	/**
	 * Listens to the START and STOP events of the audio line.
	 */
	@Override
	public void update(LineEvent event) {
		LineEvent.Type type = event.getType();

		if (type == LineEvent.Type.START) {
			System.out.println("Playback started.");

		} else if (type == LineEvent.Type.STOP) {
			playCompleted = true;
			System.out.println("Playback completed.");
		}

	}
}

	//public static void main(String[] args) {
		//String audioFilePath = "Audio/Majestic-Middle-Eastern-Desert-splash16.wav";
		//Music player = new Music();
		//player.play(audioFilePath);
	//}

//}