package com.robinhood.rhc.upsells;

import com.robinhood.rhc.upsells.RhcUpsellsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhcUpsellsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Emission;", "it", "Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$call$1", m3645f = "RhcUpsellsService_Adapter.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.rhc.upsells.RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$call$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RhcUpsellsService_Adapter4 extends ContinuationImpl7 implements Function2<RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Arguments, Continuation<? super RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhcUpsellsService_Adapter4(RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell endpoint_shouldShowUpsell, Continuation<? super RhcUpsellsService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_shouldShowUpsell;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhcUpsellsService_Adapter4 rhcUpsellsService_Adapter4 = new RhcUpsellsService_Adapter4(this.this$0, continuation);
        rhcUpsellsService_Adapter4.L$0 = obj;
        return rhcUpsellsService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Arguments arguments, Continuation<? super RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Emission> continuation) {
        return ((RhcUpsellsService_Adapter4) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Arguments arguments = (RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Arguments) this.L$0;
            RhcUpsellsService rhcUpsellsService = this.this$0.service;
            TouchPointData data = arguments.getData();
            this.label = 1;
            obj = rhcUpsellsService.shouldShowUpsell(data, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Emission.m23935boximpl(RhcUpsellsService_Adapter.Endpoint_shouldShowUpsell.Emission.m23936constructorimpl((String) obj));
    }
}
