package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoL2QuoteStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuoteServiceImpl_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoQuoteServiceImpl_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoQuoteServiceImpl;", "cryptoQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoL2QuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoQuoteServiceImpl_Factory implements Factory<CryptoQuoteServiceImpl> {
    private final Provider<CryptoL2QuoteStore> cryptoL2QuoteStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoQuoteServiceImpl_Factory create(Provider<CryptoQuoteStore> provider, Provider<CryptoL2QuoteStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final CryptoQuoteServiceImpl newInstance(CryptoQuoteStore cryptoQuoteStore, CryptoL2QuoteStore cryptoL2QuoteStore) {
        return INSTANCE.newInstance(cryptoQuoteStore, cryptoL2QuoteStore);
    }

    public CryptoQuoteServiceImpl_Factory(Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoL2QuoteStore> cryptoL2QuoteStore) {
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoL2QuoteStore, "cryptoL2QuoteStore");
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoL2QuoteStore = cryptoL2QuoteStore;
    }

    @Override // javax.inject.Provider
    public CryptoQuoteServiceImpl get() {
        Companion companion = INSTANCE;
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        CryptoL2QuoteStore cryptoL2QuoteStore = this.cryptoL2QuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoL2QuoteStore, "get(...)");
        return companion.newInstance(cryptoQuoteStore, cryptoL2QuoteStore);
    }

    /* compiled from: CryptoQuoteServiceImpl_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoQuoteServiceImpl_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/microgram/CryptoQuoteServiceImpl_Factory;", "cryptoQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoL2QuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;", "newInstance", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoQuoteServiceImpl;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoQuoteServiceImpl_Factory create(Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoL2QuoteStore> cryptoL2QuoteStore) {
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoL2QuoteStore, "cryptoL2QuoteStore");
            return new CryptoQuoteServiceImpl_Factory(cryptoQuoteStore, cryptoL2QuoteStore);
        }

        @JvmStatic
        public final CryptoQuoteServiceImpl newInstance(CryptoQuoteStore cryptoQuoteStore, CryptoL2QuoteStore cryptoL2QuoteStore) {
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoL2QuoteStore, "cryptoL2QuoteStore");
            return new CryptoQuoteServiceImpl(cryptoQuoteStore, cryptoL2QuoteStore);
        }
    }
}
