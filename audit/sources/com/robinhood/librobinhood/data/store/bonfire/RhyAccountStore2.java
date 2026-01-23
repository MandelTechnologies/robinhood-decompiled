package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.bonfire.ApiRhyAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiRhyAccount;", "it", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$endpoint$1", m3645f = "RhyAccountStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$endpoint$1, reason: use source file name */
/* loaded from: classes20.dex */
final class RhyAccountStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiRhyAccount>>, Object> {
    final /* synthetic */ RhyBonfireApi $bonfireApi;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyAccountStore2(RhyBonfireApi rhyBonfireApi, Continuation<? super RhyAccountStore2> continuation) {
        super(2, continuation);
        this.$bonfireApi = rhyBonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyAccountStore2(this.$bonfireApi, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiRhyAccount>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiRhyAccount>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiRhyAccount>> continuation) {
        return ((RhyAccountStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RhyBonfireApi rhyBonfireApi = this.$bonfireApi;
        this.label = 1;
        Object rhyAccounts = rhyBonfireApi.getRhyAccounts(this);
        return rhyAccounts == coroutine_suspended ? coroutine_suspended : rhyAccounts;
    }
}
