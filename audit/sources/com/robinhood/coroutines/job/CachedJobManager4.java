package com.robinhood.coroutines.job;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CachedJobManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager$startIdleTimer$2$1", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 192}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$startIdleTimer$2$1, reason: use source file name */
/* loaded from: classes15.dex */
final class CachedJobManager4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final /* synthetic */ CachedJobManager2<C> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedJobManager4(CachedJobManager2<C> cachedJobManager2, Continuation<? super CachedJobManager4> continuation) {
        super(2, continuation);
        this.this$0 = cachedJobManager2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CachedJobManager4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CachedJobManager4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r7.sleepImpl(r1, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long idleTimeout = this.this$0.getIdleTimeout();
            this.J$0 = idleTimeout;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(idleTimeout, this) != coroutine_suspended) {
                j = idleTimeout;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        j = this.J$0;
        ResultKt.throwOnFailure(obj);
        CachedJobManager2<C> cachedJobManager2 = this.this$0;
        CachedJobManager6 cachedJobManager6 = new CachedJobManager6("Sleeping after " + Duration.m28761toStringimpl(j) + " of inactivity");
        this.label = 2;
    }
}
