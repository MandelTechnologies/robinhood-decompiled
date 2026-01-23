package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/HoldingsDrillDownFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "assetClassRegion", "Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;)V", "getAccountNumber", "()Ljava/lang/String;", "getAssetClassRegion", "()Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class HoldingsDrillDownFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<HoldingsDrillDownFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final AssetClass3 assetClassRegion;

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<HoldingsDrillDownFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoldingsDrillDownFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoldingsDrillDownFragmentKey(parcel.readString(), AssetClass3.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoldingsDrillDownFragmentKey[] newArray(int i) {
            return new HoldingsDrillDownFragmentKey[i];
        }
    }

    public static /* synthetic */ HoldingsDrillDownFragmentKey copy$default(HoldingsDrillDownFragmentKey holdingsDrillDownFragmentKey, String str, AssetClass3 assetClass3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holdingsDrillDownFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            assetClass3 = holdingsDrillDownFragmentKey.assetClassRegion;
        }
        return holdingsDrillDownFragmentKey.copy(str, assetClass3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final AssetClass3 getAssetClassRegion() {
        return this.assetClassRegion;
    }

    public final HoldingsDrillDownFragmentKey copy(String accountNumber, AssetClass3 assetClassRegion) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
        return new HoldingsDrillDownFragmentKey(accountNumber, assetClassRegion);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingsDrillDownFragmentKey)) {
            return false;
        }
        HoldingsDrillDownFragmentKey holdingsDrillDownFragmentKey = (HoldingsDrillDownFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, holdingsDrillDownFragmentKey.accountNumber) && this.assetClassRegion == holdingsDrillDownFragmentKey.assetClassRegion;
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + this.assetClassRegion.hashCode();
    }

    public String toString() {
        return "HoldingsDrillDownFragmentKey(accountNumber=" + this.accountNumber + ", assetClassRegion=" + this.assetClassRegion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.assetClassRegion.name());
    }

    public HoldingsDrillDownFragmentKey(String accountNumber, AssetClass3 assetClassRegion) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
        this.accountNumber = accountNumber;
        this.assetClassRegion = assetClassRegion;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final AssetClass3 getAssetClassRegion() {
        return this.assetClassRegion;
    }
}
