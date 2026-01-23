package com.robinhood.shared.account.contracts.switcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiAccountSwitcherBottomSheetFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/SduiAccountSwitcherBottomSheetFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "<init>", "(Lcontracts/account_switcher/proto/v1/SurfaceDto;)V", "getSurface", "()Lcontracts/account_switcher/proto/v1/SurfaceDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class SduiAccountSwitcherBottomSheetFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<SduiAccountSwitcherBottomSheetFragmentKey> CREATOR = new Creator();
    private final SurfaceDto surface;

    /* compiled from: SduiAccountSwitcherBottomSheetFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SduiAccountSwitcherBottomSheetFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SduiAccountSwitcherBottomSheetFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SduiAccountSwitcherBottomSheetFragmentKey((SurfaceDto) parcel.readParcelable(SduiAccountSwitcherBottomSheetFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SduiAccountSwitcherBottomSheetFragmentKey[] newArray(int i) {
            return new SduiAccountSwitcherBottomSheetFragmentKey[i];
        }
    }

    public static /* synthetic */ SduiAccountSwitcherBottomSheetFragmentKey copy$default(SduiAccountSwitcherBottomSheetFragmentKey sduiAccountSwitcherBottomSheetFragmentKey, SurfaceDto surfaceDto, int i, Object obj) {
        if ((i & 1) != 0) {
            surfaceDto = sduiAccountSwitcherBottomSheetFragmentKey.surface;
        }
        return sduiAccountSwitcherBottomSheetFragmentKey.copy(surfaceDto);
    }

    /* renamed from: component1, reason: from getter */
    public final SurfaceDto getSurface() {
        return this.surface;
    }

    public final SduiAccountSwitcherBottomSheetFragmentKey copy(SurfaceDto surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        return new SduiAccountSwitcherBottomSheetFragmentKey(surface);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SduiAccountSwitcherBottomSheetFragmentKey) && Intrinsics.areEqual(this.surface, ((SduiAccountSwitcherBottomSheetFragmentKey) other).surface);
    }

    public int hashCode() {
        return this.surface.hashCode();
    }

    public String toString() {
        return "SduiAccountSwitcherBottomSheetFragmentKey(surface=" + this.surface + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.surface, flags);
    }

    public SduiAccountSwitcherBottomSheetFragmentKey(SurfaceDto surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.surface = surface;
    }

    public final SurfaceDto getSurface() {
        return this.surface;
    }
}
