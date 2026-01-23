package androidx.media3.common;

/* loaded from: classes4.dex */
public interface VideoGraph {

    public interface Listener {
    }

    VideoFrameProcessor getProcessor(int i);

    void registerInput(int i) throws VideoFrameProcessingException;

    void release();

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);
}
