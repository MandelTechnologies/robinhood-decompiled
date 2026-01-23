package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoDetailIacHeroCardInvalidator;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAccountPreferencesManagedServiceImpl_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoAccountPreferencesManagedServiceImpl_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoAccountPreferencesManagedServiceImpl;", "cryptoAccountPreferencesStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoDetailIacHeroCardInvalidator", "Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAccountPreferencesManagedServiceImpl_Factory implements Factory<CryptoAccountPreferencesManagedServiceImpl> {
    private final Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoDetailIacHeroCardInvalidator> cryptoDetailIacHeroCardInvalidator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoAccountPreferencesManagedServiceImpl_Factory create(Provider<CryptoAccountPreferencesStore> provider, Provider<CryptoAccountStore> provider2, Provider<CryptoDetailIacHeroCardInvalidator> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoAccountPreferencesManagedServiceImpl newInstance(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, CryptoAccountStore cryptoAccountStore, CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator) {
        return INSTANCE.newInstance(cryptoAccountPreferencesStore, cryptoAccountStore, cryptoDetailIacHeroCardInvalidator);
    }

    public CryptoAccountPreferencesManagedServiceImpl_Factory(Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoDetailIacHeroCardInvalidator> cryptoDetailIacHeroCardInvalidator) {
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoDetailIacHeroCardInvalidator, "cryptoDetailIacHeroCardInvalidator");
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoDetailIacHeroCardInvalidator = cryptoDetailIacHeroCardInvalidator;
    }

    @Override // javax.inject.Provider
    public CryptoAccountPreferencesManagedServiceImpl get() {
        Companion companion = INSTANCE;
        CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.cryptoAccountPreferencesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountPreferencesStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator = this.cryptoDetailIacHeroCardInvalidator.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDetailIacHeroCardInvalidator, "get(...)");
        return companion.newInstance(cryptoAccountPreferencesStore, cryptoAccountStore, cryptoDetailIacHeroCardInvalidator);
    }

    /* compiled from: CryptoAccountPreferencesManagedServiceImpl_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoAccountPreferencesManagedServiceImpl_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/microgram/CryptoAccountPreferencesManagedServiceImpl_Factory;", "cryptoAccountPreferencesStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoDetailIacHeroCardInvalidator", "Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;", "newInstance", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoAccountPreferencesManagedServiceImpl;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoAccountPreferencesManagedServiceImpl_Factory create(Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoDetailIacHeroCardInvalidator> cryptoDetailIacHeroCardInvalidator) {
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoDetailIacHeroCardInvalidator, "cryptoDetailIacHeroCardInvalidator");
            return new CryptoAccountPreferencesManagedServiceImpl_Factory(cryptoAccountPreferencesStore, cryptoAccountStore, cryptoDetailIacHeroCardInvalidator);
        }

        @JvmStatic
        public final CryptoAccountPreferencesManagedServiceImpl newInstance(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, CryptoAccountStore cryptoAccountStore, CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator) {
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoDetailIacHeroCardInvalidator, "cryptoDetailIacHeroCardInvalidator");
            return new CryptoAccountPreferencesManagedServiceImpl(cryptoAccountPreferencesStore, cryptoAccountStore, cryptoDetailIacHeroCardInvalidator);
        }
    }
}
