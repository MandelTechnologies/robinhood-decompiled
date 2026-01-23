package com.robinhood.android.equities.companyfinancials.microgram;

import com.robinhood.coroutines.job.CachedJobManager7;
import equity_company_financials.proto.p457v1.SetScrubIndexResponseDto;
import equity_company_financials.proto.p457v1.SetSelectedTimePeriodResponseDto;
import equity_company_financials.proto.p457v1.StreamCompanyFinancialsSectionResponseDto;
import equity_company_financials.proto.p457v1.StreamSupportedInstrumentsResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CompanyFinancialsCachedService.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H&¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "streamCompanyFinancialsSection", "Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "instrumentId", "Ljava/util/UUID;", "setSelectedTimePeriod", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodResponseDto;", "selectedTimePeriodType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setScrubIndex", "Lequity_company_financials/proto/v1/SetScrubIndexResponseDto;", "scrubIndex", "", "(Ljava/util/UUID;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamSupportedInstruments", "Lequity_company_financials/proto/v1/StreamSupportedInstrumentsResponseDto;", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface CompanyFinancialsCachedService extends CachedJobManager7 {
    Object setScrubIndex(UUID uuid, Integer num, Continuation<? super SetScrubIndexResponseDto> continuation);

    Object setSelectedTimePeriod(String str, Continuation<? super SetSelectedTimePeriodResponseDto> continuation);

    Flow<StreamCompanyFinancialsSectionResponseDto> streamCompanyFinancialsSection(UUID instrumentId);

    Flow<StreamSupportedInstrumentsResponseDto> streamSupportedInstruments();
}
