package com.robinhood.android.moria.network.bouncer.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebounceDecider.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B;\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012*\u0010\b\u001a&\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000H\u0096B¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\b\u001a&\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/moria/network/bouncer/internal/DebounceDecider;", "P", "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "metadata", "Lcom/robinhood/android/moria/network/bouncer/Metadata;", "staleDecider", "Lkotlin/Function3;", "", "<init>", "(Lcom/robinhood/android/moria/network/bouncer/Metadata;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "invoke", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DebounceDecider<P> implements Function2<P, Continuation<? super Boolean>, Object>, ContinuationImpl6 {
    private final com.robinhood.android.moria.network.bouncer.Metadata metadata;
    private final Function3<Long, P, Continuation<? super Boolean>, Object> staleDecider;

    /* compiled from: DebounceDecider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.bouncer.internal.DebounceDecider", m3645f = "DebounceDecider.kt", m3646l = {16}, m3647m = "invoke")
    /* renamed from: com.robinhood.android.moria.network.bouncer.internal.DebounceDecider$invoke$1 */
    /* loaded from: classes8.dex */
    static final class C222271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DebounceDecider<P> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222271(DebounceDecider<P> debounceDecider, Continuation<? super C222271> continuation) {
            super(continuation);
            this.this$0 = debounceDecider;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.invoke2((DebounceDecider<P>) null, (Continuation<? super Boolean>) this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebounceDecider(com.robinhood.android.moria.network.bouncer.Metadata metadata, Function3<? super Long, ? super P, ? super Continuation<? super Boolean>, ? extends Object> staleDecider) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
        this.metadata = metadata;
        this.staleDecider = staleDecider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return invoke2((DebounceDecider<P>) obj, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke2(P p, Continuation<? super Boolean> continuation) {
        C222271 c222271;
        if (continuation instanceof C222271) {
            c222271 = (C222271) continuation;
            int i = c222271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c222271.label = i - Integer.MIN_VALUE;
            } else {
                c222271 = new C222271(this, continuation);
            }
        }
        Object objInvoke = c222271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c222271.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function3<Long, P, Continuation<? super Boolean>, Object> function3 = this.staleDecider;
            Long lastUpdatedAt = this.metadata.getLastUpdatedAt();
            c222271.label = 1;
            objInvoke = function3.invoke(lastUpdatedAt, p, c222271);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
        boolean zIsInFlight = this.metadata.isInFlight();
        if (zBooleanValue && !zIsInFlight) {
            z = false;
        }
        return boxing.boxBoolean(z);
    }
}
