package com.robinhood.android.settings.p254ui.recurring.pastinvestments;

import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PastInvestmentsViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/pastinvestments/PastInvestmentsViewState;", "", "investmentScheduleEvents", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "<init>", "(Ljava/util/List;)V", "getInvestmentScheduleEvents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PastInvestmentsViewState {
    public static final int $stable = 8;
    private final List<StatefulHistoryEvent<UiInvestmentScheduleEvent>> investmentScheduleEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public PastInvestmentsViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PastInvestmentsViewState copy$default(PastInvestmentsViewState pastInvestmentsViewState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pastInvestmentsViewState.investmentScheduleEvents;
        }
        return pastInvestmentsViewState.copy(list);
    }

    public final List<StatefulHistoryEvent<UiInvestmentScheduleEvent>> component1() {
        return this.investmentScheduleEvents;
    }

    public final PastInvestmentsViewState copy(List<StatefulHistoryEvent<UiInvestmentScheduleEvent>> investmentScheduleEvents) {
        Intrinsics.checkNotNullParameter(investmentScheduleEvents, "investmentScheduleEvents");
        return new PastInvestmentsViewState(investmentScheduleEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PastInvestmentsViewState) && Intrinsics.areEqual(this.investmentScheduleEvents, ((PastInvestmentsViewState) other).investmentScheduleEvents);
    }

    public int hashCode() {
        return this.investmentScheduleEvents.hashCode();
    }

    public String toString() {
        return "PastInvestmentsViewState(investmentScheduleEvents=" + this.investmentScheduleEvents + ")";
    }

    public PastInvestmentsViewState(List<StatefulHistoryEvent<UiInvestmentScheduleEvent>> investmentScheduleEvents) {
        Intrinsics.checkNotNullParameter(investmentScheduleEvents, "investmentScheduleEvents");
        this.investmentScheduleEvents = investmentScheduleEvents;
    }

    public /* synthetic */ PastInvestmentsViewState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<StatefulHistoryEvent<UiInvestmentScheduleEvent>> getInvestmentScheduleEvents() {
        return this.investmentScheduleEvents;
    }
}
