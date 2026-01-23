package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/CompanyFinancialsViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrumentId", "Ljava/util/UUID;", "companyFinancialsState", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;)V", "getInstrumentId", "()Ljava/util/UUID;", "getCompanyFinancialsState", "()Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CompanyFinancialsViewData extends DetailData {
    public static final int $stable = 8;
    private final CompanyFinancialsSectionViewState companyFinancialsState;
    private final UUID instrumentId;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ CompanyFinancialsViewData copy$default(CompanyFinancialsViewData companyFinancialsViewData, UUID uuid, CompanyFinancialsSectionViewState companyFinancialsSectionViewState, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = companyFinancialsViewData.instrumentId;
        }
        if ((i & 2) != 0) {
            companyFinancialsSectionViewState = companyFinancialsViewData.companyFinancialsState;
        }
        return companyFinancialsViewData.copy(uuid, companyFinancialsSectionViewState);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final CompanyFinancialsSectionViewState getCompanyFinancialsState() {
        return this.companyFinancialsState;
    }

    public final CompanyFinancialsViewData copy(UUID instrumentId, CompanyFinancialsSectionViewState companyFinancialsState) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(companyFinancialsState, "companyFinancialsState");
        return new CompanyFinancialsViewData(instrumentId, companyFinancialsState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyFinancialsViewData)) {
            return false;
        }
        CompanyFinancialsViewData companyFinancialsViewData = (CompanyFinancialsViewData) other;
        return Intrinsics.areEqual(this.instrumentId, companyFinancialsViewData.instrumentId) && Intrinsics.areEqual(this.companyFinancialsState, companyFinancialsViewData.companyFinancialsState);
    }

    public int hashCode() {
        return (this.instrumentId.hashCode() * 31) + this.companyFinancialsState.hashCode();
    }

    public String toString() {
        return "CompanyFinancialsViewData(instrumentId=" + this.instrumentId + ", companyFinancialsState=" + this.companyFinancialsState + ")";
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final CompanyFinancialsSectionViewState getCompanyFinancialsState() {
        return this.companyFinancialsState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompanyFinancialsViewData(UUID instrumentId, CompanyFinancialsSectionViewState companyFinancialsState) {
        super(null);
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(companyFinancialsState, "companyFinancialsState");
        this.instrumentId = instrumentId;
        this.companyFinancialsState = companyFinancialsState;
        this.section = ApiStockDetail.Section.COMPANY_FINANCIALS;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
