package com.stripe.android.core.networking;

import com.stripe.android.core.exception.InvalidRequestException;
import kotlin.Metadata;

/* compiled from: SendAnalyticsRequestV2Worker.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"", "", "getShouldRetry", "(Ljava/lang/Throwable;)Z", "shouldRetry", "stripe-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.core.networking.SendAnalyticsRequestV2WorkerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SendAnalyticsRequestV2Worker3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getShouldRetry(Throwable th) {
        return !(th instanceof InvalidRequestException);
    }
}
