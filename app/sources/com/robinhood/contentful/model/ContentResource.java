package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentTypeResource;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContentResource.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource;", "", "<init>", "()V", "sys", "Lcom/robinhood/contentful/model/ResourceMetadata;", "getSys", "()Lcom/robinhood/contentful/model/ResourceMetadata;", "Type", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lcom/robinhood/contentful/model/ResourceArray;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class ContentResource {
    public /* synthetic */ ContentResource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ResourceMetadata<?> getSys();

    private ContentResource() {
    }

    /* compiled from: ContentResource.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u001f\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type;", "T", "Lcom/robinhood/contentful/model/ContentResource;", "Landroid/os/Parcelable;", "valueType", "Ljava/lang/Class;", "identifier", "", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "getValueType", "()Ljava/lang/Class;", "getIdentifier", "()Ljava/lang/String;", "toString", ContentTypeResource.Field.Type.Array.identifier, "Asset", "ContentType", "Entry", "Environment", "Space", "Link", "Lcom/robinhood/contentful/model/ContentResource$Type$Array;", "Lcom/robinhood/contentful/model/ContentResource$Type$Asset;", "Lcom/robinhood/contentful/model/ContentResource$Type$ContentType;", "Lcom/robinhood/contentful/model/ContentResource$Type$Entry;", "Lcom/robinhood/contentful/model/ContentResource$Type$Environment;", "Lcom/robinhood/contentful/model/ContentResource$Type$Link;", "Lcom/robinhood/contentful/model/ContentResource$Type$Space;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static abstract class Type<T extends ContentResource> implements Parcelable {
        private final String identifier;
        private final Class<T> valueType;

        public /* synthetic */ Type(Class cls, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(cls, str);
        }

        private Type(Class<T> cls, String str) {
            this.valueType = cls;
            this.identifier = str;
        }

        public final Class<T> getValueType() {
            return this.valueType;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public String toString() {
            return this.identifier;
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type$Array;", "Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/ResourceArray;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Array extends Type<ContentResource7<?>> {
            public static final Array INSTANCE = new Array();
            public static final Parcelable.Creator<Array> CREATOR = new Creator();

            /* compiled from: ContentResource.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Array> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Array createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Array.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Array[] newArray(int i) {
                    return new Array[i];
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

            private Array() {
                super(ContentResource7.class, ContentTypeResource.Field.Type.Array.identifier, null);
            }
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type$Asset;", "Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/AssetResource;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Asset extends Type<AssetResource<?>> {
            public static final Asset INSTANCE = new Asset();
            public static final Parcelable.Creator<Asset> CREATOR = new Creator();

            /* compiled from: ContentResource.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Asset> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Asset createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Asset.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Asset[] newArray(int i) {
                    return new Asset[i];
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

            private Asset() {
                super(AssetResource.class, "Asset", null);
            }
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type$ContentType;", "Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/ContentTypeResource;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ContentType extends Type<ContentTypeResource> {
            public static final ContentType INSTANCE = new ContentType();
            public static final Parcelable.Creator<ContentType> CREATOR = new Creator();

            /* compiled from: ContentResource.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ContentType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ContentType.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentType[] newArray(int i) {
                    return new ContentType[i];
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

            private ContentType() {
                super(ContentTypeResource.class, "ContentType", null);
            }
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type$Entry;", "Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/EntryResource;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Entry extends Type<EntryResource<?>> {
            public static final Entry INSTANCE = new Entry();
            public static final Parcelable.Creator<Entry> CREATOR = new Creator();

            /* compiled from: ContentResource.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Entry> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Entry createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Entry.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Entry[] newArray(int i) {
                    return new Entry[i];
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

            private Entry() {
                super(EntryResource.class, "Entry", null);
            }
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type$Environment;", "Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/ResourceLink;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Environment extends Type<ResourceLink<?>> {
            public static final Environment INSTANCE = new Environment();
            public static final Parcelable.Creator<Environment> CREATOR = new Creator();

            /* compiled from: ContentResource.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Environment> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Environment createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Environment.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Environment[] newArray(int i) {
                    return new Environment[i];
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

            private Environment() {
                super(ResourceLink.class, "Environment", null);
            }
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type$Space;", "Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/SpaceResource;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Space extends Type<SpaceResource> {
            public static final Space INSTANCE = new Space();
            public static final Parcelable.Creator<Space> CREATOR = new Creator();

            /* compiled from: ContentResource.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Space> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Space createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Space.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Space[] newArray(int i) {
                    return new Space[i];
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

            private Space() {
                super(SpaceResource.class, "Space", null);
            }
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a*\b\b\u0001\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00032\u00020\u0005:\u0001\u001aB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0003J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentResource$Type$Link;", "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lcom/robinhood/contentful/model/ContentResource$Type;", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "referentType", "<init>", "(Lcom/robinhood/contentful/model/ContentResource$Type;)V", "getReferentType", "()Lcom/robinhood/contentful/model/ContentResource$Type;", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "component1", "copy", "equals", "", "other", "", "hashCode", "Companion", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SuppressLint({"MissingMoshiCodegenAnnotation"})
        @SourceDebugExtension
        public static final /* data */ class Link<T extends ContentResource6> extends Type<ResourceLink<T>> implements ParcelableAdapter {

            @JvmField
            public static final Parcelable.ClassLoaderCreator<Link<ContentResource6>> CREATOR;
            public static final String identifier = "Link";
            private final Type<T> referentType;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Link copy$default(Link link, Type type2, int i, Object obj) {
                if ((i & 1) != 0) {
                    type2 = link.referentType;
                }
                return link.copy(type2);
            }

            public final Type<T> component1() {
                return this.referentType;
            }

            public final Link<T> copy(Type<T> referentType) {
                Intrinsics.checkNotNullParameter(referentType, "referentType");
                return new Link<>(referentType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Link) && Intrinsics.areEqual(this.referentType, ((Link) other).referentType);
            }

            public int hashCode() {
                return this.referentType.hashCode();
            }

            @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
            public int describeContents() {
                return ParcelableAdapter.DefaultImpls.describeContents(this);
            }

            public final Type<T> getReferentType() {
                return this.referentType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Link(Type<T> referentType) {
                super(ResourceLink.class, "Link", null);
                Intrinsics.checkNotNullParameter(referentType, "referentType");
                this.referentType = referentType;
            }

            @Override // com.robinhood.contentful.model.ContentResource.Type
            public String toString() {
                return getIdentifier() + "<" + this.referentType + ">";
            }

            @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.referentType, flags);
            }

            static {
                Parcelables parcelables = Parcelables.INSTANCE;
                CREATOR = new Parcelable.ClassLoaderCreator<Link<ContentResource6>>() { // from class: com.robinhood.contentful.model.ContentResource$Type$Link$special$$inlined$classLoaderCreator$1
                    @Override // android.os.Parcelable.Creator
                    public ContentResource.Type.Link<ContentResource6> createFromParcel(Parcel source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return createFromParcel(source, (ClassLoader) null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public ContentResource.Type.Link<ContentResource6>[] newArray(int size) {
                        return new ContentResource.Type.Link[size];
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.ClassLoaderCreator
                    public ContentResource.Type.Link<ContentResource6> createFromParcel(Parcel source, ClassLoader loader) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        Parcelable parcelable = source.readParcelable(loader);
                        Intrinsics.checkNotNull(parcelable);
                        return new ContentResource.Type.Link<>((ContentResource.Type) parcelable);
                    }
                };
            }
        }
    }
}
