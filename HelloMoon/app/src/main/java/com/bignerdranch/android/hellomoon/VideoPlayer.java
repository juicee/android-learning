package com.bignerdranch.android.hellomoon;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by parkerzhu on 2016/10/27.
 */

public class VideoPlayer {
    private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c, SurfaceHolder v) {
        if (mPlayer != null && mPlayer.getCurrentPosition() != 0) {
            mPlayer.start();
        } else {
            stop();
            mPlayer = MediaPlayer.create(c, R.raw.test_video);
            mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mPlayer.setDisplay(v);
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
