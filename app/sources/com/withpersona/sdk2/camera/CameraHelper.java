package com.withpersona.sdk2.camera;

import android.content.Context;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Interruptible;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: CameraHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraHelper;", "", "<init>", "()V", "unbind", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CameraHelper {
    public static final CameraHelper INSTANCE = new CameraHelper();

    /* compiled from: CameraHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.CameraHelper", m3645f = "CameraHelper.kt", m3646l = {13, 16, 20}, m3647m = "unbind")
    /* renamed from: com.withpersona.sdk2.camera.CameraHelper$unbind$1 */
    static final class C435361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C435361(Continuation<? super C435361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraHelper.this.unbind(null, this);
        }
    }

    private CameraHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unbind(Context context, Continuation<? super Unit> continuation) {
        C435361 c435361;
        if (continuation instanceof C435361) {
            c435361 = (C435361) continuation;
            int i = c435361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c435361.label = i - Integer.MIN_VALUE;
            } else {
                c435361 = new C435361(continuation);
            }
        }
        Object objWithContext = c435361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c435361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            CameraHelper2 cameraHelper2 = new CameraHelper2(context, null);
            c435361.label = 1;
            objWithContext = BuildersKt.withContext(main, cameraHelper2, c435361);
            if (objWithContext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objWithContext);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objWithContext);
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            C435372 c435372 = new C435372((ProcessCameraProvider) objWithContext, null);
            c435361.label = 3;
        }
        final ListenableFuture listenableFuture = (ListenableFuture) objWithContext;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraHelper.unbind$lambda$0(listenableFuture);
            }
        };
        c435361.label = 2;
        objWithContext = Interruptible.runInterruptible(io2, function0, c435361);
        if (objWithContext != coroutine_suspended) {
            MainCoroutineDispatcher main22 = Dispatchers.getMain();
            C435372 c4353722 = new C435372((ProcessCameraProvider) objWithContext, null);
            c435361.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ProcessCameraProvider unbind$lambda$0(ListenableFuture listenableFuture) {
        return (ProcessCameraProvider) listenableFuture.get();
    }

    /* compiled from: CameraHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", m3645f = "CameraHelper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.CameraHelper$unbind$2 */
    static final class C435372 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProcessCameraProvider $cameraProvider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435372(ProcessCameraProvider processCameraProvider, Continuation<? super C435372> continuation) {
            super(2, continuation);
            this.$cameraProvider = processCameraProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435372(this.$cameraProvider, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                this.$cameraProvider.unbindAll();
            } catch (ImageCaptureException unused) {
            }
            return Unit.INSTANCE;
        }
    }
}
