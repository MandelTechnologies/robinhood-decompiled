package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.FancyAgreement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiFancyAgreementBrief.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;", "Landroid/os/Parcelable;", "id", "", "title", "version", "", "resourceLink", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/FancyAgreement;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/contentful/model/ResourceLink;)V", "getId", "()Ljava/lang/String;", "getTitle", "getVersion", "()I", "getResourceLink", "()Lcom/robinhood/contentful/model/ResourceLink;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class UiFancyAgreementBrief implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiFancyAgreementBrief> CREATOR = new Creator();
    private final String id;
    private final ResourceLink<EntryResource<FancyAgreement>> resourceLink;
    private final String title;
    private final int version;

    /* compiled from: UiFancyAgreementBrief.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiFancyAgreementBrief> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiFancyAgreementBrief createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiFancyAgreementBrief(parcel.readString(), parcel.readString(), parcel.readInt(), (ResourceLink) parcel.readParcelable(UiFancyAgreementBrief.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiFancyAgreementBrief[] newArray(int i) {
            return new UiFancyAgreementBrief[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeInt(this.version);
        dest.writeParcelable(this.resourceLink, flags);
    }

    public UiFancyAgreementBrief(String id, String title, int i, ResourceLink<EntryResource<FancyAgreement>> resourceLink) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(resourceLink, "resourceLink");
        this.id = id;
        this.title = title;
        this.version = i;
        this.resourceLink = resourceLink;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getVersion() {
        return this.version;
    }

    public final ResourceLink<EntryResource<FancyAgreement>> getResourceLink() {
        return this.resourceLink;
    }
}
