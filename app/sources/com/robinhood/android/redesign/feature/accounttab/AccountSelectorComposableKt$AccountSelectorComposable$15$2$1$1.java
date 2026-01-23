package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1", m3645f = "AccountSelectorComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $accountTabRowListState;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SnapshotState<Boolean> $isProgrammaticallyScrollingTabRow$delegate;
    final /* synthetic */ SnapshotState4<Boolean> $isVerticalScrollingActive$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ SnapshotState4<Boolean> $shouldRealignTabRow$delegate;
    final /* synthetic */ SnapshotState<Job> $tabRowScrollDebounceJob$delegate;
    final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1(PagerState pagerState, SnapshotState4<Boolean> snapshotState4, SnapshotState<AccountSelectorExpansionState> snapshotState, SnapshotState4<Boolean> snapshotState42, CoroutineScope coroutineScope, SnapshotState<Job> snapshotState2, SnapshotState<Boolean> snapshotState3, LazyListState lazyListState, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$isVerticalScrollingActive$delegate = snapshotState4;
        this.$uiExpansionState$delegate = snapshotState;
        this.$shouldRealignTabRow$delegate = snapshotState42;
        this.$coroutineScope = coroutineScope;
        this.$tabRowScrollDebounceJob$delegate = snapshotState2;
        this.$isProgrammaticallyScrollingTabRow$delegate = snapshotState3;
        this.$accountTabRowListState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1(this.$pagerState, this.$isVerticalScrollingActive$delegate, this.$uiExpansionState$delegate, this.$shouldRealignTabRow$delegate, this.$coroutineScope, this.$tabRowScrollDebounceJob$delegate, this.$isProgrammaticallyScrollingTabRow$delegate, this.$accountTabRowListState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$60(this.$isVerticalScrollingActive$delegate) && Intrinsics.areEqual(AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(this.$uiExpansionState$delegate), AccountSelectorExpansionState.Collapsed.INSTANCE) && AccountSelectorComposableKt.AccountSelectorComposable$lambda$63(this.$shouldRealignTabRow$delegate)) {
                AccountSelectorComposableKt.AccountSelectorComposable$scrollToSelectedTabWithDelay(this.$coroutineScope, this.$tabRowScrollDebounceJob$delegate, this.$isProgrammaticallyScrollingTabRow$delegate, this.$accountTabRowListState, this.$pagerState.getCurrentPage());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
