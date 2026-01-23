package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.processing.Edge;

/* loaded from: classes4.dex */
final class AutoValue_CaptureNode_In extends CaptureNode.AbstractC0832In {
    private final Edge<TakePictureManager.CaptureError> errorEdge;
    private final ImageReaderProxyProvider imageReaderProxyProvider;
    private final int inputFormat;
    private final int outputFormat;
    private final int postviewImageFormat;
    private final Size postviewSize;
    private final Edge<ProcessingRequest> requestEdge;
    private final Size size;
    private final boolean virtualCamera;

    AutoValue_CaptureNode_In(Size size, int i, int i2, boolean z, ImageReaderProxyProvider imageReaderProxyProvider, Size size2, int i3, Edge<ProcessingRequest> edge, Edge<TakePictureManager.CaptureError> edge2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.inputFormat = i;
        this.outputFormat = i2;
        this.virtualCamera = z;
        this.imageReaderProxyProvider = imageReaderProxyProvider;
        this.postviewSize = size2;
        this.postviewImageFormat = i3;
        if (edge == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.requestEdge = edge;
        if (edge2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.errorEdge = edge2;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    boolean isVirtualCamera() {
        return this.virtualCamera;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    ImageReaderProxyProvider getImageReaderProxyProvider() {
        return this.imageReaderProxyProvider;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    Size getPostviewSize() {
        return this.postviewSize;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    int getPostviewImageFormat() {
        return this.postviewImageFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    Edge<ProcessingRequest> getRequestEdge() {
        return this.requestEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0832In
    Edge<TakePictureManager.CaptureError> getErrorEdge() {
        return this.errorEdge;
    }

    public String toString() {
        return "In{size=" + this.size + ", inputFormat=" + this.inputFormat + ", outputFormat=" + this.outputFormat + ", virtualCamera=" + this.virtualCamera + ", imageReaderProxyProvider=" + this.imageReaderProxyProvider + ", postviewSize=" + this.postviewSize + ", postviewImageFormat=" + this.postviewImageFormat + ", requestEdge=" + this.requestEdge + ", errorEdge=" + this.errorEdge + "}";
    }

    public boolean equals(Object obj) {
        ImageReaderProxyProvider imageReaderProxyProvider;
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CaptureNode.AbstractC0832In) {
            CaptureNode.AbstractC0832In abstractC0832In = (CaptureNode.AbstractC0832In) obj;
            if (this.size.equals(abstractC0832In.getSize()) && this.inputFormat == abstractC0832In.getInputFormat() && this.outputFormat == abstractC0832In.getOutputFormat() && this.virtualCamera == abstractC0832In.isVirtualCamera() && ((imageReaderProxyProvider = this.imageReaderProxyProvider) != null ? imageReaderProxyProvider.equals(abstractC0832In.getImageReaderProxyProvider()) : abstractC0832In.getImageReaderProxyProvider() == null) && ((size = this.postviewSize) != null ? size.equals(abstractC0832In.getPostviewSize()) : abstractC0832In.getPostviewSize() == null) && this.postviewImageFormat == abstractC0832In.getPostviewImageFormat() && this.requestEdge.equals(abstractC0832In.getRequestEdge()) && this.errorEdge.equals(abstractC0832In.getErrorEdge())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat) * 1000003) ^ (this.virtualCamera ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.imageReaderProxyProvider;
        int iHashCode2 = (iHashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        Size size = this.postviewSize;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.postviewImageFormat) * 1000003) ^ this.requestEdge.hashCode()) * 1000003) ^ this.errorEdge.hashCode();
    }
}
