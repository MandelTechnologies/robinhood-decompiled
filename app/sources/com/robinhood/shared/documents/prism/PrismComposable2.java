package com.robinhood.shared.documents.prism;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.compose.runtime.SnapshotState4;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.camera.util.Contexts4;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.shared.documents.prism.PrismEvent;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrismComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$1$1", m3645f = "PrismComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class PrismComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PrismDuxo $duxo;
    final /* synthetic */ SnapshotState4<Event<PrismEvent>> $event$delegate;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Function0<Unit> $onFinished;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrismComposable2(Context context, SnapshotState4<Event<PrismEvent>> snapshotState4, PrismDuxo prismDuxo, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Continuation<? super PrismComposable2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$event$delegate = snapshotState4;
        this.$duxo = prismDuxo;
        this.$lifecycleOwner = lifecycleOwner;
        this.$onFinished = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrismComposable2(this.$context, this.$event$delegate, this.$duxo, this.$lifecycleOwner, this.$onFinished, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrismComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        EventConsumer eventConsumer2;
        EventConsumer eventConsumer3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.$context;
            this.label = 1;
            obj = Contexts4.awaitCameraProvider(context, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) obj;
        final Executor mainExecutor = ContextCompat.getMainExecutor(this.$context);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        final Event eventCameraEventHandler$lambda$8 = PrismComposable.CameraEventHandler$lambda$8(this.$event$delegate);
        if (eventCameraEventHandler$lambda$8 != null) {
            final PrismDuxo prismDuxo = this.$duxo;
            final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            if ((eventCameraEventHandler$lambda$8.getData() instanceof PrismEvent.StartFaceTracking) && (eventConsumer3 = (EventConsumer) eventCameraEventHandler$lambda$8.getGetEventConsumer().invoke()) != null) {
                eventConsumer3.consume(eventCameraEventHandler$lambda$8, new Function1() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$1$1$invokeSuspend$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m25317invoke(obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25317invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        PrismComposable.trackFace(prismDuxo, lifecycleOwner, processCameraProvider, mainExecutor);
                    }
                });
            }
        }
        final Event eventCameraEventHandler$lambda$82 = PrismComposable.CameraEventHandler$lambda$8(this.$event$delegate);
        if (eventCameraEventHandler$lambda$82 != null) {
            final PrismDuxo prismDuxo2 = this.$duxo;
            final LifecycleOwner lifecycleOwner2 = this.$lifecycleOwner;
            final Context context2 = this.$context;
            if ((eventCameraEventHandler$lambda$82.getData() instanceof PrismEvent.StartCapture) && (eventConsumer2 = (EventConsumer) eventCameraEventHandler$lambda$82.getGetEventConsumer().invoke()) != null) {
                eventConsumer2.consume(eventCameraEventHandler$lambda$82, new Function1() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$1$1$invokeSuspend$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m25318invoke(obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25318invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        PrismComposable.captureVideoAndPhoto(prismDuxo2, lifecycleOwner2, processCameraProvider, mainExecutor, context2, ((PrismEvent.StartCapture) eventCameraEventHandler$lambda$82.getData()).getVideoBitRate());
                    }
                });
            }
        }
        final Event eventCameraEventHandler$lambda$83 = PrismComposable.CameraEventHandler$lambda$8(this.$event$delegate);
        if (eventCameraEventHandler$lambda$83 != null) {
            final Function0<Unit> function0 = this.$onFinished;
            if ((eventCameraEventHandler$lambda$83.getData() instanceof PrismEvent.Finished) && (eventConsumer = (EventConsumer) eventCameraEventHandler$lambda$83.getGetEventConsumer().invoke()) != null) {
                eventConsumer.consume(eventCameraEventHandler$lambda$83, new Function1() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$1$1$invokeSuspend$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m25319invoke(obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25319invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function0.invoke();
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
