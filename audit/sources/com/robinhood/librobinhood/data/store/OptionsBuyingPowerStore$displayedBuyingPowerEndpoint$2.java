package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiOptionsDisplayedBuyingPower;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$BuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$2", m3645f = "OptionsBuyingPowerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$2 extends ContinuationImpl7 implements Function2<ApiOptionsDisplayedBuyingPower.BuyingPower, Continuation<? super Unit>, Object> {
    int label;

    OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$2(Continuation<? super OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionsDisplayedBuyingPower.BuyingPower buyingPower, Continuation<? super Unit> continuation) {
        return ((OptionsBuyingPowerStore$displayedBuyingPowerEndpoint$2) create(buyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
