package com.robinhood.android.event.history.p131ui.settlement;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.event.history.p131ui.settlement.EventCashSettlementDetailDuxo3;
import com.robinhood.android.event.history.p131ui.settlement.EventCashSettlementDetailFragment;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventCashSettlementDetailFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventCashSettlementDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "popNearestParentBackStackOnBackPressed", "getPopNearestParentBackStackOnBackPressed", "duxo", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-event-history_externalDebug", "viewState", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventCashSettlementDetailFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;
    private final boolean popNearestParentBackStackOnBackPressed = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EventCashSettlementDetailDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(EventCashSettlementDetailFragment eventCashSettlementDetailFragment, int i, Composer composer, int i2) {
        eventCashSettlementDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public boolean getPopNearestParentBackStackOnBackPressed() {
        return this.popNearestParentBackStackOnBackPressed;
    }

    private final EventCashSettlementDetailDuxo getDuxo() {
        return (EventCashSettlementDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-767258624);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-767258624, i2, -1, "com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment.ComposeContent (EventCashSettlementDetailFragment.kt:31)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1019033643, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: EventCashSettlementDetailFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;
                    final /* synthetic */ SnapshotState4<EventCashSettlementDetailDuxo3> $viewState$delegate;
                    final /* synthetic */ EventCashSettlementDetailFragment this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher, SnapshotState4<? extends EventCashSettlementDetailDuxo3> snapshotState4, EventCashSettlementDetailFragment eventCashSettlementDetailFragment) {
                        this.$onBackPressedDispatcher = onBackPressedDispatcher;
                        this.$viewState$delegate = snapshotState4;
                        this.this$0 = eventCashSettlementDetailFragment;
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
                            ComposerKt.traceEventStart(-703105391, i, -1, "com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment.ComposeContent.<anonymous>.<anonymous> (EventCashSettlementDetailFragment.kt:38)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.$onBackPressedDispatcher);
                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventCashSettlementDetailFragment.C164301.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.this$0);
                        final SnapshotState4<EventCashSettlementDetailDuxo3> snapshotState4 = this.$viewState$delegate;
                        final EventCashSettlementDetailFragment eventCashSettlementDetailFragment = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventCashSettlementDetailFragment.C164301.AnonymousClass1.invoke$lambda$5$lambda$4(snapshotState4, eventCashSettlementDetailFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        CashSettlementToolbar.CashSettlementToolbar(null, function0, (Function0) objRememberedValue2, composer, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(SnapshotState4 snapshotState4, EventCashSettlementDetailFragment eventCashSettlementDetailFragment) {
                        UUID eventId;
                        Context context;
                        EventCashSettlementDetailDuxo3 eventCashSettlementDetailDuxo3ComposeContent$lambda$0 = EventCashSettlementDetailFragment.ComposeContent$lambda$0(snapshotState4);
                        EventCashSettlementDetailDuxo3.Loaded loaded = eventCashSettlementDetailDuxo3ComposeContent$lambda$0 instanceof EventCashSettlementDetailDuxo3.Loaded ? (EventCashSettlementDetailDuxo3.Loaded) eventCashSettlementDetailDuxo3ComposeContent$lambda$0 : null;
                        if (loaded != null && (eventId = loaded.getEventId()) != null && (context = eventCashSettlementDetailFragment.getContext()) != null) {
                            Navigator.DefaultImpls.showFragment$default(eventCashSettlementDetailFragment.getNavigator(), context, new EventDetailRoutingFragmentKey(eventId, EcUuidType.EVENT_ID, "event_payout_detail", false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        }
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019033643, i3, -1, "com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment.ComposeContent.<anonymous> (EventCashSettlementDetailFragment.kt:36)");
                    }
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-703105391, true, new AnonymousClass1(onBackPressedDispatcher, snapshotState4CollectAsStateWithLifecycle, this), composer2, 54);
                    final SnapshotState4<EventCashSettlementDetailDuxo3> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1570899098, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment.ComposeContent.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i4 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1570899098, i4, -1, "com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment.ComposeContent.<anonymous>.<anonymous> (EventCashSettlementDetailFragment.kt:60)");
                            }
                            EventCashSettlementDetailFragment2.EventCashSettlementContent(EventCashSettlementDetailFragment.ComposeContent$lambda$0(snapshotState4), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventCashSettlementDetailFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EventCashSettlementDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailFragment;", "Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey;", "<init>", "()V", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EventCashSettlementDetailFragment, EventCashSettlementDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EventCashSettlementDetailFragmentKey eventCashSettlementDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, eventCashSettlementDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EventCashSettlementDetailFragmentKey getArgs(EventCashSettlementDetailFragment eventCashSettlementDetailFragment) {
            return (EventCashSettlementDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, eventCashSettlementDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EventCashSettlementDetailFragment newInstance(EventCashSettlementDetailFragmentKey eventCashSettlementDetailFragmentKey) {
            return (EventCashSettlementDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, eventCashSettlementDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EventCashSettlementDetailFragment eventCashSettlementDetailFragment, EventCashSettlementDetailFragmentKey eventCashSettlementDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, eventCashSettlementDetailFragment, eventCashSettlementDetailFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventCashSettlementDetailDuxo3 ComposeContent$lambda$0(SnapshotState4<? extends EventCashSettlementDetailDuxo3> snapshotState4) {
        return snapshotState4.getValue();
    }
}
