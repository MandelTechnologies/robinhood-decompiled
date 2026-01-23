package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.ApiSduiInfoSheetResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiInfoSheetStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SduiInfoSheetStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiSduiInfoSheetResponse;", "fetchSduiInfoSheet", "sheetId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SduiInfoSheetStore extends Store {
    private final Endpoint<String, ApiSduiInfoSheetResponse> endpoint;
    private final TradeEquityBonfireApi tradeEquityBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiInfoSheetStore(StoreBundle storeBundle, TradeEquityBonfireApi tradeEquityBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SduiInfoSheetStore2(this, null), getLogoutKillswitch(), new SduiInfoSheetStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object fetchSduiInfoSheet(String str, Continuation<? super ApiSduiInfoSheetResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.endpoint, str, null, continuation, 2, null);
    }
}
