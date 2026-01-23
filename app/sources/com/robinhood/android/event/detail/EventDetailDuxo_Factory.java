package com.robinhood.android.event.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.event.detail.duel.StreamContractListUseCase;
import com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase;
import com.robinhood.android.eventcontracts.sharedeventui.trade.CheckTradabilityUseCase;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStateStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.futures.FuturesAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EventDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BÙ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/event/detail/EventDetailDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresChartsServiceManager", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "Lcom/robinhood/store/event/EventOrderStore;", "eventOrderStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "streamEventMarketSessionChangeState", "Lcom/robinhood/android/event/detail/duel/StreamLiveEventStateUseCase;", "streamLiveEventStateUseCase", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;", "contractListUseCase", "Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;", "checkTradabilityUseCase", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/event/detail/EventDetailDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventDetailDuxo_Factory implements Factory<EventDetailDuxo> {
    private final Provider<CheckTradabilityUseCase> checkTradabilityUseCase;
    private final Provider<Clock> clock;
    private final Provider<StreamContractListUseCase> contractListUseCase;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventContractPositionStore> eventContractPositionStore;
    private final Provider<EventMarketdataStore> eventMarketdataStore;
    private final Provider<EventOrderStore> eventOrderStore;
    private final Provider<EventStateStore> eventStateStore;
    private final Provider<EventStore> eventStore;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesChartsServiceManager> futuresChartsServiceManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<StreamEventMarketSessionChangeStateUseCase> streamEventMarketSessionChangeState;
    private final Provider<StreamLiveEventStateUseCase> streamLiveEventStateUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EventDetailDuxo_Factory create(Provider<FuturesChartsServiceManager> provider, Provider<EventStore> provider2, Provider<EventMarketdataStore> provider3, Provider<EventStateStore> provider4, Provider<EventOrderStore> provider5, Provider<FuturesAccountStore> provider6, Provider<EventContractPositionStore> provider7, Provider<StreamEventMarketSessionChangeStateUseCase> provider8, Provider<StreamLiveEventStateUseCase> provider9, Provider<ExperimentsProvider> provider10, Provider<Clock> provider11, Provider<StreamContractListUseCase> provider12, Provider<CheckTradabilityUseCase> provider13, Provider<SavedStateHandle> provider14, Provider<DuxoBundle> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final EventDetailDuxo newInstance(FuturesChartsServiceManager futuresChartsServiceManager, EventStore eventStore, EventMarketdataStore eventMarketdataStore, EventStateStore eventStateStore, EventOrderStore eventOrderStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeStateUseCase, StreamLiveEventStateUseCase streamLiveEventStateUseCase, ExperimentsProvider experimentsProvider, Clock clock, StreamContractListUseCase streamContractListUseCase, CheckTradabilityUseCase checkTradabilityUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(futuresChartsServiceManager, eventStore, eventMarketdataStore, eventStateStore, eventOrderStore, futuresAccountStore, eventContractPositionStore, streamEventMarketSessionChangeStateUseCase, streamLiveEventStateUseCase, experimentsProvider, clock, streamContractListUseCase, checkTradabilityUseCase, savedStateHandle, duxoBundle);
    }

    public EventDetailDuxo_Factory(Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventStateStore> eventStateStore, Provider<EventOrderStore> eventOrderStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<StreamEventMarketSessionChangeStateUseCase> streamEventMarketSessionChangeState, Provider<StreamLiveEventStateUseCase> streamLiveEventStateUseCase, Provider<ExperimentsProvider> experimentsProvider, Provider<Clock> clock, Provider<StreamContractListUseCase> contractListUseCase, Provider<CheckTradabilityUseCase> checkTradabilityUseCase, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(streamLiveEventStateUseCase, "streamLiveEventStateUseCase");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(contractListUseCase, "contractListUseCase");
        Intrinsics.checkNotNullParameter(checkTradabilityUseCase, "checkTradabilityUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.eventStore = eventStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventStateStore = eventStateStore;
        this.eventOrderStore = eventOrderStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.streamEventMarketSessionChangeState = streamEventMarketSessionChangeState;
        this.streamLiveEventStateUseCase = streamLiveEventStateUseCase;
        this.experimentsProvider = experimentsProvider;
        this.clock = clock;
        this.contractListUseCase = contractListUseCase;
        this.checkTradabilityUseCase = checkTradabilityUseCase;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public EventDetailDuxo get() {
        Companion companion = INSTANCE;
        FuturesChartsServiceManager futuresChartsServiceManager = this.futuresChartsServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresChartsServiceManager, "get(...)");
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        EventStateStore eventStateStore = this.eventStateStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStateStore, "get(...)");
        EventOrderStore eventOrderStore = this.eventOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        EventContractPositionStore eventContractPositionStore = this.eventContractPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(eventContractPositionStore, "get(...)");
        StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeStateUseCase = this.streamEventMarketSessionChangeState.get();
        Intrinsics.checkNotNullExpressionValue(streamEventMarketSessionChangeStateUseCase, "get(...)");
        StreamLiveEventStateUseCase streamLiveEventStateUseCase = this.streamLiveEventStateUseCase.get();
        Intrinsics.checkNotNullExpressionValue(streamLiveEventStateUseCase, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StreamContractListUseCase streamContractListUseCase = this.contractListUseCase.get();
        Intrinsics.checkNotNullExpressionValue(streamContractListUseCase, "get(...)");
        CheckTradabilityUseCase checkTradabilityUseCase = this.checkTradabilityUseCase.get();
        Intrinsics.checkNotNullExpressionValue(checkTradabilityUseCase, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(futuresChartsServiceManager, eventStore, eventMarketdataStore, eventStateStore, eventOrderStore, futuresAccountStore, eventContractPositionStore, streamEventMarketSessionChangeStateUseCase, streamLiveEventStateUseCase, experimentsProvider, clock, streamContractListUseCase, checkTradabilityUseCase, savedStateHandle2, duxoBundle);
    }

    /* compiled from: EventDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Já\u0001\u0010$\u001a\u00020#2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0004H\u0007¢\u0006\u0004\b$\u0010%J\u0087\u0001\u0010'\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresChartsServiceManager", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "Lcom/robinhood/store/event/EventOrderStore;", "eventOrderStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "streamEventMarketSessionChangeState", "Lcom/robinhood/android/event/detail/duel/StreamLiveEventStateUseCase;", "streamLiveEventStateUseCase", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;", "contractListUseCase", "Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;", "checkTradabilityUseCase", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/event/detail/EventDetailDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/event/detail/EventDetailDuxo_Factory;", "Lcom/robinhood/android/event/detail/EventDetailDuxo;", "newInstance", "(Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/event/EventStateStore;Lcom/robinhood/store/event/EventOrderStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;Lcom/robinhood/android/event/detail/duel/StreamLiveEventStateUseCase;Lcom/robinhood/experiments/ExperimentsProvider;Lj$/time/Clock;Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/event/detail/EventDetailDuxo;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventDetailDuxo_Factory create(Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventStateStore> eventStateStore, Provider<EventOrderStore> eventOrderStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<StreamEventMarketSessionChangeStateUseCase> streamEventMarketSessionChangeState, Provider<StreamLiveEventStateUseCase> streamLiveEventStateUseCase, Provider<ExperimentsProvider> experimentsProvider, Provider<Clock> clock, Provider<StreamContractListUseCase> contractListUseCase, Provider<CheckTradabilityUseCase> checkTradabilityUseCase, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(streamLiveEventStateUseCase, "streamLiveEventStateUseCase");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(contractListUseCase, "contractListUseCase");
            Intrinsics.checkNotNullParameter(checkTradabilityUseCase, "checkTradabilityUseCase");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EventDetailDuxo_Factory(futuresChartsServiceManager, eventStore, eventMarketdataStore, eventStateStore, eventOrderStore, futuresAccountStore, eventContractPositionStore, streamEventMarketSessionChangeState, streamLiveEventStateUseCase, experimentsProvider, clock, contractListUseCase, checkTradabilityUseCase, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final EventDetailDuxo newInstance(FuturesChartsServiceManager futuresChartsServiceManager, EventStore eventStore, EventMarketdataStore eventMarketdataStore, EventStateStore eventStateStore, EventOrderStore eventOrderStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState, StreamLiveEventStateUseCase streamLiveEventStateUseCase, ExperimentsProvider experimentsProvider, Clock clock, StreamContractListUseCase contractListUseCase, CheckTradabilityUseCase checkTradabilityUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(streamLiveEventStateUseCase, "streamLiveEventStateUseCase");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(contractListUseCase, "contractListUseCase");
            Intrinsics.checkNotNullParameter(checkTradabilityUseCase, "checkTradabilityUseCase");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EventDetailDuxo(futuresChartsServiceManager, eventStore, eventMarketdataStore, eventStateStore, eventOrderStore, futuresAccountStore, eventContractPositionStore, streamEventMarketSessionChangeState, streamLiveEventStateUseCase, experimentsProvider, clock, contractListUseCase, checkTradabilityUseCase, savedStateHandle, duxoBundle);
        }
    }
}
