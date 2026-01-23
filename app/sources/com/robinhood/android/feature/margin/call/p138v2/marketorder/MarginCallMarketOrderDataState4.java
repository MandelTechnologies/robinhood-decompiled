package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import com.robinhood.models.p320db.Order;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallDataResponseDto;

/* compiled from: MarginCallMarketOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\b\u0004\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState;", "", "orderState", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;", "<init>", "(Ljava/util/Map;)V", "getOrderState", "()Ljava/util/Map;", "Polling", "Complete", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState$Complete;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState$Polling;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderStatusPollingState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MarginCallMarketOrderDataState4 {
    public static final int $stable = 8;
    private final Map<UUID, Order> orderState;

    public /* synthetic */ MarginCallMarketOrderDataState4(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    private MarginCallMarketOrderDataState4(Map<UUID, Order> map) {
        this.orderState = map;
    }

    public /* synthetic */ MarginCallMarketOrderDataState4(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, null);
    }

    public Map<UUID, Order> getOrderState() {
        return this.orderState;
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState$Polling;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState;", "orderState", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;", "<init>", "(Ljava/util/Map;)V", "getOrderState", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderStatusPollingState$Polling, reason: from toString */
    public static final /* data */ class Polling extends MarginCallMarketOrderDataState4 {
        public static final int $stable = 8;
        private final Map<UUID, Order> orderState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Polling copy$default(Polling polling, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = polling.orderState;
            }
            return polling.copy(map);
        }

        public final Map<UUID, Order> component1() {
            return this.orderState;
        }

        public final Polling copy(Map<UUID, Order> orderState) {
            Intrinsics.checkNotNullParameter(orderState, "orderState");
            return new Polling(orderState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Polling) && Intrinsics.areEqual(this.orderState, ((Polling) other).orderState);
        }

        public int hashCode() {
            return this.orderState.hashCode();
        }

        public String toString() {
            return "Polling(orderState=" + this.orderState + ")";
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState4
        public Map<UUID, Order> getOrderState() {
            return this.orderState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Polling(Map<UUID, Order> orderState) {
            super(orderState, null);
            Intrinsics.checkNotNullParameter(orderState, "orderState");
            this.orderState = orderState;
        }
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState$Complete;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderStatusPollingState;", "orderState", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Order;", "maintenanceCallData", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "<init>", "(Ljava/util/Map;Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;)V", "getOrderState", "()Ljava/util/Map;", "getMaintenanceCallData", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderStatusPollingState$Complete, reason: from toString */
    public static final /* data */ class Complete extends MarginCallMarketOrderDataState4 {
        public static final int $stable = 8;
        private final GetMaintenanceCallDataResponseDto maintenanceCallData;
        private final Map<UUID, Order> orderState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete copy$default(Complete complete, Map map, GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto, int i, Object obj) {
            if ((i & 1) != 0) {
                map = complete.orderState;
            }
            if ((i & 2) != 0) {
                getMaintenanceCallDataResponseDto = complete.maintenanceCallData;
            }
            return complete.copy(map, getMaintenanceCallDataResponseDto);
        }

        public final Map<UUID, Order> component1() {
            return this.orderState;
        }

        /* renamed from: component2, reason: from getter */
        public final GetMaintenanceCallDataResponseDto getMaintenanceCallData() {
            return this.maintenanceCallData;
        }

        public final Complete copy(Map<UUID, Order> orderState, GetMaintenanceCallDataResponseDto maintenanceCallData) {
            Intrinsics.checkNotNullParameter(orderState, "orderState");
            return new Complete(orderState, maintenanceCallData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.areEqual(this.orderState, complete.orderState) && Intrinsics.areEqual(this.maintenanceCallData, complete.maintenanceCallData);
        }

        public int hashCode() {
            int iHashCode = this.orderState.hashCode() * 31;
            GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto = this.maintenanceCallData;
            return iHashCode + (getMaintenanceCallDataResponseDto == null ? 0 : getMaintenanceCallDataResponseDto.hashCode());
        }

        public String toString() {
            return "Complete(orderState=" + this.orderState + ", maintenanceCallData=" + this.maintenanceCallData + ")";
        }

        public /* synthetic */ Complete(Map map, GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i & 2) != 0 ? null : getMaintenanceCallDataResponseDto);
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState4
        public Map<UUID, Order> getOrderState() {
            return this.orderState;
        }

        public final GetMaintenanceCallDataResponseDto getMaintenanceCallData() {
            return this.maintenanceCallData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(Map<UUID, Order> orderState, GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto) {
            super(orderState, null);
            Intrinsics.checkNotNullParameter(orderState, "orderState");
            this.orderState = orderState;
            this.maintenanceCallData = getMaintenanceCallDataResponseDto;
        }
    }
}
