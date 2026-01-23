package com.robinhood.android.diagnostics.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.experiments.ExperimentsProvider;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLogger;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "realDiagnosticEventLogger", "Lcom/robinhood/android/diagnostics/event/RealDiagnosticEventLogger;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory implements Factory<DiagnosticEventLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<DiagnosticEventLogger3> realDiagnosticEventLogger;

    @JvmStatic
    public static final DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory create(Provider<CoroutineScope> provider, Provider<ExperimentsProvider> provider2, Provider<DiagnosticEventLogger3> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final DiagnosticEventLogger provideDiagnosticEventLogger(CoroutineScope coroutineScope, ExperimentsProvider experimentsProvider, Lazy<DiagnosticEventLogger3> lazy) {
        return INSTANCE.provideDiagnosticEventLogger(coroutineScope, experimentsProvider, lazy);
    }

    public DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory(Provider<CoroutineScope> coroutineScope, Provider<ExperimentsProvider> experimentsProvider, Provider<DiagnosticEventLogger3> realDiagnosticEventLogger) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(realDiagnosticEventLogger, "realDiagnosticEventLogger");
        this.coroutineScope = coroutineScope;
        this.experimentsProvider = experimentsProvider;
        this.realDiagnosticEventLogger = realDiagnosticEventLogger;
    }

    @Override // javax.inject.Provider
    public DiagnosticEventLogger get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        Lazy<DiagnosticEventLogger3> lazy = DoubleCheck.lazy(this.realDiagnosticEventLogger);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideDiagnosticEventLogger(coroutineScope, experimentsProvider, lazy);
    }

    /* compiled from: DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u0007H\u0007J+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u0010H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "realDiagnosticEventLogger", "Lcom/robinhood/android/diagnostics/event/RealDiagnosticEventLogger;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideDiagnosticEventLogger", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLogger;", "Ldagger/Lazy;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory create(Provider<CoroutineScope> coroutineScope, Provider<ExperimentsProvider> experimentsProvider, Provider<DiagnosticEventLogger3> realDiagnosticEventLogger) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(realDiagnosticEventLogger, "realDiagnosticEventLogger");
            return new DiagnosticEventModule_ProvideDiagnosticEventLoggerFactory(coroutineScope, experimentsProvider, realDiagnosticEventLogger);
        }

        @JvmStatic
        public final DiagnosticEventLogger provideDiagnosticEventLogger(CoroutineScope coroutineScope, ExperimentsProvider experimentsProvider, Lazy<DiagnosticEventLogger3> realDiagnosticEventLogger) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(realDiagnosticEventLogger, "realDiagnosticEventLogger");
            Object objCheckNotNull = Preconditions.checkNotNull(DiagnosticEventModule.INSTANCE.provideDiagnosticEventLogger(coroutineScope, experimentsProvider, realDiagnosticEventLogger), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (DiagnosticEventLogger) objCheckNotNull;
        }
    }
}
