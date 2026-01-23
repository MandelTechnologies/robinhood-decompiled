package com.robinhood.api.search;

import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.search.ApiSearchResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: SearchBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/api/search/SearchBonfireApi;", "", "search", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/search/ApiSearchResult;", "query", "", "contentTypes", "Lcom/robinhood/models/CommaSeparatedList;", "queryContext", "(Ljava/lang/String;Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retirementSearch", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jointAccountsSearch", "lib-api-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface SearchBonfireApi {
    @GET("joint_accounts/search")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {JointAccountsRegionGate.class})
    Object jointAccountsSearch(@Query("query") String str, Continuation<? super PaginatedResult<ApiSearchResult>> continuation);

    @GET("retirement/search")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object retirementSearch(@Query("query") String str, Continuation<? super PaginatedResult<ApiSearchResult>> continuation);

    @GET("search/")
    Object search(@Query("query") String str, @Query("content_types") CommaSeparatedList<String> commaSeparatedList, @Query("query_context") String str2, Continuation<? super PaginatedResult<ApiSearchResult>> continuation);
}
