package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.nfc.ChipAuthenticationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdNfcDataController.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "dg1Uri", "dg2Uri", "sodUri", "Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;", "chipAuthenticationStatus", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getDg1Uri", "()Landroid/net/Uri;", "getDg2Uri", "getSodUri", "Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;", "getChipAuthenticationStatus", "()Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class GovernmentIdNfcData implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdNfcData> CREATOR = new Creator();
    private final ChipAuthenticationStatus chipAuthenticationStatus;
    private final Uri dg1Uri;
    private final Uri dg2Uri;
    private final Uri sodUri;

    /* compiled from: GovernmentIdNfcDataController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GovernmentIdNfcData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdNfcData((Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), ChipAuthenticationStatus.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcData[] newArray(int i) {
            return new GovernmentIdNfcData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcData)) {
            return false;
        }
        GovernmentIdNfcData governmentIdNfcData = (GovernmentIdNfcData) other;
        return Intrinsics.areEqual(this.dg1Uri, governmentIdNfcData.dg1Uri) && Intrinsics.areEqual(this.dg2Uri, governmentIdNfcData.dg2Uri) && Intrinsics.areEqual(this.sodUri, governmentIdNfcData.sodUri) && this.chipAuthenticationStatus == governmentIdNfcData.chipAuthenticationStatus;
    }

    public int hashCode() {
        return (((((this.dg1Uri.hashCode() * 31) + this.dg2Uri.hashCode()) * 31) + this.sodUri.hashCode()) * 31) + this.chipAuthenticationStatus.hashCode();
    }

    public String toString() {
        return "GovernmentIdNfcData(dg1Uri=" + this.dg1Uri + ", dg2Uri=" + this.dg2Uri + ", sodUri=" + this.sodUri + ", chipAuthenticationStatus=" + this.chipAuthenticationStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.dg1Uri, flags);
        dest.writeParcelable(this.dg2Uri, flags);
        dest.writeParcelable(this.sodUri, flags);
        dest.writeString(this.chipAuthenticationStatus.name());
    }

    public GovernmentIdNfcData(Uri dg1Uri, Uri dg2Uri, Uri sodUri, ChipAuthenticationStatus chipAuthenticationStatus) {
        Intrinsics.checkNotNullParameter(dg1Uri, "dg1Uri");
        Intrinsics.checkNotNullParameter(dg2Uri, "dg2Uri");
        Intrinsics.checkNotNullParameter(sodUri, "sodUri");
        Intrinsics.checkNotNullParameter(chipAuthenticationStatus, "chipAuthenticationStatus");
        this.dg1Uri = dg1Uri;
        this.dg2Uri = dg2Uri;
        this.sodUri = sodUri;
        this.chipAuthenticationStatus = chipAuthenticationStatus;
    }

    public final Uri getDg1Uri() {
        return this.dg1Uri;
    }

    public final Uri getDg2Uri() {
        return this.dg2Uri;
    }

    public final Uri getSodUri() {
        return this.sodUri;
    }

    public final ChipAuthenticationStatus getChipAuthenticationStatus() {
        return this.chipAuthenticationStatus;
    }
}
