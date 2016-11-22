package nerdlauncher.android.bignerdranch.com.nerdlauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment CreateFragment() {
        return new NerdLauncherFragment();
    }
}
