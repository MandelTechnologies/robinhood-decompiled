package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMarginEdit;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.util.LastUpdatedAtManager;
import crypto_perpetuals.service.p440v1.ListMarginEditsRequestDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: PerpetualMarginEditHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Lcrypto_perpetuals/service/v1/ListMarginEditsRequestDto;", "Lcom/robinhood/models/PaginationCursor;", "response", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualMarginEdit;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$paginatedMarginEditEndpoint$2", m3645f = "PerpetualMarginEditHistoryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$paginatedMarginEditEndpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualMarginEditHistoryStore7 extends ContinuationImpl7 implements Function3<Tuples2<? extends ListMarginEditsRequestDto, ? extends PaginationCursor>, PaginatedResult<? extends PerpetualMarginEdit>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualMarginEditHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualMarginEditHistoryStore7(PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, Continuation<? super PerpetualMarginEditHistoryStore7> continuation) {
        super(3, continuation);
        this.this$0 = perpetualMarginEditHistoryStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ListMarginEditsRequestDto, ? extends PaginationCursor> tuples2, PaginatedResult<? extends PerpetualMarginEdit> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ListMarginEditsRequestDto, PaginationCursor>) tuples2, (PaginatedResult<PerpetualMarginEdit>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ListMarginEditsRequestDto, PaginationCursor> tuples2, PaginatedResult<PerpetualMarginEdit> paginatedResult, Continuation<? super Unit> continuation) {
        PerpetualMarginEditHistoryStore7 perpetualMarginEditHistoryStore7 = new PerpetualMarginEditHistoryStore7(this.this$0, continuation);
        perpetualMarginEditHistoryStore7.L$0 = paginatedResult;
        return perpetualMarginEditHistoryStore7.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        if (paginatedResult.getNext() == null) {
            LastUpdatedAtManager.saveLastUpdatedAt$default(this.this$0.getLastUpdatedAtManager(), PerpetualMarginEdit.class, 0L, 2, null);
        }
        this.this$0.dao.insert((Iterable) paginatedResult.getResults());
        return Unit.INSTANCE;
    }
}
