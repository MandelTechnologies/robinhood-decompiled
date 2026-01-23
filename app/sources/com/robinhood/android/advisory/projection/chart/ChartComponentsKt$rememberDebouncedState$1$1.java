package com.robinhood.android.advisory.projection.chart;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
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

/* compiled from: ChartComponents.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.ChartComponentsKt$rememberDebouncedState$1$1", m3645f = "ChartComponents.kt", m3646l = {598}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChartComponentsKt$rememberDebouncedState$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $debounceMillis;
    final /* synthetic */ SnapshotState<T> $debouncedState;
    final /* synthetic */ T $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChartComponentsKt$rememberDebouncedState$1$1(long j, T t, SnapshotState<T> snapshotState, Continuation<? super ChartComponentsKt$rememberDebouncedState$1$1> continuation) {
        super(2, continuation);
        this.$debounceMillis = j;
        this.$value = t;
        this.$debouncedState = snapshotState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$lambda$0(Object obj) {
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartComponentsKt$rememberDebouncedState$1$1(this.$debounceMillis, this.$value, this.$debouncedState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartComponentsKt$rememberDebouncedState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final T t = this.$value;
            Flow flowDebounce = FlowKt.debounce(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$rememberDebouncedState$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartComponentsKt$rememberDebouncedState$1$1.invokeSuspend$lambda$0(t);
                }
            }), this.$debounceMillis);
            final SnapshotState<T> snapshotState = this.$debouncedState;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$rememberDebouncedState$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t2, Continuation<? super Unit> continuation) {
                    snapshotState.setValue(t2);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowDebounce.collect(flowCollector, this) == coroutine_suspended) {
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
