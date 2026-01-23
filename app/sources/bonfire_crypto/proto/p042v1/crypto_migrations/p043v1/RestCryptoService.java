package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestCryptoService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/RestCryptoService;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoServiceRetrofit;", "retrofit", "<init>", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoServiceRetrofit;)V", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsRequestDto;", "request", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsResponseDto;", "CryptoMigrations", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailRequestDto;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "CryptoMigrationsDetail", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoServiceRetrofit;", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestCryptoService implements CryptoService {
    private final CryptoServiceRetrofit retrofit;

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {20}, m3647m = "CryptoMigrations")
    /* renamed from: bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService$CryptoMigrations$1 */
    static final class C45341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45341(Continuation<? super C45341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.CryptoMigrations((CryptoMigrationsRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {26}, m3647m = "CryptoMigrations")
    /* renamed from: bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService$CryptoMigrations$2 */
    static final class C45352 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45352(Continuation<? super C45352> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.CryptoMigrations((Request<CryptoMigrationsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {37}, m3647m = "CryptoMigrationsDetail")
    /* renamed from: bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService$CryptoMigrationsDetail$1 */
    static final class C45361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45361(Continuation<? super C45361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.CryptoMigrationsDetail((CryptoMigrationsDetailRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {43}, m3647m = "CryptoMigrationsDetail")
    /* renamed from: bonfire_crypto.proto.v1.crypto_migrations.v1.RestCryptoService$CryptoMigrationsDetail$2 */
    static final class C45372 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45372(Continuation<? super C45372> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.CryptoMigrationsDetail((Request<CryptoMigrationsDetailRequestDto>) null, this);
        }
    }

    public RestCryptoService(CryptoServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CryptoMigrations(CryptoMigrationsRequestDto cryptoMigrationsRequestDto, Continuation<? super CryptoMigrationsResponseDto> continuation) {
        C45341 c45341;
        if (continuation instanceof C45341) {
            c45341 = (C45341) continuation;
            int i = c45341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45341.label = i - Integer.MIN_VALUE;
            } else {
                c45341 = new C45341(continuation);
            }
        }
        Object objCryptoMigrations = c45341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCryptoMigrations);
            Request<CryptoMigrationsRequestDto> request = new Request<>(cryptoMigrationsRequestDto, null, 2, null);
            c45341.label = 1;
            objCryptoMigrations = CryptoMigrations(request, c45341);
            if (objCryptoMigrations == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCryptoMigrations);
        }
        return ((Response) objCryptoMigrations).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CryptoMigrations(Request<CryptoMigrationsRequestDto> request, Continuation<? super Response<CryptoMigrationsResponseDto>> continuation) {
        C45352 c45352;
        if (continuation instanceof C45352) {
            c45352 = (C45352) continuation;
            int i = c45352.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45352.label = i - Integer.MIN_VALUE;
            } else {
                c45352 = new C45352(continuation);
            }
        }
        Object objCryptoMigrations = c45352.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45352.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCryptoMigrations);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            Integer numBoxInt = request.getData().getLimit() != 0 ? boxing.boxInt(request.getData().getLimit()) : null;
            c45352.label = 1;
            objCryptoMigrations = cryptoServiceRetrofit.CryptoMigrations(metadata, cursor, numBoxInt, c45352);
            if (objCryptoMigrations == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCryptoMigrations);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCryptoMigrations);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CryptoMigrationsDetail(CryptoMigrationsDetailRequestDto cryptoMigrationsDetailRequestDto, Continuation<? super CryptoMigrationsDetailResponseDto> continuation) {
        C45361 c45361;
        if (continuation instanceof C45361) {
            c45361 = (C45361) continuation;
            int i = c45361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45361.label = i - Integer.MIN_VALUE;
            } else {
                c45361 = new C45361(continuation);
            }
        }
        Object objCryptoMigrationsDetail = c45361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCryptoMigrationsDetail);
            Request<CryptoMigrationsDetailRequestDto> request = new Request<>(cryptoMigrationsDetailRequestDto, null, 2, null);
            c45361.label = 1;
            objCryptoMigrationsDetail = CryptoMigrationsDetail(request, c45361);
            if (objCryptoMigrationsDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCryptoMigrationsDetail);
        }
        return ((Response) objCryptoMigrationsDetail).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CryptoMigrationsDetail(Request<CryptoMigrationsDetailRequestDto> request, Continuation<? super Response<CryptoMigrationsDetailResponseDto>> continuation) {
        C45372 c45372;
        if (continuation instanceof C45372) {
            c45372 = (C45372) continuation;
            int i = c45372.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c45372.label = i - Integer.MIN_VALUE;
            } else {
                c45372 = new C45372(continuation);
            }
        }
        Object objCryptoMigrationsDetail = c45372.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c45372.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCryptoMigrationsDetail);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String migration_id = request.getData().getMigration_id();
            c45372.label = 1;
            objCryptoMigrationsDetail = cryptoServiceRetrofit.CryptoMigrationsDetail(metadata, migration_id, c45372);
            if (objCryptoMigrationsDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCryptoMigrationsDetail);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCryptoMigrationsDetail);
    }
}
