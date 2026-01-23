package com.robinhood.shared.trade.crypto.p397ui.price;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderPriceDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderPriceDuxo_Factory implements Factory<CryptoOrderPriceDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoTradingBottomSheetService> bottomSheetService;
    private final Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoOrderPriceDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderPriceDuxo_Factory create(Provider<AppType> provider, Provider<CryptoTradingBottomSheetService> provider2, Provider<CryptoOrderMonetizationModelProvider> provider3, Provider<CryptoQuoteStore> provider4, Provider<CurrencyPairV2Store> provider5, Provider<DuxoBundle> provider6, Provider<SavedStateHandle> provider7, Provider<CryptoOrderPriceDuxo3> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CryptoOrderPriceDuxo newInstance(AppType appType, CryptoTradingBottomSheetService cryptoTradingBottomSheetService, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoQuoteStore cryptoQuoteStore, CurrencyPairV2Store currencyPairV2Store, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoOrderPriceDuxo3 cryptoOrderPriceDuxo3) {
        return INSTANCE.newInstance(appType, cryptoTradingBottomSheetService, cryptoOrderMonetizationModelProvider, cryptoQuoteStore, currencyPairV2Store, duxoBundle, savedStateHandle, cryptoOrderPriceDuxo3);
    }

    public CryptoOrderPriceDuxo_Factory(Provider<AppType> appType, Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoOrderPriceDuxo3> stateProvider) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.appType = appType;
        this.bottomSheetService = bottomSheetService;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.currencyPairStore = currencyPairStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoOrderPriceDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoTradingBottomSheetService cryptoTradingBottomSheetService = this.bottomSheetService.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradingBottomSheetService, "get(...)");
        CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = this.cryptoOrderMonetizationModelProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderMonetizationModelProvider, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CryptoOrderPriceDuxo3 cryptoOrderPriceDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderPriceDuxo3, "get(...)");
        return companion.newInstance(appType, cryptoTradingBottomSheetService, cryptoOrderMonetizationModelProvider, cryptoQuoteStore, currencyPairV2Store, duxoBundle, savedStateHandle, cryptoOrderPriceDuxo3);
    }

    /* compiled from: CryptoOrderPriceDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceStateProvider;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderPriceDuxo_Factory create(Provider<AppType> appType, Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoOrderPriceDuxo3> stateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoOrderPriceDuxo_Factory(appType, bottomSheetService, cryptoOrderMonetizationModelProvider, cryptoQuoteStore, currencyPairStore, duxoBundle, savedStateHandle, stateProvider);
        }

        @JvmStatic
        public final CryptoOrderPriceDuxo newInstance(AppType appType, CryptoTradingBottomSheetService bottomSheetService, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoQuoteStore cryptoQuoteStore, CurrencyPairV2Store currencyPairStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoOrderPriceDuxo3 stateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoOrderPriceDuxo(appType, bottomSheetService, cryptoOrderMonetizationModelProvider, cryptoQuoteStore, currencyPairStore, duxoBundle, savedStateHandle, stateProvider);
        }
    }
}
