package com.withpersona.sdk2.camera.feed;

import android.graphics.Rect;
import android.view.View;
import com.withpersona.sdk2.camera.CameraController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraFeed.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"updateViewfinderRect", "", "Lcom/withpersona/sdk2/camera/feed/CameraFeed;", "cameraController", "Lcom/withpersona/sdk2/camera/CameraController;", "pointOfInterestView", "Landroid/view/View;", "camera_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.feed.CameraFeedKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CameraFeed2 {
    public static final void updateViewfinderRect(CameraFeed cameraFeed, CameraController cameraController, View pointOfInterestView) {
        Intrinsics.checkNotNullParameter(cameraFeed, "<this>");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(pointOfInterestView, "pointOfInterestView");
        int[] iArr = new int[2];
        pointOfInterestView.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], pointOfInterestView.getWidth() + i, iArr[1] + pointOfInterestView.getHeight());
        View previewView = cameraController.getPreviewView();
        previewView.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        cameraFeed.setViewfinderRect(rect, new Rect(i2, iArr[1], previewView.getWidth() + i2, iArr[1] + previewView.getHeight()));
    }
}
