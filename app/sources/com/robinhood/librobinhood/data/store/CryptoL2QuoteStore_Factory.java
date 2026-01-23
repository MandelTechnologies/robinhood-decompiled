package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.CryptoL2QuoteApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoL2QuoteStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;", "cryptoL2QuoteApi", "Ljavax/inject/Provider;", "Lcom/robinhood/models/api/retrofit/CryptoL2QuoteApi;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CryptoL2QuoteStore_Factory implements Factory<CryptoL2QuoteStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoL2QuoteApi> cryptoL2QuoteApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoL2QuoteStore_Factory create(Provider<CryptoL2QuoteApi> provider, Provider<CryptoExperimentsStore> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoL2QuoteStore newInstance(CryptoL2QuoteApi cryptoL2QuoteApi, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(cryptoL2QuoteApi, cryptoExperimentsStore, storeBundle);
    }

    public CryptoL2QuoteStore_Factory(Provider<CryptoL2QuoteApi> cryptoL2QuoteApi, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(cryptoL2QuoteApi, "cryptoL2QuoteApi");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoL2QuoteApi = cryptoL2QuoteApi;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoL2QuoteStore get() {
        Companion companion = INSTANCE;
        CryptoL2QuoteApi cryptoL2QuoteApi = this.cryptoL2QuoteApi.get();
        Intrinsics.checkNotNullExpressionValue(cryptoL2QuoteApi, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(cryptoL2QuoteApi, cryptoExperimentsStore, storeBundle);
    }

    /* compiled from: CryptoL2QuoteStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore_Factory;", "cryptoL2QuoteApi", "Ljavax/inject/Provider;", "Lcom/robinhood/models/api/retrofit/CryptoL2QuoteApi;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoL2QuoteStore_Factory create(Provider<CryptoL2QuoteApi> cryptoL2QuoteApi, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoL2QuoteApi, "cryptoL2QuoteApi");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoL2QuoteStore_Factory(cryptoL2QuoteApi, cryptoExperimentsStore, storeBundle);
        }

        @JvmStatic
        public final CryptoL2QuoteStore newInstance(CryptoL2QuoteApi cryptoL2QuoteApi, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoL2QuoteApi, "cryptoL2QuoteApi");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoL2QuoteStore(cryptoL2QuoteApi, cryptoExperimentsStore, storeBundle);
        }
    }
}
