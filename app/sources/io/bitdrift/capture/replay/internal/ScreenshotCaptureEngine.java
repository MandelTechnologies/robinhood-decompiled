package io.bitdrift.capture.replay.internal;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.singular.sdk.internal.Constants;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.common.Windows4;
import io.bitdrift.capture.replay.IInternalLogger;
import io.bitdrift.capture.replay.IScreenshotLogger;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;

/* compiled from: ScreenshotCaptureEngine.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001eH\u0003J\f\u0010!\u001a\u00020\u0019*\u00020\"H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ScreenshotCaptureEngine;", "", "errorHandler", "Lio/bitdrift/capture/common/ErrorHandler;", "logger", "Lio/bitdrift/capture/replay/IScreenshotLogger;", "mainThreadHandler", "Lio/bitdrift/capture/common/MainThreadHandler;", "windowManager", "Lio/bitdrift/capture/common/IWindowManager;", "executor", "Ljava/util/concurrent/ExecutorService;", "metrics", "Lio/bitdrift/capture/replay/internal/ScreenshotMetricsStopwatch;", "(Lio/bitdrift/capture/common/ErrorHandler;Lio/bitdrift/capture/replay/IScreenshotLogger;Lio/bitdrift/capture/common/MainThreadHandler;Lio/bitdrift/capture/common/IWindowManager;Ljava/util/concurrent/ExecutorService;Lio/bitdrift/capture/replay/internal/ScreenshotMetricsStopwatch;)V", "captureScreenshot", "", "compressScreenshot", "", "resultBitmap", "Landroid/graphics/Bitmap;", "finishOnError", "expected", "", "message", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "modernPixelCopySnapshot", "topView", "Landroid/view/View;", "pixelCopySnapshot", BentoCurrencyPicker.ROOT_TEST_TAG, "toStatusText", "", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ScreenshotCaptureEngine {
    private final ErrorHandler errorHandler;
    private final ExecutorService executor;
    private final IScreenshotLogger logger;
    private final MainThreadHandler mainThreadHandler;
    private final ScreenshotMetricsStopwatch metrics;
    private final IWindowManager windowManager;

    public ScreenshotCaptureEngine(ErrorHandler errorHandler, IScreenshotLogger logger, MainThreadHandler mainThreadHandler, IWindowManager windowManager, ExecutorService executor, ScreenshotMetricsStopwatch metrics) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.errorHandler = errorHandler;
        this.logger = logger;
        this.mainThreadHandler = mainThreadHandler;
        this.windowManager = windowManager;
        this.executor = executor;
        this.metrics = metrics;
    }

    public /* synthetic */ ScreenshotCaptureEngine(ErrorHandler errorHandler, IScreenshotLogger iScreenshotLogger, MainThreadHandler mainThreadHandler, IWindowManager iWindowManager, ExecutorService executorService, ScreenshotMetricsStopwatch screenshotMetricsStopwatch, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorHandler, iScreenshotLogger, mainThreadHandler, iWindowManager, executorService, (i & 32) != 0 ? new ScreenshotMetricsStopwatch(null, 1, null) : screenshotMetricsStopwatch);
    }

    public final void captureScreenshot() {
        try {
            this.metrics.start();
            View firstRootView = this.windowManager.getFirstRootView();
            if (firstRootView != null && firstRootView.getWidth() > 0 && firstRootView.getHeight() > 0 && firstRootView.isShown()) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    modernPixelCopySnapshot(firstRootView);
                    return;
                }
                if (i >= 26) {
                    pixelCopySnapshot(firstRootView);
                    return;
                }
                finishOnError$default(this, true, "Screenshot triggered: Unsupported Android version=" + i + ", skipping capture", null, 4, null);
                return;
            }
            try {
                finishOnError$default(this, true, "Screenshot triggered: Root view is invalid, skipping capture", null, 4, null);
            } catch (Exception e) {
                e = e;
                finishOnError(false, "Screenshot triggered: PixelCopy request failed. Exception=" + e.getMessage(), e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final void modernPixelCopySnapshot(View topView) {
        PixelCopy.Request requestBuild = PixelCopy.Request.Builder.ofWindow(topView).build();
        Intrinsics.checkNotNullExpressionValue(requestBuild, "build(...)");
        PixelCopy.request(requestBuild, this.executor, new Consumer() { // from class: io.bitdrift.capture.replay.internal.ScreenshotCaptureEngine.modernPixelCopySnapshot.1
            @Override // java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                accept(C45502x2d06ed8c.m3334m(obj));
            }

            public final void accept(PixelCopy.Result result) {
                Bitmap bitmap = null;
                try {
                    try {
                        if (result.getStatus() != 0) {
                            ScreenshotCaptureEngine.finishOnError$default(ScreenshotCaptureEngine.this, false, "Screenshot triggered: PixelCopy operation failed. Result.status=" + result.getStatus(), null, 4, null);
                            return;
                        }
                        Bitmap bitmap2 = result.getBitmap();
                        ScreenshotCaptureEngine.this.metrics.screenshot(bitmap2.getAllocationByteCount(), bitmap2.getByteCount());
                        byte[] bArrCompressScreenshot = ScreenshotCaptureEngine.this.compressScreenshot(bitmap2);
                        ScreenshotCaptureEngine.this.metrics.compression(bArrCompressScreenshot.length);
                        ScreenshotCaptureEngine.this.logger.onScreenshotCaptured(bArrCompressScreenshot, ScreenshotCaptureEngine.this.metrics.data());
                        bitmap2.recycle();
                    } catch (Exception e) {
                        ScreenshotCaptureEngine.this.finishOnError(false, "Screenshot triggered: PixelCopy compression failed. Exception=" + e.getMessage(), e);
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                    }
                } finally {
                }
            }
        });
    }

    private final void pixelCopySnapshot(View root) {
        Window phoneWindow = Windows4.getPhoneWindow(root);
        if (phoneWindow == null) {
            finishOnError$default(this, true, "Screenshot triggered: Phone window invalid, skipping capture", null, 4, null);
            return;
        }
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(root.getWidth(), root.getHeight(), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        PixelCopy.request(phoneWindow, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.bitdrift.capture.replay.internal.ScreenshotCaptureEngine.pixelCopySnapshot.1
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    ExecutorService executorService = this.executor;
                    final ScreenshotCaptureEngine screenshotCaptureEngine = this;
                    final Bitmap bitmap = bitmapCreateBitmap;
                    executorService.execute(new Runnable() { // from class: io.bitdrift.capture.replay.internal.ScreenshotCaptureEngine.pixelCopySnapshot.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                try {
                                    screenshotCaptureEngine.metrics.screenshot(bitmap.getAllocationByteCount(), bitmap.getByteCount());
                                    byte[] bArrCompressScreenshot = screenshotCaptureEngine.compressScreenshot(bitmap);
                                    screenshotCaptureEngine.metrics.compression(bArrCompressScreenshot.length);
                                    screenshotCaptureEngine.logger.onScreenshotCaptured(bArrCompressScreenshot, screenshotCaptureEngine.metrics.data());
                                } catch (Exception e) {
                                    screenshotCaptureEngine.finishOnError(false, "Screenshot triggered: Compression operation failed. Exception=" + e.getMessage(), e);
                                }
                            } finally {
                                bitmap.recycle();
                            }
                        }
                    });
                    return;
                }
                bitmapCreateBitmap.recycle();
                ScreenshotCaptureEngine.finishOnError$default(this, false, "Screenshot triggered: PixelCopy operation failed. Result.status=" + this.toStatusText(i), null, 4, null);
            }
        }, this.mainThreadHandler.getMainHandler());
    }

    static /* synthetic */ void finishOnError$default(ScreenshotCaptureEngine screenshotCaptureEngine, boolean z, String str, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        screenshotCaptureEngine.finishOnError(z, str, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishOnError(boolean expected, String message, Throwable e) {
        if (!expected) {
            this.errorHandler.handleError(message, e);
        }
        IInternalLogger.DefaultImpls.logErrorInternal$default(this.logger, message, e, null, 4, null);
        this.logger.onScreenshotCaptured(new byte[0], this.metrics.data());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] compressScreenshot(Bitmap resultBitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            resultBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            resultBitmap.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Closeable.closeFinally(byteArrayOutputStream, null);
            Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
            return byteArray;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStatusText(int i) {
        if (i == 0) {
            return "SUCCESS";
        }
        if (i == 1) {
            return "ERROR_UNKNOWN";
        }
        if (i == 2) {
            return "ERROR_TIMEOUT";
        }
        if (i == 3) {
            return "ERROR_SOURCE_NO_DATA";
        }
        if (i == 4) {
            return "ERROR_SOURCE_INVALID";
        }
        if (i == 5) {
            return "ERROR_DESTINATION_INVALID";
        }
        return "Unknown error: " + i;
    }
}
