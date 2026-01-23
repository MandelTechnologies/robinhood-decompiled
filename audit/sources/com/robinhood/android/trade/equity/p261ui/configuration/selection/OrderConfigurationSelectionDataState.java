package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trade.configuration.OrderConfigurationResource;
import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import com.robinhood.android.trade.configuration.OrderConfigurationUpsellOption;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder8;
import com.robinhood.android.trading.contracts.configuration.DollarBased3;
import com.robinhood.android.trading.contracts.configuration.DollarBased4;
import com.robinhood.android.trading.contracts.configuration.DollarBased5;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.android.trading.contracts.configuration.ShareSimpleLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.android.trading.contracts.configuration.ShareTrailingStop;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.TaxLotEligibility;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.OrderTypeSelector;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import rosetta.order.MarketHours;
import rosetta.order.Side;

/* compiled from: OrderConfigurationSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001yBç\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010`\u001a\u00020\tHÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\tHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010d\u001a\u00020\tHÆ\u0003J\t\u0010e\u001a\u00020\u0011HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00108J\t\u0010j\u001a\u00020\tHÆ\u0003J\t\u0010k\u001a\u00020\tHÆ\u0003J\t\u0010l\u001a\u00020\tHÆ\u0003J\t\u0010m\u001a\u00020\tHÆ\u0003J\u0011\u0010n\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\t\u0010p\u001a\u00020\tHÆ\u0003Jî\u0001\u0010q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\t2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\t\u0010w\u001a\u00020xHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010*R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00109\u001a\u0004\b\u0018\u00108R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010*R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010*R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010*R\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010*R\u0011\u0010>\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u0010*R\u001a\u0010?\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\bB\u0010*R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00150D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010*R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00150D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010FR\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010FR\u0019\u0010Q\u001a\n\u0018\u00010Rj\u0004\u0018\u0001`S8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010V\u001a\u0004\u0018\u00010W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010Z\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b[\u0010*R\u0014\u0010\\\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010*¨\u0006z"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "instrument", "Lcom/robinhood/models/db/Instrument;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "isShortPosition", "", "upsellOption", "Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "isRecurringTradable", "recurringTradabilityReason", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "shouldShowRecurringComingSoon", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "orderTypeSelectorResponse", "Lcom/robinhood/models/db/bonfire/OrderTypeSelector;", "selectedRow", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "tradingSession", "Lcom/robinhood/models/db/TradingSession;", "isAdtHours", "isOptionsRegionSupported", "isRecurringInvestmentRegionSupported", "marketBuysEnabled", "taxLotAccountEligible", "taxLotPositionEligibility", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/TaxLotEligibility;", "isUk", "isFxAtTrade", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/EquityOrderSide;ZLcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;ZLcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;Lcom/robinhood/models/db/bonfire/OrderTypeSelector;Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;Lcom/robinhood/models/db/TradingSession;Ljava/lang/Boolean;ZZZZLcom/robinhood/utils/Optional;ZZ)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "()Z", "getUpsellOption", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "getRecurringTradabilityReason", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "getShouldShowRecurringComingSoon", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getOrderTypeSelectorResponse", "()Lcom/robinhood/models/db/bonfire/OrderTypeSelector;", "getSelectedRow", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "getTradingSession", "()Lcom/robinhood/models/db/TradingSession;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarketBuysEnabled", "getTaxLotAccountEligible", "getTaxLotPositionEligibility", "()Lcom/robinhood/utils/Optional;", "isBuyToClose", "showAdtLimitOrderIcon", "getShowAdtLimitOrderIcon$annotations", "()V", "getShowAdtLimitOrderIcon", "orderConfigurationList", "", "getOrderConfigurationList", "()Ljava/util/List;", "showRecurringOrders", "getShowRecurringOrders", "upsellSection", "getUpsellSection", "orderConfigurationRows", "getOrderConfigurationRows", "presetPercentLimit", "Ljava/math/BigDecimal;", "otherOrderTypeRows", "getOtherOrderTypeRows", "loggingEquityOrderContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingEquityOrderContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "taxLotsSelected", "getTaxLotsSelected", "isSubzeroRelated", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/EquityOrderSide;ZLcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;ZLcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;Lcom/robinhood/models/db/bonfire/OrderTypeSelector;Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;Lcom/robinhood/models/db/TradingSession;Ljava/lang/Boolean;ZZZZLcom/robinhood/utils/Optional;ZZ)Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;", "equals", "other", "hashCode", "", "toString", "", "OrderTypes", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class OrderConfigurationSelectionDataState {
    public static final int $stable = 8;
    private final Account account;
    private final DayNightOverlay dayNightOverlay;
    private final Instrument instrument;
    private final Boolean isAdtHours;
    private final boolean isFxAtTrade;
    private final boolean isOptionsRegionSupported;
    private final boolean isRecurringInvestmentRegionSupported;
    private final boolean isRecurringTradable;
    private final boolean isShortPosition;
    private final boolean isUk;
    private final boolean marketBuysEnabled;
    private final OrderTypeSelector orderTypeSelectorResponse;
    private final BigDecimal presetPercentLimit;
    private final InstrumentRecurringTradability.RecurringTradableReason recurringTradabilityReason;
    private final OrderConfigurationRow selectedRow;
    private final boolean shouldShowRecurringComingSoon;
    private final EquityOrderSide side;
    private final boolean taxLotAccountEligible;
    private final Optional<TaxLotEligibility> taxLotPositionEligibility;
    private final TradingSession tradingSession;
    private final OrderConfigurationUpsellOption upsellOption;

    /* compiled from: OrderConfigurationSelectionDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderConfigurationUpsellOption.values().length];
            try {
                iArr[OrderConfigurationUpsellOption.OPTION_HOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderConfigurationUpsellOption.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OrderConfigurationSelectionDataState() {
        this(null, null, null, false, null, false, null, false, null, null, null, null, null, false, false, false, false, null, false, false, 1048575, null);
    }

    public static /* synthetic */ OrderConfigurationSelectionDataState copy$default(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Account account, Instrument instrument, EquityOrderSide equityOrderSide, boolean z, OrderConfigurationUpsellOption orderConfigurationUpsellOption, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, boolean z3, DayNightOverlay dayNightOverlay, OrderTypeSelector orderTypeSelector, OrderConfigurationRow orderConfigurationRow, TradingSession tradingSession, Boolean bool, boolean z4, boolean z5, boolean z6, boolean z7, Optional optional, boolean z8, boolean z9, int i, Object obj) {
        boolean z10;
        boolean z11;
        Account account2 = (i & 1) != 0 ? orderConfigurationSelectionDataState.account : account;
        Instrument instrument2 = (i & 2) != 0 ? orderConfigurationSelectionDataState.instrument : instrument;
        EquityOrderSide equityOrderSide2 = (i & 4) != 0 ? orderConfigurationSelectionDataState.side : equityOrderSide;
        boolean z12 = (i & 8) != 0 ? orderConfigurationSelectionDataState.isShortPosition : z;
        OrderConfigurationUpsellOption orderConfigurationUpsellOption2 = (i & 16) != 0 ? orderConfigurationSelectionDataState.upsellOption : orderConfigurationUpsellOption;
        boolean z13 = (i & 32) != 0 ? orderConfigurationSelectionDataState.isRecurringTradable : z2;
        InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason2 = (i & 64) != 0 ? orderConfigurationSelectionDataState.recurringTradabilityReason : recurringTradableReason;
        boolean z14 = (i & 128) != 0 ? orderConfigurationSelectionDataState.shouldShowRecurringComingSoon : z3;
        DayNightOverlay dayNightOverlay2 = (i & 256) != 0 ? orderConfigurationSelectionDataState.dayNightOverlay : dayNightOverlay;
        OrderTypeSelector orderTypeSelector2 = (i & 512) != 0 ? orderConfigurationSelectionDataState.orderTypeSelectorResponse : orderTypeSelector;
        OrderConfigurationRow orderConfigurationRow2 = (i & 1024) != 0 ? orderConfigurationSelectionDataState.selectedRow : orderConfigurationRow;
        TradingSession tradingSession2 = (i & 2048) != 0 ? orderConfigurationSelectionDataState.tradingSession : tradingSession;
        Boolean bool2 = (i & 4096) != 0 ? orderConfigurationSelectionDataState.isAdtHours : bool;
        boolean z15 = (i & 8192) != 0 ? orderConfigurationSelectionDataState.isOptionsRegionSupported : z4;
        Account account3 = account2;
        boolean z16 = (i & 16384) != 0 ? orderConfigurationSelectionDataState.isRecurringInvestmentRegionSupported : z5;
        boolean z17 = (i & 32768) != 0 ? orderConfigurationSelectionDataState.marketBuysEnabled : z6;
        boolean z18 = (i & 65536) != 0 ? orderConfigurationSelectionDataState.taxLotAccountEligible : z7;
        Optional optional2 = (i & 131072) != 0 ? orderConfigurationSelectionDataState.taxLotPositionEligibility : optional;
        boolean z19 = (i & 262144) != 0 ? orderConfigurationSelectionDataState.isUk : z8;
        if ((i & 524288) != 0) {
            z11 = z19;
            z10 = orderConfigurationSelectionDataState.isFxAtTrade;
        } else {
            z10 = z9;
            z11 = z19;
        }
        return orderConfigurationSelectionDataState.copy(account3, instrument2, equityOrderSide2, z12, orderConfigurationUpsellOption2, z13, recurringTradableReason2, z14, dayNightOverlay2, orderTypeSelector2, orderConfigurationRow2, tradingSession2, bool2, z15, z16, z17, z18, optional2, z11, z10);
    }

    public static /* synthetic */ void getShowAdtLimitOrderIcon$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final OrderTypeSelector getOrderTypeSelectorResponse() {
        return this.orderTypeSelectorResponse;
    }

    /* renamed from: component11, reason: from getter */
    public final OrderConfigurationRow getSelectedRow() {
        return this.selectedRow;
    }

    /* renamed from: component12, reason: from getter */
    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getIsAdtHours() {
        return this.isAdtHours;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsOptionsRegionSupported() {
        return this.isOptionsRegionSupported;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsRecurringInvestmentRegionSupported() {
        return this.isRecurringInvestmentRegionSupported;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getTaxLotAccountEligible() {
        return this.taxLotAccountEligible;
    }

    public final Optional<TaxLotEligibility> component18() {
        return this.taxLotPositionEligibility;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsUk() {
        return this.isUk;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsFxAtTrade() {
        return this.isFxAtTrade;
    }

    /* renamed from: component3, reason: from getter */
    public final EquityOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsShortPosition() {
        return this.isShortPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderConfigurationUpsellOption getUpsellOption() {
        return this.upsellOption;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsRecurringTradable() {
        return this.isRecurringTradable;
    }

    /* renamed from: component7, reason: from getter */
    public final InstrumentRecurringTradability.RecurringTradableReason getRecurringTradabilityReason() {
        return this.recurringTradabilityReason;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldShowRecurringComingSoon() {
        return this.shouldShowRecurringComingSoon;
    }

    /* renamed from: component9, reason: from getter */
    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final OrderConfigurationSelectionDataState copy(Account account, Instrument instrument, EquityOrderSide side, boolean isShortPosition, OrderConfigurationUpsellOption upsellOption, boolean isRecurringTradable, InstrumentRecurringTradability.RecurringTradableReason recurringTradabilityReason, boolean shouldShowRecurringComingSoon, DayNightOverlay dayNightOverlay, OrderTypeSelector orderTypeSelectorResponse, OrderConfigurationRow selectedRow, TradingSession tradingSession, Boolean isAdtHours, boolean isOptionsRegionSupported, boolean isRecurringInvestmentRegionSupported, boolean marketBuysEnabled, boolean taxLotAccountEligible, Optional<TaxLotEligibility> taxLotPositionEligibility, boolean isUk, boolean isFxAtTrade) {
        Intrinsics.checkNotNullParameter(upsellOption, "upsellOption");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        return new OrderConfigurationSelectionDataState(account, instrument, side, isShortPosition, upsellOption, isRecurringTradable, recurringTradabilityReason, shouldShowRecurringComingSoon, dayNightOverlay, orderTypeSelectorResponse, selectedRow, tradingSession, isAdtHours, isOptionsRegionSupported, isRecurringInvestmentRegionSupported, marketBuysEnabled, taxLotAccountEligible, taxLotPositionEligibility, isUk, isFxAtTrade);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderConfigurationSelectionDataState)) {
            return false;
        }
        OrderConfigurationSelectionDataState orderConfigurationSelectionDataState = (OrderConfigurationSelectionDataState) other;
        return Intrinsics.areEqual(this.account, orderConfigurationSelectionDataState.account) && Intrinsics.areEqual(this.instrument, orderConfigurationSelectionDataState.instrument) && this.side == orderConfigurationSelectionDataState.side && this.isShortPosition == orderConfigurationSelectionDataState.isShortPosition && this.upsellOption == orderConfigurationSelectionDataState.upsellOption && this.isRecurringTradable == orderConfigurationSelectionDataState.isRecurringTradable && Intrinsics.areEqual(this.recurringTradabilityReason, orderConfigurationSelectionDataState.recurringTradabilityReason) && this.shouldShowRecurringComingSoon == orderConfigurationSelectionDataState.shouldShowRecurringComingSoon && this.dayNightOverlay == orderConfigurationSelectionDataState.dayNightOverlay && Intrinsics.areEqual(this.orderTypeSelectorResponse, orderConfigurationSelectionDataState.orderTypeSelectorResponse) && Intrinsics.areEqual(this.selectedRow, orderConfigurationSelectionDataState.selectedRow) && Intrinsics.areEqual(this.tradingSession, orderConfigurationSelectionDataState.tradingSession) && Intrinsics.areEqual(this.isAdtHours, orderConfigurationSelectionDataState.isAdtHours) && this.isOptionsRegionSupported == orderConfigurationSelectionDataState.isOptionsRegionSupported && this.isRecurringInvestmentRegionSupported == orderConfigurationSelectionDataState.isRecurringInvestmentRegionSupported && this.marketBuysEnabled == orderConfigurationSelectionDataState.marketBuysEnabled && this.taxLotAccountEligible == orderConfigurationSelectionDataState.taxLotAccountEligible && Intrinsics.areEqual(this.taxLotPositionEligibility, orderConfigurationSelectionDataState.taxLotPositionEligibility) && this.isUk == orderConfigurationSelectionDataState.isUk && this.isFxAtTrade == orderConfigurationSelectionDataState.isFxAtTrade;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        EquityOrderSide equityOrderSide = this.side;
        int iHashCode3 = (((((((iHashCode2 + (equityOrderSide == null ? 0 : equityOrderSide.hashCode())) * 31) + Boolean.hashCode(this.isShortPosition)) * 31) + this.upsellOption.hashCode()) * 31) + Boolean.hashCode(this.isRecurringTradable)) * 31;
        InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason = this.recurringTradabilityReason;
        int iHashCode4 = (((((iHashCode3 + (recurringTradableReason == null ? 0 : recurringTradableReason.hashCode())) * 31) + Boolean.hashCode(this.shouldShowRecurringComingSoon)) * 31) + this.dayNightOverlay.hashCode()) * 31;
        OrderTypeSelector orderTypeSelector = this.orderTypeSelectorResponse;
        int iHashCode5 = (iHashCode4 + (orderTypeSelector == null ? 0 : orderTypeSelector.hashCode())) * 31;
        OrderConfigurationRow orderConfigurationRow = this.selectedRow;
        int iHashCode6 = (iHashCode5 + (orderConfigurationRow == null ? 0 : orderConfigurationRow.hashCode())) * 31;
        TradingSession tradingSession = this.tradingSession;
        int iHashCode7 = (iHashCode6 + (tradingSession == null ? 0 : tradingSession.hashCode())) * 31;
        Boolean bool = this.isAdtHours;
        int iHashCode8 = (((((((((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isOptionsRegionSupported)) * 31) + Boolean.hashCode(this.isRecurringInvestmentRegionSupported)) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31) + Boolean.hashCode(this.taxLotAccountEligible)) * 31;
        Optional<TaxLotEligibility> optional = this.taxLotPositionEligibility;
        return ((((iHashCode8 + (optional != null ? optional.hashCode() : 0)) * 31) + Boolean.hashCode(this.isUk)) * 31) + Boolean.hashCode(this.isFxAtTrade);
    }

    public String toString() {
        return "OrderConfigurationSelectionDataState(account=" + this.account + ", instrument=" + this.instrument + ", side=" + this.side + ", isShortPosition=" + this.isShortPosition + ", upsellOption=" + this.upsellOption + ", isRecurringTradable=" + this.isRecurringTradable + ", recurringTradabilityReason=" + this.recurringTradabilityReason + ", shouldShowRecurringComingSoon=" + this.shouldShowRecurringComingSoon + ", dayNightOverlay=" + this.dayNightOverlay + ", orderTypeSelectorResponse=" + this.orderTypeSelectorResponse + ", selectedRow=" + this.selectedRow + ", tradingSession=" + this.tradingSession + ", isAdtHours=" + this.isAdtHours + ", isOptionsRegionSupported=" + this.isOptionsRegionSupported + ", isRecurringInvestmentRegionSupported=" + this.isRecurringInvestmentRegionSupported + ", marketBuysEnabled=" + this.marketBuysEnabled + ", taxLotAccountEligible=" + this.taxLotAccountEligible + ", taxLotPositionEligibility=" + this.taxLotPositionEligibility + ", isUk=" + this.isUk + ", isFxAtTrade=" + this.isFxAtTrade + ")";
    }

    public OrderConfigurationSelectionDataState(Account account, Instrument instrument, EquityOrderSide equityOrderSide, boolean z, OrderConfigurationUpsellOption upsellOption, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, boolean z3, DayNightOverlay dayNightOverlay, OrderTypeSelector orderTypeSelector, OrderConfigurationRow orderConfigurationRow, TradingSession tradingSession, Boolean bool, boolean z4, boolean z5, boolean z6, boolean z7, Optional<TaxLotEligibility> optional, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(upsellOption, "upsellOption");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        this.account = account;
        this.instrument = instrument;
        this.side = equityOrderSide;
        this.isShortPosition = z;
        this.upsellOption = upsellOption;
        this.isRecurringTradable = z2;
        this.recurringTradabilityReason = recurringTradableReason;
        this.shouldShowRecurringComingSoon = z3;
        this.dayNightOverlay = dayNightOverlay;
        this.orderTypeSelectorResponse = orderTypeSelector;
        this.selectedRow = orderConfigurationRow;
        this.tradingSession = tradingSession;
        this.isAdtHours = bool;
        this.isOptionsRegionSupported = z4;
        this.isRecurringInvestmentRegionSupported = z5;
        this.marketBuysEnabled = z6;
        this.taxLotAccountEligible = z7;
        this.taxLotPositionEligibility = optional;
        this.isUk = z8;
        this.isFxAtTrade = z9;
        this.presetPercentLimit = instrument != null ? instrument.getDefaultPresetPercentLimit() : null;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final EquityOrderSide getSide() {
        return this.side;
    }

    public final boolean isShortPosition() {
        return this.isShortPosition;
    }

    public /* synthetic */ OrderConfigurationSelectionDataState(Account account, Instrument instrument, EquityOrderSide equityOrderSide, boolean z, OrderConfigurationUpsellOption orderConfigurationUpsellOption, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, boolean z3, DayNightOverlay dayNightOverlay, OrderTypeSelector orderTypeSelector, OrderConfigurationRow orderConfigurationRow, TradingSession tradingSession, Boolean bool, boolean z4, boolean z5, boolean z6, boolean z7, Optional optional, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : equityOrderSide, (i & 8) != 0 ? false : z, (i & 16) != 0 ? OrderConfigurationUpsellOption.NONE : orderConfigurationUpsellOption, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : recurringTradableReason, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 512) != 0 ? null : orderTypeSelector, (i & 1024) != 0 ? null : orderConfigurationRow, (i & 2048) != 0 ? null : tradingSession, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? false : z5, (i & 32768) != 0 ? false : z6, (i & 65536) != 0 ? false : z7, (i & 131072) != 0 ? null : optional, (i & 262144) != 0 ? false : z8, (i & 524288) != 0 ? false : z9);
    }

    public final OrderConfigurationUpsellOption getUpsellOption() {
        return this.upsellOption;
    }

    public final boolean isRecurringTradable() {
        return this.isRecurringTradable;
    }

    public final InstrumentRecurringTradability.RecurringTradableReason getRecurringTradabilityReason() {
        return this.recurringTradabilityReason;
    }

    public final boolean getShouldShowRecurringComingSoon() {
        return this.shouldShowRecurringComingSoon;
    }

    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final OrderTypeSelector getOrderTypeSelectorResponse() {
        return this.orderTypeSelectorResponse;
    }

    public final OrderConfigurationRow getSelectedRow() {
        return this.selectedRow;
    }

    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    public final Boolean isAdtHours() {
        return this.isAdtHours;
    }

    public final boolean isOptionsRegionSupported() {
        return this.isOptionsRegionSupported;
    }

    public final boolean isRecurringInvestmentRegionSupported() {
        return this.isRecurringInvestmentRegionSupported;
    }

    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    public final boolean getTaxLotAccountEligible() {
        return this.taxLotAccountEligible;
    }

    public final Optional<TaxLotEligibility> getTaxLotPositionEligibility() {
        return this.taxLotPositionEligibility;
    }

    public final boolean isUk() {
        return this.isUk;
    }

    public final boolean isFxAtTrade() {
        return this.isFxAtTrade;
    }

    public final boolean isBuyToClose() {
        return this.side == EquityOrderSide.BUY && this.isShortPosition;
    }

    public final boolean getShowAdtLimitOrderIcon() {
        return Instrument4.isAllDayTradable(this.instrument) && Intrinsics.areEqual(this.isAdtHours, Boolean.TRUE);
    }

    public final List<OrderConfigurationRow> getOrderConfigurationList() {
        if (this.side == null) {
            return CollectionsKt.emptyList();
        }
        Instrument instrument = this.instrument;
        if (instrument == null || instrument.getSymbol() == null) {
            return CollectionsKt.emptyList();
        }
        if (this.tradingSession == null) {
            return CollectionsKt.emptyList();
        }
        List listAddIfNotEmpty = OrderConfigurationSelectionDataState4.addIfNotEmpty((List<? extends OrderConfigurationRow>) getOrderConfigurationRows(), (Iterable<? extends OrderConfigurationRow>) getOtherOrderTypeRows());
        List list = listAddIfNotEmpty;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OrderConfigurationRow orderConfigurationRow = (OrderConfigurationRow) it.next();
                if ((orderConfigurationRow instanceof OrderConfigurationRow.EquityDirectOrder) && (((OrderConfigurationRow.EquityDirectOrder) orderConfigurationRow).getOrderConfig() instanceof DirectOrder8)) {
                    listAddIfNotEmpty = OrderConfigurationSelectionDataState4.addIfNotEmpty((List<? extends OrderConfigurationRow>) listAddIfNotEmpty, OrderConfigurationRow.Disclosure.INSTANCE);
                    break;
                }
            }
        }
        return CollectionsKt.toList(CollectionsKt.filterNotNull(OrderConfigurationSelectionDataState4.addIfNotEmpty((List<? extends OrderConfigurationRow>) listAddIfNotEmpty, (Iterable<? extends OrderConfigurationRow>) getUpsellSection())));
    }

    private final boolean getShowRecurringOrders() {
        return this.isRecurringInvestmentRegionSupported && this.side == EquityOrderSide.BUY && !isSubzeroRelated();
    }

    private final List<OrderConfigurationRow> getUpsellSection() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.upsellOption.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return CollectionsKt.emptyList();
        }
        if (this.isOptionsRegionSupported) {
            return CollectionsKt.listOf(new OrderConfigurationRow.OptionUpsell(this.isUk));
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<OrderConfigurationRow> getOrderConfigurationRows() {
        String symbol;
        OrderConfigurationRow.EquityDirectOrder taxLotsSellOrder;
        EquityOrderSide equityOrderSide = this.side;
        if (equityOrderSide != null && this.tradingSession != null && this.account != null) {
            EquityOrderSide equityOrderSide2 = EquityOrderSide.SELL;
            if (equityOrderSide == equityOrderSide2 && this.taxLotPositionEligibility == null) {
                return CollectionsKt.emptyList();
            }
            Instrument instrument = this.instrument;
            if (instrument == null || (symbol = instrument.getSymbol()) == null) {
                return CollectionsKt.emptyList();
            }
            OrderTypes orderTypes = new OrderTypes(this, this.side, symbol, this.tradingSession, this.account);
            OrderConfigurationRow.Header buySellOrderHeader = orderTypes.getBuySellOrderHeader();
            OrderConfigurationRow.EquityDirectOrder dollarOrder = orderTypes.getDollarOrder();
            if (isSubzeroRelated()) {
                dollarOrder = null;
            }
            OrderConfigurationRow.EquityDirectOrder shareOrder$feature_trade_equity_externalDebug = orderTypes.getShareOrder$feature_trade_equity_externalDebug();
            if (this.side == equityOrderSide2 && this.taxLotAccountEligible) {
                Optional<TaxLotEligibility> optional = this.taxLotPositionEligibility;
                if ((optional != null ? optional.getOrNull() : null) != null) {
                    taxLotsSellOrder = orderTypes.getTaxLotsSellOrder();
                }
            } else {
                taxLotsSellOrder = null;
            }
            OrderConfigurationRow.Header conditionalOrderHeader = orderTypes.getConditionalOrderHeader();
            if (isSubzeroRelated()) {
                conditionalOrderHeader = null;
            }
            return CollectionsKt.listOfNotNull((Object[]) new OrderConfigurationRow[]{buySellOrderHeader, dollarOrder, shareOrder$feature_trade_equity_externalDebug, taxLotsSellOrder, conditionalOrderHeader, getShowRecurringOrders() ? orderTypes.getRecurringOrder() : null, orderTypes.getLimitOrder()});
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<OrderConfigurationRow> getOtherOrderTypeRows() {
        String symbol;
        if (this.side != null && this.account != null) {
            Instrument instrument = this.instrument;
            if (instrument == null || (symbol = instrument.getSymbol()) == null) {
                return CollectionsKt.emptyList();
            }
            OrderConfigurationResource.StopLoss stopLoss = new OrderConfigurationResource.StopLoss(this.side, false, symbol, this.dayNightOverlay, true);
            String accountNumber = this.account.getAccountNumber();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
            OrderConfigurationRow.EquityDirectOrder equityDirectOrder = new OrderConfigurationRow.EquityDirectOrder(stopLoss, new ShareStopLoss.New(accountNumber, null, ZERO, orderTimeInForce, null, 18, null), false, false, false, this.side, isBuyToClose(), 16, null);
            if (this.side == EquityOrderSide.SELL_SHORT) {
                return CollectionsKt.listOf(equityDirectOrder);
            }
            OrderConfigurationResource.StopLimit stopLimit = new OrderConfigurationResource.StopLimit(this.side, false, symbol, 0, 0, this.dayNightOverlay, null, true, C29312R.string.order_type_stop_limit_title, 88, null);
            String accountNumber2 = this.account.getAccountNumber();
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return CollectionsKt.listOf((Object[]) new OrderConfigurationRow.EquityDirectOrder[]{equityDirectOrder, new OrderConfigurationRow.EquityDirectOrder(stopLimit, new ShareStopLimit.New(accountNumber2, ZERO, null, ZERO, orderTimeInForce, null, 36, null), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, this.side, isBuyToClose(), 16, 0 == true ? 1 : 0), new OrderConfigurationRow.EquityDirectOrder(new OrderConfigurationResource.TrailingStop(this.side, false, symbol, this.dayNightOverlay, true), new ShareTrailingStop.New(this.account.getAccountNumber(), null, null, orderTimeInForce, null, 22, null), false, false, false, this.side, isBuyToClose(), 16, null)});
        }
        return CollectionsKt.emptyList();
    }

    public final Context getLoggingEquityOrderContext() {
        UUID id;
        String string2;
        Side protobuf;
        BrokerageAccountType brokerageAccountType;
        OrderConfigurationRow orderConfigurationRow = this.selectedRow;
        if (orderConfigurationRow != null && (orderConfigurationRow instanceof OrderConfigurationRow.EquityDirectOrder)) {
            DirectOrder orderConfig = ((OrderConfigurationRow.EquityDirectOrder) orderConfigurationRow).getOrderConfig();
            Order.Configuration orderConfiguration = orderConfig.getOrderConfiguration();
            boolean z = orderConfiguration == Order.Configuration.TRAILING_STOP;
            boolean z2 = orderConfiguration == Order.Configuration.SIMPLE_LIMIT;
            Instrument instrument = this.instrument;
            if (instrument != null && (id = instrument.getId()) != null && (string2 = id.toString()) != null) {
                String symbol = this.instrument.getSymbol();
                EquityOrderSide equityOrderSide = this.side;
                if (equityOrderSide != null && (protobuf = Orders2.toProtobuf(equityOrderSide)) != null) {
                    EquityOrderContext equityOrderContext = new EquityOrderContext(string2, symbol, protobuf, Orders2.toProtobuf(orderConfiguration.getType()), Orders2.toProtobuf(orderConfiguration.getTrigger()), Booleans2.toProtobuf(Boolean.valueOf(orderConfig instanceof DollarBased4)), Booleans2.toProtobuf(Boolean.valueOf(z)), Booleans2.toProtobuf(Boolean.valueOf(z2)), MarketHours.MARKET_HOURS_UNSPECIFIED, null, null, null, null, null, null, null, Orders2.toProtobuf(getPositionEffect()), null, null, null, 982528, null);
                    Account account = this.account;
                    return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContext, null, null, null, null, null, null, null, null, null, null, (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null) ? null : new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -257, -1, -1, 16383, null);
                }
            }
        }
        return null;
    }

    private final OrderPositionEffect getPositionEffect() {
        EquityOrderSide equityOrderSide = this.side;
        int i = equityOrderSide == null ? -1 : WhenMappings.$EnumSwitchMapping$1[equityOrderSide.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return OrderPositionEffect.OPEN;
        }
        if (i == 2) {
            return OrderPositionEffect.CLOSE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (isBuyToClose()) {
            return OrderPositionEffect.CLOSE;
        }
        return OrderPositionEffect.OPEN;
    }

    public final boolean getTaxLotsSelected() {
        OrderConfigurationRow orderConfigurationRow = this.selectedRow;
        OrderConfigurationRow.EquityDirectOrder equityDirectOrder = orderConfigurationRow instanceof OrderConfigurationRow.EquityDirectOrder ? (OrderConfigurationRow.EquityDirectOrder) orderConfigurationRow : null;
        return equityDirectOrder != null && equityDirectOrder.isTaxLots();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSubzeroRelated() {
        return this.side == EquityOrderSide.SELL_SHORT || isBuyToClose();
    }

    /* compiled from: OrderConfigurationSelectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R \u0010\u0018\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010#\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0019\u0012\u0004\b%\u0010\u001d\u001a\u0004\b$\u0010\u001bR \u0010&\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0019\u0012\u0004\b(\u0010\u001d\u001a\u0004\b'\u0010\u001bR\"\u0010)\u001a\u0004\u0018\u00010\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0019\u0012\u0004\b+\u0010\u001d\u001a\u0004\b*\u0010\u001bR\"\u0010,\u001a\u0004\u0018\u00010\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b,\u0010\u0019\u0012\u0004\b.\u0010\u001d\u001a\u0004\b-\u0010\u001bR\u001c\u0010/\u001a\u0004\u0018\u00010\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0019\u001a\u0004\b0\u0010\u001bR\u001a\u00101\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010\u0019\u001a\u0004\b2\u0010\u001bR\u0016\u00104\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001b¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState$OrderTypes;", "", "Lcom/robinhood/models/db/EquityOrderSide;", "side", "", "symbol", "Lcom/robinhood/models/db/TradingSession;", "tradingSession", "Lcom/robinhood/models/db/Account;", "account", "<init>", "(Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/models/db/Account;)V", "j$/time/Instant", "kotlin.jvm.PlatformType", GoldFeature.INSTANT, "Lj$/time/Instant;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Header;", "buySellOrderHeader", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Header;", "getBuySellOrderHeader", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Header;", "conditionalOrderHeader", "getConditionalOrderHeader", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$EquityDirectOrder;", "limitOrder", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$EquityDirectOrder;", "getLimitOrder$feature_trade_equity_externalDebug", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$EquityDirectOrder;", "getLimitOrder$feature_trade_equity_externalDebug$annotations", "()V", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Recurring;", "recurringOrder", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Recurring;", "getRecurringOrder", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Recurring;", "marketDollarOrder", "getMarketDollarOrder$feature_trade_equity_externalDebug", "getMarketDollarOrder$feature_trade_equity_externalDebug$annotations", "marketShareOrder", "getMarketShareOrder$feature_trade_equity_externalDebug", "getMarketShareOrder$feature_trade_equity_externalDebug$annotations", "simpleLimitShareOrder", "getSimpleLimitShareOrder$feature_trade_equity_externalDebug", "getSimpleLimitShareOrder$feature_trade_equity_externalDebug$annotations", "simpleLimitDollarOrder", "getSimpleLimitDollarOrder$feature_trade_equity_externalDebug", "getSimpleLimitDollarOrder$feature_trade_equity_externalDebug$annotations", "dollarOrder", "getDollarOrder$feature_trade_equity_externalDebug", "taxLotsSellOrder", "getTaxLotsSellOrder$feature_trade_equity_externalDebug", "getShareOrder$feature_trade_equity_externalDebug", "shareOrder", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class OrderTypes {
        private final OrderConfigurationRow.Header buySellOrderHeader;
        private final OrderConfigurationRow.Header conditionalOrderHeader;
        private final OrderConfigurationRow.EquityDirectOrder dollarOrder;
        private final Instant instant;
        private final OrderConfigurationRow.EquityDirectOrder limitOrder;
        private final OrderConfigurationRow.EquityDirectOrder marketDollarOrder;
        private final OrderConfigurationRow.EquityDirectOrder marketShareOrder;
        private final OrderConfigurationRow.Recurring recurringOrder;
        private final OrderConfigurationRow.EquityDirectOrder simpleLimitDollarOrder;
        private final OrderConfigurationRow.EquityDirectOrder simpleLimitShareOrder;
        private final OrderConfigurationRow.EquityDirectOrder taxLotsSellOrder;
        final /* synthetic */ OrderConfigurationSelectionDataState this$0;

        /* compiled from: OrderConfigurationSelectionDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ void getLimitOrder$feature_trade_equity_externalDebug$annotations() {
        }

        /* renamed from: getMarketDollarOrder$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2484x547dd576() {
        }

        /* renamed from: getMarketShareOrder$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2485xe881dd35() {
        }

        /* renamed from: getSimpleLimitDollarOrder$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2486xab72af7() {
        }

        /* renamed from: getSimpleLimitShareOrder$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2487x40f75394() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v2, types: [com.robinhood.android.trading.contracts.configuration.AdvancedOrder$MarketNew] */
        /* JADX WARN: Type inference failed for: r4v23, types: [com.robinhood.android.trading.contracts.configuration.AdvancedOrder$MarketNew] */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v26 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v28 */
        /* JADX WARN: Type inference failed for: r8v29 */
        /* JADX WARN: Type inference failed for: r8v30 */
        public OrderTypes(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, EquityOrderSide side, String symbol, TradingSession tradingSession, Account account) {
            int i;
            ShareMarket.New marketNew;
            AdvancedOrder.LimitNew limitNew;
            boolean z;
            TaxLotEligibility orNull;
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
            Intrinsics.checkNotNullParameter(account, "account");
            this.this$0 = orderConfigurationSelectionDataState;
            this.instant = Instant.now();
            int i2 = 2;
            if (!orderConfigurationSelectionDataState.isBuyToClose()) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                if (i3 == 1) {
                    i = C29365R.string.order_type_buy_orders_header_text;
                } else if (i3 == 2) {
                    i = C29365R.string.order_type_sell_orders_header_text;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C29365R.string.order_type_generic_orders_header_text;
                }
            } else {
                i = C29365R.string.order_type_generic_orders_header_text;
            }
            int i4 = i;
            DayNightOverlay dayNightOverlay = orderConfigurationSelectionDataState.getDayNightOverlay();
            OrderTypeSelector orderTypeSelectorResponse = orderConfigurationSelectionDataState.getOrderTypeSelectorResponse();
            BigDecimal bigDecimal = null;
            ?? r8 = 0;
            ?? r82 = 0;
            ?? r83 = 0;
            this.buySellOrderHeader = new OrderConfigurationRow.Header(i4, true, !orderConfigurationSelectionDataState.isSubzeroRelated() ? orderTypeSelectorResponse != null ? orderTypeSelectorResponse.getBuyOrSellOrderHeaderIconWithAction() : null : null, true, dayNightOverlay);
            this.conditionalOrderHeader = new OrderConfigurationRow.Header(C29365R.string.order_type_conditional_orders_header_text, false, null, false, orderConfigurationSelectionDataState.getDayNightOverlay(), 12, null);
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.limitOrder = new OrderConfigurationRow.EquityDirectOrder(new OrderConfigurationResource.Limit(side, symbol, orderConfigurationSelectionDataState.getShowAdtLimitOrderIcon(), 0, 0, 0, orderConfigurationSelectionDataState.getShowAdtLimitOrderIcon() ? OrderConfigurationSelectionDataState2.INSTANCE.getLambda$389010241$feature_trade_equity_externalDebug() : null, orderConfigurationSelectionDataState.getDayNightOverlay(), true, C29312R.string.order_type_limit_title, 56, null), new AdvancedOrder.LimitNew(account.getAccountNumber(), null, null, null, null, false, 30, defaultConstructorMarker), false, false, false, side, orderConfigurationSelectionDataState.isBuyToClose(), 16, defaultConstructorMarker);
            this.recurringOrder = new OrderConfigurationRow.Recurring(new OrderConfigurationResource.Recurring(!orderConfigurationSelectionDataState.isRecurringTradable() || orderConfigurationSelectionDataState.isShortPosition(), symbol, orderConfigurationSelectionDataState.getDayNightOverlay(), true, account, orderConfigurationSelectionDataState.getShouldShowRecurringComingSoon()), orderConfigurationSelectionDataState.isShortPosition(), orderConfigurationSelectionDataState.isRecurringTradable(), orderConfigurationSelectionDataState.getRecurringTradabilityReason(), symbol);
            OrderConfigurationRow.EquityDirectOrder equityDirectOrder = new OrderConfigurationRow.EquityDirectOrder(new OrderConfigurationResource.MarketDollar(side, orderConfigurationSelectionDataState.isShortPosition(), symbol, orderConfigurationSelectionDataState.getDayNightOverlay(), orderConfigurationSelectionDataState.isFxAtTrade(), true), new DollarBased3.New(account.getAccountNumber(), bigDecimal, i2, r83 == true ? 1 : 0), orderConfigurationSelectionDataState.isShortPosition(), orderConfigurationSelectionDataState.isShortPosition(), false, side, orderConfigurationSelectionDataState.isBuyToClose(), 16, null);
            this.marketDollarOrder = equityDirectOrder;
            OrderConfigurationResource.MarketShares marketShares = new OrderConfigurationResource.MarketShares(side, symbol, orderConfigurationSelectionDataState.isBuyToClose(), orderConfigurationSelectionDataState.getDayNightOverlay(), orderConfigurationSelectionDataState.isFxAtTrade(), true);
            if (orderConfigurationSelectionDataState.isSubzeroRelated()) {
                marketNew = new AdvancedOrder.MarketNew(account.getAccountNumber(), null, false, 2, null);
            } else {
                marketNew = new ShareMarket.New(account.getAccountNumber(), r82 == true ? 1 : 0, i2, r8 == true ? 1 : 0);
            }
            this.marketShareOrder = new OrderConfigurationRow.EquityDirectOrder(marketShares, marketNew, false, false, false, side, orderConfigurationSelectionDataState.isBuyToClose(), 16, null);
            BigDecimal bigDecimal2 = orderConfigurationSelectionDataState.presetPercentLimit;
            this.simpleLimitShareOrder = bigDecimal2 != null ? new OrderConfigurationRow.EquityDirectOrder(new OrderConfigurationResource.MarketShares(side, symbol, false, orderConfigurationSelectionDataState.getDayNightOverlay(), orderConfigurationSelectionDataState.isFxAtTrade(), true), new ShareSimpleLimit.New(account.getAccountNumber(), null, bigDecimal2, 2, null), false, false, false, side, false, 16, null) : null;
            BigDecimal bigDecimal3 = orderConfigurationSelectionDataState.presetPercentLimit;
            OrderConfigurationRow.EquityDirectOrder equityDirectOrder2 = bigDecimal3 != null ? new OrderConfigurationRow.EquityDirectOrder(new OrderConfigurationResource.MarketDollar(side, orderConfigurationSelectionDataState.isShortPosition(), symbol, orderConfigurationSelectionDataState.getDayNightOverlay(), orderConfigurationSelectionDataState.isFxAtTrade(), true), new DollarBased5.New(account.getAccountNumber(), null, bigDecimal3, 2, null), orderConfigurationSelectionDataState.isShortPosition(), orderConfigurationSelectionDataState.isShortPosition(), false, side, orderConfigurationSelectionDataState.isBuyToClose(), 16, null) : null;
            this.simpleLimitDollarOrder = equityDirectOrder2;
            boolean z2 = tradingSession instanceof TradingSession.Regular;
            this.dollarOrder = (!z2 && (tradingSession instanceof TradingSession.Extended)) ? equityDirectOrder2 : equityDirectOrder;
            OrderConfigurationResource.TaxLots taxLots = new OrderConfigurationResource.TaxLots(null, orderConfigurationSelectionDataState.getDayNightOverlay(), true, false, symbol, 1, null);
            if (z2) {
                limitNew = new AdvancedOrder.MarketNew(account.getAccountNumber(), null, true, 2, null);
            } else {
                limitNew = new AdvancedOrder.LimitNew(account.getAccountNumber(), null, null, null, null, true, 30, null);
            }
            Optional<TaxLotEligibility> taxLotPositionEligibility = orderConfigurationSelectionDataState.getTaxLotPositionEligibility();
            if (taxLotPositionEligibility == null || (orNull = taxLotPositionEligibility.getOrNull()) == null) {
                z = true;
            } else {
                z = (orNull.getCustomTaxLotSelectionEligible() && orNull.getNotEligibleReason() == null) ? false : true;
            }
            this.taxLotsSellOrder = new OrderConfigurationRow.EquityDirectOrder(taxLots, limitNew, z, orderConfigurationSelectionDataState.isShortPosition(), true, side, false);
        }

        public final OrderConfigurationRow.Header getBuySellOrderHeader() {
            return this.buySellOrderHeader;
        }

        public final OrderConfigurationRow.Header getConditionalOrderHeader() {
            return this.conditionalOrderHeader;
        }

        /* renamed from: getLimitOrder$feature_trade_equity_externalDebug, reason: from getter */
        public final OrderConfigurationRow.EquityDirectOrder getLimitOrder() {
            return this.limitOrder;
        }

        public final OrderConfigurationRow.Recurring getRecurringOrder() {
            return this.recurringOrder;
        }

        /* renamed from: getMarketDollarOrder$feature_trade_equity_externalDebug, reason: from getter */
        public final OrderConfigurationRow.EquityDirectOrder getMarketDollarOrder() {
            return this.marketDollarOrder;
        }

        /* renamed from: getMarketShareOrder$feature_trade_equity_externalDebug, reason: from getter */
        public final OrderConfigurationRow.EquityDirectOrder getMarketShareOrder() {
            return this.marketShareOrder;
        }

        /* renamed from: getSimpleLimitShareOrder$feature_trade_equity_externalDebug, reason: from getter */
        public final OrderConfigurationRow.EquityDirectOrder getSimpleLimitShareOrder() {
            return this.simpleLimitShareOrder;
        }

        /* renamed from: getSimpleLimitDollarOrder$feature_trade_equity_externalDebug, reason: from getter */
        public final OrderConfigurationRow.EquityDirectOrder getSimpleLimitDollarOrder() {
            return this.simpleLimitDollarOrder;
        }

        /* renamed from: getDollarOrder$feature_trade_equity_externalDebug, reason: from getter */
        public final OrderConfigurationRow.EquityDirectOrder getDollarOrder() {
            return this.dollarOrder;
        }

        public final OrderConfigurationRow.EquityDirectOrder getShareOrder$feature_trade_equity_externalDebug() {
            Instrument instrument;
            Instrument instrument2;
            if (this.this$0.isSubzeroRelated()) {
                return this.marketShareOrder;
            }
            if (this.this$0.getTradingSession() instanceof TradingSession.Regular) {
                if (this.this$0.getSide() == EquityOrderSide.BUY && (((instrument2 = this.this$0.getInstrument()) != null && instrument2.isOtc()) || !this.this$0.getMarketBuysEnabled())) {
                    return this.simpleLimitShareOrder;
                }
                return this.marketShareOrder;
            }
            if (this.this$0.getTradingSession() instanceof TradingSession.Extended) {
                return this.simpleLimitShareOrder;
            }
            if (this.this$0.getSide() == EquityOrderSide.BUY && (((instrument = this.this$0.getInstrument()) != null && instrument.isOtc()) || !this.this$0.getMarketBuysEnabled())) {
                return this.simpleLimitShareOrder;
            }
            return this.marketShareOrder;
        }

        /* renamed from: getTaxLotsSellOrder$feature_trade_equity_externalDebug, reason: from getter */
        public final OrderConfigurationRow.EquityDirectOrder getTaxLotsSellOrder() {
            return this.taxLotsSellOrder;
        }
    }
}
