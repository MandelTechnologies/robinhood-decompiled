package com.robinhood.android.common.dagger;

import com.robinhood.android.common.util.lifecycle.ActivityAnalyticsCallback;
import com.robinhood.android.common.util.lifecycle.ActivityLogger;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibCommonActivityListenersModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/dagger/LibCommonActivityListenersModule;", "", "<init>", "()V", "providesActivityAnalyticsActivityListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "activityAnalyticsCallback", "Lcom/robinhood/android/common/util/lifecycle/ActivityAnalyticsCallback;", "providesActivityLoggerActivityListener", "activityLogger", "Lcom/robinhood/android/common/util/lifecycle/ActivityLogger;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LibCommonActivityListenersModule {
    public static final int $stable = 0;
    public static final LibCommonActivityListenersModule INSTANCE = new LibCommonActivityListenersModule();

    public final ActivityLifecycleListener providesActivityAnalyticsActivityListener(ActivityAnalyticsCallback activityAnalyticsCallback) {
        Intrinsics.checkNotNullParameter(activityAnalyticsCallback, "activityAnalyticsCallback");
        return activityAnalyticsCallback;
    }

    public final ActivityLifecycleListener providesActivityLoggerActivityListener(ActivityLogger activityLogger) {
        Intrinsics.checkNotNullParameter(activityLogger, "activityLogger");
        return activityLogger;
    }

    private LibCommonActivityListenersModule() {
    }
}
