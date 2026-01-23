package com.robinhood.staticcontent.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Agreement.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0012\b\u0002\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u0006J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/Agreement;", "Landroid/os/Parcelable;", "title", "", "agreementId", "version", "", "markdownContent", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "exportContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;)V", "getTitle", "()Ljava/lang/String;", "getAgreementId", "getVersion", "()I", "getMarkdownContent", "()Lcom/robinhood/contentful/model/ResourceLink;", "getExportContent", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class Agreement implements Parcelable {
    public static final Parcelable.Creator<Agreement> CREATOR = new Creator();
    private final String agreementId;
    private final ResourceLink<AssetResource<?>> exportContent;
    private final ResourceLink<AssetResource<?>> markdownContent;
    private final String title;
    private final int version;

    /* compiled from: Agreement.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<Agreement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Agreement createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Agreement(parcel.readString(), parcel.readString(), parcel.readInt(), (ResourceLink) parcel.readParcelable(Agreement.class.getClassLoader()), (ResourceLink) parcel.readParcelable(Agreement.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Agreement[] newArray(int i) {
            return new Agreement[i];
        }
    }

    public static /* synthetic */ Agreement copy$default(Agreement agreement, String str, String str2, int i, ResourceLink resourceLink, ResourceLink resourceLink2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = agreement.title;
        }
        if ((i2 & 2) != 0) {
            str2 = agreement.agreementId;
        }
        if ((i2 & 4) != 0) {
            i = agreement.version;
        }
        if ((i2 & 8) != 0) {
            resourceLink = agreement.markdownContent;
        }
        if ((i2 & 16) != 0) {
            resourceLink2 = agreement.exportContent;
        }
        ResourceLink resourceLink3 = resourceLink2;
        int i3 = i;
        return agreement.copy(str, str2, i3, resourceLink, resourceLink3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final ResourceLink<AssetResource<?>> component4() {
        return this.markdownContent;
    }

    public final ResourceLink<AssetResource<?>> component5() {
        return this.exportContent;
    }

    public final Agreement copy(String title, String agreementId, int version, ResourceLink<AssetResource<?>> markdownContent, ResourceLink<AssetResource<?>> exportContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(markdownContent, "markdownContent");
        Intrinsics.checkNotNullParameter(exportContent, "exportContent");
        return new Agreement(title, agreementId, version, markdownContent, exportContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Agreement)) {
            return false;
        }
        Agreement agreement = (Agreement) other;
        return Intrinsics.areEqual(this.title, agreement.title) && Intrinsics.areEqual(this.agreementId, agreement.agreementId) && this.version == agreement.version && Intrinsics.areEqual(this.markdownContent, agreement.markdownContent) && Intrinsics.areEqual(this.exportContent, agreement.exportContent);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.agreementId.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + this.markdownContent.hashCode()) * 31) + this.exportContent.hashCode();
    }

    public String toString() {
        return "Agreement(title=" + this.title + ", agreementId=" + this.agreementId + ", version=" + this.version + ", markdownContent=" + this.markdownContent + ", exportContent=" + this.exportContent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.agreementId);
        dest.writeInt(this.version);
        dest.writeParcelable(this.markdownContent, flags);
        dest.writeParcelable(this.exportContent, flags);
    }

    public Agreement(String title, String agreementId, int i, ResourceLink<AssetResource<?>> markdownContent, ResourceLink<AssetResource<?>> exportContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(markdownContent, "markdownContent");
        Intrinsics.checkNotNullParameter(exportContent, "exportContent");
        this.title = title;
        this.agreementId = agreementId;
        this.version = i;
        this.markdownContent = markdownContent;
        this.exportContent = exportContent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final ResourceLink<AssetResource<?>> getMarkdownContent() {
        return this.markdownContent;
    }

    public final ResourceLink<AssetResource<?>> getExportContent() {
        return this.exportContent;
    }
}
