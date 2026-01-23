package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxManager;
import com.robinhood.android.futures.trade.order.FuturesOrderManager;
import com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCase;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.FuturesSettingsStore;
import com.robinhood.store.futures.PostTradeLadderFtuxState;
import com.robinhood.store.futures.RhdCostBasisStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.websocket.p410dx.DxWebsocketSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesLadderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u008e\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\u0017\u0010\u001c\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004¢\u0006\u0004\b*\u0010+J\b\u0010,\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo;", "dxWebsocketSource", "Ljavax/inject/Provider;", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresOrderManager", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresSettingsStore", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "ladderFtuxManager", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "streamMarketSessionChangeState", "Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesLadderDuxo_Factory implements Factory<FuturesLadderDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<DxWebsocketSource> dxWebsocketSource;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<FuturesMarketDataStore> futuresMarketDataStore;
    private final Provider<FuturesOrderManager> futuresOrderManager;
    private final Provider<FuturesOrderStore> futuresOrderStore;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<FuturesSettingsStore> futuresSettingsStore;
    private final Provider<FuturesTradingHoursStore> futuresTradingHoursStore;
    private final Provider<LadderFtuxManager> ladderFtuxManager;
    private final Provider<EnumPreference<PostTradeLadderFtuxState>> postTradeLadderFtuxStatePref;
    private final Provider<RhdCostBasisStore> rhdCostBasisStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<FuturesLadderStateProvider> stateProvider;
    private final Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesLadderDuxo_Factory create(Provider<DxWebsocketSource> provider, Provider<ExperimentsStore> provider2, Provider<FuturesAccountStore> provider3, Provider<FuturesContractStore> provider4, Provider<FuturesMarketDataStore> provider5, Provider<FuturesOrderManager> provider6, Provider<FuturesOrderStore> provider7, Provider<FuturesQuoteStore> provider8, Provider<FuturesSettingsStore> provider9, Provider<FuturesTradingHoursStore> provider10, Provider<RhdCostBasisStore> provider11, Provider<LadderFtuxManager> provider12, Provider<EnumPreference<PostTradeLadderFtuxState>> provider13, Provider<SavedStateHandle> provider14, Provider<EventLogger> provider15, Provider<StreamMarketSessionChangeStateUseCase> provider16, Provider<DuxoBundle> provider17, Provider<FuturesLadderStateProvider> provider18) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    @JvmStatic
    public static final FuturesLadderDuxo newInstance(DxWebsocketSource dxWebsocketSource, ExperimentsStore experimentsStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesMarketDataStore futuresMarketDataStore, FuturesOrderManager futuresOrderManager, FuturesOrderStore futuresOrderStore, FuturesQuoteStore futuresQuoteStore, FuturesSettingsStore futuresSettingsStore, FuturesTradingHoursStore futuresTradingHoursStore, RhdCostBasisStore rhdCostBasisStore, LadderFtuxManager ladderFtuxManager, EnumPreference<PostTradeLadderFtuxState> enumPreference, SavedStateHandle savedStateHandle, EventLogger eventLogger, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, DuxoBundle duxoBundle, FuturesLadderStateProvider futuresLadderStateProvider) {
        return INSTANCE.newInstance(dxWebsocketSource, experimentsStore, futuresAccountStore, futuresContractStore, futuresMarketDataStore, futuresOrderManager, futuresOrderStore, futuresQuoteStore, futuresSettingsStore, futuresTradingHoursStore, rhdCostBasisStore, ladderFtuxManager, enumPreference, savedStateHandle, eventLogger, streamMarketSessionChangeStateUseCase, duxoBundle, futuresLadderStateProvider);
    }

    public FuturesLadderDuxo_Factory(Provider<DxWebsocketSource> dxWebsocketSource, Provider<ExperimentsStore> experimentsStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<FuturesOrderManager> futuresOrderManager, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesSettingsStore> futuresSettingsStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<LadderFtuxManager> ladderFtuxManager, Provider<EnumPreference<PostTradeLadderFtuxState>> postTradeLadderFtuxStatePref, Provider<SavedStateHandle> savedStateHandle, Provider<EventLogger> eventLogger, Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeState, Provider<DuxoBundle> duxoBundle, Provider<FuturesLadderStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
        Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
        Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.dxWebsocketSource = dxWebsocketSource;
        this.experimentsStore = experimentsStore;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.futuresOrderManager = futuresOrderManager;
        this.futuresOrderStore = futuresOrderStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresSettingsStore = futuresSettingsStore;
        this.futuresTradingHoursStore = futuresTradingHoursStore;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.ladderFtuxManager = ladderFtuxManager;
        this.postTradeLadderFtuxStatePref = postTradeLadderFtuxStatePref;
        this.savedStateHandle = savedStateHandle;
        this.eventLogger = eventLogger;
        this.streamMarketSessionChangeState = streamMarketSessionChangeState;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public FuturesLadderDuxo get() {
        Companion companion = INSTANCE;
        DxWebsocketSource dxWebsocketSource = this.dxWebsocketSource.get();
        Intrinsics.checkNotNullExpressionValue(dxWebsocketSource, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        FuturesMarketDataStore futuresMarketDataStore = this.futuresMarketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketDataStore, "get(...)");
        FuturesOrderManager futuresOrderManager = this.futuresOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderManager, "get(...)");
        FuturesOrderStore futuresOrderStore = this.futuresOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderStore, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        FuturesSettingsStore futuresSettingsStore = this.futuresSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresSettingsStore, "get(...)");
        FuturesTradingHoursStore futuresTradingHoursStore = this.futuresTradingHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresTradingHoursStore, "get(...)");
        RhdCostBasisStore rhdCostBasisStore = this.rhdCostBasisStore.get();
        Intrinsics.checkNotNullExpressionValue(rhdCostBasisStore, "get(...)");
        LadderFtuxManager ladderFtuxManager = this.ladderFtuxManager.get();
        Intrinsics.checkNotNullExpressionValue(ladderFtuxManager, "get(...)");
        EnumPreference<PostTradeLadderFtuxState> enumPreference = this.postTradeLadderFtuxStatePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        EventLogger eventLogger2 = eventLogger;
        StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase = this.streamMarketSessionChangeState.get();
        Intrinsics.checkNotNullExpressionValue(streamMarketSessionChangeStateUseCase, "get(...)");
        StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase2 = streamMarketSessionChangeStateUseCase;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        FuturesLadderStateProvider futuresLadderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(futuresLadderStateProvider, "get(...)");
        return companion.newInstance(dxWebsocketSource, experimentsStore, futuresAccountStore, futuresContractStore, futuresMarketDataStore, futuresOrderManager, futuresOrderStore, futuresQuoteStore, futuresSettingsStore, futuresTradingHoursStore, rhdCostBasisStore, ladderFtuxManager, enumPreference, savedStateHandle2, eventLogger2, streamMarketSessionChangeStateUseCase2, duxoBundle2, futuresLadderStateProvider);
    }

    /* compiled from: FuturesLadderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008f\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u0017\u0010\u001f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\b\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0007H\u0007J£\u0001\u0010-\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\b\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo_Factory;", "dxWebsocketSource", "Ljavax/inject/Provider;", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresOrderManager", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresSettingsStore", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "ladderFtuxManager", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "streamMarketSessionChangeState", "Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderStateProvider;", "newInstance", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesLadderDuxo_Factory create(Provider<DxWebsocketSource> dxWebsocketSource, Provider<ExperimentsStore> experimentsStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<FuturesOrderManager> futuresOrderManager, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesSettingsStore> futuresSettingsStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<LadderFtuxManager> ladderFtuxManager, Provider<EnumPreference<PostTradeLadderFtuxState>> postTradeLadderFtuxStatePref, Provider<SavedStateHandle> savedStateHandle, Provider<EventLogger> eventLogger, Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeState, Provider<DuxoBundle> duxoBundle, Provider<FuturesLadderStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
            Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new FuturesLadderDuxo_Factory(dxWebsocketSource, experimentsStore, futuresAccountStore, futuresContractStore, futuresMarketDataStore, futuresOrderManager, futuresOrderStore, futuresQuoteStore, futuresSettingsStore, futuresTradingHoursStore, rhdCostBasisStore, ladderFtuxManager, postTradeLadderFtuxStatePref, savedStateHandle, eventLogger, streamMarketSessionChangeState, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final FuturesLadderDuxo newInstance(DxWebsocketSource dxWebsocketSource, ExperimentsStore experimentsStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesMarketDataStore futuresMarketDataStore, FuturesOrderManager futuresOrderManager, FuturesOrderStore futuresOrderStore, FuturesQuoteStore futuresQuoteStore, FuturesSettingsStore futuresSettingsStore, FuturesTradingHoursStore futuresTradingHoursStore, RhdCostBasisStore rhdCostBasisStore, LadderFtuxManager ladderFtuxManager, EnumPreference<PostTradeLadderFtuxState> postTradeLadderFtuxStatePref, SavedStateHandle savedStateHandle, EventLogger eventLogger, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeState, DuxoBundle duxoBundle, FuturesLadderStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
            Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new FuturesLadderDuxo(dxWebsocketSource, experimentsStore, futuresAccountStore, futuresContractStore, futuresMarketDataStore, futuresOrderManager, futuresOrderStore, futuresQuoteStore, futuresSettingsStore, futuresTradingHoursStore, rhdCostBasisStore, ladderFtuxManager, postTradeLadderFtuxStatePref, savedStateHandle, eventLogger, streamMarketSessionChangeState, duxoBundle, stateProvider);
        }
    }
}
