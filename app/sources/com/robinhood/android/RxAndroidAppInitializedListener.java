package com.robinhood.android;

import android.app.Application;
import android.os.Looper;
import com.robinhood.utils.AppInitializedListener;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxAndroidAppInitializedListener.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/RxAndroidAppInitializedListener;", "Lcom/robinhood/utils/AppInitializedListener;", "<init>", "()V", "onAppInitialized", "", "app", "Landroid/app/Application;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RxAndroidAppInitializedListener implements AppInitializedListener {
    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(new Function() { // from class: com.robinhood.android.RxAndroidAppInitializedListener.onAppInitialized.1
            @Override // io.reactivex.functions.Function
            public final Scheduler apply(Callable<Scheduler> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AndroidSchedulers.from(Looper.getMainLooper(), true);
            }
        });
    }
}
