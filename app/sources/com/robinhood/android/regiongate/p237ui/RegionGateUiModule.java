package com.robinhood.android.regiongate.p237ui;

import androidx.fragment.app.FragmentManager;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGateLifecycleCallbacks;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;

/* compiled from: RegionGateUiModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/RegionGateUiModule;", "", "<init>", "()V", "bindRegionGateFragmentLifecycleCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "callbacks", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGateLifecycleCallbacks;", "bindRegionGateActivityLifecycleCallbacks", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class RegionGateUiModule {
    public abstract ActivityLifecycleListener bindRegionGateActivityLifecycleCallbacks(RegionGateLifecycleCallbacks callbacks);

    public abstract FragmentManager.FragmentLifecycleCallbacks bindRegionGateFragmentLifecycleCallbacks(RegionGateLifecycleCallbacks callbacks);
}
