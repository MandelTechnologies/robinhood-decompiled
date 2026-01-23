package com.robinhood.shared.transfers.contracts.context;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidIavMetadata.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "Landroid/os/Parcelable;", "linkSessionId", "", "institutionId", "institutionName", "sourceTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLinkSessionId", "()Ljava/lang/String;", "getInstitutionId", "getInstitutionName", "getSourceTag", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PlaidIavMetadata implements Parcelable {
    public static final Parcelable.Creator<PlaidIavMetadata> CREATOR = new Creator();
    private final String institutionId;
    private final String institutionName;
    private final String linkSessionId;
    private final String sourceTag;

    /* compiled from: PlaidIavMetadata.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PlaidIavMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidIavMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlaidIavMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidIavMetadata[] newArray(int i) {
            return new PlaidIavMetadata[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.linkSessionId);
        dest.writeString(this.institutionId);
        dest.writeString(this.institutionName);
        dest.writeString(this.sourceTag);
    }

    public PlaidIavMetadata(String str, String str2, String str3, String sourceTag) {
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        this.linkSessionId = str;
        this.institutionId = str2;
        this.institutionName = str3;
        this.sourceTag = sourceTag;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getSourceTag() {
        return this.sourceTag;
    }
}
