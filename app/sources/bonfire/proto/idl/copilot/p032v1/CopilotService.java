package bonfire.proto.idl.copilot.p032v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CopilotService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001fH¦@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020#H¦@¢\u0006\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/CopilotService;", "", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2RequestDto;", "request", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "InstrumentDigestV2", "(Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/GetFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/GetFeedbackResponseDto;", "GetFeedback", "(Lbonfire/proto/idl/copilot/v1/GetFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto;", "SubmitFeedback", "(Lbonfire/proto/idl/copilot/v1/SubmitFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackResponseDto;", "GetPortfolioDigestFeedback", "(Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackResponseDto;", "SubmitPortfolioDigestFeedback", "(Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingRequestDto;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto;", "DigestOnboarding", "(Lbonfire/proto/idl/copilot/v1/DigestOnboardingRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/DigestPopularInstrumentsRequestDto;", "Lbonfire/proto/idl/copilot/v1/DigestPopularInstrumentsResponseDto;", "DigestPopularInstruments", "(Lbonfire/proto/idl/copilot/v1/DigestPopularInstrumentsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestRequestDto;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto;", "GetPortfolioDigest", "(Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestReadRequestDto;", "SubmitPortfolioDigestRead", "(Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestReadRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface CopilotService {
    Object DigestOnboarding(DigestOnboardingRequestDto digestOnboardingRequestDto, Continuation<? super DigestOnboardingResponseDto> continuation);

    Object DigestPopularInstruments(DigestPopularInstrumentsRequestDto digestPopularInstrumentsRequestDto, Continuation<? super DigestPopularInstrumentsResponseDto> continuation);

    Object GetFeedback(GetFeedbackRequestDto getFeedbackRequestDto, Continuation<? super GetFeedbackResponseDto> continuation);

    Object GetPortfolioDigest(GetPortfolioDigestRequestDto getPortfolioDigestRequestDto, Continuation<? super GetPortfolioDigestResponseDto> continuation);

    Object GetPortfolioDigestFeedback(GetPortfolioDigestFeedbackRequestDto getPortfolioDigestFeedbackRequestDto, Continuation<? super GetPortfolioDigestFeedbackResponseDto> continuation);

    Object InstrumentDigestV2(InstrumentDigestV2RequestDto instrumentDigestV2RequestDto, Continuation<? super InstrumentDigestV2ResponseDto> continuation);

    Object SubmitFeedback(SubmitFeedbackRequestDto submitFeedbackRequestDto, Continuation<? super SubmitFeedbackResponseDto> continuation);

    Object SubmitPortfolioDigestFeedback(SubmitPortfolioDigestFeedbackRequestDto submitPortfolioDigestFeedbackRequestDto, Continuation<? super SubmitPortfolioDigestFeedbackResponseDto> continuation);

    Object SubmitPortfolioDigestRead(SubmitPortfolioDigestReadRequestDto submitPortfolioDigestReadRequestDto, Continuation<Object> continuation);
}
