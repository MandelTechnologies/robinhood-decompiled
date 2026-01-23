package com.robinhood.android.idl.common.pagination;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
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
/* compiled from: IdlPaginatedResponseEndpoint.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0012\b\u0000\u0010\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, m3636d2 = {"<anonymous>", "T", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "P", Constants.RequestParamsKeys.PLATFORM_KEY, "c", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.idl.common.pagination.RealIdlPaginatedResponseEndpoint$forceFetchAllPages$networkCall$1", m3645f = "IdlPaginatedResponseEndpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.idl.common.pagination.RealIdlPaginatedResponseEndpoint$forceFetchAllPages$networkCall$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IdlPaginatedResponseEndpoint5<P, T> extends ContinuationImpl7 implements Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ IdlPaginatedResponseEndpoint3<P, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdlPaginatedResponseEndpoint5(IdlPaginatedResponseEndpoint3<P, T> idlPaginatedResponseEndpoint3, Continuation<? super IdlPaginatedResponseEndpoint5> continuation) {
        super(3, continuation);
        this.this$0 = idlPaginatedResponseEndpoint3;
    }

    public final Object invoke(P p, IdlPaginationCursor idlPaginationCursor, Continuation<? super T> continuation) {
        IdlPaginatedResponseEndpoint5 idlPaginatedResponseEndpoint5 = new IdlPaginatedResponseEndpoint5(this.this$0, continuation);
        idlPaginatedResponseEndpoint5.L$0 = p;
        idlPaginatedResponseEndpoint5.L$1 = idlPaginationCursor;
        return idlPaginatedResponseEndpoint5.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, IdlPaginationCursor idlPaginationCursor, Object obj2) {
        return invoke((IdlPaginatedResponseEndpoint5<P, T>) obj, idlPaginationCursor, (Continuation) obj2);
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
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) this.L$1;
        Endpoint<Tuples2<P, IdlPaginationCursor>, T> endpoint = this.this$0.getEndpoint();
        Tuples2 tuples2M3642to = Tuples4.m3642to(obj2, idlPaginationCursor);
        this.L$0 = null;
        this.label = 1;
        Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
        return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
    }
}
