package com.robinhood.android.indexes.detail.components.tradebar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$5$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$5$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes10.dex */
public final class C18862xcaf68057 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends UiOptionChain>>, Tuples2<? extends Account, ? extends Index>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18862xcaf68057(Continuation continuation, IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo) {
        super(3, continuation);
        this.this$0 = indexDetailPageTradeBarDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends UiOptionChain>> flowCollector, Tuples2<? extends Account, ? extends Index> tuples2, Continuation<? super Unit> continuation) {
        C18862xcaf68057 c18862xcaf68057 = new C18862xcaf68057(continuation, this.this$0);
        c18862xcaf68057.L$0 = flowCollector;
        c18862xcaf68057.L$1 = tuples2;
        return c18862xcaf68057.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<List<UiOptionChain>> flowEmptyFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            Account account = (Account) tuples2.component1();
            Index index = (Index) tuples2.component2();
            if (OptionLevel.INSTANCE.canTradeOptions(account.getOptionLevel())) {
                flowEmptyFlow = this.this$0.optionChainStore.refreshAndStreamUiOptionChain(index.getTradableChainIds(), false);
            } else {
                flowEmptyFlow = FlowKt.emptyFlow();
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
