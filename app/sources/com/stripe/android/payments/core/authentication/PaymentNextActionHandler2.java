package com.stripe.android.payments.core.authentication;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.WithLifecycleState;
import androidx.lifecycle.WithLifecycleState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: PaymentNextActionHandler.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"awaitResumed", "", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt, reason: use source file name */
/* loaded from: classes22.dex */
public final class PaymentNextActionHandler2 {

    /* compiled from: PaymentNextActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt", m3645f = "PaymentNextActionHandler.kt", m3646l = {61, 49}, m3647m = "awaitResumed")
    /* renamed from: com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt$awaitResumed$1 */
    static final class C425771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C425771(Continuation<? super C425771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentNextActionHandler2.awaitResumed(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r11.await(r6) != r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitResumed(LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) {
        C425771 c425771;
        final CompletableDeferred completableDeferredCompletableDeferred$default;
        CompletableDeferred completableDeferred;
        if (continuation instanceof C425771) {
            c425771 = (C425771) continuation;
            int i = c425771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425771.label = i - Integer.MIN_VALUE;
            } else {
                c425771 = new C425771(continuation);
            }
        }
        C425771 c4257712 = c425771;
        Object obj = c4257712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4257712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
            Lifecycle registry = lifecycleOwner.getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            boolean zIsDispatchNeeded = immediate.isDispatchNeeded(c4257712.getContext());
            if (!zIsDispatchNeeded) {
                if (registry.getState() == Lifecycle.State.DESTROYED) {
                    throw new WithLifecycleState();
                }
                if (registry.getState().compareTo(state) >= 0) {
                    boxing.boxBoolean(completableDeferredCompletableDeferred$default.complete(Unit.INSTANCE));
                    c4257712.L$0 = null;
                    c4257712.label = 2;
                }
            }
            Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(completableDeferredCompletableDeferred$default.complete(Unit.INSTANCE));
                }
            };
            c4257712.L$0 = completableDeferredCompletableDeferred$default;
            c4257712.label = 1;
            if (WithLifecycleState2.suspendWithStateAtLeastUnchecked(registry, state, zIsDispatchNeeded, immediate, function0, c4257712) != coroutine_suspended) {
                completableDeferred = completableDeferredCompletableDeferred$default;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        completableDeferred = (CompletableDeferred) c4257712.L$0;
        ResultKt.throwOnFailure(obj);
        completableDeferredCompletableDeferred$default = completableDeferred;
        c4257712.L$0 = null;
        c4257712.label = 2;
    }
}
