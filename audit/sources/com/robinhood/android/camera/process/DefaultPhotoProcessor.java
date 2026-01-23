package com.robinhood.android.camera.process;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.camera.CameraUtils;
import com.robinhood.android.camera.detection.BlurrinessDetection;
import com.robinhood.utils.extensions.BitmapFactoryUtils;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultPhotoProcessor.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/camera/process/DefaultPhotoProcessor;", "Lcom/robinhood/android/camera/process/PhotoProcessor;", "context", "Landroid/content/Context;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/bitmap/BitmapStore;)V", "processPhoto", "Lcom/robinhood/android/camera/process/ProcessPhotoResult;", WebsocketGatewayConstants.DATA_KEY, "", "processOptions", "Lcom/robinhood/android/camera/process/ProcessPhotoOptions;", "([BLcom/robinhood/android/camera/process/ProcessPhotoOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cropBitmap", "Landroid/graphics/Bitmap;", "bitmapBounds", "Landroid/graphics/BitmapFactory$Options;", "finalDecodeOptions", "cropRect", "Landroid/graphics/Rect;", "buildAdjustedRect", "options", "width", "", "height", "checkIsBlurry", "", "bitmap", "Companion", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPhotoProcessor implements PhotoProcessor {
    private static final long MAX_BYTES_OF_IMAGE = 5000000;
    private final BitmapStore bitmapStore;
    private final Context context;
    public static final int $stable = 8;

    public DefaultPhotoProcessor(Context context, BitmapStore bitmapStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        this.context = context;
        this.bitmapStore = bitmapStore;
    }

    /* compiled from: DefaultPhotoProcessor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/camera/process/ProcessPhotoResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.camera.process.DefaultPhotoProcessor$processPhoto$2", m3645f = "DefaultPhotoProcessor.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.camera.process.DefaultPhotoProcessor$processPhoto$2 */
    static final class C99342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProcessPhotoResult>, Object> {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ ProcessPhotoOptions $processOptions;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C99342(byte[] bArr, ProcessPhotoOptions processPhotoOptions, Continuation<? super C99342> continuation) {
            super(2, continuation);
            this.$data = bArr;
            this.$processOptions = processPhotoOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultPhotoProcessor.this.new C99342(this.$data, this.$processOptions, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProcessPhotoResult> continuation) {
            return ((C99342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws ProcessPhotoException {
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Bitmap bitmapCropBitmap = DefaultPhotoProcessor.this.cropBitmap(this.$data, this.$processOptions);
                int iCheckIsBlurry = this.$processOptions.getCheckBlurriness() ? DefaultPhotoProcessor.this.checkIsBlurry(bitmapCropBitmap) : 0;
                BitmapStore bitmapStore = DefaultPhotoProcessor.this.bitmapStore;
                String fileName = this.$processOptions.getFileName();
                this.I$0 = iCheckIsBlurry;
                this.label = 1;
                obj = bitmapStore.saveBitmapToDisk(bitmapCropBitmap, fileName, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iCheckIsBlurry;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return new ProcessPhotoResult(this.$processOptions.getFileName(), i != 0);
            }
            throw new ProcessPhotoException("Failed to save bitmap");
        }
    }

    @Override // com.robinhood.android.camera.process.PhotoProcessor
    public Object processPhoto(byte[] bArr, ProcessPhotoOptions processPhotoOptions, Continuation<? super ProcessPhotoResult> continuation) {
        return Suspend.withDefault$default(null, new C99342(bArr, processPhotoOptions, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap cropBitmap(byte[] data, ProcessPhotoOptions processOptions) {
        BitmapFactory.Options optionsBitmapBounds = bitmapBounds(data);
        BitmapFactory.Options optionsFinalDecodeOptions = finalDecodeOptions(buildAdjustedRect(processOptions, optionsBitmapBounds.outWidth, optionsBitmapBounds.outHeight));
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(data, 0, data.length, optionsFinalDecodeOptions);
        Rect rectBuildAdjustedRect = buildAdjustedRect(processOptions, optionsFinalDecodeOptions.outWidth, optionsFinalDecodeOptions.outHeight);
        Matrix matrix = new Matrix();
        matrix.preRotate(processOptions.getRotationDegrees());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, rectBuildAdjustedRect.left, rectBuildAdjustedRect.top, rectBuildAdjustedRect.width(), rectBuildAdjustedRect.height(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapDecodeByteArray.recycle();
        return bitmapCreateBitmap;
    }

    private final BitmapFactory.Options bitmapBounds(byte[] data) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(data, 0, data.length, options);
        return options;
    }

    private final BitmapFactory.Options finalDecodeOptions(Rect cropRect) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = BitmapFactoryUtils.INSTANCE.calculateSampleSize(cropRect.width(), cropRect.height(), MAX_BYTES_OF_IMAGE);
        return options;
    }

    private final Rect buildAdjustedRect(ProcessPhotoOptions options, int width, int height) {
        Tuples2 tuples2M3642to = options.getSwapWidthAndHeight() ? Tuples4.m3642to(Integer.valueOf(height), Integer.valueOf(width)) : Tuples4.m3642to(Integer.valueOf(width), Integer.valueOf(height));
        Rect croppingRect = CameraUtils.INSTANCE.getCroppingRect(((Number) tuples2M3642to.component1()).intValue(), ((Number) tuples2M3642to.component2()).intValue(), options.getAspectRatio(), options.getMargin());
        return options.getSwapWidthAndHeight() ? new Rect(croppingRect.top, croppingRect.left, croppingRect.bottom, croppingRect.right) : croppingRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIsBlurry(Bitmap bitmap) {
        try {
            return BlurrinessDetection.runDetection$default(BlurrinessDetection.INSTANCE, this.context, bitmap, 0.0f, 4, null);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            return false;
        }
    }
}
