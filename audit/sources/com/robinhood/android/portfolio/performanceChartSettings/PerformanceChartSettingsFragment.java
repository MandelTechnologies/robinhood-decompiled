package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment;
import com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment2;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment;
import com.robinhood.android.portfolio.contracts.PerformanceChartSettingsContract;
import com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsStateProvider3;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PerformanceChartSettingsFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PerformanceChartSettingsFragment extends GenericComposeBottomSheetDialogFragment implements AutoLoggableFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PerformanceChartSettingsDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(PerformanceChartSettingsFragment performanceChartSettingsFragment, int i, Composer composer, int i2) {
        performanceChartSettingsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    /* compiled from: PerformanceChartSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsFragment;", "Lcom/robinhood/android/portfolio/contracts/PerformanceChartSettingsContract$Key;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<PerformanceChartSettingsFragment, PerformanceChartSettingsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public PerformanceChartSettingsFragment createDialogFragment(PerformanceChartSettingsContract.Key key) {
            return (PerformanceChartSettingsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PerformanceChartSettingsContract.Key getArgs(PerformanceChartSettingsFragment performanceChartSettingsFragment) {
            return (PerformanceChartSettingsContract.Key) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, performanceChartSettingsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PerformanceChartSettingsFragment newInstance(PerformanceChartSettingsContract.Key key) {
            return (PerformanceChartSettingsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PerformanceChartSettingsFragment performanceChartSettingsFragment, PerformanceChartSettingsContract.Key key) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, performanceChartSettingsFragment, key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PerformanceChartSettingsDuxo getDuxo() {
        return (PerformanceChartSettingsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return ((PerformanceChartSettingsContract.Key) INSTANCE.getArgs((Fragment) this)).getScreen();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), new Component(Component.ComponentType.PERFORMANCE_CHART_SETTINGS, ((PerformanceChartSettingsContract.Key) INSTANCE.getArgs((Fragment) this)).getChartType().getServerValue(), null, 4, null), null, getScreenEventContext(), null, null, 105, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1862647460);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1862647460, i2, -1, "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsFragment.ComposeContent (PerformanceChartSettingsFragment.kt:49)");
            }
            final PerformanceChartSettingsStateProvider3 performanceChartSettingsStateProvider3ComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (performanceChartSettingsStateProvider3ComposeContent$lambda$0 instanceof PerformanceChartSettingsStateProvider3.Ready) {
                composerStartRestartGroup.startReplaceGroup(-846659167);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getScreenEventData().getScreen(), null, null, getScreenEventData().getComponent(), null, 45, null), ComposableLambda3.rememberComposableLambda(-439987257, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsFragment.ComposeContent.1
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
                            ComposerKt.traceEventStart(-439987257, i3, -1, "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsFragment.ComposeContent.<anonymous> (PerformanceChartSettingsFragment.kt:61)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null);
                        final PerformanceChartSettingsStateProvider3 performanceChartSettingsStateProvider3 = performanceChartSettingsStateProvider3ComposeContent$lambda$0;
                        PerformanceChartSettingsStateProvider3.Ready ready = (PerformanceChartSettingsStateProvider3.Ready) performanceChartSettingsStateProvider3;
                        final PerformanceChartSettingsFragment performanceChartSettingsFragment = this;
                        ChartStyleSection chartStyleSection = new ChartStyleSection() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsFragment.ComposeContent.1.1
                            @Override // com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSection
                            public void onShowFaq() {
                                PerformanceChartSettingsFragment performanceChartSettingsFragment2 = performanceChartSettingsFragment;
                                Navigator navigator = performanceChartSettingsFragment2.getNavigator();
                                android.content.Context contextRequireContext = performanceChartSettingsFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                performanceChartSettingsFragment2.startActivity(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, LegacyIntentKey.ReferenceManual.PerformanceChartSettings.INSTANCE, null, false, 12, null));
                            }

                            @Override // com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSection
                            public void onStyleChanged(PerformanceChartStyle style) {
                                Intrinsics.checkNotNullParameter(style, "style");
                                performanceChartSettingsFragment.getDuxo().onStyleChanged(((PerformanceChartSettingsStateProvider3.Ready) performanceChartSettingsStateProvider3).getSettings(), style);
                            }
                        };
                        final PerformanceChartSettingsFragment performanceChartSettingsFragment2 = this;
                        ChartHoursSection chartHoursSection = new ChartHoursSection() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsFragment.ComposeContent.1.2
                            @Override // com.robinhood.android.portfolio.performanceChartSettings.ChartHoursSection
                            public void onToggleAllHours() {
                                performanceChartSettingsFragment2.getDuxo().onToggleChartHours();
                            }
                        };
                        final PerformanceChartSettingsFragment performanceChartSettingsFragment3 = this;
                        final PerformanceChartSettingsStateProvider3 performanceChartSettingsStateProvider32 = performanceChartSettingsStateProvider3ComposeContent$lambda$0;
                        PerformanceChartSettingsComposable3.PerformanceChartSettingsComposable(modifierAutoLogEvents$default, ready, chartStyleSection, chartHoursSection, new BenchmarksSection7() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsFragment.ComposeContent.1.3
                            @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                            public void onShowIntro() {
                                Navigator navigator = performanceChartSettingsFragment3.getNavigator();
                                android.content.Context contextRequireContext = performanceChartSettingsFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Companion companion = PerformanceChartSettingsFragment.INSTANCE;
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new BenchmarkIntroFragment.Key(((PerformanceChartSettingsContract.Key) companion.getArgs((Fragment) performanceChartSettingsFragment3)).getScreen(), ((PerformanceChartSettingsContract.Key) companion.getArgs((Fragment) performanceChartSettingsFragment3)).getAccountNumber(), ((PerformanceChartSettingsContract.Key) companion.getArgs((Fragment) performanceChartSettingsFragment3)).getChartType()), false, false, false, false, null, false, null, null, 1020, null);
                            }

                            @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                            public void onShowFaq() {
                                Navigator navigator = performanceChartSettingsFragment3.getNavigator();
                                android.content.Context contextRequireContext = performanceChartSettingsFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new OtherMarkdownFragmentKey(BenchmarkIntroFragment2.RETURNS_COMPARISON_FAQ_CONTENTFUL_ID, null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            }

                            @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                            public void onEditBenchmarks() {
                                Navigator navigator = performanceChartSettingsFragment3.getNavigator();
                                android.content.Context contextRequireContext = performanceChartSettingsFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Companion companion = PerformanceChartSettingsFragment.INSTANCE;
                                Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new BenchmarkSearchFragment.Key(((PerformanceChartSettingsContract.Key) companion.getArgs((Fragment) performanceChartSettingsFragment3)).getScreen(), ((PerformanceChartSettingsContract.Key) companion.getArgs((Fragment) performanceChartSettingsFragment3)).getAccountNumber(), ((PerformanceChartSettingsContract.Key) companion.getArgs((Fragment) performanceChartSettingsFragment3)).getChartType()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            }

                            @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                            public void onToggleBenchmark(String benchmarkId) {
                                Intrinsics.checkNotNullParameter(benchmarkId, "benchmarkId");
                                performanceChartSettingsFragment3.getDuxo().onToggleBenchmark(((PerformanceChartSettingsStateProvider3.Ready) performanceChartSettingsStateProvider32).getSettings(), benchmarkId);
                            }
                        }, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(performanceChartSettingsStateProvider3ComposeContent$lambda$0, PerformanceChartSettingsStateProvider3.Loading.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(-997144570);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-997029477);
                LocalShowPlaceholder.Loadable(true, null, null, PerformanceChartSettingsFragment2.INSTANCE.m17656getLambda$1248783211$feature_portfolio_externalDebug(), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerformanceChartSettingsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PerformanceChartSettingsStateProvider3 ComposeContent$lambda$0(SnapshotState4<? extends PerformanceChartSettingsStateProvider3> snapshotState4) {
        return snapshotState4.getValue();
    }
}
