package com.robinhood.android.common.views.crypto;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.views.BaseInstrumentRowView_MembersInjector;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoRowView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/views/crypto/CryptoRowView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/crypto/CryptoRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoRowView_MembersInjector implements MembersInjector<CryptoRowView> {
    private final Provider<CryptoHistoricalStore> cryptoHistoricalStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CurrencyPairStore> currencyPairStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<StringPreference> viewModePreference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CryptoRowView> create(Provider<StringPreference> provider, Provider<CryptoQuoteStore> provider2, Provider<CryptoHistoricalStore> provider3, Provider<CurrencyPairStore> provider4, Provider<TraderMarketHoursManager> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectCryptoHistoricalStore(CryptoRowView cryptoRowView, CryptoHistoricalStore cryptoHistoricalStore) {
        INSTANCE.injectCryptoHistoricalStore(cryptoRowView, cryptoHistoricalStore);
    }

    @JvmStatic
    public static final void injectCryptoQuoteStore(CryptoRowView cryptoRowView, CryptoQuoteStore cryptoQuoteStore) {
        INSTANCE.injectCryptoQuoteStore(cryptoRowView, cryptoQuoteStore);
    }

    @JvmStatic
    public static final void injectCurrencyPairStore(CryptoRowView cryptoRowView, CurrencyPairStore currencyPairStore) {
        INSTANCE.injectCurrencyPairStore(cryptoRowView, currencyPairStore);
    }

    @JvmStatic
    public static final void injectMarketHoursManager(CryptoRowView cryptoRowView, TraderMarketHoursManager traderMarketHoursManager) {
        INSTANCE.injectMarketHoursManager(cryptoRowView, traderMarketHoursManager);
    }

    public CryptoRowView_MembersInjector(Provider<StringPreference> viewModePreference, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<CurrencyPairStore> currencyPairStore, Provider<TraderMarketHoursManager> marketHoursManager) {
        Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        this.viewModePreference = viewModePreference;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.currencyPairStore = currencyPairStore;
        this.marketHoursManager = marketHoursManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CryptoRowView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseInstrumentRowView_MembersInjector.Companion companion = BaseInstrumentRowView_MembersInjector.INSTANCE;
        StringPreference stringPreference = this.viewModePreference.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectViewModePreference(instance, stringPreference);
        Companion companion2 = INSTANCE;
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        companion2.injectCryptoQuoteStore(instance, cryptoQuoteStore);
        CryptoHistoricalStore cryptoHistoricalStore = this.cryptoHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalStore, "get(...)");
        companion2.injectCryptoHistoricalStore(instance, cryptoHistoricalStore);
        CurrencyPairStore currencyPairStore = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        companion2.injectCurrencyPairStore(instance, currencyPairStore);
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        companion2.injectMarketHoursManager(instance, traderMarketHoursManager);
    }

    /* compiled from: CryptoRowView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/views/crypto/CryptoRowView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/crypto/CryptoRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "injectCryptoQuoteStore", "", "instance", "injectCryptoHistoricalStore", "injectCurrencyPairStore", "injectMarketHoursManager", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CryptoRowView> create(Provider<StringPreference> viewModePreference, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<CurrencyPairStore> currencyPairStore, Provider<TraderMarketHoursManager> marketHoursManager) {
            Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            return new CryptoRowView_MembersInjector(viewModePreference, cryptoQuoteStore, cryptoHistoricalStore, currencyPairStore, marketHoursManager);
        }

        @JvmStatic
        public final void injectCryptoQuoteStore(CryptoRowView instance, CryptoQuoteStore cryptoQuoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            instance.setCryptoQuoteStore(cryptoQuoteStore);
        }

        @JvmStatic
        public final void injectCryptoHistoricalStore(CryptoRowView instance, CryptoHistoricalStore cryptoHistoricalStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            instance.setCryptoHistoricalStore(cryptoHistoricalStore);
        }

        @JvmStatic
        public final void injectCurrencyPairStore(CryptoRowView instance, CurrencyPairStore currencyPairStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            instance.setCurrencyPairStore(currencyPairStore);
        }

        @JvmStatic
        public final void injectMarketHoursManager(CryptoRowView instance, TraderMarketHoursManager marketHoursManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            instance.setMarketHoursManager(marketHoursManager);
        }
    }
}
