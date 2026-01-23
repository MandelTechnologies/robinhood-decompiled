package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: OptionSimulatedReturnsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;", "request", "<unused var>", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$1", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$1 extends ContinuationImpl7 implements Function3<ApiOptionSimulatedReturnsConfigurationV3Request, Object, Continuation<? super ApiOptionSimulatedReturnsConfigurationV3Request>, Object> {
    /* synthetic */ Object L$0;
    int label;

    OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$1(Continuation<? super OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ApiOptionSimulatedReturnsConfigurationV3Request apiOptionSimulatedReturnsConfigurationV3Request, Object obj, Continuation<? super ApiOptionSimulatedReturnsConfigurationV3Request> continuation) {
        OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$1 optionSimulatedReturnsStore$streamMarketDataParamsV3$2$1 = new OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$1(continuation);
        optionSimulatedReturnsStore$streamMarketDataParamsV3$2$1.L$0 = apiOptionSimulatedReturnsConfigurationV3Request;
        return optionSimulatedReturnsStore$streamMarketDataParamsV3$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return (ApiOptionSimulatedReturnsConfigurationV3Request) this.L$0;
    }
}
