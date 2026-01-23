package microgram.android.inject;

import com.robinhood.android.tracing.RhTrace6;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramAppModule_ProvideMicrogramTrackTraceFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule_ProvideMicrogramTrackTraceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "()V", "provideMicrogramTrackTrace", "()Lcom/robinhood/android/tracing/TrackTrace;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class MicrogramAppModule_ProvideMicrogramTrackTraceFactory implements Factory<RhTrace6> {
    public static final MicrogramAppModule_ProvideMicrogramTrackTraceFactory INSTANCE = new MicrogramAppModule_ProvideMicrogramTrackTraceFactory();

    private MicrogramAppModule_ProvideMicrogramTrackTraceFactory() {
    }

    @Override // javax.inject.Provider
    public RhTrace6 get() {
        return provideMicrogramTrackTrace();
    }

    @JvmStatic
    public static final RhTrace6 provideMicrogramTrackTrace() {
        Object objCheckNotNull = Preconditions.checkNotNull(MicrogramAppModule.INSTANCE.provideMicrogramTrackTrace(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (RhTrace6) objCheckNotNull;
    }
}
