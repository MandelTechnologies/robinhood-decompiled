package com.robinhood.librobinhood.data.store;

import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationResultDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsRequestDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsResponseDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoService;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoAcatsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAcatsStore$cryptoMigrationsEndpoint$1", m3645f = "CryptoAcatsStore.kt", m3646l = {39}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAcatsStore$cryptoMigrationsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAcatsStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends CryptoMigrationResultDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoAcatsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAcatsStore2(CryptoAcatsStore cryptoAcatsStore, Continuation<? super CryptoAcatsStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoAcatsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoAcatsStore2 cryptoAcatsStore2 = new CryptoAcatsStore2(this.this$0, continuation);
        cryptoAcatsStore2.L$0 = obj;
        return cryptoAcatsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends CryptoMigrationResultDto>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<CryptoMigrationResultDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<CryptoMigrationResultDto>> continuation) {
        return ((CryptoAcatsStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaginationCursor paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
            CryptoService cryptoService = this.this$0.cryptoService;
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            if (value == null) {
                value = "";
            }
            CryptoMigrationsRequestDto cryptoMigrationsRequestDto = new CryptoMigrationsRequestDto(value, 100);
            this.label = 1;
            obj = cryptoService.CryptoMigrations(cryptoMigrationsRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CryptoMigrationsResponseDto cryptoMigrationsResponseDto = (CryptoMigrationsResponseDto) obj;
        return new PaginatedResult(cryptoMigrationsResponseDto.getResults(), cryptoMigrationsResponseDto.getPrev().length() > 0 ? new PaginationCursor(cryptoMigrationsResponseDto.getPrev()) : null, cryptoMigrationsResponseDto.getNext().length() > 0 ? new PaginationCursor(cryptoMigrationsResponseDto.getNext()) : null);
    }
}
