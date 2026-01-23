package com.robinhood.android.api.discovery;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAnalyticsIds;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ApiCuratedListItem;
import com.robinhood.models.api.ApiUserListItem;
import com.robinhood.models.api.CreateOrUpdateListRequest;
import com.robinhood.models.api.CuratedListItemOperation;
import com.robinhood.models.api.CuratedListItemReorderRequest;
import com.robinhood.models.api.CuratedListItemsPaginatedResult;
import com.robinhood.models.api.CuratedListQuickAddRequest;
import com.robinhood.models.api.DefaultCuratedListPaginatedResults;
import com.robinhood.models.api.OptionCuratedListQuickAddRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: DiscoveryApi.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\nJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0001\u0010\r\u001a\u00020\t2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0013JV\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\t2\b\b\u0003\u0010\u0017\u001a\u00020\u00182\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020$H§@¢\u0006\u0002\u0010%J\"\u0010&\u001a\u00020\"2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010'\u001a\u00020\u000fH§@¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020+H§@¢\u0006\u0002\u0010,J(\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0.2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010'\u001a\u00020\u000fH§@¢\u0006\u0002\u0010(J(\u0010/\u001a\b\u0012\u0004\u0012\u00020\"0.2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0013J/\u00100\u001a\u00020\"2\u001f\b\u0001\u0010*\u001a\u0019\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001f0\u001e¢\u0006\u0002\b2H§@¢\u0006\u0002\u00103J\"\u00100\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010*\u001a\u00020+H§@¢\u0006\u0002\u00104J\u0018\u00105\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u000206H§@¢\u0006\u0002\u00107J\u0018\u00108\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u000209H§@¢\u0006\u0002\u0010:¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/api/discovery/DiscoveryApi;", "", "getAnalyticsIds", "Lcom/robinhood/models/api/ApiAnalyticsIds;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowedLists", "Lcom/robinhood/models/api/DefaultCuratedListPaginatedResults;", "Lcom/robinhood/models/api/ApiCuratedList;", "cursor", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLists", "Lcom/robinhood/models/PaginatedResult;", "ownerType", "objectId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getList", "listId", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListItems", "Lcom/robinhood/models/api/CuratedListItemsPaginatedResult;", "Lcom/robinhood/models/api/ApiCuratedListItem;", "loadAllAttributes", "", "sortOrder", "sortDirection", "localMidnight", "(Ljava/util/UUID;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserListItems", "", "", "Lcom/robinhood/models/api/ApiUserListItem;", "updateListItemOrder", "", "snapshot", "Lcom/robinhood/models/api/CuratedListItemReorderRequest;", "(Lcom/robinhood/models/api/CuratedListItemReorderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "followList", "userId", "(Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createList", "request", "Lcom/robinhood/models/api/CreateOrUpdateListRequest;", "(Lcom/robinhood/models/api/CreateOrUpdateListRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unfollowList", "Lretrofit2/Response;", "deleteList", "updateList", "Lcom/robinhood/models/api/CuratedListItemOperation;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/util/UUID;Lcom/robinhood/models/api/CreateOrUpdateListRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quickAddItemToList", "Lcom/robinhood/models/api/CuratedListQuickAddRequest;", "(Lcom/robinhood/models/api/CuratedListQuickAddRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quickAddItemToOptionWatchlist", "Lcom/robinhood/models/api/OptionCuratedListQuickAddRequest;", "(Lcom/robinhood/models/api/OptionCuratedListQuickAddRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface DiscoveryApi {
    @POST("lists/")
    Object createList(@Body CreateOrUpdateListRequest createOrUpdateListRequest, Continuation<? super ApiCuratedList> continuation);

    @DELETE("lists/{listId}/")
    Object deleteList(@Path("listId") UUID uuid, @Query("owner_type") String str, Continuation<? super Response<Unit>> continuation);

    @POST("lists/{listId}/followers/{userId}/")
    Object followList(@Path("listId") UUID uuid, @Path("userId") UUID uuid2, Continuation<? super Unit> continuation);

    @GET("analytics/ids/")
    Object getAnalyticsIds(Continuation<? super ApiAnalyticsIds> continuation);

    @GET("lists/default/")
    Object getFollowedLists(@Query("cursor") String str, Continuation<? super DefaultCuratedListPaginatedResults<ApiCuratedList>> continuation);

    @GET("lists/{listId}/")
    Object getList(@Path("listId") UUID uuid, @Query("owner_type") String str, Continuation<? super ApiCuratedList> continuation);

    @GET("lists/items/")
    Object getListItems(@Query("list_id") UUID uuid, @Query("owner_type") String str, @Query("load_all_attributes") boolean z, @Query("sort_order") String str2, @Query("sort_direction") String str3, @Query("local_midnight") String str4, Continuation<? super CuratedListItemsPaginatedResult<ApiCuratedListItem>> continuation);

    @GET("lists/")
    Object getLists(@Query("owner_type") String str, @Query("cursor") String str2, @Query("object_id") UUID uuid, Continuation<? super PaginatedResult<ApiCuratedList>> continuation);

    @GET("lists/user_items/")
    Object getUserListItems(Continuation<? super Map<UUID, ? extends List<ApiUserListItem>>> continuation);

    @POST("lists/items/quick_add/")
    Object quickAddItemToList(@Body CuratedListQuickAddRequest curatedListQuickAddRequest, Continuation<? super ApiCuratedList> continuation);

    @POST("lists/items/quick_add/")
    Object quickAddItemToOptionWatchlist(@Body OptionCuratedListQuickAddRequest optionCuratedListQuickAddRequest, Continuation<? super ApiCuratedList> continuation);

    @DELETE("lists/{listId}/followers/{userId}/")
    Object unfollowList(@Path("listId") UUID uuid, @Path("userId") UUID uuid2, Continuation<? super Response<Unit>> continuation);

    @POST("lists/items/")
    Object updateList(@Body Map<UUID, List<CuratedListItemOperation>> map, Continuation<? super Unit> continuation);

    @PATCH("lists/{listId}/")
    Object updateList(@Path("listId") UUID uuid, @Body CreateOrUpdateListRequest createOrUpdateListRequest, Continuation<? super ApiCuratedList> continuation);

    @POST("lists/items/snapshot/")
    Object updateListItemOrder(@Body CuratedListItemReorderRequest curatedListItemReorderRequest, Continuation<? super Unit> continuation);

    /* compiled from: DiscoveryApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getLists$default(DiscoveryApi discoveryApi, String str, String str2, UUID uuid, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLists");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                uuid = null;
            }
            return discoveryApi.getLists(str, str2, uuid, continuation);
        }

        public static /* synthetic */ Object getListItems$default(DiscoveryApi discoveryApi, UUID uuid, String str, boolean z, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListItems");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return discoveryApi.getListItems(uuid, str, z, str2, str3, str4, continuation);
        }
    }
}
