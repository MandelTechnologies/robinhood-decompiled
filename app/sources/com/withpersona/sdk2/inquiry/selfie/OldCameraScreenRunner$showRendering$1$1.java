package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OldCameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1", m3645f = "OldCameraScreenRunner.kt", m3646l = {202, 204}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class OldCameraScreenRunner$showRendering$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelfieWorkflow.Screen.OldCameraScreen.Mode $mode;
    int label;
    final /* synthetic */ OldCameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OldCameraScreenRunner$showRendering$1$1(OldCameraScreenRunner oldCameraScreenRunner, SelfieWorkflow.Screen.OldCameraScreen.Mode mode, Continuation<? super OldCameraScreenRunner$showRendering$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oldCameraScreenRunner;
        this.$mode = mode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OldCameraScreenRunner$showRendering$1$1(this.this$0, this.$mode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OldCameraScreenRunner$showRendering$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowTakeWhile = FlowKt.takeWhile(this.this$0.cameraController.getCameraState(), new C437211(null));
            this.label = 1;
            if (FlowKt.collect(flowTakeWhile, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        C437222 c437222 = new C437222(this.$mode, this.this$0, null);
        this.label = 2;
    }

    /* compiled from: OldCameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/withpersona/sdk2/camera/CameraState;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$1", m3645f = "OldCameraScreenRunner.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$1 */
    static final class C437211 extends ContinuationImpl7 implements Function2<CameraController4, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C437211(Continuation<? super C437211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437211 c437211 = new C437211(continuation);
            c437211.L$0 = obj;
            return c437211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CameraController4 cameraController4, Continuation<? super Boolean> continuation) {
            return ((C437211) create(cameraController4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(!Intrinsics.areEqual((CameraController4) this.L$0, CameraController4.Ready.INSTANCE));
        }
    }

    /* compiled from: OldCameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2", m3645f = "OldCameraScreenRunner.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2 */
    static final class C437222 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SelfieWorkflow.Screen.OldCameraScreen.Mode $mode;
        int label;
        final /* synthetic */ OldCameraScreenRunner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C437222(SelfieWorkflow.Screen.OldCameraScreen.Mode mode, OldCameraScreenRunner oldCameraScreenRunner, Continuation<? super C437222> continuation) {
            super(2, continuation);
            this.$mode = mode;
            this.this$0 = oldCameraScreenRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437222(this.$mode, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437222) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ((SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable) this.$mode).getPreviewReady().invoke(this.this$0.cameraController.getCameraProperties());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
