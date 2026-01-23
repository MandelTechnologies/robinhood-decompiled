package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Edge;

/* loaded from: classes4.dex */
final class AutoValue_ProcessingNode_In extends ProcessingNode.AbstractC0835In {
    private final Edge<ProcessingNode.InputPacket> edge;
    private final int inputFormat;
    private final int outputFormat;
    private final Edge<ProcessingNode.InputPacket> postviewEdge;

    AutoValue_ProcessingNode_In(Edge<ProcessingNode.InputPacket> edge, Edge<ProcessingNode.InputPacket> edge2, int i, int i2) {
        if (edge == null) {
            throw new NullPointerException("Null edge");
        }
        this.edge = edge;
        if (edge2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.postviewEdge = edge2;
        this.inputFormat = i;
        this.outputFormat = i2;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0835In
    Edge<ProcessingNode.InputPacket> getEdge() {
        return this.edge;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0835In
    Edge<ProcessingNode.InputPacket> getPostviewEdge() {
        return this.postviewEdge;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0835In
    int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0835In
    int getOutputFormat() {
        return this.outputFormat;
    }

    public String toString() {
        return "In{edge=" + this.edge + ", postviewEdge=" + this.postviewEdge + ", inputFormat=" + this.inputFormat + ", outputFormat=" + this.outputFormat + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProcessingNode.AbstractC0835In) {
            ProcessingNode.AbstractC0835In abstractC0835In = (ProcessingNode.AbstractC0835In) obj;
            if (this.edge.equals(abstractC0835In.getEdge()) && this.postviewEdge.equals(abstractC0835In.getPostviewEdge()) && this.inputFormat == abstractC0835In.getInputFormat() && this.outputFormat == abstractC0835In.getOutputFormat()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.edge.hashCode() ^ 1000003) * 1000003) ^ this.postviewEdge.hashCode()) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat;
    }
}
