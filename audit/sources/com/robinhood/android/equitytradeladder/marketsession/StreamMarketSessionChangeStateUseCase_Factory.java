package com.robinhood.android.equitytradeladder.marketsession;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: StreamMarketSessionChangeStateUseCase_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "Ljavax/inject/Provider;", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class StreamMarketSessionChangeStateUseCase_Factory implements Factory<StreamMarketSessionChangeStateUseCase> {
    private final Provider<Clock> clock;
    private final Provider<TraderMarketHoursManager> marketHoursManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final StreamMarketSessionChangeStateUseCase_Factory create(Provider<Clock> provider, Provider<TraderMarketHoursManager> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final StreamMarketSessionChangeStateUseCase newInstance(Clock clock, TraderMarketHoursManager traderMarketHoursManager) {
        return INSTANCE.newInstance(clock, traderMarketHoursManager);
    }

    public StreamMarketSessionChangeStateUseCase_Factory(Provider<Clock> clock, Provider<TraderMarketHoursManager> marketHoursManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        this.clock = clock;
        this.marketHoursManager = marketHoursManager;
    }

    @Override // javax.inject.Provider
    public StreamMarketSessionChangeStateUseCase get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        return companion.newInstance(clock, traderMarketHoursManager);
    }

    /* compiled from: StreamMarketSessionChangeStateUseCase_Factory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase_Factory;", "Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StreamMarketSessionChangeStateUseCase_Factory create(Provider<Clock> clock, Provider<TraderMarketHoursManager> marketHoursManager) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            return new StreamMarketSessionChangeStateUseCase_Factory(clock, marketHoursManager);
        }

        @JvmStatic
        public final StreamMarketSessionChangeStateUseCase newInstance(Clock clock, TraderMarketHoursManager marketHoursManager) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            return new StreamMarketSessionChangeStateUseCase(clock, marketHoursManager);
        }
    }
}
