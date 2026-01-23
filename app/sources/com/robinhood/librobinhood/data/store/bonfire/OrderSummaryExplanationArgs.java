package com.robinhood.librobinhood.data.store.bonfire;

import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSummaryExplanationArgs.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/OrderSummaryExplanationArgs;", "", "instrumentIds", "", "Ljava/util/UUID;", "isPresetPercentLimitOrder", "", "presetPercentLimit", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/List;ZLjava/math/BigDecimal;)V", "getInstrumentIds", "()Ljava/util/List;", "()Z", "getPresetPercentLimit", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderSummaryExplanationArgs {
    private final List<UUID> instrumentIds;
    private final boolean isPresetPercentLimitOrder;
    private final BigDecimal presetPercentLimit;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderSummaryExplanationArgs copy$default(OrderSummaryExplanationArgs orderSummaryExplanationArgs, List list, boolean z, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = orderSummaryExplanationArgs.instrumentIds;
        }
        if ((i & 2) != 0) {
            z = orderSummaryExplanationArgs.isPresetPercentLimitOrder;
        }
        if ((i & 4) != 0) {
            bigDecimal = orderSummaryExplanationArgs.presetPercentLimit;
        }
        return orderSummaryExplanationArgs.copy(list, z, bigDecimal);
    }

    public final List<UUID> component1() {
        return this.instrumentIds;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPresetPercentLimitOrder() {
        return this.isPresetPercentLimitOrder;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getPresetPercentLimit() {
        return this.presetPercentLimit;
    }

    public final OrderSummaryExplanationArgs copy(List<UUID> instrumentIds, boolean isPresetPercentLimitOrder, BigDecimal presetPercentLimit) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return new OrderSummaryExplanationArgs(instrumentIds, isPresetPercentLimitOrder, presetPercentLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSummaryExplanationArgs)) {
            return false;
        }
        OrderSummaryExplanationArgs orderSummaryExplanationArgs = (OrderSummaryExplanationArgs) other;
        return Intrinsics.areEqual(this.instrumentIds, orderSummaryExplanationArgs.instrumentIds) && this.isPresetPercentLimitOrder == orderSummaryExplanationArgs.isPresetPercentLimitOrder && Intrinsics.areEqual(this.presetPercentLimit, orderSummaryExplanationArgs.presetPercentLimit);
    }

    public int hashCode() {
        int iHashCode = ((this.instrumentIds.hashCode() * 31) + Boolean.hashCode(this.isPresetPercentLimitOrder)) * 31;
        BigDecimal bigDecimal = this.presetPercentLimit;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "OrderSummaryExplanationArgs(instrumentIds=" + this.instrumentIds + ", isPresetPercentLimitOrder=" + this.isPresetPercentLimitOrder + ", presetPercentLimit=" + this.presetPercentLimit + ")";
    }

    public OrderSummaryExplanationArgs(List<UUID> instrumentIds, boolean z, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        this.instrumentIds = instrumentIds;
        this.isPresetPercentLimitOrder = z;
        this.presetPercentLimit = bigDecimal;
    }

    public final List<UUID> getInstrumentIds() {
        return this.instrumentIds;
    }

    public final boolean isPresetPercentLimitOrder() {
        return this.isPresetPercentLimitOrder;
    }

    public final BigDecimal getPresetPercentLimit() {
        return this.presetPercentLimit;
    }
}
