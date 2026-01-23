package com.robinhood.librobinhood.data.store;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ReplaceOrderInstrumentBuyingPowerQuery;", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "orderToReplaceId", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "getOrderToReplaceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReplaceOrderInstrumentBuyingPowerQuery {
    private final String accountNumber;
    private final UUID instrumentId;
    private final UUID orderToReplaceId;

    public static /* synthetic */ ReplaceOrderInstrumentBuyingPowerQuery copy$default(ReplaceOrderInstrumentBuyingPowerQuery replaceOrderInstrumentBuyingPowerQuery, UUID uuid, String str, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = replaceOrderInstrumentBuyingPowerQuery.instrumentId;
        }
        if ((i & 2) != 0) {
            str = replaceOrderInstrumentBuyingPowerQuery.accountNumber;
        }
        if ((i & 4) != 0) {
            uuid2 = replaceOrderInstrumentBuyingPowerQuery.orderToReplaceId;
        }
        return replaceOrderInstrumentBuyingPowerQuery.copy(uuid, str, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getOrderToReplaceId() {
        return this.orderToReplaceId;
    }

    public final ReplaceOrderInstrumentBuyingPowerQuery copy(UUID instrumentId, String accountNumber, UUID orderToReplaceId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderToReplaceId, "orderToReplaceId");
        return new ReplaceOrderInstrumentBuyingPowerQuery(instrumentId, accountNumber, orderToReplaceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplaceOrderInstrumentBuyingPowerQuery)) {
            return false;
        }
        ReplaceOrderInstrumentBuyingPowerQuery replaceOrderInstrumentBuyingPowerQuery = (ReplaceOrderInstrumentBuyingPowerQuery) other;
        return Intrinsics.areEqual(this.instrumentId, replaceOrderInstrumentBuyingPowerQuery.instrumentId) && Intrinsics.areEqual(this.accountNumber, replaceOrderInstrumentBuyingPowerQuery.accountNumber) && Intrinsics.areEqual(this.orderToReplaceId, replaceOrderInstrumentBuyingPowerQuery.orderToReplaceId);
    }

    public int hashCode() {
        return (((this.instrumentId.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.orderToReplaceId.hashCode();
    }

    public String toString() {
        return "ReplaceOrderInstrumentBuyingPowerQuery(instrumentId=" + this.instrumentId + ", accountNumber=" + this.accountNumber + ", orderToReplaceId=" + this.orderToReplaceId + ")";
    }

    public ReplaceOrderInstrumentBuyingPowerQuery(UUID instrumentId, String accountNumber, UUID orderToReplaceId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderToReplaceId, "orderToReplaceId");
        this.instrumentId = instrumentId;
        this.accountNumber = accountNumber;
        this.orderToReplaceId = orderToReplaceId;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getOrderToReplaceId() {
        return this.orderToReplaceId;
    }
}
