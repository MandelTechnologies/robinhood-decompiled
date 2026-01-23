package com.robinhood.android.retirement.contributions;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionProgressRing.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "Landroid/os/Parcelable;", "currentPercent", "", "inputChars", "", "matchType", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "matchAmount", "<init>", "(FLjava/lang/String;Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;Ljava/lang/String;)V", "getCurrentPercent", "()F", "getInputChars", "()Ljava/lang/String;", "getMatchType", "()Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "getMatchAmount", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionProgressRingState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ContributionProgressRingState> CREATOR = new Creator();
    private final float currentPercent;
    private final String inputChars;
    private final String matchAmount;
    private final ApiRetirementMatchResponse3 matchType;

    /* compiled from: ContributionProgressRing.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ContributionProgressRingState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContributionProgressRingState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContributionProgressRingState(parcel.readFloat(), parcel.readString(), ApiRetirementMatchResponse3.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContributionProgressRingState[] newArray(int i) {
            return new ContributionProgressRingState[i];
        }
    }

    public static /* synthetic */ ContributionProgressRingState copy$default(ContributionProgressRingState contributionProgressRingState, float f, String str, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = contributionProgressRingState.currentPercent;
        }
        if ((i & 2) != 0) {
            str = contributionProgressRingState.inputChars;
        }
        if ((i & 4) != 0) {
            apiRetirementMatchResponse3 = contributionProgressRingState.matchType;
        }
        if ((i & 8) != 0) {
            str2 = contributionProgressRingState.matchAmount;
        }
        return contributionProgressRingState.copy(f, str, apiRetirementMatchResponse3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCurrentPercent() {
        return this.currentPercent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputChars() {
        return this.inputChars;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiRetirementMatchResponse3 getMatchType() {
        return this.matchType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMatchAmount() {
        return this.matchAmount;
    }

    public final ContributionProgressRingState copy(float currentPercent, String inputChars, ApiRetirementMatchResponse3 matchType, String matchAmount) {
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(matchType, "matchType");
        return new ContributionProgressRingState(currentPercent, inputChars, matchType, matchAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionProgressRingState)) {
            return false;
        }
        ContributionProgressRingState contributionProgressRingState = (ContributionProgressRingState) other;
        return Float.compare(this.currentPercent, contributionProgressRingState.currentPercent) == 0 && Intrinsics.areEqual(this.inputChars, contributionProgressRingState.inputChars) && this.matchType == contributionProgressRingState.matchType && Intrinsics.areEqual(this.matchAmount, contributionProgressRingState.matchAmount);
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.currentPercent) * 31) + this.inputChars.hashCode()) * 31) + this.matchType.hashCode()) * 31;
        String str = this.matchAmount;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ContributionProgressRingState(currentPercent=" + this.currentPercent + ", inputChars=" + this.inputChars + ", matchType=" + this.matchType + ", matchAmount=" + this.matchAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.currentPercent);
        dest.writeString(this.inputChars);
        dest.writeString(this.matchType.name());
        dest.writeString(this.matchAmount);
    }

    public ContributionProgressRingState(float f, String inputChars, ApiRetirementMatchResponse3 matchType, String str) {
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(matchType, "matchType");
        this.currentPercent = f;
        this.inputChars = inputChars;
        this.matchType = matchType;
        this.matchAmount = str;
    }

    public final float getCurrentPercent() {
        return this.currentPercent;
    }

    public final String getInputChars() {
        return this.inputChars;
    }

    public final ApiRetirementMatchResponse3 getMatchType() {
        return this.matchType;
    }

    public final String getMatchAmount() {
        return this.matchAmount;
    }
}
