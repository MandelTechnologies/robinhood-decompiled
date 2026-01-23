package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.util.MathHelpers;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "BracketState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C17216x22aaebb6 extends ContinuationImpl7 implements Function3<FlowCollector<? super Integer>, Tuples2<? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BracketState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17216x22aaebb6(Continuation continuation, BracketState bracketState) {
        super(3, continuation);
        this.this$0 = bracketState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Tuples2<? extends Integer, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
        C17216x22aaebb6 c17216x22aaebb6 = new C17216x22aaebb6(continuation, this.this$0);
        c17216x22aaebb6.L$0 = flowCollector;
        c17216x22aaebb6.L$1 = tuples2;
        return c17216x22aaebb6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            final int iIntValue = ((Number) tuples2.component1()).intValue();
            final int iIntValue2 = ((Number) tuples2.component2()).intValue();
            final BracketState bracketState = this.this$0;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Integer>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$SubscribeToScrollChanges$3$1$3$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Integer invoke() {
                    return Integer.valueOf(MathHelpers.lerp(iIntValue, iIntValue2, bracketState.getFirstVisibleHorizontalIndexOffsetInPercentage()));
                }
            });
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowSnapshotFlow, this) == coroutine_suspended) {
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
