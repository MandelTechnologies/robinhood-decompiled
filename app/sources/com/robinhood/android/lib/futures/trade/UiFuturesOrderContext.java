package com.robinhood.android.lib.futures.trade;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.ceres.p284v1.CreateFuturesOrderRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderLegRequestDto;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.store.futures.idl.FuturesOrderToIdlExtensions;
import com.robinhood.utils.extensions.Uuids;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.TimeInForceDto;

/* compiled from: UiFuturesOrderContext.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "", "orderRequest", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "requestContext", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$RequestContext;", "<init>", "(Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$RequestContext;)V", "getOrderRequest", "()Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "getRequestContext", "()Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$RequestContext;", "accountId", "Ljava/util/UUID;", "getAccountId", "()Ljava/util/UUID;", "idlRequestDto", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "getIdlRequestDto", "()Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "RequestContext", "OrderRequest", "Leg", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UiFuturesOrderContext {
    private final UUID accountId;
    private final OrderRequest orderRequest;
    private final RequestContext requestContext;

    public UiFuturesOrderContext(OrderRequest orderRequest, RequestContext requestContext) {
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        this.orderRequest = orderRequest;
        this.requestContext = requestContext;
        this.accountId = requestContext.getAccount().getId();
    }

    public final OrderRequest getOrderRequest() {
        return this.orderRequest;
    }

    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final UUID getAccountId() {
        return this.accountId;
    }

    /* compiled from: UiFuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$RequestContext;", "", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "<init>", "(Lcom/robinhood/android/models/futures/db/FuturesAccount;)V", "getAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RequestContext {
        private final FuturesAccount account;

        public RequestContext(FuturesAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
        }

        public final FuturesAccount getAccount() {
            return this.account;
        }
    }

    /* compiled from: UiFuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010/\u001a\u000200J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000200R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\"¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020(¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010$\u001a\u0004\b.\u0010\u0014¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "Landroid/os/Parcelable;", "refId", "Ljava/util/UUID;", "orderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "quantity", "Ljava/math/BigDecimal;", "orderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "stopPrice", "limitPrice", "legs", "", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$Leg;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;Ljava/math/BigDecimal;Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;)V", "getRefId", "()Ljava/util/UUID;", "getOrderType", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "getQuantity", "()Ljava/math/BigDecimal;", "getOrderTrigger", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getTimeInForce", "()Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "getStopPrice", "getLimitPrice", "getLegs", "()Ljava/util/List;", "orderSide", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getOrderSide$annotations", "()V", "getOrderSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "contractType", "Lcom/robinhood/android/models/futures/api/order/FuturesContractType;", "getContractType$annotations", "getContractType", "()Lcom/robinhood/android/models/futures/api/order/FuturesContractType;", "contractId", "getContractId$annotations", "getContractId", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderRequest implements Parcelable {
        public static final Parcelable.Creator<OrderRequest> CREATOR = new Creator();
        private final UUID contractId;
        private final FuturesContractType contractType;
        private final List<Leg> legs;
        private final BigDecimal limitPrice;
        private final FuturesOrderSide orderSide;
        private final FuturesOrderTrigger orderTrigger;
        private final FuturesOrderType orderType;
        private final BigDecimal quantity;
        private final UUID refId;
        private final BigDecimal stopPrice;
        private final FuturesTimeInForce timeInForce;

        /* compiled from: UiFuturesOrderContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OrderRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderRequest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                FuturesOrderType futuresOrderTypeValueOf = FuturesOrderType.valueOf(parcel.readString());
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                FuturesOrderTrigger futuresOrderTriggerValueOf = FuturesOrderTrigger.valueOf(parcel.readString());
                FuturesTimeInForce futuresTimeInForceValueOf = FuturesTimeInForce.valueOf(parcel.readString());
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Leg.CREATOR.createFromParcel(parcel));
                }
                return new OrderRequest(uuid, futuresOrderTypeValueOf, bigDecimal, futuresOrderTriggerValueOf, futuresTimeInForceValueOf, bigDecimal2, bigDecimal3, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderRequest[] newArray(int i) {
                return new OrderRequest[i];
            }
        }

        public static /* synthetic */ void getContractId$annotations() {
        }

        public static /* synthetic */ void getContractType$annotations() {
        }

        public static /* synthetic */ void getOrderSide$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.refId);
            dest.writeString(this.orderType.name());
            dest.writeSerializable(this.quantity);
            dest.writeString(this.orderTrigger.name());
            dest.writeString(this.timeInForce.name());
            dest.writeSerializable(this.stopPrice);
            dest.writeSerializable(this.limitPrice);
            List<Leg> list = this.legs;
            dest.writeInt(list.size());
            Iterator<Leg> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public OrderRequest(UUID refId, FuturesOrderType orderType, BigDecimal quantity, FuturesOrderTrigger orderTrigger, FuturesTimeInForce timeInForce, BigDecimal bigDecimal, BigDecimal bigDecimal2, List<Leg> legs) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(legs, "legs");
            this.refId = refId;
            this.orderType = orderType;
            this.quantity = quantity;
            this.orderTrigger = orderTrigger;
            this.timeInForce = timeInForce;
            this.stopPrice = bigDecimal;
            this.limitPrice = bigDecimal2;
            this.legs = legs;
            this.orderSide = legs.get(0).getOrderSide();
            this.contractType = legs.get(0).getContractType();
            this.contractId = legs.get(0).getContractId();
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final FuturesOrderType getOrderType() {
            return this.orderType;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final FuturesOrderTrigger getOrderTrigger() {
            return this.orderTrigger;
        }

        public final FuturesTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final List<Leg> getLegs() {
            return this.legs;
        }

        public final FuturesOrderSide getOrderSide() {
            return this.orderSide;
        }

        public final FuturesContractType getContractType() {
            return this.contractType;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }

    /* compiled from: UiFuturesOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$Leg;", "Landroid/os/Parcelable;", "contractType", "Lcom/robinhood/android/models/futures/api/order/FuturesContractType;", "contractId", "Ljava/util/UUID;", "ratioQuantity", "", "orderSide", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesContractType;Ljava/util/UUID;ILcom/robinhood/android/models/futures/api/order/FuturesOrderSide;)V", "getContractType", "()Lcom/robinhood/android/models/futures/api/order/FuturesContractType;", "getContractId", "()Ljava/util/UUID;", "getRatioQuantity", "()I", "getOrderSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "idlDto", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "getIdlDto", "()Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Leg implements Parcelable {
        public static final Parcelable.Creator<Leg> CREATOR = new Creator();
        private final UUID contractId;
        private final FuturesContractType contractType;
        private final FuturesOrderSide orderSide;
        private final int ratioQuantity;

        /* compiled from: UiFuturesOrderContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Leg> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Leg createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Leg(FuturesContractType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt(), FuturesOrderSide.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Leg[] newArray(int i) {
                return new Leg[i];
            }
        }

        public static /* synthetic */ Leg copy$default(Leg leg, FuturesContractType futuresContractType, UUID uuid, int i, FuturesOrderSide futuresOrderSide, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                futuresContractType = leg.contractType;
            }
            if ((i2 & 2) != 0) {
                uuid = leg.contractId;
            }
            if ((i2 & 4) != 0) {
                i = leg.ratioQuantity;
            }
            if ((i2 & 8) != 0) {
                futuresOrderSide = leg.orderSide;
            }
            return leg.copy(futuresContractType, uuid, i, futuresOrderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesContractType getContractType() {
            return this.contractType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRatioQuantity() {
            return this.ratioQuantity;
        }

        /* renamed from: component4, reason: from getter */
        public final FuturesOrderSide getOrderSide() {
            return this.orderSide;
        }

        public final Leg copy(FuturesContractType contractType, UUID contractId, int ratioQuantity, FuturesOrderSide orderSide) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            return new Leg(contractType, contractId, ratioQuantity, orderSide);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Leg)) {
                return false;
            }
            Leg leg = (Leg) other;
            return this.contractType == leg.contractType && Intrinsics.areEqual(this.contractId, leg.contractId) && this.ratioQuantity == leg.ratioQuantity && this.orderSide == leg.orderSide;
        }

        public int hashCode() {
            return (((((this.contractType.hashCode() * 31) + this.contractId.hashCode()) * 31) + Integer.hashCode(this.ratioQuantity)) * 31) + this.orderSide.hashCode();
        }

        public String toString() {
            return "Leg(contractType=" + this.contractType + ", contractId=" + this.contractId + ", ratioQuantity=" + this.ratioQuantity + ", orderSide=" + this.orderSide + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contractType.name());
            dest.writeSerializable(this.contractId);
            dest.writeInt(this.ratioQuantity);
            dest.writeString(this.orderSide.name());
        }

        public Leg(FuturesContractType contractType, UUID contractId, int i, FuturesOrderSide orderSide) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            this.contractType = contractType;
            this.contractId = contractId;
            this.ratioQuantity = i;
            this.orderSide = orderSide;
        }

        public final FuturesContractType getContractType() {
            return this.contractType;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final int getRatioQuantity() {
            return this.ratioQuantity;
        }

        public final FuturesOrderSide getOrderSide() {
            return this.orderSide;
        }

        public final FuturesOrderLegRequestDto getIdlDto() {
            return new FuturesOrderLegRequestDto(FuturesOrderToIdlExtensions.toIdlModel(this.contractType), Uuids.safeToString(this.contractId), this.ratioQuantity, FuturesOrderToIdlExtensions.toIdlModel(this.orderSide));
        }
    }

    public final CreateFuturesOrderRequestDto getIdlRequestDto() {
        String string2 = this.requestContext.getAccount().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = this.orderRequest.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        OrderTypeDto idlModel = FuturesOrderToIdlExtensions.toIdlModel(this.orderRequest.getOrderType());
        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(this.orderRequest.getQuantity());
        OrderTriggerDto idlModel2 = FuturesOrderToIdlExtensions.toIdlModel(this.orderRequest.getOrderTrigger());
        TimeInForceDto idlModel3 = FuturesOrderToIdlExtensions.toIdlModel(this.orderRequest.getTimeInForce());
        BigDecimal stopPrice = this.orderRequest.getStopPrice();
        IdlDecimal idlDecimal2 = stopPrice != null ? IdlDecimal2.toIdlDecimal(stopPrice) : null;
        BigDecimal limitPrice = this.orderRequest.getLimitPrice();
        IdlDecimal idlDecimal3 = limitPrice != null ? IdlDecimal2.toIdlDecimal(limitPrice) : null;
        List<Leg> legs = this.orderRequest.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((Leg) it.next()).getIdlDto());
        }
        return new CreateFuturesOrderRequestDto(string2, arrayList, idlDecimal, null, idlModel, idlModel2, idlModel3, idlDecimal3, idlDecimal2, string3, null, null, null, null, null, null, 64520, null);
    }
}
