package com.robinhood.android.equities.companyfinancials;

import equity_company_financials.proto.p457v1.StreamCompanyFinancialsSectionResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompanyFinancialsSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "", "Disabled", "Ready", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState$Disabled;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState$Ready;", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface CompanyFinancialsSectionViewState {

    /* compiled from: CompanyFinancialsSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState$Disabled;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disabled implements CompanyFinancialsSectionViewState {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return -1154341702;
        }

        public String toString() {
            return "Disabled";
        }

        private Disabled() {
        }
    }

    /* compiled from: CompanyFinancialsSectionViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState$Ready;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "instrumentId", "Ljava/util/UUID;", "section", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "<init>", "(Ljava/util/UUID;Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSection", "()Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements CompanyFinancialsSectionViewState {
        public static final int $stable = 8;
        private final UUID instrumentId;
        private final StreamCompanyFinancialsSectionResponseDto section;

        public static /* synthetic */ Ready copy$default(Ready ready, UUID uuid, StreamCompanyFinancialsSectionResponseDto streamCompanyFinancialsSectionResponseDto, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ready.instrumentId;
            }
            if ((i & 2) != 0) {
                streamCompanyFinancialsSectionResponseDto = ready.section;
            }
            return ready.copy(uuid, streamCompanyFinancialsSectionResponseDto);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final StreamCompanyFinancialsSectionResponseDto getSection() {
            return this.section;
        }

        public final Ready copy(UUID instrumentId, StreamCompanyFinancialsSectionResponseDto section) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(section, "section");
            return new Ready(instrumentId, section);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.instrumentId, ready.instrumentId) && Intrinsics.areEqual(this.section, ready.section);
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.section.hashCode();
        }

        public String toString() {
            return "Ready(instrumentId=" + this.instrumentId + ", section=" + this.section + ")";
        }

        public Ready(UUID instrumentId, StreamCompanyFinancialsSectionResponseDto section) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(section, "section");
            this.instrumentId = instrumentId;
            this.section = section;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final StreamCompanyFinancialsSectionResponseDto getSection() {
            return this.section;
        }
    }
}
