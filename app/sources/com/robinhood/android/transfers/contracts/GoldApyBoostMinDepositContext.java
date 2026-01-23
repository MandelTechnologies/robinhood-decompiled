package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldApyBoostMinDepositContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/GoldApyBoostMinDepositContext;", "Landroid/os/Parcelable;", "minDepositRate", "", "minDepositAmount", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getMinDepositRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinDepositAmount", "isValidContext", "", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/robinhood/android/transfers/contracts/GoldApyBoostMinDepositContext;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GoldApyBoostMinDepositContext implements Parcelable {
    public static final Parcelable.Creator<GoldApyBoostMinDepositContext> CREATOR = new Creator();
    private final Double minDepositAmount;
    private final Double minDepositRate;

    /* compiled from: GoldApyBoostMinDepositContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldApyBoostMinDepositContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldApyBoostMinDepositContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldApyBoostMinDepositContext(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldApyBoostMinDepositContext[] newArray(int i) {
            return new GoldApyBoostMinDepositContext[i];
        }
    }

    public static /* synthetic */ GoldApyBoostMinDepositContext copy$default(GoldApyBoostMinDepositContext goldApyBoostMinDepositContext, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = goldApyBoostMinDepositContext.minDepositRate;
        }
        if ((i & 2) != 0) {
            d2 = goldApyBoostMinDepositContext.minDepositAmount;
        }
        return goldApyBoostMinDepositContext.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getMinDepositRate() {
        return this.minDepositRate;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getMinDepositAmount() {
        return this.minDepositAmount;
    }

    public final GoldApyBoostMinDepositContext copy(Double minDepositRate, Double minDepositAmount) {
        return new GoldApyBoostMinDepositContext(minDepositRate, minDepositAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldApyBoostMinDepositContext)) {
            return false;
        }
        GoldApyBoostMinDepositContext goldApyBoostMinDepositContext = (GoldApyBoostMinDepositContext) other;
        return Intrinsics.areEqual((Object) this.minDepositRate, (Object) goldApyBoostMinDepositContext.minDepositRate) && Intrinsics.areEqual((Object) this.minDepositAmount, (Object) goldApyBoostMinDepositContext.minDepositAmount);
    }

    public int hashCode() {
        Double d = this.minDepositRate;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.minDepositAmount;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "GoldApyBoostMinDepositContext(minDepositRate=" + this.minDepositRate + ", minDepositAmount=" + this.minDepositAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Double d = this.minDepositRate;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        Double d2 = this.minDepositAmount;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
    }

    public GoldApyBoostMinDepositContext(Double d, Double d2) {
        this.minDepositRate = d;
        this.minDepositAmount = d2;
    }

    public final Double getMinDepositRate() {
        return this.minDepositRate;
    }

    public final Double getMinDepositAmount() {
        return this.minDepositAmount;
    }

    public final boolean isValidContext() {
        return (this.minDepositAmount == null || this.minDepositRate == null) ? false : true;
    }
}
