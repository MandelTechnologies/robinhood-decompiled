package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: ComposableImageAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "analyze-0E7RQCE", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ComposableImageAnalyzer {
    /* renamed from: analyze-0E7RQCE */
    Object mo27267analyze0E7RQCE(ImageToAnalyze imageToAnalyze, Rect rect, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation);
}
