package com.robinhood.android.lib.pathfinder;

import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import p479j$.time.Duration;

/* compiled from: PathfinderTimeout.kt */
@Metadata(m3635d1 = {"\u0000\u0004\n\u0002\b\u0006\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"j$/time/Duration", "DEFAULT_PATHFINDER_WEB_LOADING_TIMEOUT", "Lj$/time/Duration;", "getDEFAULT_PATHFINDER_WEB_LOADING_TIMEOUT", "()Lj$/time/Duration;", "lib-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.PathfinderTimeoutKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PathfinderTimeout {
    private static final Duration DEFAULT_PATHFINDER_WEB_LOADING_TIMEOUT = Durations.INSTANCE.getONE_MINUTE();

    public static final Duration getDEFAULT_PATHFINDER_WEB_LOADING_TIMEOUT() {
        return DEFAULT_PATHFINDER_WEB_LOADING_TIMEOUT;
    }
}
