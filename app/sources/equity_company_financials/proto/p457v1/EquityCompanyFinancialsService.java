package equity_company_financials.proto.p457v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: EquityCompanyFinancialsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "StreamCompanyFinancialsSection", "(Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodRequestDto;", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodResponseDto;", "SetSelectedTimePeriod", "(Lequity_company_financials/proto/v1/SetSelectedTimePeriodRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_company_financials/proto/v1/SetScrubIndexRequestDto;", "Lequity_company_financials/proto/v1/SetScrubIndexResponseDto;", "SetScrubIndex", "(Lequity_company_financials/proto/v1/SetScrubIndexRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_company_financials/proto/v1/StreamSupportedInstrumentsRequestDto;", "Lequity_company_financials/proto/v1/StreamSupportedInstrumentsResponseDto;", "StreamSupportedInstruments", "(Lequity_company_financials/proto/v1/StreamSupportedInstrumentsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "equity_company_financials.proto.v1.EquityCompanyFinancialsService")
/* loaded from: classes18.dex */
public interface EquityCompanyFinancialsService {
    Object SetScrubIndex(SetScrubIndexRequestDto setScrubIndexRequestDto, Continuation<? super SetScrubIndexResponseDto> continuation);

    Object SetSelectedTimePeriod(SetSelectedTimePeriodRequestDto setSelectedTimePeriodRequestDto, Continuation<? super SetSelectedTimePeriodResponseDto> continuation);

    Flow<StreamCompanyFinancialsSectionResponseDto> StreamCompanyFinancialsSection(StreamCompanyFinancialsSectionRequestDto request);

    Flow<StreamSupportedInstrumentsResponseDto> StreamSupportedInstruments(StreamSupportedInstrumentsRequestDto request);
}
