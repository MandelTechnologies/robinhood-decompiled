package com.robinhood.android.common.p088ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.time.annotation.ElapsedRealtime;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: EventLoggedRhDialogFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001e\u001a\u00060\u0018j\u0002`\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/ui/EventLoggedRhDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "", "onStart", "onStop", "onPositiveButtonClick", "onNegativeButtonClick", "logDialogAnalytics", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "componentType$delegate", "Lkotlin/Lazy;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "componentType", "j$/time/Instant", "appearTime", "Lj$/time/Instant;", "Companion", "EventLoggedRhDialogBuilder", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EventLoggedRhDialogFragment extends RhDialogFragment {
    private static final String EXTRA_COMPONENT_TYPE = "EventLoggedRhDialogFragment:componentType";
    private Instant appearTime;

    @ElapsedRealtime
    public Clock clock;

    /* renamed from: componentType$delegate, reason: from kotlin metadata */
    private final Lazy componentType = Fragments2.argument(this, EXTRA_COMPONENT_TYPE);
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void logDialogAnalytics() {
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    private final Component.ComponentType getComponentType() {
        return (Component.ComponentType) this.componentType.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.appearTime = Instant.now();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, null, new Component(getComponentType(), null, null, 6, null), null, null, 27, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        long millis;
        Instant instant = this.appearTime;
        if (instant != null) {
            Instant instantNow = Instant.now(getClock());
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instant, instantNow);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            millis = durationBetween.toMillis();
        } else {
            millis = 0;
        }
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, null, new Component(getComponentType(), null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, (int) millis, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 11, null);
        super.onStop();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        super.onPositiveButtonClick();
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DONE, null, new Component(getComponentType(), null, null, 6, null), null, null, false, 58, null);
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        super.onNegativeButtonClick();
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, null, new Component(getComponentType(), null, null, 6, null), null, null, false, 58, null);
    }

    /* compiled from: EventLoggedRhDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/EventLoggedRhDialogFragment$EventLoggedRhDialogBuilder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setComponentType", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventLoggedRhDialogBuilder extends RhDialogFragment.Builder {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventLoggedRhDialogBuilder(android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public final EventLoggedRhDialogBuilder setComponentType(Component.ComponentType componentType) {
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            getDialogArgs().putSerializable(EventLoggedRhDialogFragment.EXTRA_COMPONENT_TYPE, componentType);
            return this;
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            return new EventLoggedRhDialogFragment();
        }
    }

    /* compiled from: EventLoggedRhDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/EventLoggedRhDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_COMPONENT_TYPE", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/ui/EventLoggedRhDialogFragment$EventLoggedRhDialogBuilder;", "context", "Landroid/content/Context;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EventLoggedRhDialogBuilder create(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new EventLoggedRhDialogBuilder(context);
        }
    }
}
