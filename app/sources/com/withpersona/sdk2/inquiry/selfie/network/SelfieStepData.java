package com.withpersona.sdk2.inquiry.selfie.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieStepData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "", "stepName", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "centerCapture", "leftCapture", "rightCapture", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepName", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "getCenterCapture", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "getLeftCapture", "getRightCapture", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SelfieStepData implements StepData {
    public static final Parcelable.Creator<SelfieStepData> CREATOR = new Creator();
    private final Selfie centerCapture;
    private final Selfie leftCapture;
    private final Selfie rightCapture;
    private final String stepName;

    /* compiled from: SelfieStepData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SelfieStepData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieStepData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelfieStepData(parcel.readString(), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieStepData[] newArray(int i) {
            return new SelfieStepData[i];
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
        if (!(other instanceof SelfieStepData)) {
            return false;
        }
        SelfieStepData selfieStepData = (SelfieStepData) other;
        return Intrinsics.areEqual(this.stepName, selfieStepData.stepName) && Intrinsics.areEqual(this.centerCapture, selfieStepData.centerCapture) && Intrinsics.areEqual(this.leftCapture, selfieStepData.leftCapture) && Intrinsics.areEqual(this.rightCapture, selfieStepData.rightCapture);
    }

    public int hashCode() {
        int iHashCode = this.stepName.hashCode() * 31;
        Selfie selfie = this.centerCapture;
        int iHashCode2 = (iHashCode + (selfie == null ? 0 : selfie.hashCode())) * 31;
        Selfie selfie2 = this.leftCapture;
        int iHashCode3 = (iHashCode2 + (selfie2 == null ? 0 : selfie2.hashCode())) * 31;
        Selfie selfie3 = this.rightCapture;
        return iHashCode3 + (selfie3 != null ? selfie3.hashCode() : 0);
    }

    public String toString() {
        return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.stepName);
        dest.writeParcelable(this.centerCapture, flags);
        dest.writeParcelable(this.leftCapture, flags);
        dest.writeParcelable(this.rightCapture, flags);
    }

    public SelfieStepData(String stepName, Selfie selfie, Selfie selfie2, Selfie selfie3) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.stepName = stepName;
        this.centerCapture = selfie;
        this.leftCapture = selfie2;
        this.rightCapture = selfie3;
    }

    public String getStepName() {
        return this.stepName;
    }

    public final Selfie getCenterCapture() {
        return this.centerCapture;
    }
}
