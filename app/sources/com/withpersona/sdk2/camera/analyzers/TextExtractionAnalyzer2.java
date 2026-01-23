package com.withpersona.sdk2.camera.analyzers;

import com.google.mlkit.vision.common.InputImage;
import com.withpersona.sdk2.inquiry.types.ModelBackedExtractor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: TextExtractionAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/TextEntityExtractor;", "Lcom/withpersona/sdk2/inquiry/types/ModelBackedExtractor;", "performExtraction", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "inputImage", "Lcom/google/mlkit/vision/common/InputImage;", "performExtraction-YNEx5aM", "(Lcom/google/mlkit/vision/common/InputImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.analyzers.TextEntityExtractor, reason: use source file name */
/* loaded from: classes26.dex */
public interface TextExtractionAnalyzer2 extends ModelBackedExtractor {
    void close();

    /* renamed from: performExtraction-YNEx5aM, reason: not valid java name */
    Object m27268performExtractionYNEx5aM(InputImage inputImage, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation);
}
