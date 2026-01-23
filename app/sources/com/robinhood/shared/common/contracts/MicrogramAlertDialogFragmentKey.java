package com.robinhood.shared.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramLaunchId;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: MicrogramAlertDialogFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006j\b\u0012\u0004\u0012\u00020\b`\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J%\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006j\b\u0012\u0004\u0012\u00020\b`\nHÆ\u0003J\t\u0010\u0017\u001a\u00020\fHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042$\b\u0002\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006j\b\u0012\u0004\u0012\u00020\b`\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\fHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R-\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006j\b\u0012\u0004\u0012\u00020\b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/MicrogramAlertDialogFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "id", "Lmicrogram/android/MicrogramLaunchId;", "alert", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Lrh_server_driven_ui/v1/AlertDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyAlertContent;", "routerIdentifier", "", "<init>", "(Lmicrogram/android/MicrogramLaunchId;Lcom/robinhood/android/shared/serverui/utils/UiObject;Ljava/lang/String;)V", "getId", "()Lmicrogram/android/MicrogramLaunchId;", "getAlert", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "getRouterIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class MicrogramAlertDialogFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<MicrogramAlertDialogFragmentKey> CREATOR = new Creator();
    private final UiObject<GenericAlertContent<MicrogramAction>, AlertDto> alert;
    private final MicrogramLaunchId id;
    private final String routerIdentifier;

    /* compiled from: MicrogramAlertDialogFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<MicrogramAlertDialogFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramAlertDialogFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MicrogramAlertDialogFragmentKey((MicrogramLaunchId) parcel.readParcelable(MicrogramAlertDialogFragmentKey.class.getClassLoader()), (UiObject) parcel.readParcelable(MicrogramAlertDialogFragmentKey.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramAlertDialogFragmentKey[] newArray(int i) {
            return new MicrogramAlertDialogFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MicrogramAlertDialogFragmentKey copy$default(MicrogramAlertDialogFragmentKey microgramAlertDialogFragmentKey, MicrogramLaunchId microgramLaunchId, UiObject uiObject, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramLaunchId = microgramAlertDialogFragmentKey.id;
        }
        if ((i & 2) != 0) {
            uiObject = microgramAlertDialogFragmentKey.alert;
        }
        if ((i & 4) != 0) {
            str = microgramAlertDialogFragmentKey.routerIdentifier;
        }
        return microgramAlertDialogFragmentKey.copy(microgramLaunchId, uiObject, str);
    }

    /* renamed from: component1, reason: from getter */
    public final MicrogramLaunchId getId() {
        return this.id;
    }

    public final UiObject<GenericAlertContent<MicrogramAction>, AlertDto> component2() {
        return this.alert;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRouterIdentifier() {
        return this.routerIdentifier;
    }

    public final MicrogramAlertDialogFragmentKey copy(MicrogramLaunchId id, UiObject<GenericAlertContent<MicrogramAction>, AlertDto> alert, String routerIdentifier) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        return new MicrogramAlertDialogFragmentKey(id, alert, routerIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicrogramAlertDialogFragmentKey)) {
            return false;
        }
        MicrogramAlertDialogFragmentKey microgramAlertDialogFragmentKey = (MicrogramAlertDialogFragmentKey) other;
        return Intrinsics.areEqual(this.id, microgramAlertDialogFragmentKey.id) && Intrinsics.areEqual(this.alert, microgramAlertDialogFragmentKey.alert) && Intrinsics.areEqual(this.routerIdentifier, microgramAlertDialogFragmentKey.routerIdentifier);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.alert.hashCode()) * 31) + this.routerIdentifier.hashCode();
    }

    public String toString() {
        return "MicrogramAlertDialogFragmentKey(id=" + this.id + ", alert=" + this.alert + ", routerIdentifier=" + this.routerIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.id, flags);
        dest.writeParcelable(this.alert, flags);
        dest.writeString(this.routerIdentifier);
    }

    public MicrogramAlertDialogFragmentKey(MicrogramLaunchId id, UiObject<GenericAlertContent<MicrogramAction>, AlertDto> alert, String routerIdentifier) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        this.id = id;
        this.alert = alert;
        this.routerIdentifier = routerIdentifier;
    }

    public final MicrogramLaunchId getId() {
        return this.id;
    }

    public final UiObject<GenericAlertContent<MicrogramAction>, AlertDto> getAlert() {
        return this.alert;
    }

    public final String getRouterIdentifier() {
        return this.routerIdentifier;
    }
}
