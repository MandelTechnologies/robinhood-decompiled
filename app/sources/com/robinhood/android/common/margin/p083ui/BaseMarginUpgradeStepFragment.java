package com.robinhood.android.common.margin.p083ui;

import android.view.View;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.p083ui.toolbar.RhToolbarUtil;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseMarginUpgradeStepFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0018\u0010#\u001a\u00020\u001d*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&J\u0018\u0010'\u001a\u00020\u001d*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&J\u0018\u0010(\u001a\u00020\u001d*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&J\u0018\u0010)\u001a\u00020\u001d*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&J<\u0010*\u001a\u00020\u001d*\u00020$2\f\b\u0002\u0010+\u001a\u00060,j\u0002`-2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&J*\u00102\u001a\u00020\u001d2\f\b\u0002\u0010+\u001a\u00060,j\u0002`-2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "childFragmentsShouldNotConfigureToolbar", "", "getChildFragmentsShouldNotConfigureToolbar", "()Z", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "marginUpgradeEventLogger", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "getMarginUpgradeEventLogger", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "setMarginUpgradeEventLogger", "(Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;)V", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getAnalyticsScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "analyticsScreen$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "onStop", "onBackPressed", "onContinueClicked", "Landroid/view/View;", "onClick", "Lkotlin/Function0;", "onDoneClicked", "onCancelClicked", "onLearnMoreClicked", "onLoggedClick", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "identifier", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "logTap", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class BaseMarginUpgradeStepFragment extends BaseFragment {
    public static final int $stable = 8;

    /* renamed from: analyticsScreen$delegate, reason: from kotlin metadata */
    private final Lazy analyticsScreen;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    private final boolean excludeFromAnalyticsLogging;
    public MarginUpgradeEventLogger marginUpgradeEventLogger;

    public abstract MarginUpgradeStep getStep();

    public BaseMarginUpgradeStepFragment(int i) {
        super(i);
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.excludeFromAnalyticsLogging = true;
        this.analyticsScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginUpgradeStepFragment.analyticsScreen_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    public final MarginUpgradeEventLogger getMarginUpgradeEventLogger() {
        MarginUpgradeEventLogger marginUpgradeEventLogger = this.marginUpgradeEventLogger;
        if (marginUpgradeEventLogger != null) {
            return marginUpgradeEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginUpgradeEventLogger");
        return null;
    }

    public final void setMarginUpgradeEventLogger(MarginUpgradeEventLogger marginUpgradeEventLogger) {
        Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "<set-?>");
        this.marginUpgradeEventLogger = marginUpgradeEventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen analyticsScreen_delegate$lambda$0(BaseMarginUpgradeStepFragment baseMarginUpgradeStepFragment) {
        return baseMarginUpgradeStepFragment.getStep().getScreen();
    }

    public Screen getAnalyticsScreen() {
        return (Screen) this.analyticsScreen.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getStep().getProgressBarValue() == 0.0f) {
            return;
        }
        RhToolbarUtil.setCenteredTitle(toolbar, C11223R.string.margin_investing_toolbar_title);
        toolbar.getProgressBar().setNumSegments(1);
        RdsSegmentedProgressBar.setProgressByAbsolutePosition$default(toolbar.getProgressBar(), getStep().getProgressBarValue() / 9, false, 2, null);
        toolbar.getProgressBar().setVisibility(0);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getMarginUpgradeEventLogger().logScreenAppear(getAnalyticsScreen());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getMarginUpgradeEventLogger().logScreenDisappear(getAnalyticsScreen());
        super.onStop();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        MarginUpgradeEventLogger.logTap$default(getMarginUpgradeEventLogger(), getAnalyticsScreen(), Component.ComponentType.BACK_BUTTON, null, UserInteractionEventData.Action.BACK, 4, null);
        return super.onBackPressed();
    }

    public final void onContinueClicked(View view, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        onLoggedClick$default(this, view, Component.ComponentType.CONTINUE_BUTTON, null, null, onClick, 6, null);
    }

    public final void onDoneClicked(View view, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        onLoggedClick$default(this, view, Component.ComponentType.DONE_BUTTON, null, null, onClick, 6, null);
    }

    public final void onCancelClicked(View view, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        onLoggedClick$default(this, view, Component.ComponentType.CANCEL_BUTTON, null, null, onClick, 6, null);
    }

    public final void onLearnMoreClicked(View view, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        onLoggedClick$default(this, view, null, null, UserInteractionEventData.Action.LEARN_MORE, onClick, 3, null);
    }

    public static /* synthetic */ void onLoggedClick$default(BaseMarginUpgradeStepFragment baseMarginUpgradeStepFragment, View view, Component.ComponentType componentType, String str, UserInteractionEventData.Action action, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoggedClick");
        }
        if ((i & 1) != 0) {
            componentType = Component.ComponentType.BUTTON;
        }
        Component.ComponentType componentType2 = componentType;
        if ((i & 2) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 4) != 0) {
            action = null;
        }
        baseMarginUpgradeStepFragment.onLoggedClick(view, componentType2, str2, action, function0);
    }

    public final void onLoggedClick(View view, final Component.ComponentType componentType, final String identifier, final UserInteractionEventData.Action action, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepFragment.onLoggedClick.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseMarginUpgradeStepFragment.this.logTap(componentType, identifier, action);
                onClick.invoke();
            }
        });
    }

    public static /* synthetic */ void logTap$default(BaseMarginUpgradeStepFragment baseMarginUpgradeStepFragment, Component.ComponentType componentType, String str, UserInteractionEventData.Action action, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logTap");
        }
        if ((i & 1) != 0) {
            componentType = Component.ComponentType.BUTTON;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            action = null;
        }
        baseMarginUpgradeStepFragment.logTap(componentType, str, action);
    }

    public final void logTap(Component.ComponentType componentType, String identifier, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        getMarginUpgradeEventLogger().logTap(getAnalyticsScreen(), componentType, identifier, action);
    }
}
