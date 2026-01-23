package com.robinhood.android.api.education;

import com.robinhood.shared.models.api.bonfire.education.ApiEducationClaimRewardResult;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationToolTipRequest;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationToolTipResponse;
import com.robinhood.shared.models.api.bonfire.education.EducationUserProgressRequest;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationHome;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationLesson;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationSeries;
import com.robinhood.shared.models.api.bonfire.education.tour.ApiEducationTourResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: EducationApi.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0007J$\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0007J$\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020\u00052\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\"\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020#H§@¢\u0006\u0002\u0010$J2\u0010%\u001a\u00020#2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010(H§@¢\u0006\u0002\u0010*¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/api/education/EducationApi;", "", "getLearnAndEarnEarnability", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability;", "assetId", "", "lessonId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claimLearnAndEarnReward", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationClaimRewardResult;", "rewardType", "getToolTip", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipResponse;", "id", "accountNumber", "markToolTipSeen", "", "request", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipRequest;", "(Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEducationHome", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationHome;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEducationSeries", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationSeries;", "seriesId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEducationLesson", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationLesson;", "source", "getEducationTour", "Lcom/robinhood/shared/models/api/bonfire/education/tour/ApiEducationTourResult;", "screen", "screenUniqueId", "updateEducationUserProgress", "Lcom/robinhood/shared/models/api/bonfire/education/EducationUserProgressRequest;", "(Lcom/robinhood/shared/models/api/bonfire/education/EducationUserProgressRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEducationUserProgress", "trackingId", "statusType", "", "contentType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface EducationApi {
    @POST("education/learn_and_earn_claim_reward/")
    Object claimLearnAndEarnReward(@Query("lesson_id") String str, @Query("reward_type") String str2, Continuation<? super ApiEducationClaimRewardResult> continuation);

    @GET("education/home")
    Object getEducationHome(Continuation<? super ApiEducationHome> continuation);

    @GET("education/lesson/{lesson_id}")
    Object getEducationLesson(@Path("lesson_id") String str, @Query("source") String str2, Continuation<? super ApiEducationLesson> continuation);

    @GET("education/series/{series_id}")
    Object getEducationSeries(@Path("series_id") String str, Continuation<? super ApiEducationSeries> continuation);

    @GET("education/tour/")
    Object getEducationTour(@Query("screen") String str, @Query("screen_unique_id") String str2, Continuation<? super ApiEducationTourResult> continuation);

    @GET("education/user_progress/")
    Object getEducationUserProgress(@Query("tracking_id") String str, @Query("status_type") Integer num, @Query("content_type") Integer num2, Continuation<? super EducationUserProgressRequest> continuation);

    @GET("education/learn_and_earn_earnability/")
    Object getLearnAndEarnEarnability(@Query("asset_id") String str, @Query("lesson_id") String str2, Continuation<? super ApiEducationEarnability> continuation);

    @GET("education/tool_tips/")
    Object getToolTip(@Query("id") String str, @Query("account_number") String str2, Continuation<? super ApiEducationToolTipResponse> continuation);

    @POST("education/tool_tips/seen/")
    Object markToolTipSeen(@Body ApiEducationToolTipRequest apiEducationToolTipRequest, Continuation<? super Unit> continuation);

    @POST("education/user_progress/")
    Object updateEducationUserProgress(@Body EducationUserProgressRequest educationUserProgressRequest, Continuation<? super Unit> continuation);
}
