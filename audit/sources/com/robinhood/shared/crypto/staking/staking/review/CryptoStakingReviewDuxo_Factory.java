package com.robinhood.shared.crypto.staking.staking.review;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingReviewDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo;", "currencyPairStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "isQuoteInputModePref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingReviewDuxo_Factory implements Factory<CryptoStakingReviewDuxo> {
    private final Provider<CryptoHoldingStore> cryptoHoldingStore;
    private final Provider<CryptoStakingStore> cryptoStakingStore;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> isQuoteInputModePref;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoStakingReviewStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoStakingReviewDuxo_Factory create(Provider<CurrencyPairV2Store> provider, Provider<CryptoStakingStore> provider2, Provider<CryptoHoldingStore> provider3, Provider<BooleanPreference> provider4, Provider<SavedStateHandle> provider5, Provider<CryptoStakingReviewStateProvider> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoStakingReviewDuxo newInstance(CurrencyPairV2Store currencyPairV2Store, CryptoStakingStore cryptoStakingStore, CryptoHoldingStore cryptoHoldingStore, BooleanPreference booleanPreference, SavedStateHandle savedStateHandle, CryptoStakingReviewStateProvider cryptoStakingReviewStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(currencyPairV2Store, cryptoStakingStore, cryptoHoldingStore, booleanPreference, savedStateHandle, cryptoStakingReviewStateProvider, duxoBundle);
    }

    public CryptoStakingReviewDuxo_Factory(Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoStakingStore> cryptoStakingStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<BooleanPreference> isQuoteInputModePref, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoStakingReviewStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(isQuoteInputModePref, "isQuoteInputModePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.currencyPairStore = currencyPairStore;
        this.cryptoStakingStore = cryptoStakingStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.isQuoteInputModePref = isQuoteInputModePref;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoStakingReviewDuxo get() {
        Companion companion = INSTANCE;
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        CryptoStakingStore cryptoStakingStore = this.cryptoStakingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingStore, "get(...)");
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingStore, "get(...)");
        BooleanPreference booleanPreference = this.isQuoteInputModePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CryptoStakingReviewStateProvider cryptoStakingReviewStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingReviewStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(currencyPairV2Store, cryptoStakingStore, cryptoHoldingStore, booleanPreference, savedStateHandle, cryptoStakingReviewStateProvider, duxoBundle);
    }

    /* compiled from: CryptoStakingReviewDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo_Factory;", "currencyPairStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "isQuoteInputModePref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoStakingReviewDuxo_Factory create(Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoStakingStore> cryptoStakingStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<BooleanPreference> isQuoteInputModePref, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoStakingReviewStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(isQuoteInputModePref, "isQuoteInputModePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoStakingReviewDuxo_Factory(currencyPairStore, cryptoStakingStore, cryptoHoldingStore, isQuoteInputModePref, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final CryptoStakingReviewDuxo newInstance(CurrencyPairV2Store currencyPairStore, CryptoStakingStore cryptoStakingStore, CryptoHoldingStore cryptoHoldingStore, BooleanPreference isQuoteInputModePref, SavedStateHandle savedStateHandle, CryptoStakingReviewStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(isQuoteInputModePref, "isQuoteInputModePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoStakingReviewDuxo(currencyPairStore, cryptoStakingStore, cryptoHoldingStore, isQuoteInputModePref, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
