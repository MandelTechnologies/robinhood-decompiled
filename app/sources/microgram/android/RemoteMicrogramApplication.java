package microgram.android;

import android.os.Parcel;
import android.os.Parcelable;
import io.github.z4kn4fein.semver.Version;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramSource.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lmicrogram/android/RemoteMicrogramApplication;", "Lmicrogram/android/MicrogramApplication;", "", "appId", "Lio/github/z4kn4fein/semver/Version;", "minMicrogramVersion", "<init>", "(Ljava/lang/String;Lio/github/z4kn4fein/semver/Version;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppId", "Lio/github/z4kn4fein/semver/Version;", "getMinMicrogramVersion", "()Lio/github/z4kn4fein/semver/Version;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RemoteMicrogramApplication extends MicrogramSource3 {
    public static final Parcelable.Creator<RemoteMicrogramApplication> CREATOR = new Creator();
    private final String appId;
    private final Version minMicrogramVersion;

    /* compiled from: MicrogramSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RemoteMicrogramApplication> {
        @Override // android.os.Parcelable.Creator
        public final RemoteMicrogramApplication createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemoteMicrogramApplication(parcel.readString(), NullableVersionParceler.INSTANCE.create(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteMicrogramApplication[] newArray(int i) {
            return new RemoteMicrogramApplication[i];
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
        if (!(other instanceof RemoteMicrogramApplication)) {
            return false;
        }
        RemoteMicrogramApplication remoteMicrogramApplication = (RemoteMicrogramApplication) other;
        return Intrinsics.areEqual(this.appId, remoteMicrogramApplication.appId) && Intrinsics.areEqual(this.minMicrogramVersion, remoteMicrogramApplication.minMicrogramVersion);
    }

    public int hashCode() {
        int iHashCode = this.appId.hashCode() * 31;
        Version version = this.minMicrogramVersion;
        return iHashCode + (version == null ? 0 : version.hashCode());
    }

    public String toString() {
        return "RemoteMicrogramApplication(appId=" + this.appId + ", minMicrogramVersion=" + this.minMicrogramVersion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.appId);
        NullableVersionParceler.INSTANCE.write(this.minMicrogramVersion, dest, flags);
    }

    public /* synthetic */ RemoteMicrogramApplication(String str, Version version, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : version);
    }

    @Override // microgram.android.MicrogramSource3
    public String getAppId() {
        return this.appId;
    }

    public final Version getMinMicrogramVersion() {
        return this.minMicrogramVersion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMicrogramApplication(String appId, Version version) {
        super(null);
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.appId = appId;
        this.minMicrogramVersion = version;
    }
}
