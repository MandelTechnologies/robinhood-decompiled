package com.robinhood.android.futures.history.p142ui.order;

import com.robinhood.android.futures.history.C17229R;
import com.robinhood.android.futures.history.p142ui.order.OrderDetailViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.futures.api.order.FuturesOrderState;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.p189db.FeeAmount;
import com.robinhood.android.models.futures.p189db.FuturesOrder;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.android.models.futures.p189db.FuturesOrderExecution;
import com.robinhood.android.models.futures.p189db.FuturesRealizedPnl;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.util.Money;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: FuturesOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003JM\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010F\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\"HÖ\u0001J\t\u0010I\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0013\u0010+\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0013\u0010-\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b.\u0010 R\u0013\u0010/\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b0\u0010(R\u0013\u00101\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b2\u0010(R\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00107\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b8\u00106R\u0013\u00109\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b:\u0010 R\u0013\u0010;\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b<\u00106R\u0013\u0010=\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b>\u00106¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/order/OrderDetailDataState;", "", "orderId", "Ljava/util/UUID;", Card.Icon.ORDER, "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "nextOpenTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "cancelInProgress", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/db/UiFuturesOrder;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Z)V", "getOrderId", "()Ljava/util/UUID;", "getOrder", "()Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "getContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getProduct", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getNextOpenTradingSession", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "getCancelInProgress", "()Z", "isMarketOrder", "queuedOrderLabel", "Lcom/robinhood/utils/resource/StringResource;", "getQueuedOrderLabel", "()Lcom/robinhood/utils/resource/StringResource;", "timeInForceRes", "", "getTimeInForceRes", "()Ljava/lang/Integer;", "limitPriceStr", "", "getLimitPriceStr", "()Ljava/lang/String;", "stopPriceStr", "getStopPriceStr", "filledTime", "getFilledTime", "filledQuantity", "getFilledQuantity", "averageFilledPrice", "getAverageFilledPrice", "executionPrice", "getExecutionPrice", "realizedProfitOrLoss", "Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;", "getRealizedProfitOrLoss", "()Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;", "commissionFee", "getCommissionFee", "goldSavings", "getGoldSavings", "otherFees", "getOtherFees", "totalCostOrCredit", "getTotalCostOrCredit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class OrderDetailDataState {
    public static final int $stable = 8;
    private final boolean cancelInProgress;
    private final FuturesContract contract;
    private final FuturesTradingHours.Session nextOpenTradingSession;
    private final UiFuturesOrder order;
    private final UUID orderId;
    private final FuturesProduct product;

    /* compiled from: FuturesOrderDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesTimeInForce.values().length];
            try {
                iArr[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OrderDetailDataState copy$default(OrderDetailDataState orderDetailDataState, UUID uuid, UiFuturesOrder uiFuturesOrder, FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesTradingHours.Session session, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = orderDetailDataState.orderId;
        }
        if ((i & 2) != 0) {
            uiFuturesOrder = orderDetailDataState.order;
        }
        if ((i & 4) != 0) {
            futuresContract = orderDetailDataState.contract;
        }
        if ((i & 8) != 0) {
            futuresProduct = orderDetailDataState.product;
        }
        if ((i & 16) != 0) {
            session = orderDetailDataState.nextOpenTradingSession;
        }
        if ((i & 32) != 0) {
            z = orderDetailDataState.cancelInProgress;
        }
        FuturesTradingHours.Session session2 = session;
        boolean z2 = z;
        return orderDetailDataState.copy(uuid, uiFuturesOrder, futuresContract, futuresProduct, session2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final UiFuturesOrder getOrder() {
        return this.order;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesContract getContract() {
        return this.contract;
    }

    /* renamed from: component4, reason: from getter */
    public final FuturesProduct getProduct() {
        return this.product;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    public final OrderDetailDataState copy(UUID orderId, UiFuturesOrder order, FuturesContract contract, FuturesProduct product, FuturesTradingHours.Session nextOpenTradingSession, boolean cancelInProgress) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new OrderDetailDataState(orderId, order, contract, product, nextOpenTradingSession, cancelInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailDataState)) {
            return false;
        }
        OrderDetailDataState orderDetailDataState = (OrderDetailDataState) other;
        return Intrinsics.areEqual(this.orderId, orderDetailDataState.orderId) && Intrinsics.areEqual(this.order, orderDetailDataState.order) && Intrinsics.areEqual(this.contract, orderDetailDataState.contract) && Intrinsics.areEqual(this.product, orderDetailDataState.product) && Intrinsics.areEqual(this.nextOpenTradingSession, orderDetailDataState.nextOpenTradingSession) && this.cancelInProgress == orderDetailDataState.cancelInProgress;
    }

    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        UiFuturesOrder uiFuturesOrder = this.order;
        int iHashCode2 = (iHashCode + (uiFuturesOrder == null ? 0 : uiFuturesOrder.hashCode())) * 31;
        FuturesContract futuresContract = this.contract;
        int iHashCode3 = (iHashCode2 + (futuresContract == null ? 0 : futuresContract.hashCode())) * 31;
        FuturesProduct futuresProduct = this.product;
        int iHashCode4 = (iHashCode3 + (futuresProduct == null ? 0 : futuresProduct.hashCode())) * 31;
        FuturesTradingHours.Session session = this.nextOpenTradingSession;
        return ((iHashCode4 + (session != null ? session.hashCode() : 0)) * 31) + Boolean.hashCode(this.cancelInProgress);
    }

    public String toString() {
        return "OrderDetailDataState(orderId=" + this.orderId + ", order=" + this.order + ", contract=" + this.contract + ", product=" + this.product + ", nextOpenTradingSession=" + this.nextOpenTradingSession + ", cancelInProgress=" + this.cancelInProgress + ")";
    }

    public OrderDetailDataState(UUID orderId, UiFuturesOrder uiFuturesOrder, FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesTradingHours.Session session, boolean z) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderId = orderId;
        this.order = uiFuturesOrder;
        this.contract = futuresContract;
        this.product = futuresProduct;
        this.nextOpenTradingSession = session;
        this.cancelInProgress = z;
    }

    public /* synthetic */ OrderDetailDataState(UUID uuid, UiFuturesOrder uiFuturesOrder, FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesTradingHours.Session session, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : uiFuturesOrder, (i & 4) != 0 ? null : futuresContract, (i & 8) != 0 ? null : futuresProduct, (i & 16) != 0 ? null : session, (i & 32) != 0 ? false : z);
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final UiFuturesOrder getOrder() {
        return this.order;
    }

    public final FuturesContract getContract() {
        return this.contract;
    }

    public final FuturesProduct getProduct() {
        return this.product;
    }

    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    public final boolean isMarketOrder() {
        FuturesOrder order;
        UiFuturesOrder uiFuturesOrder = this.order;
        return ((uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null) ? null : order.getOrderConfiguration()) == FuturesOrderConfiguration.MARKET;
    }

    public final StringResource getQueuedOrderLabel() {
        FuturesTradingHours.Session session;
        Instant startTime;
        FuturesOrder order;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (((uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null) ? null : order.getOrderState()) != FuturesOrderState.QUEUED || (session = this.nextOpenTradingSession) == null || (startTime = session.getStartTime()) == null || !startTime.isAfter(Instant.now())) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C17229R.string.futures_order_detail_queued_header, InstantFormatter.WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED.format(this.nextOpenTradingSession.getStartTime()));
    }

    public final Integer getTimeInForceRes() {
        FuturesOrder order;
        if (isMarketOrder()) {
            return null;
        }
        UiFuturesOrder uiFuturesOrder = this.order;
        FuturesTimeInForce timeInForce = (uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null) ? null : order.getTimeInForce();
        int i = timeInForce == null ? -1 : WhenMappings.$EnumSwitchMapping$0[timeInForce.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return Integer.valueOf(C32428R.string.order_time_in_force_gfd);
        }
        if (i == 2) {
            return Integer.valueOf(C32428R.string.order_time_in_force_gtc_no_limit);
        }
        if (i == 3) {
            return Integer.valueOf(C32428R.string.order_time_in_force_ioc);
        }
        if (i == 4) {
            return null;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return Integer.valueOf(C32428R.string.order_time_in_force_fok);
    }

    public final String getLimitPriceStr() {
        FuturesOrder order;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (((uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null) ? null : order.getOrderConfiguration()) == FuturesOrderConfiguration.LIMIT) {
            return FuturesProduct5.formatNullable$default(this.product, this.order.getOrder().getLimitPrice(), null, 2, null);
        }
        return null;
    }

    public final String getStopPriceStr() {
        FuturesOrder order;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (((uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null) ? null : order.getOrderConfiguration()) == FuturesOrderConfiguration.STOP_LOSS) {
            return FuturesProduct5.formatNullable$default(this.product, this.order.getOrder().getStopPrice(), null, 2, null);
        }
        return null;
    }

    public final String getFilledTime() {
        FuturesOrder order;
        BigDecimal filledQuantity;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null || (filledQuantity = order.getFilledQuantity()) == null || BigDecimals7.isZero(filledQuantity)) {
            return null;
        }
        return InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format(this.order.getOrder().getUpdatedAt());
    }

    public final StringResource getFilledQuantity() {
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C17229R.string.futures_order_detail_filled_quantity_format, Formats.getIntegerFormat().format(uiFuturesOrder.getOrder().getFilledQuantity()), Formats.getIntegerFormat().format(this.order.getOrder().getQuantity()));
    }

    public final String getAverageFilledPrice() {
        FuturesOrder order;
        BigDecimal averageFilledPrice;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null || (averageFilledPrice = order.getAverageFilledPrice()) == null) {
            return null;
        }
        return FuturesProduct5.format$default(this.product, averageFilledPrice, null, 2, null);
    }

    public final String getExecutionPrice() {
        List<FuturesOrderExecution> executions;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null || (executions = uiFuturesOrder.getExecutions()) == null || !(!executions.isEmpty())) {
            return null;
        }
        return CollectionsKt.joinToString$default(this.order.getExecutions(), "\n", null, null, 0, null, new Function1() { // from class: com.robinhood.android.futures.history.ui.order.OrderDetailDataState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDataState._get_executionPrice_$lambda$0(this.f$0, (FuturesOrderExecution) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_executionPrice_$lambda$0(OrderDetailDataState orderDetailDataState, FuturesOrderExecution execution) {
        Intrinsics.checkNotNullParameter(execution, "execution");
        return Formats.getIntegerDeltaFormat().format(execution.getQuantity()) + " @ " + FuturesProduct5.format$default(orderDetailDataState.product, execution.getPricePerContract(), null, 2, null);
    }

    public final OrderDetailViewState.Fee getRealizedProfitOrLoss() {
        UiFuturesOrder uiFuturesOrder;
        FuturesRealizedPnl realizedPnl;
        Money realizedPnlWithoutFees;
        int i;
        FuturesOrder order;
        FuturesOrderState orderState;
        UiFuturesOrder uiFuturesOrder2 = this.order;
        if ((uiFuturesOrder2 != null && (order = uiFuturesOrder2.getOrder()) != null && (orderState = order.getOrderState()) != null && orderState.isOpen()) || (uiFuturesOrder = this.order) == null || (realizedPnl = uiFuturesOrder.getRealizedPnl()) == null || (realizedPnlWithoutFees = realizedPnl.getRealizedPnlWithoutFees()) == null || realizedPnlWithoutFees.isZero()) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (realizedPnlWithoutFees.isPositive()) {
            i = C17229R.string.futures_order_detail_realized_profit_label;
        } else {
            i = C17229R.string.futures_order_detail_realized_loss_label;
        }
        return new OrderDetailViewState.Fee(companion.invoke(i, new Object[0]), Money.format$default(realizedPnlWithoutFees.abs(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final OrderDetailViewState.Fee getCommissionFee() {
        FuturesOrder order;
        FeeAmount totalCommission;
        BigDecimal amount;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null || (totalCommission = order.getTotalCommission()) == null || (amount = totalCommission.getAmount()) == null) {
            return null;
        }
        return new OrderDetailViewState.Fee(StringResource.INSTANCE.invoke(C17229R.string.futures_commission_fees_label, new Object[0]), Formats.getCurrencyFormat().format(amount));
    }

    public final StringResource getGoldSavings() {
        FuturesOrder order;
        FeeAmount totalGoldSavings;
        BigDecimal amount;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null || (totalGoldSavings = order.getTotalGoldSavings()) == null || (amount = totalGoldSavings.getAmount()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C17229R.string.futures_total_gold_savings_label, Formats.getCurrencyFormat().format(amount));
    }

    public final OrderDetailViewState.Fee getOtherFees() {
        FuturesOrder order;
        FeeAmount totalCommission;
        BigDecimal amount;
        FeeAmount totalFee;
        BigDecimal amount2;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null || (totalCommission = order.getTotalCommission()) == null || (amount = totalCommission.getAmount()) == null || (totalFee = this.order.getOrder().getTotalFee()) == null || (amount2 = totalFee.getAmount()) == null) {
            return null;
        }
        BigDecimal bigDecimalSubtract = amount2.subtract(amount);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract == null) {
            return null;
        }
        return new OrderDetailViewState.Fee(StringResource.INSTANCE.invoke(C17229R.string.futures_exchange_and_regulatory_fees_label, new Object[0]), Formats.getCurrencyFormat().format(bigDecimalSubtract));
    }

    public final OrderDetailViewState.Fee getTotalCostOrCredit() {
        FuturesOrder order;
        FeeAmount totalFee;
        UiFuturesOrder uiFuturesOrder = this.order;
        if (uiFuturesOrder == null || (order = uiFuturesOrder.getOrder()) == null || (totalFee = order.getTotalFee()) == null) {
            return null;
        }
        FuturesRealizedPnl realizedPnl = this.order.getRealizedPnl();
        if (realizedPnl == null || realizedPnl.getRealizedPnlWithoutFees().isZero()) {
            return new OrderDetailViewState.Fee(StringResource.INSTANCE.invoke(C17229R.string.futures_total_cost_label, new Object[0]), Formats.getCurrencyFormat().format(totalFee.getAmount()));
        }
        if (realizedPnl.getRealizedPnl().isNegative()) {
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C17229R.string.futures_total_cost_label, new Object[0]);
            NumberFormatter currencyFormat = Formats.getCurrencyFormat();
            BigDecimal bigDecimalAbs = realizedPnl.getRealizedPnl().getDecimalValue().abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            return new OrderDetailViewState.Fee(stringResourceInvoke, currencyFormat.format(bigDecimalAbs));
        }
        StringResource stringResourceInvoke2 = StringResource.INSTANCE.invoke(C17229R.string.futures_total_credit_label, new Object[0]);
        NumberFormatter currencyFormat2 = Formats.getCurrencyFormat();
        BigDecimal bigDecimalAbs2 = realizedPnl.getRealizedPnl().getDecimalValue().abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
        return new OrderDetailViewState.Fee(stringResourceInvoke2, currencyFormat2.format(bigDecimalAbs2));
    }
}
