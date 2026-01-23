package com.robinhood.android.equities.equitytrade;

import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder4;
import com.robinhood.android.trading.contracts.configuration.DirectOrder8;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration3;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.api.bonfire.OrderEntryPoint;
import com.robinhood.models.api.bonfire.OrderInputFormat;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.DirectOrderRequestDrafter;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.orderstate.Quantity;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EquityOrderIntent.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u00103J\u0010\u00105\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bA\u00103J\u0010\u0010B\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bL\u0010KJ\u0012\u0010M\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bQ\u0010RJì\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010X\u001a\u00020WHÖ\u0001¢\u0006\u0004\bX\u0010YJ\u001a\u0010[\u001a\u00020\u001f2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010]\u001a\u0004\b^\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010_\u001a\u0004\b`\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010a\u001a\u0004\bb\u00103R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010a\u001a\u0004\bc\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\be\u00106R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010f\u001a\u0004\bg\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010h\u001a\u0004\bi\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010j\u001a\u0004\bk\u0010<R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010l\u001a\u0004\bm\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010n\u001a\u0004\bo\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bp\u00103R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010q\u001a\u0004\br\u0010CR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010s\u001a\u0004\bt\u0010ER\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010u\u001a\u0004\bv\u0010GR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010w\u001a\u0004\bx\u0010IR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010y\u001a\u0004\bz\u0010KR\u0017\u0010!\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010y\u001a\u0004\b{\u0010KR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b\"\u0010|\u001a\u0004\b}\u0010NR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010~\u001a\u0004\b\u007f\u0010PR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010RR\u001d\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0087\u0001"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "", "Ljava/util/UUID;", "refId", "Lcom/robinhood/models/db/EquityOrderSide;", "tradeSide", "Ljava/math/BigDecimal;", "limitPrice", "stopPrice", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lcom/robinhood/shared/trading/orderstate/Quantity;", "orderTradeAmount", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "Lcom/robinhood/models/db/OrderMarketHours;", "orderMarketHours", "Lcom/robinhood/models/db/Order;", "existingOrder", "selectedPrice", "Lcom/robinhood/models/db/TradingSession;", "tradingSession", "j$/time/Clock", Card.Icon.CLOCK, "", "", "checkOverrides", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "orderFlowSource", "", "skipConfirmation", "autoSend", "flatten", "Lcom/robinhood/models/db/Position;", "position", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "shortingInfo", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/shared/trading/orderstate/Quantity;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/Order;Ljava/math/BigDecimal;Lcom/robinhood/models/db/TradingSession;Lj$/time/Clock;Ljava/util/List;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;ZZLjava/lang/Boolean;Lcom/robinhood/models/db/Position;Lcom/robinhood/shared/equities/subzero/ShortingInfo;)V", "marketBuysEnabled", "subzeroEnabled", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "createDirectDraft", "(ZZ)Lcom/robinhood/models/db/DirectOrderRequestDraft;", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/db/EquityOrderSide;", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "()Lcom/robinhood/models/db/Account;", "component6", "()Lcom/robinhood/models/db/Instrument;", "component7", "()Lcom/robinhood/shared/trading/orderstate/Quantity;", "component8", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component9", "()Lcom/robinhood/models/db/OrderMarketHours;", "component10", "()Lcom/robinhood/models/db/Order;", "component11", "component12", "()Lcom/robinhood/models/db/TradingSession;", "component13", "()Lj$/time/Clock;", "component14", "()Ljava/util/List;", "component15", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "component16", "()Z", "component17", "component18", "()Ljava/lang/Boolean;", "component19", "()Lcom/robinhood/models/db/Position;", "component20", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/shared/trading/orderstate/Quantity;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/Order;Ljava/math/BigDecimal;Lcom/robinhood/models/db/TradingSession;Lj$/time/Clock;Ljava/util/List;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;ZZLjava/lang/Boolean;Lcom/robinhood/models/db/Position;Lcom/robinhood/shared/equities/subzero/ShortingInfo;)Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getRefId", "Lcom/robinhood/models/db/EquityOrderSide;", "getTradeSide", "Ljava/math/BigDecimal;", "getLimitPrice", "getStopPrice", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "Lcom/robinhood/shared/trading/orderstate/Quantity;", "getOrderTradeAmount", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForce", "Lcom/robinhood/models/db/OrderMarketHours;", "getOrderMarketHours", "Lcom/robinhood/models/db/Order;", "getExistingOrder", "getSelectedPrice", "Lcom/robinhood/models/db/TradingSession;", "getTradingSession", "Lj$/time/Clock;", "getClock", "Ljava/util/List;", "getCheckOverrides", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getOrderFlowSource", "Z", "getSkipConfirmation", "getAutoSend", "Ljava/lang/Boolean;", "getFlatten", "Lcom/robinhood/models/db/Position;", "getPosition", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "getShortingInfo", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "getOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityOrderIntent {
    private final Account account;
    private final boolean autoSend;
    private final List<String> checkOverrides;
    private final Clock clock;
    private final Order existingOrder;
    private final Boolean flatten;
    private final Instrument instrument;
    private final BigDecimal limitPrice;
    private final ShareBasedOrderConfiguration orderConfiguration;
    private final EquityOrderFlowSource orderFlowSource;
    private final OrderMarketHours orderMarketHours;
    private final Quantity orderTradeAmount;
    private final Position position;
    private final UUID refId;
    private final BigDecimal selectedPrice;
    private final ShortingInfo shortingInfo;
    private final boolean skipConfirmation;
    private final BigDecimal stopPrice;
    private final OrderTimeInForce timeInForce;
    private final EquityOrderSide tradeSide;
    private final TradingSession tradingSession;

    /* compiled from: EquityOrderIntent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[EquityOrderFlowSource.values().length];
            try {
                iArr2[EquityOrderFlowSource.BW_ADVANCED_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderFlowSource.LADDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EquityOrderFlowSource.SDP_TRADE_BAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EquityOrderFlowSource.INSTRUMENT_ROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EquityOrderFlowSource.CANCEL_NEW_HISTORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EquityOrderFlowSource.ANALYST_REPORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EquityOrderFlowSource.LEVEL_2_MARKET_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ EquityOrderIntent copy$default(EquityOrderIntent equityOrderIntent, UUID uuid, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, Account account, Instrument instrument, Quantity quantity, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, Order order, BigDecimal bigDecimal3, TradingSession tradingSession, Clock clock, List list, EquityOrderFlowSource equityOrderFlowSource, boolean z, boolean z2, Boolean bool, Position position, ShortingInfo shortingInfo, int i, Object obj) {
        ShortingInfo shortingInfo2;
        Position position2;
        UUID uuid2 = (i & 1) != 0 ? equityOrderIntent.refId : uuid;
        EquityOrderSide equityOrderSide2 = (i & 2) != 0 ? equityOrderIntent.tradeSide : equityOrderSide;
        BigDecimal bigDecimal4 = (i & 4) != 0 ? equityOrderIntent.limitPrice : bigDecimal;
        BigDecimal bigDecimal5 = (i & 8) != 0 ? equityOrderIntent.stopPrice : bigDecimal2;
        Account account2 = (i & 16) != 0 ? equityOrderIntent.account : account;
        Instrument instrument2 = (i & 32) != 0 ? equityOrderIntent.instrument : instrument;
        Quantity quantity2 = (i & 64) != 0 ? equityOrderIntent.orderTradeAmount : quantity;
        OrderTimeInForce orderTimeInForce2 = (i & 128) != 0 ? equityOrderIntent.timeInForce : orderTimeInForce;
        OrderMarketHours orderMarketHours2 = (i & 256) != 0 ? equityOrderIntent.orderMarketHours : orderMarketHours;
        Order order2 = (i & 512) != 0 ? equityOrderIntent.existingOrder : order;
        BigDecimal bigDecimal6 = (i & 1024) != 0 ? equityOrderIntent.selectedPrice : bigDecimal3;
        TradingSession tradingSession2 = (i & 2048) != 0 ? equityOrderIntent.tradingSession : tradingSession;
        Clock clock2 = (i & 4096) != 0 ? equityOrderIntent.clock : clock;
        List list2 = (i & 8192) != 0 ? equityOrderIntent.checkOverrides : list;
        UUID uuid3 = uuid2;
        EquityOrderFlowSource equityOrderFlowSource2 = (i & 16384) != 0 ? equityOrderIntent.orderFlowSource : equityOrderFlowSource;
        boolean z3 = (i & 32768) != 0 ? equityOrderIntent.skipConfirmation : z;
        boolean z4 = (i & 65536) != 0 ? equityOrderIntent.autoSend : z2;
        Boolean bool2 = (i & 131072) != 0 ? equityOrderIntent.flatten : bool;
        Position position3 = (i & 262144) != 0 ? equityOrderIntent.position : position;
        if ((i & 524288) != 0) {
            position2 = position3;
            shortingInfo2 = equityOrderIntent.shortingInfo;
        } else {
            shortingInfo2 = shortingInfo;
            position2 = position3;
        }
        return equityOrderIntent.copy(uuid3, equityOrderSide2, bigDecimal4, bigDecimal5, account2, instrument2, quantity2, orderTimeInForce2, orderMarketHours2, order2, bigDecimal6, tradingSession2, clock2, list2, equityOrderFlowSource2, z3, z4, bool2, position2, shortingInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component10, reason: from getter */
    public final Order getExistingOrder() {
        return this.existingOrder;
    }

    /* renamed from: component11, reason: from getter */
    public final BigDecimal getSelectedPrice() {
        return this.selectedPrice;
    }

    /* renamed from: component12, reason: from getter */
    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component13, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    public final List<String> component14() {
        return this.checkOverrides;
    }

    /* renamed from: component15, reason: from getter */
    public final EquityOrderFlowSource getOrderFlowSource() {
        return this.orderFlowSource;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getAutoSend() {
        return this.autoSend;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getFlatten() {
        return this.flatten;
    }

    /* renamed from: component19, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final EquityOrderSide getTradeSide() {
        return this.tradeSide;
    }

    /* renamed from: component20, reason: from getter */
    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component6, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component7, reason: from getter */
    public final Quantity getOrderTradeAmount() {
        return this.orderTradeAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component9, reason: from getter */
    public final OrderMarketHours getOrderMarketHours() {
        return this.orderMarketHours;
    }

    public final EquityOrderIntent copy(UUID refId, EquityOrderSide tradeSide, BigDecimal limitPrice, BigDecimal stopPrice, Account account, Instrument instrument, Quantity orderTradeAmount, OrderTimeInForce timeInForce, OrderMarketHours orderMarketHours, Order existingOrder, BigDecimal selectedPrice, TradingSession tradingSession, Clock clock, List<String> checkOverrides, EquityOrderFlowSource orderFlowSource, boolean skipConfirmation, boolean autoSend, Boolean flatten, Position position, ShortingInfo shortingInfo) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(orderTradeAmount, "orderTradeAmount");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(orderMarketHours, "orderMarketHours");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(orderFlowSource, "orderFlowSource");
        return new EquityOrderIntent(refId, tradeSide, limitPrice, stopPrice, account, instrument, orderTradeAmount, timeInForce, orderMarketHours, existingOrder, selectedPrice, tradingSession, clock, checkOverrides, orderFlowSource, skipConfirmation, autoSend, flatten, position, shortingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderIntent)) {
            return false;
        }
        EquityOrderIntent equityOrderIntent = (EquityOrderIntent) other;
        return Intrinsics.areEqual(this.refId, equityOrderIntent.refId) && this.tradeSide == equityOrderIntent.tradeSide && Intrinsics.areEqual(this.limitPrice, equityOrderIntent.limitPrice) && Intrinsics.areEqual(this.stopPrice, equityOrderIntent.stopPrice) && Intrinsics.areEqual(this.account, equityOrderIntent.account) && Intrinsics.areEqual(this.instrument, equityOrderIntent.instrument) && Intrinsics.areEqual(this.orderTradeAmount, equityOrderIntent.orderTradeAmount) && this.timeInForce == equityOrderIntent.timeInForce && this.orderMarketHours == equityOrderIntent.orderMarketHours && Intrinsics.areEqual(this.existingOrder, equityOrderIntent.existingOrder) && Intrinsics.areEqual(this.selectedPrice, equityOrderIntent.selectedPrice) && Intrinsics.areEqual(this.tradingSession, equityOrderIntent.tradingSession) && Intrinsics.areEqual(this.clock, equityOrderIntent.clock) && Intrinsics.areEqual(this.checkOverrides, equityOrderIntent.checkOverrides) && this.orderFlowSource == equityOrderIntent.orderFlowSource && this.skipConfirmation == equityOrderIntent.skipConfirmation && this.autoSend == equityOrderIntent.autoSend && Intrinsics.areEqual(this.flatten, equityOrderIntent.flatten) && Intrinsics.areEqual(this.position, equityOrderIntent.position) && Intrinsics.areEqual(this.shortingInfo, equityOrderIntent.shortingInfo);
    }

    public int hashCode() {
        int iHashCode = ((this.refId.hashCode() * 31) + this.tradeSide.hashCode()) * 31;
        BigDecimal bigDecimal = this.limitPrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.stopPrice;
        int iHashCode3 = (((((((((((iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.account.hashCode()) * 31) + this.instrument.hashCode()) * 31) + this.orderTradeAmount.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.orderMarketHours.hashCode()) * 31;
        Order order = this.existingOrder;
        int iHashCode4 = (iHashCode3 + (order == null ? 0 : order.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.selectedPrice;
        int iHashCode5 = (((((((((((((iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31) + this.tradingSession.hashCode()) * 31) + this.clock.hashCode()) * 31) + this.checkOverrides.hashCode()) * 31) + this.orderFlowSource.hashCode()) * 31) + Boolean.hashCode(this.skipConfirmation)) * 31) + Boolean.hashCode(this.autoSend)) * 31;
        Boolean bool = this.flatten;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Position position = this.position;
        int iHashCode7 = (iHashCode6 + (position == null ? 0 : position.hashCode())) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        return iHashCode7 + (shortingInfo != null ? shortingInfo.hashCode() : 0);
    }

    public String toString() {
        return "EquityOrderIntent(refId=" + this.refId + ", tradeSide=" + this.tradeSide + ", limitPrice=" + this.limitPrice + ", stopPrice=" + this.stopPrice + ", account=" + this.account + ", instrument=" + this.instrument + ", orderTradeAmount=" + this.orderTradeAmount + ", timeInForce=" + this.timeInForce + ", orderMarketHours=" + this.orderMarketHours + ", existingOrder=" + this.existingOrder + ", selectedPrice=" + this.selectedPrice + ", tradingSession=" + this.tradingSession + ", clock=" + this.clock + ", checkOverrides=" + this.checkOverrides + ", orderFlowSource=" + this.orderFlowSource + ", skipConfirmation=" + this.skipConfirmation + ", autoSend=" + this.autoSend + ", flatten=" + this.flatten + ", position=" + this.position + ", shortingInfo=" + this.shortingInfo + ")";
    }

    public EquityOrderIntent(UUID refId, EquityOrderSide tradeSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, Account account, Instrument instrument, Quantity orderTradeAmount, OrderTimeInForce timeInForce, OrderMarketHours orderMarketHours, Order order, BigDecimal bigDecimal3, TradingSession tradingSession, Clock clock, List<String> checkOverrides, EquityOrderFlowSource orderFlowSource, boolean z, boolean z2, Boolean bool, Position position, ShortingInfo shortingInfo) throws Exception {
        ShareBasedOrderConfiguration draft;
        BigDecimal bigDecimal4 = bigDecimal;
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(orderTradeAmount, "orderTradeAmount");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(orderMarketHours, "orderMarketHours");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(orderFlowSource, "orderFlowSource");
        this.refId = refId;
        this.tradeSide = tradeSide;
        this.limitPrice = bigDecimal4;
        this.stopPrice = bigDecimal2;
        this.account = account;
        this.instrument = instrument;
        this.orderTradeAmount = orderTradeAmount;
        this.timeInForce = timeInForce;
        this.orderMarketHours = orderMarketHours;
        this.existingOrder = order;
        this.selectedPrice = bigDecimal3;
        this.tradingSession = tradingSession;
        this.clock = clock;
        this.checkOverrides = checkOverrides;
        this.orderFlowSource = orderFlowSource;
        this.skipConfirmation = z;
        this.autoSend = z2;
        this.flatten = bool;
        this.position = position;
        this.shortingInfo = shortingInfo;
        if (order != null) {
            draft = EquityOrderIntent2.extendWithDraft(order, bigDecimal4 == null ? bigDecimal2 : bigDecimal4);
            if (draft == null) {
                throw new Exception("Attempted to edit an unsupported ordertype " + order.getConfiguration());
            }
        } else if (bigDecimal4 != null) {
            draft = new AdvancedOrder.LimitDraft(account.getAccountNumber(), orderTradeAmount.getAmount(), bigDecimal4, timeInForce, orderMarketHours, false, true).completedDraft();
        } else if (bigDecimal2 != null) {
            draft = new ShareStopLoss.Draft(account.getAccountNumber(), orderTradeAmount.getAmount(), bigDecimal2, timeInForce, orderMarketHours, true);
        } else {
            draft = new ShareMarket.Draft(account.getAccountNumber(), orderTradeAmount.getAmount(), true);
        }
        this.orderConfiguration = draft;
    }

    public /* synthetic */ EquityOrderIntent(UUID uuid, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, Account account, Instrument instrument, Quantity quantity, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, Order order, BigDecimal bigDecimal3, TradingSession tradingSession, Clock clock, List list, EquityOrderFlowSource equityOrderFlowSource, boolean z, boolean z2, Boolean bool, Position position, ShortingInfo shortingInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, equityOrderSide, bigDecimal, bigDecimal2, account, instrument, quantity, orderTimeInForce, orderMarketHours, order, bigDecimal3, tradingSession, clock, list, equityOrderFlowSource, z, z2, (i & 131072) != 0 ? null : bool, (i & 262144) != 0 ? null : position, (i & 524288) != 0 ? null : shortingInfo);
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final EquityOrderSide getTradeSide() {
        return this.tradeSide;
    }

    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Quantity getOrderTradeAmount() {
        return this.orderTradeAmount;
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final OrderMarketHours getOrderMarketHours() {
        return this.orderMarketHours;
    }

    public final Order getExistingOrder() {
        return this.existingOrder;
    }

    public final BigDecimal getSelectedPrice() {
        return this.selectedPrice;
    }

    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final List<String> getCheckOverrides() {
        return this.checkOverrides;
    }

    public final EquityOrderFlowSource getOrderFlowSource() {
        return this.orderFlowSource;
    }

    public final boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    public final boolean getAutoSend() {
        return this.autoSend;
    }

    public final Boolean getFlatten() {
        return this.flatten;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    public final ShareBasedOrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    public final DirectOrderRequestDraft createDirectDraft(boolean marketBuysEnabled, boolean subzeroEnabled) {
        OrderTimeInForce orderTimeInForce;
        OrderPositionEffect orderPositionEffect;
        DirectOrderRequestDrafter directOrderRequestDrafter;
        OrderInputFormat orderInputFormat;
        OrderEntryPoint orderEntryPoint;
        OrderEntryPoint orderEntryPoint2;
        BigDecimal shareQuantity = this.orderConfiguration.getShareQuantity();
        if (shareQuantity == null) {
            shareQuantity = this.orderTradeAmount.getAmount();
        }
        OrderRequest2.ShareQuantity shareQuantity2 = new OrderRequest2.ShareQuantity(shareQuantity);
        DirectOrderRequestDrafter directOrderRequestDrafter2 = DirectOrderRequestDrafter.INSTANCE;
        UUID uuid = this.refId;
        Account account = this.account;
        Instrument instrument = this.instrument;
        BigDecimal limitPrice = this.selectedPrice;
        if (limitPrice == null) {
            limitPrice = EquityOrderConfiguration3.getLimitPrice(this.orderConfiguration);
        }
        BigDecimal bigDecimal = limitPrice;
        EquityOrderSide equityOrderSide = this.tradeSide;
        Order.Configuration orderConfiguration = this.orderConfiguration.getOrderConfiguration();
        if (this.orderConfiguration instanceof DirectOrder4) {
            orderTimeInForce = OrderTimeInForce.GFD;
        } else {
            orderTimeInForce = this.timeInForce;
        }
        OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
        TradingSession tradingSession = this.tradingSession;
        List<String> list = this.checkOverrides;
        Order order = this.existingOrder;
        List<TaxLotSelection> listEmptyList = CollectionsKt.emptyList();
        int i = WhenMappings.$EnumSwitchMapping$0[this.tradeSide.ordinal()];
        if (i != 1) {
            if (i == 2) {
                orderPositionEffect = OrderPositionEffect.CLOSE;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                orderPositionEffect = OrderPositionEffect.OPEN;
            }
        } else if (Position5.isShortPositionOrPending(this.position)) {
            orderPositionEffect = OrderPositionEffect.CLOSE;
        } else {
            orderPositionEffect = OrderPositionEffect.OPEN;
        }
        OrderPositionEffect orderPositionEffect2 = orderPositionEffect;
        OrderMarketHours orderMarketHours = this.orderMarketHours;
        ShortingInfo shortingInfo = this.shortingInfo;
        BigDecimal fee = shortingInfo != null ? shortingInfo.getFee() : null;
        Instant instant = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        ShareBasedOrderConfiguration shareBasedOrderConfiguration = this.orderConfiguration;
        DirectOrder8 directOrder8 = shareBasedOrderConfiguration instanceof DirectOrder8 ? (DirectOrder8) shareBasedOrderConfiguration : null;
        BigDecimal stopPrice = directOrder8 != null ? directOrder8.getStopPrice() : null;
        EquityOrderFlowSource equityOrderFlowSource = this.orderFlowSource;
        if (equityOrderFlowSource == EquityOrderFlowSource.BW_ADVANCED_CHART) {
            orderInputFormat = OrderInputFormat.CHARTS;
            directOrderRequestDrafter = directOrderRequestDrafter2;
        } else {
            EquityOrderFlowSource equityOrderFlowSource2 = EquityOrderFlowSource.LADDER;
            if (equityOrderFlowSource == equityOrderFlowSource2) {
                directOrderRequestDrafter = directOrderRequestDrafter2;
                if (Intrinsics.areEqual(this.flatten, Boolean.TRUE)) {
                    orderInputFormat = OrderInputFormat.LADDER;
                }
            } else {
                directOrderRequestDrafter = directOrderRequestDrafter2;
            }
            EquityOrderFlowSource equityOrderFlowSource3 = this.orderFlowSource;
            if ((equityOrderFlowSource3 != equityOrderFlowSource2 || this.autoSend) && equityOrderFlowSource3 == equityOrderFlowSource2) {
                orderInputFormat = OrderInputFormat.LADDER;
            } else {
                orderInputFormat = OrderInputFormat.SHARES;
            }
        }
        OrderInputFormat orderInputFormat2 = orderInputFormat;
        switch (WhenMappings.$EnumSwitchMapping$1[this.orderFlowSource.ordinal()]) {
            case 1:
                orderEntryPoint = OrderEntryPoint.MOBILE_CHARTS;
                orderEntryPoint2 = orderEntryPoint;
                break;
            case 2:
                if (Intrinsics.areEqual(this.flatten, Boolean.TRUE)) {
                    orderEntryPoint = OrderEntryPoint.LADDER_FLATTEN;
                } else {
                    orderEntryPoint = OrderEntryPoint.LADDER;
                }
                orderEntryPoint2 = orderEntryPoint;
                break;
            case 3:
                orderEntryPoint = OrderEntryPoint.STOCK_DETAIL_PAGE;
                orderEntryPoint2 = orderEntryPoint;
                break;
            case 4:
                orderEntryPoint = OrderEntryPoint.SWIPE_TO_TRADE;
                orderEntryPoint2 = orderEntryPoint;
                break;
            case 5:
                orderEntryPoint = OrderEntryPoint.STOCK_DETAIL_PAGE;
                orderEntryPoint2 = orderEntryPoint;
                break;
            case 6:
                orderEntryPoint = OrderEntryPoint.RESEARCH_REPORT;
                orderEntryPoint2 = orderEntryPoint;
                break;
            case 7:
                orderEntryPoint = OrderEntryPoint.LEVEL_2_MARKET_DATA;
                orderEntryPoint2 = orderEntryPoint;
                break;
            default:
                orderEntryPoint2 = null;
                break;
        }
        return directOrderRequestDrafter.create(account, instrument, tradingSession, false, false, orderMarketHours, list, bigDecimal, shareQuantity2, null, uuid, equityOrderSide, stopPrice, null, null, orderTimeInForce2, orderConfiguration, null, null, fee, instant, marketBuysEnabled, null, listEmptyList, subzeroEnabled, orderPositionEffect2, order, orderInputFormat2, orderEntryPoint2);
    }
}
