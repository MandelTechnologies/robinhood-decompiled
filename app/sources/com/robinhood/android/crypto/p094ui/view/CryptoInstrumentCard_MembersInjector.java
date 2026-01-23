package com.robinhood.android.crypto.p094ui.view;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.carousel.InstrumentCard_MembersInjector;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoInstrumentCard_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoInstrumentCard_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/crypto/ui/view/CryptoInstrumentCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoInstrumentCard_MembersInjector implements MembersInjector<CryptoInstrumentCard> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CryptoHistoricalStore> cryptoHistoricalStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CurrencyPairStore> currencyPairStore;
    private final Provider<Navigator> navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CryptoInstrumentCard> create(Provider<AnalyticsLogger> provider, Provider<CurrencyPairStore> provider2, Provider<CryptoQuoteStore> provider3, Provider<CryptoHistoricalStore> provider4, Provider<Navigator> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectCryptoHistoricalStore(CryptoInstrumentCard cryptoInstrumentCard, CryptoHistoricalStore cryptoHistoricalStore) {
        INSTANCE.injectCryptoHistoricalStore(cryptoInstrumentCard, cryptoHistoricalStore);
    }

    @JvmStatic
    public static final void injectCryptoQuoteStore(CryptoInstrumentCard cryptoInstrumentCard, CryptoQuoteStore cryptoQuoteStore) {
        INSTANCE.injectCryptoQuoteStore(cryptoInstrumentCard, cryptoQuoteStore);
    }

    @JvmStatic
    public static final void injectCurrencyPairStore(CryptoInstrumentCard cryptoInstrumentCard, CurrencyPairStore currencyPairStore) {
        INSTANCE.injectCurrencyPairStore(cryptoInstrumentCard, currencyPairStore);
    }

    @JvmStatic
    public static final void injectNavigator(CryptoInstrumentCard cryptoInstrumentCard, Navigator navigator) {
        INSTANCE.injectNavigator(cryptoInstrumentCard, navigator);
    }

    public CryptoInstrumentCard_MembersInjector(Provider<AnalyticsLogger> analytics, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.analytics = analytics;
        this.currencyPairStore = currencyPairStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CryptoInstrumentCard instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        InstrumentCard_MembersInjector.Companion companion = InstrumentCard_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        Companion companion2 = INSTANCE;
        CurrencyPairStore currencyPairStore = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        companion2.injectCurrencyPairStore(instance, currencyPairStore);
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        companion2.injectCryptoQuoteStore(instance, cryptoQuoteStore);
        CryptoHistoricalStore cryptoHistoricalStore = this.cryptoHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalStore, "get(...)");
        companion2.injectCryptoHistoricalStore(instance, cryptoHistoricalStore);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
    }

    /* compiled from: CryptoInstrumentCard_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoInstrumentCard_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/crypto/ui/view/CryptoInstrumentCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectCurrencyPairStore", "", "instance", "injectCryptoQuoteStore", "injectCryptoHistoricalStore", "injectNavigator", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CryptoInstrumentCard> create(Provider<AnalyticsLogger> analytics, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new CryptoInstrumentCard_MembersInjector(analytics, currencyPairStore, cryptoQuoteStore, cryptoHistoricalStore, navigator);
        }

        @JvmStatic
        public final void injectCurrencyPairStore(CryptoInstrumentCard instance, CurrencyPairStore currencyPairStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            instance.setCurrencyPairStore(currencyPairStore);
        }

        @JvmStatic
        public final void injectCryptoQuoteStore(CryptoInstrumentCard instance, CryptoQuoteStore cryptoQuoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            instance.setCryptoQuoteStore(cryptoQuoteStore);
        }

        @JvmStatic
        public final void injectCryptoHistoricalStore(CryptoInstrumentCard instance, CryptoHistoricalStore cryptoHistoricalStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            instance.setCryptoHistoricalStore(cryptoHistoricalStore);
        }

        @JvmStatic
        public final void injectNavigator(CryptoInstrumentCard instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
