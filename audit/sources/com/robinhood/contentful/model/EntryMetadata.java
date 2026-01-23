package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import com.robinhood.utils.extensions.Parcels;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 J*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u00020\u0005:\u0001JBi\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0014\u0010#\u001a\u0006\u0012\u0002\b\u00030\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\bHÆ\u0003¢\u0006\u0004\b-\u0010\"J\u008a\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\b\u0002\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\bHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u0010 J\u0010\u00101\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b1\u0010%J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010 R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\"R\u001e\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b:\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010%R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010'R\u001a\u0010\u0010\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b?\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010*R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bC\u0010,R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\bD\u0010\"R\u001a\u0010F\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, m3636d2 = {"Lcom/robinhood/contentful/model/EntryMetadata;", "", "T", "Lcom/robinhood/contentful/model/EntityResourceMetadata;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "", "id", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/SpaceResource;", "space", "environment", "", "revision", "j$/time/Instant", "createdAt", "updatedAt", "Ljava/util/Locale;", "locale", "Ljava/lang/Class;", "valueType", "Lcom/robinhood/contentful/model/ContentTypeResource;", "contentType", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;ILj$/time/Instant;Lj$/time/Instant;Ljava/util/Locale;Ljava/lang/Class;Lcom/robinhood/contentful/model/ResourceLink;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/contentful/model/ResourceLink;", "component3", "component4", "()I", "component5", "()Lj$/time/Instant;", "component6", "component7", "()Ljava/util/Locale;", "component8", "()Ljava/lang/Class;", "component9", "copy", "(Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;ILj$/time/Instant;Lj$/time/Instant;Ljava/util/Locale;Ljava/lang/Class;Lcom/robinhood/contentful/model/ResourceLink;)Lcom/robinhood/contentful/model/EntryMetadata;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/robinhood/contentful/model/ResourceLink;", "getSpace", "getEnvironment", "I", "getRevision", "Lj$/time/Instant;", "getCreatedAt", "getUpdatedAt", "Ljava/util/Locale;", "getLocale", "Ljava/lang/Class;", "getValueType", "getContentType", "Lcom/robinhood/contentful/model/ContentResource$Type$Entry;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type$Entry;", "getType", "()Lcom/robinhood/contentful/model/ContentResource$Type$Entry;", "Companion", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class EntryMetadata<T> extends ResourceMetadata5<EntryResource<T>> implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.ClassLoaderCreator<EntryMetadata<Object>> CREATOR;
    private final ResourceLink<ContentTypeResource> contentType;
    private final Instant createdAt;
    private final ResourceLink<?> environment;
    private final String id;
    private final Locale locale;
    private final int revision;
    private final ResourceLink<SpaceResource> space;
    private final ContentResource.Type.Entry type;
    private final Instant updatedAt;
    private final Class<T> valueType;

    public static /* synthetic */ EntryMetadata copy$default(EntryMetadata entryMetadata, String str, ResourceLink resourceLink, ResourceLink resourceLink2, int i, Instant instant, Instant instant2, Locale locale, Class cls, ResourceLink resourceLink3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = entryMetadata.id;
        }
        if ((i2 & 2) != 0) {
            resourceLink = entryMetadata.space;
        }
        if ((i2 & 4) != 0) {
            resourceLink2 = entryMetadata.environment;
        }
        if ((i2 & 8) != 0) {
            i = entryMetadata.revision;
        }
        if ((i2 & 16) != 0) {
            instant = entryMetadata.createdAt;
        }
        if ((i2 & 32) != 0) {
            instant2 = entryMetadata.updatedAt;
        }
        if ((i2 & 64) != 0) {
            locale = entryMetadata.locale;
        }
        if ((i2 & 128) != 0) {
            cls = entryMetadata.valueType;
        }
        if ((i2 & 256) != 0) {
            resourceLink3 = entryMetadata.contentType;
        }
        Class cls2 = cls;
        ResourceLink resourceLink4 = resourceLink3;
        Instant instant3 = instant2;
        Locale locale2 = locale;
        Instant instant4 = instant;
        ResourceLink resourceLink5 = resourceLink2;
        return entryMetadata.copy(str, resourceLink, resourceLink5, i, instant4, instant3, locale2, cls2, resourceLink4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final ResourceLink<SpaceResource> component2() {
        return this.space;
    }

    public final ResourceLink<?> component3() {
        return this.environment;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    /* renamed from: component5, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component6, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component7, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    public final Class<T> component8() {
        return this.valueType;
    }

    public final ResourceLink<ContentTypeResource> component9() {
        return this.contentType;
    }

    public final EntryMetadata<T> copy(String id, ResourceLink<SpaceResource> space, ResourceLink<?> environment, int revision, Instant createdAt, Instant updatedAt, Locale locale, Class<T> valueType, ResourceLink<ContentTypeResource> contentType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(space, "space");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new EntryMetadata<>(id, space, environment, revision, createdAt, updatedAt, locale, valueType, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryMetadata)) {
            return false;
        }
        EntryMetadata entryMetadata = (EntryMetadata) other;
        return Intrinsics.areEqual(this.id, entryMetadata.id) && Intrinsics.areEqual(this.space, entryMetadata.space) && Intrinsics.areEqual(this.environment, entryMetadata.environment) && this.revision == entryMetadata.revision && Intrinsics.areEqual(this.createdAt, entryMetadata.createdAt) && Intrinsics.areEqual(this.updatedAt, entryMetadata.updatedAt) && Intrinsics.areEqual(this.locale, entryMetadata.locale) && Intrinsics.areEqual(this.valueType, entryMetadata.valueType) && Intrinsics.areEqual(this.contentType, entryMetadata.contentType);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.space.hashCode()) * 31) + this.environment.hashCode()) * 31) + Integer.hashCode(this.revision)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        Locale locale = this.locale;
        int iHashCode2 = (iHashCode + (locale == null ? 0 : locale.hashCode())) * 31;
        Class<T> cls = this.valueType;
        return ((iHashCode2 + (cls != null ? cls.hashCode() : 0)) * 31) + this.contentType.hashCode();
    }

    public String toString() {
        return "EntryMetadata(id=" + this.id + ", space=" + this.space + ", environment=" + this.environment + ", revision=" + this.revision + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", locale=" + this.locale + ", valueType=" + this.valueType + ", contentType=" + this.contentType + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata7
    public String getId() {
        return this.id;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata5
    public ResourceLink<SpaceResource> getSpace() {
        return this.space;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata5
    public ResourceLink<?> getEnvironment() {
        return this.environment;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata5
    public int getRevision() {
        return this.revision;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata5
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata5
    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata5
    public Locale getLocale() {
        return this.locale;
    }

    public final Class<T> getValueType() {
        return this.valueType;
    }

    public final ResourceLink<ContentTypeResource> getContentType() {
        return this.contentType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryMetadata(String id, ResourceLink<SpaceResource> space, ResourceLink<?> environment, int i, Instant createdAt, Instant updatedAt, Locale locale, Class<T> cls, ResourceLink<ContentTypeResource> contentType) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(space, "space");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.id = id;
        this.space = space;
        this.environment = environment;
        this.revision = i;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.locale = locale;
        this.valueType = cls;
        this.contentType = contentType;
        this.type = ContentResource.Type.Entry.INSTANCE;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata
    public ContentResource.Type.Entry getType() {
        return this.type;
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(getId());
        dest.writeParcelable(getSpace(), flags);
        dest.writeParcelable(getEnvironment(), flags);
        dest.writeInt(getRevision());
        dest.writeSerializable(getCreatedAt());
        dest.writeSerializable(getUpdatedAt());
        dest.writeSerializable(getLocale());
        dest.writeSerializable(this.valueType);
        dest.writeParcelable(this.contentType, flags);
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.ClassLoaderCreator<EntryMetadata<Object>>() { // from class: com.robinhood.contentful.model.EntryMetadata$special$$inlined$classLoaderCreator$1
            @Override // android.os.Parcelable.Creator
            public EntryMetadata<Object> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public EntryMetadata<Object>[] newArray(int size) {
                return new EntryMetadata[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public EntryMetadata<Object> createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                String string2 = source.readString();
                Intrinsics.checkNotNull(string2);
                Parcelable parcelable = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable);
                ResourceLink resourceLink = (ResourceLink) parcelable;
                Parcelable parcelable2 = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable2);
                ResourceLink resourceLink2 = (ResourceLink) parcelable2;
                int i = source.readInt();
                Instant instant = (Instant) Parcels.readTypedSerializable(source);
                Instant instant2 = (Instant) Parcels.readTypedSerializable(source);
                Locale locale = (Locale) Parcels.readTypedSerializable(source);
                Class cls = (Class) Parcels.readTypedSerializable(source);
                Parcelable parcelable3 = source.readParcelable(loader);
                Intrinsics.checkNotNull(parcelable3);
                return new EntryMetadata<>(string2, resourceLink, resourceLink2, i, instant, instant2, locale, cls, (ResourceLink) parcelable3);
            }
        };
    }
}
