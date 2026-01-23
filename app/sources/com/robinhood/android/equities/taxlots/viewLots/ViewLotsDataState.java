package com.robinhood.android.equities.taxlots.viewLots;

import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import microgram.contracts.equity_order_context.proto.p487v1.OrderType;

/* compiled from: ViewLotsStateProvider.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Js\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDataState;", "", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "selectableTaxLots", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "nextPageRequestSize", "", "orderType", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "maxGainAndLoss", "maxCostPerShare", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlinx/collections/immutable/ImmutableMap;ILmicrogram/contracts/equity_order_context/proto/v1/OrderType;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/UUID;", "getInstrumentId", "getSelectableTaxLots", "()Lkotlinx/collections/immutable/ImmutableMap;", "getNextPageRequestSize", "()I", "getOrderType", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "getMaxGainAndLoss", "getMaxCostPerShare", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ViewLotsDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID instrumentId;
    private final String maxCostPerShare;
    private final String maxGainAndLoss;
    private final int nextPageRequestSize;
    private final UUID orderId;
    private final OrderType orderType;
    private final ImmutableMap<String, SelectableTaxLot> selectableTaxLots;

    public ViewLotsDataState() {
        this(null, null, null, null, 0, null, null, null, 255, null);
    }

    public static /* synthetic */ ViewLotsDataState copy$default(ViewLotsDataState viewLotsDataState, String str, UUID uuid, UUID uuid2, ImmutableMap immutableMap, int i, OrderType orderType, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = viewLotsDataState.accountNumber;
        }
        if ((i2 & 2) != 0) {
            uuid = viewLotsDataState.orderId;
        }
        if ((i2 & 4) != 0) {
            uuid2 = viewLotsDataState.instrumentId;
        }
        if ((i2 & 8) != 0) {
            immutableMap = viewLotsDataState.selectableTaxLots;
        }
        if ((i2 & 16) != 0) {
            i = viewLotsDataState.nextPageRequestSize;
        }
        if ((i2 & 32) != 0) {
            orderType = viewLotsDataState.orderType;
        }
        if ((i2 & 64) != 0) {
            str2 = viewLotsDataState.maxGainAndLoss;
        }
        if ((i2 & 128) != 0) {
            str3 = viewLotsDataState.maxCostPerShare;
        }
        String str4 = str2;
        String str5 = str3;
        int i3 = i;
        OrderType orderType2 = orderType;
        return viewLotsDataState.copy(str, uuid, uuid2, immutableMap, i3, orderType2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final ImmutableMap<String, SelectableTaxLot> component4() {
        return this.selectableTaxLots;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNextPageRequestSize() {
        return this.nextPageRequestSize;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMaxGainAndLoss() {
        return this.maxGainAndLoss;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMaxCostPerShare() {
        return this.maxCostPerShare;
    }

    public final ViewLotsDataState copy(String accountNumber, UUID orderId, UUID instrumentId, ImmutableMap<String, SelectableTaxLot> selectableTaxLots, int nextPageRequestSize, OrderType orderType, String maxGainAndLoss, String maxCostPerShare) {
        return new ViewLotsDataState(accountNumber, orderId, instrumentId, selectableTaxLots, nextPageRequestSize, orderType, maxGainAndLoss, maxCostPerShare);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewLotsDataState)) {
            return false;
        }
        ViewLotsDataState viewLotsDataState = (ViewLotsDataState) other;
        return Intrinsics.areEqual(this.accountNumber, viewLotsDataState.accountNumber) && Intrinsics.areEqual(this.orderId, viewLotsDataState.orderId) && Intrinsics.areEqual(this.instrumentId, viewLotsDataState.instrumentId) && Intrinsics.areEqual(this.selectableTaxLots, viewLotsDataState.selectableTaxLots) && this.nextPageRequestSize == viewLotsDataState.nextPageRequestSize && this.orderType == viewLotsDataState.orderType && Intrinsics.areEqual(this.maxGainAndLoss, viewLotsDataState.maxGainAndLoss) && Intrinsics.areEqual(this.maxCostPerShare, viewLotsDataState.maxCostPerShare);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UUID uuid = this.orderId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.instrumentId;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        ImmutableMap<String, SelectableTaxLot> immutableMap = this.selectableTaxLots;
        int iHashCode4 = (((iHashCode3 + (immutableMap == null ? 0 : immutableMap.hashCode())) * 31) + Integer.hashCode(this.nextPageRequestSize)) * 31;
        OrderType orderType = this.orderType;
        int iHashCode5 = (iHashCode4 + (orderType == null ? 0 : orderType.hashCode())) * 31;
        String str2 = this.maxGainAndLoss;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxCostPerShare;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ViewLotsDataState(accountNumber=" + this.accountNumber + ", orderId=" + this.orderId + ", instrumentId=" + this.instrumentId + ", selectableTaxLots=" + this.selectableTaxLots + ", nextPageRequestSize=" + this.nextPageRequestSize + ", orderType=" + this.orderType + ", maxGainAndLoss=" + this.maxGainAndLoss + ", maxCostPerShare=" + this.maxCostPerShare + ")";
    }

    public ViewLotsDataState(String str, UUID uuid, UUID uuid2, ImmutableMap<String, SelectableTaxLot> immutableMap, int i, OrderType orderType, String str2, String str3) {
        this.accountNumber = str;
        this.orderId = uuid;
        this.instrumentId = uuid2;
        this.selectableTaxLots = immutableMap;
        this.nextPageRequestSize = i;
        this.orderType = orderType;
        this.maxGainAndLoss = str2;
        this.maxCostPerShare = str3;
    }

    public /* synthetic */ ViewLotsDataState(String str, UUID uuid, UUID uuid2, ImmutableMap immutableMap, int i, OrderType orderType, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : uuid, (i2 & 4) != 0 ? null : uuid2, (i2 & 8) != 0 ? null : immutableMap, (i2 & 16) != 0 ? 50 : i, (i2 & 32) != 0 ? null : orderType, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final ImmutableMap<String, SelectableTaxLot> getSelectableTaxLots() {
        return this.selectableTaxLots;
    }

    public final int getNextPageRequestSize() {
        return this.nextPageRequestSize;
    }

    public final OrderType getOrderType() {
        return this.orderType;
    }

    public final String getMaxGainAndLoss() {
        return this.maxGainAndLoss;
    }

    public final String getMaxCostPerShare() {
        return this.maxCostPerShare;
    }
}
