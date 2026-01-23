package com.robinhood.android.bugsy;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: RedactDispatcher.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0080@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/bugsy/RedactDispatcher;", "", "<init>", "()V", "redactedState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "redacted", "Lkotlinx/coroutines/flow/StateFlow;", "getRedacted", "()Lkotlinx/coroutines/flow/StateFlow;", "withRedaction", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "withRedaction$lib_bugsy_externalRelease", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-bugsy_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RedactDispatcher {
    public static final int $stable = 8;
    private final StateFlow<Boolean> redacted;
    private final StateFlow2<Boolean> redactedState;

    public RedactDispatcher() {
        StateFlow2<Boolean> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        this.redactedState = stateFlow2MutableStateFlow;
        this.redacted = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    public final StateFlow<Boolean> getRedacted() {
        return this.redacted;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object withRedaction$lib_bugsy_externalRelease(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        RedactDispatcher2 redactDispatcher2;
        Throwable th;
        boolean z;
        if (continuation instanceof RedactDispatcher2) {
            redactDispatcher2 = (RedactDispatcher2) continuation;
            int i = redactDispatcher2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redactDispatcher2.label = i - Integer.MIN_VALUE;
            } else {
                redactDispatcher2 = new RedactDispatcher2(this, continuation);
            }
        }
        Object obj = redactDispatcher2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = redactDispatcher2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = redactDispatcher2.Z$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (z) {
                    this.redactedState.setValue(boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        boolean zCompareAndSet = this.redactedState.compareAndSet(boxing.boxBoolean(false), boxing.boxBoolean(true));
        try {
            redactDispatcher2.Z$0 = zCompareAndSet;
            redactDispatcher2.label = 1;
            if (function1.invoke(redactDispatcher2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zCompareAndSet;
            if (z) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            z = zCompareAndSet;
            if (z) {
                this.redactedState.setValue(boxing.boxBoolean(false));
            }
            throw th;
        }
    }
}
