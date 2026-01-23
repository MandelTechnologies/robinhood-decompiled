package com.robinhood.android.crypto.tab.p093ui.pnl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoHomePnlEntryPointDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointStateProvider;", "stateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "pnlEntryPointSeenNewBadgePref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomePnlEntryPointDuxo_Factory implements Factory<CryptoHomePnlEntryPointDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> pnlEntryPointSeenNewBadgePref;
    private final Provider<CryptoHomePnlEntryPointStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomePnlEntryPointDuxo_Factory create(Provider<Clock> provider, Provider<DuxoBundle> provider2, Provider<CryptoHomePnlEntryPointStateProvider> provider3, Provider<BooleanPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoHomePnlEntryPointDuxo newInstance(Clock clock, DuxoBundle duxoBundle, CryptoHomePnlEntryPointStateProvider cryptoHomePnlEntryPointStateProvider, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(clock, duxoBundle, cryptoHomePnlEntryPointStateProvider, booleanPreference);
    }

    public CryptoHomePnlEntryPointDuxo_Factory(Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<CryptoHomePnlEntryPointStateProvider> stateProvider, Provider<BooleanPreference> pnlEntryPointSeenNewBadgePref) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(pnlEntryPointSeenNewBadgePref, "pnlEntryPointSeenNewBadgePref");
        this.clock = clock;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.pnlEntryPointSeenNewBadgePref = pnlEntryPointSeenNewBadgePref;
    }

    @Override // javax.inject.Provider
    public CryptoHomePnlEntryPointDuxo get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoHomePnlEntryPointStateProvider cryptoHomePnlEntryPointStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomePnlEntryPointStateProvider, "get(...)");
        BooleanPreference booleanPreference = this.pnlEntryPointSeenNewBadgePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(clock, duxoBundle, cryptoHomePnlEntryPointStateProvider, booleanPreference);
    }

    /* compiled from: CryptoHomePnlEntryPointDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointStateProvider;", "stateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "pnlEntryPointSeenNewBadgePref", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo_Factory;", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointStateProvider;Lcom/robinhood/prefs/BooleanPreference;)Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomePnlEntryPointDuxo_Factory create(Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<CryptoHomePnlEntryPointStateProvider> stateProvider, Provider<BooleanPreference> pnlEntryPointSeenNewBadgePref) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(pnlEntryPointSeenNewBadgePref, "pnlEntryPointSeenNewBadgePref");
            return new CryptoHomePnlEntryPointDuxo_Factory(clock, duxoBundle, stateProvider, pnlEntryPointSeenNewBadgePref);
        }

        @JvmStatic
        public final CryptoHomePnlEntryPointDuxo newInstance(Clock clock, DuxoBundle duxoBundle, CryptoHomePnlEntryPointStateProvider stateProvider, BooleanPreference pnlEntryPointSeenNewBadgePref) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(pnlEntryPointSeenNewBadgePref, "pnlEntryPointSeenNewBadgePref");
            return new CryptoHomePnlEntryPointDuxo(clock, duxoBundle, stateProvider, pnlEntryPointSeenNewBadgePref);
        }
    }
}
