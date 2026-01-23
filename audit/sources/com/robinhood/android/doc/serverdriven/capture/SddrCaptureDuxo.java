package com.robinhood.android.doc.serverdriven.capture;

import com.robinhood.android.camera.CameraUtils;
import com.robinhood.android.camera.process.PhotoProcessor;
import com.robinhood.android.camera.process.ProcessPhotoOptions;
import com.robinhood.android.camera.process.ProcessPhotoResult;
import com.robinhood.android.doc.p109ui.photo.PhotoEvent;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.IdDocument;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SddrCaptureDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0006\u0010\u000b\u001a\u00020\u0002J6\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/capture/SddrCaptureDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "photoProcessor", "Lcom/robinhood/android/camera/process/PhotoProcessor;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/camera/process/PhotoProcessor;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "acceptBlurryPhoto", "processPhoto", "captureSide", "Lcom/robinhood/models/api/IdDocument$Side;", "aspectRatio", "", "bytes", "", "rotationDegrees", "", GoldFeature.MARGIN, "", "(Lcom/robinhood/models/api/IdDocument$Side;D[BIFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrCaptureDuxo extends BaseDuxo5<Unit, PhotoEvent> {
    public static final int $stable = 8;
    private final PhotoProcessor photoProcessor;

    /* compiled from: SddrCaptureDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.capture.SddrCaptureDuxo", m3645f = "SddrCaptureDuxo.kt", m3646l = {53}, m3647m = "processPhoto")
    /* renamed from: com.robinhood.android.doc.serverdriven.capture.SddrCaptureDuxo$processPhoto$1 */
    static final class C142711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C142711(Continuation<? super C142711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SddrCaptureDuxo.this.processPhoto(null, 0.0d, null, 0, 0.0f, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SddrCaptureDuxo(PhotoProcessor photoProcessor, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(photoProcessor, "photoProcessor");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.photoProcessor = photoProcessor;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C142701(null));
    }

    /* compiled from: SddrCaptureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.capture.SddrCaptureDuxo$onCreate$1", m3645f = "SddrCaptureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.capture.SddrCaptureDuxo$onCreate$1 */
    static final class C142701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C142701(Continuation<? super C142701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrCaptureDuxo.this.new C142701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!CameraUtils.INSTANCE.getCameraSupported()) {
                SddrCaptureDuxo.this.submit(PhotoEvent.CameraUnsupported.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void acceptBlurryPhoto() {
        submit(PhotoEvent.CaptureComplete.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processPhoto(IdDocument.Side side, double d, byte[] bArr, int i, float f, Continuation<? super Unit> continuation) {
        C142711 c142711;
        if (continuation instanceof C142711) {
            c142711 = (C142711) continuation;
            int i2 = c142711.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c142711.label = i2 - Integer.MIN_VALUE;
            } else {
                c142711 = new C142711(continuation);
            }
        }
        Object objProcessPhoto = c142711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c142711.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objProcessPhoto);
                ProcessPhotoOptions processPhotoOptions = new ProcessPhotoOptions(side.name(), i, side.getCheckBlurriness(), (float) d, f);
                PhotoProcessor photoProcessor = this.photoProcessor;
                c142711.label = 1;
                objProcessPhoto = photoProcessor.processPhoto(bArr, processPhotoOptions, c142711);
                if (objProcessPhoto == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objProcessPhoto);
            }
            submit(((ProcessPhotoResult) objProcessPhoto).isBlurry() ? PhotoEvent.CapturedPhotoIsBlurry.INSTANCE : PhotoEvent.CaptureComplete.INSTANCE);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            submit(new PhotoEvent.CapturePhotoError(e));
        }
        return Unit.INSTANCE;
    }
}
