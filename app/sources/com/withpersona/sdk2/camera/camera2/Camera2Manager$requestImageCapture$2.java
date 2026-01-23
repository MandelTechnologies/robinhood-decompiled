package com.withpersona.sdk2.camera.camera2;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Camera2Manager.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", m3645f = "Camera2Manager.kt", m3646l = {342}, m3647m = "invokeSuspend")
/* loaded from: classes26.dex */
final class Camera2Manager$requestImageCapture$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends File>>, Object> {
    int label;
    final /* synthetic */ Camera2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Manager$requestImageCapture$2(Camera2Manager camera2Manager, Continuation<? super Camera2Manager$requestImageCapture$2> continuation) {
        super(2, continuation);
        this.this$0 = camera2Manager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Camera2Manager$requestImageCapture$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends File>> continuation) {
        return ((Camera2Manager$requestImageCapture$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.isImageCaptureRequested) {
                this.this$0.imageCaptureResult.setValue(null);
                this.this$0.isImageCaptureRequested = true;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                Camera2Manager$requestImageCapture$2$imageResult$1 camera2Manager$requestImageCapture$2$imageResult$1 = new Camera2Manager$requestImageCapture$2$imageResult$1(this.this$0, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, camera2Manager$requestImageCapture$2$imageResult$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(new RuntimeException("Image capture already requested."))));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object value = ((Result) obj).getValue();
        this.this$0.isImageCaptureRequested = false;
        return Result.m28549boximpl(value);
    }
}
