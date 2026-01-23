package com.robinhood.android.equities.companyfinancials;

import equity_company_financials.proto.p457v1.StreamCompanyFinancialsSectionResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompanyFinancialsSectionDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDataState;", "", "instrumentId", "Ljava/util/UUID;", "section", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "<init>", "(Ljava/util/UUID;Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSection", "()Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CompanyFinancialsSectionDataState {
    public static final int $stable = 8;
    private final UUID instrumentId;
    private final StreamCompanyFinancialsSectionResponseDto section;

    /* JADX WARN: Multi-variable type inference failed */
    public CompanyFinancialsSectionDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CompanyFinancialsSectionDataState copy$default(CompanyFinancialsSectionDataState companyFinancialsSectionDataState, UUID uuid, StreamCompanyFinancialsSectionResponseDto streamCompanyFinancialsSectionResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = companyFinancialsSectionDataState.instrumentId;
        }
        if ((i & 2) != 0) {
            streamCompanyFinancialsSectionResponseDto = companyFinancialsSectionDataState.section;
        }
        return companyFinancialsSectionDataState.copy(uuid, streamCompanyFinancialsSectionResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final StreamCompanyFinancialsSectionResponseDto getSection() {
        return this.section;
    }

    public final CompanyFinancialsSectionDataState copy(UUID instrumentId, StreamCompanyFinancialsSectionResponseDto section) {
        return new CompanyFinancialsSectionDataState(instrumentId, section);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyFinancialsSectionDataState)) {
            return false;
        }
        CompanyFinancialsSectionDataState companyFinancialsSectionDataState = (CompanyFinancialsSectionDataState) other;
        return Intrinsics.areEqual(this.instrumentId, companyFinancialsSectionDataState.instrumentId) && Intrinsics.areEqual(this.section, companyFinancialsSectionDataState.section);
    }

    public int hashCode() {
        UUID uuid = this.instrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        StreamCompanyFinancialsSectionResponseDto streamCompanyFinancialsSectionResponseDto = this.section;
        return iHashCode + (streamCompanyFinancialsSectionResponseDto != null ? streamCompanyFinancialsSectionResponseDto.hashCode() : 0);
    }

    public String toString() {
        return "CompanyFinancialsSectionDataState(instrumentId=" + this.instrumentId + ", section=" + this.section + ")";
    }

    public CompanyFinancialsSectionDataState(UUID uuid, StreamCompanyFinancialsSectionResponseDto streamCompanyFinancialsSectionResponseDto) {
        this.instrumentId = uuid;
        this.section = streamCompanyFinancialsSectionResponseDto;
    }

    public /* synthetic */ CompanyFinancialsSectionDataState(UUID uuid, StreamCompanyFinancialsSectionResponseDto streamCompanyFinancialsSectionResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : streamCompanyFinancialsSectionResponseDto);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final StreamCompanyFinancialsSectionResponseDto getSection() {
        return this.section;
    }
}
