package com.robinhood.api.questionnaire;

import com.robinhood.android.questionnaire.api.ApiQuestionGraphResponse;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireCompletedResponse;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireConfirmRequest;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireProfileResponse;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireReview;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitRequest;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitResponse;
import com.robinhood.android.questionnaire.api.ReviewPageType;
import com.robinhood.models.PaginatedResult;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: QuestionnaireApi.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ.\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0015\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ$\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u001eJ.\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010!J<\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/api/questionnaire/QuestionnaireApi;", "", "getQuestionnaireQuestions", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion;", "context", "", "accountNumber", "questionKeys", "", "includeQuestionsAlreadyAnswered", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionGraph", "Lcom/robinhood/android/questionnaire/api/ApiQuestionGraphResponse;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSingleQuestionnaireQuestion", "questionKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitQuestionAnswers", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "request", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitRequest;", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmUserAnswers", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireConfirmRequest;", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireConfirmRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionnaireCompleted", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireCompletedResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionnaireProfile", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireProfileResponse;", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionnaireReview", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview;", "type", "Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "applicationId", "Ljava/util/UUID;", "(Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ReviewPageType;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface QuestionnaireApi {
    @POST("questionnaire/confirm-user-answers/")
    Object confirmUserAnswers(@Body ApiQuestionnaireConfirmRequest apiQuestionnaireConfirmRequest, Continuation<? super Unit> continuation);

    @GET("questionnaire/questions/v2/")
    Object getQuestionGraph(@Query("context") String str, @Query("account_number") String str2, @Query("include_questions_already_answered") boolean z, Continuation<? super ApiQuestionGraphResponse> continuation);

    @GET("questionnaire/questionnaire-completed/")
    Object getQuestionnaireCompleted(@Query("context") String str, @Query("account_number") String str2, Continuation<? super ApiQuestionnaireCompletedResponse> continuation);

    @GET("questionnaire/profile/")
    Object getQuestionnaireProfile(@Query("context") String str, @Query("include_questions_already_answered") boolean z, @Query("account_number") String str2, Continuation<? super ApiQuestionnaireProfileResponse> continuation);

    @GET("questionnaire/questions/")
    Object getQuestionnaireQuestions(@Query("context") String str, @Query("account_number") String str2, @Query("question_keys") List<String> list, @Query("include_questions_already_answered") boolean z, Continuation<? super PaginatedResult<ApiQuestionnaireQuestion>> continuation);

    @GET("questionnaire/review/")
    Object getQuestionnaireReview(@Query("context") String str, @Query("type") ReviewPageType reviewPageType, @Query("application_id") UUID uuid, @Query("account_number") String str2, Continuation<? super ApiQuestionnaireReview> continuation);

    @GET("questionnaire/questions/{question_key}/")
    Object getSingleQuestionnaireQuestion(@Path("question_key") String str, @Query("context") String str2, @Query("account_number") String str3, Continuation<? super ApiQuestionnaireQuestion> continuation);

    @POST("questionnaire/submit-user-answers/")
    Object submitQuestionAnswers(@Body ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest, Continuation<? super ApiQuestionnaireSubmitResponse> continuation);

    /* compiled from: QuestionnaireApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getQuestionnaireReview$default(QuestionnaireApi questionnaireApi, String str, ReviewPageType reviewPageType, UUID uuid, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuestionnaireReview");
            }
            if ((i & 2) != 0) {
                reviewPageType = null;
            }
            if ((i & 4) != 0) {
                uuid = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return questionnaireApi.getQuestionnaireReview(str, reviewPageType, uuid, str2, continuation);
        }
    }
}
