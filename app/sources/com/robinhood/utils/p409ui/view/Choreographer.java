package com.robinhood.utils.p409ui.view;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: Choreographer.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"awaitFrame", "", "Landroid/view/Choreographer;", "(Landroid/view/Choreographer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ui.view.ChoreographerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Choreographer {
    public static final Object awaitFrame(final android.view.Choreographer choreographer, Continuation<? super Long> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: com.robinhood.utils.ui.view.ChoreographerKt$awaitFrame$2$frameCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Long.valueOf(j)));
            }
        };
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.robinhood.utils.ui.view.ChoreographerKt$awaitFrame$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                choreographer.removeFrameCallback(frameCallback);
            }
        });
        choreographer.postFrameCallback(frameCallback);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
