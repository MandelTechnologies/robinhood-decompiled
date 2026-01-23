package com.robinhood.android.acatsin.failedtransferbottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: FailedTransferBottomSheetKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acatsin/failedtransferbottomsheet/FailedTransferBottomSheetKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;", "<init>", "(Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;)V", "getDetails", "()Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class FailedTransferBottomSheetKey implements DialogFragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FailedTransferBottomSheetKey> CREATOR = new Creator();
    private final AcatsTransferHubBottomSheetDetails details;

    /* compiled from: FailedTransferBottomSheetKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FailedTransferBottomSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FailedTransferBottomSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FailedTransferBottomSheetKey((AcatsTransferHubBottomSheetDetails) parcel.readParcelable(FailedTransferBottomSheetKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FailedTransferBottomSheetKey[] newArray(int i) {
            return new FailedTransferBottomSheetKey[i];
        }
    }

    public static /* synthetic */ FailedTransferBottomSheetKey copy$default(FailedTransferBottomSheetKey failedTransferBottomSheetKey, AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsTransferHubBottomSheetDetails = failedTransferBottomSheetKey.details;
        }
        return failedTransferBottomSheetKey.copy(acatsTransferHubBottomSheetDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsTransferHubBottomSheetDetails getDetails() {
        return this.details;
    }

    public final FailedTransferBottomSheetKey copy(AcatsTransferHubBottomSheetDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new FailedTransferBottomSheetKey(details);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FailedTransferBottomSheetKey) && Intrinsics.areEqual(this.details, ((FailedTransferBottomSheetKey) other).details);
    }

    public int hashCode() {
        return this.details.hashCode();
    }

    public String toString() {
        return "FailedTransferBottomSheetKey(details=" + this.details + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.details, flags);
    }

    public FailedTransferBottomSheetKey(AcatsTransferHubBottomSheetDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.details = details;
    }

    public final AcatsTransferHubBottomSheetDetails getDetails() {
        return this.details;
    }
}
