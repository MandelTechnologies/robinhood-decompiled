package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOnboardingM1Store_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "hasCryptoImpressionPref", "Lcom/robinhood/prefs/BooleanPreference;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoOnboardingM1Store_Factory implements Factory<CryptoOnboardingM1Store> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<BooleanPreference> hasCryptoImpressionPref;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoOnboardingM1Store_Factory create(Provider<StoreBundle> provider, Provider<BooleanPreference> provider2, Provider<BaseSortingHatStore> provider3, Provider<CryptoExperimentsStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoOnboardingM1Store newInstance(StoreBundle storeBundle, BooleanPreference booleanPreference, BaseSortingHatStore baseSortingHatStore, CryptoExperimentsStore cryptoExperimentsStore) {
        return INSTANCE.newInstance(storeBundle, booleanPreference, baseSortingHatStore, cryptoExperimentsStore);
    }

    public CryptoOnboardingM1Store_Factory(Provider<StoreBundle> storeBundle, Provider<BooleanPreference> hasCryptoImpressionPref, Provider<BaseSortingHatStore> sortingHatStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        this.storeBundle = storeBundle;
        this.hasCryptoImpressionPref = hasCryptoImpressionPref;
        this.sortingHatStore = sortingHatStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    @Override // javax.inject.Provider
    public CryptoOnboardingM1Store get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        BooleanPreference booleanPreference = this.hasCryptoImpressionPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        return companion.newInstance(storeBundle, booleanPreference, baseSortingHatStore, cryptoExperimentsStore);
    }

    /* compiled from: CryptoOnboardingM1Store_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "hasCryptoImpressionPref", "Lcom/robinhood/prefs/BooleanPreference;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOnboardingM1Store_Factory create(Provider<StoreBundle> storeBundle, Provider<BooleanPreference> hasCryptoImpressionPref, Provider<BaseSortingHatStore> sortingHatStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            return new CryptoOnboardingM1Store_Factory(storeBundle, hasCryptoImpressionPref, sortingHatStore, cryptoExperimentsStore);
        }

        @JvmStatic
        public final CryptoOnboardingM1Store newInstance(StoreBundle storeBundle, BooleanPreference hasCryptoImpressionPref, BaseSortingHatStore sortingHatStore, CryptoExperimentsStore cryptoExperimentsStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            return new CryptoOnboardingM1Store(storeBundle, hasCryptoImpressionPref, sortingHatStore, cryptoExperimentsStore);
        }
    }
}
