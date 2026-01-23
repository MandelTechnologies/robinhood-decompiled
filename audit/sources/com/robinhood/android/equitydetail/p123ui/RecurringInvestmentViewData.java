package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J=\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/RecurringInvestmentViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "investmentSchedules", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "pendingOrders", "Lcom/robinhood/models/db/Order;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Instrument;Ljava/util/List;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getInvestmentSchedules", "()Ljava/util/List;", "getPendingOrders", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecurringInvestmentViewData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final HeaderData.FromResource headerData;
    private final Instrument instrument;
    private final List<InvestmentSchedule> investmentSchedules;
    private final List<Order> pendingOrders;
    private final ApiStockDetail.Section section;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringInvestmentViewData copy$default(RecurringInvestmentViewData recurringInvestmentViewData, String str, Instrument instrument, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringInvestmentViewData.accountNumber;
        }
        if ((i & 2) != 0) {
            instrument = recurringInvestmentViewData.instrument;
        }
        if ((i & 4) != 0) {
            list = recurringInvestmentViewData.investmentSchedules;
        }
        if ((i & 8) != 0) {
            list2 = recurringInvestmentViewData.pendingOrders;
        }
        return recurringInvestmentViewData.copy(str, instrument, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<InvestmentSchedule> component3() {
        return this.investmentSchedules;
    }

    public final List<Order> component4() {
        return this.pendingOrders;
    }

    public final RecurringInvestmentViewData copy(String accountNumber, Instrument instrument, List<InvestmentSchedule> investmentSchedules, List<Order> pendingOrders) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        return new RecurringInvestmentViewData(accountNumber, instrument, investmentSchedules, pendingOrders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringInvestmentViewData)) {
            return false;
        }
        RecurringInvestmentViewData recurringInvestmentViewData = (RecurringInvestmentViewData) other;
        return Intrinsics.areEqual(this.accountNumber, recurringInvestmentViewData.accountNumber) && Intrinsics.areEqual(this.instrument, recurringInvestmentViewData.instrument) && Intrinsics.areEqual(this.investmentSchedules, recurringInvestmentViewData.investmentSchedules) && Intrinsics.areEqual(this.pendingOrders, recurringInvestmentViewData.pendingOrders);
    }

    public int hashCode() {
        return (((((this.accountNumber.hashCode() * 31) + this.instrument.hashCode()) * 31) + this.investmentSchedules.hashCode()) * 31) + this.pendingOrders.hashCode();
    }

    public String toString() {
        return "RecurringInvestmentViewData(accountNumber=" + this.accountNumber + ", instrument=" + this.instrument + ", investmentSchedules=" + this.investmentSchedules + ", pendingOrders=" + this.pendingOrders + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<InvestmentSchedule> getInvestmentSchedules() {
        return this.investmentSchedules;
    }

    public final List<Order> getPendingOrders() {
        return this.pendingOrders;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringInvestmentViewData(String accountNumber, Instrument instrument, List<InvestmentSchedule> investmentSchedules, List<Order> pendingOrders) {
        super(null);
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        this.accountNumber = accountNumber;
        this.instrument = instrument;
        this.investmentSchedules = investmentSchedules;
        this.pendingOrders = pendingOrders;
        this.section = ApiStockDetail.Section.RECURRING_INVESTMENTS;
        this.headerData = new HeaderData.FromResource(C15314R.string.instrument_detail_recurring_investments_label, getSection(), null, 4, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public HeaderData.FromResource getHeaderData() {
        return this.headerData;
    }
}
