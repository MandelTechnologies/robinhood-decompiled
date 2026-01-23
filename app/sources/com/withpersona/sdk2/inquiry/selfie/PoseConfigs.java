package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PoseConfig.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "poseConfigs", "<init>", "(Ljava/util/Map;)V", "pose", "getPoseConfig", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PoseConfigs implements Parcelable {
    public static final Parcelable.Creator<PoseConfigs> CREATOR = new Creator();
    private final Map<Selfie.Pose, PoseConfig> poseConfigs;

    /* compiled from: PoseConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PoseConfigs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PoseConfigs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(Selfie.Pose.valueOf(parcel.readString()), PoseConfig.CREATOR.createFromParcel(parcel));
            }
            return new PoseConfigs(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PoseConfigs[] newArray(int i) {
            return new PoseConfigs[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoseConfigs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PoseConfigs) && Intrinsics.areEqual(this.poseConfigs, ((PoseConfigs) other).poseConfigs);
    }

    public int hashCode() {
        return this.poseConfigs.hashCode();
    }

    public String toString() {
        return "PoseConfigs(poseConfigs=" + this.poseConfigs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<Selfie.Pose, PoseConfig> map = this.poseConfigs;
        dest.writeInt(map.size());
        for (Map.Entry<Selfie.Pose, PoseConfig> entry : map.entrySet()) {
            dest.writeString(entry.getKey().name());
            entry.getValue().writeToParcel(dest, flags);
        }
    }

    public PoseConfigs(Map<Selfie.Pose, PoseConfig> poseConfigs) {
        Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
        this.poseConfigs = poseConfigs;
    }

    public /* synthetic */ PoseConfigs(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    public final PoseConfig getPoseConfig(Selfie.Pose pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        PoseConfig poseConfig = this.poseConfigs.get(pose);
        return poseConfig == null ? PoseConfig.INSTANCE.getDefault() : poseConfig;
    }
}
