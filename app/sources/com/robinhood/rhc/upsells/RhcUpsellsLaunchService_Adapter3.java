package com.robinhood.rhc.upsells;

import com.robinhood.rhc.upsells.RhcUpsellsLaunchService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhcUpsellsLaunchService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/rhc/upsells/RhcUpsellsLaunchService_Adapter$Endpoint_launch$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsLaunchService_Adapter$Endpoint_launch$call$1", m3645f = "RhcUpsellsLaunchService_Adapter.kt", m3646l = {58}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.rhc.upsells.RhcUpsellsLaunchService_Adapter$Endpoint_launch$call$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RhcUpsellsLaunchService_Adapter3 extends ContinuationImpl7 implements Function2<RhcUpsellsLaunchService_Adapter.Endpoint_launch.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhcUpsellsLaunchService_Adapter.Endpoint_launch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhcUpsellsLaunchService_Adapter3(RhcUpsellsLaunchService_Adapter.Endpoint_launch endpoint_launch, Continuation<? super RhcUpsellsLaunchService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_launch;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhcUpsellsLaunchService_Adapter3 rhcUpsellsLaunchService_Adapter3 = new RhcUpsellsLaunchService_Adapter3(this.this$0, continuation);
        rhcUpsellsLaunchService_Adapter3.L$0 = obj;
        return rhcUpsellsLaunchService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhcUpsellsLaunchService_Adapter.Endpoint_launch.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((RhcUpsellsLaunchService_Adapter3) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RhcUpsellsLaunchService_Adapter.Endpoint_launch.Arguments arguments = (RhcUpsellsLaunchService_Adapter.Endpoint_launch.Arguments) this.L$0;
            RhcUpsellsLaunchService rhcUpsellsLaunchService = this.this$0.service;
            String deeplink = arguments.getDeeplink();
            this.label = 1;
            if (rhcUpsellsLaunchService.launch(deeplink, this) == coroutine_suspended) {
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
