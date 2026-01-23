package com.robinhood.android.diagnostics.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.diagnostics.file.LogFileManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiagnosticEventModule_ProvideDiagnosticEventsLogFileManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventsLogFileManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "directory", "Ljavax/inject/Provider;", "Ljava/io/File;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.event.DiagnosticEventModule_ProvideDiagnosticEventsLogFileManagerFactory */
/* loaded from: classes17.dex */
public final class C14032x1bbe2abc implements Factory<LogFileManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<File> directory;

    @JvmStatic
    public static final C14032x1bbe2abc create(Provider<File> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final LogFileManager provideDiagnosticEventsLogFileManager(File file) {
        return INSTANCE.provideDiagnosticEventsLogFileManager(file);
    }

    public C14032x1bbe2abc(Provider<File> directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.directory = directory;
    }

    @Override // javax.inject.Provider
    public LogFileManager get() {
        Companion companion = INSTANCE;
        File file = this.directory.get();
        Intrinsics.checkNotNullExpressionValue(file, "get(...)");
        return companion.provideDiagnosticEventsLogFileManager(file);
    }

    /* compiled from: DiagnosticEventModule_ProvideDiagnosticEventsLogFileManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventsLogFileManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventsLogFileManagerFactory;", "directory", "Ljavax/inject/Provider;", "Ljava/io/File;", "provideDiagnosticEventsLogFileManager", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.diagnostics.event.DiagnosticEventModule_ProvideDiagnosticEventsLogFileManagerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C14032x1bbe2abc create(Provider<File> directory) {
            Intrinsics.checkNotNullParameter(directory, "directory");
            return new C14032x1bbe2abc(directory);
        }

        @JvmStatic
        public final LogFileManager provideDiagnosticEventsLogFileManager(File directory) {
            Intrinsics.checkNotNullParameter(directory, "directory");
            Object objCheckNotNull = Preconditions.checkNotNull(DiagnosticEventModule.INSTANCE.provideDiagnosticEventsLogFileManager(directory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LogFileManager) objCheckNotNull;
        }
    }
}
