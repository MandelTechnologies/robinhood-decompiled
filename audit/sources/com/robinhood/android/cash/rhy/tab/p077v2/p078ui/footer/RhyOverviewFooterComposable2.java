package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.footer;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: RhyOverviewFooterComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.footer.RhyOverviewFooterComposableKt$RhyOverviewFooterComposable$2$1", m3645f = "RhyOverviewFooterComposable.kt", m3646l = {63}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.footer.RhyOverviewFooterComposableKt$RhyOverviewFooterComposable$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RhyOverviewFooterComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<RhyOverviewFooterState> $footerState$delegate;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOverviewFooterComposable2(LazyListState lazyListState, SnapshotState<RhyOverviewFooterState> snapshotState, Continuation<? super RhyOverviewFooterComposable2> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$footerState$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyOverviewFooterComposable2(this.$listState, this.$footerState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RhyOverviewFooterComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowStreamFooterState = RhyOverviewFooterComposable.streamFooterState(this.$listState);
            final SnapshotState<RhyOverviewFooterState> snapshotState = this.$footerState$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.footer.RhyOverviewFooterComposableKt$RhyOverviewFooterComposable$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Optional<? extends RhyOverviewFooterState>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Optional<? extends RhyOverviewFooterState> optional, Continuation<? super Unit> continuation) {
                    RhyOverviewFooterState rhyOverviewFooterStateComponent1 = optional.component1();
                    if (rhyOverviewFooterStateComponent1 != null) {
                        snapshotState.setValue(rhyOverviewFooterStateComponent1);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowStreamFooterState.collect(flowCollector, this) == coroutine_suspended) {
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
