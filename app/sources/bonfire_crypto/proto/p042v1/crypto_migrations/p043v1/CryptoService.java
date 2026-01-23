package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CryptoService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;", "", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsRequestDto;", "request", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsResponseDto;", "CryptoMigrations", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailRequestDto;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "CryptoMigrationsDetail", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface CryptoService {
    Object CryptoMigrations(CryptoMigrationsRequestDto cryptoMigrationsRequestDto, Continuation<? super CryptoMigrationsResponseDto> continuation);

    Object CryptoMigrationsDetail(CryptoMigrationsDetailRequestDto cryptoMigrationsDetailRequestDto, Continuation<? super CryptoMigrationsDetailResponseDto> continuation);
}
