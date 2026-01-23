package com.withpersona.sdk2.camera.camera2;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Camera2Manager.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2$imageResult$1", m3645f = "Camera2Manager.kt", m3646l = {343}, m3647m = "invokeSuspend")
/* loaded from: classes26.dex */
final class Camera2Manager$requestImageCapture$2$imageResult$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends File>>, Object> {
    int label;
    final /* synthetic */ Camera2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Manager$requestImageCapture$2$imageResult$1(Camera2Manager camera2Manager, Continuation<? super Camera2Manager$requestImageCapture$2$imageResult$1> continuation) {
        super(2, continuation);
        this.this$0 = camera2Manager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Camera2Manager$requestImageCapture$2$imageResult$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends File>> continuation) {
        return ((Camera2Manager$requestImageCapture$2$imageResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Camera2Manager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2$imageResult$1$1", m3645f = "Camera2Manager.kt", m3646l = {346}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2$imageResult$1$1 */
    static final class C435521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends File>>, Object> {
        int label;
        final /* synthetic */ Camera2Manager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435521(Camera2Manager camera2Manager, Continuation<? super C435521> continuation) {
            super(2, continuation);
            this.this$0 = camera2Manager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435521(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends File>> continuation) {
            return ((C435521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.imageCaptureResult);
            this.label = 1;
            Object objFirst = FlowKt.first(flowFilterNotNull, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineContext coroutineContext = this.this$0.coroutineScope.getCoroutineContext();
        C435521 c435521 = new C435521(this.this$0, null);
        this.label = 1;
        Object objWithContext = BuildersKt.withContext(coroutineContext, c435521, this);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }
}
