package com.robinhood.android.crypto.p094ui.detail.analystratings;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.shared.equities.models.instrumentdetails.store.InstrumentRatingsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAnalystRatingsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "instrumentRatingsStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/InstrumentRatingsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoAnalystRatingsDuxo_Factory implements Factory<CryptoAnalystRatingsDuxo> {
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InstrumentRatingsStore> instrumentRatingsStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoAnalystRatingsDataState2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoAnalystRatingsDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoAnalystRatingsDataState2> provider2, Provider<SavedStateHandle> provider3, Provider<CurrencyPairV2Store> provider4, Provider<InstrumentRatingsStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoAnalystRatingsDuxo newInstance(DuxoBundle duxoBundle, CryptoAnalystRatingsDataState2 cryptoAnalystRatingsDataState2, SavedStateHandle savedStateHandle, CurrencyPairV2Store currencyPairV2Store, InstrumentRatingsStore instrumentRatingsStore) {
        return INSTANCE.newInstance(duxoBundle, cryptoAnalystRatingsDataState2, savedStateHandle, currencyPairV2Store, instrumentRatingsStore);
    }

    public CryptoAnalystRatingsDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoAnalystRatingsDataState2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<CurrencyPairV2Store> currencyPairStore, Provider<InstrumentRatingsStore> instrumentRatingsStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(instrumentRatingsStore, "instrumentRatingsStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.currencyPairStore = currencyPairStore;
        this.instrumentRatingsStore = instrumentRatingsStore;
    }

    @Override // javax.inject.Provider
    public CryptoAnalystRatingsDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoAnalystRatingsDataState2 cryptoAnalystRatingsDataState2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAnalystRatingsDataState2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        InstrumentRatingsStore instrumentRatingsStore = this.instrumentRatingsStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentRatingsStore, "get(...)");
        return companion.newInstance(duxoBundle, cryptoAnalystRatingsDataState2, savedStateHandle, currencyPairV2Store, instrumentRatingsStore);
    }

    /* compiled from: CryptoAnalystRatingsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "instrumentRatingsStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/InstrumentRatingsStore;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoAnalystRatingsDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoAnalystRatingsDataState2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<CurrencyPairV2Store> currencyPairStore, Provider<InstrumentRatingsStore> instrumentRatingsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(instrumentRatingsStore, "instrumentRatingsStore");
            return new CryptoAnalystRatingsDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, currencyPairStore, instrumentRatingsStore);
        }

        @JvmStatic
        public final CryptoAnalystRatingsDuxo newInstance(DuxoBundle duxoBundle, CryptoAnalystRatingsDataState2 stateProvider, SavedStateHandle savedStateHandle, CurrencyPairV2Store currencyPairStore, InstrumentRatingsStore instrumentRatingsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(instrumentRatingsStore, "instrumentRatingsStore");
            return new CryptoAnalystRatingsDuxo(duxoBundle, stateProvider, savedStateHandle, currencyPairStore, instrumentRatingsStore);
        }
    }
}
