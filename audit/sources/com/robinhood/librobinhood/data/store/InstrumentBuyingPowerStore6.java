package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.ApiInstrumentBuyingPower;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiInstrumentBuyingPower;", "query", "Lcom/robinhood/librobinhood/data/store/ReplaceOrderInstrumentBuyingPowerQuery;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$selectedAccountInstrumentEndpointReplace$1", m3645f = "InstrumentBuyingPowerStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$selectedAccountInstrumentEndpointReplace$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentBuyingPowerStore6 extends ContinuationImpl7 implements Function2<ReplaceOrderInstrumentBuyingPowerQuery, Continuation<? super ApiInstrumentBuyingPower>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstrumentBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentBuyingPowerStore6(InstrumentBuyingPowerStore instrumentBuyingPowerStore, Continuation<? super InstrumentBuyingPowerStore6> continuation) {
        super(2, continuation);
        this.this$0 = instrumentBuyingPowerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentBuyingPowerStore6 instrumentBuyingPowerStore6 = new InstrumentBuyingPowerStore6(this.this$0, continuation);
        instrumentBuyingPowerStore6.L$0 = obj;
        return instrumentBuyingPowerStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReplaceOrderInstrumentBuyingPowerQuery replaceOrderInstrumentBuyingPowerQuery, Continuation<? super ApiInstrumentBuyingPower> continuation) {
        return ((InstrumentBuyingPowerStore6) create(replaceOrderInstrumentBuyingPowerQuery, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ReplaceOrderInstrumentBuyingPowerQuery replaceOrderInstrumentBuyingPowerQuery = (ReplaceOrderInstrumentBuyingPowerQuery) this.L$0;
        TradeEquityBonfireApi tradeEquityBonfireApi = this.this$0.tradeEquityBonfireApi;
        String accountNumber = replaceOrderInstrumentBuyingPowerQuery.getAccountNumber();
        UUID instrumentId = replaceOrderInstrumentBuyingPowerQuery.getInstrumentId();
        UUID orderToReplaceId = replaceOrderInstrumentBuyingPowerQuery.getOrderToReplaceId();
        this.label = 1;
        Object buyingPowerForInstrument = tradeEquityBonfireApi.getBuyingPowerForInstrument(accountNumber, instrumentId, orderToReplaceId, this);
        return buyingPowerForInstrument == coroutine_suspended ? coroutine_suspended : buyingPowerForInstrument;
    }
}
