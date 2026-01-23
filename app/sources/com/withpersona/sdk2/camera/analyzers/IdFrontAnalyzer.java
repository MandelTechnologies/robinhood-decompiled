package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer2;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer3;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdFrontAnalyzer.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/IdFrontAnalyzer;", "Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "<init>", "()V", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "analyze-0E7RQCE", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector$delegate", "Lkotlin/Lazy;", "getFaceDetector", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector$delegate", "getTextDetector", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class IdFrontAnalyzer implements ComposableImageAnalyzer {

    /* renamed from: faceDetector$delegate, reason: from kotlin metadata */
    private final Lazy faceDetector = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.analyzers.IdFrontAnalyzer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IdFrontAnalyzer.faceDetector_delegate$lambda$0();
        }
    });

    /* renamed from: textDetector$delegate, reason: from kotlin metadata */
    private final Lazy textDetector = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.analyzers.IdFrontAnalyzer$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IdFrontAnalyzer.textDetector_delegate$lambda$1();
        }
    });

    private final FaceDetector getFaceDetector() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDetector faceDetector_delegate$lambda$0() {
        FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setMinFaceSize(0.1f).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    private final TextRecognizer getTextDetector() {
        return (TextRecognizer) this.textDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRecognizer textDetector_delegate$lambda$1() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    public Object mo27267analyze0E7RQCE(ImageToAnalyze imageToAnalyze, Rect rect, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation) {
        InputImage inputImage = imageToAnalyze.getInputImage();
        Task<List<Face>> taskProcess = getFaceDetector().process(inputImage);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        Task<Text> taskProcess2 = getTextDetector().process(inputImage);
        Intrinsics.checkNotNullExpressionValue(taskProcess2, "process(...)");
        try {
            List<Face> result = taskProcess.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Face face = (Face) CollectionsKt.getOrNull(result, 0);
            if (face == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
            }
            List<Text.TextBlock> textBlocks = taskProcess2.getResult().getTextBlocks();
            Intrinsics.checkNotNullExpressionValue(textBlocks, "getTextBlocks(...)");
            List<Text.TextBlock> list = textBlocks;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<Text.Line> lines = ((Text.TextBlock) it.next()).getLines();
                Intrinsics.checkNotNullExpressionValue(lines, "getLines(...)");
                List<Text.Line> list2 = lines;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Text.Line) it2.next()).getText());
                }
                arrayList.add(arrayList2);
            }
            if (CollectionsKt.flatten(arrayList).size() < 5) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
            }
            Rect rect2 = new Rect(0, 0, inputImage.getWidth(), inputImage.getHeight());
            rect2.inset(1, 1);
            if (rect2.contains(face.getBoundingBox())) {
                Result.Companion companion3 = Result.INSTANCE;
                String text = taskProcess2.getResult().getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                return Result.m28550constructorimpl(new ComposableImageAnalyzer2.IdFrontAnalysisData(new ImageIdMetadata(text)));
            }
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
        } catch (ExecutionException unused) {
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new ComposableImageAnalyzer3.DetectorError()));
        }
    }
}
