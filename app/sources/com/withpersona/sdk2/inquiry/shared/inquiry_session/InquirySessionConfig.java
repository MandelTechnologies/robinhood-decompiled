package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquirySessionConfig.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010#¨\u0006&"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "gpsCollectionRequirement", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "gpsPrecisionRequirement", "", "usePlayIntegrity", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "getGpsCollectionRequirement", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "getGpsPrecisionRequirement", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "Z", "getUsePlayIntegrity", "()Z", "isGpsRequired", "Companion", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InquirySessionConfig implements Parcelable {
    private final InquirySessionConfig2 gpsCollectionRequirement;
    private final InquirySessionConfig3 gpsPrecisionRequirement;
    private final boolean usePlayIntegrity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InquirySessionConfig> CREATOR = new Creator();
    private static final InquirySessionConfig Default = new InquirySessionConfig(InquirySessionConfig2.NONE, InquirySessionConfig3.PRECISE, false);

    /* compiled from: InquirySessionConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InquirySessionConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InquirySessionConfig(InquirySessionConfig2.CREATOR.createFromParcel(parcel), InquirySessionConfig3.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionConfig[] newArray(int i) {
            return new InquirySessionConfig[i];
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
        if (!(other instanceof InquirySessionConfig)) {
            return false;
        }
        InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) other;
        return this.gpsCollectionRequirement == inquirySessionConfig.gpsCollectionRequirement && this.gpsPrecisionRequirement == inquirySessionConfig.gpsPrecisionRequirement && this.usePlayIntegrity == inquirySessionConfig.usePlayIntegrity;
    }

    public int hashCode() {
        return (((this.gpsCollectionRequirement.hashCode() * 31) + this.gpsPrecisionRequirement.hashCode()) * 31) + Boolean.hashCode(this.usePlayIntegrity);
    }

    public String toString() {
        return "InquirySessionConfig(gpsCollectionRequirement=" + this.gpsCollectionRequirement + ", gpsPrecisionRequirement=" + this.gpsPrecisionRequirement + ", usePlayIntegrity=" + this.usePlayIntegrity + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.gpsCollectionRequirement.writeToParcel(dest, flags);
        this.gpsPrecisionRequirement.writeToParcel(dest, flags);
        dest.writeInt(this.usePlayIntegrity ? 1 : 0);
    }

    public InquirySessionConfig(InquirySessionConfig2 gpsCollectionRequirement, InquirySessionConfig3 gpsPrecisionRequirement, boolean z) {
        Intrinsics.checkNotNullParameter(gpsCollectionRequirement, "gpsCollectionRequirement");
        Intrinsics.checkNotNullParameter(gpsPrecisionRequirement, "gpsPrecisionRequirement");
        this.gpsCollectionRequirement = gpsCollectionRequirement;
        this.gpsPrecisionRequirement = gpsPrecisionRequirement;
        this.usePlayIntegrity = z;
    }

    public final InquirySessionConfig2 getGpsCollectionRequirement() {
        return this.gpsCollectionRequirement;
    }

    public final InquirySessionConfig3 getGpsPrecisionRequirement() {
        return this.gpsPrecisionRequirement;
    }

    public final boolean getUsePlayIntegrity() {
        return this.usePlayIntegrity;
    }

    /* compiled from: InquirySessionConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$Companion;", "", "<init>", "()V", "Default", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getDefault", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InquirySessionConfig getDefault() {
            return InquirySessionConfig.Default;
        }
    }

    public final boolean isGpsRequired() {
        return this.gpsCollectionRequirement == InquirySessionConfig2.REQUIRED;
    }
}
