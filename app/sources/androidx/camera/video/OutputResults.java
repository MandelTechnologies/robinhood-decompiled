package androidx.camera.video;

import android.net.Uri;
import androidx.core.util.Preconditions;

/* loaded from: classes4.dex */
public abstract class OutputResults {
    public abstract Uri getOutputUri();

    /* renamed from: of */
    static OutputResults m80of(Uri uri) {
        Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new AutoValue_OutputResults(uri);
    }
}
