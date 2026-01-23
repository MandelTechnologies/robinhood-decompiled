package wormhole.service.p554v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PNLServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ\u0084\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0017JJ\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00102\b\b\u0001\u0010\u001b\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u001cJv\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u001f\u001a\u00020 2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0002\u0010!J@\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010$\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010%¨\u0006&"}, m3636d2 = {"Lwormhole/service/v1/PNLServiceRetrofit;", "", "GetSupportedAssetClasses", "Lretrofit2/Response;", "Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "headers", "", "", "account_number", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossItems", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "span", "Lwormhole/service/v1/SpanDto;", "asset_classes", "", "Lwormhole/service/v1/AssetClassDto;", "sort_type", "Lwormhole/service/v1/SortTypeDto;", "sort_direction", "Lwormhole/service/v1/SortDirectionDto;", "symbol", "next_cursor", "(Ljava/util/Map;Ljava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossItem", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;", "asset_class", "id", "(Ljava/util/Map;Lwormhole/service/v1/AssetClassDto;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossGroups", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "group_type", "Lwormhole/service/v1/GroupTypeDto;", "(Ljava/util/Map;Lwormhole/service/v1/GroupTypeDto;Ljava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedPerformanceSummary", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "instrument_id", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes28.dex */
public interface PNLServiceRetrofit {
    @GET("wormhole/pnl/v1/realized-gain-loss/groups/{group_type}")
    Object GetRealizedGainLossGroups(@HeaderMap Map<String, String> map, @Path("group_type") GroupTypeDto groupTypeDto, @IdlField(protoType = "string") @Query("accountNumber") String str, @Query("span") SpanDto spanDto, @Query("assetClasses") List<AssetClassDto> list, @Query("sortType") SortTypeDto sortTypeDto, @Query("sortDirection") SortDirectionDto sortDirectionDto, Continuation<Response<GetRealizedGainLossGroupsResponseDto>> continuation);

    @GET("wormhole/pnl/v1/realized-gain-loss/{asset_class}/{id}")
    Object GetRealizedGainLossItem(@HeaderMap Map<String, String> map, @Path("asset_class") AssetClassDto assetClassDto, @Path("id") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("accountNumber") String str2, Continuation<Response<GetRealizedGainLossItemResponseDto>> continuation);

    @GET("wormhole/pnl/v1/realized-gain-loss")
    Object GetRealizedGainLossItems(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, @Query("span") SpanDto spanDto, @Query("assetClasses") List<AssetClassDto> list, @Query("sortType") SortTypeDto sortTypeDto, @Query("sortDirection") SortDirectionDto sortDirectionDto, @IdlField(protoType = "string") @Query("symbol") String str2, @IdlField(protoType = "string") @Query("nextCursor") String str3, Continuation<Response<GetRealizedGainLossItemsResponseDto>> continuation);

    @GET("wormhole/pnl/v1/realized-performance-summary/{instrument_id}")
    Object GetRealizedPerformanceSummary(@HeaderMap Map<String, String> map, @Path("instrument_id") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("accountNumber") String str2, Continuation<Response<GetRealizedPerformanceSummaryResponseDto>> continuation);

    @GET("wormhole/pnl/v1/supported-asset-classes/{account_number}")
    Object GetSupportedAssetClasses(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, Continuation<Response<GetSupportedAssetClassesResponseDto>> continuation);
}
