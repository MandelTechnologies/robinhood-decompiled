package com.robinhood.android.analytics.provisions;

import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.RealEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventLoggerModule_ProvideEventLoggerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/EventLoggerModule_ProvideEventLoggerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/EventLogger;", "realEventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/RealEventLogger;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EventLoggerModule_ProvideEventLoggerFactory implements Factory<EventLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RealEventLogger> realEventLogger;

    @JvmStatic
    public static final EventLoggerModule_ProvideEventLoggerFactory create(Provider<RealEventLogger> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final EventLogger provideEventLogger(RealEventLogger realEventLogger) {
        return INSTANCE.provideEventLogger(realEventLogger);
    }

    public EventLoggerModule_ProvideEventLoggerFactory(Provider<RealEventLogger> realEventLogger) {
        Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
        this.realEventLogger = realEventLogger;
    }

    @Override // javax.inject.Provider
    public EventLogger get() {
        Companion companion = INSTANCE;
        RealEventLogger realEventLogger = this.realEventLogger.get();
        Intrinsics.checkNotNullExpressionValue(realEventLogger, "get(...)");
        return companion.provideEventLogger(realEventLogger);
    }

    /* compiled from: EventLoggerModule_ProvideEventLoggerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/EventLoggerModule_ProvideEventLoggerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/analytics/provisions/EventLoggerModule_ProvideEventLoggerFactory;", "realEventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/RealEventLogger;", "provideEventLogger", "Lcom/robinhood/analytics/EventLogger;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventLoggerModule_ProvideEventLoggerFactory create(Provider<RealEventLogger> realEventLogger) {
            Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
            return new EventLoggerModule_ProvideEventLoggerFactory(realEventLogger);
        }

        @JvmStatic
        public final EventLogger provideEventLogger(RealEventLogger realEventLogger) {
            Intrinsics.checkNotNullParameter(realEventLogger, "realEventLogger");
            Object objCheckNotNull = Preconditions.checkNotNull(EventLoggerModule.INSTANCE.provideEventLogger(realEventLogger), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (EventLogger) objCheckNotNull;
        }
    }
}
