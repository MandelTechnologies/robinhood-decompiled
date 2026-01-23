package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
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

/* compiled from: FeedbackServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ\u0080\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0001\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u0010\b\u0001\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackServiceRetrofit;", "", "", "", "headers", "Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponseDto;", "PostFeedback", "(Ljava/util/Map;Lcom/robinhood/copilot/proto/v1/PostFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instrument_id", MatchaQrCodeDuxo6.USER_ID_KEY, "Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generation_timestamp", "feedback_timestamp", "composite_feedback_id", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponseDto;", "GetFeedback", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackTypeDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes15.dex */
public interface FeedbackServiceRetrofit {
    @GET("copilot/v1/feedback")
    Object GetFeedback(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("instrumentId") String str, @IdlField(protoType = "string") @Query("userId") String str2, @Query("type") FeedbackTypeDto feedbackTypeDto, @IdlField(protoType = "google.protobuf.Timestamp") @Query("generationTimestamp") Instant instant, @IdlField(protoType = "google.protobuf.Timestamp") @Query("feedbackTimestamp") Instant instant2, @IdlField(protoType = "string") @Query("compositeFeedbackId") String str3, Continuation<Response<GetFeedbackResponseDto>> continuation);

    @POST("copilot/v1/feedback")
    Object PostFeedback(@HeaderMap Map<String, String> map, @Body PostFeedbackRequestDto postFeedbackRequestDto, Continuation<Response<PostFeedbackResponseDto>> continuation);
}
