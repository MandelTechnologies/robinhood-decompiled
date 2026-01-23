package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoFeeTierStatusDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierStore", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "feeTierNotificationProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "feeTierStatusLastTimeSeenMillisPref", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeTierStatusDuxo_Factory implements Factory<CryptoFeeTierStatusDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider;
    private final Provider<LongPreference> feeTierStatusLastTimeSeenMillisPref;
    private final Provider<CryptoFeeTierStore> feeTierStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoFeeTierStatusDuxo2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoFeeTierStatusDuxo_Factory create(Provider<CryptoFeeTierStore> provider, Provider<CryptoFeeTierNotificationStatusProvider> provider2, Provider<Clock> provider3, Provider<LongPreference> provider4, Provider<CryptoFeeTierStatusDuxo2> provider5, Provider<DuxoBundle> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoFeeTierStatusDuxo newInstance(CryptoFeeTierStore cryptoFeeTierStore, CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, Clock clock, LongPreference longPreference, CryptoFeeTierStatusDuxo2 cryptoFeeTierStatusDuxo2, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(cryptoFeeTierStore, cryptoFeeTierNotificationStatusProvider, clock, longPreference, cryptoFeeTierStatusDuxo2, duxoBundle, savedStateHandle);
    }

    public CryptoFeeTierStatusDuxo_Factory(Provider<CryptoFeeTierStore> feeTierStore, Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider, Provider<Clock> clock, Provider<LongPreference> feeTierStatusLastTimeSeenMillisPref, Provider<CryptoFeeTierStatusDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
        Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.feeTierStore = feeTierStore;
        this.feeTierNotificationProvider = feeTierNotificationProvider;
        this.clock = clock;
        this.feeTierStatusLastTimeSeenMillisPref = feeTierStatusLastTimeSeenMillisPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoFeeTierStatusDuxo get() {
        Companion companion = INSTANCE;
        CryptoFeeTierStore cryptoFeeTierStore = this.feeTierStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierStore, "get(...)");
        CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = this.feeTierNotificationProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierNotificationStatusProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        LongPreference longPreference = this.feeTierStatusLastTimeSeenMillisPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        CryptoFeeTierStatusDuxo2 cryptoFeeTierStatusDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierStatusDuxo2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(cryptoFeeTierStore, cryptoFeeTierNotificationStatusProvider, clock, longPreference, cryptoFeeTierStatusDuxo2, duxoBundle, savedStateHandle);
    }

    /* compiled from: CryptoFeeTierStatusDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierStore", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "feeTierNotificationProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "feeTierStatusLastTimeSeenMillisPref", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo_Factory;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoFeeTierStatusDuxo_Factory create(Provider<CryptoFeeTierStore> feeTierStore, Provider<CryptoFeeTierNotificationStatusProvider> feeTierNotificationProvider, Provider<Clock> clock, Provider<LongPreference> feeTierStatusLastTimeSeenMillisPref, Provider<CryptoFeeTierStatusDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
            Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoFeeTierStatusDuxo_Factory(feeTierStore, feeTierNotificationProvider, clock, feeTierStatusLastTimeSeenMillisPref, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final CryptoFeeTierStatusDuxo newInstance(CryptoFeeTierStore feeTierStore, CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider, Clock clock, LongPreference feeTierStatusLastTimeSeenMillisPref, CryptoFeeTierStatusDuxo2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
            Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoFeeTierStatusDuxo(feeTierStore, feeTierNotificationProvider, clock, feeTierStatusLastTimeSeenMillisPref, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
