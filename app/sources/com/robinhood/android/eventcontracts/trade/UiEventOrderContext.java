package com.robinhood.android.eventcontracts.trade;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.ceres.p284v1.CreateEventContractOrderRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderLegRequestDto;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.store.event.ProposalData;
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
import p479j$.time.Instant;
import rosetta.mainst.TimeInForceDto;

/* compiled from: UiEventOrderContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "", "orderRequest", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$OrderRequest;", "requestContext", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$RequestContext;", "<init>", "(Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$OrderRequest;Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$RequestContext;)V", "getOrderRequest", "()Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$OrderRequest;", "getRequestContext", "()Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$RequestContext;", "idlRequestDto", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "getIdlRequestDto", "()Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RequestContext", "OrderRequest", "Leg", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class UiEventOrderContext {
    private final OrderRequest orderRequest;
    private final RequestContext requestContext;

    public static /* synthetic */ UiEventOrderContext copy$default(UiEventOrderContext uiEventOrderContext, OrderRequest orderRequest, RequestContext requestContext, int i, Object obj) {
        if ((i & 1) != 0) {
            orderRequest = uiEventOrderContext.orderRequest;
        }
        if ((i & 2) != 0) {
            requestContext = uiEventOrderContext.requestContext;
        }
        return uiEventOrderContext.copy(orderRequest, requestContext);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderRequest getOrderRequest() {
        return this.orderRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final UiEventOrderContext copy(OrderRequest orderRequest, RequestContext requestContext) {
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        return new UiEventOrderContext(orderRequest, requestContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiEventOrderContext)) {
            return false;
        }
        UiEventOrderContext uiEventOrderContext = (UiEventOrderContext) other;
        return Intrinsics.areEqual(this.orderRequest, uiEventOrderContext.orderRequest) && Intrinsics.areEqual(this.requestContext, uiEventOrderContext.requestContext);
    }

    public int hashCode() {
        return (this.orderRequest.hashCode() * 31) + this.requestContext.hashCode();
    }

    public String toString() {
        return "UiEventOrderContext(orderRequest=" + this.orderRequest + ", requestContext=" + this.requestContext + ")";
    }

    public UiEventOrderContext(OrderRequest orderRequest, RequestContext requestContext) {
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        this.orderRequest = orderRequest;
        this.requestContext = requestContext;
    }

    public final OrderRequest getOrderRequest() {
        return this.orderRequest;
    }

    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final CreateEventContractOrderRequestDto getIdlRequestDto() {
        ProposalData.Proposal proposal;
        String string2 = this.requestContext.getAccount().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = this.orderRequest.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(this.orderRequest.getLimitPrice());
        IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(this.orderRequest.getQuantity());
        BigDecimal enteredNotionalAmount = this.orderRequest.getEnteredNotionalAmount();
        String quoteId = null;
        MoneyDto moneyDto = enteredNotionalAmount != null ? new MoneyDto(IdlDecimal2.toIdlDecimal(enteredNotionalAmount), CurrencyDto.USD) : null;
        TimeInForceDto idlModel = FuturesOrderToIdlExtensions.toIdlModel(this.orderRequest.getTimeInForce());
        Instant gtdExpirationTime = this.orderRequest.getGtdExpirationTime();
        List<Leg> legs = this.orderRequest.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((Leg) it.next()).getIdlDto());
        }
        ProposalData comboProposal = this.requestContext.getComboProposal();
        if (comboProposal != null && (proposal = comboProposal.getProposal(this.orderRequest.getSide())) != null) {
            quoteId = proposal.getQuoteId();
        }
        return new CreateEventContractOrderRequestDto(string2, arrayList, idlDecimal2, idlDecimal, string3, null, idlModel, moneyDto, gtdExpirationTime, quoteId, 32, null);
    }

    /* compiled from: UiEventOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$RequestContext;", "", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "quote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "comboProposal", "Lcom/robinhood/store/event/ProposalData;", "<init>", "(Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/event/db/marketdata/EventQuote;Lcom/robinhood/store/event/ProposalData;)V", "getAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getQuote", "()Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "getComboProposal", "()Lcom/robinhood/store/event/ProposalData;", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RequestContext {
        private final FuturesAccount account;
        private final ProposalData comboProposal;
        private final EventQuote quote;

        public RequestContext(FuturesAccount account, EventQuote eventQuote, ProposalData proposalData) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.quote = eventQuote;
            this.comboProposal = proposalData;
        }

        public final FuturesAccount getAccount() {
            return this.account;
        }

        public final EventQuote getQuote() {
            return this.quote;
        }

        public final ProposalData getComboProposal() {
            return this.comboProposal;
        }
    }

    /* compiled from: UiEventOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$OrderRequest;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "refId", "Ljava/math/BigDecimal;", "quantity", "limitPrice", "", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$Leg;", "legs", "enteredNotionalAmount", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "timeInForce", "j$/time/Instant", "gtdExpirationTime", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lj$/time/Instant;)V", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/util/UUID;", "getRefId", "()Ljava/util/UUID;", "Ljava/math/BigDecimal;", "getQuantity", "()Ljava/math/BigDecimal;", "getLimitPrice", "Ljava/util/List;", "getLegs", "()Ljava/util/List;", "getEnteredNotionalAmount", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "getTimeInForce", "()Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "Lj$/time/Instant;", "getGtdExpirationTime", "()Lj$/time/Instant;", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderRequest implements Parcelable {
        public static final Parcelable.Creator<OrderRequest> CREATOR = new Creator();
        private final BigDecimal enteredNotionalAmount;
        private final Instant gtdExpirationTime;
        private final List<Leg> legs;
        private final BigDecimal limitPrice;
        private final BigDecimal quantity;
        private final UUID refId;
        private final FuturesTimeInForce timeInForce;

        /* compiled from: UiEventOrderContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OrderRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderRequest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Leg.CREATOR.createFromParcel(parcel));
                }
                return new OrderRequest(uuid, bigDecimal, bigDecimal2, arrayList, (BigDecimal) parcel.readSerializable(), FuturesTimeInForce.valueOf(parcel.readString()), (Instant) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrderRequest[] newArray(int i) {
                return new OrderRequest[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.refId);
            dest.writeSerializable(this.quantity);
            dest.writeSerializable(this.limitPrice);
            List<Leg> list = this.legs;
            dest.writeInt(list.size());
            Iterator<Leg> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeSerializable(this.enteredNotionalAmount);
            dest.writeString(this.timeInForce.name());
            dest.writeSerializable(this.gtdExpirationTime);
        }

        public OrderRequest(UUID refId, BigDecimal quantity, BigDecimal limitPrice, List<Leg> legs, BigDecimal bigDecimal, FuturesTimeInForce timeInForce, Instant instant) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.refId = refId;
            this.quantity = quantity;
            this.limitPrice = limitPrice;
            this.legs = legs;
            this.enteredNotionalAmount = bigDecimal;
            this.timeInForce = timeInForce;
            this.gtdExpirationTime = instant;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final List<Leg> getLegs() {
            return this.legs;
        }

        public final BigDecimal getEnteredNotionalAmount() {
            return this.enteredNotionalAmount;
        }

        public final FuturesTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final Instant getGtdExpirationTime() {
            return this.gtdExpirationTime;
        }

        public final EventOrderSide getSide() {
            return ((Leg) CollectionsKt.first((List) this.legs)).getOrderSide();
        }
    }

    /* compiled from: UiEventOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext$Leg;", "Landroid/os/Parcelable;", "contractId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/event/db/order/EventOrderSide;)V", "getContractId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "idlDto", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "getIdlDto", "()Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Leg implements Parcelable {
        public static final Parcelable.Creator<Leg> CREATOR = new Creator();
        private final UUID contractId;
        private final EventOrderSide orderSide;

        /* compiled from: UiEventOrderContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Leg> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Leg createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Leg((UUID) parcel.readSerializable(), EventOrderSide.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Leg[] newArray(int i) {
                return new Leg[i];
            }
        }

        public static /* synthetic */ Leg copy$default(Leg leg, UUID uuid, EventOrderSide eventOrderSide, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = leg.contractId;
            }
            if ((i & 2) != 0) {
                eventOrderSide = leg.orderSide;
            }
            return leg.copy(uuid, eventOrderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final EventOrderSide getOrderSide() {
            return this.orderSide;
        }

        public final Leg copy(UUID contractId, EventOrderSide orderSide) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            return new Leg(contractId, orderSide);
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
            return Intrinsics.areEqual(this.contractId, leg.contractId) && this.orderSide == leg.orderSide;
        }

        public int hashCode() {
            return (this.contractId.hashCode() * 31) + this.orderSide.hashCode();
        }

        public String toString() {
            return "Leg(contractId=" + this.contractId + ", orderSide=" + this.orderSide + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.contractId);
            dest.writeString(this.orderSide.name());
        }

        public Leg(UUID contractId, EventOrderSide orderSide) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            this.contractId = contractId;
            this.orderSide = orderSide;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final EventOrderSide getOrderSide() {
            return this.orderSide;
        }

        public final FuturesOrderLegRequestDto getIdlDto() {
            return new FuturesOrderLegRequestDto(FuturesOrderToIdlExtensions.toIdlModel(FuturesContractType.EVENTS), Uuids.safeToString(this.contractId), 1, this.orderSide.toIdlModel());
        }
    }
}
