package com.robinhood.android.camera.util;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: Contexts.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"awaitCameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-camera_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.camera.util.ContextsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Contexts4 {
    public static final Object awaitCameraProvider(Context context, Continuation<? super ProcessCameraProvider> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.INSTANCE.getInstance(context);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.robinhood.android.camera.util.ContextsKt$awaitCameraProvider$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                companion.cancel(th == null);
            }
        });
        companion.addListener(new Runnable() { // from class: com.robinhood.android.camera.util.ContextsKt$awaitCameraProvider$2$2
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                if (companion.isCancelled()) {
                    CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                } else {
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(companion.get()));
                }
            }
        }, ContextCompat.getMainExecutor(context));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
