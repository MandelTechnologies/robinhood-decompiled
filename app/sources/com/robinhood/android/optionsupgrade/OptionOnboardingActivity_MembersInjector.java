package com.robinhood.android.optionsupgrade;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.models.card.p311db.Card;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionOnboardingActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "singletons", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "suvWorkflowManager", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "instance", "", "injectMembers", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;)V", "Ljavax/inject/Provider;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionOnboardingActivity_MembersInjector implements MembersInjector<OptionOnboardingActivity> {
    private final Provider<Clock> clock;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionOnboardingActivity> create(Provider<BaseActivitySingletons> provider, Provider<EventLogger> provider2, Provider<SuvWorkflowManager> provider3, Provider<Clock> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectClock(OptionOnboardingActivity optionOnboardingActivity, Clock clock) {
        INSTANCE.injectClock(optionOnboardingActivity, clock);
    }

    @JvmStatic
    public static final void injectEventLogger(OptionOnboardingActivity optionOnboardingActivity, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(optionOnboardingActivity, eventLogger);
    }

    @JvmStatic
    public static final void injectSuvWorkflowManager(OptionOnboardingActivity optionOnboardingActivity, SuvWorkflowManager suvWorkflowManager) {
        INSTANCE.injectSuvWorkflowManager(optionOnboardingActivity, suvWorkflowManager);
    }

    public OptionOnboardingActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<EventLogger> eventLogger, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.singletons = singletons;
        this.eventLogger = eventLogger;
        this.suvWorkflowManager = suvWorkflowManager;
        this.clock = clock;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionOnboardingActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        companion2.injectSuvWorkflowManager(instance, suvWorkflowManager);
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        companion2.injectClock(instance, clock);
    }

    /* compiled from: OptionOnboardingActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity_MembersInjector$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "singletons", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "suvWorkflowManager", "j$/time/Clock", Card.Icon.CLOCK, "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;", "instance", "", "injectEventLogger", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;Lcom/robinhood/analytics/EventLogger;)V", "injectSuvWorkflowManager", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;)V", "injectClock", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingActivity;Lj$/time/Clock;)V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionOnboardingActivity> create(Provider<BaseActivitySingletons> singletons, Provider<EventLogger> eventLogger, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new OptionOnboardingActivity_MembersInjector(singletons, eventLogger, suvWorkflowManager, clock);
        }

        @JvmStatic
        public final void injectEventLogger(OptionOnboardingActivity instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectSuvWorkflowManager(OptionOnboardingActivity instance, SuvWorkflowManager suvWorkflowManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            instance.setSuvWorkflowManager(suvWorkflowManager);
        }

        @JvmStatic
        public final void injectClock(OptionOnboardingActivity instance, Clock clock) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(clock, "clock");
            instance.setClock(clock);
        }
    }
}
