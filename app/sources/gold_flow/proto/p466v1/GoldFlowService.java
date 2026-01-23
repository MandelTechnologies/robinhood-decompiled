package gold_flow.proto.p466v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: GoldFlowService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0003\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010\u0003\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\u0006\u0010\u0003\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010\u0003\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\u0006\u0010\u0003\u001a\u00020,H&¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010\u0003\u001a\u000200H&¢\u0006\u0004\b2\u00103¨\u00064"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService;", "", "Lgold_flow/proto/v1/StreamRouterMessageRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto;", "StreamRouterMessage", "(Lgold_flow/proto/v1/StreamRouterMessageRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/SendActionRequestDto;", "Lgold_flow/proto/v1/SendActionResponseDto;", "SendAction", "(Lgold_flow/proto/v1/SendActionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold_flow/proto/v1/StreamValuePropsContentRequestDto;", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto;", "StreamValuePropsContent", "(Lgold_flow/proto/v1/StreamValuePropsContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentRequestDto;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto;", "StreamMultiAgreementsContent", "(Lgold_flow/proto/v1/StreamMultiAgreementsContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSingleAgreementContentRequestDto;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto;", "StreamSingleAgreementContent", "(Lgold_flow/proto/v1/StreamSingleAgreementContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamConfirmationContentRequestDto;", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto;", "StreamConfirmationContent", "(Lgold_flow/proto/v1/StreamConfirmationContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSuggestedActionContentRequestDto;", "Lgold_flow/proto/v1/StreamSuggestedActionContentResponseDto;", "StreamSuggestedActionContent", "(Lgold_flow/proto/v1/StreamSuggestedActionContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamAgreementDisplayContentRequestDto;", "Lgold_flow/proto/v1/StreamAgreementDisplayContentResponseDto;", "StreamAgreementDisplayContent", "(Lgold_flow/proto/v1/StreamAgreementDisplayContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentRequestDto;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto;", "StreamValuePropsPromoContent", "(Lgold_flow/proto/v1/StreamValuePropsPromoContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamPlanSelectionContentRequestDto;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto;", "StreamPlanSelectionContent", "(Lgold_flow/proto/v1/StreamPlanSelectionContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentRequestDto;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto;", "StreamSageStartApplicationContent", "(Lgold_flow/proto/v1/StreamSageStartApplicationContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSageApplicationContentRequestDto;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto;", "StreamSageApplicationContent", "(Lgold_flow/proto/v1/StreamSageApplicationContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "gold_flow.proto.v1.GoldFlowService")
/* loaded from: classes18.dex */
public interface GoldFlowService {
    Object SendAction(SendActionRequestDto sendActionRequestDto, Continuation<? super SendActionResponseDto> continuation);

    Flow<StreamAgreementDisplayContentResponseDto> StreamAgreementDisplayContent(StreamAgreementDisplayContentRequestDto request);

    Flow<StreamConfirmationContentResponseDto> StreamConfirmationContent(StreamConfirmationContentRequestDto request);

    Flow<StreamMultiAgreementsContentResponseDto> StreamMultiAgreementsContent(StreamMultiAgreementsContentRequestDto request);

    Flow<StreamPlanSelectionContentResponseDto> StreamPlanSelectionContent(StreamPlanSelectionContentRequestDto request);

    Flow<StreamRouterMessageResponseDto> StreamRouterMessage(StreamRouterMessageRequestDto request);

    Flow<StreamSageApplicationContentResponseDto> StreamSageApplicationContent(StreamSageApplicationContentRequestDto request);

    Flow<StreamSageStartApplicationContentResponseDto> StreamSageStartApplicationContent(StreamSageStartApplicationContentRequestDto request);

    Flow<StreamSingleAgreementContentResponseDto> StreamSingleAgreementContent(StreamSingleAgreementContentRequestDto request);

    Flow<StreamSuggestedActionContentResponseDto> StreamSuggestedActionContent(StreamSuggestedActionContentRequestDto request);

    Flow<StreamValuePropsContentResponseDto> StreamValuePropsContent(StreamValuePropsContentRequestDto request);

    Flow<StreamValuePropsPromoContentResponseDto> StreamValuePropsPromoContent(StreamValuePropsPromoContentRequestDto request);
}
