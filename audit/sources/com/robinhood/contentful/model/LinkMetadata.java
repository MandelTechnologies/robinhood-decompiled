package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00032\u00020\u0005:\u0001#B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0003J)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0019HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/contentful/model/LinkMetadata;", "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lcom/robinhood/contentful/model/IdentifiableResourceMetadata;", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "id", "", "referentType", "Lcom/robinhood/contentful/model/ContentResource$Type;", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/model/ContentResource$Type;)V", "getId", "()Ljava/lang/String;", "getReferentType", "()Lcom/robinhood/contentful/model/ContentResource$Type;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type$Link;", "getType", "()Lcom/robinhood/contentful/model/ContentResource$Type$Link;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class LinkMetadata<T extends ContentResource6> extends ResourceMetadata7<ResourceLink<T>> implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.ClassLoaderCreator<LinkMetadata<ContentResource6>> CREATOR;
    private final String id;
    private final ContentResource.Type<T> referentType;
    private final ContentResource.Type.Link<T> type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkMetadata copy$default(LinkMetadata linkMetadata, String str, ContentResource.Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkMetadata.id;
        }
        if ((i & 2) != 0) {
            type2 = linkMetadata.referentType;
        }
        return linkMetadata.copy(str, type2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final ContentResource.Type<T> component2() {
        return this.referentType;
    }

    public final LinkMetadata<T> copy(String id, ContentResource.Type<T> referentType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(referentType, "referentType");
        return new LinkMetadata<>(id, referentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkMetadata)) {
            return false;
        }
        LinkMetadata linkMetadata = (LinkMetadata) other;
        return Intrinsics.areEqual(this.id, linkMetadata.id) && Intrinsics.areEqual(this.referentType, linkMetadata.referentType);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.referentType.hashCode();
    }

    public String toString() {
        return "LinkMetadata(id=" + this.id + ", referentType=" + this.referentType + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata7
    public String getId() {
        return this.id;
    }

    public final ContentResource.Type<T> getReferentType() {
        return this.referentType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkMetadata(String id, ContentResource.Type<T> referentType) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(referentType, "referentType");
        this.id = id;
        this.referentType = referentType;
        this.type = new ContentResource.Type.Link<>(referentType);
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata
    public ContentResource.Type.Link<T> getType() {
        return this.type;
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(getId());
        dest.writeParcelable(this.referentType, flags);
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.ClassLoaderCreator<LinkMetadata<ContentResource6>>() { // from class: com.robinhood.contentful.model.LinkMetadata$special$$inlined$classLoaderCreator$1
            @Override // android.os.Parcelable.Creator
            public LinkMetadata<ContentResource6> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public LinkMetadata<ContentResource6>[] newArray(int size) {
                return new LinkMetadata[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public LinkMetadata<ContentResource6> createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                String string2 = source.readString();
                Intrinsics.checkNotNull(string2);
                Parcelable parcelable = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable);
                return new LinkMetadata<>(string2, (ContentResource.Type) parcelable);
            }
        };
    }
}
