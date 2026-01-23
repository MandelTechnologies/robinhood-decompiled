package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.api.ApiCryptoHistoricalChart;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.dao.CryptoHistoricalChartDao;
import com.robinhood.models.crypto.p314db.CryptoHistoricalChart;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: CryptoHistoricalChartStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ4\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoHistoricalChartDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/models/crypto/dao/CryptoHistoricalChartDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoSduiChartParams;", "Lcom/robinhood/models/api/ApiCryptoHistoricalChart;", "getCryptoSduiChartQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/CryptoHistoricalChart;", "poll", "Lkotlinx/coroutines/flow/Flow;", "currencyPairId", "Ljava/util/UUID;", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "sparklineColor", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "showCandlesticks", "", "refresh", "", "force", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoHistoricalChartStore extends Store {
    private final AppType appType;
    private final AuthManager authManager;
    private final CryptoBonfireApi cryptoBonfireApi;
    private final CryptoHistoricalChartDao dao;
    private final Endpoint<CryptoSduiChartParams, ApiCryptoHistoricalChart> endpoint;
    private final Query<CryptoSduiChartParams, CryptoHistoricalChart> getCryptoSduiChartQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHistoricalChartStore(StoreBundle storeBundle, AppType appType, AuthManager authManager, CryptoBonfireApi cryptoBonfireApi, CryptoHistoricalChartDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.appType = appType;
        this.authManager = authManager;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.dao = dao;
        this.endpoint = Endpoint.INSTANCE.create(new CryptoHistoricalChartStore2(this, null), getLogoutKillswitch(), new CryptoHistoricalChartStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoHistoricalChart.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getCryptoSduiChartQuery = Store.create$default(this, Query.INSTANCE, "getCryptoSduiChart", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHistoricalChartStore.getCryptoSduiChartQuery$lambda$0(this.f$0, (CryptoSduiChartParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHistoricalChartStore.getCryptoSduiChartQuery$lambda$1(this.f$0, (CryptoSduiChartParams) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getCryptoSduiChartQuery$lambda$0(CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoSduiChartParams it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<CryptoSduiChartParams, ApiCryptoHistoricalChart> endpoint = cryptoHistoricalChartStore.endpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getCryptoSduiChartQuery$lambda$1(CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoSduiChartParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.filterNotNull(cryptoHistoricalChartStore.dao.getCurrencyPairHistorical(params.getCurrencyPairId(), params.getDisplaySpan().name(), params.getShowCandlesticks()));
    }

    public static /* synthetic */ Flow poll$default(CryptoHistoricalChartStore cryptoHistoricalChartStore, UUID uuid, DisplaySpan displaySpan, Color color, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            color = Color.f5853FG;
        }
        return cryptoHistoricalChartStore.poll(uuid, displaySpan, color, z);
    }

    public final Flow<CryptoHistoricalChart> poll(UUID currencyPairId, DisplaySpan displaySpan, Color sparklineColor, boolean showCandlesticks) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.getCryptoSduiChartQuery, new CryptoSduiChartParams(currencyPairId, displaySpan, sparklineColor, showCandlesticks), new C337031(this.dao), false, 4, null);
    }

    /* compiled from: CryptoHistoricalChartStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore$poll$1 */
    /* synthetic */ class C337031 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C337031(Object obj) {
            super(1, obj, CryptoHistoricalChartDao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return CryptoHistoricalChartStore.poll$deleteAll((CryptoHistoricalChartDao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object poll$deleteAll(CryptoHistoricalChartDao cryptoHistoricalChartDao, Continuation continuation) {
        cryptoHistoricalChartDao.deleteAll();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refresh$default(CryptoHistoricalChartStore cryptoHistoricalChartStore, UUID uuid, DisplaySpan displaySpan, boolean z, Color color, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            color = Color.f5853FG;
        }
        cryptoHistoricalChartStore.refresh(uuid, displaySpan, z3, color, z2);
    }

    public final void refresh(UUID currencyPairId, DisplaySpan displaySpan, boolean force, Color sparklineColor, boolean showCandlesticks) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        Endpoint.DefaultImpls.refresh$default(this.endpoint, new CryptoSduiChartParams(currencyPairId, displaySpan, sparklineColor, showCandlesticks), force, null, 4, null);
    }
}
