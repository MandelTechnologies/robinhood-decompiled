package com.robinhood.coroutines.job;

import com.plaid.internal.EnumC7081g;
import com.robinhood.coroutines.job.CachedJobManager2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: CachedJobManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager$sleepImpl$2$1", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$sleepImpl$2$1, reason: use source file name */
/* loaded from: classes15.dex */
final class CachedJobManager3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CancellationException $cause;
    int label;
    final /* synthetic */ CachedJobManager2<C> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedJobManager3(CachedJobManager2<C> cachedJobManager2, CancellationException cancellationException, Continuation<? super CachedJobManager3> continuation) {
        super(2, continuation);
        this.this$0 = cachedJobManager2;
        this.$cause = cancellationException;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CachedJobManager3(this.this$0, this.$cause, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CachedJobManager3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object component;
        Job job;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.cancelIdleTimer();
            CachedJobManager2.State state = ((CachedJobManager2) this.this$0).state;
            if (state != null && (component = state.getComponent()) != null) {
                CachedJobManager2<C> cachedJobManager2 = this.this$0;
                this.label = 1;
                if (cachedJobManager2.onComponentDestroyed(component, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CachedJobManager2.State state2 = ((CachedJobManager2) this.this$0).state;
        if (state2 != null && (job = state2.getJob()) != null) {
            job.cancel(this.$cause);
        }
        ((CachedJobManager2) this.this$0).state = null;
        return Unit.INSTANCE;
    }
}
