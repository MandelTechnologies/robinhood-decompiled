package com.robinhood.librobinhood.data.store;

import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoChartStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoChartStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;)V", "streamChartModel", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "span", "Lcom/robinhood/android/charts/models/db/SpanOption;", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithoutCurrencyPair;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoChartStore extends Store {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final PerformanceChartStore performanceChartStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoChartStore(StoreBundle storeBundle, CryptoAccountProvider cryptoAccountProvider, PerformanceChartStore performanceChartStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.performanceChartStore = performanceChartStore;
    }

    public final Flow<PerformanceChartModel> streamChartModel(SpanOption span, CryptoAccountSwitcherLocation.WithoutCurrencyPair location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.transformLatest(this.cryptoAccountProvider.streamAccountNumber(location), new CryptoChartStore$streamChartModel$$inlined$flatMapLatest$1(null, this, span));
    }
}
