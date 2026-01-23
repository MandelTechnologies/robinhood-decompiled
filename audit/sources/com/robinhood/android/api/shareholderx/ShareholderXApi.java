package com.robinhood.android.api.shareholderx;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.ShareholderXRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.shareholderx.models.api.ApiDeleteQuestionResponse;
import com.robinhood.shareholderx.models.api.ApiQaEventMetadata;
import com.robinhood.shareholderx.models.api.ApiSayReferenceIdRequest;
import com.robinhood.shareholderx.models.api.ApiShareholderEntryPointResponse;
import com.robinhood.shareholderx.models.api.ApiShareholderEventsPage;
import com.robinhood.shareholderx.models.api.ApiShareholderEventsSection;
import com.robinhood.shareholderx.models.api.ApiShareholderNewQuestionResponse;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestion;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestionsPaginatedResponse;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestionsPaginatedResponse2;
import com.robinhood.shareholderx.models.api.ApiVoteResponse;
import com.robinhood.shareholderx.models.api.ShareholderNewQuestionBody;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ShareholderXApi.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\fJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0013J,\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0016J,\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u001d2\b\b\u0001\u0010 \u001a\u00020!H§@¢\u0006\u0002\u0010\"J\"\u0010#\u001a\u00020$2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u0006H§@¢\u0006\u0002\u0010%J\"\u0010&\u001a\u00020$2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u0006H§@¢\u0006\u0002\u0010%J,\u0010'\u001a\u00020(2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010)\u001a\u00020\b2\b\b\u0001\u0010*\u001a\u00020+H§@¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020.2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u001bJ$\u0010/\u001a\u0002002\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u0013¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/api/shareholderx/ShareholderXApi;", "", "getShareholderQuestions", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestionsPaginatedResponse;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion;", "instrumentId", "Ljava/util/UUID;", "slug", "", "filter", AnalyticsStrings.BUTTON_LIST_SORT, "page", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShareholderQuestionsAndAnswers", "Lcom/robinhood/shareholderx/models/api/ApiAnsweredShareholderQuestionsPaginatedResponse;", "cursor", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQaEventMetadata", "Lcom/robinhood/shareholderx/models/api/ApiQaEventMetadata;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShareholderQuestion", "questionId", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteQuestion", "Lcom/robinhood/shareholderx/models/api/ApiDeleteQuestionResponse;", "getShareholderEntryPointInfo", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEntryPointResponse;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptShareholderExperienceTerms", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "associateSayReferenceId", "request", "Lcom/robinhood/shareholderx/models/api/ApiSayReferenceIdRequest;", "(Lcom/robinhood/shareholderx/models/api/ApiSayReferenceIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upvoteQuestion", "Lcom/robinhood/shareholderx/models/api/ApiVoteResponse;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeUpvote", "submitQuestion", "Lcom/robinhood/shareholderx/models/api/ApiShareholderNewQuestionResponse;", "eventSlug", "question", "Lcom/robinhood/shareholderx/models/api/ShareholderNewQuestionBody;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/shareholderx/models/api/ShareholderNewQuestionBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShareholderQaEventSection", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEventsSection;", "getShareholderQaEventsPage", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEventsPage;", "lib-api-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ShareholderXApi {
    @POST("shareholderx/users/terms/accept/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {ShareholderXRegionGate.class})
    Object acceptShareholderExperienceTerms(Continuation<? super Unit> continuation);

    @POST("shareholderx/users/say-reference-id/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {ShareholderXRegionGate.class})
    Object associateSayReferenceId(@Body ApiSayReferenceIdRequest apiSayReferenceIdRequest, Continuation<? super Unit> continuation);

    @DELETE("instruments/{instrument_id}/qa/{slug}/questions/{question_id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {ShareholderXRegionGate.class})
    Object deleteQuestion(@Path("instrument_id") UUID uuid, @Path("slug") String str, @Path("question_id") UUID uuid2, Continuation<? super ApiDeleteQuestionResponse> continuation);

    @GET("instruments/{instrument_id}/qa/{slug}/event-metadata/")
    @RequiresRegionGate(regionGates = {ShareholderXRegionGate.class})
    Object getQaEventMetadata(@Path("instrument_id") UUID uuid, @Path("slug") String str, Continuation<? super ApiQaEventMetadata> continuation);

    @GET("instruments/{instrument_id}/qa/event-info/")
    @RequiresRegionGate(regionGates = {ShareholderXRegionGate.class})
    Object getShareholderEntryPointInfo(@Path("instrument_id") UUID uuid, Continuation<? super ApiShareholderEntryPointResponse> continuation);

    @GET("instruments/{instrument_id}/qa/events-section/")
    @RequiresRegionGate(regionGates = {ShareholderXRegionGate.class})
    Object getShareholderQaEventSection(@Path("instrument_id") UUID uuid, Continuation<? super ApiShareholderEventsSection> continuation);

    @GET("instruments/{instrument_id}/qa/events-page/")
    @RequiresRegionGate(regionGates = {ShareholderXRegionGate.class})
    Object getShareholderQaEventsPage(@Path("instrument_id") UUID uuid, @Query("filter") String str, Continuation<? super ApiShareholderEventsPage> continuation);

    @GET("instruments/{instrument_id}/qa/{slug}/questions/{question_id}/")
    @RequiresRegionGate(regionGates = {ShareholderXRegionGate.class})
    Object getShareholderQuestion(@Path("instrument_id") UUID uuid, @Path("slug") String str, @Path("question_id") UUID uuid2, Continuation<? super ApiShareholderQuestion> continuation);

    @GET("instruments/{instrument_id}/qa/{slug}/questions/")
    @RequiresRegionGate(regionGates = {ShareholderXRegionGate.class})
    Object getShareholderQuestions(@Path("instrument_id") UUID uuid, @Path("slug") String str, @Query("filter") String str2, @Query(AnalyticsStrings.BUTTON_LIST_SORT) String str3, @Query("page") String str4, Continuation<? super ApiShareholderQuestionsPaginatedResponse<ApiShareholderQuestion>> continuation);

    @GET("instruments/{instrument_id}/qa/{slug}/questions-and-answers/")
    @RequiresRegionGate(regionGates = {ShareholderXRegionGate.class})
    Object getShareholderQuestionsAndAnswers(@Path("instrument_id") UUID uuid, @Path("slug") String str, @Query("cursor") String str2, Continuation<? super ApiShareholderQuestionsPaginatedResponse2<ApiShareholderQuestion>> continuation);

    @DELETE("shareholderx/events/{slug}/questions/{question_id}/vote/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {ShareholderXRegionGate.class})
    Object removeUpvote(@Path("slug") String str, @Path("question_id") UUID uuid, Continuation<? super ApiVoteResponse> continuation);

    @POST("instruments/{instrument_id}/qa/{event_slug}/questions/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {ShareholderXRegionGate.class})
    Object submitQuestion(@Path("instrument_id") UUID uuid, @Path("event_slug") String str, @Body ShareholderNewQuestionBody shareholderNewQuestionBody, Continuation<? super ApiShareholderNewQuestionResponse> continuation);

    @POST("shareholderx/events/{slug}/questions/{question_id}/vote/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {ShareholderXRegionGate.class})
    Object upvoteQuestion(@Path("slug") String str, @Path("question_id") UUID uuid, Continuation<? super ApiVoteResponse> continuation);
}
