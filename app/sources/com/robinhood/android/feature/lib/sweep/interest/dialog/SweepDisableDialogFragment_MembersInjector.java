package com.robinhood.android.feature.lib.sweep.interest.dialog;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.time.annotation.ElapsedRealtime;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: SweepDisableDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "singletons", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepEnrollmentStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "instance", "", "injectMembers", "(Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;)V", "Ljavax/inject/Provider;", "Companion", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SweepDisableDialogFragment_MembersInjector implements MembersInjector<SweepDisableDialogFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BaseDialogSingletons> singletons;
    private final Provider<SweepEnrollmentStore> sweepEnrollmentStore;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final MembersInjector<SweepDisableDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<UserStore> provider2, Provider<SweepEnrollmentStore> provider3, Provider<EventLogger> provider4, Provider<Clock> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    @ElapsedRealtime
    public static final void injectClock(SweepDisableDialogFragment sweepDisableDialogFragment, Clock clock) {
        INSTANCE.injectClock(sweepDisableDialogFragment, clock);
    }

    @JvmStatic
    public static final void injectEventLogger(SweepDisableDialogFragment sweepDisableDialogFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(sweepDisableDialogFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectSweepEnrollmentStore(SweepDisableDialogFragment sweepDisableDialogFragment, SweepEnrollmentStore sweepEnrollmentStore) {
        INSTANCE.injectSweepEnrollmentStore(sweepDisableDialogFragment, sweepEnrollmentStore);
    }

    @JvmStatic
    public static final void injectUserStore(SweepDisableDialogFragment sweepDisableDialogFragment, UserStore userStore) {
        INSTANCE.injectUserStore(sweepDisableDialogFragment, userStore);
    }

    public SweepDisableDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<UserStore> userStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<EventLogger> eventLogger, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.singletons = singletons;
        this.userStore = userStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.eventLogger = eventLogger;
        this.clock = clock;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SweepDisableDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        Companion companion2 = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        companion2.injectUserStore(instance, userStore);
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepEnrollmentStore, "get(...)");
        companion2.injectSweepEnrollmentStore(instance, sweepEnrollmentStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        companion2.injectClock(instance, clock);
    }

    /* compiled from: SweepDisableDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "singletons", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepEnrollmentStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Ldagger/MembersInjector;", "Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;", "instance", "", "injectUserStore", "(Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;Lcom/robinhood/shared/store/user/UserStore;)V", "injectSweepEnrollmentStore", "(Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;)V", "injectEventLogger", "(Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;Lcom/robinhood/analytics/EventLogger;)V", "injectClock", "(Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepDisableDialogFragment;Lj$/time/Clock;)V", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SweepDisableDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<UserStore> userStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<EventLogger> eventLogger, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new SweepDisableDialogFragment_MembersInjector(singletons, userStore, sweepEnrollmentStore, eventLogger, clock);
        }

        @JvmStatic
        public final void injectUserStore(SweepDisableDialogFragment instance, UserStore userStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            instance.setUserStore(userStore);
        }

        @JvmStatic
        public final void injectSweepEnrollmentStore(SweepDisableDialogFragment instance, SweepEnrollmentStore sweepEnrollmentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            instance.setSweepEnrollmentStore(sweepEnrollmentStore);
        }

        @JvmStatic
        public final void injectEventLogger(SweepDisableDialogFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        @ElapsedRealtime
        public final void injectClock(SweepDisableDialogFragment instance, Clock clock) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(clock, "clock");
            instance.setClock(clock);
        }
    }
}
