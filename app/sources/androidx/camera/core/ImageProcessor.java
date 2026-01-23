package androidx.camera.core;

/* loaded from: classes4.dex */
public interface ImageProcessor {

    public interface Request {
    }

    public interface Response {
        ImageProxy getOutputImage();
    }

    Response process(Request request) throws ProcessingException;
}
