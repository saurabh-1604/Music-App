package com.iven.musicplayergo.playback;

import android.support.annotation.IntDef;

import com.iven.musicplayergo.MainActivity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public abstract class PlaybackInfoListener {

    public void onPositionChanged(int position) {
    }

    public void onStateChanged(@State int state) {
    }

    public void onPlaybackCompleted() {
    }

    @IntDef({State.INVALID, State.PLAYING, State.PAUSED, State.COMPLETED, State.RESUMED})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {

        int INVALID = -1;
        int PLAYING = 0;
        int PAUSED = 1;
        int COMPLETED = 2;
        int RESUMED = 3;
    }
}