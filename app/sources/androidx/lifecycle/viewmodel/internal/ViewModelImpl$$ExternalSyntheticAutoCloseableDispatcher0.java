package androidx.lifecycle.viewmodel.internal;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0 {
    /* renamed from: m */
    public static /* synthetic */ void m529m(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            ViewModelImpl$$ExternalSyntheticAutoCloseableForwarder1.m530m((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
        } else if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else {
            ViewModelImpl$$ExternalSyntheticThrowIAE2.m531m(obj);
        }
    }
}
