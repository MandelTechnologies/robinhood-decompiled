package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class ProcessingNode {
    private Operation<Bitmap2JpegBytes.AbstractC0829In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;
    final Executor mBlockingExecutor;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.AbstractC0833In, Packet<byte[]>> mImage2JpegBytes;
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private AbstractC0835In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.AbstractC0834In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    public void release() {
    }

    ProcessingNode(Executor executor, InternalImageProcessor internalImageProcessor) {
        this(executor, internalImageProcessor, DeviceQuirks.getAll());
    }

    ProcessingNode(Executor executor, InternalImageProcessor internalImageProcessor, Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }

    public Void transform(AbstractC0835In abstractC0835In) {
        this.mInputEdge = abstractC0835In;
        abstractC0835In.getEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ProcessingNode.m4656$r8$lambda$6U13Zlx7P74SDaHwciYmFh6g8(this.f$0, (ProcessingNode.InputPacket) obj);
            }
        });
        abstractC0835In.getPostviewEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ProcessingNode.m4658$r8$lambda$EI5MKd_NwbtkM8O4wtsjxa9o4(this.f$0, (ProcessingNode.InputPacket) obj);
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (abstractC0835In.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new BitmapEffect(internalImageProcessor);
        return null;
    }

    /* renamed from: $r8$lambda$6U13Zlx7P74SDa-Hwc-iYmFh6g8, reason: not valid java name */
    public static /* synthetic */ void m4656$r8$lambda$6U13Zlx7P74SDaHwciYmFh6g8(final ProcessingNode processingNode, final InputPacket inputPacket) {
        processingNode.getClass();
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            processingNode.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.processInputPacket(inputPacket);
                }
            });
        }
    }

    /* renamed from: $r8$lambda$EI5MKd_Nwbt-kM8O4-wtsjxa9o4, reason: not valid java name */
    public static /* synthetic */ void m4658$r8$lambda$EI5MKd_NwbtkM8O4wtsjxa9o4(final ProcessingNode processingNode, final InputPacket inputPacket) {
        processingNode.getClass();
        if (inputPacket.getProcessingRequest().isAborted()) {
            Logger.m50w("ProcessingNode", "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        } else {
            processingNode.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.processPostviewInputPacket(inputPacket);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processInputPacket(InputPacket inputPacket) {
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                final ImageProxy imageProxyProcessInMemoryCapture = processInMemoryCapture(inputPacket);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        processingRequest.onFinalResult(imageProxyProcessInMemoryCapture);
                    }
                });
            } else {
                final ImageCapture.OutputFileResults outputFileResultsProcessOnDiskCapture = processOnDiskCapture(inputPacket);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        processingRequest.onFinalResult(outputFileResultsProcessOnDiskCapture);
                    }
                });
            }
        } catch (ImageCaptureException e) {
            sendError(processingRequest, e);
        } catch (OutOfMemoryError e2) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e2));
        } catch (RuntimeException e3) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processPostviewInputPacket(InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(outputFormat == 35 || outputFormat == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(outputFormat)));
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            final Bitmap bitmapApply = this.mImage2Bitmap.apply(this.mInput2Packet.apply(inputPacket));
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    processingRequest.onPostviewBitmapAvailable(bitmapApply);
                }
            });
        } catch (Exception e) {
            inputPacket.getImageProxy().close();
            Logger.m48e("ProcessingNode", "process postview input packet failed.", e);
        }
    }

    ImageCapture.OutputFileResults processOnDiskCapture(InputPacket inputPacket) throws ImageCaptureException {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(ImageUtil.isJpegFormats(outputFormat), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(outputFormat)));
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0833In.m58of(this.mInput2Packet.apply(inputPacket), processingRequest.getJpegQuality()));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, processingRequest.getJpegQuality());
        }
        Operation<JpegBytes2Disk.AbstractC0834In, ImageCapture.OutputFileResults> operation2 = this.mJpegBytes2Disk;
        ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
        Objects.requireNonNull(outputFileOptions);
        return operation2.apply(JpegBytes2Disk.AbstractC0834In.m59of(packetApply, outputFileOptions));
    }

    ImageProxy processInMemoryCapture(InputPacket inputPacket) throws ImageCaptureException {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        if ((packetApply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && this.mInputEdge.getOutputFormat() == 256) {
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0833In.m58of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        return this.mJpegImage2Result.apply(packetApply);
    }

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i) throws ImageCaptureException {
        Preconditions.checkState(ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation2 = this.mBitmapEffect;
        if (operation2 != null) {
            packetApply = operation2.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.AbstractC0829In.m56of(packetApply, i));
    }

    private static void sendError(final ProcessingRequest processingRequest, final ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                processingRequest.onProcessFailure(imageCaptureException);
            }
        });
    }

    static abstract class InputPacket {
        abstract ImageProxy getImageProxy();

        abstract ProcessingRequest getProcessingRequest();

        InputPacket() {
        }

        /* renamed from: of */
        static InputPacket m61of(ProcessingRequest processingRequest, ImageProxy imageProxy) {
            return new AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }
    }

    /* renamed from: androidx.camera.core.imagecapture.ProcessingNode$In */
    static abstract class AbstractC0835In {
        abstract Edge<InputPacket> getEdge();

        abstract int getInputFormat();

        abstract int getOutputFormat();

        abstract Edge<InputPacket> getPostviewEdge();

        AbstractC0835In() {
        }

        /* renamed from: of */
        static AbstractC0835In m60of(int i, int i2) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i, i2);
        }
    }
}
