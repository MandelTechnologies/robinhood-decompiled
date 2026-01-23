package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Selfie.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "Landroid/os/Parcelable;", "<init>", "()V", "absoluteFilePath", "", "getAbsoluteFilePath", "()Ljava/lang/String;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "Pose", "CaptureMethod", "SelfieImage", "SelfieVideo", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class Selfie implements Parcelable {
    public /* synthetic */ Selfie(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getAbsoluteFilePath();

    public abstract CaptureMethod getCaptureMethod();

    private Selfie() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Selfie.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Pose {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Pose[] $VALUES;
        public static final Pose Center = new Pose("Center", 0);
        public static final Pose Left = new Pose("Left", 1);
        public static final Pose Right = new Pose("Right", 2);

        private static final /* synthetic */ Pose[] $values() {
            return new Pose[]{Center, Left, Right};
        }

        public static EnumEntries<Pose> getEntries() {
            return $ENTRIES;
        }

        private Pose(String str, int i) {
        }

        static {
            Pose[] poseArr$values = $values();
            $VALUES = poseArr$values;
            $ENTRIES = EnumEntries2.enumEntries(poseArr$values);
        }

        public static Pose valueOf(String str) {
            return (Pose) Enum.valueOf(Pose.class, str);
        }

        public static Pose[] values() {
            return (Pose[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Selfie.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "", "method", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "AUTO", "MANUAL", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class CaptureMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final CaptureMethod AUTO = new CaptureMethod("AUTO", 0, "auto");
        public static final CaptureMethod MANUAL = new CaptureMethod("MANUAL", 1, "manual");
        private final String method;

        private static final /* synthetic */ CaptureMethod[] $values() {
            return new CaptureMethod[]{AUTO, MANUAL};
        }

        public static EnumEntries<CaptureMethod> getEntries() {
            return $ENTRIES;
        }

        private CaptureMethod(String str, int i, String str2) {
            this.method = str2;
        }

        public final String getMethod() {
            return this.method;
        }

        static {
            CaptureMethod[] captureMethodArr$values = $values();
            $VALUES = captureMethodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(captureMethodArr$values);
        }

        public static CaptureMethod valueOf(String str) {
            return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
        }

        public static CaptureMethod[] values() {
            return (CaptureMethod[]) $VALUES.clone();
        }
    }

    /* compiled from: Selfie.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "pose", "", "capturedTimestamp", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAbsoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "getPose", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "J", "getCapturedTimestamp", "()J", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class SelfieImage extends Selfie {
        public static final Parcelable.Creator<SelfieImage> CREATOR = new Creator();
        private final String absoluteFilePath;
        private final CaptureMethod captureMethod;
        private final long capturedTimestamp;
        private final Pose pose;

        /* compiled from: Selfie.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieImage(parcel.readString(), CaptureMethod.valueOf(parcel.readString()), Pose.valueOf(parcel.readString()), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieImage[] newArray(int i) {
                return new SelfieImage[i];
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
            if (!(other instanceof SelfieImage)) {
                return false;
            }
            SelfieImage selfieImage = (SelfieImage) other;
            return Intrinsics.areEqual(this.absoluteFilePath, selfieImage.absoluteFilePath) && this.captureMethod == selfieImage.captureMethod && this.pose == selfieImage.pose && this.capturedTimestamp == selfieImage.capturedTimestamp;
        }

        public int hashCode() {
            return (((((this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode()) * 31) + this.pose.hashCode()) * 31) + Long.hashCode(this.capturedTimestamp);
        }

        public String toString() {
            return "SelfieImage(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", pose=" + this.pose + ", capturedTimestamp=" + this.capturedTimestamp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.captureMethod.name());
            dest.writeString(this.pose.name());
            dest.writeLong(this.capturedTimestamp);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        public final Pose getPose() {
            return this.pose;
        }

        public final long getCapturedTimestamp() {
            return this.capturedTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieImage(String absoluteFilePath, CaptureMethod captureMethod, Pose pose, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            Intrinsics.checkNotNullParameter(pose, "pose");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
            this.pose = pose;
            this.capturedTimestamp = j;
        }
    }

    /* compiled from: Selfie.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "captureMethod", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAbsoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$CaptureMethod;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class SelfieVideo extends Selfie {
        public static final Parcelable.Creator<SelfieVideo> CREATOR = new Creator();
        private final String absoluteFilePath;
        private final CaptureMethod captureMethod;

        /* compiled from: Selfie.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieVideo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieVideo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieVideo(parcel.readString(), CaptureMethod.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieVideo[] newArray(int i) {
                return new SelfieVideo[i];
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
            if (!(other instanceof SelfieVideo)) {
                return false;
            }
            SelfieVideo selfieVideo = (SelfieVideo) other;
            return Intrinsics.areEqual(this.absoluteFilePath, selfieVideo.absoluteFilePath) && this.captureMethod == selfieVideo.captureMethod;
        }

        public int hashCode() {
            return (this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode();
        }

        public String toString() {
            return "SelfieVideo(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.captureMethod.name());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieVideo(String absoluteFilePath, CaptureMethod captureMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
        }
    }
}
