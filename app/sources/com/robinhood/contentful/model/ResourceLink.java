package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContentResource.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u0019*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00022\u00020\u0003:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/contentful/model/ResourceLink;", "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "sys", "Lcom/robinhood/contentful/model/LinkMetadata;", "<init>", "(Lcom/robinhood/contentful/model/LinkMetadata;)V", "getSys", "()Lcom/robinhood/contentful/model/LinkMetadata;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class ResourceLink<T extends ContentResource6> extends ContentResource6 implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.ClassLoaderCreator<ResourceLink<ContentResource6>> CREATOR;
    private final LinkMetadata<T> sys;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceLink copy$default(ResourceLink resourceLink, LinkMetadata resourceMetadata8, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceMetadata8 = resourceLink.sys;
        }
        return resourceLink.copy(resourceMetadata8);
    }

    public final LinkMetadata<T> component1() {
        return this.sys;
    }

    public final ResourceLink<T> copy(LinkMetadata<T> sys) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        return new ResourceLink<>(sys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResourceLink) && Intrinsics.areEqual(this.sys, ((ResourceLink) other).sys);
    }

    public int hashCode() {
        return this.sys.hashCode();
    }

    public String toString() {
        return "ResourceLink(sys=" + this.sys + ")";
    }

    @Override // com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.contentful.model.ContentResource
    public LinkMetadata<T> getSys() {
        return this.sys;
    }

    public ResourceLink(LinkMetadata<T> sys) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        this.sys = sys;
    }

    @Override // com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(getSys(), flags);
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.ClassLoaderCreator<ResourceLink<ContentResource6>>() { // from class: com.robinhood.contentful.model.ResourceLink$special$$inlined$classLoaderCreator$1
            @Override // android.os.Parcelable.Creator
            public ResourceLink<ContentResource6> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public ResourceLink<ContentResource6>[] newArray(int size) {
                return new ResourceLink[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public ResourceLink<ContentResource6> createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Parcelable parcelable = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable);
                return new ResourceLink<>((LinkMetadata) parcelable);
            }
        };
    }
}
