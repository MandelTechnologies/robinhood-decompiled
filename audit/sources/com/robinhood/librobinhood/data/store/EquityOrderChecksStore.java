package com.robinhood.librobinhood.data.store;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.ApiEquityOrderChecksRequest;
import com.robinhood.models.api.ApiEquityOrderPostBody;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.AlertType;

/* compiled from: EquityOrderChecksStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityOrderChecksStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/ApiEquityOrderChecksRequest;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/EquityOrderChecksAlert;", "equityOrderChecks", CarResultComposable2.BODY, "Lcom/robinhood/models/api/ApiEquityOrderPostBody;", "orderToReplaceId", "Ljava/util/UUID;", "debugAlertType", "Lrosetta/order/AlertType;", "(Lcom/robinhood/models/api/ApiEquityOrderPostBody;Ljava/util/UUID;Lrosetta/order/AlertType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EquityOrderChecksStore extends Store {
    private final PostEndpoint<ApiEquityOrderChecksRequest, Optional<EquityOrderChecksAlert>> endpoint;
    private final TradeEquityBonfireApi tradeEquityBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderChecksStore(StoreBundle storeBundle, TradeEquityBonfireApi tradeEquityBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.endpoint = PostEndpoint.INSTANCE.create(new EquityOrderChecksStore2(this, null), new EquityOrderChecksStore3(null));
    }

    public static /* synthetic */ Object equityOrderChecks$default(EquityOrderChecksStore equityOrderChecksStore, ApiEquityOrderPostBody apiEquityOrderPostBody, UUID uuid, AlertType alertType, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            alertType = null;
        }
        return equityOrderChecksStore.equityOrderChecks(apiEquityOrderPostBody, uuid, alertType, continuation);
    }

    public final Object equityOrderChecks(ApiEquityOrderPostBody apiEquityOrderPostBody, UUID uuid, AlertType alertType, Continuation<? super Optional<? extends EquityOrderChecksAlert>> continuation) {
        String lowerCase;
        if (alertType == null || alertType == AlertType.UNDEFINED) {
            lowerCase = null;
        } else {
            lowerCase = alertType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        return PostEndpoint.DefaultImpls.post$default(this.endpoint, new ApiEquityOrderChecksRequest(lowerCase, apiEquityOrderPostBody, uuid != null ? uuid.toString() : null), null, continuation, 2, null);
    }
}
