package com.robinhood.android.common.options.tradebar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.librobinhood.data.store.OptionHistoricalChartStore;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends OptionHistoricalChartStore.Request, ? extends Integer>>, UiOptionChain, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2(Continuation continuation, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo) {
        super(3, continuation);
        this.this$0 = optionsDetailPageTradebarDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends OptionHistoricalChartStore.Request, ? extends Integer>> flowCollector, UiOptionChain uiOptionChain, Continuation<? super Unit> continuation) {
        OptionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2 optionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2 = new OptionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2(continuation, this.this$0);
        optionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2.L$0 = flowCollector;
        optionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2.L$1 = uiOptionChain;
        return optionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final UiOptionChain uiOptionChain = (UiOptionChain) this.L$1;
            Flow flowFlowIfSelfFetchMode = this.this$0.flowIfSelfFetchMode(new Function1<OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch, Flow<? extends Tuples2<? extends OptionHistoricalChartStore.Request, ? extends Integer>>>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$optionHistoricalChartStoreRequestFlow$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Flow<Tuples2<OptionHistoricalChartStore.Request, Integer>> invoke(OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch) {
                    Intrinsics.checkNotNullParameter(selfFetch, "<destruct>");
                    return OptionsDetailPageTradebarDuxo7.mapNotNullToTradebarIndex(FlowKt.flowOf(new OptionHistoricalChartStore.Request(selfFetch.getStrategyCode(), selfFetch.getActiveChartSpan(), Boolean.FALSE, false, uiOptionChain.getUnderlyingType(), true)), new Function1<OptionHistoricalChartStore.Request, OptionHistoricalChartStore.Request>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$optionHistoricalChartStoreRequestFlow$1$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final OptionHistoricalChartStore.Request invoke(OptionHistoricalChartStore.Request it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it;
                        }
                    });
                }
            });
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowIfSelfFetchMode, this) == coroutine_suspended) {
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
