package com.robinhood.librobinhood.data.store.phoenix;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.phoenix.ApiUnifiedAccountV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UnifiedAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/phoenix/ApiUnifiedAccountV2;", "it", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$unifiedAccountEndpoint$1", m3645f = "UnifiedAccountStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$unifiedAccountEndpoint$1, reason: use source file name */
/* loaded from: classes20.dex */
final class UnifiedAccountStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiUnifiedAccountV2>>, Object> {
    int label;
    final /* synthetic */ UnifiedAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAccountStore2(UnifiedAccountStore unifiedAccountStore, Continuation<? super UnifiedAccountStore2> continuation) {
        super(2, continuation);
        this.this$0 = unifiedAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedAccountStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiUnifiedAccountV2>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiUnifiedAccountV2>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiUnifiedAccountV2>> continuation) {
        return ((UnifiedAccountStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BonfireApi bonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object unifiedAccounts = bonfireApi.getUnifiedAccounts(this);
        return unifiedAccounts == coroutine_suspended ? coroutine_suspended : unifiedAccounts;
    }
}
