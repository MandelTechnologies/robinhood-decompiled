package com.userleap;

import androidx.annotation.Keep;
import androidx.test.espresso.idling.CountingIdlingResource;
import kotlin.Metadata;

@Keep
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/userleap/SprigIdlingResource;", "", "()V", "sessionReplayExportIdlingResource", "Landroidx/test/espresso/idling/CountingIdlingResource;", "getSessionReplayExportIdlingResource", "()Landroidx/test/espresso/idling/CountingIdlingResource;", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class SprigIdlingResource {
    public static final SprigIdlingResource INSTANCE = new SprigIdlingResource();
    private static final CountingIdlingResource sessionReplayExportIdlingResource = new CountingIdlingResource("SESSION_REPLAY_EXPORT");

    private SprigIdlingResource() {
    }

    public final CountingIdlingResource getSessionReplayExportIdlingResource() {
        return sessionReplayExportIdlingResource;
    }
}
