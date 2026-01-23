package com.robinhood.android.common.margin.p083ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MarginTieredRatesContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseMarginUpgradeStepComposeFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\r\u0010#\u001a\u00020 H\u0017¢\u0006\u0002\u0010$J\r\u0010%\u001a\u00020 H\u0017¢\u0006\u0002\u0010$J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J*\u0010)\u001a\u00020 2\f\b\u0002\u0010*\u001a\u00060+j\u0002`,2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100JB\u00101\u001a\u0002022\u0010\b\u0002\u0010*\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,2\n\b\u0002\u00103\u001a\u0004\u0018\u00010.2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\u0010\b\u0002\u0010/\u001a\n\u0018\u000100j\u0004\u0018\u0001`6J\u001e\u00107\u001a\u0002022\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "<init>", "()V", "childFragmentsShouldNotConfigureToolbar", "", "getChildFragmentsShouldNotConfigureToolbar", "()Z", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "marginUpgradeEventLogger", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "getMarginUpgradeEventLogger", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "setMarginUpgradeEventLogger", "(Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;)V", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "isUk", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getAnalyticsScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "analyticsScreen$delegate", "Lkotlin/Lazy;", "navigationIcon", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;", "getNavigationIcon", "()Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "MarginUpgradeStepComposable", "onStart", "onStop", "onBackPressed", "logTap", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "identifier", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "componentIdentifier", "tieredRatesContext", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContext;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "getTieredRatesEventDescriptor", "marginAvailableAmount", "", "highlightedAmountBorrowed", "highlightedInterestRate", "NavigationIcon", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class BaseMarginUpgradeStepComposeFragment extends GenericActionHandlingFragment {
    public static final int $stable = 8;
    private final boolean isUk;
    public MarginUpgradeEventLogger marginUpgradeEventLogger;
    private final boolean childFragmentsShouldNotConfigureToolbar = true;
    private final boolean excludeFromAnalyticsLogging = true;

    /* renamed from: analyticsScreen$delegate, reason: from kotlin metadata */
    private final Lazy analyticsScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseMarginUpgradeStepComposeFragment.analyticsScreen_delegate$lambda$0(this.f$0);
        }
    });
    private final NavigationIcon navigationIcon = NavigationIcon.BACK;

    public void MarginUpgradeStepComposable(Composer composer, int i) {
        composer.startReplaceGroup(-62245818);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-62245818, i, -1, "com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.MarginUpgradeStepComposable (BaseMarginUpgradeStepComposeFragment.kt:95)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public abstract MarginUpgradeStep getStep();

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

    /* renamed from: isUk, reason: from getter */
    public boolean getIsUk() {
        return this.isUk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen analyticsScreen_delegate$lambda$0(BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment) {
        return baseMarginUpgradeStepComposeFragment.getStep().getScreen();
    }

    public Screen getAnalyticsScreen() {
        return (Screen) this.analyticsScreen.getValue();
    }

    public NavigationIcon getNavigationIcon() {
        return this.navigationIcon;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, int i) {
        composer.startReplaceGroup(-716271414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-716271414, i, -1, "com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent (BaseMarginUpgradeStepComposeFragment.kt:48)");
        }
        ScaffoldKt.m5625Scaffold27mzLpw(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE)), null, ComposableLambda3.rememberComposableLambda(-488827057, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ComposableLambda composableLambdaRememberComposableLambda;
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-488827057, i2, -1, "com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent.<anonymous> (BaseMarginUpgradeStepComposeFragment.kt:55)");
                }
                Function2<Composer, Integer, Unit> lambda$1235124860$feature_lib_margin_externalDebug = BaseMarginUpgradeStepComposeFragment2.INSTANCE.getLambda$1235124860$feature_lib_margin_externalDebug();
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(2009560784, true, new AnonymousClass1(BaseMarginUpgradeStepComposeFragment.this), composer2, 54);
                composer2.startReplaceGroup(-1611350068);
                if (BaseMarginUpgradeStepComposeFragment.this.getStep().getShowProgressBar()) {
                    final BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment = BaseMarginUpgradeStepComposeFragment.this;
                    composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1774638458, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoAppBar, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i3 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1774638458, i3, -1, "com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent.<anonymous>.<anonymous> (BaseMarginUpgradeStepComposeFragment.kt:65)");
                            }
                            if (baseMarginUpgradeStepComposeFragment.getIsUk()) {
                                composer3.startReplaceGroup(-1501802678);
                                MarginUpgradeStep.ProgressBarData ukOnboardingProgressBarData = baseMarginUpgradeStepComposeFragment.getStep().getUkOnboardingProgressBarData();
                                if (ukOnboardingProgressBarData != null) {
                                    BentoProgressBar2.m20699BentoProgressBarnBX6wN0(ukOnboardingProgressBarData.getSegmentIdx(), ukOnboardingProgressBarData.getProgress(), ukOnboardingProgressBarData.getSegments(), null, 0L, 0L, false, composer3, 0, 120);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1501369763);
                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(0, baseMarginUpgradeStepComposeFragment.getStep().getProgressBarValue() / 9, 1, null, 0L, 0L, false, composer3, 390, 120);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                } else {
                    composableLambdaRememberComposableLambda = null;
                }
                ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
                composer2.endReplaceGroup();
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1235124860$feature_lib_margin_externalDebug, null, composableLambdaRememberComposableLambda2, null, composableLambda, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12583302, 0, 1898);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: BaseMarginUpgradeStepComposeFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment$ComposeContent$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                final /* synthetic */ BaseMarginUpgradeStepComposeFragment this$0;

                /* compiled from: BaseMarginUpgradeStepComposeFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment$ComposeContent$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[NavigationIcon.values().length];
                        try {
                            iArr[NavigationIcon.BACK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[NavigationIcon.CLOSE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                AnonymousClass1(BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment) {
                    this.this$0 = baseMarginUpgradeStepComposeFragment;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                    invoke(bentoAppBarScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i & 6) == 0) {
                        i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2009560784, i2, -1, "com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent.<anonymous>.<anonymous> (BaseMarginUpgradeStepComposeFragment.kt:58)");
                    }
                    int i3 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getNavigationIcon().ordinal()];
                    if (i3 == 1) {
                        composer.startReplaceGroup(-1547366509);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BaseMarginUpgradeStepComposeFragment.C112261.AnonymousClass1.invoke$lambda$1$lambda$0(baseMarginUpgradeStepComposeFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                        composer.endReplaceGroup();
                    } else {
                        if (i3 != 2) {
                            composer.startReplaceGroup(-1547368719);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-1547363692);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BaseMarginUpgradeStepComposeFragment.C112261.AnonymousClass1.invoke$lambda$3$lambda$2(baseMarginUpgradeStepComposeFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment) {
                    baseMarginUpgradeStepComposeFragment.onBackPressed();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment) {
                    baseMarginUpgradeStepComposeFragment.onBackPressed();
                    return Unit.INSTANCE;
                }
            }
        }, composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-239627256, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent.2
            public final void invoke(PaddingValues it, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i2 & 6) == 0) {
                    i2 |= composer2.changed(it) ? 4 : 2;
                }
                if ((i2 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-239627256, i2, -1, "com.robinhood.android.common.margin.ui.BaseMarginUpgradeStepComposeFragment.ComposeContent.<anonymous> (BaseMarginUpgradeStepComposeFragment.kt:88)");
                }
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, it);
                BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment = BaseMarginUpgradeStepComposeFragment.this;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                baseMarginUpgradeStepComposeFragment.MarginUpgradeStepComposable(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                invoke(paddingValues, composer2, num.intValue());
                return Unit.INSTANCE;
            }
        }, composer, 54), composer, 384, 12582912, 98298);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
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
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return true;
    }

    public static /* synthetic */ void logTap$default(BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment, Component.ComponentType componentType, String str, UserInteractionEventData.Action action, int i, Object obj) {
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
        baseMarginUpgradeStepComposeFragment.logTap(componentType, str, action);
    }

    public final void logTap(Component.ComponentType componentType, String identifier, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        getMarginUpgradeEventLogger().logTap(getAnalyticsScreen(), componentType, identifier, action);
    }

    public static /* synthetic */ UserInteractionEventDescriptor getEventDescriptor$default(BaseMarginUpgradeStepComposeFragment baseMarginUpgradeStepComposeFragment, Component.ComponentType componentType, String str, MarginTieredRatesContext marginTieredRatesContext, UserInteractionEventData.Action action, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEventDescriptor");
        }
        if ((i & 1) != 0) {
            componentType = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            marginTieredRatesContext = null;
        }
        if ((i & 8) != 0) {
            action = null;
        }
        return baseMarginUpgradeStepComposeFragment.getEventDescriptor(componentType, str, marginTieredRatesContext, action);
    }

    public final UserInteractionEventDescriptor getEventDescriptor(Component.ComponentType componentType, String componentIdentifier, MarginTieredRatesContext tieredRatesContext, UserInteractionEventData.Action action) {
        Component component = (componentType == null || componentIdentifier == null) ? null : new Component(componentType, componentIdentifier, null, 4, null);
        return new UserInteractionEventDescriptor(null, getAnalyticsScreen(), action == null ? UserInteractionEventData.Action.ACTION_UNSPECIFIED : action, Context.copy$default(getMarginUpgradeEventLogger().getLoggingContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, tieredRatesContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -134217729, -1, 16383, null), component, null, 33, null);
    }

    public final UserInteractionEventDescriptor getTieredRatesEventDescriptor(double marginAvailableAmount, String highlightedAmountBorrowed, String highlightedInterestRate) {
        Intrinsics.checkNotNullParameter(highlightedAmountBorrowed, "highlightedAmountBorrowed");
        Intrinsics.checkNotNullParameter(highlightedInterestRate, "highlightedInterestRate");
        return getEventDescriptor$default(this, null, null, new MarginTieredRatesContext(marginAvailableAmount, highlightedAmountBorrowed, highlightedInterestRate, null, 8, null), null, 11, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseMarginUpgradeStepComposeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "CLOSE", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigationIcon {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavigationIcon[] $VALUES;
        public static final NavigationIcon BACK = new NavigationIcon("BACK", 0);
        public static final NavigationIcon CLOSE = new NavigationIcon("CLOSE", 1);

        private static final /* synthetic */ NavigationIcon[] $values() {
            return new NavigationIcon[]{BACK, CLOSE};
        }

        public static EnumEntries<NavigationIcon> getEntries() {
            return $ENTRIES;
        }

        private NavigationIcon(String str, int i) {
        }

        static {
            NavigationIcon[] navigationIconArr$values = $values();
            $VALUES = navigationIconArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navigationIconArr$values);
        }

        public static NavigationIcon valueOf(String str) {
            return (NavigationIcon) Enum.valueOf(NavigationIcon.class, str);
        }

        public static NavigationIcon[] values() {
            return (NavigationIcon[]) $VALUES.clone();
        }
    }
}
