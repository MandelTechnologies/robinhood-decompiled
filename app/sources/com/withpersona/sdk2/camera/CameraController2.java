package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.camera.CameraController4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CameraController.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"completeWhenClosed", "Lkotlinx/coroutines/flow/Flow;", "Lcom/withpersona/sdk2/camera/CameraState;", "Lkotlinx/coroutines/flow/StateFlow;", "camera_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.CameraControllerKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CameraController2 {

    /* compiled from: CameraController.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/camera/CameraState;", "state"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", m3645f = "CameraController.kt", m3646l = {89}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1 */
    static final class C435351 extends ContinuationImpl7 implements Function3<FlowCollector<? super CameraController4>, CameraController4, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C435351(Continuation<? super C435351> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super CameraController4> flowCollector, CameraController4 cameraController4, Continuation<? super Boolean> continuation) {
            C435351 c435351 = new C435351(continuation);
            c435351.L$0 = flowCollector;
            c435351.L$1 = cameraController4;
            return c435351.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CameraController4 cameraController4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CameraController4 cameraController42 = (CameraController4) this.L$1;
                this.L$0 = cameraController42;
                this.label = 1;
                if (flowCollector.emit(cameraController42, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cameraController4 = cameraController42;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cameraController4 = (CameraController4) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(!(cameraController4 instanceof CameraController4.Closed));
        }
    }

    public static final Flow<CameraController4> completeWhenClosed(StateFlow<? extends CameraController4> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        return FlowKt.transformWhile(stateFlow, new C435351(null));
    }
}
