package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.ApiInstrumentBuyingPower;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: InstrumentBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiInstrumentBuyingPower;", "instrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$individualAccountInstrumentEndpoint$1", m3645f = "InstrumentBuyingPowerStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 38}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$individualAccountInstrumentEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentBuyingPowerStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiInstrumentBuyingPower>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstrumentBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentBuyingPowerStore2(InstrumentBuyingPowerStore instrumentBuyingPowerStore, Continuation<? super InstrumentBuyingPowerStore2> continuation) {
        super(2, continuation);
        this.this$0 = instrumentBuyingPowerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentBuyingPowerStore2 instrumentBuyingPowerStore2 = new InstrumentBuyingPowerStore2(this.this$0, continuation);
        instrumentBuyingPowerStore2.L$0 = obj;
        return instrumentBuyingPowerStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiInstrumentBuyingPower> continuation) {
        return ((InstrumentBuyingPowerStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            uuid = (UUID) this.L$0;
            Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(this.this$0.accountProvider.mo22580getActiveAccountNumber());
            this.L$0 = uuid;
            this.label = 1;
            obj = RxAwait3.awaitFirst(observableFilterIsPresent, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        uuid = (UUID) this.L$0;
        ResultKt.throwOnFailure(obj);
        UUID uuid2 = uuid;
        String str = (String) obj;
        TradeEquityBonfireApi tradeEquityBonfireApi = this.this$0.tradeEquityBonfireApi;
        Intrinsics.checkNotNull(str);
        this.L$0 = null;
        this.label = 2;
        Object buyingPowerForInstrument$default = TradeEquityBonfireApi.DefaultImpls.getBuyingPowerForInstrument$default(tradeEquityBonfireApi, str, uuid2, null, this, 4, null);
        return buyingPowerForInstrument$default == coroutine_suspended ? coroutine_suspended : buyingPowerForInstrument$default;
    }
}
