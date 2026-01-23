package com.robinhood.api;

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
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "T", "P", Constants.RequestParamsKeys.PLATFORM_KEY, "c", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.api.RealPaginatedEndpoint$fetchAllPages$networkCall$1", m3645f = "PaginatedEndpoint.kt", m3646l = {165}, m3647m = "invokeSuspend")
/* loaded from: classes16.dex */
final class RealPaginatedEndpoint$fetchAllPages$networkCall$1<P, T> extends ContinuationImpl7 implements Function3<P, PaginationCursor, Continuation<? super PaginatedResult<? extends T>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RealPaginatedEndpoint<P, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealPaginatedEndpoint$fetchAllPages$networkCall$1(RealPaginatedEndpoint<P, T> realPaginatedEndpoint, Continuation<? super RealPaginatedEndpoint$fetchAllPages$networkCall$1> continuation) {
        super(3, continuation);
        this.this$0 = realPaginatedEndpoint;
    }

    public final Object invoke(P p, PaginationCursor paginationCursor, Continuation<? super PaginatedResult<? extends T>> continuation) {
        RealPaginatedEndpoint$fetchAllPages$networkCall$1 realPaginatedEndpoint$fetchAllPages$networkCall$1 = new RealPaginatedEndpoint$fetchAllPages$networkCall$1(this.this$0, continuation);
        realPaginatedEndpoint$fetchAllPages$networkCall$1.L$0 = p;
        realPaginatedEndpoint$fetchAllPages$networkCall$1.L$1 = paginationCursor;
        return realPaginatedEndpoint$fetchAllPages$networkCall$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, PaginationCursor paginationCursor, Object obj2) {
        return invoke((RealPaginatedEndpoint$fetchAllPages$networkCall$1<P, T>) obj, paginationCursor, (Continuation) obj2);
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
        Object obj2 = this.L$0;
        PaginationCursor paginationCursor = (PaginationCursor) this.L$1;
        Endpoint<Tuples2<P, PaginationCursor>, PaginatedResult<T>> endpoint = this.this$0.getEndpoint();
        Tuples2 tuples2M3642to = Tuples4.m3642to(obj2, paginationCursor);
        this.L$0 = null;
        this.label = 1;
        Object objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, tuples2M3642to, null, this, 2, null);
        return objFetch$default == coroutine_suspended ? coroutine_suspended : objFetch$default;
    }
}
