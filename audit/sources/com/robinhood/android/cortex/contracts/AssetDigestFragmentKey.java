package com.robinhood.android.cortex.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "instrumentDigest", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "variant", "Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "<init>", "(Lcom/robinhood/android/cortex/models/asset/AssetDigest;Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;)V", "getInstrumentDigest", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "getVariant", "()Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AssetDigestFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<AssetDigestFragmentKey> CREATOR = new Creator();
    private final AssetDigest instrumentDigest;
    private final AssetDigestValuePropsExperiment2 variant;

    /* compiled from: AssetDigestFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetDigestFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDigestFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetDigestFragmentKey((AssetDigest) parcel.readParcelable(AssetDigestFragmentKey.class.getClassLoader()), AssetDigestValuePropsExperiment2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDigestFragmentKey[] newArray(int i) {
            return new AssetDigestFragmentKey[i];
        }
    }

    public static /* synthetic */ AssetDigestFragmentKey copy$default(AssetDigestFragmentKey assetDigestFragmentKey, AssetDigest assetDigest, AssetDigestValuePropsExperiment2 assetDigestValuePropsExperiment2, int i, Object obj) {
        if ((i & 1) != 0) {
            assetDigest = assetDigestFragmentKey.instrumentDigest;
        }
        if ((i & 2) != 0) {
            assetDigestValuePropsExperiment2 = assetDigestFragmentKey.variant;
        }
        return assetDigestFragmentKey.copy(assetDigest, assetDigestValuePropsExperiment2);
    }

    /* renamed from: component1, reason: from getter */
    public final AssetDigest getInstrumentDigest() {
        return this.instrumentDigest;
    }

    /* renamed from: component2, reason: from getter */
    public final AssetDigestValuePropsExperiment2 getVariant() {
        return this.variant;
    }

    public final AssetDigestFragmentKey copy(AssetDigest instrumentDigest, AssetDigestValuePropsExperiment2 variant) {
        Intrinsics.checkNotNullParameter(instrumentDigest, "instrumentDigest");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new AssetDigestFragmentKey(instrumentDigest, variant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetDigestFragmentKey)) {
            return false;
        }
        AssetDigestFragmentKey assetDigestFragmentKey = (AssetDigestFragmentKey) other;
        return Intrinsics.areEqual(this.instrumentDigest, assetDigestFragmentKey.instrumentDigest) && this.variant == assetDigestFragmentKey.variant;
    }

    public int hashCode() {
        return (this.instrumentDigest.hashCode() * 31) + this.variant.hashCode();
    }

    public String toString() {
        return "AssetDigestFragmentKey(instrumentDigest=" + this.instrumentDigest + ", variant=" + this.variant + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.instrumentDigest, flags);
        dest.writeString(this.variant.name());
    }

    public AssetDigestFragmentKey(AssetDigest instrumentDigest, AssetDigestValuePropsExperiment2 variant) {
        Intrinsics.checkNotNullParameter(instrumentDigest, "instrumentDigest");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.instrumentDigest = instrumentDigest;
        this.variant = variant;
    }

    public final AssetDigest getInstrumentDigest() {
        return this.instrumentDigest;
    }

    public final AssetDigestValuePropsExperiment2 getVariant() {
        return this.variant;
    }
}
