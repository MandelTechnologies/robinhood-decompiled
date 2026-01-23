package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Ljava/math/BigDecimal;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1$1$1$1", m3645f = "EventOrderStore.kt", m3646l = {116}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1$1$1$1 */
/* loaded from: classes12.dex */
final class C41382xa56439fb extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends UUID, ? extends BigDecimal>>, Object> {
    final /* synthetic */ UUID $contractId;
    final /* synthetic */ EstimatedFeesParams $params;
    int label;
    final /* synthetic */ EventOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C41382xa56439fb(EventOrderStore eventOrderStore, EstimatedFeesParams estimatedFeesParams, UUID uuid, Continuation<? super C41382xa56439fb> continuation) {
        super(2, continuation);
        this.this$0 = eventOrderStore;
        this.$params = estimatedFeesParams;
        this.$contractId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C41382xa56439fb(this.this$0, this.$params, this.$contractId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends UUID, ? extends BigDecimal>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Tuples2<UUID, ? extends BigDecimal>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<UUID, ? extends BigDecimal>> continuation) {
        return ((C41382xa56439fb) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        C41382xa56439fb c41382xa56439fb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventOrderStore eventOrderStore = this.this$0;
            UUID swapsAccountId = this.$params.getSwapsAccountId();
            UUID uuid = this.$contractId;
            EventOrderSide side = this.$params.getSide();
            BigDecimal quantity = this.$params.getQuantity();
            this.label = 1;
            c41382xa56439fb = this;
            obj = eventOrderStore.getEstimatedFeePerContractAmount(swapsAccountId, uuid, side, quantity, c41382xa56439fb);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c41382xa56439fb = this;
        }
        return Tuples4.m3642to(c41382xa56439fb.$contractId, (BigDecimal) obj);
    }
}
