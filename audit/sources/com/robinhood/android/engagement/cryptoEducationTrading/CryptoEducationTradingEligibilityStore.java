package com.robinhood.android.engagement.cryptoEducationTrading;

import com.robinhood.android.engagement.cryptoEducationTrading.api.CryptoEducationTradingEligibilityApi;
import com.robinhood.android.engagement.cryptoEducationTrading.model.CryptoEducationEligibilityResponse;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: CryptoEducationTradingEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/CryptoEducationTradingEligibilityStore;", "Lcom/robinhood/store/Store;", "cryptoEducationTradingEligibilityService", "Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingEligibilityApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingEligibilityApi;Lcom/robinhood/store/StoreBundle;)V", "cryptoEducationSeriesId", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getCryptoEducationSeriesId", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/engagement/cryptoEducationTrading/model/CryptoEducationEligibilityResponse;", "getGetCryptoEducationSeriesId$lib_crypto_education_trading_externalRelease", "()Lcom/robinhood/android/moria/network/Endpoint;", "queryCryptoEducationTradingSeriesId", "Lcom/robinhood/android/moria/db/Query;", "streamCryptoEducationTradingSeriesId", "Lkotlinx/coroutines/flow/Flow;", "location", "lib-crypto-education-trading_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CryptoEducationTradingEligibilityStore extends Store {
    public static final int $stable = 8;
    private final SharedFlow2<String> cryptoEducationSeriesId;
    private final CryptoEducationTradingEligibilityApi cryptoEducationTradingEligibilityService;
    private final Endpoint<String, CryptoEducationEligibilityResponse> getCryptoEducationSeriesId;
    private final Query<String, String> queryCryptoEducationTradingSeriesId;
    private final StoreBundle storeBundle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoEducationTradingEligibilityStore(CryptoEducationTradingEligibilityApi cryptoEducationTradingEligibilityService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoEducationTradingEligibilityService, "cryptoEducationTradingEligibilityService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoEducationTradingEligibilityService = cryptoEducationTradingEligibilityService;
        this.storeBundle = storeBundle;
        this.cryptoEducationSeriesId = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        Endpoint<String, CryptoEducationEligibilityResponse> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoEducationTradingEligibilityStore2(this, null), storeBundle.getLogoutKillswitch(), new CryptoEducationTradingEligibilityStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getCryptoEducationSeriesId = endpointCreate$default;
        this.queryCryptoEducationTradingSeriesId = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "queryCryptoEducationTradingSeriesId", CollectionsKt.listOf(new RefreshEach(new CryptoEducationTradingEligibilityStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.android.engagement.cryptoEducationTrading.CryptoEducationTradingEligibilityStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoEducationTradingEligibilityStore.queryCryptoEducationTradingSeriesId$lambda$0(this.f$0, (String) obj);
            }
        }, false, 16, null);
    }

    /* renamed from: getGetCryptoEducationSeriesId$lib_crypto_education_trading_externalRelease */
    public final Endpoint<String, CryptoEducationEligibilityResponse> m1941xb1307f8e() {
        return this.getCryptoEducationSeriesId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryCryptoEducationTradingSeriesId$lambda$0(CryptoEducationTradingEligibilityStore cryptoEducationTradingEligibilityStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.asSharedFlow(cryptoEducationTradingEligibilityStore.cryptoEducationSeriesId);
    }

    public final Flow<String> streamCryptoEducationTradingSeriesId(String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.distinctUntilChanged(this.queryCryptoEducationTradingSeriesId.asFlow(location));
    }
}
