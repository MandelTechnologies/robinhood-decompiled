package com.robinhood.staticcontent.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.RichNode;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FancyAgreement.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0013\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0006J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/FancyAgreement;", "Landroid/os/Parcelable;", "title", "", "agreementId", "version", "", "agreement", "Lcom/robinhood/contentful/model/RichNode;", "exportContent", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/contentful/model/RichNode;Lcom/robinhood/contentful/model/ResourceLink;)V", "getTitle", "()Ljava/lang/String;", "getAgreementId", "getVersion", "()I", "getAgreement", "()Lcom/robinhood/contentful/model/RichNode;", "getExportContent", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class FancyAgreement implements Parcelable {
    public static final Parcelable.Creator<FancyAgreement> CREATOR = new Creator();
    private final RichNode agreement;
    private final String agreementId;
    private final ResourceLink<AssetResource<?>> exportContent;
    private final String title;
    private final int version;

    /* compiled from: FancyAgreement.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<FancyAgreement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FancyAgreement createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FancyAgreement(parcel.readString(), parcel.readString(), parcel.readInt(), (RichNode) parcel.readParcelable(FancyAgreement.class.getClassLoader()), (ResourceLink) parcel.readParcelable(FancyAgreement.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FancyAgreement[] newArray(int i) {
            return new FancyAgreement[i];
        }
    }

    public static /* synthetic */ FancyAgreement copy$default(FancyAgreement fancyAgreement, String str, String str2, int i, RichNode richNode, ResourceLink resourceLink, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fancyAgreement.title;
        }
        if ((i2 & 2) != 0) {
            str2 = fancyAgreement.agreementId;
        }
        if ((i2 & 4) != 0) {
            i = fancyAgreement.version;
        }
        if ((i2 & 8) != 0) {
            richNode = fancyAgreement.agreement;
        }
        if ((i2 & 16) != 0) {
            resourceLink = fancyAgreement.exportContent;
        }
        ResourceLink resourceLink2 = resourceLink;
        int i3 = i;
        return fancyAgreement.copy(str, str2, i3, richNode, resourceLink2);
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

    /* renamed from: component4, reason: from getter */
    public final RichNode getAgreement() {
        return this.agreement;
    }

    public final ResourceLink<AssetResource<?>> component5() {
        return this.exportContent;
    }

    public final FancyAgreement copy(String title, String agreementId, int version, RichNode agreement, ResourceLink<AssetResource<?>> exportContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        Intrinsics.checkNotNullParameter(exportContent, "exportContent");
        return new FancyAgreement(title, agreementId, version, agreement, exportContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FancyAgreement)) {
            return false;
        }
        FancyAgreement fancyAgreement = (FancyAgreement) other;
        return Intrinsics.areEqual(this.title, fancyAgreement.title) && Intrinsics.areEqual(this.agreementId, fancyAgreement.agreementId) && this.version == fancyAgreement.version && Intrinsics.areEqual(this.agreement, fancyAgreement.agreement) && Intrinsics.areEqual(this.exportContent, fancyAgreement.exportContent);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.agreementId.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + this.agreement.hashCode()) * 31) + this.exportContent.hashCode();
    }

    public String toString() {
        return "FancyAgreement(title=" + this.title + ", agreementId=" + this.agreementId + ", version=" + this.version + ", agreement=" + this.agreement + ", exportContent=" + this.exportContent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.agreementId);
        dest.writeInt(this.version);
        dest.writeParcelable(this.agreement, flags);
        dest.writeParcelable(this.exportContent, flags);
    }

    public FancyAgreement(String title, String agreementId, int i, RichNode agreement, ResourceLink<AssetResource<?>> exportContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        Intrinsics.checkNotNullParameter(exportContent, "exportContent");
        this.title = title;
        this.agreementId = agreementId;
        this.version = i;
        this.agreement = agreement;
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

    public final RichNode getAgreement() {
        return this.agreement;
    }

    public final ResourceLink<AssetResource<?>> getExportContent() {
        return this.exportContent;
    }
}
