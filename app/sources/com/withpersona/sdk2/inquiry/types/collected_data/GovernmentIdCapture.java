package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StepData.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0003)*+B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "Landroid/os/Parcelable;", "", "idClass", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Side;", "side", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$CaptureMethod;", "captureMethod", "", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Frame;", "frames", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Side;Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$CaptureMethod;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdClass", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Side;", "getSide", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Side;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$CaptureMethod;", "Ljava/util/List;", "getFrames", "()Ljava/util/List;", "CaptureMethod", "Side", "Frame", "inquiry-types_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class GovernmentIdCapture implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdCapture> CREATOR = new Creator();
    private final CaptureMethod captureMethod;
    private final List<Frame> frames;
    private final String idClass;
    private final Side side;

    /* compiled from: StepData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GovernmentIdCapture> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdCapture createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Side sideValueOf = Side.valueOf(parcel.readString());
            CaptureMethod captureMethodValueOf = CaptureMethod.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Frame.CREATOR.createFromParcel(parcel));
            }
            return new GovernmentIdCapture(string2, sideValueOf, captureMethodValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdCapture[] newArray(int i) {
            return new GovernmentIdCapture[i];
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
        if (!(other instanceof GovernmentIdCapture)) {
            return false;
        }
        GovernmentIdCapture governmentIdCapture = (GovernmentIdCapture) other;
        return Intrinsics.areEqual(this.idClass, governmentIdCapture.idClass) && this.side == governmentIdCapture.side && this.captureMethod == governmentIdCapture.captureMethod && Intrinsics.areEqual(this.frames, governmentIdCapture.frames);
    }

    public int hashCode() {
        return (((((this.idClass.hashCode() * 31) + this.side.hashCode()) * 31) + this.captureMethod.hashCode()) * 31) + this.frames.hashCode();
    }

    public String toString() {
        return "GovernmentIdCapture(idClass=" + this.idClass + ", side=" + this.side + ", captureMethod=" + this.captureMethod + ", frames=" + this.frames + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.idClass);
        dest.writeString(this.side.name());
        dest.writeString(this.captureMethod.name());
        List<Frame> list = this.frames;
        dest.writeInt(list.size());
        Iterator<Frame> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public GovernmentIdCapture(String idClass, Side side, CaptureMethod captureMethod, List<Frame> frames) {
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.idClass = idClass;
        this.side = side;
        this.captureMethod = captureMethod;
        this.frames = frames;
    }

    public final List<Frame> getFrames() {
        return this.frames;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StepData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$CaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Manual", "Auto", "Upload", "inquiry-types_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class CaptureMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final CaptureMethod Manual = new CaptureMethod("Manual", 0);
        public static final CaptureMethod Auto = new CaptureMethod("Auto", 1);
        public static final CaptureMethod Upload = new CaptureMethod("Upload", 2);

        private static final /* synthetic */ CaptureMethod[] $values() {
            return new CaptureMethod[]{Manual, Auto, Upload};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StepData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Side;", "", "<init>", "(Ljava/lang/String;I)V", "Front", "Back", "FrontAndBack", "inquiry-types_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Side {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side Front = new Side("Front", 0);
        public static final Side Back = new Side("Back", 1);
        public static final Side FrontAndBack = new Side("FrontAndBack", 2);

        private static final /* synthetic */ Side[] $values() {
            return new Side[]{Front, Back, FrontAndBack};
        }

        public static EnumEntries<Side> getEntries() {
            return $ENTRIES;
        }

        private Side(String str, int i) {
        }

        static {
            Side[] sideArr$values = $values();
            $VALUES = sideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sideArr$values);
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    /* compiled from: StepData.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Frame;", "Landroid/os/Parcelable;", "Ljava/io/File;", WebsocketGatewayConstants.DATA_KEY, "", "mimeType", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "getData", "()Ljava/io/File;", "Ljava/lang/String;", "getMimeType", "inquiry-types_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Frame implements Parcelable {
        public static final Parcelable.Creator<Frame> CREATOR = new Creator();
        private final File data;
        private final String mimeType;

        /* compiled from: StepData.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Frame> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Frame createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Frame((File) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Frame[] newArray(int i) {
                return new Frame[i];
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
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return Intrinsics.areEqual(this.data, frame.data) && Intrinsics.areEqual(this.mimeType, frame.mimeType);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.mimeType.hashCode();
        }

        public String toString() {
            return "Frame(data=" + this.data + ", mimeType=" + this.mimeType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.data);
            dest.writeString(this.mimeType);
        }

        public Frame(File data, String mimeType) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.data = data;
            this.mimeType = mimeType;
        }

        public final File getData() {
            return this.data;
        }
    }
}
