package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.performancelogger.PerformanceLogger;
import java.util.UUID;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceIndicatorDispatcher_Factory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher_Factory;", "", "performanceLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher;", "contextualId", "Ljava/util/UUID;", "Companion", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcher_Factory, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C50844PerformanceIndicatorDispatcher_Factory {
    private final Provider<PerformanceLogger> performanceLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C50844PerformanceIndicatorDispatcher_Factory create(Provider<PerformanceLogger> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final PerformanceIndicatorDispatcher newInstance(PerformanceLogger performanceLogger, UUID uuid) {
        return INSTANCE.newInstance(performanceLogger, uuid);
    }

    public C50844PerformanceIndicatorDispatcher_Factory(Provider<PerformanceLogger> performanceLogger) {
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        this.performanceLogger = performanceLogger;
    }

    public final PerformanceIndicatorDispatcher get(UUID contextualId) {
        Intrinsics.checkNotNullParameter(contextualId, "contextualId");
        Companion companion = INSTANCE;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        return companion.newInstance(performanceLogger, contextualId);
    }

    /* compiled from: PerformanceIndicatorDispatcher_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher_Factory;", "performanceLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "newInstance", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher;", "contextualId", "Ljava/util/UUID;", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcher_Factory$Companion, reason: from kotlin metadata */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C50844PerformanceIndicatorDispatcher_Factory create(Provider<PerformanceLogger> performanceLogger) {
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            return new C50844PerformanceIndicatorDispatcher_Factory(performanceLogger);
        }

        @JvmStatic
        public final PerformanceIndicatorDispatcher newInstance(PerformanceLogger performanceLogger, UUID contextualId) {
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(contextualId, "contextualId");
            return new PerformanceIndicatorDispatcher(performanceLogger, contextualId);
        }
    }
}
