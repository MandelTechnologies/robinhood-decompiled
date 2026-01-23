package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StepData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture$CaptureMethod;", "captureMethod", "Ljava/io/File;", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture$CaptureMethod;Ljava/io/File;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture$CaptureMethod;", "Ljava/io/File;", "getData", "()Ljava/io/File;", "CaptureMethod", "inquiry-types_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SelfieCapture implements Parcelable {
    public static final Parcelable.Creator<SelfieCapture> CREATOR = new Creator();
    private final CaptureMethod captureMethod;
    private final File data;

    /* compiled from: StepData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SelfieCapture> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieCapture createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelfieCapture(CaptureMethod.valueOf(parcel.readString()), (File) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieCapture[] newArray(int i) {
            return new SelfieCapture[i];
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
        if (!(other instanceof SelfieCapture)) {
            return false;
        }
        SelfieCapture selfieCapture = (SelfieCapture) other;
        return this.captureMethod == selfieCapture.captureMethod && Intrinsics.areEqual(this.data, selfieCapture.data);
    }

    public int hashCode() {
        return (this.captureMethod.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "SelfieCapture(captureMethod=" + this.captureMethod + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.captureMethod.name());
        dest.writeSerializable(this.data);
    }

    public SelfieCapture(CaptureMethod captureMethod, File data) {
        Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
        Intrinsics.checkNotNullParameter(data, "data");
        this.captureMethod = captureMethod;
        this.data = data;
    }

    public final File getData() {
        return this.data;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StepData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture$CaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Manual", "Auto", "inquiry-types_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class CaptureMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final CaptureMethod Manual = new CaptureMethod("Manual", 0);
        public static final CaptureMethod Auto = new CaptureMethod("Auto", 1);

        private static final /* synthetic */ CaptureMethod[] $values() {
            return new CaptureMethod[]{Manual, Auto};
        }

        public static EnumEntries<CaptureMethod> getEntries() {
            return $ENTRIES;
        }

        private CaptureMethod(String str, int i) {
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
}
