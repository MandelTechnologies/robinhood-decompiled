package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.redesign.accounttab.analytics.AccountTabAnalytics;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage2;
import com.robinhood.android.redesign.accounttab.duxo.AccountSelectorViewState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$13$1", m3645f = "AccountSelectorComposable.kt", m3646l = {719}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$13$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
    final /* synthetic */ SnapshotState4<AccountSelectorViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$13$1(SnapshotState4<AccountSelectorViewState> snapshotState4, SnapshotState<AccountSelectorExpansionState> snapshotState, EventLogger eventLogger, AccountTabDuxo accountTabDuxo, PagerState pagerState, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$13$1> continuation) {
        super(2, continuation);
        this.$viewState$delegate = snapshotState4;
        this.$uiExpansionState$delegate = snapshotState;
        this.$eventLogger = eventLogger;
        this.$accountTabDuxo = accountTabDuxo;
        this.$pagerState = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$13$1(this.$viewState$delegate, this.$uiExpansionState$delegate, this.$eventLogger, this.$accountTabDuxo, this.$pagerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$13$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getNewUserExperienceStage() == NewUserExperienceStage.DONE) {
                return Unit.INSTANCE;
            }
            final boolean z = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getNewUserExperienceStage() == NewUserExperienceStage.PULL_DOWN;
            boolean z2 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getNewUserExperienceStage() == NewUserExperienceStage.SWIPE;
            if (Intrinsics.areEqual(AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(this.$uiExpansionState$delegate), AccountSelectorExpansionState.Expanded.INSTANCE) && z) {
                invokeSuspend$advanceStage(z, this.$eventLogger, this.$accountTabDuxo, this.$viewState$delegate);
            } else if (z2) {
                final PagerState pagerState = this.$pagerState;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$13$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(pagerState.getCurrentPage());
                    }
                });
                final EventLogger eventLogger = this.$eventLogger;
                final AccountTabDuxo accountTabDuxo = this.$accountTabDuxo;
                final SnapshotState4<AccountSelectorViewState> snapshotState4 = this.$viewState$delegate;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$13$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        if (i2 != 0) {
                            AccountSelectorComposableKt$AccountSelectorComposable$13$1.invokeSuspend$advanceStage(z, eventLogger, accountTabDuxo, snapshotState4);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$advanceStage(boolean z, EventLogger eventLogger, AccountTabDuxo accountTabDuxo, SnapshotState4<AccountSelectorViewState> snapshotState4) {
        if (z) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventData.copy$default(AccountTabAnalytics.INSTANCE.getUserEventData(), UserInteractionEventData.EventType.DRAG, null, new Component(null, AccountTabAnalytics.IDENTIFIER_PULL_DOWN_TO_EXPAND, null, 5, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), false, false, 6, null);
        }
        accountTabDuxo.saveNewUserExperienceStage(NewUserExperienceStage2.next(AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState4).getNewUserExperienceStage()));
    }
}
