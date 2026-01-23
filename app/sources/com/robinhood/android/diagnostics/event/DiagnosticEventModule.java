package com.robinhood.android.diagnostics.event;

import com.robinhood.android.diagnostics.annotation.DiagnosticsBytesAdapter;
import com.robinhood.android.diagnostics.annotation.DiagnosticsDirectory;
import com.robinhood.android.diagnostics.event.annotation.DiagnosticEvents;
import com.robinhood.android.diagnostics.event.annotation.DiagnosticEventsDirectory;
import com.robinhood.android.diagnostics.file.LogFileManager;
import com.robinhood.android.diagnostics.file.LogFileManager2;
import com.robinhood.android.diagnostics.file.RotatingFileMessageStreamWriter;
import com.robinhood.android.diagnostics.p100io.ProtoStreamWriting3;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.squareup.wire.ProtoAdapter;
import dagger.Lazy;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import p479j$.time.Clock;

/* compiled from: DiagnosticEventModule.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0013\b\u0001\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010!\u001a\u00020 2\u0013\b\u0001\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000eH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule;", "", "<init>", "()V", "Ljava/io/File;", "diagnosticsDirectory", "provideDiagnosticEventsDirectory", "(Ljava/io/File;)Ljava/io/File;", "directory", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "provideDiagnosticEventsLogFileManager", "(Ljava/io/File;)Lcom/robinhood/android/diagnostics/file/LogFileManager;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "Lkotlin/jvm/JvmWildcard;", "bytesAdapter", "logFileManager", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "provideDiagnosticEventWriter", "(Lj$/time/Clock;Lcom/squareup/wire/ProtoAdapter;Lcom/robinhood/android/diagnostics/file/LogFileManager;)Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Ldagger/Lazy;", "Lcom/robinhood/android/diagnostics/event/RealDiagnosticEventLogger;", "realDiagnosticEventLogger", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLogger;", "provideDiagnosticEventLogger", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/experiments/ExperimentsProvider;Ldagger/Lazy;)Lcom/robinhood/android/diagnostics/event/DiagnosticEventLogger;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLoader;", "provideDiagnosticEventLoader", "(Lcom/squareup/wire/ProtoAdapter;)Lcom/robinhood/android/diagnostics/event/DiagnosticEventLoader;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DiagnosticEventModule {
    public static final DiagnosticEventModule INSTANCE = new DiagnosticEventModule();

    private DiagnosticEventModule() {
    }

    @DiagnosticEventsDirectory
    public final File provideDiagnosticEventsDirectory(@DiagnosticsDirectory File diagnosticsDirectory) {
        Intrinsics.checkNotNullParameter(diagnosticsDirectory, "diagnosticsDirectory");
        return new File(diagnosticsDirectory, "events");
    }

    @DiagnosticEvents
    public final LogFileManager provideDiagnosticEventsLogFileManager(@DiagnosticEventsDirectory File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        return new LogFileManager2(directory, "depbs");
    }

    public final ProtoStreamWriting3 provideDiagnosticEventWriter(Clock clock, @DiagnosticsBytesAdapter ProtoAdapter<ByteString> bytesAdapter, @DiagnosticEvents LogFileManager logFileManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
        return new RotatingFileMessageStreamWriter(clock, bytesAdapter, logFileManager);
    }

    public final DiagnosticEventLogger provideDiagnosticEventLogger(@RootCoroutineScope CoroutineScope coroutineScope, ExperimentsProvider experimentsProvider, Lazy<DiagnosticEventLogger3> realDiagnosticEventLogger) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(realDiagnosticEventLogger, "realDiagnosticEventLogger");
        return new DiagnosticEventLogger2(coroutineScope, experimentsProvider, realDiagnosticEventLogger);
    }

    public final DiagnosticEventLoader provideDiagnosticEventLoader(@DiagnosticsBytesAdapter ProtoAdapter<ByteString> bytesAdapter) {
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        return new DiagnosticEventLoader2(bytesAdapter);
    }
}
