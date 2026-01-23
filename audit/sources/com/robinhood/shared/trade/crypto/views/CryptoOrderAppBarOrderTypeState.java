package com.robinhood.shared.trade.crypto.views;

import com.robinhood.models.api.CryptoOrderType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderAppBarOrderTypeComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState;", "", "type", "Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type;", "expanded", "", "<init>", "(Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type;Z)V", "getType", "()Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type;", "getExpanded", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Type", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderAppBarOrderTypeState {
    public static final int $stable = 0;
    private final boolean expanded;
    private final Type type;

    public static /* synthetic */ CryptoOrderAppBarOrderTypeState copy$default(CryptoOrderAppBarOrderTypeState cryptoOrderAppBarOrderTypeState, Type type2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = cryptoOrderAppBarOrderTypeState.type;
        }
        if ((i & 2) != 0) {
            z = cryptoOrderAppBarOrderTypeState.expanded;
        }
        return cryptoOrderAppBarOrderTypeState.copy(type2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    public final CryptoOrderAppBarOrderTypeState copy(Type type2, boolean expanded) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new CryptoOrderAppBarOrderTypeState(type2, expanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderAppBarOrderTypeState)) {
            return false;
        }
        CryptoOrderAppBarOrderTypeState cryptoOrderAppBarOrderTypeState = (CryptoOrderAppBarOrderTypeState) other;
        return Intrinsics.areEqual(this.type, cryptoOrderAppBarOrderTypeState.type) && this.expanded == cryptoOrderAppBarOrderTypeState.expanded;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Boolean.hashCode(this.expanded);
    }

    public String toString() {
        return "CryptoOrderAppBarOrderTypeState(type=" + this.type + ", expanded=" + this.expanded + ")";
    }

    public CryptoOrderAppBarOrderTypeState(Type type2, boolean z) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.expanded = z;
    }

    public /* synthetic */ CryptoOrderAppBarOrderTypeState(Type type2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, (i & 2) != 0 ? false : z);
    }

    public final Type getType() {
        return this.type;
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    /* compiled from: CryptoOrderAppBarOrderTypeComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type;", "", "<init>", "()V", "OrderType", "TaxLots", "Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type$OrderType;", "Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type$TaxLots;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Type {
        public static final int $stable = 0;

        public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoOrderAppBarOrderTypeComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type$OrderType;", "Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "<init>", "(Lcom/robinhood/models/api/CryptoOrderType;)V", "getOrderType", "()Lcom/robinhood/models/api/CryptoOrderType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderType extends Type {
            public static final int $stable = 0;
            private final CryptoOrderType orderType;

            public static /* synthetic */ OrderType copy$default(OrderType orderType, CryptoOrderType cryptoOrderType, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoOrderType = orderType.orderType;
                }
                return orderType.copy(cryptoOrderType);
            }

            /* renamed from: component1, reason: from getter */
            public final CryptoOrderType getOrderType() {
                return this.orderType;
            }

            public final OrderType copy(CryptoOrderType orderType) {
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                return new OrderType(orderType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OrderType) && this.orderType == ((OrderType) other).orderType;
            }

            public int hashCode() {
                return this.orderType.hashCode();
            }

            public String toString() {
                return "OrderType(orderType=" + this.orderType + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderType(CryptoOrderType orderType) {
                super(null);
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                this.orderType = orderType;
            }

            public final CryptoOrderType getOrderType() {
                return this.orderType;
            }
        }

        private Type() {
        }

        /* compiled from: CryptoOrderAppBarOrderTypeComposable.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type$TaxLots;", "Lcom/robinhood/shared/trade/crypto/views/CryptoOrderAppBarOrderTypeState$Type;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLots extends Type {
            public static final int $stable = 0;
            public static final TaxLots INSTANCE = new TaxLots();

            public boolean equals(Object other) {
                return this == other || (other instanceof TaxLots);
            }

            public int hashCode() {
                return 943040014;
            }

            public String toString() {
                return "TaxLots";
            }

            private TaxLots() {
                super(null);
            }
        }
    }
}
