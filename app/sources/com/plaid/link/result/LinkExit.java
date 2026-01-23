package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C5987V3;
import com.robinhood.models.api.ErrorResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/plaid/link/result/LinkExit;", "Lcom/plaid/link/result/LinkResult;", "error", "Lcom/plaid/link/result/LinkError;", "metadata", "Lcom/plaid/link/result/LinkExitMetadata;", "(Lcom/plaid/link/result/LinkError;Lcom/plaid/link/result/LinkExitMetadata;)V", "getError", "()Lcom/plaid/link/result/LinkError;", "getMetadata", "()Lcom/plaid/link/result/LinkExitMetadata;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class LinkExit implements LinkResult {
    private final LinkError error;
    private final LinkExitMetadata metadata;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkExit> CREATOR = new Creator();

    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/plaid/link/result/LinkExit$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/result/LinkExit;", "linkData", "", "", "fromMap$link_sdk_release", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkExit fromMap$link_sdk_release(Map<String, String> linkData) {
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            LinkInstitution linkInstitution = null;
            LinkError linkError = linkData.get(ErrorResponse.ERROR_CODE) != null ? new LinkError(LinkErrorCode.INSTANCE.convert(C5987V3.m1330a(linkData, ErrorResponse.ERROR_CODE, "")), C5987V3.m1330a(linkData, "error_message", ""), C5987V3.m1330a(linkData, "error_display_message", ""), C5987V3.m1330a(linkData, "error_json", "")) : null;
            LinkExitMetadataStatus linkExitMetadataStatusFromString = LinkExitMetadataStatus.INSTANCE.fromString(C5987V3.m1330a(linkData, "status", ""));
            String strM1330a = C5987V3.m1330a(linkData, "institution_id", "");
            String strM1330a2 = C5987V3.m1330a(linkData, "institution_name", "");
            if (strM1330a != null && strM1330a.length() != 0 && strM1330a2 != null && strM1330a2.length() != 0) {
                linkInstitution = new LinkInstitution(strM1330a, strM1330a2);
            }
            return new LinkExit(linkError, new LinkExitMetadata(linkExitMetadataStatusFromString, linkInstitution, C5987V3.m1330a(linkData, "link_session_id", ""), C5987V3.m1330a(linkData, "request_id", ""), C5987V3.m1330a(linkData, "metadata_json", "")));
        }

        private Companion() {
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkExit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkExit(parcel.readInt() == 0 ? null : LinkError.CREATOR.createFromParcel(parcel), LinkExitMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExit[] newArray(int i) {
            return new LinkExit[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkExit() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinkExit copy$default(LinkExit linkExit, LinkError linkError, LinkExitMetadata linkExitMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            linkError = linkExit.error;
        }
        if ((i & 2) != 0) {
            linkExitMetadata = linkExit.metadata;
        }
        return linkExit.copy(linkError, linkExitMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkError getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkExitMetadata getMetadata() {
        return this.metadata;
    }

    public final LinkExit copy(LinkError error, LinkExitMetadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkExit(error, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkExit)) {
            return false;
        }
        LinkExit linkExit = (LinkExit) other;
        return Intrinsics.areEqual(this.error, linkExit.error) && Intrinsics.areEqual(this.metadata, linkExit.metadata);
    }

    public final LinkError getError() {
        return this.error;
    }

    public final LinkExitMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        LinkError linkError = this.error;
        return this.metadata.hashCode() + ((linkError == null ? 0 : linkError.hashCode()) * 31);
    }

    public String toString() {
        return "LinkExit(error=" + this.error + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        LinkError linkError = this.error;
        if (linkError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkError.writeToParcel(parcel, flags);
        }
        this.metadata.writeToParcel(parcel, flags);
    }

    public LinkExit(LinkError linkError, LinkExitMetadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.error = linkError;
        this.metadata = metadata;
    }

    public /* synthetic */ LinkExit(LinkError linkError, LinkExitMetadata linkExitMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkError, (i & 2) != 0 ? new LinkExitMetadata(null, null, null, null, null, 15, null) : linkExitMetadata);
    }
}
