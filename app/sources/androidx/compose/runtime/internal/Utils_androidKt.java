package androidx.compose.runtime.internal;

import android.util.Log;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: Utils.android.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"", "message", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "runtime_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class Utils_androidKt {
    public static final void logError(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
