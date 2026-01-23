package com.robinhood.android.crypto.tab.p093ui.news.fragment;

import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoNewsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsDuxo$onStart$1$1", m3645f = "CryptoNewsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoNewsDuxo2 extends ContinuationImpl7 implements Function2<CryptoNewsDataState, Continuation<? super CryptoNewsDataState>, Object> {
    final /* synthetic */ List<NewsFeedElement> $newsFeedElements;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoNewsDuxo2(List<NewsFeedElement> list, Continuation<? super CryptoNewsDuxo2> continuation) {
        super(2, continuation);
        this.$newsFeedElements = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoNewsDuxo2 cryptoNewsDuxo2 = new CryptoNewsDuxo2(this.$newsFeedElements, continuation);
        cryptoNewsDuxo2.L$0 = obj;
        return cryptoNewsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoNewsDataState cryptoNewsDataState, Continuation<? super CryptoNewsDataState> continuation) {
        return ((CryptoNewsDuxo2) create(cryptoNewsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoNewsDataState.copy$default((CryptoNewsDataState) this.L$0, this.$newsFeedElements, null, 2, null);
    }
}
