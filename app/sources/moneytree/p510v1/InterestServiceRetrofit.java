package moneytree.p510v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import p479j$.time.Instant;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: InterestServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jh\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0001\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0010\b\u0001\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH§@¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmoneytree/v1/InterestServiceRetrofit;", "", "", "", "headers", "cursor", "", "limit", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at_gte", "created_at_lte", "Lretrofit2/Response;", "Lmoneytree/v1/ListMonthlyInterestHistoryResponseDto;", "ListMonthlyInterestHistory", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Lj$/time/Instant;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payment_id", "Lmoneytree/v1/GetMonthlyInterestHistoryResponseDto;", "GetMonthlyInterestHistory", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes14.dex */
public interface InterestServiceRetrofit {
    @GET("moneytree/interest/history/{payment_id}")
    Object GetMonthlyInterestHistory(@HeaderMap Map<String, String> map, @Path("payment_id") @IdlField(protoType = "string") String str, Continuation<Response<GetMonthlyInterestHistoryResponseDto>> continuation);

    @GET("moneytree/interest/history")
    Object ListMonthlyInterestHistory(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("cursor") String str, @IdlField(protoType = "int32") @Query("limit") Integer num, @IdlField(protoType = "google.protobuf.Timestamp") @Query("createdAtGte") Instant instant, @IdlField(protoType = "google.protobuf.Timestamp") @Query("createdAtLte") Instant instant2, Continuation<Response<ListMonthlyInterestHistoryResponseDto>> continuation);
}
