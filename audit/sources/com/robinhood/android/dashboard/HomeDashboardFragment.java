package com.robinhood.android.dashboard;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.WatchlistFragmentCallbacks;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.portfolio.position.LocalPositionDetailsNavigator;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.HomeDashboardEvent;
import com.robinhood.android.dashboard.lib.DashboardScreen;
import com.robinhood.android.dashboard.lib.PlaceholderDashboard5;
import com.robinhood.android.home.contracts.HomeDashboardKey;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.home.iac.events.store.Alert;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HomeDashboardFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010+\u001a\u00020,H\u0017¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020,H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 ¨\u00061²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002²\u0006\u0012\u00104\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/dashboard/HomeDashboardFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "getStartupPerformanceLogger", "()Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "setStartupPerformanceLogger", "(Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;)V", "duxo", "Lcom/robinhood/android/dashboard/HomeDashboardDuxo;", "getDuxo", "()Lcom/robinhood/android/dashboard/HomeDashboardDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "watchlistFragmentCallbacks", "Lcom/robinhood/WatchlistFragmentCallbacks;", "getWatchlistFragmentCallbacks", "()Lcom/robinhood/WatchlistFragmentCallbacks;", "watchlistFragmentCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "scrollToTop", "onResume", "Companion", "feature-account-home_externalRelease", "viewState", "Lcom/robinhood/android/dashboard/HomeDashboardViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/dashboard/HomeDashboardEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HomeDashboardFragment extends GenericActionHandlingFragment implements Scrollable {
    public CrossSellLaunchManager crossSellLaunchManager;
    public StartupPerformanceLogger startupPerformanceLogger;
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HomeDashboardFragment.class, "watchlistFragmentCallbacks", "getWatchlistFragmentCallbacks()Lcom/robinhood/WatchlistFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, HomeDashboardDuxo.class);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: watchlistFragmentCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 watchlistFragmentCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(WatchlistFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.dashboard.HomeDashboardFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final boolean excludeFromAnalyticsLogging = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(HomeDashboardFragment homeDashboardFragment, int i, Composer composer, int i2) {
        homeDashboardFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeDashboardDuxo getDuxo() {
        return (HomeDashboardDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final WatchlistFragmentCallbacks getWatchlistFragmentCallbacks() {
        return (WatchlistFragmentCallbacks) this.watchlistFragmentCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<HomeDashboardEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1283856193);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1283856193, i2, -1, "com.robinhood.android.dashboard.HomeDashboardFragment.ComposeContent (HomeDashboardFragment.kt:56)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final HomeDashboardType dashboardType = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDashboardType();
            final Event<HomeDashboardEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof HomeDashboardEvent.ScrollToTop) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.dashboard.HomeDashboardFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m13169invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13169invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HomeDashboardFragment2(lazyListStateRememberLazyListState, null), 3, null);
                    }
                });
            }
            composerStartRestartGroup.startReplaceGroup(-1130170244);
            if (ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDashboardType() != null) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new HomeDashboardFragment3(this, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            WatchlistFragmentCallbacks watchlistFragmentCallbacks = getWatchlistFragmentCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(watchlistFragmentCallbacks);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new HomeDashboardFragment4(watchlistFragmentCallbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider(LocalPositionDetailsNavigator.getLocalPositionDetailsNavigator().provides((Function1) ((KFunction) objRememberedValue3)), ComposableLambda3.rememberComposableLambda(1362832383, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.HomeDashboardFragment.ComposeContent.3
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
                        ComposerKt.traceEventStart(1362832383, i3, -1, "com.robinhood.android.dashboard.HomeDashboardFragment.ComposeContent.<anonymous> (HomeDashboardFragment.kt:79)");
                    }
                    HomeDashboardFragment homeDashboardFragment = HomeDashboardFragment.this;
                    final HomeDashboardType homeDashboardType = dashboardType;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    ActionHandlingFragment2.ContentWithDialog(homeDashboardFragment, ComposableLambda3.rememberComposableLambda(-289610589, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.HomeDashboardFragment.ComposeContent.3.1
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
                                ComposerKt.traceEventStart(-289610589, i4, -1, "com.robinhood.android.dashboard.HomeDashboardFragment.ComposeContent.<anonymous>.<anonymous> (HomeDashboardFragment.kt:80)");
                            }
                            if (homeDashboardType != null) {
                                composer3.startReplaceGroup(800292351);
                                DashboardScreen.DashboardScreen(homeDashboardType, false, null, lazyListState, null, composer3, 48, 20);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(800515489);
                                PlaceholderDashboard5.PlaceholderDashboard(null, composer3, 0, 1);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.HomeDashboardFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeDashboardFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final HomeDashboardViewState ComposeContent$lambda$0(SnapshotState4<HomeDashboardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<HomeDashboardEvent> ComposeContent$lambda$1(SnapshotState4<Event<HomeDashboardEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        getDuxo().scrollToTop();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.FIVE_SEC_HOME_TAB);
        getLifecycleScope().launchWhenResumed(new C136601(null));
    }

    /* compiled from: HomeDashboardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.HomeDashboardFragment$onResume$1", m3645f = "HomeDashboardFragment.kt", m3646l = {102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.HomeDashboardFragment$onResume$1 */
    static final class C136601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C136601(Continuation<? super C136601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeDashboardFragment.this.new C136601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C136601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(HomeDashboardFragment.this.getDuxo().getEventFlow());
                final HomeDashboardFragment homeDashboardFragment = HomeDashboardFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.dashboard.HomeDashboardFragment.onResume.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<HomeDashboardEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<HomeDashboardEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<HomeDashboardEvent> eventConsumerInvoke;
                        final HomeDashboardFragment homeDashboardFragment2 = homeDashboardFragment;
                        if ((event.getData() instanceof HomeDashboardEvent.IacAlert) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.dashboard.HomeDashboardFragment$onResume$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m13170invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m13170invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    HomeDashboardEvent.IacAlert iacAlert = (HomeDashboardEvent.IacAlert) event.getData();
                                    Alert alert = iacAlert.getAlert();
                                    if (alert instanceof Alert.BottomSheet) {
                                        CrossSellLaunchManager crossSellLaunchManager = homeDashboardFragment2.getCrossSellLaunchManager();
                                        FragmentManager childFragmentManager = homeDashboardFragment2.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        crossSellLaunchManager.processNavigationKey(childFragmentManager, ((Alert.BottomSheet) iacAlert.getAlert()).getKey());
                                        return;
                                    }
                                    if (alert instanceof Alert.PspEligibilityProgram) {
                                        Navigator navigator = homeDashboardFragment2.getNavigator();
                                        Context contextRequireContext = homeDashboardFragment2.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ProgramDetail(((Alert.PspEligibilityProgram) iacAlert.getAlert()).getUuid()), false, true, false, false, null, false, null, null, 980, null);
                                        return;
                                    }
                                    if (!(alert instanceof Alert.UpdatedSlipAgreement)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Navigator.DefaultImpls.createDialogFragment$default(homeDashboardFragment2.getNavigator(), new LegacyDialogFragmentKey.SlipUpdateAgreement(AnalyticsStrings.PUSH_NOTIF_EVENT_APP_OPEN), null, 2, null).show(homeDashboardFragment2.getChildFragmentManager(), "slip-update-agreement-bottom-sheet");
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

    /* compiled from: HomeDashboardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/HomeDashboardFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/dashboard/HomeDashboardFragment;", "Lcom/robinhood/android/home/contracts/HomeDashboardKey;", "<init>", "()V", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<HomeDashboardFragment, HomeDashboardKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(HomeDashboardKey homeDashboardKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, homeDashboardKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((HomeDashboardFragment) fragment);
        }

        public Void getArgs(HomeDashboardFragment homeDashboardFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, homeDashboardFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public HomeDashboardFragment newInstance() {
            return (HomeDashboardFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public HomeDashboardFragment newInstance(Void r1) {
            return (HomeDashboardFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
