package com.robinhood.android.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: Loggable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"TAG", "", "debugLog", "", "message", "feature-product-upsell_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.notification.LoggableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Loggable {
    public static final String TAG = "ProductUpsell";

    public static final void debugLog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.tag("ProductUpsell").mo3350d(message, new Object[0]);
    }
}
