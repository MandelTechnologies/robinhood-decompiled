package com.robinhood.librobinhood.data.store.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoGiftStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoryModule_ProvideCryptoGiftHistoryTransactionLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/dagger/CryptoHistoryModule_ProvideCryptoGiftHistoryTransactionLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "cryptoGiftStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoGiftStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.dagger.CryptoHistoryModule_ProvideCryptoGiftHistoryTransactionLoaderFactory */
/* loaded from: classes13.dex */
public final class C34788xc12b061b implements Factory<HistoryTransactionLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoGiftStore> cryptoGiftStore;

    @JvmStatic
    public static final C34788xc12b061b create(Provider<CryptoGiftStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryTransactionLoader provideCryptoGiftHistoryTransactionLoader(CryptoGiftStore cryptoGiftStore) {
        return INSTANCE.provideCryptoGiftHistoryTransactionLoader(cryptoGiftStore);
    }

    public C34788xc12b061b(Provider<CryptoGiftStore> cryptoGiftStore) {
        Intrinsics.checkNotNullParameter(cryptoGiftStore, "cryptoGiftStore");
        this.cryptoGiftStore = cryptoGiftStore;
    }

    @Override // javax.inject.Provider
    public HistoryTransactionLoader get() {
        Companion companion = INSTANCE;
        CryptoGiftStore cryptoGiftStore = this.cryptoGiftStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoGiftStore, "get(...)");
        return companion.provideCryptoGiftHistoryTransactionLoader(cryptoGiftStore);
    }

    /* compiled from: CryptoHistoryModule_ProvideCryptoGiftHistoryTransactionLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/dagger/CryptoHistoryModule_ProvideCryptoGiftHistoryTransactionLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/dagger/CryptoHistoryModule_ProvideCryptoGiftHistoryTransactionLoaderFactory;", "cryptoGiftStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoGiftStore;", "provideCryptoGiftHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.dagger.CryptoHistoryModule_ProvideCryptoGiftHistoryTransactionLoaderFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C34788xc12b061b create(Provider<CryptoGiftStore> cryptoGiftStore) {
            Intrinsics.checkNotNullParameter(cryptoGiftStore, "cryptoGiftStore");
            return new C34788xc12b061b(cryptoGiftStore);
        }

        @JvmStatic
        public final HistoryTransactionLoader provideCryptoGiftHistoryTransactionLoader(CryptoGiftStore cryptoGiftStore) {
            Intrinsics.checkNotNullParameter(cryptoGiftStore, "cryptoGiftStore");
            Object objCheckNotNull = Preconditions.checkNotNull(CryptoHistoryModule.INSTANCE.provideCryptoGiftHistoryTransactionLoader(cryptoGiftStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryTransactionLoader) objCheckNotNull;
        }
    }
}
