package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiQuote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: QuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteStore$getQuote$2", m3645f = "QuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$getQuote$2, reason: use source file name */
/* loaded from: classes13.dex */
final class QuoteStore5 extends ContinuationImpl7 implements Function2<ApiQuote, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuoteStore5(QuoteStore quoteStore, Continuation<? super QuoteStore5> continuation) {
        super(2, continuation);
        this.this$0 = quoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuoteStore5 quoteStore5 = new QuoteStore5(this.this$0, continuation);
        quoteStore5.L$0 = obj;
        return quoteStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiQuote apiQuote, Continuation<? super Unit> continuation) {
        return ((QuoteStore5) create(apiQuote, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.quoteDao.insert((ApiQuote) this.L$0);
        return Unit.INSTANCE;
    }
}
