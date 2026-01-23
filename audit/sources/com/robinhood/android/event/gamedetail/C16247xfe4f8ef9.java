package com.robinhood.android.event.gamedetail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase2;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase4;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$flatMapLatest$1", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C16247xfe4f8ef9 extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamComboQuoteUseCase3>, Tuples2<? extends Boolean, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
    final /* synthetic */ GameDetailSelectionState $state$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GameDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16247xfe4f8ef9(Continuation continuation, GameDetailDuxo gameDetailDuxo, GameDetailSelectionState gameDetailSelectionState) {
        super(3, continuation);
        this.this$0 = gameDetailDuxo;
        this.$state$inlined = gameDetailSelectionState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super StreamComboQuoteUseCase3> flowCollector, Tuples2<? extends Boolean, ? extends BigDecimal> tuples2, Continuation<? super Unit> continuation) {
        C16247xfe4f8ef9 c16247xfe4f8ef9 = new C16247xfe4f8ef9(continuation, this.this$0, this.$state$inlined);
        c16247xfe4f8ef9.L$0 = flowCollector;
        c16247xfe4f8ef9.L$1 = tuples2;
        return c16247xfe4f8ef9.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowEmptyFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            Boolean bool = (Boolean) tuples2.component1();
            BigDecimal bigDecimal = (BigDecimal) tuples2.component2();
            if (!Intrinsics.areEqual(bool, boxing.boxBoolean(true)) || bigDecimal == null || BigDecimals7.isZero(bigDecimal)) {
                flowEmptyFlow = FlowKt.emptyFlow();
            } else {
                flowEmptyFlow = StreamComboQuoteUseCase.invoke$default(this.this$0.streamComboQuoteUseCase, new StreamComboQuoteUseCase2.ComboInstrument(((GameDetailSelectionState.Position) this.$state$inlined).getContractId()), null, null, new StreamComboQuoteUseCase4.QuantityBased(bigDecimal), 6, null);
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowEmptyFlow, this) == coroutine_suspended) {
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
