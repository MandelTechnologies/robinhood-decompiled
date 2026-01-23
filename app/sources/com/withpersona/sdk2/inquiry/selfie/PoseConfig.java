package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PoseConfig.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Landroid/os/Parcelable;", "", "allowReview", "manualCaptureEnabled", "", "manualCaptureDelayMs", "autoCaptureEnabled", "<init>", "(ZZJZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAllowReview", "()Z", "getManualCaptureEnabled", "J", "getManualCaptureDelayMs", "()J", "getAutoCaptureEnabled", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PoseConfig implements Parcelable {
    private final boolean allowReview;
    private final boolean autoCaptureEnabled;
    private final long manualCaptureDelayMs;
    private final boolean manualCaptureEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PoseConfig> CREATOR = new Creator();
    private static final PoseConfig Default = new PoseConfig(false, false, 0, false, 15, null);

    /* compiled from: PoseConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PoseConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PoseConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            long j;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z3 = z2;
                j = j2;
            } else {
                j = j2;
                z3 = z;
            }
            return new PoseConfig(z4, z5, j, z3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PoseConfig[] newArray(int i) {
            return new PoseConfig[i];
        }
    }

    public PoseConfig() {
        this(false, false, 0L, false, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoseConfig)) {
            return false;
        }
        PoseConfig poseConfig = (PoseConfig) other;
        return this.allowReview == poseConfig.allowReview && this.manualCaptureEnabled == poseConfig.manualCaptureEnabled && this.manualCaptureDelayMs == poseConfig.manualCaptureDelayMs && this.autoCaptureEnabled == poseConfig.autoCaptureEnabled;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.allowReview) * 31) + Boolean.hashCode(this.manualCaptureEnabled)) * 31) + Long.hashCode(this.manualCaptureDelayMs)) * 31) + Boolean.hashCode(this.autoCaptureEnabled);
    }

    public String toString() {
        return "PoseConfig(allowReview=" + this.allowReview + ", manualCaptureEnabled=" + this.manualCaptureEnabled + ", manualCaptureDelayMs=" + this.manualCaptureDelayMs + ", autoCaptureEnabled=" + this.autoCaptureEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.allowReview ? 1 : 0);
        dest.writeInt(this.manualCaptureEnabled ? 1 : 0);
        dest.writeLong(this.manualCaptureDelayMs);
        dest.writeInt(this.autoCaptureEnabled ? 1 : 0);
    }

    public PoseConfig(boolean z, boolean z2, long j, boolean z3) {
        this.allowReview = z;
        this.manualCaptureEnabled = z2;
        this.manualCaptureDelayMs = j;
        this.autoCaptureEnabled = z3;
    }

    public /* synthetic */ PoseConfig(boolean z, boolean z2, long j, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? 8000L : j, (i & 8) != 0 ? true : z3);
    }

    public final boolean getAllowReview() {
        return this.allowReview;
    }

    public final boolean getManualCaptureEnabled() {
        return this.manualCaptureEnabled;
    }

    public final long getManualCaptureDelayMs() {
        return this.manualCaptureDelayMs;
    }

    public final boolean getAutoCaptureEnabled() {
        return this.autoCaptureEnabled;
    }

    /* compiled from: PoseConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig$Companion;", "", "<init>", "()V", "Default", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "getDefault", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PoseConfig getDefault() {
            return PoseConfig.Default;
        }
    }
}
