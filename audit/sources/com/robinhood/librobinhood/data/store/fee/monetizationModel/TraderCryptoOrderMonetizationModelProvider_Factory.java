package com.robinhood.librobinhood.data.store.fee.monetizationModel;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderCryptoOrderMonetizationModelProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider;", "cryptoAccountPreferencesStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TraderCryptoOrderMonetizationModelProvider_Factory implements Factory<TraderCryptoOrderMonetizationModelProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore;
    private final Provider<CryptoAccountStore> cryptoAccountStore;

    @JvmStatic
    public static final TraderCryptoOrderMonetizationModelProvider_Factory create(Provider<CryptoAccountPreferencesStore> provider, Provider<CryptoAccountStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final TraderCryptoOrderMonetizationModelProvider newInstance(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, CryptoAccountStore cryptoAccountStore) {
        return INSTANCE.newInstance(cryptoAccountPreferencesStore, cryptoAccountStore);
    }

    public TraderCryptoOrderMonetizationModelProvider_Factory(Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<CryptoAccountStore> cryptoAccountStore) {
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoAccountStore = cryptoAccountStore;
    }

    @Override // javax.inject.Provider
    public TraderCryptoOrderMonetizationModelProvider get() {
        Companion companion = INSTANCE;
        CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.cryptoAccountPreferencesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountPreferencesStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        return companion.newInstance(cryptoAccountPreferencesStore, cryptoAccountStore);
    }

    /* compiled from: TraderCryptoOrderMonetizationModelProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider_Factory;", "cryptoAccountPreferencesStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/TraderCryptoOrderMonetizationModelProvider;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderCryptoOrderMonetizationModelProvider_Factory create(Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<CryptoAccountStore> cryptoAccountStore) {
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            return new TraderCryptoOrderMonetizationModelProvider_Factory(cryptoAccountPreferencesStore, cryptoAccountStore);
        }

        @JvmStatic
        public final TraderCryptoOrderMonetizationModelProvider newInstance(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, CryptoAccountStore cryptoAccountStore) {
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            return new TraderCryptoOrderMonetizationModelProvider(cryptoAccountPreferencesStore, cryptoAccountStore);
        }
    }
}
