package com.robinhood.android.optionsexercise;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/TotalValueRowState;", "", "totalLabelString", "", "totalPriceString", "shortPositionText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTotalLabelString", "()Ljava/lang/String;", "getTotalPriceString", "getShortPositionText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalValueRowState {
    public static final int $stable = 0;
    private final String shortPositionText;
    private final String totalLabelString;
    private final String totalPriceString;

    public static /* synthetic */ TotalValueRowState copy$default(TotalValueRowState totalValueRowState, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = totalValueRowState.totalLabelString;
        }
        if ((i & 2) != 0) {
            str2 = totalValueRowState.totalPriceString;
        }
        if ((i & 4) != 0) {
            str3 = totalValueRowState.shortPositionText;
        }
        return totalValueRowState.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTotalLabelString() {
        return this.totalLabelString;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTotalPriceString() {
        return this.totalPriceString;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShortPositionText() {
        return this.shortPositionText;
    }

    public final TotalValueRowState copy(String totalLabelString, String totalPriceString, String shortPositionText) {
        Intrinsics.checkNotNullParameter(totalLabelString, "totalLabelString");
        Intrinsics.checkNotNullParameter(totalPriceString, "totalPriceString");
        return new TotalValueRowState(totalLabelString, totalPriceString, shortPositionText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalValueRowState)) {
            return false;
        }
        TotalValueRowState totalValueRowState = (TotalValueRowState) other;
        return Intrinsics.areEqual(this.totalLabelString, totalValueRowState.totalLabelString) && Intrinsics.areEqual(this.totalPriceString, totalValueRowState.totalPriceString) && Intrinsics.areEqual(this.shortPositionText, totalValueRowState.shortPositionText);
    }

    public int hashCode() {
        int iHashCode = ((this.totalLabelString.hashCode() * 31) + this.totalPriceString.hashCode()) * 31;
        String str = this.shortPositionText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TotalValueRowState(totalLabelString=" + this.totalLabelString + ", totalPriceString=" + this.totalPriceString + ", shortPositionText=" + this.shortPositionText + ")";
    }

    public TotalValueRowState(String totalLabelString, String totalPriceString, String str) {
        Intrinsics.checkNotNullParameter(totalLabelString, "totalLabelString");
        Intrinsics.checkNotNullParameter(totalPriceString, "totalPriceString");
        this.totalLabelString = totalLabelString;
        this.totalPriceString = totalPriceString;
        this.shortPositionText = str;
    }

    public final String getTotalLabelString() {
        return this.totalLabelString;
    }

    public final String getTotalPriceString() {
        return this.totalPriceString;
    }

    public final String getShortPositionText() {
        return this.shortPositionText;
    }
}
