package com.robinhood.android.microgramsdui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: Lifecycle.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"performCleanupAsync", "", "Lkotlinx/coroutines/Deferred;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/Deferred;Lkotlin/jvm/functions/Function2;)V", "lib-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.LifecycleKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Lifecycle5 {
    public static final void performCleanupAsync(Deferred<MicrogramManager2> deferred, Function2<? super MicrogramManager2, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(deferred, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (deferred.isCompleted()) {
            MicrogramManager2 completed = deferred.getCompleted();
            BuildersKt__Builders_commonKt.launch$default(completed.getComponent().getCoroutineScope(), null, null, new C218541(action, completed, null), 3, null);
        }
    }

    /* compiled from: Lifecycle.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.LifecycleKt$performCleanupAsync$1", m3645f = "Lifecycle.kt", m3646l = {19}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.LifecycleKt$performCleanupAsync$1 */
    static final class C218541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<MicrogramManager2, Continuation<? super Unit>, Object> $action;
        final /* synthetic */ MicrogramManager2 $instance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C218541(Function2<? super MicrogramManager2, ? super Continuation<? super Unit>, ? extends Object> function2, MicrogramManager2 microgramManager2, Continuation<? super C218541> continuation) {
            super(2, continuation);
            this.$action = function2;
            this.$instance = microgramManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C218541(this.$action, this.$instance, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<MicrogramManager2, Continuation<? super Unit>, Object> function2 = this.$action;
                MicrogramManager2 microgramManager2 = this.$instance;
                this.label = 1;
                if (function2.invoke(microgramManager2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
