package com.robinhood.android.portfolio.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSortOptionsKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "Landroid/os/Parcelable;", "accountNumber", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/PositionsSortPreference;)V", "getAccountNumber", "()Ljava/lang/String;", "getPositionInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getSortPreference", "()Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PositionsSortResult implements Parcelable {
    public static final Parcelable.Creator<PositionsSortResult> CREATOR = new Creator();
    private final String accountNumber;
    private final PositionInstrumentType positionInstrumentType;
    private final PositionsSortPreference sortPreference;

    /* compiled from: PositionsSortOptionsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PositionsSortResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionsSortResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PositionsSortResult(parcel.readString(), PositionInstrumentType.valueOf(parcel.readString()), (PositionsSortPreference) parcel.readParcelable(PositionsSortResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionsSortResult[] newArray(int i) {
            return new PositionsSortResult[i];
        }
    }

    public static /* synthetic */ PositionsSortResult copy$default(PositionsSortResult positionsSortResult, String str, PositionInstrumentType positionInstrumentType, PositionsSortPreference positionsSortPreference, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionsSortResult.accountNumber;
        }
        if ((i & 2) != 0) {
            positionInstrumentType = positionsSortResult.positionInstrumentType;
        }
        if ((i & 4) != 0) {
            positionsSortPreference = positionsSortResult.sortPreference;
        }
        return positionsSortResult.copy(str, positionInstrumentType, positionsSortPreference);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    /* renamed from: component3, reason: from getter */
    public final PositionsSortPreference getSortPreference() {
        return this.sortPreference;
    }

    public final PositionsSortResult copy(String accountNumber, PositionInstrumentType positionInstrumentType, PositionsSortPreference sortPreference) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        return new PositionsSortResult(accountNumber, positionInstrumentType, sortPreference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionsSortResult)) {
            return false;
        }
        PositionsSortResult positionsSortResult = (PositionsSortResult) other;
        return Intrinsics.areEqual(this.accountNumber, positionsSortResult.accountNumber) && this.positionInstrumentType == positionsSortResult.positionInstrumentType && Intrinsics.areEqual(this.sortPreference, positionsSortResult.sortPreference);
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.positionInstrumentType.hashCode()) * 31;
        PositionsSortPreference positionsSortPreference = this.sortPreference;
        return iHashCode + (positionsSortPreference == null ? 0 : positionsSortPreference.hashCode());
    }

    public String toString() {
        return "PositionsSortResult(accountNumber=" + this.accountNumber + ", positionInstrumentType=" + this.positionInstrumentType + ", sortPreference=" + this.sortPreference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.positionInstrumentType.name());
        dest.writeParcelable(this.sortPreference, flags);
    }

    public PositionsSortResult(String accountNumber, PositionInstrumentType positionInstrumentType, PositionsSortPreference positionsSortPreference) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        this.accountNumber = accountNumber;
        this.positionInstrumentType = positionInstrumentType;
        this.sortPreference = positionsSortPreference;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    public final PositionsSortPreference getSortPreference() {
        return this.sortPreference;
    }
}
