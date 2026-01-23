package com.robinhood.android.settings.p254ui.recurring.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/RetirementTaxYearRowState;", "", "yearText", "", "<init>", "(Ljava/lang/String;)V", "getYearText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementTaxYearRowState {
    public static final int $stable = 0;
    private final String yearText;

    public static /* synthetic */ RetirementTaxYearRowState copy$default(RetirementTaxYearRowState retirementTaxYearRowState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementTaxYearRowState.yearText;
        }
        return retirementTaxYearRowState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getYearText() {
        return this.yearText;
    }

    public final RetirementTaxYearRowState copy(String yearText) {
        Intrinsics.checkNotNullParameter(yearText, "yearText");
        return new RetirementTaxYearRowState(yearText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RetirementTaxYearRowState) && Intrinsics.areEqual(this.yearText, ((RetirementTaxYearRowState) other).yearText);
    }

    public int hashCode() {
        return this.yearText.hashCode();
    }

    public String toString() {
        return "RetirementTaxYearRowState(yearText=" + this.yearText + ")";
    }

    public RetirementTaxYearRowState(String yearText) {
        Intrinsics.checkNotNullParameter(yearText, "yearText");
        this.yearText = yearText;
    }

    public final String getYearText() {
        return this.yearText;
    }
}
