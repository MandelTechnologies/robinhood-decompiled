package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_SurfaceProcessorNode_In extends SurfaceProcessorNode.AbstractC0873In {
    private final List<OutConfig> outConfigs;
    private final SurfaceEdge surfaceEdge;

    AutoValue_SurfaceProcessorNode_In(SurfaceEdge surfaceEdge, List<OutConfig> list) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.surfaceEdge = surfaceEdge;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.outConfigs = list;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC0873In
    public SurfaceEdge getSurfaceEdge() {
        return this.surfaceEdge;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC0873In
    public List<OutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    public String toString() {
        return "In{surfaceEdge=" + this.surfaceEdge + ", outConfigs=" + this.outConfigs + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceProcessorNode.AbstractC0873In) {
            SurfaceProcessorNode.AbstractC0873In abstractC0873In = (SurfaceProcessorNode.AbstractC0873In) obj;
            if (this.surfaceEdge.equals(abstractC0873In.getSurfaceEdge()) && this.outConfigs.equals(abstractC0873In.getOutConfigs())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.surfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.outConfigs.hashCode();
    }
}
