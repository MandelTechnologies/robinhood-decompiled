package com.robinhood.shared.trade.crypto.p397ui.timeInForce;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoOrderTimeInForceDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "cryptoOrderMinuteFlowProvider", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderTimeInForceDuxo_Factory implements Factory<CryptoOrderTimeInForceDuxo> {
    private final Provider<Clock> clock;
    private final Provider<CryptoOrderMinuteFlowProvider> cryptoOrderMinuteFlowProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoEventLogger> eventLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoOrderTimeInForceStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderTimeInForceDuxo_Factory create(Provider<CryptoOrderTimeInForceStateProvider> provider, Provider<DuxoBundle> provider2, Provider<CryptoEventLogger> provider3, Provider<CryptoOrderMinuteFlowProvider> provider4, Provider<Clock> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoOrderTimeInForceDuxo newInstance(CryptoOrderTimeInForceStateProvider cryptoOrderTimeInForceStateProvider, DuxoBundle duxoBundle, CryptoEventLogger cryptoEventLogger, CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, Clock clock, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(cryptoOrderTimeInForceStateProvider, duxoBundle, cryptoEventLogger, cryptoOrderMinuteFlowProvider, clock, savedStateHandle);
    }

    public CryptoOrderTimeInForceDuxo_Factory(Provider<CryptoOrderTimeInForceStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<CryptoEventLogger> eventLogger, Provider<CryptoOrderMinuteFlowProvider> cryptoOrderMinuteFlowProvider, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.eventLogger = eventLogger;
        this.cryptoOrderMinuteFlowProvider = cryptoOrderMinuteFlowProvider;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoOrderTimeInForceDuxo get() {
        Companion companion = INSTANCE;
        CryptoOrderTimeInForceStateProvider cryptoOrderTimeInForceStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderTimeInForceStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoEventLogger cryptoEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(cryptoEventLogger, "get(...)");
        CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider = this.cryptoOrderMinuteFlowProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderMinuteFlowProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(cryptoOrderTimeInForceStateProvider, duxoBundle, cryptoEventLogger, cryptoOrderMinuteFlowProvider, clock, savedStateHandle);
    }

    /* compiled from: CryptoOrderTimeInForceDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "cryptoOrderMinuteFlowProvider", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo_Factory;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;", "newInstance", "(Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderTimeInForceDuxo_Factory create(Provider<CryptoOrderTimeInForceStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<CryptoEventLogger> eventLogger, Provider<CryptoOrderMinuteFlowProvider> cryptoOrderMinuteFlowProvider, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderTimeInForceDuxo_Factory(stateProvider, duxoBundle, eventLogger, cryptoOrderMinuteFlowProvider, clock, savedStateHandle);
        }

        @JvmStatic
        public final CryptoOrderTimeInForceDuxo newInstance(CryptoOrderTimeInForceStateProvider stateProvider, DuxoBundle duxoBundle, CryptoEventLogger eventLogger, CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, Clock clock, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderTimeInForceDuxo(stateProvider, duxoBundle, eventLogger, cryptoOrderMinuteFlowProvider, clock, savedStateHandle);
        }
    }
}
