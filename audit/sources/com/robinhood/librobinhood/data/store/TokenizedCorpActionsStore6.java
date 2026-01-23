package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.crypto.dao.TokenizedSplitPaymentDao;
import com.robinhood.models.crypto.p314db.tokenized.TokenizedSplitPayment;
import com.robinhood.shared.crypto.utils.UpdatedAtGteUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import nummus.p512v1.CorpActionSplitPaymentDto;
import nummus.p512v1.CorpActionSplitPaymentListRequestDto;
import nummus.p512v1.CorpActionSplitPaymentListResponseDto;
import nummus.p512v1.RestNummusService;
import p479j$.time.Instant;

/* compiled from: TokenizedCorpActionsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lnummus/v1/CorpActionSplitPaymentDto;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$splitPaymentsEndpoint$1", m3645f = "TokenizedCorpActionsStore.kt", m3646l = {52, 60}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TokenizedCorpActionsStore$splitPaymentsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TokenizedCorpActionsStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends CorpActionSplitPaymentDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TokenizedCorpActionsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TokenizedCorpActionsStore6(TokenizedCorpActionsStore tokenizedCorpActionsStore, Continuation<? super TokenizedCorpActionsStore6> continuation) {
        super(2, continuation);
        this.this$0 = tokenizedCorpActionsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenizedCorpActionsStore6 tokenizedCorpActionsStore6 = new TokenizedCorpActionsStore6(this.this$0, continuation);
        tokenizedCorpActionsStore6.L$0 = obj;
        return tokenizedCorpActionsStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends CorpActionSplitPaymentDto>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<CorpActionSplitPaymentDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<CorpActionSplitPaymentDto>> continuation) {
        return ((TokenizedCorpActionsStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r12 == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.robinhood.models.PaginationCursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.robinhood.models.PaginationCursor] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.robinhood.models.PaginationCursor] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Instant instant;
        ?? r1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception unused) {
            instant = null;
            r1 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ?? r12 = (PaginationCursor) ((Tuples2) this.L$0).component2();
            TokenizedSplitPaymentDao tokenizedSplitPaymentDao = this.this$0.splitPaymentDao;
            this.L$0 = r12;
            this.label = 1;
            obj = tokenizedSplitPaymentDao.getLatestUpdatedAt(this);
            i = r12;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CorpActionSplitPaymentListResponseDto corpActionSplitPaymentListResponseDto = (CorpActionSplitPaymentListResponseDto) obj;
                return new PaginatedResult(corpActionSplitPaymentListResponseDto.getResults(), corpActionSplitPaymentListResponseDto.getPrevious().length() > 0 ? new PaginationCursor(corpActionSplitPaymentListResponseDto.getPrevious()) : null, corpActionSplitPaymentListResponseDto.getNext().length() > 0 ? new PaginationCursor(corpActionSplitPaymentListResponseDto.getNext()) : null);
            }
            ?? r13 = (PaginationCursor) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = r13;
        }
        instant = (Instant) obj;
        r1 = i;
        Instant updatedAtGte = UpdatedAtGteUtil.getUpdatedAtGte(instant, this.this$0.getLastUpdatedAtManager().getLastUpdatedAt(TokenizedSplitPayment.class));
        RestNummusService restNummusService = this.this$0.nummusService;
        String value = r1 != 0 ? r1.getValue() : null;
        if (value == null) {
            value = "";
        }
        CorpActionSplitPaymentListRequestDto corpActionSplitPaymentListRequestDto = new CorpActionSplitPaymentListRequestDto(updatedAtGte, value, null, 4, null);
        this.L$0 = null;
        this.label = 2;
        obj = restNummusService.CorpActionSplitPaymentList(corpActionSplitPaymentListRequestDto, this);
    }
}
