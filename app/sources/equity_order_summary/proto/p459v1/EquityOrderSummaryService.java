package equity_order_summary.proto.p459v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: EquityOrderSummaryService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;", "request", "Lequity_order_summary/proto/v1/GetOrderSummaryResponseDto;", "GetOrderSummary", "(Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_order_summary/proto/v1/StreamOrderConfirmationRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lequity_order_summary/proto/v1/StreamOrderConfirmationResponseDto;", "StreamOrderConfirmation", "(Lequity_order_summary/proto/v1/StreamOrderConfirmationRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_order_summary/proto/v1/GetOrderConfirmationRequestDto;", "Lequity_order_summary/proto/v1/GetOrderConfirmationResponseDto;", "GetOrderConfirmation", "(Lequity_order_summary/proto/v1/GetOrderConfirmationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_order_summary/proto/v1/WarmupRequestDto;", "Lequity_order_summary/proto/v1/WarmupResponseDto;", "Warmup", "(Lequity_order_summary/proto/v1/WarmupRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "equity_order_summary.proto.v1.EquityOrderSummaryService")
/* loaded from: classes18.dex */
public interface EquityOrderSummaryService {
    Object GetOrderConfirmation(GetOrderConfirmationRequestDto getOrderConfirmationRequestDto, Continuation<? super GetOrderConfirmationResponseDto> continuation);

    Object GetOrderSummary(GetOrderSummaryRequestDto getOrderSummaryRequestDto, Continuation<? super GetOrderSummaryResponseDto> continuation);

    Flow<StreamOrderConfirmationResponseDto> StreamOrderConfirmation(StreamOrderConfirmationRequestDto request);

    Object Warmup(WarmupRequestDto warmupRequestDto, Continuation<? super WarmupResponseDto> continuation);
}
