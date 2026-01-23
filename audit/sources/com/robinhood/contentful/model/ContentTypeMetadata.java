package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: ResourceMetadata.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$Jb\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\b\u0002\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001dR\u001e\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010!R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b7\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010$R\u001a\u0010;\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeMetadata;", "Lcom/robinhood/contentful/model/EntityResourceMetadata;", "Lcom/robinhood/contentful/model/ContentTypeResource;", "", "id", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/SpaceResource;", "space", "environment", "", "revision", "j$/time/Instant", "createdAt", "updatedAt", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;ILj$/time/Instant;Lj$/time/Instant;Ljava/util/Locale;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/contentful/model/ResourceLink;", "component3", "component4", "component5", "()Lj$/time/Instant;", "component6", "component7", "()Ljava/util/Locale;", "copy", "(Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;ILj$/time/Instant;Lj$/time/Instant;Ljava/util/Locale;)Lcom/robinhood/contentful/model/ContentTypeMetadata;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/robinhood/contentful/model/ResourceLink;", "getSpace", "getEnvironment", "I", "getRevision", "Lj$/time/Instant;", "getCreatedAt", "getUpdatedAt", "Ljava/util/Locale;", "getLocale", "Lcom/robinhood/contentful/model/ContentResource$Type$ContentType;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type$ContentType;", "getType", "()Lcom/robinhood/contentful/model/ContentResource$Type$ContentType;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
/* loaded from: classes15.dex */
public final /* data */ class ContentTypeMetadata extends ResourceMetadata5<ContentTypeResource> {
    public static final Parcelable.Creator<ContentTypeMetadata> CREATOR = new Creator();
    private final Instant createdAt;
    private final ResourceLink<?> environment;
    private final String id;
    private final Locale locale;
    private final int revision;
    private final ResourceLink<SpaceResource> space;
    private final ContentResource.Type.ContentType type;
    private final Instant updatedAt;

    /* compiled from: ResourceMetadata.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ContentTypeMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentTypeMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Parcelable.ClassLoaderCreator<ResourceLink<ContentResource6>> classLoaderCreator = ResourceLink.CREATOR;
            return new ContentTypeMetadata(string2, classLoaderCreator.createFromParcel(parcel), classLoaderCreator.createFromParcel(parcel), parcel.readInt(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Locale) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentTypeMetadata[] newArray(int i) {
            return new ContentTypeMetadata[i];
        }
    }

    public static /* synthetic */ ContentTypeMetadata copy$default(ContentTypeMetadata contentTypeMetadata, String str, ResourceLink resourceLink, ResourceLink resourceLink2, int i, Instant instant, Instant instant2, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contentTypeMetadata.id;
        }
        if ((i2 & 2) != 0) {
            resourceLink = contentTypeMetadata.space;
        }
        if ((i2 & 4) != 0) {
            resourceLink2 = contentTypeMetadata.environment;
        }
        if ((i2 & 8) != 0) {
            i = contentTypeMetadata.revision;
        }
        if ((i2 & 16) != 0) {
            instant = contentTypeMetadata.createdAt;
        }
        if ((i2 & 32) != 0) {
            instant2 = contentTypeMetadata.updatedAt;
        }
        if ((i2 & 64) != 0) {
            locale = contentTypeMetadata.locale;
        }
        Instant instant3 = instant2;
        Locale locale2 = locale;
        Instant instant4 = instant;
        ResourceLink resourceLink3 = resourceLink2;
        return contentTypeMetadata.copy(str, resourceLink, resourceLink3, i, instant4, instant3, locale2);
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

    public final ContentTypeMetadata copy(String id, ResourceLink<SpaceResource> space, ResourceLink<?> environment, int revision, Instant createdAt, Instant updatedAt, Locale locale) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(space, "space");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new ContentTypeMetadata(id, space, environment, revision, createdAt, updatedAt, locale);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentTypeMetadata)) {
            return false;
        }
        ContentTypeMetadata contentTypeMetadata = (ContentTypeMetadata) other;
        return Intrinsics.areEqual(this.id, contentTypeMetadata.id) && Intrinsics.areEqual(this.space, contentTypeMetadata.space) && Intrinsics.areEqual(this.environment, contentTypeMetadata.environment) && this.revision == contentTypeMetadata.revision && Intrinsics.areEqual(this.createdAt, contentTypeMetadata.createdAt) && Intrinsics.areEqual(this.updatedAt, contentTypeMetadata.updatedAt) && Intrinsics.areEqual(this.locale, contentTypeMetadata.locale);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.space.hashCode()) * 31) + this.environment.hashCode()) * 31) + Integer.hashCode(this.revision)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        Locale locale = this.locale;
        return iHashCode + (locale == null ? 0 : locale.hashCode());
    }

    public String toString() {
        return "ContentTypeMetadata(id=" + this.id + ", space=" + this.space + ", environment=" + this.environment + ", revision=" + this.revision + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", locale=" + this.locale + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        this.space.writeToParcel(dest, flags);
        this.environment.writeToParcel(dest, flags);
        dest.writeInt(this.revision);
        dest.writeSerializable(this.createdAt);
        dest.writeSerializable(this.updatedAt);
        dest.writeSerializable(this.locale);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentTypeMetadata(String id, ResourceLink<SpaceResource> space, ResourceLink<?> environment, int i, Instant createdAt, Instant updatedAt, Locale locale) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(space, "space");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.id = id;
        this.space = space;
        this.environment = environment;
        this.revision = i;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.locale = locale;
        this.type = ContentResource.Type.ContentType.INSTANCE;
    }

    @Override // com.robinhood.contentful.model.ResourceMetadata
    public ContentResource.Type.ContentType getType() {
        return this.type;
    }
}
