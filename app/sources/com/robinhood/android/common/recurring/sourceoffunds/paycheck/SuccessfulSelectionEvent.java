package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderPaycheckSourceViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/SuccessfulSelectionEvent;", "", "existingPaycheckSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "<init>", "(Ljava/util/List;)V", "getExistingPaycheckSchedules", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SuccessfulSelectionEvent {
    public static final int $stable = 8;
    private final List<UiPaycheckInvestmentSchedule> existingPaycheckSchedules;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuccessfulSelectionEvent copy$default(SuccessfulSelectionEvent successfulSelectionEvent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = successfulSelectionEvent.existingPaycheckSchedules;
        }
        return successfulSelectionEvent.copy(list);
    }

    public final List<UiPaycheckInvestmentSchedule> component1() {
        return this.existingPaycheckSchedules;
    }

    public final SuccessfulSelectionEvent copy(List<UiPaycheckInvestmentSchedule> existingPaycheckSchedules) {
        Intrinsics.checkNotNullParameter(existingPaycheckSchedules, "existingPaycheckSchedules");
        return new SuccessfulSelectionEvent(existingPaycheckSchedules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SuccessfulSelectionEvent) && Intrinsics.areEqual(this.existingPaycheckSchedules, ((SuccessfulSelectionEvent) other).existingPaycheckSchedules);
    }

    public int hashCode() {
        return this.existingPaycheckSchedules.hashCode();
    }

    public String toString() {
        return "SuccessfulSelectionEvent(existingPaycheckSchedules=" + this.existingPaycheckSchedules + ")";
    }

    public SuccessfulSelectionEvent(List<UiPaycheckInvestmentSchedule> existingPaycheckSchedules) {
        Intrinsics.checkNotNullParameter(existingPaycheckSchedules, "existingPaycheckSchedules");
        this.existingPaycheckSchedules = existingPaycheckSchedules;
    }

    public final List<UiPaycheckInvestmentSchedule> getExistingPaycheckSchedules() {
        return this.existingPaycheckSchedules;
    }
}
