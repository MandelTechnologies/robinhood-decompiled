package com.robinhood.librobinhood.data.store;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiQuote;
import com.robinhood.models.p355ui.Historical;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: QuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiQuote;", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteStore$getQuotes$1", m3645f = "QuoteStore.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$getQuotes$1, reason: use source file name */
/* loaded from: classes13.dex */
final class QuoteStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiQuote>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuoteStore6(QuoteStore quoteStore, Continuation<? super QuoteStore6> continuation) {
        super(2, continuation);
        this.this$0 = quoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuoteStore6 quoteStore6 = new QuoteStore6(this.this$0, continuation);
        quoteStore6.L$0 = obj;
        return quoteStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiQuote>> continuation) {
        return invoke2((Tuples2<? extends Iterable<UUID>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiQuote>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<UUID>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiQuote>> continuation) {
        return ((QuoteStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        Iterable iterable = (Iterable) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        EquitiesBrokeback equitiesBrokeback = this.this$0.equitiesBrokeback;
        String serverValue = Historical.Bounds.ADT_24_5.getServerValue();
        Boolean boolBoxBoolean = boxing.boxBoolean(true);
        CommaSeparatedList<UUID> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(iterable);
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object quotesByInstrumentIds = equitiesBrokeback.getQuotesByInstrumentIds(serverValue, boolBoxBoolean, commaSeparatedList, value, this);
        return quotesByInstrumentIds == coroutine_suspended ? coroutine_suspended : quotesByInstrumentIds;
    }
}
