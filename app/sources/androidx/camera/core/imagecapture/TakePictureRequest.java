package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class TakePictureRequest {
    private int mRemainingRetires = new CaptureFailedRetryEnabler().getRetryCount();

    interface RetryControl {
        void retryRequest(TakePictureRequest takePictureRequest);
    }

    abstract Executor getAppExecutor();

    abstract int getCaptureMode();

    abstract Rect getCropRect();

    public abstract ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    abstract int getJpegQuality();

    public abstract ImageCapture.OnImageSavedCallback getOnDiskCallback();

    abstract ImageCapture.OutputFileOptions getOutputFileOptions();

    abstract int getRotationDegrees();

    abstract Matrix getSensorToBufferTransform();

    abstract List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    boolean decrementRetryCounter() {
        Threads.checkMainThread();
        int i = this.mRemainingRetires;
        if (i <= 0) {
            return false;
        }
        this.mRemainingRetires = i - 1;
        return true;
    }

    void onError(final ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.$r8$lambda$BfrvkZ9QnfReKD8nk4Q0aLTjfew(this.f$0, imageCaptureException);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$BfrvkZ9QnfReKD8nk4Q0aLTjfew(TakePictureRequest takePictureRequest, ImageCaptureException imageCaptureException) {
        boolean z = takePictureRequest.getInMemoryCallback() != null;
        boolean z2 = takePictureRequest.getOnDiskCallback() != null;
        if (z && !z2) {
            ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
            Objects.requireNonNull(inMemoryCallback);
            inMemoryCallback.onError(imageCaptureException);
        } else {
            if (z2 && !z) {
                ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
                Objects.requireNonNull(onDiskCallback);
                onDiskCallback.onError(imageCaptureException);
                return;
            }
            throw new IllegalStateException("One and only one callback is allowed.");
        }
    }

    public static /* synthetic */ void $r8$lambda$IENFfFdp01u7psWIt9lp0N9E6Uk(TakePictureRequest takePictureRequest, ImageCapture.OutputFileResults outputFileResults) {
        ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
        Objects.requireNonNull(onDiskCallback);
        Objects.requireNonNull(outputFileResults);
        onDiskCallback.onImageSaved(outputFileResults);
    }

    void onResult(final ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.$r8$lambda$IENFfFdp01u7psWIt9lp0N9E6Uk(this.f$0, outputFileResults);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$juGY9NSkdXfCYZbnedv0DwPZLBg(TakePictureRequest takePictureRequest, ImageProxy imageProxy) {
        ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
        Objects.requireNonNull(inMemoryCallback);
        Objects.requireNonNull(imageProxy);
        inMemoryCallback.onCaptureSuccess(imageProxy);
    }

    void onResult(final ImageProxy imageProxy) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.$r8$lambda$juGY9NSkdXfCYZbnedv0DwPZLBg(this.f$0, imageProxy);
            }
        });
    }

    void onCaptureProcessProgressed(final int i) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.$r8$lambda$z9pslctteiThgSo0mMiYcSvwX8Y(this.f$0, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$z9pslctteiThgSo0mMiYcSvwX8Y(TakePictureRequest takePictureRequest, int i) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onCaptureProcessProgressed(i);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onCaptureProcessProgressed(i);
        }
    }

    void onPostviewBitmapAvailable(final Bitmap bitmap) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m4659$r8$lambda$vQno_lbqRKLOu8z8VCPG7ZYW5Y(this.f$0, bitmap);
            }
        });
    }

    /* renamed from: $r8$lambda$vQno_lbqRKLOu8z8VCPG7ZYW5-Y, reason: not valid java name */
    public static /* synthetic */ void m4659$r8$lambda$vQno_lbqRKLOu8z8VCPG7ZYW5Y(TakePictureRequest takePictureRequest, Bitmap bitmap) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onPostviewBitmapAvailable(bitmap);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onPostviewBitmapAvailable(bitmap);
        }
    }

    /* renamed from: of */
    public static TakePictureRequest m63of(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback, ImageCapture.OnImageSavedCallback onImageSavedCallback, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, Matrix matrix, int i, int i2, int i3, List<CameraCaptureCallback> list) {
        Preconditions.checkArgument((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        Preconditions.checkArgument((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        return new AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i, i2, i3, list);
    }
}
