package com.robinhood.android.dashboard.config;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.WatchlistFragmentCallbacks;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger;
import com.robinhood.android.common.portfolio.position.LocalPositionDetailsNavigator;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.HomeDashboardEvent;
import com.robinhood.android.dashboard.lib.DashboardScreen;
import com.robinhood.android.home.contracts.AccountHomeKey;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.home.iac.events.store.Alert;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountHomeDashboardFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u001dH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/dashboard/config/AccountHomeDashboardFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "<init>", "()V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "getStartupPerformanceLogger", "()Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "setStartupPerformanceLogger", "(Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "duxo", "Lcom/robinhood/android/dashboard/config/AccountHomeDashboardDuxo;", "getDuxo", "()Lcom/robinhood/android/dashboard/config/AccountHomeDashboardDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onResume", "findWatchlistFragmentCallbacks", "Lcom/robinhood/WatchlistFragmentCallbacks;", "Companion", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AccountHomeDashboardFragment extends GenericActionHandlingFragment {
    public CrossSellLaunchManager crossSellLaunchManager;
    public StartupPerformanceLogger startupPerformanceLogger;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountHomeDashboardDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(AccountHomeDashboardFragment accountHomeDashboardFragment, int i, Composer composer, int i2) {
        accountHomeDashboardFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    public final StartupPerformanceLogger getStartupPerformanceLogger() {
        StartupPerformanceLogger startupPerformanceLogger = this.startupPerformanceLogger;
        if (startupPerformanceLogger != null) {
            return startupPerformanceLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupPerformanceLogger");
        return null;
    }

    public final void setStartupPerformanceLogger(StartupPerformanceLogger startupPerformanceLogger) {
        Intrinsics.checkNotNullParameter(startupPerformanceLogger, "<set-?>");
        this.startupPerformanceLogger = startupPerformanceLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountHomeDashboardDuxo getDuxo() {
        return (AccountHomeDashboardDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-593850881);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-593850881, i2, -1, "com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.ComposeContent (AccountHomeDashboardFragment.kt:41)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Function1<LegacyFragmentKey.EquityInstrumentDetail, Unit> function1 = null;
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccountHomeDashboardFragment2(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            WatchlistFragmentCallbacks watchlistFragmentCallbacksFindWatchlistFragmentCallbacks = findWatchlistFragmentCallbacks();
            composerStartRestartGroup.startReplaceGroup(539964093);
            if (watchlistFragmentCallbacksFindWatchlistFragmentCallbacks != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(watchlistFragmentCallbacksFindWatchlistFragmentCallbacks);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new AccountHomeDashboardFragment3(watchlistFragmentCallbacksFindWatchlistFragmentCallbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                function1 = (Function1) ((KFunction) objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider(LocalPositionDetailsNavigator.getLocalPositionDetailsNavigator().provides(function1), ComposableLambda3.rememberComposableLambda(-1296051521, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.ComposeContent.2
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
                        ComposerKt.traceEventStart(-1296051521, i3, -1, "com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.ComposeContent.<anonymous> (AccountHomeDashboardFragment.kt:55)");
                    }
                    AccountHomeDashboardFragment accountHomeDashboardFragment = AccountHomeDashboardFragment.this;
                    AccountSelectorTabArgs accountSelectorTabArgs = ((AccountHomeKey) AccountHomeDashboardFragment.INSTANCE.getArgs((Fragment) accountHomeDashboardFragment)).getAccountSelectorTabArgs();
                    final AccountHomeDashboardFragment accountHomeDashboardFragment2 = AccountHomeDashboardFragment.this;
                    AccountTabEmbeddedListStateProvider.AccountTabEmbeddedLazyListStateProvider(accountHomeDashboardFragment, accountSelectorTabArgs, null, ComposableLambda3.rememberComposableLambda(1749293374, true, new Function4<LazyListState, NestedScrollModifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.ComposeContent.2.1
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListState lazyListState, NestedScrollModifier nestedScrollModifier, Composer composer3, Integer num) {
                            invoke(lazyListState, nestedScrollModifier, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final LazyListState listState, final NestedScrollModifier nestedScrollModifier, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(listState, "listState");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1749293374, i4, -1, "com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.ComposeContent.<anonymous>.<anonymous> (AccountHomeDashboardFragment.kt:59)");
                            }
                            final AccountHomeDashboardFragment accountHomeDashboardFragment3 = accountHomeDashboardFragment2;
                            ActionHandlingFragment2.ContentWithDialog(accountHomeDashboardFragment3, ComposableLambda3.rememberComposableLambda(1369176290, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.ComposeContent.2.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1369176290, i5, -1, "com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AccountHomeDashboardFragment.kt:60)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    NestedScrollModifier nestedScrollModifier2 = nestedScrollModifier;
                                    Modifier modifierThen = companion.then(nestedScrollModifier2 != null ? NestedScrollModifier7.nestedScroll$default(companion, nestedScrollModifier2, null, 2, null) : companion);
                                    Companion companion2 = AccountHomeDashboardFragment.INSTANCE;
                                    HomeDashboardType dashboardType = ((AccountHomeKey) companion2.getArgs((Fragment) accountHomeDashboardFragment3)).getDashboardType();
                                    AccountSelectorTabArgs accountSelectorTabArgs2 = ((AccountHomeKey) companion2.getArgs((Fragment) accountHomeDashboardFragment3)).getAccountSelectorTabArgs();
                                    DashboardScreen.DashboardScreen(dashboardType, accountSelectorTabArgs2 != null ? accountSelectorTabArgs2.isEmbedded() : false, modifierThen, listState, null, composer4, 0, 16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3072, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.config.AccountHomeDashboardFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountHomeDashboardFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountHomeDashboardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.config.AccountHomeDashboardFragment$onResume$1", m3645f = "AccountHomeDashboardFragment.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.config.AccountHomeDashboardFragment$onResume$1 */
    static final class C136661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C136661(Continuation<? super C136661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountHomeDashboardFragment.this.new C136661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C136661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(AccountHomeDashboardFragment.this.getDuxo().getEventFlow());
                final AccountHomeDashboardFragment accountHomeDashboardFragment = AccountHomeDashboardFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.dashboard.config.AccountHomeDashboardFragment.onResume.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<HomeDashboardEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<HomeDashboardEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<HomeDashboardEvent> eventConsumerInvoke;
                        final AccountHomeDashboardFragment accountHomeDashboardFragment2 = accountHomeDashboardFragment;
                        if ((event.getData() instanceof HomeDashboardEvent.IacAlert) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.dashboard.config.AccountHomeDashboardFragment$onResume$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m13172invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m13172invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    HomeDashboardEvent.IacAlert iacAlert = (HomeDashboardEvent.IacAlert) event.getData();
                                    Alert alert = iacAlert.getAlert();
                                    if (alert instanceof Alert.BottomSheet) {
                                        CrossSellLaunchManager crossSellLaunchManager = accountHomeDashboardFragment2.getCrossSellLaunchManager();
                                        FragmentManager childFragmentManager = accountHomeDashboardFragment2.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        crossSellLaunchManager.processNavigationKey(childFragmentManager, ((Alert.BottomSheet) iacAlert.getAlert()).getKey());
                                        return;
                                    }
                                    if (alert instanceof Alert.PspEligibilityProgram) {
                                        Navigator navigator = accountHomeDashboardFragment2.getNavigator();
                                        Context contextRequireContext = accountHomeDashboardFragment2.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ProgramDetail(((Alert.PspEligibilityProgram) iacAlert.getAlert()).getUuid()), false, true, false, false, null, false, null, null, 980, null);
                                        return;
                                    }
                                    if (!(alert instanceof Alert.UpdatedSlipAgreement)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Navigator.DefaultImpls.createDialogFragment$default(accountHomeDashboardFragment2.getNavigator(), new LegacyDialogFragmentKey.SlipUpdateAgreement(AnalyticsStrings.PUSH_NOTIF_EVENT_APP_OPEN), null, 2, null).show(accountHomeDashboardFragment2.getChildFragmentManager(), "slip-update-agreement-bottom-sheet");
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLifecycleScope().launchWhenResumed(new C136661(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final WatchlistFragmentCallbacks findWatchlistFragmentCallbacks() {
        Fragment parentFragment = getParentFragment();
        while (parentFragment != 0 && !(parentFragment instanceof WatchlistFragmentCallbacks)) {
            parentFragment = parentFragment.getParentFragment();
        }
        if (parentFragment instanceof WatchlistFragmentCallbacks) {
            return (WatchlistFragmentCallbacks) parentFragment;
        }
        return null;
    }

    /* compiled from: AccountHomeDashboardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/config/AccountHomeDashboardFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/dashboard/config/AccountHomeDashboardFragment;", "Lcom/robinhood/android/home/contracts/AccountHomeKey;", "<init>", "()V", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountHomeDashboardFragment, AccountHomeKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountHomeKey accountHomeKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, accountHomeKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountHomeKey getArgs(AccountHomeDashboardFragment accountHomeDashboardFragment) {
            return (AccountHomeKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountHomeDashboardFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountHomeDashboardFragment newInstance(AccountHomeKey accountHomeKey) {
            return (AccountHomeDashboardFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountHomeKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountHomeDashboardFragment accountHomeDashboardFragment, AccountHomeKey accountHomeKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountHomeDashboardFragment, accountHomeKey);
        }
    }
}
