package com.robinhood.android.transfers.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransfersDeepLinkMetadata.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "Landroid/os/Parcelable;", "startTime", "", "deepLinkUri", "Landroid/net/Uri;", "<init>", "(JLandroid/net/Uri;)V", "getStartTime", "()J", "getDeepLinkUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransfersDeepLinkMetadata implements Parcelable {
    public static final Parcelable.Creator<TransfersDeepLinkMetadata> CREATOR = new Creator();
    private final Uri deepLinkUri;
    private final long startTime;

    /* compiled from: TransfersDeepLinkMetadata.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<TransfersDeepLinkMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransfersDeepLinkMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransfersDeepLinkMetadata(parcel.readLong(), (Uri) parcel.readParcelable(TransfersDeepLinkMetadata.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransfersDeepLinkMetadata[] newArray(int i) {
            return new TransfersDeepLinkMetadata[i];
        }
    }

    public static /* synthetic */ TransfersDeepLinkMetadata copy$default(TransfersDeepLinkMetadata transfersDeepLinkMetadata, long j, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            j = transfersDeepLinkMetadata.startTime;
        }
        if ((i & 2) != 0) {
            uri = transfersDeepLinkMetadata.deepLinkUri;
        }
        return transfersDeepLinkMetadata.copy(j, uri);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getDeepLinkUri() {
        return this.deepLinkUri;
    }

    public final TransfersDeepLinkMetadata copy(long startTime, Uri deepLinkUri) {
        Intrinsics.checkNotNullParameter(deepLinkUri, "deepLinkUri");
        return new TransfersDeepLinkMetadata(startTime, deepLinkUri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersDeepLinkMetadata)) {
            return false;
        }
        TransfersDeepLinkMetadata transfersDeepLinkMetadata = (TransfersDeepLinkMetadata) other;
        return this.startTime == transfersDeepLinkMetadata.startTime && Intrinsics.areEqual(this.deepLinkUri, transfersDeepLinkMetadata.deepLinkUri);
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + this.deepLinkUri.hashCode();
    }

    public String toString() {
        return "TransfersDeepLinkMetadata(startTime=" + this.startTime + ", deepLinkUri=" + this.deepLinkUri + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.startTime);
        dest.writeParcelable(this.deepLinkUri, flags);
    }

    public TransfersDeepLinkMetadata(long j, Uri deepLinkUri) {
        Intrinsics.checkNotNullParameter(deepLinkUri, "deepLinkUri");
        this.startTime = j;
        this.deepLinkUri = deepLinkUri;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final Uri getDeepLinkUri() {
        return this.deepLinkUri;
    }
}
