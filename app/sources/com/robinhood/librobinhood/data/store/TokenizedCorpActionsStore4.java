package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.crypto.p314db.tokenized.TokenizedDividend;
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
import nummus.p512v1.CorpActionCashDividendsDto;
import nummus.p512v1.CorpActionCashDividendsPaymentDto;
import nummus.p512v1.CorpActionPaymentStateDto;
import p479j$.time.Instant;

/* compiled from: TokenizedCorpActionsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginated", "Lcom/robinhood/models/PaginatedResult;", "Lnummus/v1/CorpActionCashDividendsPaymentDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$dividendsPaymentsEndpoint$2", m3645f = "TokenizedCorpActionsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$dividendsPaymentsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class TokenizedCorpActionsStore4 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends CorpActionCashDividendsPaymentDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TokenizedCorpActionsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TokenizedCorpActionsStore4(TokenizedCorpActionsStore tokenizedCorpActionsStore, Continuation<? super TokenizedCorpActionsStore4> continuation) {
        super(2, continuation);
        this.this$0 = tokenizedCorpActionsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenizedCorpActionsStore4 tokenizedCorpActionsStore4 = new TokenizedCorpActionsStore4(this.this$0, continuation);
        tokenizedCorpActionsStore4.L$0 = obj;
        return tokenizedCorpActionsStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<CorpActionCashDividendsPaymentDto> paginatedResult, Continuation<? super Unit> continuation) {
        return ((TokenizedCorpActionsStore4) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends CorpActionCashDividendsPaymentDto> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<CorpActionCashDividendsPaymentDto>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        List<CorpActionCashDividendsPaymentDto> results = paginatedResult.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        for (CorpActionCashDividendsPaymentDto corpActionCashDividendsPaymentDto : results) {
            UUID uuid = StringsKt.toUuid(corpActionCashDividendsPaymentDto.getId());
            CorpActionPaymentStateDto corp_action_payment_state = corpActionCashDividendsPaymentDto.getCorp_action_payment_state();
            CorpActionCashDividendsDto dividends = corpActionCashDividendsPaymentDto.getDividends();
            if (dividends == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String currency_pair_id = dividends.getCurrency_pair_id();
            if (currency_pair_id == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            UUID uuid2 = StringsKt.toUuid(currency_pair_id);
            Instant created_at = corpActionCashDividendsPaymentDto.getCreated_at();
            if (created_at == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Instant updated_at = corpActionCashDividendsPaymentDto.getUpdated_at();
            if (updated_at == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList.add(new TokenizedDividend(uuid, corp_action_payment_state, corpActionCashDividendsPaymentDto, uuid2, created_at, updated_at));
        }
        this.this$0.dividendDao.insert((Iterable) arrayList);
        if (paginatedResult.getNext() == null) {
            LastUpdatedAtManager.saveLastUpdatedAt$default(this.this$0.getLastUpdatedAtManager(), TokenizedDividend.class, 0L, 2, null);
        }
        return Unit.INSTANCE;
    }
}
