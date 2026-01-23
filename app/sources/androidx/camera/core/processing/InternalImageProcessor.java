package androidx.camera.core.processing;

import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class InternalImageProcessor {
    private final Consumer<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final ImageProcessor mImageProcessor;

    public InternalImageProcessor(CameraEffect cameraEffect) {
        Preconditions.checkArgument(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    public ImageProcessor.Response safeProcess(final ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.InternalImageProcessor$$ExternalSyntheticLambda0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return InternalImageProcessor.$r8$lambda$dnn5neapX62HLhFqfn3q4wACZ_Q(this.f$0, request, completer);
                }
            }).get();
        } catch (Exception e) {
            e = e;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }

    public static /* synthetic */ Object $r8$lambda$dnn5neapX62HLhFqfn3q4wACZ_Q(final InternalImageProcessor internalImageProcessor, final ImageProcessor.Request request, final CallbackToFutureAdapter.Completer completer) {
        internalImageProcessor.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.InternalImageProcessor$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                InternalImageProcessor internalImageProcessor2 = this.f$0;
                completer.set(internalImageProcessor2.mImageProcessor.process(request));
            }
        });
        return "InternalImageProcessor#process " + request.hashCode();
    }
}
