package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/ClosedPnlViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Instrument;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClosedPnlViewData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Instrument instrument;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ ClosedPnlViewData copy$default(ClosedPnlViewData closedPnlViewData, String str, Instrument instrument, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closedPnlViewData.accountNumber;
        }
        if ((i & 2) != 0) {
            instrument = closedPnlViewData.instrument;
        }
        return closedPnlViewData.copy(str, instrument);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final ClosedPnlViewData copy(String accountNumber, Instrument instrument) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new ClosedPnlViewData(accountNumber, instrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosedPnlViewData)) {
            return false;
        }
        ClosedPnlViewData closedPnlViewData = (ClosedPnlViewData) other;
        return Intrinsics.areEqual(this.accountNumber, closedPnlViewData.accountNumber) && Intrinsics.areEqual(this.instrument, closedPnlViewData.instrument);
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + this.instrument.hashCode();
    }

    public String toString() {
        return "ClosedPnlViewData(accountNumber=" + this.accountNumber + ", instrument=" + this.instrument + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosedPnlViewData(String accountNumber, Instrument instrument) {
        super(null);
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.accountNumber = accountNumber;
        this.instrument = instrument;
        this.section = ApiStockDetail.Section.CLOSED_PNL;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
