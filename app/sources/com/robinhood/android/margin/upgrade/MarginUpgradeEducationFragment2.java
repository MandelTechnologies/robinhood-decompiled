package com.robinhood.android.margin.upgrade;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeEducationFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$MarginUpgradeStepComposable$1$1", m3645f = "MarginUpgradeEducationFragment.kt", m3646l = {94}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$MarginUpgradeStepComposable$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeEducationFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $scrollState;
    final /* synthetic */ SnapshotState<Boolean> $shouldScrollToEnd$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeEducationFragment2(LazyListState lazyListState, SnapshotState<Boolean> snapshotState, Continuation<? super MarginUpgradeEducationFragment2> continuation) {
        super(2, continuation);
        this.$scrollState = lazyListState;
        this.$shouldScrollToEnd$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeEducationFragment2(this.$scrollState, this.$shouldScrollToEnd$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginUpgradeEducationFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        MarginUpgradeEducationFragment2 marginUpgradeEducationFragment2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (MarginUpgradeEducationFragment.MarginUpgradeStepComposable$lambda$4(this.$shouldScrollToEnd$delegate)) {
                LazyListState lazyListState = this.$scrollState;
                int totalItemsCount = lazyListState.getLayoutInfo().getTotalItemsCount() - 1;
                this.label = 1;
                marginUpgradeEducationFragment2 = this;
                if (LazyListState.animateScrollToItem$default(lazyListState, totalItemsCount, 0, marginUpgradeEducationFragment2, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            marginUpgradeEducationFragment2 = this;
        }
        MarginUpgradeEducationFragment.MarginUpgradeStepComposable$lambda$5(marginUpgradeEducationFragment2.$shouldScrollToEnd$delegate, false);
        return Unit.INSTANCE;
    }
}
