package com.robinhood.librobinhood.data.store;

import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationResultDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.MigrationStateDto;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.crypto.p314db.CryptoMigrationResult;
import com.robinhood.util.LastUpdatedAtManager;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: CryptoAcatsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginated", "Lcom/robinhood/models/PaginatedResult;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAcatsStore$cryptoMigrationsEndpoint$2", m3645f = "CryptoAcatsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAcatsStore$cryptoMigrationsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAcatsStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends CryptoMigrationResultDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoAcatsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAcatsStore3(CryptoAcatsStore cryptoAcatsStore, Continuation<? super CryptoAcatsStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoAcatsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoAcatsStore3 cryptoAcatsStore3 = new CryptoAcatsStore3(this.this$0, continuation);
        cryptoAcatsStore3.L$0 = obj;
        return cryptoAcatsStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<CryptoMigrationResultDto> paginatedResult, Continuation<? super Unit> continuation) {
        return ((CryptoAcatsStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends CryptoMigrationResultDto> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<CryptoMigrationResultDto>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        if (!paginatedResult.getResults().isEmpty()) {
            List<CryptoMigrationResultDto> results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            for (CryptoMigrationResultDto cryptoMigrationResultDto : results) {
                UUID uuid = StringsKt.toUuid(cryptoMigrationResultDto.getId());
                MigrationStateDto state = cryptoMigrationResultDto.getState();
                if (state == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Instant started_at = cryptoMigrationResultDto.getStarted_at();
                if (started_at == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                arrayList.add(new CryptoMigrationResult(uuid, state, cryptoMigrationResultDto, started_at));
            }
            this.this$0.cryptoMigrationResultDao.insert((Iterable) arrayList);
            if (paginatedResult.getNext() == null) {
                LastUpdatedAtManager.saveLastUpdatedAt$default(this.this$0.getLastUpdatedAtManager(), CryptoMigrationResult.class, 0L, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
