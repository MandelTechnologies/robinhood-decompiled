package com.robinhood.android.portfolio.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsDisplayOptionsKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PositionsDisplayOptionsKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PositionsDisplayOptionsKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<PositionsDisplayOptionsKey> CREATOR = new Creator();
    private final String accountNumber;
    private final PositionInstrumentType instrumentType;
    private final PositionsLocation positionsLocation;

    /* compiled from: PositionsDisplayOptionsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<PositionsDisplayOptionsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionsDisplayOptionsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PositionsDisplayOptionsKey(parcel.readString(), PositionInstrumentType.valueOf(parcel.readString()), PositionsLocation.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionsDisplayOptionsKey[] newArray(int i) {
            return new PositionsDisplayOptionsKey[i];
        }
    }

    public static /* synthetic */ PositionsDisplayOptionsKey copy$default(PositionsDisplayOptionsKey positionsDisplayOptionsKey, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionsDisplayOptionsKey.accountNumber;
        }
        if ((i & 2) != 0) {
            positionInstrumentType = positionsDisplayOptionsKey.instrumentType;
        }
        if ((i & 4) != 0) {
            positionsLocation = positionsDisplayOptionsKey.positionsLocation;
        }
        return positionsDisplayOptionsKey.copy(str, positionInstrumentType, positionsLocation);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component3, reason: from getter */
    public final PositionsLocation getPositionsLocation() {
        return this.positionsLocation;
    }

    public final PositionsDisplayOptionsKey copy(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        return new PositionsDisplayOptionsKey(accountNumber, instrumentType, positionsLocation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionsDisplayOptionsKey)) {
            return false;
        }
        PositionsDisplayOptionsKey positionsDisplayOptionsKey = (PositionsDisplayOptionsKey) other;
        return Intrinsics.areEqual(this.accountNumber, positionsDisplayOptionsKey.accountNumber) && this.instrumentType == positionsDisplayOptionsKey.instrumentType && this.positionsLocation == positionsDisplayOptionsKey.positionsLocation;
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.instrumentType.hashCode()) * 31) + this.positionsLocation.hashCode();
    }

    public String toString() {
        return "PositionsDisplayOptionsKey(accountNumber=" + this.accountNumber + ", instrumentType=" + this.instrumentType + ", positionsLocation=" + this.positionsLocation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.instrumentType.name());
        dest.writeString(this.positionsLocation.name());
    }

    public PositionsDisplayOptionsKey(String accountNumber, PositionInstrumentType instrumentType, PositionsLocation positionsLocation) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        this.accountNumber = accountNumber;
        this.instrumentType = instrumentType;
        this.positionsLocation = positionsLocation;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final PositionInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public /* synthetic */ PositionsDisplayOptionsKey(String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, positionInstrumentType, (i & 4) != 0 ? PositionsLocation.UNKNOWN : positionsLocation);
    }

    public final PositionsLocation getPositionsLocation() {
        return this.positionsLocation;
    }
}
