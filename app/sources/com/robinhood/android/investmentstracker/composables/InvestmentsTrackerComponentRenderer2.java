package com.robinhood.android.investmentstracker.composables;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: InvestmentsTrackerComponentRenderer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$1$1", m3645f = "InvestmentsTrackerComponentRenderer.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerComponentRenderer2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<Integer, Unit> $onFirstVisibleItemChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InvestmentsTrackerComponentRenderer2(LazyListState lazyListState, Function1<? super Integer, Unit> function1, Continuation<? super InvestmentsTrackerComponentRenderer2> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$onFirstVisibleItemChanged = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestmentsTrackerComponentRenderer2(this.$lazyListState, this.$onFirstVisibleItemChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestmentsTrackerComponentRenderer2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$lazyListState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(lazyListState.getFirstVisibleItemIndex());
                }
            });
            final Function1<Integer, Unit> function1 = this.$onFirstVisibleItemChanged;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    function1.invoke(boxing.boxInt(i2));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
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
