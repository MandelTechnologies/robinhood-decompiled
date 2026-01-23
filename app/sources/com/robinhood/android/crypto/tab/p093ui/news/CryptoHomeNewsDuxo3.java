package com.robinhood.android.crypto.tab.p093ui.news;

import com.robinhood.models.p320db.Quote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeNewsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/news/CryptoHomeNewsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsDuxo$onStart$3$1", m3645f = "CryptoHomeNewsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeNewsDuxo3 extends ContinuationImpl7 implements Function2<CryptoHomeNewsDataState, Continuation<? super CryptoHomeNewsDataState>, Object> {
    final /* synthetic */ Iterable<Quote> $quotes;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeNewsDuxo3(Iterable<Quote> iterable, Continuation<? super CryptoHomeNewsDuxo3> continuation) {
        super(2, continuation);
        this.$quotes = iterable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeNewsDuxo3 cryptoHomeNewsDuxo3 = new CryptoHomeNewsDuxo3(this.$quotes, continuation);
        cryptoHomeNewsDuxo3.L$0 = obj;
        return cryptoHomeNewsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeNewsDataState cryptoHomeNewsDataState, Continuation<? super CryptoHomeNewsDataState> continuation) {
        return ((CryptoHomeNewsDuxo3) create(cryptoHomeNewsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoHomeNewsDataState.copy$default((CryptoHomeNewsDataState) this.L$0, null, this.$quotes, 1, null);
    }
}
