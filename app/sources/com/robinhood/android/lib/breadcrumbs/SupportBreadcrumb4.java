package com.robinhood.android.lib.breadcrumbs;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SupportBreadcrumb.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0011\u0012B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumbs;", "T", "Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumb;", "type", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", ErrorBundle.DETAIL_ENTRY, "source", "", "<init>", "(Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;Ljava/lang/Object;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", "getDetails", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSource", "()Ljava/lang/String;", "SerializableBreadcrumb", "Companion", "Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumbs$SerializableBreadcrumb;", "lib-breadcrumbs_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.breadcrumbs.ParcelableSupportBreadcrumbs, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class SupportBreadcrumb4<T> implements SupportBreadcrumb3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final T details;
    private final String source;
    private final SupportBreadcrumbType type;

    public /* synthetic */ SupportBreadcrumb4(SupportBreadcrumbType supportBreadcrumbType, Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(supportBreadcrumbType, obj, str);
    }

    private SupportBreadcrumb4(SupportBreadcrumbType supportBreadcrumbType, T t, String str) {
        this.type = supportBreadcrumbType;
        this.details = t;
        this.source = str;
    }

    public /* synthetic */ SupportBreadcrumb4(SupportBreadcrumbType supportBreadcrumbType, Object obj, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(supportBreadcrumbType, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : str, null);
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
    public SupportBreadcrumbType getType() {
        return this.type;
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
    public T getDetails() {
        return this.details;
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
    public String getSource() {
        return this.source;
    }

    /* compiled from: SupportBreadcrumb.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumbs$SerializableBreadcrumb;", "Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumbs;", "Ljava/io/Serializable;", "type", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", ErrorBundle.DETAIL_ENTRY, "source", "", "<init>", "(Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;Ljava/io/Serializable;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", "getDetails", "()Ljava/io/Serializable;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-breadcrumbs_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.breadcrumbs.ParcelableSupportBreadcrumbs$SerializableBreadcrumb, reason: from toString */
    private static final /* data */ class SerializableBreadcrumb extends SupportBreadcrumb4<Serializable> {
        public static final Parcelable.Creator<SerializableBreadcrumb> CREATOR = new Creator();
        private final Serializable details;
        private final String source;
        private final SupportBreadcrumbType type;

        /* compiled from: SupportBreadcrumb.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.breadcrumbs.ParcelableSupportBreadcrumbs$SerializableBreadcrumb$Creator */
        public static final class Creator implements Parcelable.Creator<SerializableBreadcrumb> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SerializableBreadcrumb createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SerializableBreadcrumb(SupportBreadcrumbType.valueOf(parcel.readString()), parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SerializableBreadcrumb[] newArray(int i) {
                return new SerializableBreadcrumb[i];
            }
        }

        public static /* synthetic */ SerializableBreadcrumb copy$default(SerializableBreadcrumb serializableBreadcrumb, SupportBreadcrumbType supportBreadcrumbType, Serializable serializable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                supportBreadcrumbType = serializableBreadcrumb.type;
            }
            if ((i & 2) != 0) {
                serializable = serializableBreadcrumb.details;
            }
            if ((i & 4) != 0) {
                str = serializableBreadcrumb.source;
            }
            return serializableBreadcrumb.copy(supportBreadcrumbType, serializable, str);
        }

        /* renamed from: component1, reason: from getter */
        public final SupportBreadcrumbType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Serializable getDetails() {
            return this.details;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final SerializableBreadcrumb copy(SupportBreadcrumbType type2, Serializable details, String source) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new SerializableBreadcrumb(type2, details, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SerializableBreadcrumb)) {
                return false;
            }
            SerializableBreadcrumb serializableBreadcrumb = (SerializableBreadcrumb) other;
            return this.type == serializableBreadcrumb.type && Intrinsics.areEqual(this.details, serializableBreadcrumb.details) && Intrinsics.areEqual(this.source, serializableBreadcrumb.source);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Serializable serializable = this.details;
            int iHashCode2 = (iHashCode + (serializable == null ? 0 : serializable.hashCode())) * 31;
            String str = this.source;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SerializableBreadcrumb(type=" + this.type + ", details=" + this.details + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeSerializable(this.details);
            dest.writeString(this.source);
        }

        public /* synthetic */ SerializableBreadcrumb(SupportBreadcrumbType supportBreadcrumbType, Serializable serializable, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(supportBreadcrumbType, (i & 2) != 0 ? null : serializable, (i & 4) != 0 ? null : str);
        }

        @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb4, com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
        public SupportBreadcrumbType getType() {
            return this.type;
        }

        @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb4, com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
        public Serializable getDetails() {
            return this.details;
        }

        @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb4, com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
        public String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableBreadcrumb(SupportBreadcrumbType type2, Serializable serializable, String str) {
            super(type2, serializable, str, null);
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
            this.details = serializable;
            this.source = str;
        }
    }

    /* compiled from: SupportBreadcrumb.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ&\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumbs$Companion;", "", "<init>", "()V", "ofSerializable", "Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumb;", "type", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", ErrorBundle.DETAIL_ENTRY, "Ljava/io/Serializable;", "source", "", "ofUUID", "Ljava/util/UUID;", "lib-breadcrumbs_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.breadcrumbs.ParcelableSupportBreadcrumbs$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SupportBreadcrumb3 ofSerializable$default(Companion companion, SupportBreadcrumbType supportBreadcrumbType, Serializable serializable, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                serializable = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return companion.ofSerializable(supportBreadcrumbType, serializable, str);
        }

        public final SupportBreadcrumb3 ofSerializable(SupportBreadcrumbType type2, Serializable details, String source) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new SerializableBreadcrumb(type2, details, source);
        }

        public static /* synthetic */ SupportBreadcrumb3 ofUUID$default(Companion companion, SupportBreadcrumbType supportBreadcrumbType, UUID uuid, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                uuid = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return companion.ofUUID(supportBreadcrumbType, uuid, str);
        }

        public final SupportBreadcrumb3 ofUUID(SupportBreadcrumbType type2, UUID details, String source) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return ofSerializable(type2, details, source);
        }
    }
}
