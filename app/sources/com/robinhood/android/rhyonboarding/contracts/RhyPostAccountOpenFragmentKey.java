package com.robinhood.android.rhyonboarding.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyPostAccountOpenFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/contracts/RhyPostAccountOpenFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "exitDeepLinkOverride", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getExitDeepLinkOverride", "()Landroid/net/Uri;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RhyPostAccountOpenFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<RhyPostAccountOpenFragmentKey> CREATOR = new Creator();
    private final Uri exitDeepLinkOverride;

    /* compiled from: RhyPostAccountOpenFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RhyPostAccountOpenFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyPostAccountOpenFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RhyPostAccountOpenFragmentKey((Uri) parcel.readParcelable(RhyPostAccountOpenFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyPostAccountOpenFragmentKey[] newArray(int i) {
            return new RhyPostAccountOpenFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RhyPostAccountOpenFragmentKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RhyPostAccountOpenFragmentKey copy$default(RhyPostAccountOpenFragmentKey rhyPostAccountOpenFragmentKey, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = rhyPostAccountOpenFragmentKey.exitDeepLinkOverride;
        }
        return rhyPostAccountOpenFragmentKey.copy(uri);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getExitDeepLinkOverride() {
        return this.exitDeepLinkOverride;
    }

    public final RhyPostAccountOpenFragmentKey copy(Uri exitDeepLinkOverride) {
        return new RhyPostAccountOpenFragmentKey(exitDeepLinkOverride);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RhyPostAccountOpenFragmentKey) && Intrinsics.areEqual(this.exitDeepLinkOverride, ((RhyPostAccountOpenFragmentKey) other).exitDeepLinkOverride);
    }

    public int hashCode() {
        Uri uri = this.exitDeepLinkOverride;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public String toString() {
        return "RhyPostAccountOpenFragmentKey(exitDeepLinkOverride=" + this.exitDeepLinkOverride + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.exitDeepLinkOverride, flags);
    }

    public RhyPostAccountOpenFragmentKey(Uri uri) {
        this.exitDeepLinkOverride = uri;
    }

    public /* synthetic */ RhyPostAccountOpenFragmentKey(Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri);
    }

    public final Uri getExitDeepLinkOverride() {
        return this.exitDeepLinkOverride;
    }
}
