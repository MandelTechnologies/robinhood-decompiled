package microgram.contracts.equity_short_interest.proto.p488v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: EquityShortInterestService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/equity_short_interest/proto/v1/EquityShortInterestService;", "", "Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "StreamShortInterestSection", "(Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/equity_short_interest/proto/v1/SetScrubIndexRequestDto;", "Lmicrogram/contracts/equity_short_interest/proto/v1/SetScrubIndexResponseDto;", "SetScrubIndex", "(Lmicrogram/contracts/equity_short_interest/proto/v1/SetScrubIndexRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.equity_short_interest.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.equity_short_interest.proto.v1.EquityShortInterestService")
/* loaded from: classes14.dex */
public interface EquityShortInterestService {
    Object SetScrubIndex(SetScrubIndexRequestDto setScrubIndexRequestDto, Continuation<? super SetScrubIndexResponseDto> continuation);

    Flow<StreamShortInterestSectionResponseDto> StreamShortInterestSection(StreamShortInterestSectionRequestDto request);
}
