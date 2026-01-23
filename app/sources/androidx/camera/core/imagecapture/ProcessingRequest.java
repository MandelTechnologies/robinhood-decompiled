package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
class ProcessingRequest {
    private final TakePictureCallback mCallback;
    final ListenableFuture<Void> mCaptureFuture;
    private final Rect mCropRect;
    private final int mJpegQuality;
    private final ImageCapture.OutputFileOptions mOutputFileOptions;
    private final int mRequestId;
    private final int mRotationDegrees;
    private final Matrix mSensorToBufferTransform;
    private final String mTagBundleKey;
    private int mLastCaptureProcessProgressed = -1;
    private final List<Integer> mStageIds = new ArrayList();

    ProcessingRequest(CaptureBundle captureBundle, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, int i, int i2, Matrix matrix, TakePictureCallback takePictureCallback, ListenableFuture<Void> listenableFuture, int i3) {
        this.mRequestId = i3;
        this.mOutputFileOptions = outputFileOptions;
        this.mJpegQuality = i2;
        this.mRotationDegrees = i;
        this.mCropRect = rect;
        this.mSensorToBufferTransform = matrix;
        this.mCallback = takePictureCallback;
        this.mTagBundleKey = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        Iterator<CaptureStage> it = captureStages.iterator();
        while (it.hasNext()) {
            this.mStageIds.add(Integer.valueOf(it.next().getId()));
        }
        this.mCaptureFuture = listenableFuture;
    }

    String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    List<Integer> getStageIds() {
        return this.mStageIds;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.mOutputFileOptions;
    }

    Rect getCropRect() {
        return this.mCropRect;
    }

    int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    int getJpegQuality() {
        return this.mJpegQuality;
    }

    Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    boolean isInMemoryCapture() {
        return getOutputFileOptions() == null;
    }

    void onCaptureStarted() {
        this.mCallback.onCaptureStarted();
    }

    void onCaptureProcessProgressed(int i) {
        if (this.mLastCaptureProcessProgressed != i) {
            this.mLastCaptureProcessProgressed = i;
            this.mCallback.onCaptureProcessProgressed(i);
        }
    }

    void onImageCaptured() {
        if (this.mLastCaptureProcessProgressed != -1) {
            onCaptureProcessProgressed(100);
        }
        this.mCallback.onImageCaptured();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFinalResult(ImageCapture.OutputFileResults outputFileResults) {
        this.mCallback.onFinalResult(outputFileResults);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        this.mCallback.onPostviewBitmapAvailable(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFinalResult(ImageProxy imageProxy) {
        this.mCallback.onFinalResult(imageProxy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onProcessFailure(ImageCaptureException imageCaptureException) {
        this.mCallback.onProcessFailure(imageCaptureException);
    }

    void onCaptureFailure(ImageCaptureException imageCaptureException) {
        this.mCallback.onCaptureFailure(imageCaptureException);
    }

    boolean isAborted() {
        return this.mCallback.isAborted();
    }

    ListenableFuture<Void> getCaptureFuture() {
        return this.mCaptureFuture;
    }
}
