package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdConfig.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "Landroid/os/Parcelable;", "<init>", "()V", "SideIdPart", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.IdPart, reason: use source file name */
/* loaded from: classes18.dex */
public abstract class IdConfig2 implements Parcelable {
    public /* synthetic */ IdConfig2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IdConfig2() {
    }

    /* compiled from: IdConfig.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "getSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart, reason: from toString */
    public static final /* data */ class SideIdPart extends IdConfig2 {
        public static final Parcelable.Creator<SideIdPart> CREATOR = new Creator();
        private final IdConfig.Side side;

        /* compiled from: IdConfig.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart$Creator */
        public static final class Creator implements Parcelable.Creator<SideIdPart> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SideIdPart createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SideIdPart(IdConfig.Side.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SideIdPart[] newArray(int i) {
                return new SideIdPart[i];
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
            return (other instanceof SideIdPart) && this.side == ((SideIdPart) other).side;
        }

        public int hashCode() {
            return this.side.hashCode();
        }

        public String toString() {
            return "SideIdPart(side=" + this.side + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.side.name());
        }

        public final IdConfig.Side getSide() {
            return this.side;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SideIdPart(IdConfig.Side side) {
            super(null);
            Intrinsics.checkNotNullParameter(side, "side");
            this.side = side;
        }
    }
}
