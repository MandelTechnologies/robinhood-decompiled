package com.robinhood.api.social;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiSocialBlockUserRequest;
import com.robinhood.models.api.bonfire.ApiSocialBlockedUser;
import com.robinhood.models.api.bonfire.ApiSocialBlockingResponse;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.models.api.bonfire.ApiUpdateSocialProfileInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: SocialBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0006\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/api/social/SocialBonfireApi;", "", "getProfile", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "request", "Lcom/robinhood/models/api/bonfire/ApiUpdateSocialProfileInfo;", "(Lcom/robinhood/models/api/bonfire/ApiUpdateSocialProfileInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSocialBlockedUsers", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockedUser;", "pageSize", "", "cursor", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unblockUser", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockingResponse;", "relationshipId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blockUser", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockUserRequest;", "(Lcom/robinhood/models/api/bonfire/ApiSocialBlockUserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-social_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface SocialBonfireApi {
    @POST("social/block/")
    Object blockUser(@Body ApiSocialBlockUserRequest apiSocialBlockUserRequest, Continuation<? super ApiSocialBlockingResponse> continuation);

    @GET("social/user_profile")
    Object getProfile(Continuation<? super ApiSocialProfileInfo> continuation);

    @GET("social/blocked_users/")
    Object getSocialBlockedUsers(@Query("page_size") int i, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiSocialBlockedUser>> continuation);

    @DELETE("social/block/{relationship_id}")
    Object unblockUser(@Path("relationship_id") UUID uuid, Continuation<? super ApiSocialBlockingResponse> continuation);

    @POST("social/user_profile/update")
    Object updateProfile(@Body ApiUpdateSocialProfileInfo apiUpdateSocialProfileInfo, Continuation<? super ApiSocialProfileInfo> continuation);
}
