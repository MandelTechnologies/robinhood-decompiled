package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C5987V3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m3636d2 = {"Lcom/plaid/link/result/LinkSuccess;", "Lcom/plaid/link/result/LinkResult;", "publicToken", "", "metadata", "Lcom/plaid/link/result/LinkSuccessMetadata;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkSuccessMetadata;)V", "getMetadata", "()Lcom/plaid/link/result/LinkSuccessMetadata;", "getPublicToken", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class LinkSuccess implements LinkResult {
    private final LinkSuccessMetadata metadata;
    private final String publicToken;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkSuccess> CREATOR = new Creator();

    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/plaid/link/result/LinkSuccess$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/result/LinkSuccess;", "linkData", "", "", "accounts", "", "Lcom/plaid/link/result/LinkAccount;", "fromMap$link_sdk_release", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkSuccess fromMap$link_sdk_release(Map<String, String> linkData, List<LinkAccount> accounts2) {
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            String strM1330a = C5987V3.m1330a(linkData, "public_token", "");
            String strM1330a2 = C5987V3.m1330a(linkData, "institution_id", "");
            String strM1330a3 = C5987V3.m1330a(linkData, "institution_name", "");
            String linkSessionId = C5987V3.m1330a(linkData, "link_session_id", "");
            String metadataJson = C5987V3.m1330a(linkData, "metadata_json", "");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
            Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
            return new LinkSuccess(strM1330a, new LinkSuccessMetadata((strM1330a2 == null || strM1330a2.length() == 0 || strM1330a3 == null || strM1330a3.length() == 0) ? null : new LinkInstitution(strM1330a2, strM1330a3), accounts2, linkSessionId, metadataJson));
        }

        private Companion() {
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkSuccess> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccess createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkSuccess(parcel.readString(), LinkSuccessMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccess[] newArray(int i) {
            return new LinkSuccess[i];
        }
    }

    public LinkSuccess(String publicToken, LinkSuccessMetadata metadata) {
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.publicToken = publicToken;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkSuccess copy$default(LinkSuccess linkSuccess, String str, LinkSuccessMetadata linkSuccessMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkSuccess.publicToken;
        }
        if ((i & 2) != 0) {
            linkSuccessMetadata = linkSuccess.metadata;
        }
        return linkSuccess.copy(str, linkSuccessMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPublicToken() {
        return this.publicToken;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    public final LinkSuccess copy(String publicToken, LinkSuccessMetadata metadata) {
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkSuccess)) {
            return false;
        }
        LinkSuccess linkSuccess = (LinkSuccess) other;
        return Intrinsics.areEqual(this.publicToken, linkSuccess.publicToken) && Intrinsics.areEqual(this.metadata, linkSuccess.metadata);
    }

    public final LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPublicToken() {
        return this.publicToken;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.publicToken.hashCode() * 31);
    }

    public String toString() {
        return "LinkSuccess(publicToken=" + this.publicToken + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.publicToken);
        this.metadata.writeToParcel(parcel, flags);
    }
}
