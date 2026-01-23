package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.google.mlkit.vision.common.InputImage;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer2;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextExtractionAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/TextExtractionAnalyzer;", "Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "<init>", "()V", "Lcom/withpersona/sdk2/camera/analyzers/TextEntityExtractor;", "getTextEntityExtractor", "()Lcom/withpersona/sdk2/camera/analyzers/TextEntityExtractor;", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "analyze-0E7RQCE", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "textEntityExtractor", "Lcom/withpersona/sdk2/camera/analyzers/TextEntityExtractor;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "previousReadings", "Ljava/util/HashMap;", "Companion", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class TextExtractionAnalyzer implements ComposableImageAnalyzer {
    private final TextExtractionAnalyzer2 textEntityExtractor = getTextEntityExtractor();
    private final HashMap<String, Integer> previousReadings = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27267analyze0E7RQCE(ImageToAnalyze imageToAnalyze, Rect rect, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation) {
        TextExtractionAnalyzer3 textExtractionAnalyzer3;
        TextExtractionAnalyzer textExtractionAnalyzer;
        Result result;
        ComposableImageAnalyzer2 composableImageAnalyzer2;
        boolean z;
        Date expirationDate;
        boolean z2;
        if (continuation instanceof TextExtractionAnalyzer3) {
            textExtractionAnalyzer3 = (TextExtractionAnalyzer3) continuation;
            int i = textExtractionAnalyzer3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                textExtractionAnalyzer3.label = i - Integer.MIN_VALUE;
            } else {
                textExtractionAnalyzer3 = new TextExtractionAnalyzer3(this, continuation);
            }
        }
        Object objM27268performExtractionYNEx5aM = textExtractionAnalyzer3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = textExtractionAnalyzer3.label;
        Date dateOfBirth = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM27268performExtractionYNEx5aM);
            TextExtractionAnalyzer2 textExtractionAnalyzer2 = this.textEntityExtractor;
            if (textExtractionAnalyzer2 == null) {
                textExtractionAnalyzer = this;
                result = null;
                if (result == null) {
                    Object value = result.getValue();
                    if (Result.m28555isFailureimpl(value)) {
                        value = null;
                    }
                    composableImageAnalyzer2 = (ComposableImageAnalyzer2) value;
                } else {
                    composableImageAnalyzer2 = null;
                }
                z = composableImageAnalyzer2 instanceof ComposableImageAnalyzer2.TextExtractionData;
                if (z) {
                    expirationDate = null;
                } else {
                    ComposableImageAnalyzer2.TextExtractionData textExtractionData = (ComposableImageAnalyzer2.TextExtractionData) composableImageAnalyzer2;
                    dateOfBirth = textExtractionData.getExtractedTexts().getDateOfBirth();
                    expirationDate = textExtractionData.getExtractedTexts().getExpirationDate();
                }
                if (dateOfBirth != null && expirationDate != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(dateOfBirth);
                    sb.append(expirationDate);
                    String string2 = sb.toString();
                    HashMap<String, Integer> map = textExtractionAnalyzer.previousReadings;
                    Integer num = map.get(string2);
                    map.put(string2, boxing.boxInt((num == null ? num.intValue() : 0) + 1));
                }
                z2 = dateOfBirth == null && expirationDate != null;
                HashMap<String, Integer> map2 = textExtractionAnalyzer.previousReadings;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dateOfBirth);
                sb2.append(expirationDate);
                Integer num2 = map2.get(sb2.toString());
                boolean z3 = (num2 == null ? num2.intValue() : -1) >= 3;
                if (z2 || !z3) {
                    if (!z) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
                    }
                    if (result != null) {
                        return result.getValue();
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
                }
                TextExtractionAnalyzer2 textExtractionAnalyzer22 = textExtractionAnalyzer.textEntityExtractor;
                if (textExtractionAnalyzer22 != null) {
                    textExtractionAnalyzer22.close();
                }
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.checkNotNull(dateOfBirth);
                Intrinsics.checkNotNull(expirationDate);
                return Result.m28550constructorimpl(new ComposableImageAnalyzer2.TextExtractionData(new ExtractedTexts(dateOfBirth, expirationDate)));
            }
            InputImage inputImage = imageToAnalyze.getInputImage();
            textExtractionAnalyzer3.L$0 = this;
            textExtractionAnalyzer3.label = 1;
            objM27268performExtractionYNEx5aM = textExtractionAnalyzer2.m27268performExtractionYNEx5aM(inputImage, textExtractionAnalyzer3);
            if (objM27268performExtractionYNEx5aM == coroutine_suspended) {
                return coroutine_suspended;
            }
            textExtractionAnalyzer = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textExtractionAnalyzer = (TextExtractionAnalyzer) textExtractionAnalyzer3.L$0;
            ResultKt.throwOnFailure(objM27268performExtractionYNEx5aM);
        }
        result = (Result) objM27268performExtractionYNEx5aM;
        if (result == null) {
        }
        z = composableImageAnalyzer2 instanceof ComposableImageAnalyzer2.TextExtractionData;
        if (z) {
        }
        if (dateOfBirth != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(dateOfBirth);
            sb3.append(expirationDate);
            String string22 = sb3.toString();
            HashMap<String, Integer> map3 = textExtractionAnalyzer.previousReadings;
            Integer num3 = map3.get(string22);
            map3.put(string22, boxing.boxInt((num3 == null ? num3.intValue() : 0) + 1));
        }
        if (dateOfBirth == null) {
        }
        HashMap<String, Integer> map22 = textExtractionAnalyzer.previousReadings;
        StringBuilder sb22 = new StringBuilder();
        sb22.append(dateOfBirth);
        sb22.append(expirationDate);
        Integer num22 = map22.get(sb22.toString());
        if ((num22 == null ? num22.intValue() : -1) >= 3) {
        }
        if (z2) {
        }
        if (!z) {
        }
    }

    private final TextExtractionAnalyzer2 getTextEntityExtractor() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.camera.analyzers.TextEntityExtractor");
            return (TextExtractionAnalyzer2) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
