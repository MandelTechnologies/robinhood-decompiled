package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/RecurringInvestmentNuxData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "accountNumber", "", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getAccountNumber", "()Ljava/lang/String;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecurringInvestmentNuxData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final HeaderData.FromResource headerData;
    private final Instrument instrument;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ RecurringInvestmentNuxData copy$default(RecurringInvestmentNuxData recurringInvestmentNuxData, Instrument instrument, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = recurringInvestmentNuxData.instrument;
        }
        if ((i & 2) != 0) {
            str = recurringInvestmentNuxData.accountNumber;
        }
        return recurringInvestmentNuxData.copy(instrument, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final RecurringInvestmentNuxData copy(Instrument instrument, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new RecurringInvestmentNuxData(instrument, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringInvestmentNuxData)) {
            return false;
        }
        RecurringInvestmentNuxData recurringInvestmentNuxData = (RecurringInvestmentNuxData) other;
        return Intrinsics.areEqual(this.instrument, recurringInvestmentNuxData.instrument) && Intrinsics.areEqual(this.accountNumber, recurringInvestmentNuxData.accountNumber);
    }

    public int hashCode() {
        return (this.instrument.hashCode() * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "RecurringInvestmentNuxData(instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ")";
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringInvestmentNuxData(Instrument instrument, String accountNumber) {
        super(null);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.instrument = instrument;
        this.accountNumber = accountNumber;
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
