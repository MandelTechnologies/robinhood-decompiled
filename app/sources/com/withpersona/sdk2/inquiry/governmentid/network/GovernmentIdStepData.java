package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdStepData.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "stepName", "", "ids", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getStepName", "()Ljava/lang/String;", "getIds", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GovernmentIdStepData implements StepData {
    public static final Parcelable.Creator<GovernmentIdStepData> CREATOR = new Creator();
    private final List<GovernmentId> ids;
    private final String stepName;

    /* compiled from: GovernmentIdStepData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GovernmentIdStepData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdStepData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(GovernmentIdStepData.class.getClassLoader()));
            }
            return new GovernmentIdStepData(string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdStepData[] newArray(int i) {
            return new GovernmentIdStepData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.stepName);
        List<GovernmentId> list = this.ids;
        dest.writeInt(list.size());
        Iterator<GovernmentId> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GovernmentIdStepData(String stepName, List<? extends GovernmentId> ids) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.stepName = stepName;
        this.ids = ids;
    }

    public String getStepName() {
        return this.stepName;
    }

    public final List<GovernmentId> getIds() {
        return this.ids;
    }
}
