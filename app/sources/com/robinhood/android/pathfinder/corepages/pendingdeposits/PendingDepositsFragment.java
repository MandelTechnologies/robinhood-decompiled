package com.robinhood.android.pathfinder.corepages.pendingdeposits;

import android.os.Bundle;
import android.view.View;
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
import com.robinhood.android.common.history.p082ui.HistoryRow2;
import com.robinhood.android.common.history.p082ui.HistoryRow3;
import com.robinhood.android.common.history.p082ui.HistoryRowCallbackExtensions;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsEvent;
import com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.support.contracts.pathfinder.PendingDepositsFragmentKey;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PendingDepositsFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/history/ui/HistoryRowCallbacks;", "<init>", "()V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "duxo", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onHistoryRowClicked", "event", "Lcom/robinhood/android/common/history/ui/HistoryRowEvent;", "Companion", "feature-pathfinder-core-pages_externalDebug", "viewState", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PendingDepositsFragment extends GenericComposeFragment implements HistoryRow2 {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PendingDepositsDuxo.class);
    public HistoryNavigator historyNavigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(PendingDepositsFragment pendingDepositsFragment, int i, Composer composer, int i2) {
        pendingDepositsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PendingDepositsDuxo getDuxo() {
        return (PendingDepositsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C253421(null), 1, null);
    }

    /* compiled from: PendingDepositsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment$onViewCreated$1", m3645f = "PendingDepositsFragment.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment$onViewCreated$1 */
    static final class C253421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C253421(Continuation<? super C253421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PendingDepositsFragment.this.new C253421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PendingDepositsFragment.this.getDuxo().getEventFlow());
                final PendingDepositsFragment pendingDepositsFragment = PendingDepositsFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<PendingDepositsEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<PendingDepositsEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<PendingDepositsEvent> eventConsumerInvoke;
                        final PendingDepositsFragment pendingDepositsFragment2 = pendingDepositsFragment;
                        if ((event.getData() instanceof PendingDepositsEvent.SendInputErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m17531invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17531invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Throwable error = ((PendingDepositsEvent.SendInputErrorEvent) event.getData()).getError();
                                    if (!AbsErrorHandler.handleError$default(pendingDepositsFragment2.getActivityErrorHandler(), error, false, 2, null)) {
                                        throw error;
                                    }
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-914249073);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-914249073, i2, -1, "com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment.ComposeContent (PendingDepositsFragment.kt:44)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-174586406, true, new C253411(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingDepositsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PendingDepositsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment$ComposeContent$1 */
    static final class C253411 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<PendingDepositsViewState> $viewState$delegate;

        C253411(SnapshotState4<PendingDepositsViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-174586406, i, -1, "com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment.ComposeContent.<anonymous> (PendingDepositsFragment.kt:48)");
            }
            boolean sendingInput = PendingDepositsFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSendingInput();
            List<StatefulHistoryEvent<HistoryEvent>> transfers = PendingDepositsFragment.ComposeContent$lambda$0(this.$viewState$delegate).getTransfers();
            PendingDepositsFragment pendingDepositsFragment = PendingDepositsFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(PendingDepositsFragment.this);
            final PendingDepositsFragment pendingDepositsFragment2 = PendingDepositsFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PendingDepositsFragment.C253411.invoke$lambda$1$lambda$0(pendingDepositsFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(PendingDepositsFragment.this);
            final PendingDepositsFragment pendingDepositsFragment3 = PendingDepositsFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PendingDepositsFragment.C253411.invoke$lambda$3$lambda$2(pendingDepositsFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            PendingDepositsComposable4.PendingDepositsComposable(sendingInput, transfers, pendingDepositsFragment, function0, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PendingDepositsFragment pendingDepositsFragment) {
            pendingDepositsFragment.getDuxo().sendInput();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(PendingDepositsFragment pendingDepositsFragment) {
            pendingDepositsFragment.requireActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.HistoryRow2
    public void onHistoryRowClicked(HistoryRow3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HistoryRowCallbackExtensions.handleHistoryRowClick$default(this, event, getHistoryNavigator(), null, 4, null);
    }

    /* compiled from: PendingDepositsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/PendingDepositsFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PendingDepositsFragment, PendingDepositsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PendingDepositsFragmentKey pendingDepositsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pendingDepositsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PendingDepositsFragmentKey getArgs(PendingDepositsFragment pendingDepositsFragment) {
            return (PendingDepositsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pendingDepositsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PendingDepositsFragment newInstance(PendingDepositsFragmentKey pendingDepositsFragmentKey) {
            return (PendingDepositsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pendingDepositsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PendingDepositsFragment pendingDepositsFragment, PendingDepositsFragmentKey pendingDepositsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pendingDepositsFragment, pendingDepositsFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PendingDepositsViewState ComposeContent$lambda$0(SnapshotState4<PendingDepositsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
