package com.robinhood.shared.trade.crypto.p397ui.price;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.CryptoOrderType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderPriceGroup.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "Landroid/os/Parcelable;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "<init>", "(Lcom/robinhood/models/api/CryptoOrderType;)V", "getOrderType", "()Lcom/robinhood/models/api/CryptoOrderType;", "Limit", "StopLoss", "StopLimit", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup$Limit;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup$StopLimit;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup$StopLoss;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderPriceGroup implements Parcelable {
    public static final int $stable = 0;
    private final CryptoOrderType orderType;

    public /* synthetic */ CryptoOrderPriceGroup(CryptoOrderType cryptoOrderType, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoOrderType);
    }

    private CryptoOrderPriceGroup(CryptoOrderType cryptoOrderType) {
        this.orderType = cryptoOrderType;
    }

    public final CryptoOrderType getOrderType() {
        return this.orderType;
    }

    /* compiled from: CryptoOrderPriceGroup.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup$Limit;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "limitPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getLimitPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Limit extends CryptoOrderPriceGroup {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Limit> CREATOR = new Creator();
        private final BigDecimal limitPrice;

        /* compiled from: CryptoOrderPriceGroup.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Limit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Limit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Limit((BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Limit[] newArray(int i) {
                return new Limit[i];
            }
        }

        public static /* synthetic */ Limit copy$default(Limit limit, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = limit.limitPrice;
            }
            return limit.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final Limit copy(BigDecimal limitPrice) {
            return new Limit(limitPrice);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Limit) && Intrinsics.areEqual(this.limitPrice, ((Limit) other).limitPrice);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.limitPrice;
            if (bigDecimal == null) {
                return 0;
            }
            return bigDecimal.hashCode();
        }

        public String toString() {
            return "Limit(limitPrice=" + this.limitPrice + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.limitPrice);
        }

        public Limit(BigDecimal bigDecimal) {
            super(CryptoOrderType.LIMIT, null);
            this.limitPrice = bigDecimal;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }
    }

    /* compiled from: CryptoOrderPriceGroup.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup$StopLoss;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "stopPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getStopPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLoss extends CryptoOrderPriceGroup {
        public static final int $stable = 8;
        public static final Parcelable.Creator<StopLoss> CREATOR = new Creator();
        private final BigDecimal stopPrice;

        /* compiled from: CryptoOrderPriceGroup.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StopLoss> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopLoss createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StopLoss((BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopLoss[] newArray(int i) {
                return new StopLoss[i];
            }
        }

        public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = stopLoss.stopPrice;
            }
            return stopLoss.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public final StopLoss copy(BigDecimal stopPrice) {
            return new StopLoss(stopPrice);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopLoss) && Intrinsics.areEqual(this.stopPrice, ((StopLoss) other).stopPrice);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.stopPrice;
            if (bigDecimal == null) {
                return 0;
            }
            return bigDecimal.hashCode();
        }

        public String toString() {
            return "StopLoss(stopPrice=" + this.stopPrice + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.stopPrice);
        }

        public StopLoss(BigDecimal bigDecimal) {
            super(CryptoOrderType.STOP_LOSS, null);
            this.stopPrice = bigDecimal;
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }
    }

    /* compiled from: CryptoOrderPriceGroup.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup$StopLimit;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "stopPrice", "Ljava/math/BigDecimal;", "limitPrice", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getStopPrice", "()Ljava/math/BigDecimal;", "getLimitPrice", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLimit extends CryptoOrderPriceGroup {
        public static final int $stable = 8;
        public static final Parcelable.Creator<StopLimit> CREATOR = new Creator();
        private final BigDecimal limitPrice;
        private final BigDecimal stopPrice;

        /* compiled from: CryptoOrderPriceGroup.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StopLimit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopLimit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StopLimit((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopLimit[] newArray(int i) {
                return new StopLimit[i];
            }
        }

        public static /* synthetic */ StopLimit copy$default(StopLimit stopLimit, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = stopLimit.stopPrice;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = stopLimit.limitPrice;
            }
            return stopLimit.copy(bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final StopLimit copy(BigDecimal stopPrice, BigDecimal limitPrice) {
            return new StopLimit(stopPrice, limitPrice);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopLimit)) {
                return false;
            }
            StopLimit stopLimit = (StopLimit) other;
            return Intrinsics.areEqual(this.stopPrice, stopLimit.stopPrice) && Intrinsics.areEqual(this.limitPrice, stopLimit.limitPrice);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.stopPrice;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.limitPrice;
            return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }

        public String toString() {
            return "StopLimit(stopPrice=" + this.stopPrice + ", limitPrice=" + this.limitPrice + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.stopPrice);
            dest.writeSerializable(this.limitPrice);
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public StopLimit(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            super(CryptoOrderType.STOP_LIMIT, null);
            this.stopPrice = bigDecimal;
            this.limitPrice = bigDecimal2;
        }
    }
}
