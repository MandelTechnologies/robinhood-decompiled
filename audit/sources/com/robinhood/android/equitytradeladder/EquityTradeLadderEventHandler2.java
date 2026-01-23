package com.robinhood.android.equitytradeladder;

import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: EquityTradeLadderEventHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$13$1", m3645f = "EquityTradeLadderEventHandler.kt", m3646l = {131}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$13$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeLadderEventHandler2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<EquityTradeLadderEvent.CenterAtIndex> $centerAtIndexEvent$delegate;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderEventHandler2(LazyListState lazyListState, SnapshotState<EquityTradeLadderEvent.CenterAtIndex> snapshotState, CoroutineScope coroutineScope, Continuation<? super EquityTradeLadderEventHandler2> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$centerAtIndexEvent$delegate = snapshotState;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderEventHandler2(this.$listState, this.$centerAtIndexEvent$delegate, this.$coroutineScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderEventHandler2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$13$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return lazyListState.getLayoutInfo();
                }
            });
            final SnapshotState<EquityTradeLadderEvent.CenterAtIndex> snapshotState = this.$centerAtIndexEvent$delegate;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final LazyListState lazyListState2 = this.$listState;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$13$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((LazyListLayoutInfo) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(LazyListLayoutInfo lazyListLayoutInfo, Continuation<? super Unit> continuation) {
                    EquityTradeLadderEvent.CenterAtIndex centerAtIndexEquityTradeLadderEventHandler$lambda$1;
                    if (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty() && ((int) (lazyListLayoutInfo.mo5206getViewportSizeYbymL2g() & 4294967295L)) > 0 && (centerAtIndexEquityTradeLadderEventHandler$lambda$1 = EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$1(snapshotState)) != null) {
                        CoroutineScope coroutineScope2 = coroutineScope;
                        SnapshotState<EquityTradeLadderEvent.CenterAtIndex> snapshotState2 = snapshotState;
                        LazyListState lazyListState3 = lazyListState2;
                        snapshotState2.setValue(null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new EquityTradeLadderEventHandler3(lazyListState3, centerAtIndexEquityTradeLadderEventHandler$lambda$1, null), 3, null);
                    }
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
