package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.ApiEquityTradingSessionChangedAlert;
import com.robinhood.models.api.ApiEquityTradingSessionChangedResponse;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: EquityTradingSessionChangedStore.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!¢\u0006\u0002\u0010%J:\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0'2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020*H\u0086@¢\u0006\u0004\b+\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiEquityTradingSessionChangedResponse;", "sharedAlert", "Lkotlinx/coroutines/flow/SharedFlow;", "tradingSessionChangedAlerts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "configurationDelegate", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "", "(Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "determineCurrentSessionConfiguration", "Lkotlin/Result;", "currentConfiguration", "useAdvancedMarket", "", "determineCurrentSessionConfiguration-yxL6bBk", "(Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EquityTradingSessionChangedStore extends Store {
    private final Endpoint<Unit, ApiEquityTradingSessionChangedResponse> endpoint;
    private final ExperimentsStore experimentsStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final PositionStore positionStore;
    private final RegionGateProvider regionGateProvider;
    private final SharedFlow<ApiEquityTradingSessionChangedResponse> sharedAlert;
    private final TradeEquityBonfireApi tradeEquityBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityTradingSessionChangedStore(StoreBundle storeBundle, TradeEquityBonfireApi tradeEquityBonfireApi, TraderMarketHoursManager marketHoursManager, InstrumentStore instrumentStore, PositionStore positionStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.marketHoursManager = marketHoursManager;
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.regionGateProvider = regionGateProvider;
        this.experimentsStore = experimentsStore;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new EquityTradingSessionChangedStore$endpoint$1(this, null), getLogoutKillswitch(), new EquityTradingSessionChangedStore$endpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.sharedAlert = FlowKt.shareIn(FlowKt.m28818catch(ErrorHandling3.retryExponential$default(FlowKt.flow(new EquityTradingSessionChangedStore$sharedAlert$1(this, null)), 5, null, 2, null), new EquityTradingSessionChangedStore$sharedAlert$2(null)), getStoreScope(), SharingStarted.INSTANCE.WhileSubscribed(5000L, 5000L), 1);
    }

    public final Flow<GenericAlertContent<GenericAction>> tradingSessionChangedAlerts(UUID instrumentId, EquityOrderSide side, Function1<? super Continuation<? super DirectOrder>, ? extends Object> configurationDelegate) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(configurationDelegate, "configurationDelegate");
        return FlowKt.combineTransform(FlowKt.drop(this.marketHoursManager.getCurrentTradingSession(), 1), this.sharedAlert, new C338401(configurationDelegate, side, this, instrumentId, null));
    }

    /* compiled from: EquityTradingSessionChangedStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "newSession", "Lcom/robinhood/models/db/TradingSession;", "alert", "Lcom/robinhood/models/api/ApiEquityTradingSessionChangedResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$tradingSessionChangedAlerts$1", m3645f = "EquityTradingSessionChangedStore.kt", m3646l = {102, 107, 114, 123, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 131, 156}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$tradingSessionChangedAlerts$1 */
    static final class C338401 extends ContinuationImpl7 implements Function4<FlowCollector<? super GenericAlertContent<? extends GenericAction>>, TradingSession, ApiEquityTradingSessionChangedResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super DirectOrder>, Object> $configurationDelegate;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ EquityOrderSide $side;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ EquityTradingSessionChangedStore this$0;

        /* compiled from: EquityTradingSessionChangedStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$tradingSessionChangedAlerts$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[Order.Configuration.values().length];
                try {
                    iArr2[Order.Configuration.MARKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[Order.Configuration.LIMIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[Order.Configuration.STOP_LOSS.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C338401(Function1<? super Continuation<? super DirectOrder>, ? extends Object> function1, EquityOrderSide equityOrderSide, EquityTradingSessionChangedStore equityTradingSessionChangedStore, UUID uuid, Continuation<? super C338401> continuation) {
            super(4, continuation);
            this.$configurationDelegate = function1;
            this.$side = equityOrderSide;
            this.this$0 = equityTradingSessionChangedStore;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(FlowCollector<? super GenericAlertContent<? extends GenericAction>> flowCollector, TradingSession tradingSession, ApiEquityTradingSessionChangedResponse apiEquityTradingSessionChangedResponse, Continuation<? super Unit> continuation) {
            C338401 c338401 = new C338401(this.$configurationDelegate, this.$side, this.this$0, this.$instrumentId, continuation);
            c338401.L$0 = flowCollector;
            c338401.L$1 = tradingSession;
            c338401.L$2 = apiEquityTradingSessionChangedResponse;
            return c338401.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0216, code lost:
        
            if (r4.emit(r2, r19) == r8) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0191, code lost:
        
            if (r4.emit(r2, r19) == r8) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0195, code lost:
        
            r2 = r3;
            r3 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01ba, code lost:
        
            if (r4.emit(r2, r19) == r8) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01dc, code lost:
        
            if (r4.emit(r2, r19) == r8) goto L102;
         */
        /* JADX WARN: Removed duplicated region for block: B:105:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object objInvoke;
            TradingSession tradingSession;
            ApiEquityTradingSessionChangedResponse apiEquityTradingSessionChangedResponse;
            DirectOrder directOrder;
            FlowCollector flowCollector2;
            Object objFirst;
            FlowCollector flowCollector3;
            DirectOrder directOrder2;
            TradingSession tradingSession2;
            Object objM22646determineCurrentSessionConfigurationyxL6bBk$default;
            ApiEquityTradingSessionChangedResponse apiEquityTradingSessionChangedResponse2;
            FlowCollector flowCollector4;
            Ref.BooleanRef booleanRef;
            Object objM28550constructorimpl;
            ApiEquityTradingSessionChangedAlert block_overnight_short_order;
            ApiEquityTradingSessionChangedAlert switch_to_market_order;
            ApiEquityTradingSessionChangedAlert switch_to_preset_percent_limit_order;
            ApiEquityTradingSessionChangedAlert switch_to_short_limit_order;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    TradingSession tradingSession3 = (TradingSession) this.L$1;
                    ApiEquityTradingSessionChangedResponse apiEquityTradingSessionChangedResponse3 = (ApiEquityTradingSessionChangedResponse) this.L$2;
                    Function1<Continuation<? super DirectOrder>, Object> function1 = this.$configurationDelegate;
                    this.L$0 = flowCollector;
                    this.L$1 = tradingSession3;
                    this.L$2 = apiEquityTradingSessionChangedResponse3;
                    this.label = 1;
                    objInvoke = function1.invoke(this);
                    if (objInvoke != coroutine_suspended) {
                        tradingSession = tradingSession3;
                        apiEquityTradingSessionChangedResponse = apiEquityTradingSessionChangedResponse3;
                        directOrder = (DirectOrder) objInvoke;
                        if ((directOrder instanceof AdvancedOrder) || !((AdvancedOrder) directOrder).getTaxLots()) {
                            if (this.$side != EquityOrderSide.SELL_SHORT) {
                                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null);
                                this.L$0 = flowCollector;
                                this.L$1 = tradingSession;
                                this.L$2 = apiEquityTradingSessionChangedResponse;
                                this.L$3 = directOrder;
                                this.label = 2;
                                objFirst = FlowKt.first(flowStreamStateFlow$default, this);
                                if (objFirst != coroutine_suspended) {
                                    flowCollector3 = flowCollector;
                                    directOrder2 = directOrder;
                                    if (((Boolean) objFirst).booleanValue()) {
                                        flowCollector2 = flowCollector3;
                                        directOrder = directOrder2;
                                        ApiEquityTradingSessionChangedResponse apiEquityTradingSessionChangedResponse4 = apiEquityTradingSessionChangedResponse;
                                        tradingSession2 = tradingSession;
                                        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                                        EquityTradingSessionChangedStore equityTradingSessionChangedStore = this.this$0;
                                        UUID uuid = this.$instrumentId;
                                        EquityOrderSide equityOrderSide = this.$side;
                                        this.L$0 = flowCollector2;
                                        this.L$1 = tradingSession2;
                                        this.L$2 = apiEquityTradingSessionChangedResponse4;
                                        this.L$3 = directOrder;
                                        this.L$4 = booleanRef2;
                                        this.label = 3;
                                        objM22646determineCurrentSessionConfigurationyxL6bBk$default = EquityTradingSessionChangedStore.m22646determineCurrentSessionConfigurationyxL6bBk$default(equityTradingSessionChangedStore, uuid, equityOrderSide, directOrder, false, this, 8, null);
                                        if (objM22646determineCurrentSessionConfigurationyxL6bBk$default != coroutine_suspended) {
                                            apiEquityTradingSessionChangedResponse2 = apiEquityTradingSessionChangedResponse4;
                                            flowCollector4 = flowCollector2;
                                            booleanRef = booleanRef2;
                                            if (Result.m28556isSuccessimpl(objM22646determineCurrentSessionConfigurationyxL6bBk$default)) {
                                                objM28550constructorimpl = Result.m28550constructorimpl(objM22646determineCurrentSessionConfigurationyxL6bBk$default);
                                            } else {
                                                DirectOrder directOrder3 = (DirectOrder) objM22646determineCurrentSessionConfigurationyxL6bBk$default;
                                                objM28550constructorimpl = Result.m28550constructorimpl(directOrder3 != null ? directOrder3.getOrderConfiguration() : null);
                                            }
                                            EquityOrderSide equityOrderSide2 = this.$side;
                                            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                                                int i = WhenMappings.$EnumSwitchMapping$0[equityOrderSide2.ordinal()];
                                                if (i == 1) {
                                                    GenericAlertContent<GenericAction> mobile_alert = (apiEquityTradingSessionChangedResponse2 == null || (block_overnight_short_order = apiEquityTradingSessionChangedResponse2.getBlock_overnight_short_order()) == null) ? null : block_overnight_short_order.getMobile_alert();
                                                    this.L$0 = tradingSession2;
                                                    this.L$1 = directOrder;
                                                    this.L$2 = booleanRef;
                                                    this.L$3 = objM28550constructorimpl;
                                                    this.L$4 = null;
                                                    this.label = 7;
                                                    break;
                                                } else {
                                                    if (i != 2 && i != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    booleanRef.element = true;
                                                    if (booleanRef.element) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                Order.Configuration configuration = (Order.Configuration) objM28550constructorimpl;
                                                switch (configuration == null ? -1 : WhenMappings.$EnumSwitchMapping$1[configuration.ordinal()]) {
                                                    case -1:
                                                        if (booleanRef.element) {
                                                            CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("No alert specified for session change from " + directOrder.getOrderConfiguration() + " to " + Result.m28557toStringimpl(objM28550constructorimpl) + " in " + tradingSession2 + " for " + this.$side), true, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 0:
                                                    default:
                                                        throw new NoWhenBranchMatchedException();
                                                    case 1:
                                                        GenericAlertContent<GenericAction> mobile_alert2 = (apiEquityTradingSessionChangedResponse2 == null || (switch_to_market_order = apiEquityTradingSessionChangedResponse2.getSwitch_to_market_order()) == null) ? null : switch_to_market_order.getMobile_alert();
                                                        this.L$0 = tradingSession2;
                                                        this.L$1 = directOrder;
                                                        this.L$2 = booleanRef;
                                                        this.L$3 = objM28550constructorimpl;
                                                        this.L$4 = null;
                                                        this.label = 4;
                                                        break;
                                                    case 2:
                                                        GenericAlertContent<GenericAction> mobile_alert3 = (apiEquityTradingSessionChangedResponse2 == null || (switch_to_preset_percent_limit_order = apiEquityTradingSessionChangedResponse2.getSwitch_to_preset_percent_limit_order()) == null) ? null : switch_to_preset_percent_limit_order.getMobile_alert();
                                                        this.L$0 = tradingSession2;
                                                        this.L$1 = directOrder;
                                                        this.L$2 = booleanRef;
                                                        this.L$3 = objM28550constructorimpl;
                                                        this.L$4 = null;
                                                        this.label = 5;
                                                        break;
                                                    case 3:
                                                        int i2 = WhenMappings.$EnumSwitchMapping$0[equityOrderSide2.ordinal()];
                                                        if (i2 == 1) {
                                                            GenericAlertContent<GenericAction> mobile_alert4 = (apiEquityTradingSessionChangedResponse2 == null || (switch_to_short_limit_order = apiEquityTradingSessionChangedResponse2.getSwitch_to_short_limit_order()) == null) ? null : switch_to_short_limit_order.getMobile_alert();
                                                            this.L$0 = tradingSession2;
                                                            this.L$1 = directOrder;
                                                            this.L$2 = booleanRef;
                                                            this.L$3 = objM28550constructorimpl;
                                                            this.L$4 = null;
                                                            this.label = 6;
                                                            break;
                                                        } else {
                                                            if (i2 != 2 && i2 != 3) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            booleanRef.element = true;
                                                            if (booleanRef.element) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                        booleanRef.element = true;
                                                        if (booleanRef.element) {
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                            tradingSession2 = tradingSession;
                                            directOrder = directOrder;
                                            if (booleanRef.element) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else {
                                flowCollector2 = flowCollector;
                                ApiEquityTradingSessionChangedResponse apiEquityTradingSessionChangedResponse42 = apiEquityTradingSessionChangedResponse;
                                tradingSession2 = tradingSession;
                                Ref.BooleanRef booleanRef22 = new Ref.BooleanRef();
                                EquityTradingSessionChangedStore equityTradingSessionChangedStore2 = this.this$0;
                                UUID uuid2 = this.$instrumentId;
                                EquityOrderSide equityOrderSide3 = this.$side;
                                this.L$0 = flowCollector2;
                                this.L$1 = tradingSession2;
                                this.L$2 = apiEquityTradingSessionChangedResponse42;
                                this.L$3 = directOrder;
                                this.L$4 = booleanRef22;
                                this.label = 3;
                                objM22646determineCurrentSessionConfigurationyxL6bBk$default = EquityTradingSessionChangedStore.m22646determineCurrentSessionConfigurationyxL6bBk$default(equityTradingSessionChangedStore2, uuid2, equityOrderSide3, directOrder, false, this, 8, null);
                                if (objM22646determineCurrentSessionConfigurationyxL6bBk$default != coroutine_suspended) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                case 1:
                    ApiEquityTradingSessionChangedResponse apiEquityTradingSessionChangedResponse5 = (ApiEquityTradingSessionChangedResponse) this.L$2;
                    TradingSession tradingSession4 = (TradingSession) this.L$1;
                    FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    apiEquityTradingSessionChangedResponse = apiEquityTradingSessionChangedResponse5;
                    flowCollector = flowCollector5;
                    tradingSession = tradingSession4;
                    objInvoke = obj;
                    directOrder = (DirectOrder) objInvoke;
                    if (directOrder instanceof AdvancedOrder) {
                        break;
                    }
                    if (this.$side != EquityOrderSide.SELL_SHORT) {
                    }
                    break;
                case 2:
                    directOrder2 = (DirectOrder) this.L$3;
                    apiEquityTradingSessionChangedResponse = (ApiEquityTradingSessionChangedResponse) this.L$2;
                    tradingSession = (TradingSession) this.L$1;
                    flowCollector3 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objFirst = obj;
                    if (((Boolean) objFirst).booleanValue()) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) this.L$4;
                    DirectOrder directOrder4 = (DirectOrder) this.L$3;
                    apiEquityTradingSessionChangedResponse2 = (ApiEquityTradingSessionChangedResponse) this.L$2;
                    TradingSession tradingSession5 = (TradingSession) this.L$1;
                    flowCollector4 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objM22646determineCurrentSessionConfigurationyxL6bBk$default = ((Result) obj).getValue();
                    tradingSession2 = tradingSession5;
                    directOrder = directOrder4;
                    booleanRef = booleanRef3;
                    if (Result.m28556isSuccessimpl(objM22646determineCurrentSessionConfigurationyxL6bBk$default)) {
                    }
                    EquityOrderSide equityOrderSide22 = this.$side;
                    if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                    }
                    tradingSession2 = tradingSession;
                    directOrder = directOrder;
                    if (booleanRef.element) {
                    }
                    return Unit.INSTANCE;
                case 4:
                case 5:
                case 6:
                case 7:
                    objM28550constructorimpl = this.L$3;
                    booleanRef = (Ref.BooleanRef) this.L$2;
                    DirectOrder directOrder5 = (DirectOrder) this.L$1;
                    TradingSession tradingSession6 = (TradingSession) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    tradingSession2 = tradingSession6;
                    directOrder = directOrder5;
                    if (booleanRef.element) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: determineCurrentSessionConfiguration-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m22646determineCurrentSessionConfigurationyxL6bBk$default(EquityTradingSessionChangedStore equityTradingSessionChangedStore, UUID uuid, EquityOrderSide equityOrderSide, DirectOrder directOrder, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return equityTradingSessionChangedStore.m22647determineCurrentSessionConfigurationyxL6bBk(uuid, equityOrderSide, directOrder, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r3 != r5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: determineCurrentSessionConfiguration-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22647determineCurrentSessionConfigurationyxL6bBk(UUID uuid, EquityOrderSide equityOrderSide, DirectOrder directOrder, boolean z, Continuation<? super Result<? extends DirectOrder>> continuation) {
        C33833x77922ef0 c33833x77922ef0;
        EquityTradingSessionChangedStore equityTradingSessionChangedStore;
        UUID uuid2;
        boolean z2;
        Object obj;
        boolean z3;
        UUID uuid3;
        EquityTradingSessionChangedStore equityTradingSessionChangedStore2;
        EquityOrderSide equityOrderSide2 = equityOrderSide;
        DirectOrder directOrder2 = directOrder;
        if (continuation instanceof C33833x77922ef0) {
            c33833x77922ef0 = (C33833x77922ef0) continuation;
            int i = c33833x77922ef0.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33833x77922ef0.label = i - Integer.MIN_VALUE;
            } else {
                c33833x77922ef0 = new C33833x77922ef0(this, continuation);
            }
        }
        Object objCoroutineScope = c33833x77922ef0.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c33833x77922ef0.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCoroutineScope);
                Result.Companion companion = Result.INSTANCE;
                if (!(directOrder2 instanceof AdvancedOrder) || !((AdvancedOrder) directOrder2).getTaxLots()) {
                    if (equityOrderSide2 == EquityOrderSide.SELL_SHORT) {
                        Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null);
                        c33833x77922ef0.L$0 = uuid;
                        c33833x77922ef0.L$1 = equityOrderSide2;
                        c33833x77922ef0.L$2 = directOrder2;
                        c33833x77922ef0.L$3 = this;
                        c33833x77922ef0.Z$0 = z;
                        c33833x77922ef0.label = 1;
                        Object objFirst = FlowKt.first(flowStreamStateFlow$default, c33833x77922ef0);
                        if (objFirst == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objFirst;
                        z3 = z;
                        uuid3 = uuid;
                        equityTradingSessionChangedStore2 = this;
                    } else {
                        equityTradingSessionChangedStore = this;
                        uuid2 = uuid;
                        z2 = z;
                        C33834xdbc23b3e c33834xdbc23b3e = new C33834xdbc23b3e(equityOrderSide2, directOrder2, z2, equityTradingSessionChangedStore, uuid2, null);
                        c33833x77922ef0.L$0 = null;
                        c33833x77922ef0.L$1 = null;
                        c33833x77922ef0.L$2 = null;
                        c33833x77922ef0.L$3 = null;
                        c33833x77922ef0.label = 2;
                        objCoroutineScope = CoroutineScope2.coroutineScope(c33834xdbc23b3e, c33833x77922ef0);
                    }
                }
                return Result.m28550constructorimpl(null);
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCoroutineScope);
                return Result.m28550constructorimpl((DirectOrder) objCoroutineScope);
            }
            boolean z4 = c33833x77922ef0.Z$0;
            EquityTradingSessionChangedStore equityTradingSessionChangedStore3 = (EquityTradingSessionChangedStore) c33833x77922ef0.L$3;
            DirectOrder directOrder3 = (DirectOrder) c33833x77922ef0.L$2;
            EquityOrderSide equityOrderSide3 = (EquityOrderSide) c33833x77922ef0.L$1;
            uuid3 = (UUID) c33833x77922ef0.L$0;
            ResultKt.throwOnFailure(objCoroutineScope);
            z3 = z4;
            equityOrderSide2 = equityOrderSide3;
            obj = objCoroutineScope;
            equityTradingSessionChangedStore2 = equityTradingSessionChangedStore3;
            directOrder2 = directOrder3;
            if (((Boolean) obj).booleanValue()) {
                z2 = z3;
                equityTradingSessionChangedStore = equityTradingSessionChangedStore2;
                uuid2 = uuid3;
                C33834xdbc23b3e c33834xdbc23b3e2 = new C33834xdbc23b3e(equityOrderSide2, directOrder2, z2, equityTradingSessionChangedStore, uuid2, null);
                c33833x77922ef0.L$0 = null;
                c33833x77922ef0.L$1 = null;
                c33833x77922ef0.L$2 = null;
                c33833x77922ef0.L$3 = null;
                c33833x77922ef0.label = 2;
                objCoroutineScope = CoroutineScope2.coroutineScope(c33834xdbc23b3e2, c33833x77922ef0);
            }
            return Result.m28550constructorimpl(null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }
}
