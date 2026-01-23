package com.robinhood.android.beneficiaries.p067ui.trustflow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryTrustFlowViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "Landroid/os/Parcelable;", "stepCount", "", "stepIndex", "stepProgress", "", "<init>", "(IIF)V", "getStepCount", "()I", "getStepIndex", "getStepProgress", "()F", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryTrustFlowToolbarViewState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BeneficiaryTrustFlowToolbarViewState> CREATOR = new Creator();
    private final int stepCount;
    private final int stepIndex;
    private final float stepProgress;

    /* compiled from: BeneficiaryTrustFlowViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<BeneficiaryTrustFlowToolbarViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeneficiaryTrustFlowToolbarViewState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BeneficiaryTrustFlowToolbarViewState(parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeneficiaryTrustFlowToolbarViewState[] newArray(int i) {
            return new BeneficiaryTrustFlowToolbarViewState[i];
        }
    }

    public static /* synthetic */ BeneficiaryTrustFlowToolbarViewState copy$default(BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = beneficiaryTrustFlowToolbarViewState.stepCount;
        }
        if ((i3 & 2) != 0) {
            i2 = beneficiaryTrustFlowToolbarViewState.stepIndex;
        }
        if ((i3 & 4) != 0) {
            f = beneficiaryTrustFlowToolbarViewState.stepProgress;
        }
        return beneficiaryTrustFlowToolbarViewState.copy(i, i2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStepCount() {
        return this.stepCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStepIndex() {
        return this.stepIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final float getStepProgress() {
        return this.stepProgress;
    }

    public final BeneficiaryTrustFlowToolbarViewState copy(int stepCount, int stepIndex, float stepProgress) {
        return new BeneficiaryTrustFlowToolbarViewState(stepCount, stepIndex, stepProgress);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryTrustFlowToolbarViewState)) {
            return false;
        }
        BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState = (BeneficiaryTrustFlowToolbarViewState) other;
        return this.stepCount == beneficiaryTrustFlowToolbarViewState.stepCount && this.stepIndex == beneficiaryTrustFlowToolbarViewState.stepIndex && Float.compare(this.stepProgress, beneficiaryTrustFlowToolbarViewState.stepProgress) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.stepCount) * 31) + Integer.hashCode(this.stepIndex)) * 31) + Float.hashCode(this.stepProgress);
    }

    public String toString() {
        return "BeneficiaryTrustFlowToolbarViewState(stepCount=" + this.stepCount + ", stepIndex=" + this.stepIndex + ", stepProgress=" + this.stepProgress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.stepCount);
        dest.writeInt(this.stepIndex);
        dest.writeFloat(this.stepProgress);
    }

    public BeneficiaryTrustFlowToolbarViewState(int i, int i2, float f) {
        this.stepCount = i;
        this.stepIndex = i2;
        this.stepProgress = f;
    }

    public /* synthetic */ BeneficiaryTrustFlowToolbarViewState(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 0.3f : f);
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    public final int getStepIndex() {
        return this.stepIndex;
    }

    public final float getStepProgress() {
        return this.stepProgress;
    }
}
