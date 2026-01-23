package com.withpersona.sdk2.camera.camera2;

import android.media.Image;
import kotlin.Metadata;

/* compiled from: Camera2ImageAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;", "", "Landroid/media/Image;", "image", "", "rotationDegrees", "", "analyze", "(Landroid/media/Image;I)V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface Camera2ImageAnalyzer {
    void analyze(Image image, int rotationDegrees);
}
