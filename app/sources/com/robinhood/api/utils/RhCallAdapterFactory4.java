package com.robinhood.api.utils;

import com.robinhood.api.utils.RhCallAdapterFactory2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.KotlinExtensions;
import retrofit2.Response;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: RhCallAdapterFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.api.utils.CoroutinesAdapter$ScopedCall$execute$1", m3645f = "RhCallAdapterFactory.kt", m3646l = {117}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.api.utils.CoroutinesAdapter$ScopedCall$execute$1, reason: use source file name */
/* loaded from: classes16.dex */
final class RhCallAdapterFactory4<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<R>>, Object> {
    int label;
    final /* synthetic */ RhCallAdapterFactory2.ScopedCall<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhCallAdapterFactory4(RhCallAdapterFactory2.ScopedCall<R> scopedCall, Continuation<? super RhCallAdapterFactory4> continuation) {
        super(2, continuation);
        this.this$0 = scopedCall;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhCallAdapterFactory4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<R>> continuation) {
        return ((RhCallAdapterFactory4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RhCallAdapterFactory2.ScopedCall<R> scopedCall = this.this$0;
        this.label = 1;
        Object objAwaitResponse = KotlinExtensions.awaitResponse(scopedCall, this);
        return objAwaitResponse == coroutine_suspended ? coroutine_suspended : objAwaitResponse;
    }
}
