package com.robinhood.android.equities.equitytrade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.equities.equitytrade.OrderStatusAlert;
import com.robinhood.android.equities.equitytrade.OrderStatusEvent;
import com.robinhood.android.equities.equitytrade.OrderSubmitResult;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager2;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.GenericAlertDisplayType;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.SilentEquityOrderChecksAlert;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.utils.MoneyData;
import com.robinhood.models.util.Money;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import java.util.Collection;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: EquityTradeService.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b*\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\"\u0010#J1\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u0004\u0018\u00010,2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u00100J+\u00104\u001a\u0004\u0018\u00010,2\u0006\u0010%\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\b2\u00103J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020605¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\b\u0012\u0004\u0012\u00020905¢\u0006\u0004\b:\u00108J\u0018\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b=\u0010>J \u0010B\u001a\u00020<2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0018H\u0086@¢\u0006\u0004\bB\u0010CJ\"\u0010F\u001a\u00020<2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010A\u001a\u00020\u0018H\u0086@¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR(\u0010\\\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\\\u0010]\u0012\u0004\bb\u0010c\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010d\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010]\u0012\u0004\bg\u0010c\u001a\u0004\be\u0010_\"\u0004\bf\u0010aR,\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180h8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bi\u0010j\u0012\u0004\bm\u0010c\u001a\u0004\bk\u0010lR!\u0010r\u001a\b\u0012\u0004\u0012\u0002060n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010X\u001a\u0004\bp\u0010q¨\u0006s"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "dayTradeWarningsStore", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "equityOrderManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;Lcom/robinhood/android/equity/submission/EquityOrderManager;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lj$/time/Clock;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "", "orderSummary", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "createIntentKey", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Ljava/lang/String;)Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "Ljava/util/UUID;", "orderId", "accountNumber", "Lcom/robinhood/models/db/ClientComponentAlert;", "pdtWarningCheck", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/common/buysell/BuySellData;", "buySellData", "", "shorting", "Lcom/robinhood/models/db/OrderType;", "orderType", "Lcom/robinhood/models/db/OrderTrigger;", "orderTrigger", "Lcom/robinhood/utils/resource/StringResource;", "getSellCheckString", "(Lcom/robinhood/android/common/buysell/BuySellData;ZLcom/robinhood/models/db/OrderType;Lcom/robinhood/models/db/OrderTrigger;)Lcom/robinhood/utils/resource/StringResource;", "normalSellChecks$lib_equity_trade_externalDebug", "(Lcom/robinhood/android/common/buysell/BuySellData;)Lcom/robinhood/utils/resource/StringResource;", "normalSellChecks", "shortSellChecks$lib_equity_trade_externalDebug", "(Lcom/robinhood/android/common/buysell/BuySellData;Lcom/robinhood/models/db/OrderType;Lcom/robinhood/models/db/OrderTrigger;)Lcom/robinhood/utils/resource/StringResource;", "shortSellChecks", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;", "streamSubmittedOrderStatusEvents", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert;", "streamOrderStatusAlerts", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "validateAndSubmit", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "action", "equityOrderIntent", "handlerOrderCheckAction", "(Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "typedAction", "handlerDirectOrderCheckAction", "(Lcom/robinhood/models/serverdriven/db/GenericAction;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lj$/time/Clock;", "Lkotlin/text/Regex;", "dayTradeTitleSnackbarRegex", "Lkotlin/text/Regex;", "Lmicrogram/android/inject/MicrogramComponent;", "summaryComponent", "Lmicrogram/android/inject/MicrogramComponent;", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "summaryService$delegate", "Lkotlin/Lazy;", "getSummaryService", "()Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "summaryService", "marketBuysEnabled", "Z", "getMarketBuysEnabled", "()Z", "setMarketBuysEnabled", "(Z)V", "getMarketBuysEnabled$annotations", "()V", "subzeroEnabled", "getSubzeroEnabled", "setSubzeroEnabled", "getSubzeroEnabled$annotations", "", "submittedOrderRefIds", "Ljava/util/Map;", "getSubmittedOrderRefIds", "()Ljava/util/Map;", "getSubmittedOrderRefIds$annotations", "Lkotlinx/coroutines/flow/SharedFlow;", "submittedEvents$delegate", "getSubmittedEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "submittedEvents", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityTradeService extends Store {
    private final Clock clock;
    private final Regex dayTradeTitleSnackbarRegex;
    private final DayTradeWarningsStore dayTradeWarningsStore;
    private final EquityOrderCheckValidator equityOrderCheckValidator;
    private final EquityOrderManager equityOrderManager;
    private final ExperimentsStore experimentsStore;
    private boolean marketBuysEnabled;
    private final TraderMarketHoursManager marketHoursManager;
    private final OrderStore orderStore;
    private final RegionGateProvider regionGateProvider;

    /* renamed from: submittedEvents$delegate, reason: from kotlin metadata */
    private final Lazy submittedEvents;
    private final Map<UUID, EquityOrderIntent> submittedOrderRefIds;
    private boolean subzeroEnabled;
    private final MicrogramComponent summaryComponent;

    /* renamed from: summaryService$delegate, reason: from kotlin metadata */
    private final Lazy summaryService;

    /* compiled from: EquityTradeService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService", m3645f = "EquityTradeService.kt", m3646l = {391, 397, HttpStatusCode.FORBIDDEN, 412}, m3647m = "handlerDirectOrderCheckAction")
    /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$handlerDirectOrderCheckAction$1 */
    static final class C146941 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C146941(Continuation<? super C146941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityTradeService.this.handlerDirectOrderCheckAction(null, null, this);
        }
    }

    /* compiled from: EquityTradeService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService", m3645f = "EquityTradeService.kt", m3646l = {483, 487}, m3647m = "pdtWarningCheck")
    /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$pdtWarningCheck$1 */
    static final class C146951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C146951(Continuation<? super C146951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityTradeService.this.pdtWarningCheck(null, null, this);
        }
    }

    /* compiled from: EquityTradeService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService", m3645f = "EquityTradeService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "validateAndSubmit")
    /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$validateAndSubmit$1 */
    static final class C146961 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C146961(Continuation<? super C146961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityTradeService.this.validateAndSubmit(null, this);
        }
    }

    public static /* synthetic */ void getMarketBuysEnabled$annotations() {
    }

    public static /* synthetic */ void getSubmittedOrderRefIds$annotations() {
    }

    public static /* synthetic */ void getSubzeroEnabled$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityTradeService(DayTradeWarningsStore dayTradeWarningsStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityOrderManager equityOrderManager, TraderMarketHoursManager marketHoursManager, OrderStore orderStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, Clock clock, MicrogramComponent.Factory microgramComponentFactory, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "dayTradeWarningsStore");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dayTradeWarningsStore = dayTradeWarningsStore;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.equityOrderManager = equityOrderManager;
        this.marketHoursManager = marketHoursManager;
        this.orderStore = orderStore;
        this.regionGateProvider = regionGateProvider;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
        this.dayTradeTitleSnackbarRegex = new Regex("Day trade \\d of 4");
        this.summaryComponent = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, getStoreScope(), new RemoteMicrogramApplication("app-equity-order-summary", null, 2, null), null, 4, null);
        this.summaryService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityTradeService.summaryService_delegate$lambda$0(this.f$0);
            }
        });
        this.submittedOrderRefIds = new LinkedHashMap();
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C146921(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C146932(null), 3, null);
        this.submittedEvents = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityTradeService.submittedEvents_delegate$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderSummaryService getSummaryService() {
        return (EquityOrderSummaryService) this.summaryService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderSummaryService summaryService_delegate$lambda$0(EquityTradeService equityTradeService) {
        return (EquityOrderSummaryService) equityTradeService.summaryComponent.getServiceLocator().getClient(EquityOrderSummaryService.class);
    }

    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    public final void setMarketBuysEnabled(boolean z) {
        this.marketBuysEnabled = z;
    }

    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    public final void setSubzeroEnabled(boolean z) {
        this.subzeroEnabled = z;
    }

    public final Map<UUID, EquityOrderIntent> getSubmittedOrderRefIds() {
        return this.submittedOrderRefIds;
    }

    /* compiled from: EquityTradeService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$1", m3645f = "EquityTradeService.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$1 */
    static final class C146921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C146921(Continuation<? super C146921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeService.this.new C146921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityTradeService.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$1$1", m3645f = "EquityTradeService.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityTradeService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityTradeService equityTradeService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeService;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.setMarketBuysEnabled(this.Z$0);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(EquityTradeService.this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityTradeService.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityTradeService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$2", m3645f = "EquityTradeService.kt", m3646l = {119}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$2 */
    static final class C146932 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C146932(Continuation<? super C146932> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeService.this.new C146932(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(EquityTradeService.this.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 4, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityTradeService.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityTradeService.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$2$1", m3645f = "EquityTradeService.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityTradeService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityTradeService equityTradeService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeService;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.setSubzeroEnabled(this.Z$0);
                return Unit.INSTANCE;
            }
        }
    }

    public final StringResource getSellCheckString(BuySellData buySellData, boolean shorting, OrderType orderType, OrderTrigger orderTrigger) {
        Intrinsics.checkNotNullParameter(buySellData, "buySellData");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (shorting) {
            return shortSellChecks$lib_equity_trade_externalDebug(buySellData, orderType, orderTrigger);
        }
        return normalSellChecks$lib_equity_trade_externalDebug(buySellData);
    }

    public final StringResource normalSellChecks$lib_equity_trade_externalDebug(BuySellData buySellData) {
        Intrinsics.checkNotNullParameter(buySellData, "buySellData");
        if (Position5.getHasPosition(buySellData.getPosition())) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C14697R.string.no_shares_to_sell_snackbar, buySellData.getInstrument().getSymbol());
    }

    public final StringResource shortSellChecks$lib_equity_trade_externalDebug(BuySellData buySellData, OrderType orderType, OrderTrigger orderTrigger) {
        Intrinsics.checkNotNullParameter(buySellData, "buySellData");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (!buySellData.getTradingSession().getTodaysMarketOpen()) {
            return StringResource.INSTANCE.invoke(C14697R.string.short_sell_market_closed_snackbar, new Object[0]);
        }
        if (!buySellData.getSellToOpenAnySessionActive()) {
            return StringResource.INSTANCE.invoke(C14697R.string.short_sells_not_available_overnight, buySellData.getTradingSession().getNextOpenMarketHours().getExtendedOpensAt().atZone(this.clock.getZone()).format(DateTimeFormatter.ofPattern("h a")));
        }
        if (orderType == OrderType.LIMIT && orderTrigger == OrderTrigger.STOP && !buySellData.getSellToOpenMarketSessionActive()) {
            return StringResource.INSTANCE.invoke(C14697R.string.short_sell_after_hours_snackbar, new Object[0]);
        }
        if (orderType != OrderType.MARKET || buySellData.getSellToOpenMarketSessionActive()) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C14697R.string.short_sell_after_hours_snackbar, new Object[0]);
    }

    private final SharedFlow<OrderStatusEvent> getSubmittedEvents() {
        return (SharedFlow) this.submittedEvents.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedFlow submittedEvents_delegate$lambda$5(final EquityTradeService equityTradeService) {
        final Flow flowFilterNotNull = FlowKt.filterNotNull(equityTradeService.equityOrderManager.getAbortedRefIds());
        final Flow<UUID> flow = new Flow<UUID>() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector, equityTradeService), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityTradeService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$1$2", m3645f = "EquityTradeService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, EquityTradeService equityTradeService) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityTradeService;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (this.this$0.getSubmittedOrderRefIds().containsKey((UUID) obj)) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        Flow<OrderStatusEvent.Aborted> flow2 = new Flow<OrderStatusEvent.Aborted>() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OrderStatusEvent.Aborted> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, equityTradeService), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityTradeService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$1$2", m3645f = "EquityTradeService.kt", m3646l = {53}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, EquityTradeService equityTradeService) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityTradeService;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r2v3, types: [com.robinhood.android.equities.equitytrade.OrderStatusEvent$Aborted] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        EquityOrderIntent equityOrderIntentRemove = this.this$0.getSubmittedOrderRefIds().remove((UUID) obj);
                        T aborted = equityOrderIntentRemove == null ? null : new OrderStatusEvent.Aborted(equityOrderIntentRemove);
                        if (aborted != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(aborted, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(OrderSubmissionManager.orderStateChanges$default(equityTradeService.equityOrderManager, null, 1, null)), Integer.MAX_VALUE, null, 2, null));
        final Flow<OrderSubmissionManager.Result<? extends Order, ? extends DirectOrderRequestDraft>> flow3 = new Flow<OrderSubmissionManager.Result<? extends Order, ? extends DirectOrderRequestDraft>>() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OrderSubmissionManager.Result<? extends Order, ? extends DirectOrderRequestDraft>> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector, equityTradeService), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityTradeService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$2$2", m3645f = "EquityTradeService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, EquityTradeService equityTradeService) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityTradeService;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (this.this$0.getSubmittedOrderRefIds().containsKey(((OrderSubmissionManager.Result) obj).getUuid())) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        return FlowKt.shareIn(FlowKt.merge(flow2, new Flow<OrderStatusEvent>() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OrderStatusEvent> flowCollector, Continuation continuation) {
                Object objCollect = flow3.collect(new AnonymousClass2(flowCollector, equityTradeService), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityTradeService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$2$2", m3645f = "EquityTradeService.kt", m3646l = {69}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$submittedEvents_delegate$lambda$5$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, EquityTradeService equityTradeService) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityTradeService;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        OrderSubmissionManager.Result result = (OrderSubmissionManager.Result) obj;
                        Object success = null;
                        if (result instanceof OrderSubmissionManager.Result.Failure) {
                            OrderSubmissionManager.Result.Failure failure = (OrderSubmissionManager.Result.Failure) result;
                            EquityOrderIntent equityOrderIntentRemove = this.this$0.getSubmittedOrderRefIds().remove(failure.getUuid());
                            if (equityOrderIntentRemove != null) {
                                success = new OrderStatusEvent.Failed(equityOrderIntentRemove, failure.getThrowable());
                            }
                        } else if (!(result instanceof OrderSubmissionManager.Result.Sending)) {
                            if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OrderSubmissionManager.Result.Submitted submitted = (OrderSubmissionManager.Result.Submitted) result;
                            EquityOrderIntent equityOrderIntentRemove2 = this.this$0.getSubmittedOrderRefIds().remove(submitted.getUuid());
                            if (equityOrderIntentRemove2 != null) {
                                success = new OrderStatusEvent.Success(equityOrderIntentRemove2, (Order) submitted.getData());
                            }
                        }
                        if (success != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(success, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }), equityTradeService.getStoreScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), 1);
    }

    public final Flow<OrderStatusEvent> streamSubmittedOrderStatusEvents() {
        return getSubmittedEvents();
    }

    public final Flow<OrderStatusAlert> streamOrderStatusAlerts() {
        final SharedFlow<OrderStatusEvent> submittedEvents = getSubmittedEvents();
        return new Flow<OrderStatusAlert>() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$streamOrderStatusAlerts$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OrderStatusAlert> flowCollector, Continuation continuation) {
                Object objCollect = submittedEvents.collect(new C146872(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$streamOrderStatusAlerts$$inlined$mapNotNull$1$2 */
            public static final class C146872<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityTradeService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$streamOrderStatusAlerts$$inlined$mapNotNull$1$2", m3645f = "EquityTradeService.kt", m3646l = {52, 65}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$streamOrderStatusAlerts$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C146872.this.emit(null, this);
                    }
                }

                public C146872(FlowCollector flowCollector, EquityTradeService equityTradeService) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityTradeService;
                }

                /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
                
                    if (r10.emit(r2, r0) == r1) goto L40;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    Object pdtSnackbar;
                    FlowCollector flowCollector2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector3 = this.$this_unsafeFlow;
                        OrderStatusEvent orderStatusEvent = (OrderStatusEvent) obj;
                        OrderStatusEvent.Success success = orderStatusEvent instanceof OrderStatusEvent.Success ? (OrderStatusEvent.Success) orderStatusEvent : null;
                        if (success == null) {
                            pdtSnackbar = null;
                            flowCollector2 = flowCollector3;
                            if (pdtSnackbar != null) {
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                            return Unit.INSTANCE;
                        }
                        EquityTradeService equityTradeService = this.this$0;
                        UUID id = success.getOrder().getId();
                        String accountNumber = success.getOrder().getAccountNumber();
                        anonymousClass1.L$0 = flowCollector3;
                        anonymousClass1.label = 1;
                        Object objPdtWarningCheck = equityTradeService.pdtWarningCheck(id, accountNumber, anonymousClass1);
                        if (objPdtWarningCheck != coroutine_suspended) {
                            obj2 = objPdtWarningCheck;
                            flowCollector = flowCollector3;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector = (FlowCollector) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    ClientComponentAlert clientComponentAlert = (ClientComponentAlert) obj2;
                    if (clientComponentAlert != null) {
                        if (clientComponentAlert.getDisplayType() != GenericAlertDisplayType.SNACKBAR) {
                            if (!this.this$0.dayTradeTitleSnackbarRegex.matches(clientComponentAlert.getTitle())) {
                                pdtSnackbar = new OrderStatusAlert.PdtAlert(clientComponentAlert);
                            }
                        }
                        pdtSnackbar = new OrderStatusAlert.PdtSnackbar(clientComponentAlert);
                    } else {
                        pdtSnackbar = null;
                    }
                    flowCollector2 = flowCollector;
                    if (pdtSnackbar != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(10:12|79|13|63|68|(1:70)|71|(1:74)|75|76)(2:17|18))(1:19))(2:20|(3:27|(1:30)|61)(2:26|(4:40|(2:42|(2:44|45))|46|(5:58|81|59|(8:62|63|68|(0)|71|(0)|75|76)|61)(4:54|77|55|84))(2:38|39)))|31|(1:33)|34|(1:36)|40|(0)|46|(3:48|50|52)|58|81|59|(0)|61|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c0, code lost:
    
        r3 = r2;
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateAndSubmit(EquityOrderIntent equityOrderIntent, Continuation<? super OrderSubmitResult> continuation) {
        C146961 c146961;
        DirectOrderRequestDraft directOrderRequestDraftCreateDirectDraft;
        Deferred deferredAsync$default;
        Object objM13720validateOrderBWLJW6A;
        EquityOrderIntent equityOrderIntent2;
        DirectOrderRequestDraft directOrderRequestDraft;
        EquityOrderChecksAlert equityOrderChecksAlert;
        Deferred deferred;
        EquityOrderIntent equityOrderIntent3;
        EquityOrderIntent equityOrderIntent4;
        Deferred deferred2;
        Object objWithTimeout;
        Object objM28550constructorimpl;
        EquityOrderIntent equityOrderIntent5 = equityOrderIntent;
        if (continuation instanceof C146961) {
            c146961 = (C146961) continuation;
            int i = c146961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c146961.label = i - Integer.MIN_VALUE;
            } else {
                c146961 = new C146961(continuation);
            }
        }
        Object obj = c146961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c146961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            directOrderRequestDraftCreateDirectDraft = equityOrderIntent5.createDirectDraft(this.marketBuysEnabled, this.subzeroEnabled);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(getStoreScope(), null, null, new EquityTradeService3(equityOrderIntent5, this, directOrderRequestDraftCreateDirectDraft, null), 3, null);
            if (equityOrderIntent5.getExistingOrder() == null || equityOrderIntent5.getStopPrice() != null || equityOrderIntent5.getLimitPrice() != null) {
                EquityOrderCheckValidator equityOrderCheckValidator = this.equityOrderCheckValidator;
                BrokerageAccountType brokerageAccountType = equityOrderIntent5.getAccount().getBrokerageAccountType();
                EquityOrderFlowSource orderFlowSource = equityOrderIntent5.getOrderFlowSource();
                c146961.L$0 = equityOrderIntent5;
                c146961.L$1 = equityOrderIntent5;
                c146961.L$2 = directOrderRequestDraftCreateDirectDraft;
                c146961.L$3 = deferredAsync$default;
                c146961.label = 1;
                objM13720validateOrderBWLJW6A = equityOrderCheckValidator.m13720validateOrderBWLJW6A(directOrderRequestDraftCreateDirectDraft, brokerageAccountType, orderFlowSource, c146961);
                if (objM13720validateOrderBWLJW6A != coroutine_suspended) {
                    equityOrderIntent2 = equityOrderIntent5;
                }
                return coroutine_suspended;
            }
            directOrderRequestDraft = directOrderRequestDraftCreateDirectDraft;
            equityOrderChecksAlert = null;
            deferred = deferredAsync$default;
            equityOrderIntent3 = equityOrderIntent5;
            if (equityOrderChecksAlert == null && (equityOrderChecksAlert instanceof VisibleEquityOrderChecksAlert)) {
                return new OrderSubmitResult.DisplayOrderCheck(equityOrderIntent3, equityOrderChecksAlert);
            }
            if (equityOrderChecksAlert instanceof SilentEquityOrderChecksAlert) {
                SilentEquityOrderChecksAlert silentEquityOrderChecksAlert = (SilentEquityOrderChecksAlert) equityOrderChecksAlert;
                if (silentEquityOrderChecksAlert.getAction() instanceof GenericOrderCheckAction.McwPresentQuickConversionAction) {
                    GenericOrderCheckAction action = silentEquityOrderChecksAlert.getAction();
                    Intrinsics.checkNotNull(action, "null cannot be cast to non-null type com.robinhood.models.serverdriven.db.GenericOrderCheckAction.McwPresentQuickConversionAction");
                    GenericOrderCheckAction.McwPresentQuickConversionAction mcwPresentQuickConversionAction = (GenericOrderCheckAction.McwPresentQuickConversionAction) action;
                    String accountNumber = equityOrderIntent5.getAccount().getAccountNumber();
                    String title = mcwPresentQuickConversionAction.getTitle();
                    String message = mcwPresentQuickConversionAction.getMessage();
                    String placeholder = mcwPresentQuickConversionAction.getPlaceholder();
                    Currency currency = Currency.getInstance(mcwPresentQuickConversionAction.getSourceCurrencyCode());
                    Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
                    MoneyData amountNeeded = mcwPresentQuickConversionAction.getAmountNeeded();
                    Currency currency2 = Currency.getInstance(amountNeeded.getCurrency_code());
                    Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
                    Money money = new Money(currency2, amountNeeded.getAmount());
                    MoneyData currentBuyingPower = mcwPresentQuickConversionAction.getCurrentBuyingPower();
                    Currency currency3 = Currency.getInstance(currentBuyingPower.getCurrency_code());
                    Intrinsics.checkNotNullExpressionValue(currency3, "getInstance(...)");
                    return new OrderSubmitResult.ShowDialogFragment(equityOrderIntent5, new QuickConversionKey(accountNumber, title, message, placeholder, currency, money, new Money(currency3, currentBuyingPower.getAmount()), mcwPresentQuickConversionAction.getSecondaryCta()), "quick-conversion");
                }
            }
            if (!equityOrderIntent3.getAutoSend() && (equityOrderIntent3.getExistingOrder() == null || equityOrderIntent3.getStopPrice() != null || equityOrderIntent3.getLimitPrice() != null)) {
                this.submittedOrderRefIds.put(directOrderRequestDraft.getRefId(), equityOrderIntent5);
                try {
                    OrderSubmissionManager.submit$default(this.equityOrderManager, directOrderRequestDraft, null, false, 6, null);
                    return new OrderSubmitResult.NotifyAutoSendSuccess(equityOrderIntent3);
                } catch (OrderSubmissionManager2 unused) {
                    return new OrderSubmitResult.Error(StringResource.INSTANCE.invoke(C20649R.string.order_create_already_placing_order, new Object[0]), equityOrderIntent3);
                }
            }
            this.submittedOrderRefIds.put(directOrderRequestDraft.getRefId(), equityOrderIntent5);
            Result.Companion companion = Result.INSTANCE;
            EquityTradeService4 equityTradeService4 = new EquityTradeService4(deferred, null);
            c146961.L$0 = equityOrderIntent3;
            c146961.L$1 = deferred;
            c146961.L$2 = null;
            c146961.L$3 = null;
            c146961.label = 2;
            objWithTimeout = Timeout6.withTimeout(500L, equityTradeService4, c146961);
            if (objWithTimeout != coroutine_suspended) {
                equityOrderIntent4 = equityOrderIntent3;
                deferred2 = deferred;
                obj = objWithTimeout;
                objM28550constructorimpl = Result.m28550constructorimpl((String) obj);
                if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                }
                return new OrderSubmitResult.LaunchTradeFlow(equityOrderIntent4, createIntentKey(equityOrderIntent4, (String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl)));
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deferred2 = (Deferred) c146961.L$1;
            equityOrderIntent4 = (EquityOrderIntent) c146961.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objM28550constructorimpl = Result.m28550constructorimpl((String) obj);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                }
                return new OrderSubmitResult.LaunchTradeFlow(equityOrderIntent4, createIntentKey(equityOrderIntent4, (String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl)));
            }
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                Job.DefaultImpls.cancel$default(deferred2, null, 1, null);
            }
            return new OrderSubmitResult.LaunchTradeFlow(equityOrderIntent4, createIntentKey(equityOrderIntent4, (String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl)));
        }
        Deferred deferred3 = (Deferred) c146961.L$3;
        directOrderRequestDraftCreateDirectDraft = (DirectOrderRequestDraft) c146961.L$2;
        EquityOrderIntent equityOrderIntent6 = (EquityOrderIntent) c146961.L$1;
        equityOrderIntent2 = (EquityOrderIntent) c146961.L$0;
        ResultKt.throwOnFailure(obj);
        Object value = ((Result) obj).getValue();
        deferredAsync$default = deferred3;
        equityOrderIntent5 = equityOrderIntent6;
        objM13720validateOrderBWLJW6A = value;
        if (Result.m28555isFailureimpl(objM13720validateOrderBWLJW6A)) {
            objM13720validateOrderBWLJW6A = null;
        }
        equityOrderChecksAlert = (EquityOrderChecksAlert) objM13720validateOrderBWLJW6A;
        Deferred deferred4 = deferredAsync$default;
        equityOrderIntent3 = equityOrderIntent5;
        equityOrderIntent5 = equityOrderIntent2;
        directOrderRequestDraft = directOrderRequestDraftCreateDirectDraft;
        deferred = deferred4;
        if (equityOrderChecksAlert == null) {
        }
        if (equityOrderChecksAlert instanceof SilentEquityOrderChecksAlert) {
        }
        if (!equityOrderIntent3.getAutoSend()) {
        }
        this.submittedOrderRefIds.put(directOrderRequestDraft.getRefId(), equityOrderIntent5);
        Result.Companion companion3 = Result.INSTANCE;
        EquityTradeService4 equityTradeService42 = new EquityTradeService4(deferred, null);
        c146961.L$0 = equityOrderIntent3;
        c146961.L$1 = deferred;
        c146961.L$2 = null;
        c146961.L$3 = null;
        c146961.label = 2;
        objWithTimeout = Timeout6.withTimeout(500L, equityTradeService42, c146961);
        if (objWithTimeout != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    private final EquityOrderActivityIntentKey createIntentKey(EquityOrderIntent equityOrderIntent, String str) {
        EquityOrderConfiguration orderConfiguration;
        DirectOrder orderConfiguration2;
        if (equityOrderIntent.getExistingOrder() != null) {
            UUID refId = equityOrderIntent.getRefId();
            Order existingOrder = equityOrderIntent.getExistingOrder();
            EquityOrderFlowSource orderFlowSource = equityOrderIntent.getOrderFlowSource();
            if ((equityOrderIntent.getOrderConfiguration() instanceof DirectOrder.Draft) && (equityOrderIntent.getStopPrice() != null || equityOrderIntent.getLimitPrice() != null)) {
                orderConfiguration2 = ((DirectOrder.Draft) equityOrderIntent.getOrderConfiguration()).validated(equityOrderIntent.getCheckOverrides(), str);
            } else {
                orderConfiguration2 = equityOrderIntent.getOrderConfiguration();
            }
            return new EquityOrderActivityIntentKey.ModifyExistingWithConfig(orderConfiguration2, existingOrder, false, orderFlowSource, refId, equityOrderIntent.getSkipConfirmation(), equityOrderIntent.getOrderFlowSource() == EquityOrderFlowSource.BW_ADVANCED_CHART);
        }
        UUID refId2 = equityOrderIntent.getRefId();
        UUID id = equityOrderIntent.getInstrument().getId();
        EquityOrderSide tradeSide = equityOrderIntent.getTradeSide();
        String accountNumber = equityOrderIntent.getAccount().getAccountNumber();
        EquityOrderFlowSource orderFlowSource2 = equityOrderIntent.getOrderFlowSource();
        if (equityOrderIntent.getOrderConfiguration() instanceof DirectOrder.Draft) {
            orderConfiguration = ((DirectOrder.Draft) equityOrderIntent.getOrderConfiguration()).validated(equityOrderIntent.getCheckOverrides(), str);
        } else {
            orderConfiguration = equityOrderIntent.getOrderConfiguration();
        }
        return new EquityOrderActivityIntentKey.WithId(id, tradeSide, orderFlowSource2, refId2, accountNumber, null, orderConfiguration, equityOrderIntent.getSkipConfirmation(), equityOrderIntent.getOrderFlowSource() == EquityOrderFlowSource.BW_ADVANCED_CHART, 32, null);
    }

    public final Object handlerOrderCheckAction(ServerDrivenButton serverDrivenButton, EquityOrderIntent equityOrderIntent, Continuation<? super OrderSubmitResult> continuation) {
        return handlerDirectOrderCheckAction(serverDrivenButton.getTypedAction(), equityOrderIntent, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handlerDirectOrderCheckAction(GenericAction genericAction, EquityOrderIntent equityOrderIntent, Continuation<? super OrderSubmitResult> continuation) {
        C146941 c146941;
        EquityTradeService equityTradeService;
        C146941 c1469412;
        Object obj;
        Object value;
        EquityOrderIntent equityOrderIntent2;
        if (continuation instanceof C146941) {
            c146941 = (C146941) continuation;
            int i = c146941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c146941.label = i - Integer.MIN_VALUE;
            } else {
                c146941 = new C146941(continuation);
            }
        }
        C146941 c1469413 = c146941;
        Object objValidateAndSubmit = c1469413.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1469413.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateAndSubmit);
            if (genericAction instanceof GenericAction.OrderCheckAction) {
                GenericOrderCheckAction genericOrderCheckAction = ((GenericAction.OrderCheckAction) genericAction).getGenericOrderCheckAction();
                if (genericOrderCheckAction instanceof GenericOrderCheckAction.AppendOverridesAction) {
                    EquityOrderIntent equityOrderIntentCopy$default = EquityOrderIntent.copy$default(equityOrderIntent, null, null, null, null, null, null, null, null, null, null, null, null, null, CollectionsKt.plus((Collection) equityOrderIntent.getCheckOverrides(), (Iterable) ((GenericOrderCheckAction.AppendOverridesAction) genericOrderCheckAction).getOverrides()), null, false, false, null, null, null, 1040383, null);
                    c1469413.label = 1;
                    Object objValidateAndSubmit2 = validateAndSubmit(equityOrderIntentCopy$default, c1469413);
                    return objValidateAndSubmit2 == coroutine_suspended ? coroutine_suspended : objValidateAndSubmit2;
                }
                equityTradeService = this;
                c1469412 = c1469413;
                if (genericOrderCheckAction instanceof GenericOrderCheckAction.SetQuantityAction) {
                    EquityOrderIntent equityOrderIntentCopy$default2 = EquityOrderIntent.copy$default(equityOrderIntent, null, null, null, null, null, null, new Quantity(((GenericOrderCheckAction.SetQuantityAction) genericOrderCheckAction).getQuantity()), null, null, null, null, null, null, null, null, false, false, null, null, null, 1048511, null);
                    c1469412.label = 2;
                    Object objValidateAndSubmit3 = validateAndSubmit(equityOrderIntentCopy$default2, c1469412);
                    return objValidateAndSubmit3 == coroutine_suspended ? coroutine_suspended : objValidateAndSubmit3;
                }
                obj = coroutine_suspended;
                if (genericOrderCheckAction instanceof GenericOrderCheckAction.CancelPendingCryptoOrdersAction) {
                    EquityOrderCheckValidator equityOrderCheckValidator = equityTradeService.equityOrderCheckValidator;
                    c1469412.L$0 = equityOrderIntent;
                    c1469412.label = 3;
                    Object objM13719cancelPendingCryptoOrdersIoAF18A = equityOrderCheckValidator.m13719cancelPendingCryptoOrdersIoAF18A(c1469412);
                    if (objM13719cancelPendingCryptoOrdersIoAF18A == obj) {
                        return obj;
                    }
                    value = objM13719cancelPendingCryptoOrdersIoAF18A;
                    equityOrderIntent2 = equityOrderIntent;
                } else {
                    if (genericOrderCheckAction instanceof GenericOrderCheckAction.EditLimitOrderAction) {
                        return new OrderSubmitResult.EditLimitOrderAction(equityOrderIntent);
                    }
                    if (genericOrderCheckAction instanceof GenericOrderCheckAction.EditStopOrderAction) {
                        return new OrderSubmitResult.EditStopOrderAction(equityOrderIntent);
                    }
                    if (genericOrderCheckAction instanceof GenericOrderCheckAction.ChangeTradingSessionAction) {
                        return new OrderSubmitResult.ChangeTradingSessionAction(equityOrderIntent);
                    }
                    if (!(genericOrderCheckAction instanceof GenericOrderCheckAction.SetLimitPriceAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.ClearTaxLotSelectionAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToAllDayOrderAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToLimitAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToMarketAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToSharesAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToSimpleLimitAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.OverrideExtendedHoursFlagAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.McwPresentQuickConversionAction) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.Unknown) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.OptionsConvertToLimit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return new OrderSubmitResult.NoAction(equityOrderIntent);
                }
            } else {
                if (genericAction instanceof GenericAction.DeeplinkAction) {
                    return new OrderSubmitResult.DeepLink(((GenericAction.DeeplinkAction) genericAction).getUri(), equityOrderIntent);
                }
                if (genericAction instanceof GenericAction.DismissAction) {
                    return new OrderSubmitResult.NoAction(equityOrderIntent);
                }
                return new OrderSubmitResult.NoAction(equityOrderIntent);
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objValidateAndSubmit);
                return objValidateAndSubmit;
            }
            if (i2 == 2) {
                ResultKt.throwOnFailure(objValidateAndSubmit);
                return objValidateAndSubmit;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objValidateAndSubmit);
                return (OrderSubmitResult) objValidateAndSubmit;
            }
            equityOrderIntent2 = (EquityOrderIntent) c1469413.L$0;
            ResultKt.throwOnFailure(objValidateAndSubmit);
            value = ((Result) objValidateAndSubmit).getValue();
            equityTradeService = this;
            c1469412 = c1469413;
            obj = coroutine_suspended;
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
        if (thM28553exceptionOrNullimpl != null) {
            if (Throwables.isNetworkRelated(thM28553exceptionOrNullimpl)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, thM28553exceptionOrNullimpl, false, null, 4, null);
            }
            return new OrderSubmitResult.Error(StringResource.INSTANCE.invoke(C11048R.string.error_title, new Object[0]), equityOrderIntent2);
        }
        StringResource stringResource = (StringResource) value;
        if (stringResource != null) {
            return new OrderSubmitResult.Error(stringResource, equityOrderIntent2);
        }
        c1469412.L$0 = null;
        c1469412.label = 4;
        objValidateAndSubmit = equityTradeService.validateAndSubmit(equityOrderIntent2, c1469412);
        if (objValidateAndSubmit == obj) {
            return obj;
        }
        return (OrderSubmitResult) objValidateAndSubmit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pdtWarningCheck(UUID uuid, String str, Continuation<? super ClientComponentAlert> continuation) {
        C146951 c146951;
        if (continuation instanceof C146951) {
            c146951 = (C146951) continuation;
            int i = c146951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c146951.label = i - Integer.MIN_VALUE;
            } else {
                c146951 = new C146951(continuation);
            }
        }
        Object objFirstOrNull = c146951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c146951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            OrderStore orderStore = this.orderStore;
            Duration.Companion companion = Duration.INSTANCE;
            p479j$.time.Duration durationOfSeconds = p479j$.time.Duration.ofSeconds(Duration.m28741getInWholeSecondsimpl(Duration3.toDuration(1, DurationUnitJvm.SECONDS)), Duration.m28743getNanosecondsComponentimpl(r6));
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "toComponents-impl(...)");
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(orderStore.poll(uuid, durationOfSeconds)), Integer.MAX_VALUE, null, 2, null);
            Flow<com.robinhood.models.api.EquityOrderState> flow = new Flow<com.robinhood.models.api.EquityOrderState>() { // from class: com.robinhood.android.equities.equitytrade.EquityTradeService$pdtWarningCheck$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super com.robinhood.models.api.EquityOrderState> flowCollector, Continuation continuation2) {
                    Object objCollect = flowBuffer$default.collect(new C146862(flowCollector), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$pdtWarningCheck$$inlined$map$1$2 */
                public static final class C146862<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$pdtWarningCheck$$inlined$map$1$2", m3645f = "EquityTradeService.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$pdtWarningCheck$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C146862.this.emit(null, this);
                        }
                    }

                    public C146862(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            com.robinhood.models.api.EquityOrderState state = ((Order) obj).getState();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(state, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            EquityTradeService2 equityTradeService2 = new EquityTradeService2(null);
            c146951.L$0 = uuid;
            c146951.L$1 = str;
            c146951.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flow, equityTradeService2, c146951);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            return (ClientComponentAlert) objFirstOrNull;
        }
        str = (String) c146951.L$1;
        uuid = (UUID) c146951.L$0;
        ResultKt.throwOnFailure(objFirstOrNull);
        com.robinhood.models.api.EquityOrderState equityOrderState = (com.robinhood.models.api.EquityOrderState) objFirstOrNull;
        Boolean boolBoxBoolean = equityOrderState != null ? boxing.boxBoolean(equityOrderState.hasExecutions()) : null;
        if (boolBoxBoolean == null || !boolBoxBoolean.booleanValue()) {
            return null;
        }
        DayTradeWarningsStore dayTradeWarningsStore = this.dayTradeWarningsStore;
        c146951.L$0 = null;
        c146951.L$1 = null;
        c146951.label = 2;
        objFirstOrNull = dayTradeWarningsStore.getEquitiesWarning(uuid, str, c146951);
    }
}
