package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.dao.TokenizedDividendDao;
import com.robinhood.models.crypto.dao.TokenizedSplitPaymentDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.RestNummusService;

/* compiled from: TokenizedCorpActionsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TokenizedCorpActionsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/TokenizedCorpActionsStore;", "nummusService", "Ljavax/inject/Provider;", "Lnummus/v1/RestNummusService;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "splitPaymentDao", "Lcom/robinhood/models/crypto/dao/TokenizedSplitPaymentDao;", "dividendDao", "Lcom/robinhood/models/crypto/dao/TokenizedDividendDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TokenizedCorpActionsStore_Factory implements Factory<TokenizedCorpActionsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CurrencyPairV2Store> currencyPairV2Store;
    private final Provider<TokenizedDividendDao> dividendDao;
    private final Provider<RestNummusService> nummusService;
    private final Provider<TokenizedSplitPaymentDao> splitPaymentDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final TokenizedCorpActionsStore_Factory create(Provider<RestNummusService> provider, Provider<CurrencyPairV2Store> provider2, Provider<TokenizedSplitPaymentDao> provider3, Provider<TokenizedDividendDao> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TokenizedCorpActionsStore newInstance(RestNummusService restNummusService, CurrencyPairV2Store currencyPairV2Store, TokenizedSplitPaymentDao tokenizedSplitPaymentDao, TokenizedDividendDao tokenizedDividendDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(restNummusService, currencyPairV2Store, tokenizedSplitPaymentDao, tokenizedDividendDao, storeBundle);
    }

    public TokenizedCorpActionsStore_Factory(Provider<RestNummusService> nummusService, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<TokenizedSplitPaymentDao> splitPaymentDao, Provider<TokenizedDividendDao> dividendDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(splitPaymentDao, "splitPaymentDao");
        Intrinsics.checkNotNullParameter(dividendDao, "dividendDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummusService = nummusService;
        this.currencyPairV2Store = currencyPairV2Store;
        this.splitPaymentDao = splitPaymentDao;
        this.dividendDao = dividendDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public TokenizedCorpActionsStore get() {
        Companion companion = INSTANCE;
        RestNummusService restNummusService = this.nummusService.get();
        Intrinsics.checkNotNullExpressionValue(restNummusService, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairV2Store.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        TokenizedSplitPaymentDao tokenizedSplitPaymentDao = this.splitPaymentDao.get();
        Intrinsics.checkNotNullExpressionValue(tokenizedSplitPaymentDao, "get(...)");
        TokenizedDividendDao tokenizedDividendDao = this.dividendDao.get();
        Intrinsics.checkNotNullExpressionValue(tokenizedDividendDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(restNummusService, currencyPairV2Store, tokenizedSplitPaymentDao, tokenizedDividendDao, storeBundle);
    }

    /* compiled from: TokenizedCorpActionsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TokenizedCorpActionsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/TokenizedCorpActionsStore_Factory;", "nummusService", "Ljavax/inject/Provider;", "Lnummus/v1/RestNummusService;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "splitPaymentDao", "Lcom/robinhood/models/crypto/dao/TokenizedSplitPaymentDao;", "dividendDao", "Lcom/robinhood/models/crypto/dao/TokenizedDividendDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/TokenizedCorpActionsStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TokenizedCorpActionsStore_Factory create(Provider<RestNummusService> nummusService, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<TokenizedSplitPaymentDao> splitPaymentDao, Provider<TokenizedDividendDao> dividendDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(splitPaymentDao, "splitPaymentDao");
            Intrinsics.checkNotNullParameter(dividendDao, "dividendDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TokenizedCorpActionsStore_Factory(nummusService, currencyPairV2Store, splitPaymentDao, dividendDao, storeBundle);
        }

        @JvmStatic
        public final TokenizedCorpActionsStore newInstance(RestNummusService nummusService, CurrencyPairV2Store currencyPairV2Store, TokenizedSplitPaymentDao splitPaymentDao, TokenizedDividendDao dividendDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(splitPaymentDao, "splitPaymentDao");
            Intrinsics.checkNotNullParameter(dividendDao, "dividendDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TokenizedCorpActionsStore(nummusService, currencyPairV2Store, splitPaymentDao, dividendDao, storeBundle);
        }
    }
}
