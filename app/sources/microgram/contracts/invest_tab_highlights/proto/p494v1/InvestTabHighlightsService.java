package microgram.contracts.invest_tab_highlights.proto.p494v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: InvestTabHighlightsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService;", "", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightsRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightsResponseDto;", "StreamHighlights", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightRequestDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightResponseDto;", "StreamHighlight", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightRequestDto;)Lkotlinx/coroutines/flow/Flow;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.invest_tab_highlights.proto.v1.InvestTabHighlightsService")
/* loaded from: classes14.dex */
public interface InvestTabHighlightsService {
    Flow<StreamHighlightResponseDto> StreamHighlight(StreamHighlightRequestDto request);

    Flow<StreamHighlightsResponseDto> StreamHighlights(StreamHighlightsRequestDto request);
}
