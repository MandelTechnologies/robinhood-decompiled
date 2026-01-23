package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/plaid/link/result/LinkExitMetadata;", "Landroid/os/Parcelable;", "status", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "institution", "Lcom/plaid/link/result/LinkInstitution;", "linkSessionId", "", "requestId", "metadataJson", "(Lcom/plaid/link/result/LinkExitMetadataStatus;Lcom/plaid/link/result/LinkInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInstitution", "()Lcom/plaid/link/result/LinkInstitution;", "getLinkSessionId", "()Ljava/lang/String;", "getMetadataJson", "getRequestId", "getStatus", "()Lcom/plaid/link/result/LinkExitMetadataStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class LinkExitMetadata implements Parcelable {
    public static final Parcelable.Creator<LinkExitMetadata> CREATOR = new Creator();
    private final LinkInstitution institution;
    private final String linkSessionId;
    private final String metadataJson;
    private final String requestId;
    private final LinkExitMetadataStatus status;

    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkExitMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExitMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkExitMetadata((LinkExitMetadataStatus) parcel.readParcelable(LinkExitMetadata.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkInstitution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExitMetadata[] newArray(int i) {
            return new LinkExitMetadata[i];
        }
    }

    public LinkExitMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ LinkExitMetadata copy$default(LinkExitMetadata linkExitMetadata, LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            linkExitMetadataStatus = linkExitMetadata.status;
        }
        if ((i & 2) != 0) {
            linkInstitution = linkExitMetadata.institution;
        }
        if ((i & 4) != 0) {
            str = linkExitMetadata.linkSessionId;
        }
        if ((i & 8) != 0) {
            str2 = linkExitMetadata.requestId;
        }
        if ((i & 16) != 0) {
            str3 = linkExitMetadata.metadataJson;
        }
        String str4 = str3;
        String str5 = str;
        return linkExitMetadata.copy(linkExitMetadataStatus, linkInstitution, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkExitMetadataStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final LinkExitMetadata copy(LinkExitMetadataStatus status, LinkInstitution institution, String linkSessionId, String requestId, String metadataJson) {
        return new LinkExitMetadata(status, institution, linkSessionId, requestId, metadataJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkExitMetadata)) {
            return false;
        }
        LinkExitMetadata linkExitMetadata = (LinkExitMetadata) other;
        return Intrinsics.areEqual(this.status, linkExitMetadata.status) && Intrinsics.areEqual(this.institution, linkExitMetadata.institution) && Intrinsics.areEqual(this.linkSessionId, linkExitMetadata.linkSessionId) && Intrinsics.areEqual(this.requestId, linkExitMetadata.requestId) && Intrinsics.areEqual(this.metadataJson, linkExitMetadata.metadataJson);
    }

    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final LinkExitMetadataStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        LinkExitMetadataStatus linkExitMetadataStatus = this.status;
        int iHashCode = (linkExitMetadataStatus == null ? 0 : linkExitMetadataStatus.hashCode()) * 31;
        LinkInstitution linkInstitution = this.institution;
        int iHashCode2 = (iHashCode + (linkInstitution == null ? 0 : linkInstitution.hashCode())) * 31;
        String str = this.linkSessionId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metadataJson;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LinkExitMetadata(status=" + this.status + ", institution=" + this.institution + ", linkSessionId=" + this.linkSessionId + ", requestId=" + this.requestId + ", metadataJson=" + this.metadataJson + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.status, flags);
        LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInstitution.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.requestId);
        parcel.writeString(this.metadataJson);
    }

    public LinkExitMetadata(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3) {
        this.status = linkExitMetadataStatus;
        this.institution = linkInstitution;
        this.linkSessionId = str;
        this.requestId = str2;
        this.metadataJson = str3;
    }

    public /* synthetic */ LinkExitMetadata(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkExitMetadataStatus, (i & 2) != 0 ? null : linkInstitution, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
