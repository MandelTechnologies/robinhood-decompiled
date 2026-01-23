package com.robinhood.microgram.deeplink;

import com.robinhood.microgram.deeplink.DeeplinkService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DeeplinkService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/microgram/deeplink/DeeplinkService_Adapter$Endpoint_openDeeplinkWithOptions$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.deeplink.DeeplinkService_Adapter$Endpoint_openDeeplinkWithOptions$call$1", m3645f = "DeeplinkService_Adapter.kt", m3646l = {79}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.deeplink.DeeplinkService_Adapter$Endpoint_openDeeplinkWithOptions$call$1, reason: use source file name */
/* loaded from: classes13.dex */
final class DeeplinkService_Adapter5 extends ContinuationImpl7 implements Function2<DeeplinkService_Adapter.Endpoint_openDeeplinkWithOptions.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeeplinkService_Adapter.Endpoint_openDeeplinkWithOptions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeeplinkService_Adapter5(DeeplinkService_Adapter.Endpoint_openDeeplinkWithOptions endpoint_openDeeplinkWithOptions, Continuation<? super DeeplinkService_Adapter5> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_openDeeplinkWithOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DeeplinkService_Adapter5 deeplinkService_Adapter5 = new DeeplinkService_Adapter5(this.this$0, continuation);
        deeplinkService_Adapter5.L$0 = obj;
        return deeplinkService_Adapter5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeeplinkService_Adapter.Endpoint_openDeeplinkWithOptions.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((DeeplinkService_Adapter5) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeeplinkService_Adapter.Endpoint_openDeeplinkWithOptions.Arguments arguments = (DeeplinkService_Adapter.Endpoint_openDeeplinkWithOptions.Arguments) this.L$0;
            DeeplinkService deeplinkService = this.this$0.service;
            String deeplink = arguments.getDeeplink();
            boolean alwaysPresentOnTop = arguments.getAlwaysPresentOnTop();
            this.label = 1;
            if (deeplinkService.openDeeplinkWithOptions(deeplink, alwaysPresentOnTop, this) == coroutine_suspended) {
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
