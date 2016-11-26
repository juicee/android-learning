package com.tencent.remotecontrol;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RemoteControlActivity extends SingleFragmentActivity {
    @Override
    protected Fragment CreateFragment() {
        return new RemoteControlFragment();
    }
}
