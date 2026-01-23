package com.robinhood.android.margin.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCallMarketOrderFragmentKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0006J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/MarginCallMarketOrderFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "closePositionsCount", "", "estimatedValue", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getClosePositionsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEstimatedValue", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/robinhood/android/margin/contracts/MarginCallMarketOrderFragmentKey;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginCallMarketOrderFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<MarginCallMarketOrderFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final Integer closePositionsCount;
    private final String estimatedValue;

    /* compiled from: MarginCallMarketOrderFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginCallMarketOrderFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginCallMarketOrderFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginCallMarketOrderFragmentKey(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginCallMarketOrderFragmentKey[] newArray(int i) {
            return new MarginCallMarketOrderFragmentKey[i];
        }
    }

    public static /* synthetic */ MarginCallMarketOrderFragmentKey copy$default(MarginCallMarketOrderFragmentKey marginCallMarketOrderFragmentKey, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginCallMarketOrderFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            num = marginCallMarketOrderFragmentKey.closePositionsCount;
        }
        if ((i & 4) != 0) {
            str2 = marginCallMarketOrderFragmentKey.estimatedValue;
        }
        return marginCallMarketOrderFragmentKey.copy(str, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getClosePositionsCount() {
        return this.closePositionsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEstimatedValue() {
        return this.estimatedValue;
    }

    public final MarginCallMarketOrderFragmentKey copy(String accountNumber, Integer closePositionsCount, String estimatedValue) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new MarginCallMarketOrderFragmentKey(accountNumber, closePositionsCount, estimatedValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginCallMarketOrderFragmentKey)) {
            return false;
        }
        MarginCallMarketOrderFragmentKey marginCallMarketOrderFragmentKey = (MarginCallMarketOrderFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, marginCallMarketOrderFragmentKey.accountNumber) && Intrinsics.areEqual(this.closePositionsCount, marginCallMarketOrderFragmentKey.closePositionsCount) && Intrinsics.areEqual(this.estimatedValue, marginCallMarketOrderFragmentKey.estimatedValue);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        Integer num = this.closePositionsCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.estimatedValue;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MarginCallMarketOrderFragmentKey(accountNumber=" + this.accountNumber + ", closePositionsCount=" + this.closePositionsCount + ", estimatedValue=" + this.estimatedValue + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        Integer num = this.closePositionsCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.estimatedValue);
    }

    public MarginCallMarketOrderFragmentKey(String accountNumber, Integer num, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.closePositionsCount = num;
        this.estimatedValue = str;
    }

    public /* synthetic */ MarginCallMarketOrderFragmentKey(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Integer getClosePositionsCount() {
        return this.closePositionsCount;
    }

    public final String getEstimatedValue() {
        return this.estimatedValue;
    }
}
