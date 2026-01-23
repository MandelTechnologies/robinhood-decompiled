package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentId.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Landroid/os/Parcelable;", "frames", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "getFrames", "()Ljava/util/List;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "getSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "idClassKey", "", "getIdClassKey", "()Ljava/lang/String;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "GovernmentIdImage", "GovernmentIdVideo", "Side", "CaptureMethod", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface GovernmentId extends Parcelable {
    CaptureMethod getCaptureMethod();

    List<Frame> getFrames();

    String getIdClassKey();

    Side getSide();

    /* compiled from: GovernmentId.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104¨\u00065"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "rawExtraction", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "idDetails", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFrames", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "getSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "Ljava/lang/String;", "getIdClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "getRawExtraction", "()Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "getIdDetails", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class GovernmentIdImage implements GovernmentId {
        public static final Parcelable.Creator<GovernmentIdImage> CREATOR = new Creator();
        private final CaptureMethod captureMethod;
        private final List<Frame> frames;
        private final String idClassKey;
        private final GovernmentIdDetails idDetails;
        private final RawExtraction rawExtraction;
        private final Side side;

        /* compiled from: GovernmentId.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdImage(arrayList, Side.valueOf(parcel.readString()), parcel.readString(), CaptureMethod.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdDetails.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdImage[] newArray(int i) {
                return new GovernmentIdImage[i];
            }
        }

        public static /* synthetic */ GovernmentIdImage copy$default(GovernmentIdImage governmentIdImage, List list, Side side, String str, CaptureMethod captureMethod, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                list = governmentIdImage.frames;
            }
            if ((i & 2) != 0) {
                side = governmentIdImage.side;
            }
            if ((i & 4) != 0) {
                str = governmentIdImage.idClassKey;
            }
            if ((i & 8) != 0) {
                captureMethod = governmentIdImage.captureMethod;
            }
            if ((i & 16) != 0) {
                rawExtraction = governmentIdImage.rawExtraction;
            }
            if ((i & 32) != 0) {
                governmentIdDetails = governmentIdImage.idDetails;
            }
            RawExtraction rawExtraction2 = rawExtraction;
            GovernmentIdDetails governmentIdDetails2 = governmentIdDetails;
            return governmentIdImage.copy(list, side, str, captureMethod, rawExtraction2, governmentIdDetails2);
        }

        public final GovernmentIdImage copy(List<Frame> frames, Side side, String idClassKey, CaptureMethod captureMethod, RawExtraction rawExtraction, GovernmentIdDetails idDetails) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            return new GovernmentIdImage(frames, side, idClassKey, captureMethod, rawExtraction, idDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdImage)) {
                return false;
            }
            GovernmentIdImage governmentIdImage = (GovernmentIdImage) other;
            return Intrinsics.areEqual(this.frames, governmentIdImage.frames) && this.side == governmentIdImage.side && Intrinsics.areEqual(this.idClassKey, governmentIdImage.idClassKey) && this.captureMethod == governmentIdImage.captureMethod && Intrinsics.areEqual(this.rawExtraction, governmentIdImage.rawExtraction) && Intrinsics.areEqual(this.idDetails, governmentIdImage.idDetails);
        }

        public int hashCode() {
            int iHashCode = ((((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode()) * 31;
            RawExtraction rawExtraction = this.rawExtraction;
            int iHashCode2 = (iHashCode + (rawExtraction == null ? 0 : rawExtraction.hashCode())) * 31;
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            return iHashCode2 + (governmentIdDetails != null ? governmentIdDetails.hashCode() : 0);
        }

        public String toString() {
            return "GovernmentIdImage(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ", rawExtraction=" + this.rawExtraction + ", idDetails=" + this.idDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Frame> list = this.frames;
            dest.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.side.name());
            dest.writeString(this.idClassKey);
            dest.writeString(this.captureMethod.name());
            RawExtraction rawExtraction = this.rawExtraction;
            if (rawExtraction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rawExtraction.writeToParcel(dest, flags);
            }
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            if (governmentIdDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdDetails.writeToParcel(dest, flags);
            }
        }

        public GovernmentIdImage(List<Frame> frames, Side side, String idClassKey, CaptureMethod captureMethod, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.frames = frames;
            this.side = side;
            this.idClassKey = idClassKey;
            this.captureMethod = captureMethod;
            this.rawExtraction = rawExtraction;
            this.idDetails = governmentIdDetails;
        }

        public /* synthetic */ GovernmentIdImage(List list, Side side, String str, CaptureMethod captureMethod, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, side, str, captureMethod, (i & 16) != 0 ? null : rawExtraction, (i & 32) != 0 ? null : governmentIdDetails);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public List<Frame> getFrames() {
            return this.frames;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public Side getSide() {
            return this.side;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public String getIdClassKey() {
            return this.idClassKey;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        public final RawExtraction getRawExtraction() {
            return this.rawExtraction;
        }

        public final GovernmentIdDetails getIdDetails() {
            return this.idDetails;
        }
    }

    /* compiled from: GovernmentId.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "frames", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "captureMethod", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFrames", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "getSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "Ljava/lang/String;", "getIdClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class GovernmentIdVideo implements GovernmentId {
        public static final Parcelable.Creator<GovernmentIdVideo> CREATOR = new Creator();
        private final CaptureMethod captureMethod;
        private final List<Frame> frames;
        private final String idClassKey;
        private final Side side;

        /* compiled from: GovernmentId.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdVideo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdVideo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdVideo(arrayList, Side.valueOf(parcel.readString()), parcel.readString(), CaptureMethod.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdVideo[] newArray(int i) {
                return new GovernmentIdVideo[i];
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
            if (!(other instanceof GovernmentIdVideo)) {
                return false;
            }
            GovernmentIdVideo governmentIdVideo = (GovernmentIdVideo) other;
            return Intrinsics.areEqual(this.frames, governmentIdVideo.frames) && this.side == governmentIdVideo.side && Intrinsics.areEqual(this.idClassKey, governmentIdVideo.idClassKey) && this.captureMethod == governmentIdVideo.captureMethod;
        }

        public int hashCode() {
            return (((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode();
        }

        public String toString() {
            return "GovernmentIdVideo(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Frame> list = this.frames;
            dest.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.side.name());
            dest.writeString(this.idClassKey);
            dest.writeString(this.captureMethod.name());
        }

        public GovernmentIdVideo(List<Frame> frames, Side side, String idClassKey, CaptureMethod captureMethod) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.frames = frames;
            this.side = side;
            this.idClassKey = idClassKey;
            this.captureMethod = captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public List<Frame> getFrames() {
            return this.frames;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public Side getSide() {
            return this.side;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public String getIdClassKey() {
            return this.idClassKey;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GovernmentId.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "FRONT_AND_BACK", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Side {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side FRONT = new Side("FRONT", 0);
        public static final Side BACK = new Side("BACK", 1);
        public static final Side FRONT_AND_BACK = new Side("FRONT_AND_BACK", 2);

        private static final /* synthetic */ Side[] $values() {
            return new Side[]{FRONT, BACK, FRONT_AND_BACK};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GovernmentId.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "MANUAL", "UPLOAD", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class CaptureMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final CaptureMethod AUTO = new AUTO("AUTO", 0);
        public static final CaptureMethod MANUAL = new MANUAL("MANUAL", 1);
        public static final CaptureMethod UPLOAD = new UPLOAD("UPLOAD", 2);

        private static final /* synthetic */ CaptureMethod[] $values() {
            return new CaptureMethod[]{AUTO, MANUAL, UPLOAD};
        }

        public /* synthetic */ CaptureMethod(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CaptureMethod> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: GovernmentId.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.AUTO", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "toString", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        static final class AUTO extends CaptureMethod {
            AUTO(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "auto";
            }
        }

        private CaptureMethod(String str, int i) {
        }

        static {
            CaptureMethod[] captureMethodArr$values = $values();
            $VALUES = captureMethodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(captureMethodArr$values);
        }

        /* compiled from: GovernmentId.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.MANUAL", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "toString", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        static final class MANUAL extends CaptureMethod {
            MANUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "manual";
            }
        }

        /* compiled from: GovernmentId.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.UPLOAD", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$CaptureMethod;", "toString", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        static final class UPLOAD extends CaptureMethod {
            UPLOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "upload";
            }
        }

        public static CaptureMethod valueOf(String str) {
            return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
        }

        public static CaptureMethod[] values() {
            return (CaptureMethod[]) $VALUES.clone();
        }
    }
}
