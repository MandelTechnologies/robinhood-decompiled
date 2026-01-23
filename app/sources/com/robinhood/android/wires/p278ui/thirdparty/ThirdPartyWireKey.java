package com.robinhood.android.wires.p278ui.thirdparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThirdPartyWireKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/ThirdPartyWireKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "useGenericMode", "", "<init>", "(Z)V", "getUseGenericMode", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ThirdPartyWireKey implements FragmentKey, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ThirdPartyWireKey> CREATOR = new Creator();
    private final boolean useGenericMode;

    /* compiled from: ThirdPartyWireKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ThirdPartyWireKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThirdPartyWireKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThirdPartyWireKey(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThirdPartyWireKey[] newArray(int i) {
            return new ThirdPartyWireKey[i];
        }
    }

    public ThirdPartyWireKey() {
        this(false, 1, null);
    }

    public static /* synthetic */ ThirdPartyWireKey copy$default(ThirdPartyWireKey thirdPartyWireKey, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = thirdPartyWireKey.useGenericMode;
        }
        return thirdPartyWireKey.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseGenericMode() {
        return this.useGenericMode;
    }

    public final ThirdPartyWireKey copy(boolean useGenericMode) {
        return new ThirdPartyWireKey(useGenericMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThirdPartyWireKey) && this.useGenericMode == ((ThirdPartyWireKey) other).useGenericMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useGenericMode);
    }

    public String toString() {
        return "ThirdPartyWireKey(useGenericMode=" + this.useGenericMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.useGenericMode ? 1 : 0);
    }

    public ThirdPartyWireKey(boolean z) {
        this.useGenericMode = z;
    }

    public /* synthetic */ ThirdPartyWireKey(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getUseGenericMode() {
        return this.useGenericMode;
    }
}
