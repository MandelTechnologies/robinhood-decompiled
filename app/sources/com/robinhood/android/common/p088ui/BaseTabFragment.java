package com.robinhood.android.common.p088ui;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.Intents2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseTabFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0006\u0010\u0019\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0004J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0004J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0004J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0004J\b\u0010 \u001a\u00020\u0016H$J\b\u0010!\u001a\u00020\u0016H\u0014J\b\u0010\"\u001a\u00020\u0016H\u0016J\u0006\u0010#\u001a\u00020\u0016J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\n¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseTabFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/BaseFragment$ChildFragmentAnimationOverrider;", "contentLayoutId", "", "<init>", "(I)V", "doNotAnimate", "", "getDoNotAnimate", "()Z", "setDoNotAnimate", "(Z)V", "shouldOverrideChildFragmentAnimation", "getShouldOverrideChildFragmentAnimation", "forcedChildAnimationResId", "getForcedChildAnimationResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "resetAndShowRootFragment", "reset", "setRootFragment", "fragment", "Landroidx/fragment/app/Fragment;", "getRootFragment", "setRootFragmentIfDifferent", "showRootFragment", "handleDeeplink", "onTabButtonLongClicked", "scrollToTop", "setFragmentData", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInTab;", BaseTabFragment.ARG_NAVIGATION_TYPE_OVERRIDE, "Lcom/robinhood/android/navigation/NavigationType;", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public abstract class BaseTabFragment extends BaseFragment implements BaseFragment.ChildFragmentAnimationOverrider {
    public static final String ARG_FRAGMENT_DATA = "fragmentData";
    private static final String ARG_NAVIGATION_TYPE_OVERRIDE = "navigationTypeOverride";
    private static final String TAG_ROOT = "root";
    private boolean doNotAnimate;
    private final boolean excludeFromAnalyticsLogging;
    private final Integer forcedChildAnimationResId;
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    @SuppressLint({"MissingSuperCall"})
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
    }

    public void onTabButtonLongClicked() {
    }

    protected abstract void showRootFragment();

    public BaseTabFragment(int i) {
        super(i);
        this.excludeFromAnalyticsLogging = true;
    }

    public final boolean getDoNotAnimate() {
        return this.doNotAnimate;
    }

    public final void setDoNotAnimate(boolean z) {
        this.doNotAnimate = z;
    }

    @Override // com.robinhood.android.common.ui.BaseFragment.ChildFragmentAnimationOverrider
    public boolean getShouldOverrideChildFragmentAnimation() {
        return this.doNotAnimate;
    }

    @Override // com.robinhood.android.common.ui.BaseFragment.ChildFragmentAnimationOverrider
    public Integer getForcedChildAnimationResId() {
        return this.forcedChildAnimationResId;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    public final void resetAndShowRootFragment() {
        reset();
        showRootFragment();
    }

    protected final void reset() {
        popEntireFragmentBackstack(true);
        Fragment rootFragment = getRootFragment();
        if (rootFragment != null) {
            getChildFragmentManager().beginTransaction().remove(rootFragment).commitNow();
        }
    }

    protected final void setRootFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (getChildFragmentManager().isStateSaved()) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(C11048R.id.fragment_container, fragment, "root").commitNow();
    }

    protected final Fragment getRootFragment() {
        return getChildFragmentManager().findFragmentByTag("root");
    }

    protected final void setRootFragmentIfDifferent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Fragment rootFragment = getRootFragment();
        if (rootFragment == null || rootFragment.getClass() != fragment.getClass()) {
            setRootFragment(fragment);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void handleDeeplink() {
        NavigationType navigationType;
        Bundle arguments;
        Object serializable;
        Bundle arguments2 = getArguments();
        HostIntentKey.ShowFragmentInTab showFragmentInTab = arguments2 != null ? (HostIntentKey.ShowFragmentInTab) arguments2.getParcelable(ARG_FRAGMENT_DATA) : null;
        if (showFragmentInTab != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    serializable = arguments3.getSerializable(ARG_NAVIGATION_TYPE_OVERRIDE, NavigationType.class);
                } else {
                    Object serializable2 = arguments3.getSerializable(ARG_NAVIGATION_TYPE_OVERRIDE);
                    if (!(serializable2 instanceof NavigationType)) {
                        serializable2 = null;
                    }
                    serializable = (NavigationType) serializable2;
                }
                navigationType = (NavigationType) serializable;
                if (navigationType == null) {
                }
            } else {
                navigationType = showFragmentInTab.getNavigationType();
            }
            Bundle bundleRequireArguments = requireArguments();
            bundleRequireArguments.remove(ARG_FRAGMENT_DATA);
            bundleRequireArguments.remove(ARG_NAVIGATION_TYPE_OVERRIDE);
            Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), showFragmentInTab.getFragmentKey(), null, 2, null);
            if (navigationType != null && (arguments = fragmentCreateFragment$default.getArguments()) != null) {
                Intents2.putNavigationType(arguments, navigationType);
            }
            if (showFragmentInTab.getAddToBackstack()) {
                replaceFragment(fragmentCreateFragment$default);
            } else {
                replaceFragmentWithoutBackStack(fragmentCreateFragment$default);
            }
        }
    }

    public final void scrollToTop() {
        ActivityResultCaller rootFragment = getRootFragment();
        Scrollable scrollable = rootFragment instanceof Scrollable ? (Scrollable) rootFragment : null;
        if (scrollable != null) {
            scrollable.scrollToTop();
        }
    }

    public static /* synthetic */ void setFragmentData$default(BaseTabFragment baseTabFragment, HostIntentKey.ShowFragmentInTab showFragmentInTab, NavigationType navigationType, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFragmentData");
        }
        if ((i & 2) != 0) {
            navigationType = null;
        }
        baseTabFragment.setFragmentData(showFragmentInTab, navigationType);
    }

    public final void setFragmentData(HostIntentKey.ShowFragmentInTab data, NavigationType navigationTypeOverride) {
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            setArguments(arguments);
        }
        arguments.putParcelable(ARG_FRAGMENT_DATA, data);
        arguments.putSerializable(ARG_NAVIGATION_TYPE_OVERRIDE, navigationTypeOverride);
    }
}
