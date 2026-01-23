package com.robinhood.android.lib.sweep;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.GoldContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.time.annotation.ElapsedRealtime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: SweepOnboardingEventLogger.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/analytics/EventLogger;Lj$/time/Clock;)V", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "", "logTap", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "", "source", "logFlowAppear", "(Ljava/lang/String;)V", "", "isGold", "setGoldContext", "(Z)V", "logFlowDisappear", "()V", "logScreenAppear", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "logScreenDisappear", "Lcom/robinhood/analytics/EventLogger;", "Lj$/time/Clock;", "entryPointIdentifier", "Ljava/lang/String;", "Ljava/util/UUID;", "sessionId", "Ljava/util/UUID;", "Lcom/robinhood/rosetta/eventlogging/GoldContext;", "goldContext", "Lcom/robinhood/rosetta/eventlogging/GoldContext;", "j$/time/Instant", "flowAppearTime", "Lj$/time/Instant;", "screenAppearTime", "Lcom/robinhood/rosetta/eventlogging/Context;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "context", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SweepOnboardingEventLogger {
    public static final int $stable = 8;
    private final Clock clock;
    private String entryPointIdentifier;
    private final EventLogger eventLogger;
    private Instant flowAppearTime;
    private GoldContext goldContext;
    private Instant screenAppearTime;
    private final UUID sessionId;

    public SweepOnboardingEventLogger(EventLogger eventLogger, @ElapsedRealtime Clock clock) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.eventLogger = eventLogger;
        this.clock = clock;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.sessionId = uuidRandomUUID;
    }

    public final Context getContext() {
        String str = this.entryPointIdentifier;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String string2 = this.sessionId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.GOLD, 0, string2, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.goldContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1665, -1, -67108865, -1, -1, -1, 16383, null);
    }

    public final void logTap(Screen screen, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, action, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, getContext(), false, 40, null);
    }

    public final void logFlowAppear(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.entryPointIdentifier = source;
        this.flowAppearTime = Instant.now(this.clock);
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.SWEEP_ONBOARDING, null, null, null, 14, null), null, null, getContext(), 13, null);
    }

    public final void setGoldContext(boolean isGold) {
        GoldContext goldContext;
        if (isGold) {
            goldContext = new GoldContext(Boolean.TRUE, "", null, 4, null);
        } else {
            goldContext = new GoldContext(Boolean.FALSE, "", null, 4, null);
        }
        this.goldContext = goldContext;
    }

    public final void logFlowDisappear() {
        long millis;
        Instant instant = this.flowAppearTime;
        if (instant != null) {
            Instant instantNow = Instant.now(this.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instant, instantNow);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            millis = durationBetween.toMillis();
        } else {
            millis = 0;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, new Screen(Screen.Name.SWEEP_ONBOARDING, null, null, null, 14, null), null, null, Context.copy$default(getContext(), 0, 0, 0, null, null, null, null, null, (int) millis, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 13, null);
    }

    public final void logScreenAppear(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screenAppearTime = Instant.now(this.clock);
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, screen, null, null, getContext(), 13, null);
    }

    public final void logScreenDisappear(Screen screen) {
        long millis;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Instant instant = this.screenAppearTime;
        if (instant != null) {
            Instant instantNow = Instant.now(this.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instant, instantNow);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            millis = durationBetween.toMillis();
        } else {
            millis = 0;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, screen, null, null, Context.copy$default(getContext(), 0, 0, 0, null, null, null, null, null, (int) millis, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 13, null);
    }
}
