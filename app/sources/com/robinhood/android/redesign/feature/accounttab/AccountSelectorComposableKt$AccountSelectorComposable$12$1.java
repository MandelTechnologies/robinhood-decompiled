package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage2;
import com.robinhood.android.redesign.accounttab.duxo.AccountSelectorViewState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$12$1", m3645f = "AccountSelectorComposable.kt", m3646l = {679}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$12$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ LazyListState $accountTabRowListState;
    final /* synthetic */ SnapshotState<Boolean> $awaitingNewUserExpansionSwipe$delegate;
    final /* synthetic */ SnapshotState4<AccountSelectorViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$12$1(SnapshotState<Boolean> snapshotState, SnapshotState4<AccountSelectorViewState> snapshotState4, LazyListState lazyListState, AccountTabDuxo accountTabDuxo, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$12$1> continuation) {
        super(2, continuation);
        this.$awaitingNewUserExpansionSwipe$delegate = snapshotState;
        this.$viewState$delegate = snapshotState4;
        this.$accountTabRowListState = lazyListState;
        this.$accountTabDuxo = accountTabDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$12$1(this.$awaitingNewUserExpansionSwipe$delegate, this.$viewState$delegate, this.$accountTabRowListState, this.$accountTabDuxo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$87(this.$awaitingNewUserExpansionSwipe$delegate) && AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getNewUserExperienceStage() == NewUserExperienceStage.SWIPE) {
                final LazyListState lazyListState = this.$accountTabRowListState;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$12$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset());
                    }
                }));
                final LazyListState lazyListState2 = this.$accountTabRowListState;
                final AccountTabDuxo accountTabDuxo = this.$accountTabDuxo;
                final SnapshotState<Boolean> snapshotState = this.$awaitingNewUserExpansionSwipe$delegate;
                final SnapshotState4<AccountSelectorViewState> snapshotState4 = this.$viewState$delegate;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$12$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        if (lazyListState2.isScrollInProgress() && i2 > 20 && AccountSelectorComposableKt.AccountSelectorComposable$lambda$87(snapshotState)) {
                            AccountSelectorComposableKt.AccountSelectorComposable$lambda$88(snapshotState, false);
                            accountTabDuxo.saveNewUserExperienceStage(NewUserExperienceStage2.next(AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState4).getNewUserExperienceStage()));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
}
