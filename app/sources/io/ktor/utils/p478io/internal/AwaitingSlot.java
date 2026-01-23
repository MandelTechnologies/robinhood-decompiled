package io.ktor.utils.p478io.internal;

import androidx.concurrent.futures.C2031xc40028dd;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job6;

/* compiled from: AwaitingSlot.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\u0010B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0002J!\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m3636d2 = {"Lio/ktor/utils/io/internal/AwaitingSlot;", "<init>", "()V", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)V", "resume", "Lkotlin/Function0;", "", "sleepCondition", "sleep", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySuspend", "ktor-io", ""}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class AwaitingSlot {
    private static final /* synthetic */ AtomicReferenceFieldUpdater suspension$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitingSlot.class, Object.class, "suspension");
    private volatile /* synthetic */ Object suspension = null;

    /* compiled from: AwaitingSlot.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.internal.AwaitingSlot", m3645f = "AwaitingSlot.kt", m3646l = {24}, m3647m = "sleep")
    /* renamed from: io.ktor.utils.io.internal.AwaitingSlot$sleep$1 */
    static final class C456411 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456411(Continuation<? super C456411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitingSlot.this.sleep(null, this);
        }
    }

    /* compiled from: AwaitingSlot.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.internal.AwaitingSlot", m3645f = "AwaitingSlot.kt", m3646l = {57}, m3647m = "trySuspend")
    /* renamed from: io.ktor.utils.io.internal.AwaitingSlot$trySuspend$1 */
    static final class C456421 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        C456421(Continuation<? super C456421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitingSlot.this.trySuspend(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sleep(Function0<Boolean> function0, Continuation<? super Unit> continuation) {
        C456411 c456411;
        AwaitingSlot awaitingSlot;
        if (continuation instanceof C456411) {
            c456411 = (C456411) continuation;
            int i = c456411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456411.label = i - Integer.MIN_VALUE;
            } else {
                c456411 = new C456411(continuation);
            }
        }
        Object objTrySuspend = c456411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTrySuspend);
            c456411.L$0 = this;
            c456411.label = 1;
            objTrySuspend = trySuspend(function0, c456411);
            if (objTrySuspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitingSlot = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitingSlot = (AwaitingSlot) c456411.L$0;
            ResultKt.throwOnFailure(objTrySuspend);
        }
        if (((Boolean) objTrySuspend).booleanValue()) {
            return Unit.INSTANCE;
        }
        awaitingSlot.resume();
        return Unit.INSTANCE;
    }

    public final void resume() {
        CompletableJob completableJob = (CompletableJob) suspension$FU.getAndSet(this, null);
        if (completableJob != null) {
            completableJob.complete();
        }
    }

    public final void cancel(Throwable cause) {
        CompletableJob completableJob = (CompletableJob) suspension$FU.getAndSet(this, null);
        if (completableJob == null) {
            return;
        }
        if (cause != null) {
            completableJob.completeExceptionally(cause);
        } else {
            completableJob.complete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trySuspend(Function0<Boolean> function0, Continuation<? super Boolean> continuation) {
        C456421 c456421;
        int i;
        if (continuation instanceof C456421) {
            c456421 = (C456421) continuation;
            int i2 = c456421.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456421.label = i2 - Integer.MIN_VALUE;
            } else {
                c456421 = new C456421(continuation);
            }
        }
        Object obj = c456421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456421.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
            if (C2031xc40028dd.m363m(suspension$FU, this, null, completableJobJob$default) && function0.invoke().booleanValue()) {
                c456421.I$0 = 1;
                c456421.label = 1;
                if (completableJobJob$default.join(c456421) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = 1;
            } else {
                i = 0;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c456421.I$0;
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(i != 0);
    }
}
