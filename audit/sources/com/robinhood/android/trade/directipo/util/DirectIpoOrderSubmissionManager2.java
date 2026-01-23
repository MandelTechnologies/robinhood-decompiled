package com.robinhood.android.trade.directipo.util;

import com.robinhood.models.api.IpoOrderUpdateRequest;
import com.robinhood.models.api.OrderRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest;", "", "<init>", "()V", "refId", "Ljava/util/UUID;", "getRefId", "()Ljava/util/UUID;", "Create", "Update", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest$Create;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest$Update;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.directipo.util.DirectIpoOrderRequest, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class DirectIpoOrderSubmissionManager2 {
    public static final int $stable = 0;

    public /* synthetic */ DirectIpoOrderSubmissionManager2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UUID getRefId();

    private DirectIpoOrderSubmissionManager2() {
    }

    /* compiled from: DirectIpoOrderSubmissionManager.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest$Create;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest;", "orderRequest", "Lcom/robinhood/models/api/OrderRequest;", "<init>", "(Lcom/robinhood/models/api/OrderRequest;)V", "getOrderRequest", "()Lcom/robinhood/models/api/OrderRequest;", "refId", "Ljava/util/UUID;", "getRefId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.directipo.util.DirectIpoOrderRequest$Create, reason: from toString */
    public static final /* data */ class Create extends DirectIpoOrderSubmissionManager2 {
        public static final int $stable = 8;
        private final OrderRequest orderRequest;
        private final UUID refId;

        public static /* synthetic */ Create copy$default(Create create, OrderRequest orderRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                orderRequest = create.orderRequest;
            }
            return create.copy(orderRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderRequest getOrderRequest() {
            return this.orderRequest;
        }

        public final Create copy(OrderRequest orderRequest) {
            Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
            return new Create(orderRequest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Create) && Intrinsics.areEqual(this.orderRequest, ((Create) other).orderRequest);
        }

        public int hashCode() {
            return this.orderRequest.hashCode();
        }

        public String toString() {
            return "Create(orderRequest=" + this.orderRequest + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Create(OrderRequest orderRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
            this.orderRequest = orderRequest;
            this.refId = orderRequest.getRef_id();
        }

        public final OrderRequest getOrderRequest() {
            return this.orderRequest;
        }

        @Override // com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager2
        public UUID getRefId() {
            return this.refId;
        }
    }

    /* compiled from: DirectIpoOrderSubmissionManager.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest$Update;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest;", "orderId", "Ljava/util/UUID;", "ipoOrderUpdateRequest", "Lcom/robinhood/models/api/IpoOrderUpdateRequest;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/IpoOrderUpdateRequest;)V", "getOrderId", "()Ljava/util/UUID;", "getIpoOrderUpdateRequest", "()Lcom/robinhood/models/api/IpoOrderUpdateRequest;", "refId", "getRefId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.directipo.util.DirectIpoOrderRequest$Update, reason: from toString */
    public static final /* data */ class Update extends DirectIpoOrderSubmissionManager2 {
        public static final int $stable = 8;
        private final IpoOrderUpdateRequest ipoOrderUpdateRequest;
        private final UUID orderId;
        private final UUID refId;

        public static /* synthetic */ Update copy$default(Update update, UUID uuid, IpoOrderUpdateRequest ipoOrderUpdateRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = update.orderId;
            }
            if ((i & 2) != 0) {
                ipoOrderUpdateRequest = update.ipoOrderUpdateRequest;
            }
            return update.copy(uuid, ipoOrderUpdateRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOrderId() {
            return this.orderId;
        }

        /* renamed from: component2, reason: from getter */
        public final IpoOrderUpdateRequest getIpoOrderUpdateRequest() {
            return this.ipoOrderUpdateRequest;
        }

        public final Update copy(UUID orderId, IpoOrderUpdateRequest ipoOrderUpdateRequest) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(ipoOrderUpdateRequest, "ipoOrderUpdateRequest");
            return new Update(orderId, ipoOrderUpdateRequest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Update)) {
                return false;
            }
            Update update = (Update) other;
            return Intrinsics.areEqual(this.orderId, update.orderId) && Intrinsics.areEqual(this.ipoOrderUpdateRequest, update.ipoOrderUpdateRequest);
        }

        public int hashCode() {
            return (this.orderId.hashCode() * 31) + this.ipoOrderUpdateRequest.hashCode();
        }

        public String toString() {
            return "Update(orderId=" + this.orderId + ", ipoOrderUpdateRequest=" + this.ipoOrderUpdateRequest + ")";
        }

        public final UUID getOrderId() {
            return this.orderId;
        }

        public final IpoOrderUpdateRequest getIpoOrderUpdateRequest() {
            return this.ipoOrderUpdateRequest;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(UUID orderId, IpoOrderUpdateRequest ipoOrderUpdateRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(ipoOrderUpdateRequest, "ipoOrderUpdateRequest");
            this.orderId = orderId;
            this.ipoOrderUpdateRequest = ipoOrderUpdateRequest;
            this.refId = ipoOrderUpdateRequest.getRef_id();
        }

        @Override // com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager2
        public UUID getRefId() {
            return this.refId;
        }
    }
}
