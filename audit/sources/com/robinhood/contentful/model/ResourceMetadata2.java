package com.robinhood.contentful.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/model/ArrayMetadata;", "Lcom/robinhood/contentful/model/ResourceMetadata;", "Lcom/robinhood/contentful/model/ResourceArray;", "<init>", "()V", "type", "Lcom/robinhood/contentful/model/ContentResource$Type$Array;", "getType", "()Lcom/robinhood/contentful/model/ContentResource$Type$Array;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.contentful.model.ArrayMetadata, reason: use source file name */
/* loaded from: classes15.dex */
public final class ResourceMetadata2 extends ResourceMetadata<ResourceArray<?>> {
    public static final ResourceMetadata2 INSTANCE = new ResourceMetadata2();
    private static final ContentResource.Type.Array type = ContentResource.Type.Array.INSTANCE;
    public static final Parcelable.Creator<ResourceMetadata2> CREATOR = new Creator();

    /* compiled from: ResourceMetadata.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.contentful.model.ArrayMetadata$Creator */
    public static final class Creator implements Parcelable.Creator<ResourceMetadata2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResourceMetadata2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ResourceMetadata2.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResourceMetadata2[] newArray(int i) {
            return new ResourceMetadata2[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private ResourceMetadata2() {
        super(null);
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata
    public ContentResource.Type.Array getType() {
        return type;
    }
}
