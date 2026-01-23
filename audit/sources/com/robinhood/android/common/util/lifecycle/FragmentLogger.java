package com.robinhood.android.common.util.lifecycle;

import android.os.Bundle;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: FragmentLogger.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/FragmentLogger;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "<init>", "()V", "descriptorCache", "Landroid/util/LruCache;", "", "", "onFragmentCreated", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentResumed", "onFragmentPaused", "onFragmentDestroyed", "getFragmentInfo", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FragmentLogger extends FragmentManager.FragmentLifecycleCallbacks {
    public static final int $stable = 8;
    private final LruCache<Integer, String> descriptorCache = new LruCache<>(5);

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Timber.INSTANCE.mo3356i("onCreate -- %s", getFragmentInfo(f));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Timber.INSTANCE.mo3356i("onResume -- %s", getFragmentInfo(f));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Timber.INSTANCE.mo3356i("onPause -- %s", getFragmentInfo(f));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Timber.INSTANCE.mo3356i("onDestroy -- %s", getFragmentInfo(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getFragmentInfo(Fragment f) {
        int iHashCode = f.hashCode();
        String str = this.descriptorCache.get(Integer.valueOf(iHashCode));
        if (str == null) {
            str = f.getClass().getSimpleName() + "@" + Integer.toHexString(iHashCode);
            this.descriptorCache.put(Integer.valueOf(iHashCode), str);
        }
        String str2 = null;
        AutoLoggableFragment autoLoggableFragment = f instanceof AutoLoggableFragment ? (AutoLoggableFragment) f : null;
        try {
            if (autoLoggableFragment != null) {
                str2 = autoLoggableFragment.getEventScreen().getName() + PlaceholderUtils.XXShortPlaceholderText + autoLoggableFragment.getEventScreen().getIdentifier();
            } else if (f instanceof UiCallbacks.ScreenViewAnalyticable) {
                str2 = ((UiCallbacks.ScreenViewAnalyticable) f).getScreenName() + PlaceholderUtils.XXShortPlaceholderText + ((UiCallbacks.ScreenViewAnalyticable) f).getScreenDescription();
            }
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
        }
        if (str2 == null) {
            return str;
        }
        return str + PlaceholderUtils.XXShortPlaceholderText + str2;
    }
}
