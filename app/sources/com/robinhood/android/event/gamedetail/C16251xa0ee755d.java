package com.robinhood.android.event.gamedetail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.store.event.EstimatedFeesParams;
import com.robinhood.store.event.EventOrderStore;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$invokeSuspend$lambda$2$$inlined$flatMapLatest$1", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$invokeSuspend$lambda$2$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C16251xa0ee755d extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<UUID, ? extends BigDecimal>>, UUID, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set $allContractIds$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GameDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16251xa0ee755d(Continuation continuation, GameDetailDuxo gameDetailDuxo, Set set) {
        super(3, continuation);
        this.this$0 = gameDetailDuxo;
        this.$allContractIds$inlined = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Map<UUID, ? extends BigDecimal>> flowCollector, UUID uuid, Continuation<? super Unit> continuation) {
        C16251xa0ee755d c16251xa0ee755d = new C16251xa0ee755d(continuation, this.this$0, this.$allContractIds$inlined);
        c16251xa0ee755d.L$0 = flowCollector;
        c16251xa0ee755d.L$1 = uuid;
        return c16251xa0ee755d.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            UUID uuid = (UUID) this.L$1;
            EventOrderStore eventOrderStore = this.this$0.eventOrderStore;
            Set set = this.$allContractIds$inlined;
            EventOrderSide eventOrderSide = EventOrderSide.BUY;
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            Flow<Map<UUID, BigDecimal>> flowStreamEstimatedFeesForMultipleContracts = eventOrderStore.streamEstimatedFeesForMultipleContracts(new EstimatedFeesParams(uuid, set, eventOrderSide, ONE));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStreamEstimatedFeesForMultipleContracts, this) == coroutine_suspended) {
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
