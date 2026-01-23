package microgram.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.extension.ServiceExtension;

/* compiled from: MicrogramLaunchId.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R4\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, m3636d2 = {"Lmicrogram/android/MicrogramLaunchId;", "Landroid/os/Parcelable;", "Lmicrogram/android/MicrogramSource;", "source", "", "discriminator", "<init>", "(Lmicrogram/android/MicrogramSource;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/android/MicrogramSource;", "getSource", "()Lmicrogram/android/MicrogramSource;", "Ljava/lang/String;", "getDiscriminator", "", "Lmicrogram/android/extension/ServiceExtension$Factory;", "extensions", "Ljava/util/Map;", "getExtensions", "()Ljava/util/Map;", "setExtensions", "(Ljava/util/Map;)V", "getExtensions$annotations", "()V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MicrogramLaunchId implements Parcelable {
    public static final Parcelable.Creator<MicrogramLaunchId> CREATOR = new Creator();
    private final String discriminator;
    private Map<String, ? extends ServiceExtension.Factory> extensions;
    private final MicrogramSource source;

    /* compiled from: MicrogramLaunchId.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MicrogramLaunchId> {
        @Override // android.os.Parcelable.Creator
        public final MicrogramLaunchId createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MicrogramLaunchId((MicrogramSource) parcel.readParcelable(MicrogramLaunchId.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MicrogramLaunchId[] newArray(int i) {
            return new MicrogramLaunchId[i];
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
        if (!(other instanceof MicrogramLaunchId)) {
            return false;
        }
        MicrogramLaunchId microgramLaunchId = (MicrogramLaunchId) other;
        return Intrinsics.areEqual(this.source, microgramLaunchId.source) && Intrinsics.areEqual(this.discriminator, microgramLaunchId.discriminator);
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.discriminator;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MicrogramLaunchId(source=" + this.source + ", discriminator=" + this.discriminator + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.source, flags);
        dest.writeString(this.discriminator);
    }

    public MicrogramLaunchId(MicrogramSource source, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.discriminator = str;
        this.extensions = MapsKt.emptyMap();
    }

    public /* synthetic */ MicrogramLaunchId(MicrogramSource microgramSource, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(microgramSource, (i & 2) != 0 ? null : str);
    }

    public final MicrogramSource getSource() {
        return this.source;
    }

    public final Map<String, ServiceExtension.Factory> getExtensions() {
        return this.extensions;
    }

    public final void setExtensions(Map<String, ? extends ServiceExtension.Factory> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extensions = map;
    }
}
