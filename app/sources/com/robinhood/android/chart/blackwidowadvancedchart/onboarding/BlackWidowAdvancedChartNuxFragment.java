package com.robinhood.android.chart.blackwidowadvancedchart.onboarding;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.chart.blackwidowadvancedchart.BwChartPrefModule4;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartNuxFragmentKey;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BlackWidowAdvancedChartNuxFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\r\u0010\u0016\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartNuxFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "getBwWebViewManager", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "setBwWebViewManager", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;)V", "bwHasVisitedChartSharedPref", "Lcom/robinhood/prefs/BooleanPreference;", "getBwHasVisitedChartSharedPref$annotations", "getBwHasVisitedChartSharedPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setBwHasVisitedChartSharedPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "Companion", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartNuxFragment extends GenericComposeFragment {
    public BooleanPreference bwHasVisitedChartSharedPref;
    public BwWebViewManager bwWebViewManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment, int i, Composer composer, int i2) {
        blackWidowAdvancedChartNuxFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @BwChartPrefModule4
    public static /* synthetic */ void getBwHasVisitedChartSharedPref$annotations() {
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    public final BwWebViewManager getBwWebViewManager() {
        BwWebViewManager bwWebViewManager = this.bwWebViewManager;
        if (bwWebViewManager != null) {
            return bwWebViewManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bwWebViewManager");
        return null;
    }

    public final void setBwWebViewManager(BwWebViewManager bwWebViewManager) {
        Intrinsics.checkNotNullParameter(bwWebViewManager, "<set-?>");
        this.bwWebViewManager = bwWebViewManager;
    }

    public final BooleanPreference getBwHasVisitedChartSharedPref() {
        BooleanPreference booleanPreference = this.bwHasVisitedChartSharedPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bwHasVisitedChartSharedPref");
        return null;
    }

    public final void setBwHasVisitedChartSharedPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.bwHasVisitedChartSharedPref = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getBwHasVisitedChartSharedPref().get()) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion = INSTANCE;
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new BlackWidowAdvancedChartFragmentKey(((BlackWidowAdvancedChartNuxFragmentKey) companion.getArgs((Fragment) this)).getInstrumentId(), BlackWidowAdvancedChartFragmentKey2.EQUITY, ((BlackWidowAdvancedChartNuxFragmentKey) companion.getArgs((Fragment) this)).getSource(), false, 8, null), false, false, false, false, null, true, null, null, 892, null);
        }
    }

    /* compiled from: BlackWidowAdvancedChartNuxFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment$onResume$1", m3645f = "BlackWidowAdvancedChartNuxFragment.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment$onResume$1 */
    static final class C109141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C109141(Continuation<? super C109141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartNuxFragment.this.new C109141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartNuxFragment.this.getBwWebViewManager();
                this.label = 1;
                if (bwWebViewManager.retainUntilCanceled(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C109141(null));
    }

    /* compiled from: BlackWidowAdvancedChartNuxFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment$ComposeContent$1 */
    static final class C109131 implements Function2<Composer, Integer, Unit> {
        C109131() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1587674770, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment.ComposeContent.<anonymous> (BlackWidowAdvancedChartNuxFragment.kt:49)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(BlackWidowAdvancedChartNuxFragment.this);
            final BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment = BlackWidowAdvancedChartNuxFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlackWidowAdvancedChartNuxFragment.C109131.invoke$lambda$1$lambda$0(blackWidowAdvancedChartNuxFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(BlackWidowAdvancedChartNuxFragment.this);
            final BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment2 = BlackWidowAdvancedChartNuxFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlackWidowAdvancedChartNuxFragment.C109131.invoke$lambda$3$lambda$2(blackWidowAdvancedChartNuxFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BlackWidowAdvanceChartNuxComposable.BlackWidowAdvanceChartNuxComposable(function0, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment) {
            blackWidowAdvancedChartNuxFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment) {
            blackWidowAdvancedChartNuxFragment.getBwHasVisitedChartSharedPref().set(true);
            Navigator navigator = blackWidowAdvancedChartNuxFragment.getNavigator();
            Context contextRequireContext = blackWidowAdvancedChartNuxFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion = BlackWidowAdvancedChartNuxFragment.INSTANCE;
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new BlackWidowAdvancedChartFragmentKey(((BlackWidowAdvancedChartNuxFragmentKey) companion.getArgs((Fragment) blackWidowAdvancedChartNuxFragment)).getInstrumentId(), BlackWidowAdvancedChartFragmentKey2.EQUITY, ((BlackWidowAdvancedChartNuxFragmentKey) companion.getArgs((Fragment) blackWidowAdvancedChartNuxFragment)).getSource(), true), false, false, false, false, null, true, null, null, 892, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1762885091);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1762885091, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment.ComposeContent (BlackWidowAdvancedChartNuxFragment.kt:47)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1587674770, true, new C109131(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvancedChartNuxFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlackWidowAdvancedChartNuxFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BlackWidowAdvancedChartNuxFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartNuxFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartNuxFragment;", "Lcom/robinhood/shared/chart/contracts/advancedChart/BlackWidowAdvancedChartNuxFragmentKey;", "<init>", "()V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<BlackWidowAdvancedChartNuxFragment, BlackWidowAdvancedChartNuxFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(BlackWidowAdvancedChartNuxFragmentKey blackWidowAdvancedChartNuxFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, blackWidowAdvancedChartNuxFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BlackWidowAdvancedChartNuxFragmentKey getArgs(BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment) {
            return (BlackWidowAdvancedChartNuxFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, blackWidowAdvancedChartNuxFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BlackWidowAdvancedChartNuxFragment newInstance(BlackWidowAdvancedChartNuxFragmentKey blackWidowAdvancedChartNuxFragmentKey) {
            return (BlackWidowAdvancedChartNuxFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, blackWidowAdvancedChartNuxFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment, BlackWidowAdvancedChartNuxFragmentKey blackWidowAdvancedChartNuxFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, blackWidowAdvancedChartNuxFragment, blackWidowAdvancedChartNuxFragmentKey);
        }
    }
}
