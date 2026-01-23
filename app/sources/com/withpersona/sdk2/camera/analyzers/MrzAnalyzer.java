package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import com.withpersona.sdk2.camera.MrzExtraction;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer2;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer3;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MrzAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/MrzAnalyzer;", "Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "<init>", "()V", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "analyze-0E7RQCE", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector$delegate", "Lkotlin/Lazy;", "getTextDetector", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MrzAnalyzer implements ComposableImageAnalyzer {

    /* renamed from: textDetector$delegate, reason: from kotlin metadata */
    private final Lazy textDetector = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.analyzers.MrzAnalyzer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MrzAnalyzer.textDetector_delegate$lambda$0();
        }
    });

    private final TextRecognizer getTextDetector() {
        return (TextRecognizer) this.textDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRecognizer textDetector_delegate$lambda$0() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    public Object mo27267analyze0E7RQCE(ImageToAnalyze imageToAnalyze, Rect rect, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation) {
        Task<Text> taskProcess = getTextDetector().process(imageToAnalyze.getInputImage());
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            String text = taskProcess.getResult().getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (Intrinsics.areEqual(text, "")) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
            }
            MrzExtraction mrzExtractionFromString = MrzExtraction.INSTANCE.fromString(text);
            if (mrzExtractionFromString == null) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
            }
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(new ComposableImageAnalyzer2.BarcodeAnalysisData(new BarcodeInfo.MrzBarcodeInfo(mrzExtractionFromString.getRawText(), mrzExtractionFromString.getIdentificationNumber(), mrzExtractionFromString.getBirthdate(), mrzExtractionFromString.getExpirationDate())));
        } catch (ExecutionException unused) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new ComposableImageAnalyzer3.GooglePlayError()));
        }
    }
}
