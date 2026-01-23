package com.robinhood.android.equity.validation;

import com.robinhood.models.p320db.Order;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: EquityOrderContextStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$1$1$1", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityOrderContextStore4 extends ContinuationImpl7 implements Function2<FlowCollector<? super Order>, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $orderId;
    int label;
    final /* synthetic */ EquityOrderContextStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderContextStore4(EquityOrderContextStore equityOrderContextStore, UUID uuid, Continuation<? super EquityOrderContextStore4> continuation) {
        super(2, continuation);
        this.this$0 = equityOrderContextStore;
        this.$orderId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityOrderContextStore4(this.this$0, this.$orderId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Order> flowCollector, Continuation<? super Unit> continuation) {
        return ((EquityOrderContextStore4) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.orderStore.refresh(true, this.$orderId);
        return Unit.INSTANCE;
    }
}
