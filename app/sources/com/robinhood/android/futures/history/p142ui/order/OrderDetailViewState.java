package com.robinhood.android.futures.history.p142ui.order;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001:\u0001YBå\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010E\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010M\u001a\u00020\u0018HÆ\u0003J\t\u0010N\u001a\u00020\u0018HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0092\u0002\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\u00182\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\bHÖ\u0001J\t\u0010X\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b+\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0019\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState;", "", "contractId", "Ljava/util/UUID;", "productId", "viewContractCta", "Lcom/robinhood/utils/resource/StringResource;", "title", "", "description", "queuedOrderLabel", "orderStatusRes", "timeInForceRes", "submittedDateStr", "", "limitPriceStr", "stopPriceStr", "filledQuantity", "filledTime", "averageFilledPrice", "executionPrice", "realizedProfitOrLoss", "Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;", "showCancelOrder", "", "cancelInProgress", "otherFees", "commissionFees", "totalCostOrCredit", "goldSavings", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;ZZLcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;Lcom/robinhood/utils/resource/StringResource;)V", "getContractId", "()Ljava/util/UUID;", "getProductId", "getViewContractCta", "()Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "getQueuedOrderLabel", "getOrderStatusRes", "getTimeInForceRes", "getSubmittedDateStr", "()Ljava/lang/String;", "getLimitPriceStr", "getStopPriceStr", "getFilledQuantity", "getFilledTime", "getAverageFilledPrice", "getExecutionPrice", "getRealizedProfitOrLoss", "()Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;", "getShowCancelOrder", "()Z", "getCancelInProgress", "getOtherFees", "getCommissionFees", "getTotalCostOrCredit", "getGoldSavings", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;ZZLcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;Lcom/robinhood/utils/resource/StringResource;)Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState;", "equals", "other", "hashCode", "toString", "Fee", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderDetailViewState {
    public static final int $stable = 8;
    private final String averageFilledPrice;
    private final boolean cancelInProgress;
    private final Fee commissionFees;
    private final UUID contractId;
    private final StringResource description;
    private final String executionPrice;
    private final StringResource filledQuantity;
    private final String filledTime;
    private final StringResource goldSavings;
    private final String limitPriceStr;
    private final Integer orderStatusRes;
    private final Fee otherFees;
    private final UUID productId;
    private final StringResource queuedOrderLabel;
    private final Fee realizedProfitOrLoss;
    private final boolean showCancelOrder;
    private final String stopPriceStr;
    private final String submittedDateStr;
    private final Integer timeInForceRes;
    private final Integer title;
    private final Fee totalCostOrCredit;
    private final StringResource viewContractCta;

    public static /* synthetic */ OrderDetailViewState copy$default(OrderDetailViewState orderDetailViewState, UUID uuid, UUID uuid2, StringResource stringResource, Integer num, StringResource stringResource2, StringResource stringResource3, Integer num2, Integer num3, String str, String str2, String str3, StringResource stringResource4, String str4, String str5, String str6, Fee fee, boolean z, boolean z2, Fee fee2, Fee fee3, Fee fee4, StringResource stringResource5, int i, Object obj) {
        StringResource stringResource6;
        Fee fee5;
        UUID uuid3 = (i & 1) != 0 ? orderDetailViewState.contractId : uuid;
        UUID uuid4 = (i & 2) != 0 ? orderDetailViewState.productId : uuid2;
        StringResource stringResource7 = (i & 4) != 0 ? orderDetailViewState.viewContractCta : stringResource;
        Integer num4 = (i & 8) != 0 ? orderDetailViewState.title : num;
        StringResource stringResource8 = (i & 16) != 0 ? orderDetailViewState.description : stringResource2;
        StringResource stringResource9 = (i & 32) != 0 ? orderDetailViewState.queuedOrderLabel : stringResource3;
        Integer num5 = (i & 64) != 0 ? orderDetailViewState.orderStatusRes : num2;
        Integer num6 = (i & 128) != 0 ? orderDetailViewState.timeInForceRes : num3;
        String str7 = (i & 256) != 0 ? orderDetailViewState.submittedDateStr : str;
        String str8 = (i & 512) != 0 ? orderDetailViewState.limitPriceStr : str2;
        String str9 = (i & 1024) != 0 ? orderDetailViewState.stopPriceStr : str3;
        StringResource stringResource10 = (i & 2048) != 0 ? orderDetailViewState.filledQuantity : stringResource4;
        String str10 = (i & 4096) != 0 ? orderDetailViewState.filledTime : str4;
        String str11 = (i & 8192) != 0 ? orderDetailViewState.averageFilledPrice : str5;
        UUID uuid5 = uuid3;
        String str12 = (i & 16384) != 0 ? orderDetailViewState.executionPrice : str6;
        Fee fee6 = (i & 32768) != 0 ? orderDetailViewState.realizedProfitOrLoss : fee;
        boolean z3 = (i & 65536) != 0 ? orderDetailViewState.showCancelOrder : z;
        boolean z4 = (i & 131072) != 0 ? orderDetailViewState.cancelInProgress : z2;
        Fee fee7 = (i & 262144) != 0 ? orderDetailViewState.otherFees : fee2;
        Fee fee8 = (i & 524288) != 0 ? orderDetailViewState.commissionFees : fee3;
        Fee fee9 = (i & 1048576) != 0 ? orderDetailViewState.totalCostOrCredit : fee4;
        if ((i & 2097152) != 0) {
            fee5 = fee9;
            stringResource6 = orderDetailViewState.goldSavings;
        } else {
            stringResource6 = stringResource5;
            fee5 = fee9;
        }
        return orderDetailViewState.copy(uuid5, uuid4, stringResource7, num4, stringResource8, stringResource9, num5, num6, str7, str8, str9, stringResource10, str10, str11, str12, fee6, z3, z4, fee7, fee8, fee5, stringResource6);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLimitPriceStr() {
        return this.limitPriceStr;
    }

    /* renamed from: component11, reason: from getter */
    public final String getStopPriceStr() {
        return this.stopPriceStr;
    }

    /* renamed from: component12, reason: from getter */
    public final StringResource getFilledQuantity() {
        return this.filledQuantity;
    }

    /* renamed from: component13, reason: from getter */
    public final String getFilledTime() {
        return this.filledTime;
    }

    /* renamed from: component14, reason: from getter */
    public final String getAverageFilledPrice() {
        return this.averageFilledPrice;
    }

    /* renamed from: component15, reason: from getter */
    public final String getExecutionPrice() {
        return this.executionPrice;
    }

    /* renamed from: component16, reason: from getter */
    public final Fee getRealizedProfitOrLoss() {
        return this.realizedProfitOrLoss;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getShowCancelOrder() {
        return this.showCancelOrder;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    /* renamed from: component19, reason: from getter */
    public final Fee getOtherFees() {
        return this.otherFees;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getProductId() {
        return this.productId;
    }

    /* renamed from: component20, reason: from getter */
    public final Fee getCommissionFees() {
        return this.commissionFees;
    }

    /* renamed from: component21, reason: from getter */
    public final Fee getTotalCostOrCredit() {
        return this.totalCostOrCredit;
    }

    /* renamed from: component22, reason: from getter */
    public final StringResource getGoldSavings() {
        return this.goldSavings;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getViewContractCta() {
        return this.viewContractCta;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getQueuedOrderLabel() {
        return this.queuedOrderLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getOrderStatusRes() {
        return this.orderStatusRes;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getTimeInForceRes() {
        return this.timeInForceRes;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSubmittedDateStr() {
        return this.submittedDateStr;
    }

    public final OrderDetailViewState copy(UUID contractId, UUID productId, StringResource viewContractCta, Integer title, StringResource description, StringResource queuedOrderLabel, Integer orderStatusRes, Integer timeInForceRes, String submittedDateStr, String limitPriceStr, String stopPriceStr, StringResource filledQuantity, String filledTime, String averageFilledPrice, String executionPrice, Fee realizedProfitOrLoss, boolean showCancelOrder, boolean cancelInProgress, Fee otherFees, Fee commissionFees, Fee totalCostOrCredit, StringResource goldSavings) {
        return new OrderDetailViewState(contractId, productId, viewContractCta, title, description, queuedOrderLabel, orderStatusRes, timeInForceRes, submittedDateStr, limitPriceStr, stopPriceStr, filledQuantity, filledTime, averageFilledPrice, executionPrice, realizedProfitOrLoss, showCancelOrder, cancelInProgress, otherFees, commissionFees, totalCostOrCredit, goldSavings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailViewState)) {
            return false;
        }
        OrderDetailViewState orderDetailViewState = (OrderDetailViewState) other;
        return Intrinsics.areEqual(this.contractId, orderDetailViewState.contractId) && Intrinsics.areEqual(this.productId, orderDetailViewState.productId) && Intrinsics.areEqual(this.viewContractCta, orderDetailViewState.viewContractCta) && Intrinsics.areEqual(this.title, orderDetailViewState.title) && Intrinsics.areEqual(this.description, orderDetailViewState.description) && Intrinsics.areEqual(this.queuedOrderLabel, orderDetailViewState.queuedOrderLabel) && Intrinsics.areEqual(this.orderStatusRes, orderDetailViewState.orderStatusRes) && Intrinsics.areEqual(this.timeInForceRes, orderDetailViewState.timeInForceRes) && Intrinsics.areEqual(this.submittedDateStr, orderDetailViewState.submittedDateStr) && Intrinsics.areEqual(this.limitPriceStr, orderDetailViewState.limitPriceStr) && Intrinsics.areEqual(this.stopPriceStr, orderDetailViewState.stopPriceStr) && Intrinsics.areEqual(this.filledQuantity, orderDetailViewState.filledQuantity) && Intrinsics.areEqual(this.filledTime, orderDetailViewState.filledTime) && Intrinsics.areEqual(this.averageFilledPrice, orderDetailViewState.averageFilledPrice) && Intrinsics.areEqual(this.executionPrice, orderDetailViewState.executionPrice) && Intrinsics.areEqual(this.realizedProfitOrLoss, orderDetailViewState.realizedProfitOrLoss) && this.showCancelOrder == orderDetailViewState.showCancelOrder && this.cancelInProgress == orderDetailViewState.cancelInProgress && Intrinsics.areEqual(this.otherFees, orderDetailViewState.otherFees) && Intrinsics.areEqual(this.commissionFees, orderDetailViewState.commissionFees) && Intrinsics.areEqual(this.totalCostOrCredit, orderDetailViewState.totalCostOrCredit) && Intrinsics.areEqual(this.goldSavings, orderDetailViewState.goldSavings);
    }

    public int hashCode() {
        UUID uuid = this.contractId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UUID uuid2 = this.productId;
        int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        StringResource stringResource = this.viewContractCta;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Integer num = this.title;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        StringResource stringResource2 = this.description;
        int iHashCode5 = (iHashCode4 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.queuedOrderLabel;
        int iHashCode6 = (iHashCode5 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        Integer num2 = this.orderStatusRes;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.timeInForceRes;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.submittedDateStr;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.limitPriceStr;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stopPriceStr;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StringResource stringResource4 = this.filledQuantity;
        int iHashCode12 = (iHashCode11 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
        String str4 = this.filledTime;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.averageFilledPrice;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.executionPrice;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Fee fee = this.realizedProfitOrLoss;
        int iHashCode16 = (((((iHashCode15 + (fee == null ? 0 : fee.hashCode())) * 31) + Boolean.hashCode(this.showCancelOrder)) * 31) + Boolean.hashCode(this.cancelInProgress)) * 31;
        Fee fee2 = this.otherFees;
        int iHashCode17 = (iHashCode16 + (fee2 == null ? 0 : fee2.hashCode())) * 31;
        Fee fee3 = this.commissionFees;
        int iHashCode18 = (iHashCode17 + (fee3 == null ? 0 : fee3.hashCode())) * 31;
        Fee fee4 = this.totalCostOrCredit;
        int iHashCode19 = (iHashCode18 + (fee4 == null ? 0 : fee4.hashCode())) * 31;
        StringResource stringResource5 = this.goldSavings;
        return iHashCode19 + (stringResource5 != null ? stringResource5.hashCode() : 0);
    }

    public String toString() {
        return "OrderDetailViewState(contractId=" + this.contractId + ", productId=" + this.productId + ", viewContractCta=" + this.viewContractCta + ", title=" + this.title + ", description=" + this.description + ", queuedOrderLabel=" + this.queuedOrderLabel + ", orderStatusRes=" + this.orderStatusRes + ", timeInForceRes=" + this.timeInForceRes + ", submittedDateStr=" + this.submittedDateStr + ", limitPriceStr=" + this.limitPriceStr + ", stopPriceStr=" + this.stopPriceStr + ", filledQuantity=" + this.filledQuantity + ", filledTime=" + this.filledTime + ", averageFilledPrice=" + this.averageFilledPrice + ", executionPrice=" + this.executionPrice + ", realizedProfitOrLoss=" + this.realizedProfitOrLoss + ", showCancelOrder=" + this.showCancelOrder + ", cancelInProgress=" + this.cancelInProgress + ", otherFees=" + this.otherFees + ", commissionFees=" + this.commissionFees + ", totalCostOrCredit=" + this.totalCostOrCredit + ", goldSavings=" + this.goldSavings + ")";
    }

    public OrderDetailViewState(UUID uuid, UUID uuid2, StringResource stringResource, Integer num, StringResource stringResource2, StringResource stringResource3, Integer num2, Integer num3, String str, String str2, String str3, StringResource stringResource4, String str4, String str5, String str6, Fee fee, boolean z, boolean z2, Fee fee2, Fee fee3, Fee fee4, StringResource stringResource5) {
        this.contractId = uuid;
        this.productId = uuid2;
        this.viewContractCta = stringResource;
        this.title = num;
        this.description = stringResource2;
        this.queuedOrderLabel = stringResource3;
        this.orderStatusRes = num2;
        this.timeInForceRes = num3;
        this.submittedDateStr = str;
        this.limitPriceStr = str2;
        this.stopPriceStr = str3;
        this.filledQuantity = stringResource4;
        this.filledTime = str4;
        this.averageFilledPrice = str5;
        this.executionPrice = str6;
        this.realizedProfitOrLoss = fee;
        this.showCancelOrder = z;
        this.cancelInProgress = z2;
        this.otherFees = fee2;
        this.commissionFees = fee3;
        this.totalCostOrCredit = fee4;
        this.goldSavings = stringResource5;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final UUID getProductId() {
        return this.productId;
    }

    public final StringResource getViewContractCta() {
        return this.viewContractCta;
    }

    public final Integer getTitle() {
        return this.title;
    }

    public final StringResource getDescription() {
        return this.description;
    }

    public final StringResource getQueuedOrderLabel() {
        return this.queuedOrderLabel;
    }

    public final Integer getOrderStatusRes() {
        return this.orderStatusRes;
    }

    public final Integer getTimeInForceRes() {
        return this.timeInForceRes;
    }

    public final String getSubmittedDateStr() {
        return this.submittedDateStr;
    }

    public final String getLimitPriceStr() {
        return this.limitPriceStr;
    }

    public final String getStopPriceStr() {
        return this.stopPriceStr;
    }

    public final StringResource getFilledQuantity() {
        return this.filledQuantity;
    }

    public final String getFilledTime() {
        return this.filledTime;
    }

    public final String getAverageFilledPrice() {
        return this.averageFilledPrice;
    }

    public final String getExecutionPrice() {
        return this.executionPrice;
    }

    public final Fee getRealizedProfitOrLoss() {
        return this.realizedProfitOrLoss;
    }

    public final boolean getShowCancelOrder() {
        return this.showCancelOrder;
    }

    public final boolean getCancelInProgress() {
        return this.cancelInProgress;
    }

    public final Fee getOtherFees() {
        return this.otherFees;
    }

    public final Fee getCommissionFees() {
        return this.commissionFees;
    }

    public final Fee getTotalCostOrCredit() {
        return this.totalCostOrCredit;
    }

    public final StringResource getGoldSavings() {
        return this.goldSavings;
    }

    /* compiled from: FuturesOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState$Fee;", "", "name", "Lcom/robinhood/utils/resource/StringResource;", "amount", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getName", "()Lcom/robinhood/utils/resource/StringResource;", "getAmount", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Fee {
        public static final int $stable = StringResource.$stable;
        private final String amount;
        private final StringResource name;

        public static /* synthetic */ Fee copy$default(Fee fee, StringResource stringResource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = fee.name;
            }
            if ((i & 2) != 0) {
                str = fee.amount;
            }
            return fee.copy(stringResource, str);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        public final Fee copy(StringResource name, String amount) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new Fee(name, amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fee)) {
                return false;
            }
            Fee fee = (Fee) other;
            return Intrinsics.areEqual(this.name, fee.name) && Intrinsics.areEqual(this.amount, fee.amount);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.amount.hashCode();
        }

        public String toString() {
            return "Fee(name=" + this.name + ", amount=" + this.amount + ")";
        }

        public Fee(StringResource name, String amount) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.name = name;
            this.amount = amount;
        }

        public final StringResource getName() {
            return this.name;
        }

        public final String getAmount() {
            return this.amount;
        }
    }
}
