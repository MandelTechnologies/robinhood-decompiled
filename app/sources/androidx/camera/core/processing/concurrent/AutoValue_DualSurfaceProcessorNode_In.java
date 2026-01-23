package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_DualSurfaceProcessorNode_In extends DualSurfaceProcessorNode.AbstractC0875In {
    private final List<DualOutConfig> outConfigs;
    private final SurfaceEdge primarySurfaceEdge;
    private final SurfaceEdge secondarySurfaceEdge;

    AutoValue_DualSurfaceProcessorNode_In(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, List<DualOutConfig> list) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.primarySurfaceEdge = surfaceEdge;
        if (surfaceEdge2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.secondarySurfaceEdge = surfaceEdge2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.outConfigs = list;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.AbstractC0875In
    public SurfaceEdge getPrimarySurfaceEdge() {
        return this.primarySurfaceEdge;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.AbstractC0875In
    public SurfaceEdge getSecondarySurfaceEdge() {
        return this.secondarySurfaceEdge;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.AbstractC0875In
    public List<DualOutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.primarySurfaceEdge + ", secondarySurfaceEdge=" + this.secondarySurfaceEdge + ", outConfigs=" + this.outConfigs + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DualSurfaceProcessorNode.AbstractC0875In) {
            DualSurfaceProcessorNode.AbstractC0875In abstractC0875In = (DualSurfaceProcessorNode.AbstractC0875In) obj;
            if (this.primarySurfaceEdge.equals(abstractC0875In.getPrimarySurfaceEdge()) && this.secondarySurfaceEdge.equals(abstractC0875In.getSecondarySurfaceEdge()) && this.outConfigs.equals(abstractC0875In.getOutConfigs())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.primarySurfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.secondarySurfaceEdge.hashCode()) * 1000003) ^ this.outConfigs.hashCode();
    }
}
