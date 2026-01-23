package com.robinhood.shared.crypto.transfer.send.landing;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoTransferSendLandingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/prefs/LongPreference;", "higherLimitSheetShownTimestampPref", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendLandingDuxo_Factory implements Factory<CryptoTransferSendLandingDuxo> {
    private final Provider<AppType> appType;
    private final Provider<Clock> clock;
    private final Provider<CryptoTransfersStore> cryptoTransfersStore;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<LongPreference> higherLimitSheetShownTimestampPref;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoTransferSendLandingStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoTransferSendLandingDuxo_Factory create(Provider<AppType> provider, Provider<Clock> provider2, Provider<CryptoTransfersStore> provider3, Provider<CurrencyPairV2Store> provider4, Provider<LongPreference> provider5, Provider<SavedStateHandle> provider6, Provider<CryptoTransferSendLandingStateProvider> provider7, Provider<DuxoBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CryptoTransferSendLandingDuxo newInstance(AppType appType, Clock clock, CryptoTransfersStore cryptoTransfersStore, CurrencyPairV2Store currencyPairV2Store, LongPreference longPreference, SavedStateHandle savedStateHandle, CryptoTransferSendLandingStateProvider cryptoTransferSendLandingStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(appType, clock, cryptoTransfersStore, currencyPairV2Store, longPreference, savedStateHandle, cryptoTransferSendLandingStateProvider, duxoBundle);
    }

    public CryptoTransferSendLandingDuxo_Factory(Provider<AppType> appType, Provider<Clock> clock, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<LongPreference> higherLimitSheetShownTimestampPref, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoTransferSendLandingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(higherLimitSheetShownTimestampPref, "higherLimitSheetShownTimestampPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appType = appType;
        this.clock = clock;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.currencyPairStore = currencyPairStore;
        this.higherLimitSheetShownTimestampPref = higherLimitSheetShownTimestampPref;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoTransferSendLandingDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        LongPreference longPreference = this.higherLimitSheetShownTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CryptoTransferSendLandingStateProvider cryptoTransferSendLandingStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferSendLandingStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(appType, clock, cryptoTransfersStore, currencyPairV2Store, longPreference, savedStateHandle, cryptoTransferSendLandingStateProvider, duxoBundle);
    }

    /* compiled from: CryptoTransferSendLandingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0016\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/prefs/LongPreference;", "higherLimitSheetShownTimestampPref", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo_Factory;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;", "newInstance", "(Lcom/robinhood/shared/app/type/AppType;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/prefs/LongPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTransferSendLandingDuxo_Factory create(Provider<AppType> appType, Provider<Clock> clock, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<LongPreference> higherLimitSheetShownTimestampPref, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoTransferSendLandingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(higherLimitSheetShownTimestampPref, "higherLimitSheetShownTimestampPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoTransferSendLandingDuxo_Factory(appType, clock, cryptoTransfersStore, currencyPairStore, higherLimitSheetShownTimestampPref, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final CryptoTransferSendLandingDuxo newInstance(AppType appType, Clock clock, CryptoTransfersStore cryptoTransfersStore, CurrencyPairV2Store currencyPairStore, LongPreference higherLimitSheetShownTimestampPref, SavedStateHandle savedStateHandle, CryptoTransferSendLandingStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(higherLimitSheetShownTimestampPref, "higherLimitSheetShownTimestampPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoTransferSendLandingDuxo(appType, clock, cryptoTransfersStore, currencyPairStore, higherLimitSheetShownTimestampPref, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
