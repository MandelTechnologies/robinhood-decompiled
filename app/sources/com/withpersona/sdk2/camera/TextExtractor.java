package com.withpersona.sdk2.camera;

import android.graphics.BitmapFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextExtractor.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/TextExtractor;", "", "<init>", "()V", "textDetector", "Lcom/google/mlkit/vision/text/TextRecognizer;", "getTextDetector", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector$delegate", "Lkotlin/Lazy;", "extractText", "", "imagePath", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class TextExtractor {

    /* renamed from: textDetector$delegate, reason: from kotlin metadata */
    private final Lazy textDetector = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.TextExtractor$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TextExtractor.textDetector_delegate$lambda$0();
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

    public final String extractText(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        try {
            InputImage inputImageFromBitmap = InputImage.fromBitmap(BitmapFactory.decodeFile(imagePath), 0);
            Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
            Task<Text> taskProcess = getTextDetector().process(inputImageFromBitmap);
            Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
            try {
                Tasks.await(taskProcess);
            } catch (ExecutionException unused) {
            }
            return taskProcess.getResult().getText();
        } catch (Exception unused2) {
            return null;
        }
    }
}
