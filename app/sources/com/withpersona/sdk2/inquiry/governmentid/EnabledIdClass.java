package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdListAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "icon", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idConfig", "", "name", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "getIcon", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getIdConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Ljava/lang/String;", "getName", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class EnabledIdClass implements Parcelable {
    public static final Parcelable.Creator<EnabledIdClass> CREATOR = new Creator();
    private final IdIcon icon;
    private final IdConfig idConfig;
    private final String name;

    /* compiled from: GovernmentIdListAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EnabledIdClass> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnabledIdClass createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EnabledIdClass(IdIcon.valueOf(parcel.readString()), IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnabledIdClass[] newArray(int i) {
            return new EnabledIdClass[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnabledIdClass)) {
            return false;
        }
        EnabledIdClass enabledIdClass = (EnabledIdClass) other;
        return this.icon == enabledIdClass.icon && Intrinsics.areEqual(this.idConfig, enabledIdClass.idConfig) && Intrinsics.areEqual(this.name, enabledIdClass.name);
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.idConfig.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "EnabledIdClass(icon=" + this.icon + ", idConfig=" + this.idConfig + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.icon.name());
        this.idConfig.writeToParcel(dest, flags);
        dest.writeString(this.name);
    }

    public EnabledIdClass(IdIcon icon, IdConfig idConfig, String name) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(idConfig, "idConfig");
        Intrinsics.checkNotNullParameter(name, "name");
        this.icon = icon;
        this.idConfig = idConfig;
        this.name = name;
    }

    public final IdIcon getIcon() {
        return this.icon;
    }

    public final IdConfig getIdConfig() {
        return this.idConfig;
    }

    public final String getName() {
        return this.name;
    }
}
