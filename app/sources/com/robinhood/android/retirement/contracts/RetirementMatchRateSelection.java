package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementMatchRateSelection;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "<init>", "(Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;)V", "getEntryPoint", "()Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RetirementMatchRateSelection implements IntentKey, Parcelable {
    public static final Parcelable.Creator<RetirementMatchRateSelection> CREATOR = new Creator();
    private final ApiMatchRateSelection6 entryPoint;

    /* compiled from: RetirementIntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RetirementMatchRateSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementMatchRateSelection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetirementMatchRateSelection(ApiMatchRateSelection6.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementMatchRateSelection[] newArray(int i) {
            return new RetirementMatchRateSelection[i];
        }
    }

    public static /* synthetic */ RetirementMatchRateSelection copy$default(RetirementMatchRateSelection retirementMatchRateSelection, ApiMatchRateSelection6 apiMatchRateSelection6, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMatchRateSelection6 = retirementMatchRateSelection.entryPoint;
        }
        return retirementMatchRateSelection.copy(apiMatchRateSelection6);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiMatchRateSelection6 getEntryPoint() {
        return this.entryPoint;
    }

    public final RetirementMatchRateSelection copy(ApiMatchRateSelection6 entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new RetirementMatchRateSelection(entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RetirementMatchRateSelection) && this.entryPoint == ((RetirementMatchRateSelection) other).entryPoint;
    }

    public int hashCode() {
        return this.entryPoint.hashCode();
    }

    public String toString() {
        return "RetirementMatchRateSelection(entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public RetirementMatchRateSelection(ApiMatchRateSelection6 entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.entryPoint = entryPoint;
    }

    public final ApiMatchRateSelection6 getEntryPoint() {
        return this.entryPoint;
    }
}
