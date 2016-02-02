package pk.leakcanarydemo;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * @author zijiao
 * @version 2016/1/30
 * @Mark
 */
public class MainApplication extends Application {

    private RefWatcher mWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        mWatcher = LeakCanary.install(this);
        mWatcher.watch(this);
    }

    public static RefWatcher getWatcher(Context context) {
        MainApplication application = (MainApplication) context.getApplicationContext();
        return application.mWatcher;
    }

}
