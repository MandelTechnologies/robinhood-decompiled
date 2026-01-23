package com.robinhood.android.idl.common.pagination;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.idl.Dto3;
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
/* compiled from: IdlPaginationEndpoint.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m3636d2 = {"<anonymous>", "T", "Lcom/robinhood/idl/MessageDto;", "P", Constants.RequestParamsKeys.PLATFORM_KEY, "c", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.idl.common.pagination.RealIdlPaginatedEndpoint$refreshAllPages$networkCall$1", m3645f = "IdlPaginationEndpoint.kt", m3646l = {150, 150}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.idl.common.pagination.RealIdlPaginatedEndpoint$refreshAllPages$networkCall$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IdlPaginationEndpoint6<P, T> extends ContinuationImpl7 implements Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> {
    final /* synthetic */ boolean $force;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ IdlPaginationEndpoint3<P, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdlPaginationEndpoint6(boolean z, IdlPaginationEndpoint3<P, T> idlPaginationEndpoint3, Continuation<? super IdlPaginationEndpoint6> continuation) {
        super(3, continuation);
        this.$force = z;
        this.this$0 = idlPaginationEndpoint3;
    }

    public final Object invoke(P p, IdlPaginationCursor idlPaginationCursor, Continuation<? super T> continuation) {
        IdlPaginationEndpoint6 idlPaginationEndpoint6 = new IdlPaginationEndpoint6(this.$force, this.this$0, continuation);
        idlPaginationEndpoint6.L$0 = p;
        idlPaginationEndpoint6.L$1 = idlPaginationCursor;
        return idlPaginationEndpoint6.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, IdlPaginationCursor idlPaginationCursor, Object obj2) {
        return invoke((IdlPaginationEndpoint6<P, T>) obj, idlPaginationCursor, (Continuation) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r13 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
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
                return (Dto3) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (Dto3) obj;
        }
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.L$0;
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) this.L$1;
        if (this.$force) {
            Endpoint<Tuples2<P, IdlPaginationCursor>, T> endpoint = this.this$0.getEndpoint();
            Tuples2 tuples2M3642to = Tuples4.m3642to(obj2, idlPaginationCursor);
            this.L$0 = null;
            this.label = 1;
            obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
        } else {
            Endpoint<Tuples2<P, IdlPaginationCursor>, T> endpoint2 = this.this$0.getEndpoint();
            Tuples2 tuples2M3642to2 = Tuples4.m3642to(obj2, idlPaginationCursor);
            this.L$0 = null;
            this.label = 2;
            obj = Endpoint.DefaultImpls.fetch$default(endpoint2, tuples2M3642to2, null, this, 2, null);
        }
        return coroutine_suspended;
    }
}
