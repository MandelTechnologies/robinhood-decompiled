package androidx.media3.common;

import android.view.Surface;
import java.util.List;

/* loaded from: classes4.dex */
public interface VideoFrameProcessor {

    public interface Factory {
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean registerInputFrame();

    void registerInputStream(int i, List<Effect> list, FrameInfo frameInfo);
}
