package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer2;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer3;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BarcodePdf417Analyzer.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/BarcodePdf417Analyzer;", "Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "<init>", "()V", "Landroid/graphics/Bitmap;", "original", "sharpenImage", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "analyze-0E7RQCE", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetector$delegate", "Lkotlin/Lazy;", "getBarcodeDetector", "()Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetector", "Companion", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BarcodePdf417Analyzer implements ComposableImageAnalyzer {

    /* renamed from: barcodeDetector$delegate, reason: from kotlin metadata */
    private final Lazy barcodeDetector = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.analyzers.BarcodePdf417Analyzer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BarcodePdf417Analyzer.barcodeDetector_delegate$lambda$0();
        }
    });
    private static final float[] CONVOLVE_MATRIX = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    private final BarcodeScanner getBarcodeDetector() {
        return (BarcodeScanner) this.barcodeDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarcodeScanner barcodeDetector_delegate$lambda$0() {
        BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(2048, new int[0]).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE, reason: not valid java name */
    public Object mo27267analyze0E7RQCE(ImageToAnalyze imageToAnalyze, Rect rect, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation) {
        Bitmap bitmap = imageToAnalyze.getBitmap();
        if (bitmap == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
        }
        Bitmap bitmapSharpenImage = sharpenImage(bitmap);
        if (bitmapSharpenImage != null) {
            bitmap = bitmapSharpenImage;
        }
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, imageToAnalyze.getInputImage().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
        Task<List<Barcode>> taskProcess = getBarcodeDetector().process(inputImageFromBitmap);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            List<Barcode> result = taskProcess.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Barcode barcode = (Barcode) CollectionsKt.getOrNull(result, 0);
            if (barcode == null) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
            }
            String rawValue = barcode.getRawValue();
            if (rawValue == null) {
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
            }
            if (barcode.getFormat() == 2048) {
                BarcodeInfo.Pdf417BarcodeInfo pdf417BarcodeInfo = new BarcodeInfo.Pdf417BarcodeInfo(rawValue);
                Rect rect2 = new Rect(0, 0, imageToAnalyze.getInputImage().getWidth(), imageToAnalyze.getInputImage().getHeight());
                Rect boundingBox = barcode.getBoundingBox();
                if (boundingBox == null) {
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
                }
                rect2.inset(1, 1);
                if (rect2.contains(boundingBox)) {
                    Result.Companion companion5 = Result.INSTANCE;
                    return Result.m28550constructorimpl(new ComposableImageAnalyzer2.BarcodeAnalysisData(pdf417BarcodeInfo));
                }
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
            }
            Result.Companion companion7 = Result.INSTANCE;
            return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
        } catch (ExecutionException unused) {
            Result.Companion companion8 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new ComposableImageAnalyzer3.GooglePlayError()));
        }
    }

    private final Bitmap sharpenImage(Bitmap original) {
        try {
            return Toolkit.convolve$default(Toolkit.INSTANCE, original, CONVOLVE_MATRIX, null, 4, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }
}
