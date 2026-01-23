package com.robinhood.librobinhood.data.store;

import com.robinhood.directipo.models.api.ApiIpoQuote;
import com.robinhood.directipo.models.api.ApiIpoQuote2;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.dao.IpoQuoteDao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/directipo/models/api/ApiIpoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteStore$getIpoQuotes$2", m3645f = "QuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$getIpoQuotes$2, reason: use source file name */
/* loaded from: classes13.dex */
final class QuoteStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiIpoQuote>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuoteStore3(QuoteStore quoteStore, Continuation<? super QuoteStore3> continuation) {
        super(2, continuation);
        this.this$0 = quoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuoteStore3 quoteStore3 = new QuoteStore3(this.this$0, continuation);
        quoteStore3.L$0 = obj;
        return quoteStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiIpoQuote> paginatedResult, Continuation<? super Unit> continuation) {
        return ((QuoteStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiIpoQuote> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiIpoQuote>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        IpoQuoteDao ipoQuoteDao = this.this$0.ipoQuoteDao;
        List<ApiIpoQuote> results = paginatedResult.getResults();
        ArrayList arrayList = new ArrayList();
        for (ApiIpoQuote apiIpoQuote : results) {
            IpoQuote dbModel = apiIpoQuote != null ? ApiIpoQuote2.toDbModel(apiIpoQuote) : null;
            if (dbModel != null) {
                arrayList.add(dbModel);
            }
        }
        ipoQuoteDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
