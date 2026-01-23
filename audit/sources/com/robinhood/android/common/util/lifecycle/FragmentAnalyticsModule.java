package com.robinhood.android.common.util.lifecycle;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;

/* compiled from: FragmentAnalyticsModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsModule;", "", "<init>", "()V", "bindFragmentAnalyticsCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "callbacks", "Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsCallbacks;", "bindFragmentLogger", "logger", "Lcom/robinhood/android/common/util/lifecycle/FragmentLogger;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class FragmentAnalyticsModule {
    public static final int $stable = 0;

    public abstract FragmentManager.FragmentLifecycleCallbacks bindFragmentAnalyticsCallbacks(FragmentAnalyticsCallbacks callbacks);

    public abstract FragmentManager.FragmentLifecycleCallbacks bindFragmentLogger(FragmentLogger logger);
}
