package com.robinhood.android.plt;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.plt.contract.PltZeroLoadingScreen;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: PltScreenLifecycleCallbacks.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/plt/PltScreenLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "<init>", "(Lcom/robinhood/android/plt/contract/PltManager;)V", "onFragmentStarted", "", "fm", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "onFragmentStopped", "isFragmentNotEligibleForPlt", "", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PltScreenLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    public static final int $stable = 8;
    private final PltManager pltManager;

    public PltScreenLifecycleCallbacks(PltManager pltManager) {
        Intrinsics.checkNotNullParameter(pltManager, "pltManager");
        this.pltManager = pltManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fm, Fragment fragment) {
        Screen screen;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        List<Fragment> list = fragments;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Fragment fragment2 : list) {
                Intrinsics.checkNotNull(fragment2);
                if (!isFragmentNotEligibleForPlt(fragment2) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i <= 0 && !isFragmentNotEligibleForPlt(fragment)) {
            PltManager pltManager = this.pltManager;
            if (fragment instanceof AutoLoggableFragment) {
                screen = ((AutoLoggableFragment) fragment).getEventScreen();
            } else {
                Screen.Name name = Screen.Name.NAME_UNSPECIFIED;
                String simpleName = fragment.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                screen = new Screen(name, null, simpleName, null, 10, null);
            }
            pltManager.onScreenAppear(screen, fragment instanceof PltZeroLoadingScreen);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fm, Fragment fragment) {
        Screen screen;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (isFragmentNotEligibleForPlt(fragment)) {
            return;
        }
        PltManager pltManager = this.pltManager;
        if (fragment instanceof AutoLoggableFragment) {
            screen = ((AutoLoggableFragment) fragment).getEventScreen();
        } else {
            Screen.Name name = Screen.Name.NAME_UNSPECIFIED;
            String simpleName = fragment.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            screen = new Screen(name, null, simpleName, null, 10, null);
        }
        pltManager.onScreenDisappear(screen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isFragmentNotEligibleForPlt(Fragment fragment) {
        boolean z = fragment instanceof UiCallbacks.ScreenViewAnalyticable;
        UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable = z ? (UiCallbacks.ScreenViewAnalyticable) fragment : null;
        if (screenViewAnalyticable == null || !screenViewAnalyticable.getExcludeFromAnalyticsLogging()) {
            UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable2 = z ? (UiCallbacks.ScreenViewAnalyticable) fragment : null;
            if ((screenViewAnalyticable2 == null || !screenViewAnalyticable2.isParentScreen()) && !(fragment instanceof DialogFragment)) {
                String name = fragment.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.startsWith$default(name, "com.robinhood", false, 2, (Object) null)) {
                    String simpleName = fragment.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    if (!StringsKt.startsWith$default(simpleName, "Debug", false, 2, (Object) null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
