package com.robinhood.librobinhood.data.store;

import com.robinhood.g11n.iso.RegionCode;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.ApiCryptoTradingOptions;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTradingOptionsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoTradingOptions;", "it", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore$TradingOptionsRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$endpoint$1", m3645f = "CryptoTradingOptionsStore.kt", m3646l = {37, 45}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoTradingOptionsStore2 extends ContinuationImpl7 implements Function2<CryptoTradingOptionsStore.TradingOptionsRequest, Continuation<? super ApiCryptoTradingOptions>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTradingOptionsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTradingOptionsStore2(CryptoTradingOptionsStore cryptoTradingOptionsStore, Continuation<? super CryptoTradingOptionsStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTradingOptionsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTradingOptionsStore2 cryptoTradingOptionsStore2 = new CryptoTradingOptionsStore2(this.this$0, continuation);
        cryptoTradingOptionsStore2.L$0 = obj;
        return cryptoTradingOptionsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoTradingOptionsStore.TradingOptionsRequest tradingOptionsRequest, Continuation<? super ApiCryptoTradingOptions> continuation) {
        return ((CryptoTradingOptionsStore2) create(tradingOptionsRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r12 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r12 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (ApiCryptoTradingOptions) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (ApiCryptoTradingOptions) obj;
        }
        ResultKt.throwOnFailure(obj);
        CryptoTradingOptionsStore.TradingOptionsRequest tradingOptionsRequest = (CryptoTradingOptionsStore.TradingOptionsRequest) this.L$0;
        if (this.this$0.authManager.isLoggedIn()) {
            CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
            CryptoTradingAssetType assetType = tradingOptionsRequest.getAssetType();
            CryptoTradingOptionsLocation location = tradingOptionsRequest.getLocation();
            String categoryServerName = tradingOptionsRequest.getCategoryServerName();
            String query = tradingOptionsRequest.getQuery();
            Integer limit = tradingOptionsRequest.getLimit();
            this.label = 1;
            obj = cryptoBonfireApi.getCryptoTradingOptions(assetType, location, categoryServerName, query, limit, this);
        } else {
            CryptoBonfireApi cryptoBonfireApi2 = this.this$0.cryptoBonfireApi;
            RegionCode regionCode = this.this$0.appType.toRegionCode();
            CryptoTradingAssetType assetType2 = tradingOptionsRequest.getAssetType();
            CryptoTradingOptionsLocation location2 = tradingOptionsRequest.getLocation();
            String categoryServerName2 = tradingOptionsRequest.getCategoryServerName();
            Integer limit2 = tradingOptionsRequest.getLimit();
            this.label = 2;
            obj = cryptoBonfireApi2.getCryptoTradingOptionsAnonymous(regionCode, assetType2, location2, categoryServerName2, limit2, this);
        }
        return coroutine_suspended;
    }
}
