package com.robinhood.utils.logging;

import com.robinhood.Logger;
import com.singular.sdk.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: TimberLogger.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ7\u0010\f\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ7\u0010\u0010\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/logging/TimberLogger;", "Lcom/robinhood/Logger;", "<init>", "()V", "d", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "", "s2", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "w", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TimberLogger implements Logger {
    public static final TimberLogger INSTANCE = new TimberLogger();

    private TimberLogger() {
    }

    @Override // com.robinhood.Logger
    /* renamed from: d */
    public void mo1679d(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Timber.INSTANCE.mo3350d(s, Arrays.copyOf(s2, s2.length));
    }

    @Override // com.robinhood.Logger
    /* renamed from: d */
    public void mo1680d(Throwable e, String s, Object... s2) {
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Timber.INSTANCE.mo3352d(e, s, Arrays.copyOf(s2, s2.length));
    }

    @Override // com.robinhood.Logger
    /* renamed from: i */
    public void mo1683i(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Timber.INSTANCE.mo3356i(s, Arrays.copyOf(s2, s2.length));
    }

    @Override // com.robinhood.Logger
    /* renamed from: e */
    public void mo1681e(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Timber.INSTANCE.mo3353e(s, Arrays.copyOf(s2, s2.length));
    }

    @Override // com.robinhood.Logger
    /* renamed from: e */
    public void mo1682e(Throwable e, String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Timber.INSTANCE.mo3355e(e, s, Arrays.copyOf(s2, s2.length));
    }

    @Override // com.robinhood.Logger
    /* renamed from: w */
    public void mo1684w(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Timber.INSTANCE.mo3362w(s, Arrays.copyOf(s2, s2.length));
    }

    @Override // com.robinhood.Logger
    /* renamed from: w */
    public void mo1685w(Throwable e, String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Timber.INSTANCE.mo3364w(e, s, Arrays.copyOf(s2, s2.length));
    }
}
