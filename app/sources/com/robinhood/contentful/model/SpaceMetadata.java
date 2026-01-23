package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/contentful/model/SpaceMetadata;", "Lcom/robinhood/contentful/model/IdentifiableResourceMetadata;", "Lcom/robinhood/contentful/model/SpaceResource;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type$Space;", "getType", "()Lcom/robinhood/contentful/model/ContentResource$Type$Space;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
/* loaded from: classes15.dex */
public final /* data */ class SpaceMetadata extends ResourceMetadata7<SpaceResource> {
    public static final Parcelable.Creator<SpaceMetadata> CREATOR = new Creator();
    private final String id;
    private final ContentResource.Type.Space type;

    /* compiled from: ResourceMetadata.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SpaceMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpaceMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpaceMetadata(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpaceMetadata[] newArray(int i) {
            return new SpaceMetadata[i];
        }
    }

    public static /* synthetic */ SpaceMetadata copy$default(SpaceMetadata spaceMetadata, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceMetadata.id;
        }
        return spaceMetadata.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final SpaceMetadata copy(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new SpaceMetadata(id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpaceMetadata) && Intrinsics.areEqual(this.id, ((SpaceMetadata) other).id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return "SpaceMetadata(id=" + this.id + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata7
    public String getId() {
        return this.id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMetadata(String id) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.type = ContentResource.Type.Space.INSTANCE;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata
    public ContentResource.Type.Space getType() {
        return this.type;
    }
}
