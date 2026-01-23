package com.robinhood.android.equities.taxlots;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectLotsKey.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "numberOfShares", "Ljava/math/BigDecimal;", "equityOrderContext", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "readOnly", "", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/UUID;", "getInstrumentId", "getNumberOfShares", "()Ljava/math/BigDecimal;", "getEquityOrderContext", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "getReadOnly", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Result", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectLotsKey implements FragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectLotsKey> CREATOR = new Creator();
    private final String accountNumber;
    private final EquityOrderContext equityOrderContext;
    private final UUID instrumentId;
    private final BigDecimal numberOfShares;
    private final UUID orderId;
    private final boolean readOnly;

    /* compiled from: SelectLotsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<SelectLotsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectLotsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectLotsKey(parcel.readString(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (EquityOrderContext) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectLotsKey[] newArray(int i) {
            return new SelectLotsKey[i];
        }
    }

    public static /* synthetic */ SelectLotsKey copy$default(SelectLotsKey selectLotsKey, String str, UUID uuid, UUID uuid2, BigDecimal bigDecimal, EquityOrderContext equityOrderContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectLotsKey.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = selectLotsKey.orderId;
        }
        if ((i & 4) != 0) {
            uuid2 = selectLotsKey.instrumentId;
        }
        if ((i & 8) != 0) {
            bigDecimal = selectLotsKey.numberOfShares;
        }
        if ((i & 16) != 0) {
            equityOrderContext = selectLotsKey.equityOrderContext;
        }
        if ((i & 32) != 0) {
            z = selectLotsKey.readOnly;
        }
        EquityOrderContext equityOrderContext2 = equityOrderContext;
        boolean z2 = z;
        return selectLotsKey.copy(str, uuid, uuid2, bigDecimal, equityOrderContext2, z2);
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

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getNumberOfShares() {
        return this.numberOfShares;
    }

    /* renamed from: component5, reason: from getter */
    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final SelectLotsKey copy(String accountNumber, UUID orderId, UUID instrumentId, BigDecimal numberOfShares, EquityOrderContext equityOrderContext, boolean readOnly) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new SelectLotsKey(accountNumber, orderId, instrumentId, numberOfShares, equityOrderContext, readOnly);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectLotsKey)) {
            return false;
        }
        SelectLotsKey selectLotsKey = (SelectLotsKey) other;
        return Intrinsics.areEqual(this.accountNumber, selectLotsKey.accountNumber) && Intrinsics.areEqual(this.orderId, selectLotsKey.orderId) && Intrinsics.areEqual(this.instrumentId, selectLotsKey.instrumentId) && Intrinsics.areEqual(this.numberOfShares, selectLotsKey.numberOfShares) && Intrinsics.areEqual(this.equityOrderContext, selectLotsKey.equityOrderContext) && this.readOnly == selectLotsKey.readOnly;
    }

    public int hashCode() {
        int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.instrumentId.hashCode()) * 31;
        BigDecimal bigDecimal = this.numberOfShares;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        return ((iHashCode2 + (equityOrderContext != null ? equityOrderContext.hashCode() : 0)) * 31) + Boolean.hashCode(this.readOnly);
    }

    public String toString() {
        return "SelectLotsKey(accountNumber=" + this.accountNumber + ", orderId=" + this.orderId + ", instrumentId=" + this.instrumentId + ", numberOfShares=" + this.numberOfShares + ", equityOrderContext=" + this.equityOrderContext + ", readOnly=" + this.readOnly + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.orderId);
        dest.writeSerializable(this.instrumentId);
        dest.writeSerializable(this.numberOfShares);
        dest.writeSerializable(this.equityOrderContext);
        dest.writeInt(this.readOnly ? 1 : 0);
    }

    public SelectLotsKey(String accountNumber, UUID orderId, UUID instrumentId, BigDecimal bigDecimal, EquityOrderContext equityOrderContext, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.accountNumber = accountNumber;
        this.orderId = orderId;
        this.instrumentId = instrumentId;
        this.numberOfShares = bigDecimal;
        this.equityOrderContext = equityOrderContext;
        this.readOnly = z;
    }

    public /* synthetic */ SelectLotsKey(String str, UUID uuid, UUID uuid2, BigDecimal bigDecimal, EquityOrderContext equityOrderContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, uuid2, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : equityOrderContext, (i & 32) != 0 ? false : z);
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

    public final BigDecimal getNumberOfShares() {
        return this.numberOfShares;
    }

    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* compiled from: SelectLotsKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "Review", "Complete", "Canceled", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result$Canceled;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result$Complete;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result$Review;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public interface Result extends Parcelable, NavigationActivityResultContract2 {

        /* compiled from: SelectLotsKey.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result$Review;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "numberOfShares", "Ljava/math/BigDecimal;", "selectedLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "<init>", "(Ljava/math/BigDecimal;Ljava/util/List;)V", "getNumberOfShares", "()Ljava/math/BigDecimal;", "getSelectedLots", "()Ljava/util/List;", "resultCode", "", "getResultCode", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Review implements Result {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Review> CREATOR = new Creator();
            private final BigDecimal numberOfShares;
            private final List<TaxLotSelection> selectedLots;

            /* compiled from: SelectLotsKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Review> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Review createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readSerializable());
                    }
                    return new Review(bigDecimal, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Review[] newArray(int i) {
                    return new Review[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Review copy$default(Review review, BigDecimal bigDecimal, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = review.numberOfShares;
                }
                if ((i & 2) != 0) {
                    list = review.selectedLots;
                }
                return review.copy(bigDecimal, list);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getNumberOfShares() {
                return this.numberOfShares;
            }

            public final List<TaxLotSelection> component2() {
                return this.selectedLots;
            }

            public final Review copy(BigDecimal numberOfShares, List<TaxLotSelection> selectedLots) {
                Intrinsics.checkNotNullParameter(numberOfShares, "numberOfShares");
                Intrinsics.checkNotNullParameter(selectedLots, "selectedLots");
                return new Review(numberOfShares, selectedLots);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Review)) {
                    return false;
                }
                Review review = (Review) other;
                return Intrinsics.areEqual(this.numberOfShares, review.numberOfShares) && Intrinsics.areEqual(this.selectedLots, review.selectedLots);
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return -1;
            }

            public int hashCode() {
                return (this.numberOfShares.hashCode() * 31) + this.selectedLots.hashCode();
            }

            public String toString() {
                return "Review(numberOfShares=" + this.numberOfShares + ", selectedLots=" + this.selectedLots + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.numberOfShares);
                List<TaxLotSelection> list = this.selectedLots;
                dest.writeInt(list.size());
                Iterator<TaxLotSelection> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeSerializable(it.next());
                }
            }

            public Review(BigDecimal numberOfShares, List<TaxLotSelection> selectedLots) {
                Intrinsics.checkNotNullParameter(numberOfShares, "numberOfShares");
                Intrinsics.checkNotNullParameter(selectedLots, "selectedLots");
                this.numberOfShares = numberOfShares;
                this.selectedLots = selectedLots;
            }

            public final BigDecimal getNumberOfShares() {
                return this.numberOfShares;
            }

            public final List<TaxLotSelection> getSelectedLots() {
                return this.selectedLots;
            }
        }

        /* compiled from: SelectLotsKey.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result$Complete;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "numberOfShares", "Ljava/math/BigDecimal;", "selectedLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "<init>", "(Ljava/math/BigDecimal;Ljava/util/List;)V", "getNumberOfShares", "()Ljava/math/BigDecimal;", "getSelectedLots", "()Ljava/util/List;", "resultCode", "", "getResultCode", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Complete implements Result {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Complete> CREATOR = new Creator();
            private final BigDecimal numberOfShares;
            private final List<TaxLotSelection> selectedLots;

            /* compiled from: SelectLotsKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Complete> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readSerializable());
                    }
                    return new Complete(bigDecimal, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete[] newArray(int i) {
                    return new Complete[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Complete copy$default(Complete complete, BigDecimal bigDecimal, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = complete.numberOfShares;
                }
                if ((i & 2) != 0) {
                    list = complete.selectedLots;
                }
                return complete.copy(bigDecimal, list);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getNumberOfShares() {
                return this.numberOfShares;
            }

            public final List<TaxLotSelection> component2() {
                return this.selectedLots;
            }

            public final Complete copy(BigDecimal numberOfShares, List<TaxLotSelection> selectedLots) {
                Intrinsics.checkNotNullParameter(numberOfShares, "numberOfShares");
                Intrinsics.checkNotNullParameter(selectedLots, "selectedLots");
                return new Complete(numberOfShares, selectedLots);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return Intrinsics.areEqual(this.numberOfShares, complete.numberOfShares) && Intrinsics.areEqual(this.selectedLots, complete.selectedLots);
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return -1;
            }

            public int hashCode() {
                return (this.numberOfShares.hashCode() * 31) + this.selectedLots.hashCode();
            }

            public String toString() {
                return "Complete(numberOfShares=" + this.numberOfShares + ", selectedLots=" + this.selectedLots + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.numberOfShares);
                List<TaxLotSelection> list = this.selectedLots;
                dest.writeInt(list.size());
                Iterator<TaxLotSelection> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeSerializable(it.next());
                }
            }

            public Complete(BigDecimal numberOfShares, List<TaxLotSelection> selectedLots) {
                Intrinsics.checkNotNullParameter(numberOfShares, "numberOfShares");
                Intrinsics.checkNotNullParameter(selectedLots, "selectedLots");
                this.numberOfShares = numberOfShares;
                this.selectedLots = selectedLots;
            }

            public final BigDecimal getNumberOfShares() {
                return this.numberOfShares;
            }

            public final List<TaxLotSelection> getSelectedLots() {
                return this.selectedLots;
            }
        }

        /* compiled from: SelectLotsKey.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result$Canceled;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Canceled implements Result {
            public static final int $stable = 0;
            public static final Canceled INSTANCE = new Canceled();
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

            /* compiled from: SelectLotsKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Canceled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Canceled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i) {
                    return new Canceled[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Canceled);
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return 0;
            }

            public int hashCode() {
                return -247619739;
            }

            public String toString() {
                return "Canceled";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Canceled() {
            }
        }
    }
}
