package com.robinhood.android.diagnostics.work;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.diagnostics.event.annotation.DiagnosticEvents;
import com.robinhood.android.diagnostics.file.LogFileManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogFileCleanerWorker_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker;", "logFileManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "<init>", "(Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LogFileCleanerWorker_MembersInjector implements MembersInjector<LogFileCleanerWorker> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LogFileManager> logFileManager;

    @JvmStatic
    public static final MembersInjector<LogFileCleanerWorker> create(Provider<LogFileManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    @DiagnosticEvents
    public static final void injectLogFileManager(LogFileCleanerWorker logFileCleanerWorker, LogFileManager logFileManager) {
        INSTANCE.injectLogFileManager(logFileCleanerWorker, logFileManager);
    }

    public LogFileCleanerWorker_MembersInjector(Provider<LogFileManager> logFileManager) {
        Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
        this.logFileManager = logFileManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LogFileCleanerWorker instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        LogFileManager logFileManager = this.logFileManager.get();
        Intrinsics.checkNotNullExpressionValue(logFileManager, "get(...)");
        companion.injectLogFileManager(instance, logFileManager);
    }

    /* compiled from: LogFileCleanerWorker_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker;", "logFileManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "injectLogFileManager", "", "instance", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<LogFileCleanerWorker> create(Provider<LogFileManager> logFileManager) {
            Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
            return new LogFileCleanerWorker_MembersInjector(logFileManager);
        }

        @JvmStatic
        @DiagnosticEvents
        public final void injectLogFileManager(LogFileCleanerWorker instance, LogFileManager logFileManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
            instance.setLogFileManager(logFileManager);
        }
    }
}
