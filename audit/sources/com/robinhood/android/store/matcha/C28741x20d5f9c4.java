package com.robinhood.android.store.matcha;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.matcha.api.ApiMatchaTransaction;
import com.robinhood.api.matcha.MatchaApi;
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

/* compiled from: MatchaPendingTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransaction;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore$getPendingTransactionsBetweenUser$1", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$getPendingTransactionsBetweenUser$1 */
/* loaded from: classes5.dex */
final class C28741x20d5f9c4 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiMatchaTransaction>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaPendingTransactionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C28741x20d5f9c4(MatchaPendingTransactionStore matchaPendingTransactionStore, Continuation<? super C28741x20d5f9c4> continuation) {
        super(2, continuation);
        this.this$0 = matchaPendingTransactionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C28741x20d5f9c4 c28741x20d5f9c4 = new C28741x20d5f9c4(this.this$0, continuation);
        c28741x20d5f9c4.L$0 = obj;
        return c28741x20d5f9c4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiMatchaTransaction>> continuation) {
        return invoke2((Tuples2<String, PaginationCursor>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiMatchaTransaction>> continuation) {
        return ((C28741x20d5f9c4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        MatchaApi matchaApi = this.this$0.api;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object pendingTransactionsBetween = matchaApi.getPendingTransactionsBetween(str, 25, value, this);
        return pendingTransactionsBetween == coroutine_suspended ? coroutine_suspended : pendingTransactionsBetween;
    }
}
