package com.robinhood.utils.androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import dispatch.core.Suspend;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LifecycleCoroutines.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"observe", "", "Landroidx/lifecycle/Lifecycle;", "observer", "Landroidx/lifecycle/LifecycleObserver;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/LifecycleObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.androidx.lifecycle.LifecycleCoroutinesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LifecycleCoroutines {

    /* compiled from: LifecycleCoroutines.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.androidx.lifecycle.LifecycleCoroutinesKt$observe$2", m3645f = "LifecycleCoroutines.kt", m3646l = {22}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.androidx.lifecycle.LifecycleCoroutinesKt$observe$2 */
    static final class C418282 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<?>, Object> {
        final /* synthetic */ LifecycleObserver $observer;
        final /* synthetic */ Lifecycle $this_observe;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C418282(Lifecycle lifecycle, LifecycleObserver lifecycleObserver, Continuation<? super C418282> continuation) {
            super(2, continuation);
            this.$this_observe = lifecycle;
            this.$observer = lifecycleObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C418282(this.$this_observe, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return ((C418282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$this_observe.addObserver(this.$observer);
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbes.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            } catch (Throwable th) {
                this.$this_observe.removeObserver(this.$observer);
                throw th;
            }
        }
    }

    public static final Object observe(Lifecycle lifecycle, LifecycleObserver lifecycleObserver, Continuation<?> continuation) {
        return Suspend.withMainImmediate$default(null, new C418282(lifecycle, lifecycleObserver, null), continuation, 1, null);
    }
}
