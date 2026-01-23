package com.withpersona.sdk2.inquiry.selfie;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$3", m3645f = "CameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class CameraScreenRunner$showRendering$1$3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraController $cameraController;
    final /* synthetic */ SelfieWorkflow.Screen.CameraScreen.Mode $mode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenRunner$showRendering$1$3(CameraController cameraController, SelfieWorkflow.Screen.CameraScreen.Mode mode, Continuation<? super CameraScreenRunner$showRendering$1$3> continuation) {
        super(2, continuation);
        this.$cameraController = cameraController;
        this.$mode = mode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenRunner$showRendering$1$3(this.$cameraController, this.$mode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraScreenRunner$showRendering$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
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
            Flow flowTakeWhile = FlowKt.takeWhile(this.$cameraController.getCameraState(), new C437171(null));
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
        C437182 c437182 = new C437182(this.$cameraController, this.$mode, null);
        this.label = 2;
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/withpersona/sdk2/camera/CameraState;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$3$1", m3645f = "CameraScreenRunner.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$3$1 */
    static final class C437171 extends ContinuationImpl7 implements Function2<CameraController4, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C437171(Continuation<? super C437171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437171 c437171 = new C437171(continuation);
            c437171.L$0 = obj;
            return c437171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CameraController4 cameraController4, Continuation<? super Boolean> continuation) {
            return ((C437171) create(cameraController4, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$3$2", m3645f = "CameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$3$2 */
    static final class C437182 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CameraController $cameraController;
        final /* synthetic */ SelfieWorkflow.Screen.CameraScreen.Mode $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C437182(CameraController cameraController, SelfieWorkflow.Screen.CameraScreen.Mode mode, Continuation<? super C437182> continuation) {
            super(2, continuation);
            this.$cameraController = cameraController;
            this.$mode = mode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437182(this.$cameraController, this.$mode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objMo27257stopVideoIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CameraController cameraController = this.$cameraController;
                this.label = 1;
                objMo27257stopVideoIoAF18A = cameraController.mo27257stopVideoIoAF18A(this);
                if (objMo27257stopVideoIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo27257stopVideoIoAF18A = ((Result) obj).getValue();
            }
            if (Result.m28556isSuccessimpl(objMo27257stopVideoIoAF18A)) {
                ((File) objMo27257stopVideoIoAF18A).delete();
            }
            ((SelfieWorkflow.Screen.CameraScreen.Mode.PreviewUnavailable) this.$mode).getPreviewReady().invoke(this.$cameraController.getCameraProperties());
            return Unit.INSTANCE;
        }
    }
}
