package billy_mays.service.p023v1;

import bff_money_movement.service.p019v1.TransferAccountTypeDto;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

/* compiled from: BillyMaysServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jt\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lbilly_mays/service/v1/BillyMaysServiceRetrofit;", "", "", "", "headers", "source|id", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "source|type", "source|access_token", "sink|id", "sink|type", "sink|access_token", "Lretrofit2/Response;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesResponseDto;", "GetGoldEarningsFeatures", "(Ljava/util/Map;Ljava/lang/String;Lbff_money_movement/service/v1/TransferAccountTypeDto;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/TransferAccountTypeDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface BillyMaysServiceRetrofit {
    @GET("billy-mays/an-incredible-offer/gold-earnings-features")
    Object GetGoldEarningsFeatures(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("source.id") String str, @Query("source.type") TransferAccountTypeDto transferAccountTypeDto, @IdlField(protoType = "string") @Query("source.accessToken") String str2, @IdlField(protoType = "string") @Query("sink.id") String str3, @Query("sink.type") TransferAccountTypeDto transferAccountTypeDto2, @IdlField(protoType = "string") @Query("sink.accessToken") String str4, Continuation<Response<GetGoldEarningsFeaturesResponseDto>> continuation);
}
