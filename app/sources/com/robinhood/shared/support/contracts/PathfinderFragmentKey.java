package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.support.contracts.PathfinderFragmentKey2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/PathfinderFragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "inquiryId", "Ljava/util/UUID;", "setResultMode", "Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode;)V", "getInquiryId", "()Ljava/util/UUID;", "getSetResultMode", "()Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class PathfinderFragmentKey implements Parcelable, FragmentKey {
    public static final Parcelable.Creator<PathfinderFragmentKey> CREATOR = new Creator();
    private final UUID inquiryId;
    private final PathfinderFragmentKey2 setResultMode;

    /* compiled from: PathfinderFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PathfinderFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PathfinderFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PathfinderFragmentKey((UUID) parcel.readSerializable(), (PathfinderFragmentKey2) parcel.readParcelable(PathfinderFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PathfinderFragmentKey[] newArray(int i) {
            return new PathfinderFragmentKey[i];
        }
    }

    public static /* synthetic */ PathfinderFragmentKey copy$default(PathfinderFragmentKey pathfinderFragmentKey, UUID uuid, PathfinderFragmentKey2 pathfinderFragmentKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = pathfinderFragmentKey.inquiryId;
        }
        if ((i & 2) != 0) {
            pathfinderFragmentKey2 = pathfinderFragmentKey.setResultMode;
        }
        return pathfinderFragmentKey.copy(uuid, pathfinderFragmentKey2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    /* renamed from: component2, reason: from getter */
    public final PathfinderFragmentKey2 getSetResultMode() {
        return this.setResultMode;
    }

    public final PathfinderFragmentKey copy(UUID inquiryId, PathfinderFragmentKey2 setResultMode) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(setResultMode, "setResultMode");
        return new PathfinderFragmentKey(inquiryId, setResultMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathfinderFragmentKey)) {
            return false;
        }
        PathfinderFragmentKey pathfinderFragmentKey = (PathfinderFragmentKey) other;
        return Intrinsics.areEqual(this.inquiryId, pathfinderFragmentKey.inquiryId) && Intrinsics.areEqual(this.setResultMode, pathfinderFragmentKey.setResultMode);
    }

    public int hashCode() {
        return (this.inquiryId.hashCode() * 31) + this.setResultMode.hashCode();
    }

    public String toString() {
        return "PathfinderFragmentKey(inquiryId=" + this.inquiryId + ", setResultMode=" + this.setResultMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.inquiryId);
        dest.writeParcelable(this.setResultMode, flags);
    }

    public PathfinderFragmentKey(UUID inquiryId, PathfinderFragmentKey2 setResultMode) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(setResultMode, "setResultMode");
        this.inquiryId = inquiryId;
        this.setResultMode = setResultMode;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public /* synthetic */ PathfinderFragmentKey(UUID uuid, PathfinderFragmentKey2 pathfinderFragmentKey2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? PathfinderFragmentKey2.None.INSTANCE : pathfinderFragmentKey2);
    }

    public final PathfinderFragmentKey2 getSetResultMode() {
        return this.setResultMode;
    }
}
