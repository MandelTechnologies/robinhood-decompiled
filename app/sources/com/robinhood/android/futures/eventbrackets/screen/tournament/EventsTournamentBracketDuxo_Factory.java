package com.robinhood.android.futures.eventbrackets.screen.tournament;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventContractsPnlStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.event.EventTopicsStore;
import com.robinhood.store.futures.FuturesAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EventsTournamentBracketDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0093\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/store/event/EventTopicsStore;", "eventTopicsStore", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketDataStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractsPnlStore;", "eventContractsPnlStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventsTournamentBracketDuxo_Factory implements Factory<EventsTournamentBracketDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventContractPositionStore> eventContractPositionStore;
    private final Provider<EventContractsPnlStore> eventContractsPnlStore;
    private final Provider<EventMarketdataStore> eventMarketDataStore;
    private final Provider<EventStore> eventStore;
    private final Provider<EventTopicsStore> eventTopicsStore;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EventsTournamentBracketDuxo_Factory create(Provider<ExperimentsProvider> provider, Provider<EventTopicsStore> provider2, Provider<EventStore> provider3, Provider<EventMarketdataStore> provider4, Provider<FuturesAccountStore> provider5, Provider<EventContractPositionStore> provider6, Provider<EventContractsPnlStore> provider7, Provider<Clock> provider8, Provider<DuxoBundle> provider9, Provider<SavedStateHandle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final EventsTournamentBracketDuxo newInstance(ExperimentsProvider experimentsProvider, EventTopicsStore eventTopicsStore, EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, EventContractsPnlStore eventContractsPnlStore, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(experimentsProvider, eventTopicsStore, eventStore, eventMarketdataStore, futuresAccountStore, eventContractPositionStore, eventContractsPnlStore, clock, duxoBundle, savedStateHandle);
    }

    public EventsTournamentBracketDuxo_Factory(Provider<ExperimentsProvider> experimentsProvider, Provider<EventTopicsStore> eventTopicsStore, Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketDataStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<EventContractsPnlStore> eventContractsPnlStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(eventTopicsStore, "eventTopicsStore");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketDataStore, "eventMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(eventContractsPnlStore, "eventContractsPnlStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.experimentsProvider = experimentsProvider;
        this.eventTopicsStore = eventTopicsStore;
        this.eventStore = eventStore;
        this.eventMarketDataStore = eventMarketDataStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.eventContractsPnlStore = eventContractsPnlStore;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public EventsTournamentBracketDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        EventTopicsStore eventTopicsStore = this.eventTopicsStore.get();
        Intrinsics.checkNotNullExpressionValue(eventTopicsStore, "get(...)");
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        EventMarketdataStore eventMarketdataStore = this.eventMarketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        EventContractPositionStore eventContractPositionStore = this.eventContractPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(eventContractPositionStore, "get(...)");
        EventContractsPnlStore eventContractsPnlStore = this.eventContractsPnlStore.get();
        Intrinsics.checkNotNullExpressionValue(eventContractsPnlStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(experimentsProvider, eventTopicsStore, eventStore, eventMarketdataStore, futuresAccountStore, eventContractPositionStore, eventContractsPnlStore, clock, duxoBundle, savedStateHandle);
    }

    /* compiled from: EventsTournamentBracketDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009b\u0001\u0010\u001a\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/store/event/EventTopicsStore;", "eventTopicsStore", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketDataStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractsPnlStore;", "eventContractsPnlStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo_Factory;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;", "newInstance", "(Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/store/event/EventTopicsStore;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/store/event/EventContractsPnlStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventsTournamentBracketDuxo_Factory create(Provider<ExperimentsProvider> experimentsProvider, Provider<EventTopicsStore> eventTopicsStore, Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketDataStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<EventContractsPnlStore> eventContractsPnlStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(eventTopicsStore, "eventTopicsStore");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketDataStore, "eventMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(eventContractsPnlStore, "eventContractsPnlStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EventsTournamentBracketDuxo_Factory(experimentsProvider, eventTopicsStore, eventStore, eventMarketDataStore, futuresAccountStore, eventContractPositionStore, eventContractsPnlStore, clock, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final EventsTournamentBracketDuxo newInstance(ExperimentsProvider experimentsProvider, EventTopicsStore eventTopicsStore, EventStore eventStore, EventMarketdataStore eventMarketDataStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, EventContractsPnlStore eventContractsPnlStore, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(eventTopicsStore, "eventTopicsStore");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketDataStore, "eventMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(eventContractsPnlStore, "eventContractsPnlStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EventsTournamentBracketDuxo(experimentsProvider, eventTopicsStore, eventStore, eventMarketDataStore, futuresAccountStore, eventContractPositionStore, eventContractsPnlStore, clock, duxoBundle, savedStateHandle);
        }
    }
}
