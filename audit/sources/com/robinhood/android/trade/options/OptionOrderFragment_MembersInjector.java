package com.robinhood.android.trade.options;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionOrderFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/OptionOrderFragment;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "singletons", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "instance", "", "injectMembers", "(Lcom/robinhood/android/trade/options/OptionOrderFragment;)V", "Ljavax/inject/Provider;", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionOrderFragment_MembersInjector implements MembersInjector<OptionOrderFragment> {
    private final Provider<Clock> clock;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<LazyMoshi> moshi;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionOrderFragment> create(Provider<BaseFragmentSingletons> provider, Provider<ExperimentsStore> provider2, Provider<Clock> provider3, Provider<EventLogger> provider4, Provider<LazyMoshi> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectClock(OptionOrderFragment optionOrderFragment, Clock clock) {
        INSTANCE.injectClock(optionOrderFragment, clock);
    }

    @JvmStatic
    public static final void injectEventLogger(OptionOrderFragment optionOrderFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(optionOrderFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(OptionOrderFragment optionOrderFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(optionOrderFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectMoshi(OptionOrderFragment optionOrderFragment, LazyMoshi lazyMoshi) {
        INSTANCE.injectMoshi(optionOrderFragment, lazyMoshi);
    }

    public OptionOrderFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<EventLogger> eventLogger, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.singletons = singletons;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
        this.eventLogger = eventLogger;
        this.moshi = moshi;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionOrderFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        companion2.injectClock(instance, clock);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        companion2.injectMoshi(instance, lazyMoshi);
    }

    /* compiled from: OptionOrderFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment_MembersInjector$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "singletons", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/OptionOrderFragment;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;", "instance", "", "injectExperimentsStore", "(Lcom/robinhood/android/trade/options/OptionOrderFragment;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "injectClock", "(Lcom/robinhood/android/trade/options/OptionOrderFragment;Lj$/time/Clock;)V", "injectEventLogger", "(Lcom/robinhood/android/trade/options/OptionOrderFragment;Lcom/robinhood/analytics/EventLogger;)V", "injectMoshi", "(Lcom/robinhood/android/trade/options/OptionOrderFragment;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionOrderFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<EventLogger> eventLogger, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new OptionOrderFragment_MembersInjector(singletons, experimentsStore, clock, eventLogger, moshi);
        }

        @JvmStatic
        public final void injectExperimentsStore(OptionOrderFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectClock(OptionOrderFragment instance, Clock clock) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(clock, "clock");
            instance.setClock(clock);
        }

        @JvmStatic
        public final void injectEventLogger(OptionOrderFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectMoshi(OptionOrderFragment instance, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            instance.setMoshi(moshi);
        }
    }
}
