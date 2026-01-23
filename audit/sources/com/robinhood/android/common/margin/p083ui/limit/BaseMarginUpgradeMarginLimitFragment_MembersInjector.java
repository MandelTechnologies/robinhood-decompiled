package com.robinhood.android.common.margin.p083ui.limit;

import com.robinhood.android.common.margin.p083ui.MarginUpgradeEventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.time.annotation.ElapsedRealtime;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: BaseMarginUpgradeMarginLimitFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "singletons", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "marginUpgradeEventLogger", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "instance", "", "injectMembers", "(Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;)V", "Ljavax/inject/Provider;", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BaseMarginUpgradeMarginLimitFragment_MembersInjector implements MembersInjector<BaseMarginUpgradeMarginLimitFragment> {
    private final Provider<Clock> clock;
    private final Provider<MarginUpgradeEventLogger> marginUpgradeEventLogger;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<BaseMarginUpgradeMarginLimitFragment> create(Provider<BaseFragmentSingletons> provider, Provider<MarginUpgradeEventLogger> provider2, Provider<Clock> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    @ElapsedRealtime
    public static final void injectClock(BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment, Clock clock) {
        INSTANCE.injectClock(baseMarginUpgradeMarginLimitFragment, clock);
    }

    @JvmStatic
    public static final void injectMarginUpgradeEventLogger(BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment, MarginUpgradeEventLogger marginUpgradeEventLogger) {
        INSTANCE.injectMarginUpgradeEventLogger(baseMarginUpgradeMarginLimitFragment, marginUpgradeEventLogger);
    }

    public BaseMarginUpgradeMarginLimitFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<MarginUpgradeEventLogger> marginUpgradeEventLogger, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "marginUpgradeEventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.singletons = singletons;
        this.marginUpgradeEventLogger = marginUpgradeEventLogger;
        this.clock = clock;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseMarginUpgradeMarginLimitFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        MarginUpgradeEventLogger marginUpgradeEventLogger = this.marginUpgradeEventLogger.get();
        Intrinsics.checkNotNullExpressionValue(marginUpgradeEventLogger, "get(...)");
        companion2.injectMarginUpgradeEventLogger(instance, marginUpgradeEventLogger);
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        companion2.injectClock(instance, clock);
    }

    /* compiled from: BaseMarginUpgradeMarginLimitFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment_MembersInjector$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "singletons", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "marginUpgradeEventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;", "instance", "", "injectMarginUpgradeEventLogger", "(Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;)V", "injectClock", "(Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;Lj$/time/Clock;)V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<BaseMarginUpgradeMarginLimitFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<MarginUpgradeEventLogger> marginUpgradeEventLogger, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "marginUpgradeEventLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new BaseMarginUpgradeMarginLimitFragment_MembersInjector(singletons, marginUpgradeEventLogger, clock);
        }

        @JvmStatic
        public final void injectMarginUpgradeEventLogger(BaseMarginUpgradeMarginLimitFragment instance, MarginUpgradeEventLogger marginUpgradeEventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "marginUpgradeEventLogger");
            instance.setMarginUpgradeEventLogger(marginUpgradeEventLogger);
        }

        @JvmStatic
        @ElapsedRealtime
        public final void injectClock(BaseMarginUpgradeMarginLimitFragment instance, Clock clock) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(clock, "clock");
            instance.setClock(clock);
        }
    }
}
