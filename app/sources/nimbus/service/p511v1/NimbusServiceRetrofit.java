package nimbus.service.p511v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: NimbusServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJB\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0002\u0010\u000fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J4\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lnimbus/service/v1/NimbusServiceRetrofit;", "", "GetAssetTransferDetails", "Lretrofit2/Response;", "Lnimbus/service/v1/GetAssetTransferDetailsResponseDto;", "headers", "", "", "id", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAssetTransferList", "Lnimbus/service/v1/GetAssetTransferListResponseDto;", "cursor", "page_size", "", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateAssetTransfer", "Lnimbus/service/v1/CreateAssetTransferResponseDto;", CarResultComposable2.BODY, "Lnimbus/service/v1/CreateAssetTransferRequestDto;", "(Ljava/util/Map;Lnimbus/service/v1/CreateAssetTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreSubmissionChecks", "Lnimbus/service/v1/PreSubmissionChecksResponseDto;", "Lnimbus/service/v1/PreSubmissionChecksRequestDto;", "(Ljava/util/Map;Lnimbus/service/v1/PreSubmissionChecksRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelAssetTransfer", "Lnimbus/service/v1/CancelAssetTransferResponseDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes11.dex */
public interface NimbusServiceRetrofit {
    @PATCH("nimbus/v1/asset_transfers/{id}/cancel")
    Object CancelAssetTransfer(@HeaderMap Map<String, String> map, @Path("id") @IdlField(protoType = "string") String str, Continuation<Response<CancelAssetTransferResponseDto>> continuation);

    @POST("nimbus/v1/asset_transfers")
    Object CreateAssetTransfer(@HeaderMap Map<String, String> map, @Body CreateAssetTransferRequestDto createAssetTransferRequestDto, Continuation<Response<CreateAssetTransferResponseDto>> continuation);

    @GET("nimbus/v1/asset_transfers/{id}")
    Object GetAssetTransferDetails(@HeaderMap Map<String, String> map, @Path("id") @IdlField(protoType = "string") String str, Continuation<Response<GetAssetTransferDetailsResponseDto>> continuation);

    @GET("nimbus/v1/asset_transfers")
    Object GetAssetTransferList(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("cursor") String str, @IdlField(protoType = "int32") @Query("pageSize") Integer num, Continuation<Response<GetAssetTransferListResponseDto>> continuation);

    @POST("nimbus/v1/pre_submission_checks")
    Object PreSubmissionChecks(@HeaderMap Map<String, String> map, @Body PreSubmissionChecksRequestDto preSubmissionChecksRequestDto, Continuation<Response<PreSubmissionChecksResponseDto>> continuation);
}
