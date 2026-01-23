package com.robinhood.android.cortex.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestOnboardingFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "skipSplash", "", "source", "", "flowType", "Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;)V", "getSkipSplash", "()Z", "getSource", "()Ljava/lang/String;", "getFlowType", "()Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AssetDigestOnboardingFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<AssetDigestOnboardingFragmentKey> CREATOR = new Creator();
    private final AssetDigestOnboardingFlowType flowType;
    private final boolean skipSplash;
    private final String source;

    /* compiled from: AssetDigestOnboardingFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetDigestOnboardingFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDigestOnboardingFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetDigestOnboardingFragmentKey(parcel.readInt() != 0, parcel.readString(), AssetDigestOnboardingFlowType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDigestOnboardingFragmentKey[] newArray(int i) {
            return new AssetDigestOnboardingFragmentKey[i];
        }
    }

    public AssetDigestOnboardingFragmentKey() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ AssetDigestOnboardingFragmentKey copy$default(AssetDigestOnboardingFragmentKey assetDigestOnboardingFragmentKey, boolean z, String str, AssetDigestOnboardingFlowType assetDigestOnboardingFlowType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = assetDigestOnboardingFragmentKey.skipSplash;
        }
        if ((i & 2) != 0) {
            str = assetDigestOnboardingFragmentKey.source;
        }
        if ((i & 4) != 0) {
            assetDigestOnboardingFlowType = assetDigestOnboardingFragmentKey.flowType;
        }
        return assetDigestOnboardingFragmentKey.copy(z, str, assetDigestOnboardingFlowType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSkipSplash() {
        return this.skipSplash;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final AssetDigestOnboardingFlowType getFlowType() {
        return this.flowType;
    }

    public final AssetDigestOnboardingFragmentKey copy(boolean skipSplash, String source, AssetDigestOnboardingFlowType flowType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return new AssetDigestOnboardingFragmentKey(skipSplash, source, flowType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetDigestOnboardingFragmentKey)) {
            return false;
        }
        AssetDigestOnboardingFragmentKey assetDigestOnboardingFragmentKey = (AssetDigestOnboardingFragmentKey) other;
        return this.skipSplash == assetDigestOnboardingFragmentKey.skipSplash && Intrinsics.areEqual(this.source, assetDigestOnboardingFragmentKey.source) && this.flowType == assetDigestOnboardingFragmentKey.flowType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.skipSplash) * 31;
        String str = this.source;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.flowType.hashCode();
    }

    public String toString() {
        return "AssetDigestOnboardingFragmentKey(skipSplash=" + this.skipSplash + ", source=" + this.source + ", flowType=" + this.flowType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.skipSplash ? 1 : 0);
        dest.writeString(this.source);
        dest.writeString(this.flowType.name());
    }

    public AssetDigestOnboardingFragmentKey(boolean z, String str, AssetDigestOnboardingFlowType flowType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.skipSplash = z;
        this.source = str;
        this.flowType = flowType;
    }

    public final boolean getSkipSplash() {
        return this.skipSplash;
    }

    public final String getSource() {
        return this.source;
    }

    public /* synthetic */ AssetDigestOnboardingFragmentKey(boolean z, String str, AssetDigestOnboardingFlowType assetDigestOnboardingFlowType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? AssetDigestOnboardingFlowType.UNSPECIFIED : assetDigestOnboardingFlowType);
    }

    public final AssetDigestOnboardingFlowType getFlowType() {
        return this.flowType;
    }
}
