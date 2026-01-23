package com.salesforce.android.smi.common.internal.util;

import com.salesforce.android.smi.common.api.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Throttle.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.common.internal.util.Throttle$async$2$1$deferred$1", m3645f = "Throttle.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.common.internal.util.Throttle$async$2$1$deferred$1, reason: use source file name */
/* loaded from: classes12.dex */
final class Throttle2<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends R>>, Object> {
    final /* synthetic */ T $param;
    int label;
    final /* synthetic */ Throttle<T, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Throttle2(Throttle<T, R> throttle, T t, Continuation<? super Throttle2> continuation) {
        super(2, continuation);
        this.this$0 = throttle;
        this.$param = t;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Throttle2(this.this$0, this.$param, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends R>> continuation) {
        return ((Throttle2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Throttle<T, R> throttle = this.this$0;
        T t = this.$param;
        this.label = 1;
        Object objThrottleExecute = throttle.throttleExecute(t, this);
        return objThrottleExecute == coroutine_suspended ? coroutine_suspended : objThrottleExecute;
    }
}
