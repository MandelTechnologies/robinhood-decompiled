package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoCashInterestStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoHomeInterestDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;", "cryptoCashInterestStore", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "localizedDateTimeFormatter", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeInterestDuxo_Factory implements Factory<CryptoHomeInterestDuxo> {
    private final Provider<Clock> clock;
    private final Provider<CryptoCashInterestStore> cryptoCashInterestStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter;
    private final Provider<CryptoHomeInterestStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeInterestDuxo_Factory create(Provider<CryptoCashInterestStore> provider, Provider<LocalizedDateTimeFormatter> provider2, Provider<Clock> provider3, Provider<CryptoHomeInterestStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoHomeInterestDuxo newInstance(CryptoCashInterestStore cryptoCashInterestStore, LocalizedDateTimeFormatter localizedDateTimeFormatter, Clock clock, CryptoHomeInterestStateProvider cryptoHomeInterestStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(cryptoCashInterestStore, localizedDateTimeFormatter, clock, cryptoHomeInterestStateProvider, duxoBundle);
    }

    public CryptoHomeInterestDuxo_Factory(Provider<CryptoCashInterestStore> cryptoCashInterestStore, Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter, Provider<Clock> clock, Provider<CryptoHomeInterestStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(cryptoCashInterestStore, "cryptoCashInterestStore");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoCashInterestStore = cryptoCashInterestStore;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.clock = clock;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoHomeInterestDuxo get() {
        Companion companion = INSTANCE;
        CryptoCashInterestStore cryptoCashInterestStore = this.cryptoCashInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCashInterestStore, "get(...)");
        LocalizedDateTimeFormatter localizedDateTimeFormatter = this.localizedDateTimeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(localizedDateTimeFormatter, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CryptoHomeInterestStateProvider cryptoHomeInterestStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeInterestStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(cryptoCashInterestStore, localizedDateTimeFormatter, clock, cryptoHomeInterestStateProvider, duxoBundle);
    }

    /* compiled from: CryptoHomeInterestDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;", "cryptoCashInterestStore", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "localizedDateTimeFormatter", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo_Factory;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lj$/time/Clock;Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeInterestDuxo_Factory create(Provider<CryptoCashInterestStore> cryptoCashInterestStore, Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter, Provider<Clock> clock, Provider<CryptoHomeInterestStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoCashInterestStore, "cryptoCashInterestStore");
            Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeInterestDuxo_Factory(cryptoCashInterestStore, localizedDateTimeFormatter, clock, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final CryptoHomeInterestDuxo newInstance(CryptoCashInterestStore cryptoCashInterestStore, LocalizedDateTimeFormatter localizedDateTimeFormatter, Clock clock, CryptoHomeInterestStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoCashInterestStore, "cryptoCashInterestStore");
            Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeInterestDuxo(cryptoCashInterestStore, localizedDateTimeFormatter, clock, stateProvider, duxoBundle);
        }
    }
}
