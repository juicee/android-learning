package com.bignerdranch.android.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by parkerzhu on 2016/10/27.
 */

public class AudioPlayer {
    private MediaPlayer mPlayer;
    private int currentPosition = 0;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c) {
        if (mPlayer != null && mPlayer.getCurrentPosition() != 0) {
            mPlayer.start();
        } else {
            stop();
            mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stop();
                }
            });

            mPlayer.start();
        }
    }

    public void pause() {
        if (mPlayer != null) {
            mPlayer.pause();
        }
    }
}
