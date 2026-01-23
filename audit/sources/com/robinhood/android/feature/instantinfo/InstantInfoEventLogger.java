package com.robinhood.android.feature.instantinfo;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.api.bonfire.instantinfo.InstantInfoCtaType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: InstantInfoEventLogger.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/InstantInfoEventLogger;", "", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/analytics/EventLogger;Lj$/time/Clock;)V", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "Lcom/robinhood/models/api/bonfire/instantinfo/InstantInfoCtaType;", "ctaType", "", "isBack", "", "logTap", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/api/bonfire/instantinfo/InstantInfoCtaType;Z)V", "logScreenAppear", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;)V", "logScreenDisappear", "Lcom/robinhood/analytics/EventLogger;", "Lj$/time/Clock;", "j$/time/Instant", "appearTime", "Lj$/time/Instant;", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstantInfoEventLogger {
    public static final int $stable = 8;
    private Instant appearTime;
    private final Clock clock;
    private final EventLogger eventLogger;

    /* compiled from: InstantInfoEventLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstantInfoCtaType.values().length];
            try {
                iArr[InstantInfoCtaType.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstantInfoCtaType.NEXT_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstantInfoCtaType.DISMISS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstantInfoCtaType.GOLD_UPGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InstantInfoEventLogger(EventLogger eventLogger, @ElapsedRealtime Clock clock) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.eventLogger = eventLogger;
        this.clock = clock;
    }

    public static /* synthetic */ void logTap$default(InstantInfoEventLogger instantInfoEventLogger, Screen screen, Context context, InstantInfoCtaType instantInfoCtaType, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        instantInfoEventLogger.logTap(screen, context, instantInfoCtaType, z);
    }

    public final void logTap(Screen screen, Context context, InstantInfoCtaType ctaType, boolean isBack) {
        String strName;
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(context, "context");
        EventLogger eventLogger = this.eventLogger;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        if (ctaType == null || (strName = ctaType.name()) == null) {
            strName = isBack ? TestTags.BACK : "";
        }
        Component component = new Component(componentType, strName, null, 4, null);
        int i = ctaType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[ctaType.ordinal()];
        if (i == 1) {
            action = UserInteractionEventData.Action.CONTACT_SUPPORT;
        } else if (i == 2) {
            action = UserInteractionEventData.Action.CONTINUE;
        } else if (i == 3) {
            action = UserInteractionEventData.Action.DISMISS;
        } else if (i == 4) {
            action = UserInteractionEventData.Action.VIEW_GOLD_UPGRADE;
        } else if (isBack) {
            action = UserInteractionEventData.Action.BACK;
        } else {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, context, false, 40, null);
    }

    public final void logScreenAppear(Screen screen, Context context) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(context, "context");
        this.appearTime = Instant.now(this.clock);
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, screen, null, null, context, 13, null);
    }

    public final void logScreenDisappear(Screen screen, Context context) {
        long millis;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(context, "context");
        Instant instant = this.appearTime;
        if (instant != null) {
            Instant instantNow = Instant.now(this.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instant, instantNow);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            millis = durationBetween.toMillis();
        } else {
            millis = 0;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, screen, null, null, Context.copy$default(context, 0, 0, 0, null, null, null, null, null, (int) millis, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 13, null);
    }
}
