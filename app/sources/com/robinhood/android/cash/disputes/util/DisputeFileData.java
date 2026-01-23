package com.robinhood.android.cash.disputes.util;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeFileData.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileData;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "uri", "Landroid/net/Uri;", "type", "Lcom/robinhood/android/cash/disputes/util/DisputeFileData$Type;", "extension", "", "<init>", "(Ljava/util/UUID;Landroid/net/Uri;Lcom/robinhood/android/cash/disputes/util/DisputeFileData$Type;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getUri", "()Landroid/net/Uri;", "getType", "()Lcom/robinhood/android/cash/disputes/util/DisputeFileData$Type;", "getExtension", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Type", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DisputeFileData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DisputeFileData> CREATOR = new Creator();
    private final String extension;
    private final UUID id;
    private final Type type;
    private final Uri uri;

    /* compiled from: DisputeFileData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DisputeFileData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisputeFileData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisputeFileData((UUID) parcel.readSerializable(), (Uri) parcel.readParcelable(DisputeFileData.class.getClassLoader()), Type.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisputeFileData[] newArray(int i) {
            return new DisputeFileData[i];
        }
    }

    public static /* synthetic */ DisputeFileData copy$default(DisputeFileData disputeFileData, UUID uuid, Uri uri, Type type2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = disputeFileData.id;
        }
        if ((i & 2) != 0) {
            uri = disputeFileData.uri;
        }
        if ((i & 4) != 0) {
            type2 = disputeFileData.type;
        }
        if ((i & 8) != 0) {
            str = disputeFileData.extension;
        }
        return disputeFileData.copy(uuid, uri, type2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    public final DisputeFileData copy(UUID id, Uri uri, Type type2, String extension) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(extension, "extension");
        return new DisputeFileData(id, uri, type2, extension);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisputeFileData)) {
            return false;
        }
        DisputeFileData disputeFileData = (DisputeFileData) other;
        return Intrinsics.areEqual(this.id, disputeFileData.id) && Intrinsics.areEqual(this.uri, disputeFileData.uri) && this.type == disputeFileData.type && Intrinsics.areEqual(this.extension, disputeFileData.extension);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.uri.hashCode()) * 31) + this.type.hashCode()) * 31) + this.extension.hashCode();
    }

    public String toString() {
        return "DisputeFileData(id=" + this.id + ", uri=" + this.uri + ", type=" + this.type + ", extension=" + this.extension + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeParcelable(this.uri, flags);
        dest.writeString(this.type.name());
        dest.writeString(this.extension);
    }

    public DisputeFileData(UUID id, Uri uri, Type type2, String extension) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.id = id;
        this.uri = uri;
        this.type = type2;
        this.extension = extension;
    }

    public final UUID getId() {
        return this.id;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getExtension() {
        return this.extension;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DisputeFileData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileData$Type;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "PDF", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type IMAGE = new Type("IMAGE", 0);
        public static final Type PDF = new Type("PDF", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{IMAGE, PDF};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
