package com.robinhood.android.common.util.lifecycle;

import com.robinhood.android.common.p088ui.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainTabActivityListener.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "", "onMainTabActivityCreated", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "onMainTabActivityResumed", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface MainTabActivityListener {

    /* compiled from: MainTabActivityListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onMainTabActivityCreated(MainTabActivityListener mainTabActivityListener, BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void onMainTabActivityResumed(MainTabActivityListener mainTabActivityListener, BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    void onMainTabActivityCreated(BaseActivity activity);

    void onMainTabActivityResumed(BaseActivity activity);
}
