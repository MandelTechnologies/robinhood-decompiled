package com.robinhood.android.equities.contracts.fund;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FundBreakdownFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/fund/FundBreakdownFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "instrumentId", "Ljava/util/UUID;", "selectedHoldingName", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSelectedHoldingName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundBreakdownFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<FundBreakdownFragmentKey> CREATOR = new Creator();
    private final UUID instrumentId;
    private final String selectedHoldingName;

    /* compiled from: FundBreakdownFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FundBreakdownFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundBreakdownFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FundBreakdownFragmentKey((UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundBreakdownFragmentKey[] newArray(int i) {
            return new FundBreakdownFragmentKey[i];
        }
    }

    public static /* synthetic */ FundBreakdownFragmentKey copy$default(FundBreakdownFragmentKey fundBreakdownFragmentKey, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = fundBreakdownFragmentKey.instrumentId;
        }
        if ((i & 2) != 0) {
            str = fundBreakdownFragmentKey.selectedHoldingName;
        }
        return fundBreakdownFragmentKey.copy(uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedHoldingName() {
        return this.selectedHoldingName;
    }

    public final FundBreakdownFragmentKey copy(UUID instrumentId, String selectedHoldingName) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new FundBreakdownFragmentKey(instrumentId, selectedHoldingName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundBreakdownFragmentKey)) {
            return false;
        }
        FundBreakdownFragmentKey fundBreakdownFragmentKey = (FundBreakdownFragmentKey) other;
        return Intrinsics.areEqual(this.instrumentId, fundBreakdownFragmentKey.instrumentId) && Intrinsics.areEqual(this.selectedHoldingName, fundBreakdownFragmentKey.selectedHoldingName);
    }

    public int hashCode() {
        int iHashCode = this.instrumentId.hashCode() * 31;
        String str = this.selectedHoldingName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FundBreakdownFragmentKey(instrumentId=" + this.instrumentId + ", selectedHoldingName=" + this.selectedHoldingName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        dest.writeString(this.selectedHoldingName);
    }

    public FundBreakdownFragmentKey(UUID instrumentId, String str) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
        this.selectedHoldingName = str;
    }

    public /* synthetic */ FundBreakdownFragmentKey(UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : str);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSelectedHoldingName() {
        return this.selectedHoldingName;
    }
}
