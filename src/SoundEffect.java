import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * This enum encapsulates all the sound effects of a game, so as to separate the sound playing
 * codes from the game codes.
 * 1. Define all your sound effect names and the associated wave file.
 * 2. To play a specific sound, simply invoke SoundEffect.SOUND_NAME.play().
 * 3. You might optionally invoke the static method SoundEffect.init() to pre-load all the
 *    sound files, so that the play is not paused while loading the file for the first time.
 * 4. You can use the static variable SoundEffect.volume to mute the sound.
 */
public enum SoundEffect {
	BUTTON1("button-16.wav"),   
	BUTTON2("button-17.wav"),         
	BUTTON3("button-19.wav"),
	BUTTON4("button-20.wav"),
	BUTTON5("button-24.wav"),
	BUTTON6("button-28.wav"),
	BUTTON7("button-29.wav"),
	BUTTON8("button-7.wav"),
	BUTTON9("button-9.wav"),
	MAINBUTTON("Game_Music.wav");

	// Nested class for specifying volume
	public static enum Volume {
		MUTE, LOW, MEDIUM, HIGH
	}

	public static Volume volume = Volume.LOW;

	// Each sound effect has its own clip, loaded with its own sound file.
	private Clip clip;

	private File url;

	// Constructor to construct each element of the enum with its own sound file.
	SoundEffect(String soundFileName) {
		try {
			url =  new File("resources/music/" + soundFileName);
			// Get a clip resource.
			clip = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}

	// Play or Re-play the sound effect from the beginning, by rewinding.
	public void play(Clip clip) {
		if (clip.isRunning() || clip.isOpen()) {
			clip.stop();
			clip.close();
		}

		// Set up an audio input stream piped from the sound file.
		AudioInputStream audioInputStream;
		try {
			audioInputStream = AudioSystem.getAudioInputStream(url);
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioInputStream);
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

		clip.setFramePosition(0); // rewind to the beginning
		clip.start();     // Start playing
	}

	// Optional static method to pre-load all the sound files.
	static void init() {
		values(); // calls the constructor for all the elements
	}
}