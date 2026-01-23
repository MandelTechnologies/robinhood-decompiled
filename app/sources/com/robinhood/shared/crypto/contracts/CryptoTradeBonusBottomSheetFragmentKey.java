package com.robinhood.shared.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint;", "orderExecutionState", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint;Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState;)V", "getEntryPoint", "()Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint;", "getOrderExecutionState", "()Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "EntryPoint", "OrderExecutionState", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class CryptoTradeBonusBottomSheetFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<CryptoTradeBonusBottomSheetFragmentKey> CREATOR = new Creator();
    private final EntryPoint entryPoint;
    private final OrderExecutionState orderExecutionState;

    /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CryptoTradeBonusBottomSheetFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTradeBonusBottomSheetFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTradeBonusBottomSheetFragmentKey((EntryPoint) parcel.readParcelable(CryptoTradeBonusBottomSheetFragmentKey.class.getClassLoader()), (OrderExecutionState) parcel.readParcelable(CryptoTradeBonusBottomSheetFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTradeBonusBottomSheetFragmentKey[] newArray(int i) {
            return new CryptoTradeBonusBottomSheetFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoTradeBonusBottomSheetFragmentKey copy$default(CryptoTradeBonusBottomSheetFragmentKey cryptoTradeBonusBottomSheetFragmentKey, EntryPoint entryPoint, OrderExecutionState orderExecutionState, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = cryptoTradeBonusBottomSheetFragmentKey.entryPoint;
        }
        if ((i & 2) != 0) {
            orderExecutionState = cryptoTradeBonusBottomSheetFragmentKey.orderExecutionState;
        }
        return cryptoTradeBonusBottomSheetFragmentKey.copy(entryPoint, orderExecutionState);
    }

    /* renamed from: component1, reason: from getter */
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderExecutionState getOrderExecutionState() {
        return this.orderExecutionState;
    }

    public final CryptoTradeBonusBottomSheetFragmentKey copy(EntryPoint entryPoint, OrderExecutionState orderExecutionState) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(orderExecutionState, "orderExecutionState");
        return new CryptoTradeBonusBottomSheetFragmentKey(entryPoint, orderExecutionState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTradeBonusBottomSheetFragmentKey)) {
            return false;
        }
        CryptoTradeBonusBottomSheetFragmentKey cryptoTradeBonusBottomSheetFragmentKey = (CryptoTradeBonusBottomSheetFragmentKey) other;
        return Intrinsics.areEqual(this.entryPoint, cryptoTradeBonusBottomSheetFragmentKey.entryPoint) && Intrinsics.areEqual(this.orderExecutionState, cryptoTradeBonusBottomSheetFragmentKey.orderExecutionState);
    }

    public int hashCode() {
        return (this.entryPoint.hashCode() * 31) + this.orderExecutionState.hashCode();
    }

    public String toString() {
        return "CryptoTradeBonusBottomSheetFragmentKey(entryPoint=" + this.entryPoint + ", orderExecutionState=" + this.orderExecutionState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.entryPoint, flags);
        dest.writeParcelable(this.orderExecutionState, flags);
    }

    public CryptoTradeBonusBottomSheetFragmentKey(EntryPoint entryPoint, OrderExecutionState orderExecutionState) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(orderExecutionState, "orderExecutionState");
        this.entryPoint = entryPoint;
        this.orderExecutionState = orderExecutionState;
    }

    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final OrderExecutionState getOrderExecutionState() {
        return this.orderExecutionState;
    }

    /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint;", "Landroid/os/Parcelable;", "<init>", "()V", "OrderConfirmation", "OrderDetails", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint$OrderConfirmation;", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint$OrderDetails;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class EntryPoint implements Parcelable {
        public /* synthetic */ EntryPoint(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EntryPoint() {
        }

        /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint$OrderConfirmation;", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderConfirmation extends EntryPoint {
            public static final OrderConfirmation INSTANCE = new OrderConfirmation();
            public static final Parcelable.Creator<OrderConfirmation> CREATOR = new Creator();

            /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<OrderConfirmation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderConfirmation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OrderConfirmation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderConfirmation[] newArray(int i) {
                    return new OrderConfirmation[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OrderConfirmation);
            }

            public int hashCode() {
                return 808363780;
            }

            public String toString() {
                return "OrderConfirmation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private OrderConfirmation() {
                super(null);
            }
        }

        /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint$OrderDetails;", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$EntryPoint;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderDetails extends EntryPoint {
            public static final OrderDetails INSTANCE = new OrderDetails();
            public static final Parcelable.Creator<OrderDetails> CREATOR = new Creator();

            /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<OrderDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OrderDetails.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderDetails[] newArray(int i) {
                    return new OrderDetails[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OrderDetails);
            }

            public int hashCode() {
                return -1767304685;
            }

            public String toString() {
                return "OrderDetails";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private OrderDetails() {
                super(null);
            }
        }
    }

    /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState;", "Landroid/os/Parcelable;", "<init>", "()V", "NoExecutions", "Executions", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$Executions;", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$NoExecutions;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class OrderExecutionState implements Parcelable {
        public /* synthetic */ OrderExecutionState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OrderExecutionState() {
        }

        /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$NoExecutions;", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoExecutions extends OrderExecutionState {
            public static final NoExecutions INSTANCE = new NoExecutions();
            public static final Parcelable.Creator<NoExecutions> CREATOR = new Creator();

            /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<NoExecutions> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoExecutions createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NoExecutions.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoExecutions[] newArray(int i) {
                    return new NoExecutions[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoExecutions);
            }

            public int hashCode() {
                return 427787796;
            }

            public String toString() {
                return "NoExecutions";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private NoExecutions() {
                super(null);
            }
        }

        /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$Executions;", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState;", "bonusStatus", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$Executions$BonusStatus;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$Executions$BonusStatus;)V", "getBonusStatus", "()Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$Executions$BonusStatus;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BonusStatus", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Executions extends OrderExecutionState {
            public static final Parcelable.Creator<Executions> CREATOR = new Creator();
            private final BonusStatus bonusStatus;

            /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Executions> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Executions createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Executions(BonusStatus.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Executions[] newArray(int i) {
                    return new Executions[i];
                }
            }

            public static /* synthetic */ Executions copy$default(Executions executions, BonusStatus bonusStatus, int i, Object obj) {
                if ((i & 1) != 0) {
                    bonusStatus = executions.bonusStatus;
                }
                return executions.copy(bonusStatus);
            }

            /* renamed from: component1, reason: from getter */
            public final BonusStatus getBonusStatus() {
                return this.bonusStatus;
            }

            public final Executions copy(BonusStatus bonusStatus) {
                Intrinsics.checkNotNullParameter(bonusStatus, "bonusStatus");
                return new Executions(bonusStatus);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Executions) && this.bonusStatus == ((Executions) other).bonusStatus;
            }

            public int hashCode() {
                return this.bonusStatus.hashCode();
            }

            public String toString() {
                return "Executions(bonusStatus=" + this.bonusStatus + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.bonusStatus.name());
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CryptoTradeBonusBottomSheetFragmentKey.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState$Executions$BonusStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "FINALIZED", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class BonusStatus {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ BonusStatus[] $VALUES;
                public static final BonusStatus PENDING = new BonusStatus("PENDING", 0);
                public static final BonusStatus FINALIZED = new BonusStatus("FINALIZED", 1);

                private static final /* synthetic */ BonusStatus[] $values() {
                    return new BonusStatus[]{PENDING, FINALIZED};
                }

                public static EnumEntries<BonusStatus> getEntries() {
                    return $ENTRIES;
                }

                private BonusStatus(String str, int i) {
                }

                static {
                    BonusStatus[] bonusStatusArr$values = $values();
                    $VALUES = bonusStatusArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(bonusStatusArr$values);
                }

                public static BonusStatus valueOf(String str) {
                    return (BonusStatus) Enum.valueOf(BonusStatus.class, str);
                }

                public static BonusStatus[] values() {
                    return (BonusStatus[]) $VALUES.clone();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Executions(BonusStatus bonusStatus) {
                super(null);
                Intrinsics.checkNotNullParameter(bonusStatus, "bonusStatus");
                this.bonusStatus = bonusStatus;
            }

            public final BonusStatus getBonusStatus() {
                return this.bonusStatus;
            }
        }
    }
}
