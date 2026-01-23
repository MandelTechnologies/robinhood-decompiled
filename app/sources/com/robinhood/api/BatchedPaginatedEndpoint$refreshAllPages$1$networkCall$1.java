package com.robinhood.api;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [P, T] */
/* compiled from: PaginatedEndpoint.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "T", "P", Constants.RequestParamsKeys.PLATFORM_KEY, "", "c", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.api.BatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1", m3645f = "PaginatedEndpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes16.dex */
final class BatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1<P, T> extends ContinuationImpl7 implements Function3<Iterable<? extends P>, PaginationCursor, Continuation<? super PaginatedResult<? extends T>>, Object> {
    final /* synthetic */ boolean $force;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BatchedPaginatedEndpoint<P, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1(boolean z, BatchedPaginatedEndpoint<P, T> batchedPaginatedEndpoint, Continuation<? super BatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1> continuation) {
        super(3, continuation);
        this.$force = z;
        this.this$0 = batchedPaginatedEndpoint;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Iterable<? extends P> iterable, PaginationCursor paginationCursor, Continuation<? super PaginatedResult<? extends T>> continuation) {
        BatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1 batchedPaginatedEndpoint$refreshAllPages$1$networkCall$1 = new BatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1(this.$force, this.this$0, continuation);
        batchedPaginatedEndpoint$refreshAllPages$1$networkCall$1.L$0 = iterable;
        batchedPaginatedEndpoint$refreshAllPages$1$networkCall$1.L$1 = paginationCursor;
        return batchedPaginatedEndpoint$refreshAllPages$1$networkCall$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r13 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r13 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (PaginatedResult) obj;
        }
        ResultKt.throwOnFailure(obj);
        Iterable iterable = (Iterable) this.L$0;
        PaginationCursor paginationCursor = (PaginationCursor) this.L$1;
        if (this.$force) {
            Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> endpoint = this.this$0.getEndpoint();
            Tuples2 tuples2M3642to = Tuples4.m3642to(iterable, paginationCursor);
            this.L$0 = null;
            this.label = 1;
            obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
        } else {
            Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> endpoint2 = this.this$0.getEndpoint();
            Tuples2 tuples2M3642to2 = Tuples4.m3642to(iterable, paginationCursor);
            this.L$0 = null;
            this.label = 2;
            obj = Endpoint.DefaultImpls.fetch$default(endpoint2, tuples2M3642to2, null, this, 2, null);
        }
        return coroutine_suspended;
    }
}
