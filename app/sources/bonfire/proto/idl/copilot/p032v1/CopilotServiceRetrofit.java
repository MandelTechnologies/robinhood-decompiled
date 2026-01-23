package bonfire.proto.idl.copilot.p032v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import p479j$.time.Instant;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: CopilotServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJV\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u0018\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH§@¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010 H§@¢\u0006\u0004\b#\u0010$J,\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b&\u0010'J8\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b*\u0010+J6\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020,H§@¢\u0006\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/CopilotServiceRetrofit;", "", "", "", "headers", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2RequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "InstrumentDigestV2", "(Ljava/util/Map;Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "feedback_timestamp", "Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "instrument_type", "Lbonfire/proto/idl/copilot/v1/GetFeedbackResponseDto;", "GetFeedback", "(Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto;", "SubmitFeedback", "(Ljava/util/Map;Lbonfire/proto/idl/copilot/v1/SubmitFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generation_timestamp", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackResponseDto;", "GetPortfolioDigestFeedback", "(Ljava/util/Map;Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackResponseDto;", "SubmitPortfolioDigestFeedback", "(Ljava/util/Map;Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/FlowTypeDto;", "flow_type", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto;", "DigestOnboarding", "(Ljava/util/Map;Lbonfire/proto/idl/copilot/v1/FlowTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/DigestPopularInstrumentsResponseDto;", "DigestPopularInstruments", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_number", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto;", "GetPortfolioDigest", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestReadRequestDto;", "SubmitPortfolioDigestRead", "(Ljava/util/Map;Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestReadRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface CopilotServiceRetrofit {
    @GET("rad/copilot/digest_v2/onboarding")
    Object DigestOnboarding(@HeaderMap Map<String, String> map, @Query("flowType") FlowTypeDto flowTypeDto, Continuation<Response<DigestOnboardingResponseDto>> continuation);

    @GET("rad/copilot/digest_v2/popular_instruments")
    Object DigestPopularInstruments(@HeaderMap Map<String, String> map, Continuation<Response<DigestPopularInstrumentsResponseDto>> continuation);

    @GET("rad/copilot/feedback")
    Object GetFeedback(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("digestId") String str, @IdlField(protoType = "google.protobuf.Timestamp") @Query("feedbackTimestamp") Instant instant, @Query("instrumentType") InstrumentTypeDto instrumentTypeDto, Continuation<Response<GetFeedbackResponseDto>> continuation);

    @GET("rad/copilot/digest_v2/portfolio")
    Object GetPortfolioDigest(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, Continuation<Response<GetPortfolioDigestResponseDto>> continuation);

    @GET("rad/copilot/feedback/portfolio_digest")
    Object GetPortfolioDigestFeedback(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("digestId") String str, @IdlField(protoType = "google.protobuf.Timestamp") @Query("generationTimestamp") Instant instant, Continuation<Response<GetPortfolioDigestFeedbackResponseDto>> continuation);

    @POST("rad/copilot/digest_v2")
    Object InstrumentDigestV2(@HeaderMap Map<String, String> map, @Body InstrumentDigestV2RequestDto instrumentDigestV2RequestDto, Continuation<Response<InstrumentDigestV2ResponseDto>> continuation);

    @POST("rad/copilot/feedback")
    Object SubmitFeedback(@HeaderMap Map<String, String> map, @Body SubmitFeedbackRequestDto submitFeedbackRequestDto, Continuation<Response<SubmitFeedbackResponseDto>> continuation);

    @POST("rad/copilot/feedback/portfolio_digest")
    Object SubmitPortfolioDigestFeedback(@HeaderMap Map<String, String> map, @Body SubmitPortfolioDigestFeedbackRequestDto submitPortfolioDigestFeedbackRequestDto, Continuation<Response<SubmitPortfolioDigestFeedbackResponseDto>> continuation);

    @POST("rad/copilot/portfolio_digest/read")
    Object SubmitPortfolioDigestRead(@HeaderMap Map<String, String> map, @Body SubmitPortfolioDigestReadRequestDto submitPortfolioDigestReadRequestDto, Continuation<Response<Object>> continuation);
}
