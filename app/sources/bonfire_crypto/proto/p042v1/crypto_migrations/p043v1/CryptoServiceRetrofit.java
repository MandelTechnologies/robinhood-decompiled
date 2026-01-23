package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: CryptoServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JD\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoServiceRetrofit;", "", "", "", "headers", "cursor", "", "limit", "Lretrofit2/Response;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsResponseDto;", "CryptoMigrations", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migration_id", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "CryptoMigrationsDetail", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface CryptoServiceRetrofit {
    @GET("crypto/crypto_migrations")
    Object CryptoMigrations(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("cursor") String str, @IdlField(protoType = "int32") @Query("limit") Integer num, Continuation<Response<CryptoMigrationsResponseDto>> continuation);

    @GET("crypto/crypto_migrations/detail/{migration_id}")
    Object CryptoMigrationsDetail(@HeaderMap Map<String, String> map, @Path("migration_id") @IdlField(protoType = "string") String str, Continuation<Response<CryptoMigrationsDetailResponseDto>> continuation);
}
