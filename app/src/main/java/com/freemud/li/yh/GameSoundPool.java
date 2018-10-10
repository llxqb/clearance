package com.freemud.li.yh;

import java.util.HashMap;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * ????Ч
 * @author gary
 *
 */
public class GameSoundPool {
	private Context mContext;

	public GameSoundPool(Context context) {
		mContext = context;
		initSounds();
	}

	// ??Ч??????
	int streamVolume;

	// ????SoundPool????
	private SoundPool soundPool;

	// ????HASH??
	private HashMap<Integer, Integer> soundPoolMap;

	/***************************************************************
	 * Function:initSounds(); Parameters:null Returns:None. Description:???????????
	 * Notes:none.
	 ***************************************************************/
	public void initSounds() {
		// ?????soundPool????,????????????????ж????????????????,??2????????????????,?????????????????????
		soundPool = new SoundPool(100, AudioManager.STREAM_MUSIC, 100);

		// ?????HASH??
		soundPoolMap = new HashMap<Integer, Integer>();

		// ????????豸???豸????
		AudioManager mgr = (AudioManager) mContext
				.getSystemService(Context.AUDIO_SERVICE);
		streamVolume = mgr.getStreamVolume(AudioManager.STREAM_MUSIC);
	}

	/***************************************************************
	 * Function:loadSfx(); Parameters:null Returns:None. Description:??????Ч???
	 * Notes:none.
	 ***************************************************************/
	public void loadSfx(int raw, int ID) {
		// ??????е???Ч??????????ID(????????????????ID?????????)
		soundPoolMap.put(ID, soundPool.load(mContext, raw, ID));
	}

	/***************************************************************
	 * Function:play(); Parameters:sound:????????Ч??ID,loop:??????? Returns:None.
	 * Description:???????? Notes:none.
	 ***************************************************************/
	public void play(int sound, int uLoop) {
		soundPool.play(soundPoolMap.get(sound), streamVolume, streamVolume, 1,
				uLoop, 1f);
		
	}
}