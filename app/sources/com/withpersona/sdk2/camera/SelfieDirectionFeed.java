package com.withpersona.sdk2.camera;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.withpersona.sdk2.camera.SelfieProcessor;
import com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer;
import com.withpersona.sdk2.camera.feed.CameraFeed;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: SelfieDirectionFeed.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001e\u0010&\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0096A¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040-8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;", "Lcom/withpersona/sdk2/camera/feed/CameraFeed;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/withpersona/sdk2/camera/selfie/SelfieFrameInfo;", "Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;", "Lcom/withpersona/sdk2/camera/SelfieProcessor;", "selfieProcessor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "resultFlow", "<init>", "(Lcom/withpersona/sdk2/camera/SelfieProcessor;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "", "requireStrictSelfie", "", "setConfig", "(Z)V", "Lcom/withpersona/sdk2/camera/SelfieProcessor$TargetPose;", "pose", "setTargetPose", "(Lcom/withpersona/sdk2/camera/SelfieProcessor$TargetPose;)V", "Landroidx/camera/core/ImageProxy;", "imageProxy", "analyze", "(Landroidx/camera/core/ImageProxy;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "(Landroid/media/Image;I)V", "Landroid/graphics/Rect;", "rect", "previewRect", "setViewfinderRect", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/camera/SelfieProcessor;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SelfieDirectionFeed implements CameraFeed, ImageAnalysis.Analyzer, SharedFlow<SelfieFrameInfo>, Camera2ImageAnalyzer {
    private final CoroutineScope coroutineScope;
    private final SharedFlow2<SelfieFrameInfo> resultFlow;
    private final SelfieProcessor selfieProcessor;

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super SelfieFrameInfo> flowCollector, Continuation<?> continuation) {
        return this.resultFlow.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<SelfieFrameInfo> getReplayCache() {
        return this.resultFlow.getReplayCache();
    }

    public SelfieDirectionFeed(SelfieProcessor selfieProcessor, SharedFlow2<SelfieFrameInfo> resultFlow) {
        Intrinsics.checkNotNullParameter(selfieProcessor, "selfieProcessor");
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.selfieProcessor = selfieProcessor;
        this.resultFlow = resultFlow;
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
    }

    public final void setConfig(boolean requireStrictSelfie) {
        this.selfieProcessor.setRequireStrictSelfie(requireStrictSelfie);
    }

    public final void setTargetPose(SelfieProcessor.TargetPose pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.selfieProcessor.setTargetPose(pose);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            SelfieFrameInfo selfieFrameInfoDirection = this.selfieProcessor.direction(imageProxy);
            AutoCloseableJVM.closeFinally(imageProxy, null);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C435441(selfieFrameInfoDirection, null), 3, null);
        } finally {
        }
    }

    /* compiled from: SelfieDirectionFeed.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1", m3645f = "SelfieDirectionFeed.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1 */
    static final class C435441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SelfieFrameInfo $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435441(SelfieFrameInfo selfieFrameInfo, Continuation<? super C435441> continuation) {
            super(2, continuation);
            this.$result = selfieFrameInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelfieDirectionFeed.this.new C435441(this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = SelfieDirectionFeed.this.resultFlow;
                SelfieFrameInfo selfieFrameInfo = this.$result;
                this.label = 1;
                if (sharedFlow2.emit(selfieFrameInfo, this) == coroutine_suspended) {
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

    @Override // com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer
    public void analyze(Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            SelfieFrameInfo selfieFrameInfoDirection = this.selfieProcessor.direction(image, rotationDegrees);
            AutoCloseableJVM.closeFinally(image, null);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C435452(selfieFrameInfoDirection, null), 3, null);
        } finally {
        }
    }

    /* compiled from: SelfieDirectionFeed.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2", m3645f = "SelfieDirectionFeed.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2 */
    static final class C435452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SelfieFrameInfo $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435452(SelfieFrameInfo selfieFrameInfo, Continuation<? super C435452> continuation) {
            super(2, continuation);
            this.$result = selfieFrameInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelfieDirectionFeed.this.new C435452(this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = SelfieDirectionFeed.this.resultFlow;
                SelfieFrameInfo selfieFrameInfo = this.$result;
                this.label = 1;
                if (sharedFlow2.emit(selfieFrameInfo, this) == coroutine_suspended) {
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

    @Override // com.withpersona.sdk2.camera.feed.CameraFeed
    public void setViewfinderRect(Rect rect, Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.selfieProcessor.setViewfinderRect(rect, previewRect);
    }
}
