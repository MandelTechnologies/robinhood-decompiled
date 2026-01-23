package com.robinhood.android.eventcontracts.trade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: StreamGtdTimeInForceUseCase_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "Ljavax/inject/Provider;", "Companion", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class StreamGtdTimeInForceUseCase_Factory implements Factory<StreamGtdTimeInForceUseCase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;

    @JvmStatic
    public static final StreamGtdTimeInForceUseCase_Factory create(Provider<Clock> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final StreamGtdTimeInForceUseCase newInstance(Clock clock) {
        return INSTANCE.newInstance(clock);
    }

    public StreamGtdTimeInForceUseCase_Factory(Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public StreamGtdTimeInForceUseCase get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(clock);
    }

    /* compiled from: StreamGtdTimeInForceUseCase_Factory.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;)Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase_Factory;", "Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "newInstance", "(Lj$/time/Clock;)Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StreamGtdTimeInForceUseCase_Factory create(Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new StreamGtdTimeInForceUseCase_Factory(clock);
        }

        @JvmStatic
        public final StreamGtdTimeInForceUseCase newInstance(Clock clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new StreamGtdTimeInForceUseCase(clock);
        }
    }
}
