package com.robinhood.android.account.p060ui;

import android.content.res.Resources;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountOverviewInvestmentScheduleCard.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/account/ui/RecurringSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "schedules", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "accountNumber", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getSchedules", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "getStatusText", "resources", "Landroid/content/res/Resources;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class RecurringSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<InvestmentSchedule> schedules;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringSectionState copy$default(RecurringSectionState recurringSectionState, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recurringSectionState.schedules;
        }
        if ((i & 2) != 0) {
            str = recurringSectionState.accountNumber;
        }
        return recurringSectionState.copy(list, str);
    }

    public final List<InvestmentSchedule> component1() {
        return this.schedules;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final RecurringSectionState copy(List<InvestmentSchedule> schedules, String accountNumber) {
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        return new RecurringSectionState(schedules, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringSectionState)) {
            return false;
        }
        RecurringSectionState recurringSectionState = (RecurringSectionState) other;
        return Intrinsics.areEqual(this.schedules, recurringSectionState.schedules) && Intrinsics.areEqual(this.accountNumber, recurringSectionState.accountNumber);
    }

    public int hashCode() {
        int iHashCode = this.schedules.hashCode() * 31;
        String str = this.accountNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecurringSectionState(schedules=" + this.schedules + ", accountNumber=" + this.accountNumber + ")";
    }

    public final List<InvestmentSchedule> getSchedules() {
        return this.schedules;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringSectionState(List<InvestmentSchedule> schedules, String str) {
        super(CardOrder.CardIdentifier.RECURRING_INVESTMENTS, null);
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        this.schedules = schedules;
        this.accountNumber = str;
    }

    public final String getStatusText(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (!this.schedules.isEmpty()) {
            int i = C8159R.string.account_overview_investment_schedule_status;
            List<InvestmentSchedule> list = this.schedules;
            int i2 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((InvestmentSchedule) it.next()).isActive() && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            String string2 = resources.getString(i, Integer.valueOf(i2), Integer.valueOf(this.schedules.size()));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        return String.valueOf(this.schedules.size());
    }
}
