package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.gold.ToolbarExt;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldAgreementsProgressBar;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: LegacyGoldUpgradeAgreementsFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016J\r\u0010&\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010'R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "initialDayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeAgreementsFragment extends GenericComposeFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyGoldUpgradeAgreementsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(GoldUpgradeAgreementsFragmentContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof GoldUpgradeAgreementsFragmentContract.Callbacks)) {
                parentFragment = null;
            }
            GoldUpgradeAgreementsFragmentContract.Callbacks callbacks = (GoldUpgradeAgreementsFragmentContract.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldUpgradeAgreementsFragmentContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean excludeFromAnalyticsLogging = true;
    private final Screen eventScreen = new Screen(Screen.Name.GOLD_AGREEMENTS_LIST, null, null, null, 14, null);
    private DayNightOverlay initialDayNightOverlay = DayNightOverlay.DAY;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(LegacyGoldUpgradeAgreementsFragment legacyGoldUpgradeAgreementsFragment, int i, Composer composer, int i2) {
        legacyGoldUpgradeAgreementsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoldUpgradeAgreementsFragmentContract.Callbacks getCallbacks() {
        return (GoldUpgradeAgreementsFragmentContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return requireBaseActivity().getScreenDescription();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((GoldUpgradeAgreementsFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getLoggingContext();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        DayNightOverlay dayNightOverlay;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (DayNightChanges.isDay(getScarletManager())) {
            dayNightOverlay = DayNightOverlay.DAY;
        } else {
            dayNightOverlay = DayNightOverlay.NIGHT;
        }
        this.initialDayNightOverlay = dayNightOverlay;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Intrinsics.areEqual(((GoldUpgradeAgreementsFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getAgreements().getForceDarkMode(), Boolean.TRUE)) {
            getScarletManager().putOverlay(DayNightOverlay.NIGHT, Boolean.FALSE);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Intrinsics.areEqual(((GoldUpgradeAgreementsFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getAgreements().getForceDarkMode(), Boolean.TRUE)) {
            getScarletManager().putOverlay(this.initialDayNightOverlay, Boolean.FALSE);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ApiGoldAgreementsProgressBar titleProgressBar = ((GoldUpgradeAgreementsFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getTitleProgressBar();
        if (titleProgressBar != null) {
            ToolbarExt.configureToolbarWithSegmentProgress$default(toolbar, titleProgressBar.getProgressBarSegmentIdx(), titleProgressBar.getProgressBarSegmentProgress(), titleProgressBar.getTitle(), false, 8, null);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1499628468);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499628468, i2, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment.ComposeContent (LegacyGoldUpgradeAgreementsFragment.kt:74)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1505113815, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1505113815, i3, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment.ComposeContent.<anonymous> (LegacyGoldUpgradeAgreementsFragment.kt:81)");
                    }
                    final LegacyGoldUpgradeAgreementsFragment legacyGoldUpgradeAgreementsFragment = LegacyGoldUpgradeAgreementsFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1004723764, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1004723764, i4, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment.ComposeContent.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementsFragment.kt:82)");
                            }
                            Companion companion = LegacyGoldUpgradeAgreementsFragment.INSTANCE;
                            ApiGoldUpgradeFlow.ApiGoldSweepAgreements agreements = ((GoldUpgradeAgreementsFragmentContract.Key) companion.getArgs((Fragment) legacyGoldUpgradeAgreementsFragment)).getAgreements();
                            GoldUpgradeAgreementsFragmentContract.Callbacks callbacks = legacyGoldUpgradeAgreementsFragment.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(callbacks);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new LegacyGoldUpgradeAgreementsFragment2(callbacks);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                            GoldUpgradeAgreementsFragmentContract.Callbacks callbacks2 = legacyGoldUpgradeAgreementsFragment.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(callbacks2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new LegacyGoldUpgradeAgreementsFragment3(callbacks2);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable(agreements, function1, (Function2) ((KFunction) objRememberedValue2), ((GoldUpgradeAgreementsFragmentContract.Key) companion.getArgs((Fragment) legacyGoldUpgradeAgreementsFragment)).getShowSparkleButton(), ((GoldUpgradeAgreementsFragmentContract.Key) companion.getArgs((Fragment) legacyGoldUpgradeAgreementsFragment)).isTitleCenterAlignment(), null, composer3, 0, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeAgreementsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LegacyGoldUpgradeAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsFragment;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Key;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LegacyGoldUpgradeAgreementsFragment, GoldUpgradeAgreementsFragmentContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldUpgradeAgreementsFragmentContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GoldUpgradeAgreementsFragmentContract.Key getArgs(LegacyGoldUpgradeAgreementsFragment legacyGoldUpgradeAgreementsFragment) {
            return (GoldUpgradeAgreementsFragmentContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeAgreementsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LegacyGoldUpgradeAgreementsFragment newInstance(GoldUpgradeAgreementsFragmentContract.Key key) {
            return (LegacyGoldUpgradeAgreementsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LegacyGoldUpgradeAgreementsFragment legacyGoldUpgradeAgreementsFragment, GoldUpgradeAgreementsFragmentContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, legacyGoldUpgradeAgreementsFragment, key);
        }
    }
}
