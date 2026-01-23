package com.robinhood.android.odyssey.lib.template;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdBackendMetadata.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Landroid/os/Parcelable;", "entityField", "", "entityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEntityField", "()Ljava/lang/String;", "getEntityName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SdBackendMetadata implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SdBackendMetadata> CREATOR = new Creator();
    private final String entityField;
    private final String entityName;

    /* compiled from: SdBackendMetadata.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SdBackendMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdBackendMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SdBackendMetadata(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdBackendMetadata[] newArray(int i) {
            return new SdBackendMetadata[i];
        }
    }

    public static /* synthetic */ SdBackendMetadata copy$default(SdBackendMetadata sdBackendMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdBackendMetadata.entityField;
        }
        if ((i & 2) != 0) {
            str2 = sdBackendMetadata.entityName;
        }
        return sdBackendMetadata.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntityField() {
        return this.entityField;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntityName() {
        return this.entityName;
    }

    public final SdBackendMetadata copy(String entityField, String entityName) {
        Intrinsics.checkNotNullParameter(entityField, "entityField");
        Intrinsics.checkNotNullParameter(entityName, "entityName");
        return new SdBackendMetadata(entityField, entityName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdBackendMetadata)) {
            return false;
        }
        SdBackendMetadata sdBackendMetadata = (SdBackendMetadata) other;
        return Intrinsics.areEqual(this.entityField, sdBackendMetadata.entityField) && Intrinsics.areEqual(this.entityName, sdBackendMetadata.entityName);
    }

    public int hashCode() {
        return (this.entityField.hashCode() * 31) + this.entityName.hashCode();
    }

    public String toString() {
        return "SdBackendMetadata(entityField=" + this.entityField + ", entityName=" + this.entityName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entityField);
        dest.writeString(this.entityName);
    }

    public SdBackendMetadata(String entityField, String entityName) {
        Intrinsics.checkNotNullParameter(entityField, "entityField");
        Intrinsics.checkNotNullParameter(entityName, "entityName");
        this.entityField = entityField;
        this.entityName = entityName;
    }

    public final String getEntityField() {
        return this.entityField;
    }

    public final String getEntityName() {
        return this.entityName;
    }
}
