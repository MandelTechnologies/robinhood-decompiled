package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiInstrumentBuyingPower;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: InstrumentBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/librobinhood/data/store/ReplaceOrderInstrumentBuyingPowerQuery;", "Lcom/robinhood/models/api/ApiInstrumentBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$selectedAccountInstrumentEndpointReplace$2", m3645f = "InstrumentBuyingPowerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$selectedAccountInstrumentEndpointReplace$2, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentBuyingPowerStore7 extends ContinuationImpl7 implements Function3<ReplaceOrderInstrumentBuyingPowerQuery, ApiInstrumentBuyingPower, Continuation<? super Unit>, Object> {
    int label;

    InstrumentBuyingPowerStore7(Continuation<? super InstrumentBuyingPowerStore7> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ReplaceOrderInstrumentBuyingPowerQuery replaceOrderInstrumentBuyingPowerQuery, ApiInstrumentBuyingPower apiInstrumentBuyingPower, Continuation<? super Unit> continuation) {
        return new InstrumentBuyingPowerStore7(continuation).invokeSuspend(Unit.INSTANCE);
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
