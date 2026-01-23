package com.robinhood.android.event.gamedetail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.event.gamedetail.builders.BuildGameDetailTitle;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.ContractDetailsDisplayStore;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStateStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.event.StrikeContractStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.shareprefs.GameDetailPagePreferences;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: GameDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+Bõ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresChartsServiceManager", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventOrderStore;", "eventOrderStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "Lcom/robinhood/store/event/StrikeContractStore;", "strikeContractStore", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "contractDetailsDisplayStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "streamEventMarketSessionChangeState", "Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;", "gameDetailPagePreferences", "Lcom/robinhood/android/event/gamedetail/builders/StreamLiveDataTitleUseCase;", "streamLiveDateTitle", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "streamComboQuoteUseCase", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class GameDetailDuxo_Factory implements Factory<GameDetailDuxo> {
    private final Provider<Clock> clock;
    private final Provider<ContractDetailsDisplayStore> contractDetailsDisplayStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventContractPositionStore> eventContractPositionStore;
    private final Provider<EventMarketdataStore> eventMarketdataStore;
    private final Provider<EventOrderStore> eventOrderStore;
    private final Provider<EventStateStore> eventStateStore;
    private final Provider<EventStore> eventStore;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesChartsServiceManager> futuresChartsServiceManager;
    private final Provider<GameDetailPagePreferences> gameDetailPagePreferences;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<StreamComboQuoteUseCase> streamComboQuoteUseCase;
    private final Provider<StreamEventMarketSessionChangeStateUseCase> streamEventMarketSessionChangeState;
    private final Provider<BuildGameDetailTitle> streamLiveDateTitle;
    private final Provider<StrikeContractStore> strikeContractStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GameDetailDuxo_Factory create(Provider<FuturesChartsServiceManager> provider, Provider<EventStore> provider2, Provider<FuturesAccountStore> provider3, Provider<EventContractPositionStore> provider4, Provider<EventOrderStore> provider5, Provider<EventMarketdataStore> provider6, Provider<EventStateStore> provider7, Provider<StrikeContractStore> provider8, Provider<ContractDetailsDisplayStore> provider9, Provider<ExperimentsProvider> provider10, Provider<StreamEventMarketSessionChangeStateUseCase> provider11, Provider<GameDetailPagePreferences> provider12, Provider<BuildGameDetailTitle> provider13, Provider<StreamComboQuoteUseCase> provider14, Provider<Clock> provider15, Provider<SavedStateHandle> provider16, Provider<DuxoBundle> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final GameDetailDuxo newInstance(FuturesChartsServiceManager futuresChartsServiceManager, EventStore eventStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, EventOrderStore eventOrderStore, EventMarketdataStore eventMarketdataStore, EventStateStore eventStateStore, StrikeContractStore strikeContractStore, ContractDetailsDisplayStore contractDetailsDisplayStore, ExperimentsProvider experimentsProvider, StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeStateUseCase, GameDetailPagePreferences gameDetailPagePreferences, BuildGameDetailTitle buildGameDetailTitle, StreamComboQuoteUseCase streamComboQuoteUseCase, Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(futuresChartsServiceManager, eventStore, futuresAccountStore, eventContractPositionStore, eventOrderStore, eventMarketdataStore, eventStateStore, strikeContractStore, contractDetailsDisplayStore, experimentsProvider, streamEventMarketSessionChangeStateUseCase, gameDetailPagePreferences, buildGameDetailTitle, streamComboQuoteUseCase, clock, savedStateHandle, duxoBundle);
    }

    public GameDetailDuxo_Factory(Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<EventStore> eventStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<EventOrderStore> eventOrderStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventStateStore> eventStateStore, Provider<StrikeContractStore> strikeContractStore, Provider<ContractDetailsDisplayStore> contractDetailsDisplayStore, Provider<ExperimentsProvider> experimentsProvider, Provider<StreamEventMarketSessionChangeStateUseCase> streamEventMarketSessionChangeState, Provider<GameDetailPagePreferences> gameDetailPagePreferences, Provider<BuildGameDetailTitle> streamLiveDateTitle, Provider<StreamComboQuoteUseCase> streamComboQuoteUseCase, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        Intrinsics.checkNotNullParameter(strikeContractStore, "strikeContractStore");
        Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(gameDetailPagePreferences, "gameDetailPagePreferences");
        Intrinsics.checkNotNullParameter(streamLiveDateTitle, "streamLiveDateTitle");
        Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.eventStore = eventStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.eventOrderStore = eventOrderStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventStateStore = eventStateStore;
        this.strikeContractStore = strikeContractStore;
        this.contractDetailsDisplayStore = contractDetailsDisplayStore;
        this.experimentsProvider = experimentsProvider;
        this.streamEventMarketSessionChangeState = streamEventMarketSessionChangeState;
        this.gameDetailPagePreferences = gameDetailPagePreferences;
        this.streamLiveDateTitle = streamLiveDateTitle;
        this.streamComboQuoteUseCase = streamComboQuoteUseCase;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public GameDetailDuxo get() {
        Companion companion = INSTANCE;
        FuturesChartsServiceManager futuresChartsServiceManager = this.futuresChartsServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresChartsServiceManager, "get(...)");
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        EventContractPositionStore eventContractPositionStore = this.eventContractPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(eventContractPositionStore, "get(...)");
        EventOrderStore eventOrderStore = this.eventOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderStore, "get(...)");
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        EventStateStore eventStateStore = this.eventStateStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStateStore, "get(...)");
        StrikeContractStore strikeContractStore = this.strikeContractStore.get();
        Intrinsics.checkNotNullExpressionValue(strikeContractStore, "get(...)");
        ContractDetailsDisplayStore contractDetailsDisplayStore = this.contractDetailsDisplayStore.get();
        Intrinsics.checkNotNullExpressionValue(contractDetailsDisplayStore, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeStateUseCase = this.streamEventMarketSessionChangeState.get();
        Intrinsics.checkNotNullExpressionValue(streamEventMarketSessionChangeStateUseCase, "get(...)");
        GameDetailPagePreferences gameDetailPagePreferences = this.gameDetailPagePreferences.get();
        Intrinsics.checkNotNullExpressionValue(gameDetailPagePreferences, "get(...)");
        BuildGameDetailTitle buildGameDetailTitle = this.streamLiveDateTitle.get();
        Intrinsics.checkNotNullExpressionValue(buildGameDetailTitle, "get(...)");
        StreamComboQuoteUseCase streamComboQuoteUseCase = this.streamComboQuoteUseCase.get();
        Intrinsics.checkNotNullExpressionValue(streamComboQuoteUseCase, "get(...)");
        StreamComboQuoteUseCase streamComboQuoteUseCase2 = streamComboQuoteUseCase;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        Clock clock2 = clock;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(futuresChartsServiceManager, eventStore, futuresAccountStore, eventContractPositionStore, eventOrderStore, eventMarketdataStore, eventStateStore, strikeContractStore, contractDetailsDisplayStore, experimentsProvider, streamEventMarketSessionChangeStateUseCase, gameDetailPagePreferences, buildGameDetailTitle, streamComboQuoteUseCase2, clock2, savedStateHandle2, duxoBundle);
    }

    /* compiled from: GameDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jý\u0001\u0010(\u001a\u00020'2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u0097\u0001\u0010+\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresChartsServiceManager", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventOrderStore;", "eventOrderStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "Lcom/robinhood/store/event/StrikeContractStore;", "strikeContractStore", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "contractDetailsDisplayStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "streamEventMarketSessionChangeState", "Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;", "gameDetailPagePreferences", "Lcom/robinhood/android/event/gamedetail/builders/StreamLiveDataTitleUseCase;", "streamLiveDateTitle", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "streamComboQuoteUseCase", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/event/gamedetail/GameDetailDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/event/gamedetail/GameDetailDuxo_Factory;", "Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;", "newInstance", "(Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/store/event/EventOrderStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/event/EventStateStore;Lcom/robinhood/store/event/StrikeContractStore;Lcom/robinhood/store/event/ContractDetailsDisplayStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;Lcom/robinhood/android/event/gamedetail/builders/StreamLiveDataTitleUseCase;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GameDetailDuxo_Factory create(Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<EventStore> eventStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionStore> eventContractPositionStore, Provider<EventOrderStore> eventOrderStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<EventStateStore> eventStateStore, Provider<StrikeContractStore> strikeContractStore, Provider<ContractDetailsDisplayStore> contractDetailsDisplayStore, Provider<ExperimentsProvider> experimentsProvider, Provider<StreamEventMarketSessionChangeStateUseCase> streamEventMarketSessionChangeState, Provider<GameDetailPagePreferences> gameDetailPagePreferences, Provider<BuildGameDetailTitle> streamLiveDateTitle, Provider<StreamComboQuoteUseCase> streamComboQuoteUseCase, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
            Intrinsics.checkNotNullParameter(strikeContractStore, "strikeContractStore");
            Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(gameDetailPagePreferences, "gameDetailPagePreferences");
            Intrinsics.checkNotNullParameter(streamLiveDateTitle, "streamLiveDateTitle");
            Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GameDetailDuxo_Factory(futuresChartsServiceManager, eventStore, futuresAccountStore, eventContractPositionStore, eventOrderStore, eventMarketdataStore, eventStateStore, strikeContractStore, contractDetailsDisplayStore, experimentsProvider, streamEventMarketSessionChangeState, gameDetailPagePreferences, streamLiveDateTitle, streamComboQuoteUseCase, clock, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final GameDetailDuxo newInstance(FuturesChartsServiceManager futuresChartsServiceManager, EventStore eventStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, EventOrderStore eventOrderStore, EventMarketdataStore eventMarketdataStore, EventStateStore eventStateStore, StrikeContractStore strikeContractStore, ContractDetailsDisplayStore contractDetailsDisplayStore, ExperimentsProvider experimentsProvider, StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState, GameDetailPagePreferences gameDetailPagePreferences, BuildGameDetailTitle streamLiveDateTitle, StreamComboQuoteUseCase streamComboQuoteUseCase, Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
            Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
            Intrinsics.checkNotNullParameter(strikeContractStore, "strikeContractStore");
            Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(gameDetailPagePreferences, "gameDetailPagePreferences");
            Intrinsics.checkNotNullParameter(streamLiveDateTitle, "streamLiveDateTitle");
            Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GameDetailDuxo(futuresChartsServiceManager, eventStore, futuresAccountStore, eventContractPositionStore, eventOrderStore, eventMarketdataStore, eventStateStore, strikeContractStore, contractDetailsDisplayStore, experimentsProvider, streamEventMarketSessionChangeState, gameDetailPagePreferences, streamLiveDateTitle, streamComboQuoteUseCase, clock, savedStateHandle, duxoBundle);
        }
    }
}
